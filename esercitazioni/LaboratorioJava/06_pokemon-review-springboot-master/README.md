# Pokémon Review Spring Boot

Progetto didattico basato su Spring Boot per la gestione di recensioni sui Pokémon, pensato come laboratorio per esercitazioni su backend REST, architettura a livelli e sicurezza.

## Descrizione

Questo progetto consente di:

* visualizzare l’elenco dei Pokémon e i dettagli correlati;
* creare, leggere, aggiornare ed eliminare recensioni (CRUD) associate a Pokémon;
* utilizzare un’architettura tipica Spring Boot con livelli: controller → service → repository;
* servire da base di partenza per esercitazioni su: DTO, mapper, sicurezza, test, DB.

## Tecnologie

* Java 17 (o versione compatibile)
* Spring Boot (starter Web, Data JPA, Security)
* Maven come sistema di build
* Database H2 in memoria (configurazione didattica)
* (Opzionale) Extensible per JWT, ruoli, etc.

## Struttura del progetto

```
src/main/java/com/example/pokemonreview
  ├── controller      — classi REST controller
  ├── dto             — Data Transfer Object (opzionale)
  ├── mapper          — mapper tra entity e dto (se presente)
  ├── model           — entity JPA (Pokemon, Review, …)
  ├── repository      — Spring Data JPA repository
  ├── service         — service layer con logica applicativa
  ├── exception       — gestione eccezioni applicative
  └── config          — configurazione (tra cui security)
```

## Avvio del progetto

1. Clona il repository

   ```bash
   git clone https://github.com/maboglia/CorsoJava.git
   cd CorsoJava/esercitazioni/LaboratorioJava/pokemon-review-springboot-master
   ```

2. Costruisci con Maven

   ```bash
   mvn clean install
   ```

3. Avvia l’applicazione

   ```bash
   mvn spring-boot:run
   ```

4. Accedi via browser o Postman agli endpoint base, ad es.:
   `http://localhost:8080/api/pokemons`

## API disponibili (esempi)

* `GET /api/pokemons` — elenco di tutti i Pokémon
* `GET /api/pokemons/{id}` — dettaglio di un Pokémon
* `POST /api/pokemons/{id}/reviews` — crea una recensione per il Pokémon identificato
* `GET /api/pokemons/{id}/reviews` — elenco recensioni per un Pokémon
* `PUT /api/reviews/{reviewId}` — aggiorna una recensione
* `DELETE /api/reviews/{reviewId}` — elimina una recensione
  *(Adatta le URI reali in base al codice presente.)*

---

## Security Architecture

### 1. Obiettivo

Garantire che solo utenti autenticati e autorizzati possano accedere a certe parti dell’API (ad esempio modificare o cancellare una recensione) mentre altre parti restano pubbliche (es. leggere l’elenco dei Pokémon).
Imparare come integrare Spring Security in un contesto REST, con autenticazione, autorizzazione, ruoli e protezioni aggiuntive.

### 2. Componenti principali

* **Dipendenza**: `spring-boot-starter-security` aggiunta nel `pom.xml`, che abilita la configurazione di sicurezza automatica di Spring Boot. ([Baeldung on Kotlin][1])
* **Classe di configurazione `SecurityConfig`** (o nome equivalente): definisce le regole di accesso, quali URL sono pubblici, quali richiedono autenticazione e/o specifici ruoli.
* **UserDetailsService / utenti in memoria o persistiti**: definisce utenti, password (encode), ruoli (es. ROLE_USER, ROLE_ADMIN) – in un progetto didattico spesso in memoria.
* **Protezione degli endpoint**: tramite configurazione `antMatchers(...)` o annotazioni `@PreAuthorize` sui controller/metodi per controllare l’accesso in base al ruolo.
* **Ciclo di richiesta**:

  1. Il client invia una richiesta HTTP.
  2. Il filtro di Spring Security intercetta la richiesta.
  3. Viene verificata l’autenticazione (utente + credenziali).
  4. Se autenticato, viene verificato che l’utente abbia i ruoli richiesti per l’endpoint.
  5. In caso positivo, la logica del controller viene invocata; altrimenti viene restituito `401 Unauthorized` o `403 Forbidden`.

