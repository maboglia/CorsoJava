# ContactManager API - Quarkus

Piccola API REST CRUD per la gestione di una rubrica, realizzata con:

- Java 21
- Quarkus 3.40.1.1 (release LTS)
- Maven
- Quarkus REST + Jackson
- Hibernate ORM with Panache
- MySQL 8.4
- Hibernate Validator

## 1. Requisiti

- JDK 21
- Maven 3.9+ (oppure Maven Wrapper, se aggiunto al progetto)
- Docker e Docker Compose **oppure** un server MySQL locale

Verificare Java:

```bash
java -version
```

## 2. Avvio del database con Docker

Dalla cartella principale del progetto:

```bash
docker compose up -d
```

Il container espone MySQL sulla porta `3306` e crea automaticamente il database `contactmanager`.

Credenziali predefinite per il laboratorio:

- database: `contactmanager`
- username: `root`
- password: `root`

Per usare un MySQL già installato, creare il database:

```sql
CREATE DATABASE contactmanager
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;
```

La configurazione è modificabile tramite variabili d'ambiente `DB_URL`, `DB_USERNAME` e `DB_PASSWORD`.

## 3. Avvio di Quarkus

```bash
mvn quarkus:dev
```

L'applicazione sarà disponibile su:

- API: http://localhost:8080/api/contacts
- Quarkus Dev UI: http://localhost:8080/q/dev/

La prima compilazione scarica le dipendenze Maven e può richiedere qualche minuto.

## 4. Endpoint

| Metodo | URL | Descrizione |
|---|---|---|
| GET | `/api/contacts` | Elenco contatti |
| GET | `/api/contacts?cognome=rossi` | Ricerca per cognome |
| GET | `/api/contacts/{id}` | Dettaglio |
| POST | `/api/contacts` | Inserimento |
| PUT | `/api/contacts/{id}` | Modifica |
| DELETE | `/api/contacts/{id}` | Eliminazione |

## 5. Esempi con curl

### Inserimento

```bash
curl -i -X POST http://localhost:8080/api/contacts \
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

La risposta attesa è HTTP `201 Created`.

### Elenco

```bash
curl -i http://localhost:8080/api/contacts
```

### Ricerca per cognome

```bash
curl -i "http://localhost:8080/api/contacts?cognome=rossi"
```

### Dettaglio

```bash
curl -i http://localhost:8080/api/contacts/1
```

### Modifica

```bash
curl -i -X PUT http://localhost:8080/api/contacts/1 \
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

### Eliminazione

```bash
curl -i -X DELETE http://localhost:8080/api/contacts/1
```

La risposta attesa è HTTP `204 No Content`.

## 6. Struttura del progetto

```text
src/main/java/it/corsojava/
├── entity/
│   └── Contact.java
├── repository/
│   └── ContactRepository.java
├── service/
│   └── ContactService.java
└── resource/
    └── ContactResource.java

src/main/resources/
└── application.properties
```

## 7. Concetti Quarkus da osservare

- `@Path`, `@GET`, `@POST`, `@PUT`, `@DELETE`: Jakarta REST.
- `@ApplicationScoped` e `@Inject`: CDI / ArC.
- `@Entity`, `@Id`, `@GeneratedValue`: Jakarta Persistence.
- `PanacheRepository<Contact>`: repository con operazioni CRUD già disponibili.
- `@Transactional`: gestione delle transazioni.
- `Response`: costruzione delle risposte HTTP.

## 8. Note didattiche

- I campi dell'Entity sono `public` per mostrare lo stile semplificato supportato da Panache.
- Il Service aggiorna un'entità già gestita da Hibernate: non è necessario chiamare `persist()` o `merge()` nell'operazione di update.
- `schema-management.strategy=update` è adatto a un laboratorio, non è la strategia consigliata per la gestione dello schema in produzione.
- L'email è univoca a livello database. In questa versione didattica non è ancora implementata una gestione dedicata del conflitto di email duplicate.
- I dati ricevuti vengono esposti direttamente tramite Entity: in un progetto reale è preferibile introdurre DTO e validazione puntuale.
- Il progetto include le dipendenze per i test Quarkus e REST Assured; i test automatici possono essere aggiunti come attività successiva.

## 9. Build

```bash
mvn clean package
```

Il jar viene generato in `target/quarkus-app/`.

## 10. Arresto del database

```bash
docker compose down
```

Per eliminare anche i dati persistenti del database (operazione distruttiva):

```bash
docker compose down -v
```
