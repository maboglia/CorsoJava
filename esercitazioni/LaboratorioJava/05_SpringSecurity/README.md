# Come integrare **JWT (JSON Web Token)** in un progetto **Java Spring Boot**

L’obiettivo è mostrare i concetti chiave della sicurezza basata su token: autenticazione, generazione del token e validazione nelle richieste successive.

---

## 🧭 Obiettivo della lezione

Integrare **JWT** in un progetto **Spring Boot REST**, senza database (per semplicità), ma con una struttura facilmente estendibile.

---

## 🔧 Prerequisiti

* Java 17+
* Maven
* Spring Boot (versione 3.x)
* Dipendenze:

  * `spring-boot-starter-web`
  * `spring-boot-starter-security`
  * `jjwt` (Java JWT library di io.jsonwebtoken)

---

## ⚙️ 1. Aggiungere le dipendenze nel `pom.xml`

```xml
<dependencies>
    <!-- Web e Security -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>

    <!-- JWT -->
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-api</artifactId>
        <version>0.11.5</version>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-impl</artifactId>
        <version>0.11.5</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-jackson</artifactId>
        <version>0.11.5</version>
        <scope>runtime</scope>
    </dependency>
</dependencies>
```

---

## 🔑 2. Creare una classe di utilità `JwtUtil`

```java
package com.example.securitydemo.util;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import java.util.Date;
import java.security.Key;

public class JwtUtil {

    private static final String SECRET_KEY = "mia_chiave_segreta_super_sicura_1234567890";
    private static final long EXPIRATION_TIME = 1000 * 60 * 60; // 1 ora

    private static final Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

    public static String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuer("CorsoSecurity")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    public static String validateToken(String token) {
        try {
            return Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token)
                    .getBody()
                    .getSubject();
        } catch (JwtException e) {
            return null;
        }
    }
}
```

---

## 🧍‍♂️ 3. Creare un semplice `UserController`

```java
package com.example.securitydemo.controller;

import com.example.securitydemo.util.JwtUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> user) {
        String username = user.get("username");
        String password = user.get("password");

        // Finto controllo (in produzione usare DB e password criptate)
        if ("admin".equals(username) && "password".equals(password)) {
            String token = JwtUtil.generateToken(username);
            return Map.of("token", token);
        } else {
            return Map.of("error", "Credenziali non valide");
        }
    }

    @GetMapping("/secure")
    public Map<String, String> secureEndpoint(@RequestHeader("Authorization") String authHeader) {
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            String token = authHeader.substring(7);
            String username = JwtUtil.validateToken(token);
            if (username != null) {
                return Map.of("message", "Accesso autorizzato", "user", username);
            }
        }
        return Map.of("error", "Token non valido o mancante");
    }
}
```

---

## 🔐 4. Disattivare la sicurezza predefinita di Spring per i test

Per ora vogliamo gestire la sicurezza manualmente.

```java
package com.example.securitydemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@org.springframework.context.annotation.Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll());
        return http.build();
    }
}
```

---

## 🚀 5. Test dell’applicazione

1. Avvia l’applicazione.

2. Esegui una richiesta POST su `http://localhost:8080/api/login`
   con body JSON:

   ```json
   { "username": "admin", "password": "password" }
   ```

   👉 Risposta:

   ```json
   { "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6..." }
   ```

3. Ora prova:

   ```
   GET http://localhost:8080/api/secure
   Header: Authorization: Bearer <token>
   ```

   👉 Risposta:

   ```json
   { "message": "Accesso autorizzato", "user": "admin" }
   ```

---

## 🧩 Estensioni per la lezione

* Integrare un **filter JWT** che autentichi automaticamente le richieste.
* Usare un **UserDetailsService** e un **database** per utenti reali.
* Aggiungere **ruoli e permessi**.
* Dimostrare la **scadenza del token** e il rinnovo.

---

## 🧠 Punti chiave da spiegare in aula