### 3. Flusso di autenticazione e autorizzazione

```text
Client → HTTP request → SecurityFilterChain → AuthenticationManager → UserDetailsService
        → (autenticazione riuscita) → SecurityContextHolder con Authentication (username + ruoli)
        → Url autorizzato? → controller
```

In un contesto REST senza sessioni browser, spesso si utilizza token (es. JWT) o Basic Auth. In questo progetto didattico la configurazione può essere semplificata (ad es. Basic Auth o utenti statici) e può essere estesa a JWT.

> Nota: Se il progetto non include token JWT, può essere un’estensione suggerita agli studenti.

### 4. Regole e percorsi di sicurezza

* Endpoints pubblici: es. `GET /api/pokemons`, `GET /api/pokemons/{id}` → accesso libero (permitAll).
* Endpoints protetti: es. `POST /api/pokemons/{id}/reviews`, `PUT /api/reviews/{id}`, `DELETE /api/reviews/{id}` → richiedono autenticazione e il ruolo adeguato (es. ROLE_USER per operazioni utente, ROLE_ADMIN per amministrazione).
* Annotazioni `@PreAuthorize("hasRole('ADMIN')")` sui metodi sensibili (se presenti).
* Protezioni aggiuntive (se implementate): CSRF disabilitato per API REST, CORS, header di sicurezza.

### 5. Proposte di estensione per la didattica

* Integrare il supporto a token JWT: generare token all’autenticazione, inviarlo nell’header `Authorization: Bearer <token>`, validarlo tramite filtro personalizzato.
* Aggiungere nuovi ruoli, ad es. `ROLE_MANAGER`, e nuovi endpoint protetti di livello manageriale (`/api/manager/*`).
* Abilitare CORS per un frontend esterno (React/Angular) che chiama l’API.
* Forzare HTTPS in produzione e definire header di sicurezza (HSTS, X-Frame-Options, Content-Security-Policy) secondo best-practice. ([Snyk][2])

### 6. Checklist di controllo

* [ ] Dipendenza `spring-boot-starter-security` presente?
* [ ] Classe `SecurityConfig` presente e configurata?
* [ ] Utenti e ruoli definiti (in memoria o via DB)?
* [ ] Endpoints pubblici e protetti definiti correttamente?
* [ ] Annotazioni @PreAuthorize o equivalente per metodi sensibili?
* [ ] Controllo del comportamento quando un utente non autenticato o non autorizzato accede a un endpoint protetto.
* [ ] Estensione proposta per JWT + ruoli + filtro personalizzato.

---

## Esercitazioni consigliate

1. Integrare un sistema di login che generi token JWT e modifichi la security per l’uso di token (stateless).
2. Aggiungere un ruolo `ROLE_MANAGER` e un endpoint `/api/manager/reports` accessibile solo a manager.
3. Modificare la configurazione per usare un database real (es. MySQL/PostgreSQL) per utenti, ruoli e recensioni.
4. Scrivere test di integrazione con `MockMvc` per endpoint protetti: verificare 401/403 e accesso corretto per utente con ruolo.
5. Preparare una documentazione Postman (collection) con scenari di autenticazione e autorizzazione.

---

## Autore & licenza

* Questo progetto è parte di un corso di informatica e formazione professionale tenuto dal docente con oltre 20 anni di esperienza.
* Licenza: MIT (o altra licenza a scelta).

---

[1]: https://www.baeldung.com/spring-boot-security-autoconfiguration?utm_source=chatgpt.com "Spring Boot Security Auto-Configuration"
[2]: https://snyk.io/blog/spring-boot-security-best-practices/?utm_source=chatgpt.com "10 Spring Boot security best practices"
