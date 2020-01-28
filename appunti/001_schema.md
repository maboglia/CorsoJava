
# Java SE 11 Programmer II

[Java SE 11 Programmer II] (https://education.oracle.com/java/java-se/product_267)

## 4.1. obiettivi

* Creare applicazioni Java che sfruttano le funzionalità orientate agli oggetti del linguaggio Java, come incapsulamento, ereditarietà e polimorfismo
* Eseguire un'applicazione Java dalla riga di comando
* Creare applicazioni che utilizzano il framework Collezioni Java
* Cerca e filtra le raccolte utilizzando Lambda Expressions
* Implementare tecniche di gestione degli errori utilizzando la gestione delle eccezioni
* Implementare la funzionalità di input / output (I / O) per leggere e scrivere su file di dati e di testo
* Manipola file, directory e file system usando la specifica JDK NIO.2
* Eseguire più operazioni su tabelle di database, tra cui la creazione, la lettura, l'aggiornamento e l'eliminazione utilizzando sia la tecnologia JDBC che JPA
* Utilizzare le funzionalità di concorrenza di Lambda Expression
* Applicare pratiche e servizi di programmazione modulari alle applicazioni
* Crea applicazioni multi-thread ad alte prestazioni

---

## 4.2. temi


### 4.2.1. Programmazione Funzionale

* Interfacce funzionali ed espressioni lambda
* Stream di raccolte e filtri
* Interfacce funzionali integrate

---

### 4.2.2. Programmazione modulare

* Introduzione alla programmazione modulare in Java
* Servizi in un'applicazione modulare
* Migrazione ad un'applicazione modulare

---

### 4.2.3. Stream e stream paralleli

* Concorrenza
* Flussi paralleli
* Operazioni terminal: Collezionisti
* Creazione di stream personalizzati

---

### 4.2.4. Programmazione API Java e concetti di codifica sicura

* I / O (Fundamentals e NIO2)
* Codifica sicura
* Applicazioni di database con JDBC
* Localizzazione

---

### 4.2.5. Collezioni e generici

* Cos'è il Framework delle collezioni?
* Iteratori
* Classi di tipo wrapper
* Cosa sono i generici?

---

### 4.2.6. Gestione delle eccezioni e asserzioni

* Eccezioni
* Gestione degli errori
* Asserzioni

---

# 5. Java SE 11 Programmer II - 1Z0-816

---

## 5.1. Fondamenti di Java
* Creare e utilizzare le classi final
* Creare e utilizzare classi interne, nidificate e anonime
* Creare e utilizzare le enumerazioni

---

## 5.2. Gestione delle eccezioni e asserzioni
* Usa il costrutto try-with-resources
* Creare e utilizzare classi di eccezione personalizzate
* Metti alla prova gli invarianti usando le asserzioni

---

## 5.3. Interfacce Java
* Creare e utilizzare interfacce con metodi predefiniti (default)
* Creare e utilizzare interfacce con metodi privati

---

## 5.4. Generici e Collezioni

* Utilizzare le classi wrapper, il boxing automatico e l'unboxing automatico
* Creare e utilizzare classi generiche, metodi con notazione a diamante e caratteri jolly
* Descrivi il Framework di raccolta e usa le interfacce di raccolta chiavi
* Usa Comparator e interfacce comparabili
* Creare e utilizzare metodi di praticità per le raccolte

---

## 5.5. Interfaccia funzionale ed espressioni lambda

* Definire e scrivere interfacce funzionali
* Crea e usa espressioni lambda tra cui istruzione lambdas, variabile locale per i parametri lambda

---

## 5.6. API Java Stream

* Descrivere l'interfaccia Stream e le pipeline
* Usa espressioni lambda e riferimenti a metodi

---

## 5.7. Interfacce funzionali integrate

* Utilizzare le interfacce dal pacchetto java.util.function
* Utilizzare le interfacce funzionali di base tra cui Predicato, Consumatore, Funzione e Fornitore
* Usa le variazioni primitive e binarie delle interfacce di base del pacchetto java.util.function

---

## 5.8. Operazioni Lambda in streaming

* Estrai i dati del flusso usando i metodi map, peek e flatMap
* Cerca i dati dello stream utilizzando i metodi di ricerca findFirst, findAny, anyMatch, allMatch e noneMatch
* Usa la classe opzionale
* Eseguire calcoli utilizzando le operazioni di conteggio, max, min, media e somma del flusso
* Ordina una raccolta usando le espressioni lambda
* Utilizzare i raccoglitori con stream, incluse le operazioni groupingBy e partitioningBy

---

## 5.9. Migrazione ad un'applicazione modulare

* Migrare l'applicazione sviluppata utilizzando una versione Java precedente a SE 9 a SE 11 inclusa la migrazione top-down e bottom-up, suddividendo un'applicazione Java SE 8 in moduli per la migrazione
* Esegui un'applicazione modulaized su classpath e su modulepath
* Utilizzare jdeps per determinare le dipendenze e identificare il modo per affrontare le dipendenze cicliche

---

## 5.10. Servizi in un'applicazione modulare
* Descrivere i componenti dei servizi, comprese le direttive
* Progetta un tipo di servizio,
* carica i servizi utilizzando ServiceLoader,
* verificare le dipendenze dei servizi inclusi i moduli consumer e provider

---

## 5.11. Concorrenza
* Creare thread di lavoro utilizzando Runnable, Callable e utilizzare un ExecutorService per eseguire contemporaneamente attività
* Usa java util raccolte e classi simultanee tra cui CyclicBarrier e CopyOnWriteArrayList
* Scrivi codici thread-safe
* Identificare i problemi di threading come deadlock e livelock

---

## 5.12. Flusso parallelo
* Sviluppa il codice che utilizza il flusso parallelo
* Implementa decomposizione e riduzione con stream


---

## 5.13. I / O (Fundamentals e NIO2)
* Leggi i dati e scrivi i dati della console e dei file utilizzando il flusso I / O
* Utilizzare I / O Stream per leggere e scrivere file
* Leggere e scrivere oggetti utilizzando la serializzazione
* Utilizzare l'interfaccia Path per operare su percorsi di file e directory
* Utilizzare la classe Files per controllare, eliminare, copiare o spostare un file o una directory
* Usa l'API Stream con i file

---

## 5.14. Codifica sicura nell'applicazione Java SE
* Prevenzione della negazione del servizio nelle applicazioni Java
* Protezione delle informazioni riservate nell'applicazione Java
* Implementazione delle linee guida per l'integrità dei dati - iniezioni e convalida dell'inclusione e dell'input
* Prevenire l'attacco esterno del codice limitando l'accessibilità e l'estensibilità, gestendo correttamente la convalida dell'input e la mutabilità
* Protezione della costruzione di oggetti sensibili
* Protezione della serializzazione e della deserializzazione

---

## 5.15. Applicazioni di database con JDBC
* Collegati ai database utilizzando gli URL JDBC e DriverManager
* Utilizzare PreparedStatement per eseguire operazioni CRUD
* Utilizzare le API PreparedStatement e CallableStatement per eseguire operazioni sul database

---

## 5.16. Localizzazione
* Usa la classe Locale
* Usa pacchetti di risorse
* Formatta messaggi, date e numeri con Java


---

## 5.17. annotazioni
* Descrivere lo scopo delle annotazioni e dei tipici schemi di utilizzo
* Applica annotazioni a classi e metodi
* Descrivi le annotazioni di uso comune nel JDK
* Dichiara annotazioni personalizzate