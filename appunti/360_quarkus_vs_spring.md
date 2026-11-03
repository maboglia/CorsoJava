# Laboratorio didattico – Quarkus vs Spring Boot

JAVA BACKEND DEVELOPMENT · JAVA 21 · MAVEN · MYSQL · REST API

Esercitazione pratica

Livello intermedio

L'obiettivo è realizzare una piccola applicazione backend con Quarkus e successivamente riprodurre le stesse funzionalità con Spring Boot, per confrontare concretamente i due framework.

Propongo di utilizzare un progetto comune: una semplice API REST per la gestione di una rubrica di contatti.

La scelta è intenzionale: il dominio è semplice, ma permette di affrontare tutti gli elementi fondamentali dello sviluppo backend Java:

- Architettura a livelli.
- API REST e protocollo HTTP.
- Entity e mapping ORM.
- Repository e accesso ai dati.
- Dependency Injection.
- Gestione delle richieste e delle risposte JSON.
- Persistenza MySQL.
- Test degli endpoint.

## 1. Specifiche del progetto

Nome applicazione: ContactManager API

Funzionalità: gestione CRUD di una rubrica di contatti.

Modello dati: Contact

| Campo    | Tipo Java | Descrizione             |
| -------- | --------- | ----------------------- |
| id       | Long      | Identificativo          |
| nome     | String    | Nome del contatto       |
| cognome  | String    | Cognome                 |
| email    | String    | Indirizzo email         |
| telefono | String    | Numero telefonico       |
| azienda  | String    | Azienda di appartenenza |
| attivo   | Boolean   | Stato del contatto      |

### Endpoint REST da realizzare

| Metodo | Endpoint             | Funzione           |
| ------ | -------------------- | ------------------ |
| GET    | `/api/contacts`      | Elenco contatti    |
| GET    | `/api/contacts/{id}` | Dettaglio contatto |
| POST   | `/api/contacts`      | Inserimento        |
| PUT    | `/api/contacts/{id}` | Modifica           |
| DELETE | `/api/contacts/{id}` | Eliminazione       |

Entrambe le applicazioni dovranno esporre gli stessi endpoint e utilizzare lo stesso database.

## 2. Architettura applicativa

Utilizzeremo una struttura a livelli, mantenendo separati i compiti delle varie componenti.

## REST Controller

Ricezione richieste HTTP e risposta JSON

## Service

Logica applicativa

## Repository

Accesso ai dati tramite ORM

MySQL Database

Tabella contacts

La cosa importante è che la struttura concettuale rimanga la stessa nei due framework. Cambieranno le annotazioni, le API e alcuni meccanismi interni.

## 3. Tecnologie utilizzate

| Tecnologia           | Quarkus                | Spring Boot       |
| -------------------- | ---------------------- | ----------------- |
| Linguaggio           | Java 21                | Java 21           |
| Build                | Maven                  | Maven             |
| REST                 | Quarkus REST           | Spring Web        |
| ORM                  | Hibernate ORM          | Hibernate ORM     |
| Repository           | Panache                | Spring Data JPA   |
| Database             | MySQL                  | MySQL             |
| Dependency Injection | CDI / ArC              | Spring IoC        |
| Test                 | JUnit 5 / REST Assured | JUnit 5 / MockMvc |

## 4. Prima implementazione: Quarkus

