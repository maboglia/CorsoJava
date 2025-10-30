# Analisi e Commenti sul Sistema di Sicurezza JWT nel Progetto Pokémon Review API

Questo documento spiega, passo per passo, come funziona l'integrazione **JWT (JSON Web Token)** nel progetto `api` e commenta le classi principali coinvolte nella sicurezza.

---

## 🧱 Architettura generale della sicurezza

L’applicazione adotta **Spring Security + JWT** per gestire autenticazione e autorizzazione.

**Flusso tipico di autenticazione JWT:**

1. L’utente invia username e password a `/api/auth/login`.
2. L’app verifica le credenziali tramite `CustomUserDetailsService`.
3. Se valide, viene generato un token JWT da `JWTGenerator`.
4. Il token è restituito al client nel corpo della risposta.
5. Il client include il token nell’header `Authorization: Bearer <token>` per ogni richiesta successiva.
6. Il filtro `JWTAuthenticationFilter` intercetta ogni richiesta, valida il token e autentica l’utente nel contesto di sicurezza.

---

## 🔐 1. SecurityConfig.java

Questa classe definisce la configurazione di Spring Security.

### Ruolo
Configura il comportamento della catena di sicurezza (`SecurityFilterChain`), il filtro JWT, il gestore delle eccezioni (`JwtAuthEntryPoint`), e specifica quali endpoint sono pubblici o protetti.

### Punti chiave
```java
@EnableWebSecurity
public class SecurityConfig {
    private JwtAuthEntryPoint authEntryPoint;
    private CustomUserDetailsService userDetailsService;
    private JWTAuthenticationFilter jwtAuthenticationFilter;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .exceptionHandling()
                .authenticationEntryPoint(authEntryPoint)
            .and()
            .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .authorizeHttpRequests()
                .requestMatchers(HttpMethod.GET, "/api/**").permitAll()
                .requestMatchers("/api/auth/**").permitAll()
                .anyRequest().authenticated();

        http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
}
```

### Commenti
- `csrf().disable()` → disattiva CSRF, tipico per API REST stateless.
- `authenticationEntryPoint(authEntryPoint)` → delega la gestione degli errori di autenticazione.
- `sessionCreationPolicy(SessionCreationPolicy.STATELESS)` → nessuna sessione server-side, tutto si basa sul token.
- `authorizeHttpRequests()` → definisce endpoint pubblici e privati.
- `addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)` → inserisce il filtro JWT nella catena prima dell’autenticazione classica.

---

## 🧩 2. JWTAuthenticationFilter.java

### Ruolo
Filtro che intercetta ogni richiesta HTTP, estrae il token JWT dall’header, lo valida e imposta l’autenticazione nel contesto di Spring Security.

### Punti chiave
```java
public class JWTAuthenticationFilter extends OncePerRequestFilter {
    @Autowired
    private JWTGenerator tokenGenerator;
    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String token = getJWTFromRequest(request);
        if (StringUtils.hasText(token) && tokenGenerator.validateToken(token)) {
            String username = tokenGenerator.getUsernameFromJWT(token);
            UserDetails userDetails = customUserDetailsService.loadUserByUsername(username);
            UsernamePasswordAuthenticationToken authentication = 
                new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
        filterChain.doFilter(request, response);
    }
}
```

### Commenti
- `OncePerRequestFilter` → assicura che il filtro venga eseguito una sola volta per richiesta.
- `getJWTFromRequest` → estrae il token dall’header `Authorization`.
- `validateToken` → controlla firma e scadenza del token.
- Se valido, crea un oggetto `Authentication` e lo imposta nel contesto di sicurezza.
- Così Spring riconosce l’utente come autenticato per il resto della richiesta.

---

## 🧮 3. JWTGenerator.java

### Ruolo
Gestisce la **creazione** e la **validazione** dei token JWT.

