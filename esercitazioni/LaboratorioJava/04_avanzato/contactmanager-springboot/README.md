# ContactManager API - Spring Boot

Versione Spring Boot equivalente al laboratorio ContactManager Quarkus.

## Tecnologie
- Java 21
- Spring Boot 3.5.6
- Maven
- Spring Web
- Spring Data JPA / Hibernate ORM
- MySQL 8.4
- Jakarta Bean Validation

## Requisiti
JDK 21, Maven 3.9+ e Docker/Compose oppure un server MySQL locale.

```bash
java -version
```

## 1. Avvio MySQL
Dalla cartella del progetto:

```bash
docker compose up -d
```

Il container crea il database `contactmanager`, con username `root` e password `root`, esponendo MySQL sulla porta 3306.

Se usi MySQL installato localmente, crea il database:

```sql
CREATE DATABASE contactmanager
CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

Puoi modificare la connessione con le variabili `DB_URL`, `DB_USERNAME` e `DB_PASSWORD`.

## 2. Avvio Spring Boot

```bash
mvn spring-boot:run
```

API base: http://localhost:8081/api/contacts

## 3. Endpoint REST

| Metodo | URL | Descrizione |
|---|---|---|
| GET | `/api/contacts` | Elenco contatti |
| GET | `/api/contacts?cognome=rossi` | Ricerca per cognome |
| GET | `/api/contacts/{id}` | Dettaglio |
| POST | `/api/contacts` | Inserimento |
| PUT | `/api/contacts/{id}` | Modifica |
| DELETE | `/api/contacts/{id}` | Eliminazione |

## 4. Esempi curl

Inserimento:

```bash
curl -i -X POST http://localhost:8081/api/contacts \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "Mario",
    "cognome": "Rossi",
    "email": "mario.rossi@example.it",
    "telefono": "3331234567",
    "azienda": "Tech Solutions",
    "attivo": true
  }'
```

Elenco:

```bash
curl -i http://localhost:8081/api/contacts
```

Ricerca:

```bash
curl -i "http://localhost:8081/api/contacts?cognome=rossi"
```

Dettaglio:

```bash
curl -i http://localhost:8081/api/contacts/1
```

Modifica:

```bash
curl -i -X PUT http://localhost:8081/api/contacts/1 \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "Mario",
    "cognome": "Rossi",
    "email": "mario.rossi@example.it",
    "telefono": "3339999999",
    "azienda": "New Tech",
    "attivo": true
  }'
```

Eliminazione:

```bash
curl -i -X DELETE http://localhost:8081/api/contacts/1
```

## 5. Struttura

```text
src/main/java/it/corsojava/
├── ContactManagerApplication.java
├── entity/Contact.java
├── repository/ContactRepository.java
├── service/ContactService.java
└── controller/ContactController.java
```

## 6. Concetti Spring da osservare
- `@SpringBootApplication`: avvio e autoconfigurazione.
- `@RestController`, `@RequestMapping`: esposizione API REST.
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`: mapping HTTP.
- `@Service`: componente del livello applicativo.
- Constructor Injection: iniezione delle dipendenze tramite costruttore.
- `JpaRepository<Contact, Long>`: CRUD generato da Spring Data JPA.
- `@Transactional`: gestione delle transazioni.
- `@Valid`: validazione dei dati in ingresso.

## 7. Note didattiche
- L'Entity usa campi private e getter/setter.
- `findByCognomeContainingIgnoreCase` è una query derivata generata da Spring Data JPA.
- Nel metodo update l'entity è managed e Hibernate sincronizza le modifiche al commit.
- `spring.jpa.hibernate.ddl-auto=update` è comodo in laboratorio; in produzione è preferibile Flyway o Liquibase.
- L'email è univoca a livello database. La gestione applicativa del conflitto di email duplicate è una possibile estensione.
- Per semplicità l'API espone direttamente l'Entity; in un progetto reale introdurre DTO.

## 8. Build e test

```bash
mvn clean test
mvn clean package
```

Il jar viene creato in `target/`.

## 9. Arresto database

```bash
docker compose down
```

Per eliminare anche il volume dati (operazione distruttiva):

```bash
docker compose down -v
```
