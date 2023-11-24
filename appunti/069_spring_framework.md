# Spring, Hibernate, REST

---

# Che cos'è Spring?

Spring è un framework leggero progettato per la costruzione di applicazioni Java SE e Java EE.

Molti dei concetti chiave alla base di Spring sono diventati così rilevanti da fungere da linee guida per l'evoluzione di EJB 3.0.

## Funzionalità chiave

- **Inversion of Control (IoC):** Un principio fondamentale in Spring che sposta la responsabilità della creazione degli oggetti e della loro gestione a un container di gestione.
  
- **Dependency Injection (DI):** Consente l'iniezione delle dipendenze tra i componenti, migliorando la modularità e la manutenibilità del codice.

- **Supporto alla persistenza:** Spring offre supporto per l'integrazione con framework ORM (Object-Relational Mapping) come Hibernate, semplificando la gestione della persistenza dei dati.

- **Integrazione con Web tier:** Fornisce strumenti per lo sviluppo di applicazioni web, integrando facilmente con framework come Spring MVC.

- **Aspect Oriented Programming (AOP):** Consente di separare le preoccupazioni trasversali come il logging e la gestione delle transazioni, migliorando la modularità del codice.

---

# Introduzione al framework Spring

- **Panoramica sulle componenti di base e sui moduli aggiuntivi:** Esploriamo le componenti fondamentali di Spring e i moduli aggiuntivi disponibili per estendere le funzionalità.

- **Dependency Injection e IoC (Inversion Of Control):** Approfondiamo i concetti di Dependency Injection e Inversion of Control, pilastri fondamentali per la progettazione di applicazioni Spring.

- **The IoC Container: Core ed application Context:** Analizziamo il concetto di container IoC, con particolare attenzione ai suoi due aspetti principali: il Core Container e l'Application Context.

- **Bean e Bean Definition:** Approfondiamo la definizione e l'utilizzo dei bean in Spring, elementi chiave gestiti dal container IoC.

- **Descrizione dei vari tipi di Contesti:** Esploriamo i diversi contesti disponibili in Spring e come influenzano il ciclo di vita delle applicazioni.

- **Autowiring:** Approfondiamo il meccanismo di autowiring, che semplifica la gestione delle dipendenze tra i bean.

- **Definizione dello Scope dei bean:** Analizziamo le opzioni di definizione dello scope dei bean e come influiscono sulla visibilità e sulla durata delle istanze.

- **Creazione ed uso dei Bean Spring: esempi concreti:** Illustrazioni pratiche sulla creazione e sull'uso dei bean in scenari reali.

- **Gestione centralizzata degli Errori e delle eccezioni:** Approfondiamo le tecniche di gestione centralizzata degli errori e delle eccezioni in un contesto Spring.


## Spring nella gestione delle eccezioni e nell'accesso ai dati

### Supporto DAO

- **Consistenza nella gestione delle eccezioni:** Spring facilita la gestione coerente delle eccezioni, contribuendo a rendere il codice robusto e manutenibile.

- **Data Access Exception:** Introduce eccezioni specifiche per il livello di accesso ai dati, migliorando la gestione degli errori in operazioni di lettura/scrittura.

- **Iniezione delle dipendenze nei DAO:** Utilizzando l'inversione di controllo, Spring semplifica l'iniezione delle dipendenze nei Data Access Objects (DAO), favorendo la modularità del codice.

### Integrazione con JDBC

- **JDBC Template:** Spring semplifica l'utilizzo di JDBC attraverso il JDBC Template, riducendo il codice boilerplate e migliorando la chiarezza.

- **Configurazione di un DAO JDBC:** Guida alla configurazione di un Data Access Object (DAO) basato su JDBC, inclusi dettagli sulla gestione delle connessioni e delle transazioni.

- **SimpleJdbcInsert:** Illustra l'uso di SimpleJdbcInsert per semplificare le operazioni di inserimento con JDBC.

- **SqlQuery e MappingSqlQuery:** Approfondisce l'utilizzo di SqlQuery e MappingSqlQuery per eseguire query personalizzate e mappare i risultati alle classi del dominio.

---

## Spring Boot Application Starters

| Nome                              | Descrizione                                                                                                       |
|-----------------------------------|-------------------------------------------------------------------------------------------------------------------|
| spring-boot-starter               | Starter core, inclusi supporto all'auto-configurazione, logging e POM YAML.                                        |
| spring-boot-starter-activemq       | Starter per la messaggistica JMS utilizzando Apache ActiveMQ e POM.                                                |
| spring-boot-starter-amqp           | Starter per l'utilizzo di Spring AMQP e RabbitMQ con POM.                                                          |
| spring-boot-starter-aop            | Starter per la programmazione orientata agli aspetti (AOP) con Spring AOP e AspectJ POM.                           |
| spring-boot-starter-artemis        | Starter per la messaggistica JMS utilizzando Apache Artemis POM.                                                   |
| spring-boot-starter-batch          | Starter per l'utilizzo di Spring Batch con POM.                                                                   |
| spring-boot-starter-cache          | Starter per l'utilizzo del supporto alla memorizzazione nella cache di Spring Framework POM.                       |
| spring-boot-starter-cloud-connectors | Starter per l'utilizzo di Spring Cloud Connectors semplificando la connessione a servizi in cloud come Cloud Foundry e Heroku POM. |
| ... (elenco abbreviato) ...

Questi starter semplificano la configurazione e l'utilizzo di specifici moduli e funzionalità di Spring Boot, accelerando lo sviluppo e garantendo una base solida per le applicazioni. Puoi scegliere il starter che meglio si adattano alle tue esigenze in base al tipo di applicazione che stai sviluppando.