### Punti chiave
```java
@Component
public class JWTGenerator {
    public String generateToken(Authentication authentication) {
        String username = authentication.getName();
        Date currentDate = new Date();
        Date expireDate = new Date(currentDate.getTime() + SecurityConstants.JWT_EXPIRATION);

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(currentDate)
                .setExpiration(expireDate)
                .signWith(SignatureAlgorithm.HS512, SecurityConstants.JWT_SECRET)
                .compact();
    }

    public String getUsernameFromJWT(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(SecurityConstants.JWT_SECRET)
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(SecurityConstants.JWT_SECRET).parseClaimsJws(token);
            return true;
        } catch (JwtException ex) {
            return false;
        }
    }
}
```

### Commenti
- `generateToken` → genera un token con subject (username), data di emissione e scadenza.
- `signWith` → firma il token con una chiave segreta.
- `getUsernameFromJWT` → estrae lo username dal token.
- `validateToken` → controlla la validità e la firma del token.

---

## 👤 4. CustomUserDetailsService.java

### Ruolo
Carica i dettagli utente dal database in base allo username, per permettere a Spring Security di autenticare.

### Punti chiave
```java
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }
}
```

### Commenti
- Implementa `UserDetailsService`, interfaccia chiave per l’autenticazione in Spring.
- Carica l’utente da DB tramite `UserRepository`.
- Converte i ruoli (`Role`) in `GrantedAuthority` per Spring.

---

## ⚠️ 5. JwtAuthEntryPoint.java

### Ruolo
Gestisce le eccezioni di accesso non autorizzato.

### Punti chiave
```java
@Component
public class JwtAuthEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
    }
}
```

### Commenti
- Intercetta accessi non autorizzati.
- Restituisce `401 Unauthorized` come risposta HTTP.
- Utile per API REST dove non si usa redirect verso una pagina di login.

---

## 🔑 6. SecurityConstants.java

### Ruolo
Memorizza valori statici legati alla sicurezza.

```java
public class SecurityConstants {
    public static final long JWT_EXPIRATION = 70000;
    public static final String JWT_SECRET = "secret";
}
```

### Commenti
- `JWT_SECRET` → chiave usata per firmare il token (in produzione va tenuta segreta e non hardcoded).
- `JWT_EXPIRATION` → durata in millisecondi del token.

---

## 🚪 7. AuthController.java

### Ruolo
Gestisce il login e la registrazione, punto d’ingresso dell’autenticazione.

### Punti chiave
```java
@PostMapping("/login")
public ResponseEntity<AuthResponseDTO> login(@RequestBody LoginDto loginDto) {
    Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword()));
    SecurityContextHolder.getContext().setAuthentication(authentication);
    String token = jwtGenerator.generateToken(authentication);
    return new ResponseEntity<>(new AuthResponseDTO(token), HttpStatus.OK);
}
```

### Commenti
- Autentica l’utente con `AuthenticationManager`.
- Se le credenziali sono corrette, genera un token JWT.
- Restituisce il token al client.
- Questo token sarà usato nelle richieste successive.

---

## 🧱 8. UserEntity.java e Role.java

### Ruolo
Rappresentano utenti e ruoli nel database.

```java
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;
}
```

### Commenti
- `@ManyToMany(fetch = FetchType.EAGER)` → carica subito i ruoli associati.
- Ogni `Role` rappresenta un permesso o gruppo di privilegi.
- I ruoli vengono usati da Spring per autorizzare endpoint (es. `hasRole('ADMIN')`).

---

## ✅ Conclusione

Questo sistema fornisce una **security RESTful basata su JWT**, adatta per:
- Applicazioni SPA (React, Angular, Vue);
- API senza sessioni server-side;
- Scalabilità (il token è stateless);
- Facilità d’estensione (refresh token, ruoli granulari, audit log, ecc.).

---

## 🔧 Estensioni possibili per esercitazione

1. Aggiungere `refresh token` e endpoint dedicato.
2. Inserire scadenze personalizzate per ruoli diversi.
3. Centralizzare `JWT_SECRET` in un file `.env` o `application.properties`.
4. Implementare `@PreAuthorize("hasRole('ADMIN')")` su endpoint di amministrazione.
5. Loggare ogni tentativo di accesso fallito o token scaduto.


