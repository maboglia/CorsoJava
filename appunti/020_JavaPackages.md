# Package in Java

## Organizzazione delle classi

* La libreria standard segue il metodo di
organizzazione delle classi previsto da Java: le classi
tra loro “affini” sono raggruppate in package
* Ogni package ha un nome tipicamente composto da
due o più parole separate da . e contiene una o più
classi (ed eventualmente altri componenti)
* I nomi a più livelli riflettono un’organizzazione
gerarchica dei package simile a quella delle cartelle
(directory) su un disco

---

## Esempi di package

* [`java.lang`](API_Java/021_java_lang.md) Package fondamentale con
classi di uso molto comune
* `java.io` Package per l’Input/Output
* [`java.util`](API_Java/033_java.util.md) Package con classi varie di
utilità generale
* `java.text` Package con classi per la
gestione ed elaborazione di
testi e dati in formato testuale

---

## Uso di classi appartenenti ad un package

* Solo le classi appartenenti al package java.lang sono
automaticamente disponibili in ogni programma
* Per l’uso di altri package in una classe è necessario
“importarli” tramite la parola riservata import
* Tutte le dichiarazioni di importazione devono trovarsi
prima della definizione della classe
* Si possono importare singole classi di un package p.e.
`import java.util.Random`
ma è più tipico importare comunque tutto il package:
`import java.util.*`

---

## I package

* All’atto pratico un package è un insieme di file `.class`
tipicamente archiviati in un file compresso `.zip` o `.jar`
* Ogni classe appartiene ad un package: la
dichiarazione di appartenenza può essere effettuata
all’inizio del codice della classe usando la parola
riservata package seguita dal nome del package
* Se non si dichiara esplicitamente il package la classe
viene assegnata ad un package “anonimo” che
contiene, oltre ad essa, tutte le classi senza package
presenti nella stessa directory

---

## Un package è un insieme logico di classi

* Fisicamente le classi stanno su uno o più file, tutti contenuti in una stessa directory
* Ogni package definisce un suo scope (ambiente di visibilità dei nomi)
* Stessi nomi in package diversi senza conflitti

---

## Nomi

Un package è identificato univocamente da un nome costruito gerarchicamente (notazione puntata)

* `java.util`
* `it.bogliaccino.utilita`

### Convenzione per generare nomi unici

* Usare come prefisso del nome del package il proprio nome internet invertito

## Creazione di un package

Tutti i file del package devono contenere la riga 

`package <nomePackage>;`

quale prima riga del file (tranne i commenti)

Specifica che la classe pubblica contenuta in quel file fa parte di quel package

---


## Utilizzo di un package

### Un package può essere utilizzato

* Mediante importazione del package
* Mediante riferimento esplicito

### Importare un package significa

* Importare la singola classe del package
`import nomePackage.nomeClass;`
* Importare tutte le classi del package
`import nomePackage;`
* Esempi 
  * `import java.util.ArrayList;`
  * `import java.util.*;`
  * `import java.util;`

---


### Riferimento esplicito (senza import)

* Specificare il nome per intero `java.util.ArrayList `  
* Invece di import `java.util.*;`

### Collisioni

* Se due package definiscono classi omonime possono essere importati entrambi
* La collisione si verifica solo quando si utilizzano gli elementi in conflitto

## Storage (directory)

La directory in cui il package risiede deve avere un path che corrisponde a quello del nome `java.util` <-> `java/util`

**Il path è relativo a uno dei percorsi di ricerca automatica definiti nella variabile di ambiente CLASSPATH**

---


### Un sottoalbero di package può essere sostituito da un

* File zippato ( .zip)
* File archiviato ( .jar)
* Esempio `CLASSPATH=c:\java\jdk\lib;c:\java\mylibs`

---

## Visibilità

* Le regole di encapsulation / visibilità si applicano anche ai package


* Modificatori di visibilità

* **Su attributi o metodi di classi entro package**

* **private**: visibile solo da istanze della stessa classe
* **public**: visibile da istanze di qualsiasi classe all'interno del package
  * anche da istanze all'esterno del package SE la classe è public
* **package** VALORE DI DEFAULT: visibile da istanze di qualsiasi classe, all'interno del package

---

### Classi all'interno di un package

* public: elementi (attributi metodi) public della classe sono visibili anche fuori dal package 
* package (VALORE DI DEFAULT): elementi (attributi metodi) public della classe sono visibili solo all'interno del package



## Java packages

