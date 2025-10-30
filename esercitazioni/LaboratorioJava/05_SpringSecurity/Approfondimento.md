# Scheda: Approccio Spring Security nel progetto «05_SpringSecurity»

## 1. Contesto e obiettivo

* L’esercitazione “05_SpringSecurity” mostra come integrare Spring Security all’interno di un’applicazione Spring Boot sia per **autenticazione** che per **autorizzazione** degli endpoint REST.
* L’obiettivo è far comprendere i blocchi fondamentali: utenti/ruoli, configurazione della sicurezza, gestione degli endpoint protetti, filtro/autorizzazione.
* In un contesto didattico: gli studenti imparano come proteggere operazioni CRUD, come definire utenti in memoria (o da DB) e come usare ruoli per gestire permessi differenziati.

## 2. Principali componenti trattati

Gli elementi chiave dell’approccio:

| Componente                                         | Funzione                                                                                            | Da spiegare agli studenti                                                                       |
| -------------------------------------------------- | --------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| **Configurazione Security** (es. `SecurityConfig`) | Configura HTTP security, filtro, session policy, endpoint pubblici/protetti                         | Spiegare `HttpSecurity`, `authorizeHttpRequests`, `csrf().disable()`, `sessionCreationPolicy()` |
| **Utenti & ruoli**                                 | Definizione di utenti (in memoria o persistiti) e associazione di ruoli (es. ROLE_USER, ROLE_ADMIN) | Mostrare `UserDetailsService`, `GrantedAuthority`, mapping ruoli → permessi                     |
| **Filtro di autenticazione**                       | Intercetta richieste, verifica token/sessione, imposta contesto sicurezza                           | Far capire la differenza tra session‐based e stateless (JWT, token)                             |
| **Protezione degli endpoint**                      | Impone che solo utenti autenticati (o con ruolo specifico) possano accedere                         | Usare `@PreAuthorize`, `antMatchers()`, `hasRole()`                                             |
| **Gestione errori/entry point**                    | Che succede se utente non autenticato o senza permesso?                                             | Spiegare `AuthenticationEntryPoint`, `AccessDeniedHandler`                                      |

## 3. Flusso tipico della richiesta protetta

1. Il client invia una richiesta HTTP verso un endpoint protetto.
2. Spring Security applica la configurazione definita in `SecurityConfig`: verifica se l’endpoint richiede autenticazione, ruoli, etc.
3. Se l’utente non è autenticato → viene restituito `401 Unauthorized` (o secondo configurazione).
4. Se l’utente è autenticato ma non ha il ruolo richiesto → `403 Forbidden`.
5. Se tutto è corretto → la logica del controller viene eseguita.
6. Se si usa token (es. JWT) → nella fase iniziale l’utente effettua il login, riceve il token, e per ogni richiesta lo invia via header `Authorization: Bearer <token>`.

## 4. Aspetti specifici da approfondire

* **Stateless vs Stateful**: perché nelle API REST spesso si usa `SessionCreationPolicy.STATELESS`.
* **CSRF**: nelle applicazioni REST pure spesso lo si disabilita perché non si usano cookie di sessione.
* **Ruoli e permessi**: distinzione tra `ROLE_USER`, `ROLE_ADMIN`, possibili ruoli custom.
* **Filtro custom o token**: nel caso l’esercitazione includa JWT, spiegare come si inserisce un `OncePerRequestFilter` personalizzato.
* **Header di autorizzazione**: come il token deve essere inviato e verificato.
* **Configurazione cors e headers di sicurezza**: spesso necessari se il frontend è separato dal backend.

## 5. Punti di riflessione per gli studenti

* Perché è importante **non memorizzare ruoli e permessi nel client**?
* Quali rischi si introducono se la `JWT_SECRET` è esposta o debole?
* In che casi potremmo usare sessioni tradizionali anziché token?
* Come testare la sicurezza: autenticazione, autorizzazione, endpoint protetti, vari scenari di errore.
* Estensioni pratiche: refresh token, revoca token, auditing degli accessi, ruoli multi‐livello.

## 6. Compito suggerito

* Analizzare il progetto “05_SpringSecurity”: identificare tutti gli endpoint, annotare quali sono protetti e da quali ruoli.
* Implementare un nuovo ruolo (es. `ROLE_MANAGER`) e proteggere un nuovo endpoint `/manager/reports`.
* Simulare un login, tentare accesso con utente senza permessi → osservare l’errore.
* Abilitare token JWT (se non già incluso) o migliorare la sicurezza (ex. HTTPS obbligatorio, CSP headers).
* Scrivere una breve relazione: “Come funziona la sicurezza in questo progetto, quali sono i punti forti e quali le lacune”.