[Extending Quarkus: When and How to Write Your Own Extensions - DEV Community](https://images.openai.com/static-rsc-4/HE3rQ0DHHwxA9aEAbxMC-eYt9YtJ7Kgd7rFbuJMlpK6DH91D67tlj7tfLdG2iTUBKHqiL3jRxzbFYZJGTNrVvvDTpdUE0GIvoUpa-GhDZ8vgDtbqTMbQiegmM-seaVsdqmWg_6akrGS_pppw3I-NcO40NW0eunKDha1GwYa3FeA?purpose=inline)

Progetto ContactManager Quarkus

Maven · Java 21 · Hibernate Panache

### 4.1 Creazione del progetto

Il modo più semplice per iniziare è utilizzare il generatore ufficiale:

[Quarkus Project Generator](https://code.quarkus.io/?utm_source=chatgpt.com)

Configurazione:

| Parametro    | Valore           |
| ------------ | ---------------- |
| Build tool   | Maven            |
| Language     | Java             |
| Java version | 21               |
| Group        | `it.corsojava`   |
| Artifact     | `contactmanager` |
| Package      | `it.corsojava`   |

Selezionare queste estensioni:

- REST (Quarkus REST).
- Hibernate ORM with Panache.
- JDBC Driver - MySQL.
- Hibernate Validator.
- Jackson (JSON serialization).

In alternativa, da terminale, con Quarkus CLI:

```
quarkus create app it.corsojava:contactmanager \
  --extension='rest-jackson,hibernate-orm-panache,jdbc-mysql,hibernate-validator' \
  --java=21
```

Entrare nella directory:

```
cd contactmanager
```

Avviare l'applicazione in modalità sviluppo:

```
./mvnw quarkus:dev
```

Quarkus utilizza la modalità Dev Mode, che permette di modificare il codice e vedere rapidamente gli effetti delle modifiche senza dover riavviare manualmente il server.

### 4.2 Struttura del progetto

Organizziamo il codice in package distinti:

```
contactmanager/
│
├── src/main/java/it/corsojava/
│   │
│   ├── entity/
│   │   └── Contact.java
│   │
│   ├── repository/
│   │   └── ContactRepository.java
│   │
│   ├── service/
│   │   └── ContactService.java
│   │
│   └── resource/
│       └── ContactResource.java
│
├── src/main/resources/
│   └── application.properties
│
└── pom.xml
```

### 4.3 Configurazione MySQL

Creiamo il database:

```
CREATE DATABASE contactmanager
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;
```

Nel file `src/main/resources/application.properties`:

```
# Applicazione
quarkus.application.name=contactmanager

# Database MySQL
quarkus.datasource.db-kind=mysql
quarkus.datasource.username=root
quarkus.datasource.password=root

quarkus.datasource.jdbc.url=jdbc:mysql://localhost:3306/contactmanager

# Hibernate ORM
quarkus.hibernate-orm.schema-management.strategy=update

# Porta HTTP
quarkus.http.port=8080
```

Per questo laboratorio utilizziamo `update`, così Hibernate può aggiornare lo schema in base alle Entity. In un ambiente produttivo è preferibile gestire le modifiche al database con strumenti di migration come Flyway o Liquibase.

### 4.4 Creazione della Entity

File `entity/Contact.java`:

```
package it.corsojava.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String nome;

    @Column(nullable = false)
    public String cognome;

    @Column(unique = true, nullable = false)
    public String email;

    public String telefono;

    public String azienda;

    public Boolean attivo = true;
}
```

Concetti didattici:

- `@Entity`: identifica una classe persistente.
- `@Table`: associa la classe a una tabella.
- `@Id`: identifica la chiave primaria.
- `@GeneratedValue`: definisce la generazione automatica dell'identificativo.
- `@Column`: configura le proprietà delle colonne.

Una particolarità: in questo esempio utilizziamo campi pubblici per sfruttare una caratteristica di Panache. In una normale implementazione JPA si possono utilizzare anche proprietà private con getter e setter.

### 4.5 Repository con Panache

File `repository/ContactRepository.java`:

```
package it.corsojava.repository;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import it.corsojava.entity.Contact;

@ApplicationScoped
public class ContactRepository
        implements PanacheRepository<Contact> {

}
```

Questa è una delle caratteristiche interessanti di Panache.

Non dobbiamo implementare manualmente tutti i metodi CRUD: il repository eredita già le operazioni fondamentali.

Ad esempio:

```
findAll()
findById(id)
persist(contact)
delete(contact)
count()
```

Possiamo inoltre aggiungere query personalizzate:

```
public Contact findByEmail(String email) {
    return find("email", email).firstResult();
}
```

### 4.6 Service Layer

File `service/ContactService.java`:

```
package it.corsojava.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import it.corsojava.entity.Contact;
import it.corsojava.repository.ContactRepository;

@ApplicationScoped
public class ContactService {

    @Inject
    ContactRepository repository;

    public List<Contact> findAll() {
        return repository.listAll();
    }

    public Contact findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    public Contact create(Contact contact) {
        repository.persist(contact);
        return contact;
    }

    @Transactional
    public Contact update(Long id, Contact data) {

        Contact contact = repository.findById(id);

        if (contact == null) {
            return null;
        }

        contact.nome = data.nome;
        contact.cognome = data.cognome;
        contact.email = data.email;
        contact.telefono = data.telefono;
        contact.azienda = data.azienda;
        contact.attivo = data.attivo;

        return contact;
    }

    @Transactional
    public boolean delete(Long id) {

        Contact contact = repository.findById(id);

        if (contact == null) {
            return false;
        }

        repository.delete(contact);
        return true;
    }
}
```

Concetti da approfondire:

- `@ApplicationScoped`: definisce un componente gestito dal container CDI.
- `@Inject`: realizza la Dependency Injection.
- `@Transactional`: delimita una transazione database.
- `@ApplicationScoped` non è un'annotazione Spring: appartiene a CDI, utilizzato da Quarkus attraverso ArC.

### 4.7 REST Controller

In Quarkus utilizziamo il termine Resource, coerente con le specifiche Jakarta REST.

File `resource/ContactResource.java`:

```
package it.corsojava.resource;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import it.corsojava.entity.Contact;
import it.corsojava.service.ContactService;

@Path("/api/contacts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContactResource {

    @Inject
    ContactService service;

    @GET
    public List<Contact> findAll() {
        return service.findAll();
    }

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Long id) {

        Contact contact = service.findById(id);

        if (contact == null) {
            return Response.status(404).build();
        }

        return Response.ok(contact).build();
    }

    @POST
    public Response create(Contact contact) {

        Contact created = service.create(contact);

        return Response.status(201)
                .entity(created)
                .build();
    }

    @PUT
    @Path("/{id}")
    public Response update(
            @PathParam("id") Long id,
            Contact data) {

        Contact updated = service.update(id, data);

        if (updated == null) {
            return Response.status(404).build();
        }

        return Response.ok(updated).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {

        boolean deleted = service.delete(id);

        if (!deleted) {
            return Response.status(404).build();
        }

        return Response.noContent().build();
    }
}
```

Abbiamo realizzato i cinque endpoint CRUD.

Una nota per gli studenti: `@Path`, `@GET`, `@POST`, `@PUT` e `@DELETE` appartengono alle API Jakarta REST. Non sono annotazioni proprietarie di Quarkus.

### 4.8 Avvio e verifica

Avviamo il progetto:

```
./mvnw quarkus:dev
```

Il server sarà disponibile su:

```
http://localhost:8080
```

Possiamo utilizzare Postman, Insomnia oppure `curl`.

Inserimento di un contatto:

```
curl -X POST http://localhost:8080/api/contacts \
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

```
curl http://localhost:8080/api/contacts
```

Dettaglio:

```
curl http://localhost:8080/api/contacts/1
```

Modifica:

```
curl -X PUT http://localhost:8080/api/contacts/1 \
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

```
curl -X DELETE http://localhost:8080/api/contacts/1
```

## 5. Seconda implementazione: Spring Boot

[Why Spring Boot Throws UnsatisfiedDependencyException (And How Senior Devs Solve It) | by Gaddam.Naveen | Medium](https://images.openai.com/static-rsc-4/MZkmHC_pz8g6nM3b9QlDhNlHhvSXgL7EbIwUCD3gg4v-zkX_S3EHIWIdmnz5SZJ6wpYo5nGXCxV1-a8JyFFuZ5gZ0dHeXABhPV2RmrFB_l2GYpIaPFmXxEp3VVdGBOnWxduds93bxqkuSUjXLckBiZ3ZLZ94WxcXty6BFAz3ZGQ?purpose=inline)

Progetto ContactManager Spring Boot

Maven · Java 21 · Spring Data JPA

Adesso realizziamo la stessa applicazione con Spring Boot.

L'obiettivo non è semplicemente riscrivere il codice, ma individuare le differenze architetturali e tecnologiche.

### 5.1 Creazione del progetto

Utilizziamo [Spring Initializr](https://start.spring.io/?utm_source=chatgpt.com).

Configurazione:

| Parametro   | Valore                    |
| ----------- | ------------------------- |
| Project     | Maven                     |
| Language    | Java                      |
| Spring Boot | Versione stabile proposta |
| Group       | `it.corsojava`            |
| Artifact    | `contactmanager`          |
| Java        | 21                        |
| Packaging   | Jar                       |

Dipendenze:

- Spring Web.
- Spring Data JPA.
- MySQL Driver.
- Validation.

### 5.2 Struttura del progetto

```
contactmanager/
│
├── src/main/java/it/corsojava/
│   │
│   ├── entity/
│   │   └── Contact.java
│   │
│   ├── repository/
│   │   └── ContactRepository.java
│   │
│   ├── service/
│   │   └── ContactService.java
│   │
│   └── controller/
│       └── ContactController.java
│
├── src/main/resources/
│   └── application.properties
│
└── pom.xml
```

La struttura è praticamente identica a quella del progetto Quarkus.

### 5.3 Configurazione MySQL

File `application.properties`:

```
spring.application.name=contactmanager

spring.datasource.url=jdbc:mysql://localhost:3306/contactmanager
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8081
```

Utilizziamo la porta 8081 per poter eseguire contemporaneamente le due applicazioni sullo stesso database.

### 5.4 Entity

File `entity/Contact.java`:

```
package it.corsojava.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cognome;

    @Column(unique = true, nullable = false)
    private String email;

    private String telefono;

    private String azienda;

    private Boolean attivo = true;

    // Getter e Setter
}
```

Qui utilizziamo campi privati e getter/setter, secondo una convenzione molto diffusa nello sviluppo Java con Spring.

Per non appesantire la scheda, i getter e setter sono omessi.

La classe Entity utilizza le stesse annotazioni Jakarta Persistence viste in Quarkus.

Prima osservazione: la persistenza JPA non è una caratteristica esclusiva di Spring o Quarkus. Entrambi possono utilizzare Hibernate ORM.

### 5.5 Repository con Spring Data JPA

File `repository/ContactRepository.java`:

```
package it.corsojava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.corsojava.entity.Contact;

public interface ContactRepository
        extends JpaRepository<Contact, Long> {

    Contact findByEmail(String email);
}
```

Confrontiamolo con Panache.

In Spring Data JPA:

- `JpaRepository` mette a disposizione i metodi CRUD.
- Non occorre implementare manualmente il repository.
- È possibile definire query attraverso il nome dei metodi.
- Si possono utilizzare query JPQL o SQL personalizzate.

Ad esempio:

```
findAll()
findById(id)
save(contact)
deleteById(id)
count()
```

### 5.6 Service Layer

File `service/ContactService.java`:

```
package it.corsojava.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.corsojava.entity.Contact;
import it.corsojava.repository.ContactRepository;

@Service
public class ContactService {

    private final ContactRepository repository;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    public List<Contact> findAll() {
        return repository.findAll();
    }

    public Contact findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Transactional
    public Contact create(Contact contact) {
        return repository.save(contact);
    }

    @Transactional
    public Contact update(Long id, Contact data) {

        Contact contact = repository.findById(id).orElse(null);

        if (contact == null) {
            return null;
        }

        contact.setNome(data.getNome());
        contact.setCognome(data.getCognome());
        contact.setEmail(data.getEmail());
        contact.setTelefono(data.getTelefono());
        contact.setAzienda(data.getAzienda());
        contact.setAttivo(data.getAttivo());

        return repository.save(contact);
    }

    @Transactional
    public boolean delete(Long id) {

        if (!repository.existsById(id)) {
            return false;
        }

        repository.deleteById(id);
        return true;
    }
}
```

Osserviamo la Dependency Injection:

```
public ContactService(ContactRepository repository) {
    this.repository = repository;
}
```

Spring utilizza la Dependency Injection attraverso il costruttore.

In Quarkus avevamo utilizzato:

```
@Inject
ContactRepository repository;
```

Entrambi i framework gestiscono automaticamente la creazione e l'iniezione dei componenti.

### 5.7 REST Controller

File `controller/ContactController.java`:

```
package it.corsojava.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import it.corsojava.entity.Contact;
import it.corsojava.service.ContactService;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @GetMapping
    public List<Contact> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contact> findById(@PathVariable Long id) {

        Contact contact = service.findById(id);

        if (contact == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(contact);
    }

    @PostMapping
    public ResponseEntity<Contact> create(
            @RequestBody Contact contact) {

        Contact created = service.create(contact);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contact> update(
            @PathVariable Long id,
            @RequestBody Contact data) {

        Contact updated = service.update(id, data);

        if (updated == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        boolean deleted = service.delete(id);

        if (!deleted) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }
}
```

### 5.8 Avvio dell'applicazione

```
./mvnw spring-boot:run
```

L'applicazione sarà disponibile su:

```
http://localhost:8081
```

Gli endpoint sono gli stessi del progetto Quarkus.

Possiamo utilizzare gli stessi comandi `curl`, sostituendo semplicemente la porta 8080 con 8081.

## 6. Confronto diretto: Quarkus vs Spring Boot

Questa è probabilmente la parte didatticamente più interessante dell'esercitazione.

| Concetto             | Quarkus              | Spring Boot           |
| -------------------- | -------------------- | --------------------- |
| REST Controller      | `@Path`              | `@RestController`     |
| Mapping GET          | `@GET`               | `@GetMapping`         |
| Mapping POST         | `@POST`              | `@PostMapping`        |
| Mapping PUT          | `@PUT`               | `@PutMapping`         |
| Mapping DELETE       | `@DELETE`            | `@DeleteMapping`      |
| Parametro URL        | `@PathParam`         | `@PathVariable`       |
| Body JSON            | Parametro metodo     | `@RequestBody`        |
| Dependency Injection | `@Inject`            | Constructor Injection |
| Componente Service   | `@ApplicationScoped` | `@Service`            |
| Transazioni          | `@Transactional`     | `@Transactional`      |
| Repository           | `PanacheRepository`  | `JpaRepository`       |
| Inserimento          | `persist()`          | `save()`              |
| Ricerca ID           | `findById()`         | `findById()`          |
| Elenco               | `listAll()`          | `findAll()`           |
| Eliminazione         | `delete()`           | `deleteById()`        |

### Le differenze architetturali più importanti

1\. REST

Quarkus utilizza Jakarta REST, mentre Spring Boot utilizza Spring MVC (Spring Web) nell'implementazione proposta.

2\. Dependency Injection

Quarkus utilizza CDI tramite ArC, mentre Spring utilizza il proprio container IoC.

3\. Persistenza

Quarkus utilizza Hibernate ORM con Panache, mentre Spring Data JPA fornisce un'astrazione repository basata su JPA.

4\. Programmazione

Quarkus punta molto sulle ottimizzazioni a build time e sullo sviluppo cloud-native. Spring Boot offre un ecosistema molto esteso e una grande disponibilità di componenti e integrazioni.

Non bisogna però confondere la velocità di avvio con le prestazioni complessive: sono aspetti differenti.

## 7. Test e verifica funzionale

Per verificare che i due progetti siano equivalenti, prepariamo una sequenza di test da eseguire su entrambe le applicazioni.

| Operazione   | Quarkus      | Spring Boot  |
| ------------ | ------------ | ------------ |
| Inserimento  | POST :8080   | POST :8081   |
| Elenco       | GET :8080    | GET :8081    |
| Dettaglio    | GET :8080    | GET :8081    |
| Modifica     | PUT :8080    | PUT :8081    |
| Eliminazione | DELETE :8080 | DELETE :8081 |

Attenzione: entrambe le applicazioni utilizzano lo stesso database MySQL. Questo permette di verificare anche l'interoperabilità dei dati, ma conviene evitare di modificare contemporaneamente lo stesso contatto durante i test.

### Risultato JSON atteso

```
{
  "id": 1,
  "nome": "Mario",
  "cognome": "Rossi",
  "email": "mario.rossi@example.it",
  "telefono": "3331234567",
  "azienda": "Tech Solutions",
  "attivo": true
}
```

## 8. Estensioni dell'esercitazione

Una volta completata la versione base, possiamo introdurre alcuni miglioramenti.

| Estensione          | Argomento didattico     |
| ------------------- | ----------------------- |
| Validazione email   | Bean Validation         |
| Campi obbligatori   | `@NotBlank`, `@NotNull` |
| Gestione errori     | Exception Handling      |
| Ricerca per cognome | Query personalizzate    |
| Paginazione         | Pagination              |
| Ordinamento         | Sorting                 |
| DTO                 | Separazione Entity/API  |
| Documentazione      | OpenAPI / Swagger       |
| Test automatici     | JUnit 5                 |
| Containerizzazione  | Docker / Docker Compose |

In particolare suggerisco di introdurre i DTO: è importante far comprendere agli studenti che le Entity rappresentano il modello persistente, mentre i DTO rappresentano i dati scambiati attraverso le API.

## 9. Organizzazione didattica del laboratorio

Propongo una distribuzione su 8 ore, eventualmente articolabile in due lezioni.

## Piano delle attività

1. Prima parte – Introduzione a Quarkus (1 ora)
   - Architettura e caratteristiche.
   - Confronto con Spring Boot.
   - Creazione del progetto Maven.
2. Seconda parte – Sviluppo Quarkus (2 ore)
   - Configurazione MySQL.
   - Entity e Repository Panache.
   - Service e REST Resource.
3. Terza parte – Test API (1 ora)
   - Avvio applicazione.
   - Test CRUD con Postman.
   - Verifica dati MySQL.
4. Quarta parte – Sviluppo Spring Boot (2 ore)
   - Creazione progetto equivalente.
   - Spring Data JPA.
   - Service e Controller.
5. Quinta parte – Confronto (1 ora)
   - Confronto delle annotazioni.
   - Repository e Dependency Injection.
   - Differenze architetturali.
6. Sesta parte – Verifica e conclusioni (1 ora)
   - Test comparativi.
   - Discussione sulle scelte tecnologiche.
   - Possibili sviluppi.

Durata complessiva

# 8 ore

## 10. Alcune attenzioni tecniche prima di distribuire il materiale

Per avere due progetti realmente eseguibili, occorre completare alcuni dettagli:

1. Nel progetto Spring Boot bisogna inserire tutti i getter e setter della Entity (oppure utilizzare Lombok).
2. Per entrambi i progetti è opportuno aggiungere DTO e validazione prima di esporre l'applicazione in produzione.
3. La gestione degli errori dovrebbe essere uniformata, restituendo anche messaggi JSON significativi per gli errori 404 e 400.
4. È consigliabile utilizzare Flyway per mantenere allineato lo schema MySQL.
5. Le versioni delle dipendenze vanno mantenute compatibili con Java 21.

## 11. Documentazione ufficiale

[image](https://www.google.com/s2/favicons?domain=https://quarkus.io\&sz=32)

Quarkus

[Guide ufficiali](https://quarkus.io/guides/?utm_source=chatgpt.com)

[image](https://www.google.com/s2/favicons?domain=https://quarkus.io\&sz=32)

Hibernate Panache

[Documentazione](https://quarkus.io/guides/hibernate-orm-panache?utm_source=chatgpt.com)

[image](https://www.google.com/s2/favicons?domain=https://spring.io\&sz=32)

Spring Boot

[Guide ufficiali](https://spring.io/guides?utm_source=chatgpt.com)

[image](https://www.google.com/s2/favicons?domain=https://spring.io\&sz=32)

Spring Data JPA

[Documentazione](https://spring.io/projects/spring-data-jpa?utm_source=chatgpt.com)

## 12. Consegna agli studenti

L'esercitazione può concludersi con questa consegna:

Realizzare due applicazioni REST API equivalenti, una con Quarkus e una con Spring Boot, entrambe basate su Java 21, Maven e MySQL.

Le applicazioni devono:

- Implementare tutte le operazioni CRUD.
- Utilizzare un'architettura a livelli.
- Utilizzare Hibernate ORM per la persistenza.
- Restituire dati in formato JSON.
- Gestire correttamente le risposte HTTP.
- Essere testabili tramite Postman.

Elaborato finale: due progetti Maven distinti e una breve relazione comparativa sulle differenze tra Quarkus e Spring Boot.

---

### Laboratorio

- [Progetto quarkus](../esercitazioni/LaboratorioJava/04_avanzato/contactmanager-quarkus/README.md)
- [Progetto spring](../esercitazioni/LaboratorioJava/04_avanzato/contactmanager-springboot/README.md)