[list of packages Java 13](https://docs.oracle.com/en/java/javase/13/docs/api/allpackages-index.html)

```markdown
| Package                          | Description                                                                                                                                        |
|----------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------|
| java.io                          | Provides for system input and output through data streams, serialization and the file system.                                                      |
| java.lang                        | Provides classes that are fundamental to the design of the Java programming language.                                                              |
| java.lang.annotation             | Provides library support for the Java programming language annotation facility.                                                                    |
| java.lang.constant               | Classes and interfaces to represent nominal descriptors for run-time entities such as classes or method handles, and classfile entities such as constant pool entries or invokedynamic call sites. |
| java.lang.foreign                | Provides low-level access to memory and functions outside the Java runtime.                                                                       |
| java.lang.invoke                 | The java.lang.invoke package provides low-level primitives for interacting with the Java Virtual Machine.                                          |
| java.lang.module                 | Classes to support module descriptors and creating configurations of modules by means of resolution and service binding.                          |
| java.lang.ref                    | Provides reference-object classes, which support a limited degree of interaction with the garbage collector.                                        |
| java.lang.reflect                | Provides classes and interfaces for obtaining reflective information about classes and objects.                                                   |
| java.lang.runtime                | The java.lang.runtime package provides low-level runtime support for the Java language.                                                           |
| java.math                        | Provides classes for performing arbitrary-precision integer arithmetic (BigInteger) and arbitrary-precision decimal arithmetic (BigDecimal).       |
| java.net                         | Provides the classes for implementing networking applications.                                                                                    |
| java.net.spi                     | Service-provider classes for the java.net package.                                                                                                |
| java.nio                         | Defines buffers, which are containers for data, and provides an overview of the other NIO packages.                                                |
| java.nio.channels                | Defines channels, which represent connections to entities that are capable of performing I/O operations, such as files and sockets; defines selectors, for multiplexed, non-blocking I/O operations. |
| java.nio.channels.spi            | Service-provider classes for the java.nio.channels package.                                                                                       |
| java.nio.charset                 | Defines charsets, decoders, and encoders, for translating between bytes and Unicode characters.                                                   |
| java.nio.charset.spi             | Service-provider classes for the java.nio.charset package.                                                                                        |
| java.nio.file                    | Defines interfaces and classes for the Java virtual machine to access files, file attributes, and file systems.                                    |
| java.nio.file.attribute          | Interfaces and classes providing access to file and file system attributes.                                                                       |
| java.nio.file.spi                | Service-provider classes for the java.nio.file package.                                                                                           |
| java.security                    | Provides the classes and interfaces for the security framework.                                                                                   |
| java.security.cert               | Provides classes and interfaces for parsing and managing certificates, certificate revocation lists (CRLs), and certification paths.               |
| java.security.interfaces         | Provides interfaces for generating RSA (Rivest, Shamir and Adleman AsymmetricCipher algorithm) keys as defined in the RSA Laboratory Technical Note PKCS#1, and DSA (Digital Signature Algorithm) keys as defined in NIST's FIPS-186. |
| java.security.spec               | Provides classes and interfaces for key specifications and algorithm parameter specifications.                                                    |
| java.text                        | Provides classes and interfaces for handling text, dates, numbers, and messages in a manner independent of natural languages.                      |
| java.text.spi                    | Service provider classes for the classes in the java.text package.                                                                                |
| java.time                        | The main API for dates, times, instants, and durations.                                                                                           |
| java.time.chrono                 | Generic API for calendar systems other than the default ISO.                                                                                      |
| java.time.format                 | Provides classes to print and parse dates and times.                                                                                              |
| java.time.temporal               | Access to date and time using fields and units, and date time adjusters.                                                                          |
| java.time.zone                   | Support for time-zones and their rules.                                                                                                           |
| java.util                        | Contains the collections framework, some internationalization support classes, a service loader, properties, random number generation, string parsing and scanning classes, base64 encoding and decoding, a bit array, and several miscellaneous utility classes. |
| java.util.concurrent             | Utility classes commonly useful in concurrent programming.                                                                                        |
| java.util.concurrent.atomic      | A small toolkit of classes that support lock-free thread-safe programming on single variables.                                                    |
| java.util.concurrent.locks       | Interfaces and classes providing a framework for locking and waiting for conditions that is distinct from built-in synchronization and monitors.   |
| java.util.function               | Functional interfaces provide target types for lambda expressions and method references.                                                         |
| java.util.jar                    | Provides classes for reading and writing the JAR (Java ARchive) file format, which is based on the standard ZIP file format with an optional manifest file. |
| java.util.random                 | This package contains classes and interfaces that support a generic API for random number generation.                                             |
| java.util.regex                  | Classes for matching character sequences against patterns specified by regular expressions.                                                       |
| java.util.spi                    | Service provider classes for the classes in the java.util package.                                                                               |
| java.util.stream                 | Classes to support functional-style operations on streams of elements, such as map-reduce transformations on collections.                        |
| java.util.zip                    | Provides classes for reading and writing the standard ZIP and GZIP file formats.                                                                 |
| javax.crypto                     | Provides the classes and interfaces for cryptographic operations.                                                                                 |
| javax.crypto.interfaces          | Provides interfaces for Diffie-Hellman keys as defined in RSA Laboratories' PKCS #3.                                                             |
| javax.crypto.spec                | Provides classes and interfaces for key specifications and algorithm parameter specifications.                                                   |
| javax.net                        | Provides classes for networking applications.                                                                                                    |
| javax.net.ssl                    | Provides classes for the secure socket package.                                                                                                  |
| javax.security.auth              | This package provides a framework for authentication and authorization.                                                                         |
| javax.security.auth.callback     | This package provides the classes necessary for services to interact with applications in order to retrieve information (authentication data including usernames or passwords, for example) or to display information (error and warning messages, for example). |
| javax.security.auth.login        | This package provides a pluggable authentication framework.                                                                                      |
| javax.security.auth.spi          | This package provides the interface to be used for implementing pluggable authentication modules.                                               |
| javax.security.auth.x500         | This package contains the classes that should be used to store X500 Principal and X500 Private Credentials in a Subject.                        |
| javax.security.cert              | Provides classes for public key certificates.                                                                                                    |
```