| Concetto           | Descrizione                                                                |
| ------------------ | -------------------------------------------------------------------------- |
| **JWT**            | JSON Web Token, token firmato contenente le informazioni di autenticazione |
| **Header**         | Specifica algoritmo di firma e tipo di token                               |
| **Payload**        | Contiene i dati (es. username, ruolo)                                      |
| **Signature**      | Firma che garantisce l’integrità                                           |
| **Bearer Token**   | Modalità di invio del token via header HTTP                                |
| **Scadenza (exp)** | Impedisce uso del token dopo un certo tempo                                |

---

Perfetto 👍
Facciamo quindi la **seconda parte del tutorial**:
useremo un **progetto Spring Boot completo con JWT Filter**, ma con la possibilità di **generare manualmente il token** (es. tramite un sito come [jwt.io](https://jwt.io)) e **inviarlo all’app tramite header HTTP**.

---

# 🔐 SECONDA PARTE — Integrazione completa JWT in un progetto Spring Boot

Obiettivo:

* Configurare **Spring Security** per riconoscere un token JWT.
* Creare un **JwtAuthenticationFilter** che validi il token su ogni richiesta.
* Consentire di **usare token creati manualmente** (da un tool online come jwt.io).

---

## 🧱 Struttura del progetto

```
src/main/java/com/example/jwtdemo
│
├── config/
│   └── SecurityConfig.java
│
├── filter/
│   └── JwtAuthenticationFilter.java
│
├── util/
│   └── JwtUtil.java
│
└── controller/
    └── TestController.java
```

---

## ⚙️ 1. Dipendenze `pom.xml`

Le stesse della prima parte:

```xml
<dependencies>
    <!-- Web e Security -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>

    <!-- JWT -->
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-api</artifactId>
        <version>0.11.5</version>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-impl</artifactId>
        <version>0.11.5</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-jackson</artifactId>
        <version>0.11.5</version>
        <scope>runtime</scope>
    </dependency>
</dependencies>
```

---

## 🔑 2. Utility JWT (`JwtUtil.java`)

> ⚠️ Usa **la stessa chiave segreta** che utilizzerai su [jwt.io](https://jwt.io) per generare i token.

```java
package com.example.jwtdemo.util;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import java.security.Key;

public class JwtUtil {

    // chiave segreta (deve essere la stessa usata su jwt.io)
    private static final String SECRET_KEY = "mia_chiave_super_segreta_1234567890!";

    private static final Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

    public static String validateToken(String token) {
        try {
            Jws<Claims> claims = Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token);
            return claims.getBody().getSubject();
        } catch (JwtException e) {
            return null;
        }
    }
}
```

---

## 🧱 3. Filtro JWT (`JwtAuthenticationFilter.java`)

```java
package com.example.jwtdemo.filter;

import com.example.jwtdemo.util.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Collections;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain)
            throws ServletException, IOException {

        String header = request.getHeader("Authorization");

        if (header != null && header.startsWith("Bearer ")) {
            String token = header.substring(7);
            String username = JwtUtil.validateToken(token);

            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                UsernamePasswordAuthenticationToken auth =
                        new UsernamePasswordAuthenticationToken(username, null, Collections.emptyList());
                auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(auth);
            }
        }

        chain.doFilter(request, response);
    }
}
```

---

## 🔧 4. Configurazione Security (`SecurityConfig.java`)

```java
package com.example.jwtdemo.config;

import com.example.jwtdemo.filter.JwtAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/public/**").permitAll()  // endpoint pubblici
                .anyRequest().authenticated()               // tutti gli altri protetti
            )
            .addFilterBefore(new JwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
```

---

## 🌐 5. Controller di test (`TestController.java`)

```java
package com.example.jwtdemo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("/public/hello")
    public Map<String, String> publicHello() {
        return Map.of("message", "Ciao! Questo endpoint è pubblico.");
    }

    @GetMapping("/secure/hello")
    public Map<String, String> secureHello(@RequestHeader("Authorization") String authHeader) {
        return Map.of("message", "Accesso riuscito all’endpoint protetto!");
    }
}
```

---

## 🧪 6. Come generare un JWT su [jwt.io](https://jwt.io)

1. Vai su 👉 [https://jwt.io](https://jwt.io)
2. Nella sezione **Payload**, scrivi ad esempio:

   ```json
   {
     "sub": "mario",
     "iss": "jwt.io",
     "exp": 1735675200
   }
   ```

   > `exp` è la scadenza (in Unix time).
3. Nella sezione **Verify Signature**, scrivi la **stessa SECRET KEY** usata nel codice:

   ```
   mia_chiave_super_segreta_1234567890!
   ```

4. Copia il token generato.

---

## 🚀 7. Come inviare il token all’app Spring Boot

Con **cURL**, **Postman** o **HTTPie**:

### 🔓 Endpoint pubblico

```bash
curl http://localhost:8080/public/hello
```

👉 Risposta:

```json
{"message":"Ciao! Questo endpoint è pubblico."}
```

---

### 🔒 Endpoint protetto (richiede JWT)

```bash
curl -H "Authorization: Bearer <il_tuo_token>" http://localhost:8080/secure/hello
```

👉 Se il token è valido:

```json
{"message":"Accesso riuscito all’endpoint protetto!"}
```

👉 Se il token è mancante o errato:

```json
{"error":"Forbidden"}
```

---

## 🧠 Cosa hai imparato

| Concetto                 | Descrizione                                          |
| ------------------------ | ---------------------------------------------------- |
| **JWT Filter**           | intercetta ogni richiesta HTTP e valida il token     |
| **Spring Security**      | può usare filtri personalizzati per l’autenticazione |
| **Authorization Header** | contiene il token in formato `Bearer <token>`        |
| **jwt.io**               | ottimo tool per creare e decodificare token firmati  |

---

## 💡 Estensioni possibili per esercitazione in aula

* Validare anche **ruoli (roles)** dal payload.
* Mostrare cosa succede quando il token è **scaduto o manomesso**.
* Integrare **UserDetailsService** con utenti da DB.
* Creare un endpoint `/login` che generi automaticamente i token.

---

Perfetto 💪
Arriviamo quindi al **livello 3** della lezione:
👉 **gestione dei ruoli (ROLE_USER / ROLE_ADMIN)** con JWT e Spring Security.

Questo step completa la logica di autenticazione/autorizzazione basata su token, come nei progetti enterprise.

---

# 🧩 LIVELLO 3 — JWT + Spring Security + RUOLI

Obiettivo:

* Inserire i ruoli dentro il **JWT** (es. `"roles": ["ROLE_USER", "ROLE_ADMIN"]`).
* Estrarli nel filtro.
* Consentire o negare l’accesso a seconda del ruolo.

---

## ⚙️ 1. Aggiornamento `JwtUtil.java`

Ora includiamo i **ruoli nel token** e li estraiamo nel `validateToken`.

> 🔸 In questa lezione, il token può sempre essere generato anche da [jwt.io](https://jwt.io).

```java
package com.example.jwtdemo.util;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.List;
import java.util.Map;

public class JwtUtil {

    private static final String SECRET_KEY = "mia_chiave_super_segreta_1234567890!";
    private static final Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

    public static Jws<Claims> parseToken(String token) {
        try {
            return Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token);
        } catch (JwtException e) {
            return null;
        }
    }

    public static String getUsername(Jws<Claims> claims) {
        return claims.getBody().getSubject();
    }

    @SuppressWarnings("unchecked")
    public static List<String> getRoles(Jws<Claims> claims) {
        Object roles = claims.getBody().get("roles");
        if (roles instanceof List<?>) {
            return (List<String>) roles;
        }
        return List.of();
    }

    // Metodo opzionale per generare token da codice (utile per demo)
    public static String generateToken(String username, List<String> roles) {
        return Jwts.builder()
                .setSubject(username)
                .addClaims(Map.of("roles", roles))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}
```

---

## 🔒 2. Filtro JWT con ruoli (`JwtAuthenticationFilter.java`)

```java
package com.example.jwtdemo.filter;

import com.example.jwtdemo.util.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain)
            throws ServletException, IOException {

        String header = request.getHeader("Authorization");

        if (header != null && header.startsWith("Bearer ")) {
            String token = header.substring(7);
            Jws<Claims> claims = JwtUtil.parseToken(token);

            if (claims != null) {
                String username = JwtUtil.getUsername(claims);
                List<String> roles = JwtUtil.getRoles(claims);

                var authorities = roles.stream()
                        .map(SimpleGrantedAuthority::new)
                        .collect(Collectors.toList());

                var auth = new UsernamePasswordAuthenticationToken(username, null, authorities);
                SecurityContextHolder.getContext().setAuthentication(auth);
            }
        }

        chain.doFilter(request, response);
    }
}
```

---

## ⚙️ 3. Configurazione Security aggiornata (`SecurityConfig.java`)

```java
package com.example.jwtdemo.config;

import com.example.jwtdemo.filter.JwtAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableMethodSecurity(prePostEnabled = true) // per usare @PreAuthorize
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/public/**").permitAll()
                .anyRequest().authenticated()
            )
            .addFilterBefore(new JwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
```

---

## 🌐 4. Controller con restrizioni di ruolo (`RoleController.java`)

```java
package com.example.jwtdemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class RoleController {

    @GetMapping("/public/info")
    public Map<String, String> publicInfo() {
        return Map.of("message", "Endpoint pubblico accessibile a tutti.");
    }

    @GetMapping("/user/dashboard")
    @PreAuthorize("hasRole('USER')")
    public Map<String, String> userArea() {
        return Map.of("message", "Benvenuto nell'area utente!");
    }

    @GetMapping("/admin/dashboard")
    @PreAuthorize("hasRole('ADMIN')")
    public Map<String, String> adminArea() {
        return Map.of("message", "Accesso consentito all'area amministratore!");
    }
}
```

---

## 🧪 5. Generare un token con ruoli (da [jwt.io](https://jwt.io))

Vai su **[https://jwt.io](https://jwt.io)**
Inserisci:

### **Header**

```json
{
  "alg": "HS256",
  "typ": "JWT"
}
```

### **Payload**

```json
{
  "sub": "mario",
  "roles": ["ROLE_USER"],
  "exp": 1735680000
}
```

oppure per l’admin:

```json
{
  "sub": "anna",
  "roles": ["ROLE_ADMIN"],
  "exp": 1735680000
}
```

### **Signature**

Usa la stessa chiave:

```
mia_chiave_super_segreta_1234567890!
```

---

## 🚀 6. Test con Postman o curl

### 🔓 Endpoint pubblico

```bash
curl http://localhost:8080/api/public/info
```

✅ Risposta:

```json
{"message":"Endpoint pubblico accessibile a tutti."}
```

---

### 👤 Endpoint utente

```bash
curl -H "Authorization: Bearer <token_user>" http://localhost:8080/api/user/dashboard
```

✅ Risposta:

```json
{"message":"Benvenuto nell'area utente!"}
```

---

### 👑 Endpoint admin

```bash
curl -H "Authorization: Bearer <token_admin>" http://localhost:8080/api/admin/dashboard
```

✅ Risposta:

```json
{"message":"Accesso consentito all'area amministratore!"}
```

---

## 🧠 Riepilogo concetti didattici

| Concetto                              | Descrizione                                                           |
| ------------------------------------- | --------------------------------------------------------------------- |
| **ROLE_USER / ROLE_ADMIN**            | Identificano i privilegi nel token                                    |
| **@PreAuthorize**                     | Permette di proteggere metodi o endpoint con espressioni di sicurezza |
| **JwtAuthenticationFilter**           | Estrae utente e ruoli dal token JWT                                   |
| **SecurityContext**                   | Contiene le informazioni dell’utente autenticato                      |
| **Spring Expression Language (SpEL)** | Linguaggio usato da `@PreAuthorize` (es. `hasRole('ADMIN')`)          |

---

## 🧩 Esercizi per gli studenti

1. Generare un token con ruolo **USER** e accedere all’endpoint `/admin/dashboard` → osservare il `403 Forbidden`.
2. Generare un token con ruolo **ADMIN** e accedere a entrambi gli endpoint → entrambi devono funzionare.
3. Creare un nuovo endpoint `/manager/stats` visibile solo ai `ROLE_MANAGER`.
4. (Avanzato) Implementare un servizio che **crea token dinamicamente** dopo login.

