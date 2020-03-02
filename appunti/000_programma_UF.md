# 1. Corso Tecnico Sviluppo Software 
(Programmatore Java SE 11 I - 1Z0-815)

## 1.1. Schema Unità Formative

![schema UF](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/2020_UF_Java.jpg)

---



## 1.2. [Fondamenti di programmazione](https://github.com/maboglia/Fondamenti) 
  * **Algoritmi** e strutture dati 
  * Java: le basi del linguaggio 
  * struttura del **JDK**
  * **OOP** teoria, definizione
  * **variabile**: definizione
  * Primo approccio al codice
  * metodo main e metodi ausiliari

---


### 1.2.1. Comprensione della tecnologia e dell'ambiente Java

* Descrivere la tecnologia Java e l'ambiente di sviluppo Java
* Identificare le funzionalità chiave del linguaggio Java



### 1.2.2. Creazione di un programma Java semplice

* Crea un programma Java eseguibile con una classe main
* Compilare ed eseguire un programma Java dalla riga di comando
* Creare e importare pacchetti

---
 
### 1.2.3. Lavorare con tipi di dati primitivi Java e API String

* Dichiarare e inizializzare le variabili (incluso il casting e la promozione di tipi di dati primitivi)
* Identificare l'ambito della variabile
* Usa l'inferenza del tipo di variabile locale
* Crea e manipola stringhe
* Manipola i dati usando la classe StringBuilder e i suoi metodi


 
### 1.2.4. _LE VARIABILI IN JAVA__ 

* Dichiarazione di una variabile: 
* Variabili d'istanza
* Variabili locali
* Parametri formali 
* argomenti passati al metodo main 
* Package introduzione
* Consultazione Oracle API docs

__TIPI DI DATI PRIMITIVI__ 
* Tipi di dati interi, casting e promotion 
* Tipi di dati a virgola mobile, casting e promotion 
* Tipo di dato logico - booleano 
* Tipo di dato primitivo letterale


---

__OPERATORI DI BASE__ 

* Operatore d'assegnazione 
* Operatori aritmetici 
* Operatori (unari) di pre e post-incremento (e decremento) 
* Operatori relazionali o di confronto 
* Concatenare le stringhe


---



### 1.2.5. Utilizzo di operatori e costrutti decisionali
* Utilizzare gli operatori Java incluso l'uso della parentesi per sovrascrivere la precedenza dell'operatore
* Utilizzare le istruzioni di controllo Java incluso if, else e switch
* Crea e usa do / while, while, per e per ogni loop, inclusi i loop nidificati, usa le istruzioni break e continue



**INTRODUZIONE ALLA LIBRERIA STANDARD** 

* Il comando import
* La classe String
* La documentazione della libreria standard di Java

**OPERATORI E GESTIONE DEL FLUSSO DI ESECUZIONE** 

* GESTIONE DEL FLUSSO DI ESECUZIONE 
	* Il costrutto if 
	* Il costrutto switch
	* Il costrutto for 
	* Il costrutto while 
	* Il costrutto do...while
	* Il ciclo for migliorato (foreach) 

---


**IDENTIFICATORI E TIPI DI DATO** 

* Schema Libero
* Case sensitive 
* Commenti
* Regole per gli identificatori 

---


### 1.2.6. Lavorare con Java Arrays
* Dichiarare, istanziare, inizializzare e utilizzare un array monodimensionale
* Dichiarare, creare un'istanza, inizializzare e utilizzare un array bidimensionale
  

**ARRAY** 

* Gli array in Java 
  * Dichiarazione 
  * Creazione 
  * Inizializzazione
* Array (vettori semplici, monodimensionali) 
* Array Multidimensionali 
* Limiti degli array in JAVA: dimensione prefissata


---




### 1.2.7. Descrivere e usare oggetti e classi
* Dichiarare e creare istanze di oggetti Java e spiegare i cicli di vita degli oggetti (inclusa la creazione, la dereferenziazione mediante riassegnazione e la garbage collection)
* Definire la struttura di una classe Java
* Leggi o scrivi nei campi oggetto


### 1.2.8. Creazione e utilizzo di metodi

* Creare metodi e costruttori con argomenti e valori di ritorno
* Creare e invocare metodi sovraccarichi
* Applica la parola chiave statica a metodi e campi


### 1.2.9. Applicazione dell'incapsulamento
* Applica modificatori di accesso
* Applicare i principi di incapsulamento a una classe

---

## 1.3. La classe Math

* uso di una classe con metodi statici
* accedere a proprietà e metodi senza istanziare nuovi oggetti 

## 1.4. Classi istanziabili

* tipo di utilizzo classe
  * creo oggetto, 
  * attraverso l'oggetto, con l'opertore dot (.) accedo ai suoi metodi e variabili 
* relazioni tra classi: uso, aggregazione, teoria delle classi 



**tipi complessi** 

*	Introduzione classi
  * classi, 
  * struttura delle classi, 
  * progettazione delle classi in UML, 
  * stato interno, 
  * metodi costruttori, overloading
  * metodi getter e setter
  * incapsulamento


**I METODI COSTRUTTORI** 

* Caratteristiche di un costruttore
* Costruttore di default
  * overload dei costruttori 
* Package e visibilità




**Ereditarietà in Java**

* Teoria:
  * Class design: diversi ruoli degli oggetti/attori del progetto
  * diverse classi con differenti relazioni tra esse
  * @override toString() (solo in caso di extends)

---

### 1.4.1. Riutilizzo delle implementazioni tramite ereditarietà

* Creare e utilizzare sottoclassi e superclassi
* Creare ed estendere le classi astratte
* Abilita il polimorfismo con metodi prioritari
* Utilizza il polimorfismo per lanciare e chiamare metodi, differenziando il tipo di oggetto rispetto al tipo di riferimento
* Distingua il sovraccarico, l'override e il nascondimento

---

## 1.5. aggregazione
![Esempio Aggregazione](../images/image010.jpg)

* OOP design, ereditarietà
* Ereditarietà in Java
* proviamo un altro IDE tra IntelliJIdea, NetBeans, Eclipse

---

### 1.5.1. Eccezioni

# 2. Gestione dell'eccezione

* Descrivere i vantaggi della gestione delle eccezioni e differenziare tra eccezioni verificate, non selezionate ed errori
* Creare blocchi try-catch e determinare in che modo le eccezioni alterano il flusso del programma
* Crea e invoca un metodo che genera un'eccezione


__Java è robusto e sicuro, al limite si 'pianta' il programma__

* usare la gestione eccezioni di JAVA
* gestione delle eccezioni
* blocco try-catch-finally
* le parole chiave throws e throw
* [eccezioni](017_eccezioni.md)



---

			

**Advanced OOP design**


* gestire le collezioni: List, Set e Map 
* la classe Collections
* Vector, ArrayList 
* HashSet, TreeSet

* [focus date, valute](022_API_Java_date_time.md)


---

---




### 2.0.2. Programmazione astratta attraverso le interfacce

* Creare e implementare interfacce
* Distingua l'ereditarietà delle classi dall'ereditarietà dell'interfaccia comprese le classi astratte
* Dichiarare e utilizzare le istanze List e ArrayList
* Comprensione dell'espressione lambda


* [interfacce](015_interfacce.md)
	




### 2.0.3. Elementi Sintassi JAVA

* Java Advanced: enumerazioni
* Java Advanced: inizializzatore statico
* Creare Jar eseguibili, creare e includere Jar nel progetto 
* Java advanced: 
  * nested classes, 
  * member classes, 
  * anonymous inner classes
* Reflection, Class, Constructor classes
		

### 2.0.4. Comprensione dei moduli

* Descrivi il JDK modulare
* Dichiarare i moduli e abilitare l'accesso tra i moduli
* Descrivi come viene compilato ed eseguito un progetto modulare
 

---




### 2.0.5. Elementi Sintassi JAVA


* design patterns
  * singleton
	* decorator
	* mvc
	* dao
	* factory

### 2.0.6. JAVA WEB

* [introduzione JSP](058_JSP_1.md)
* [approfondimento JSP](059_JSP_2.md)
* JSP e Servlet
* [JSP: le direttive]
* [JSP: le direttive]
* [JSP: le espressioni]
* [JSP: le dichiarazioni]
*	GlassFish e TomCat
* JSTL: Jsp standard action
* Servlet REST controller: doGet, doPost
* RequestDispatcher


---


## 2.1. JDBC

* JDBC
  * connector-J
  * Connection
  * DriverManager
  * Statement, PreparedStatement
  * ResulSet
  * executeQuery()
  * executeUpdate()

---


## 2.2. Input/output

### 2.2.1. Elementi Sintassi JAVA
* Java NIO
* MVC + Database
* Java RESTful services
* JAX-RS
* JAXB

---


## 2.3.  

* Introduzione al framework
* Spring Boot, MVC
* IOC - Inversion Of Control
* DI - Dependency Injection

---

### 2.3.1. Java SE 11 Programmer II - 1Z0-816

### 2.3.2. Fondamenti di Java
* Creare e utilizzare le classi final
* Creare e utilizzare classi interne, nidificate e anonime
* Creare e utilizzare le enumerazioni

---

### 2.3.3. Gestione delle eccezioni e asserzioni
* Usa il costrutto try-with-resources
* Creare e utilizzare classi di eccezione personalizzate
* Metti alla prova gli invarianti usando le asserzioni

---

### 2.3.4. Interfacce Java
* Creare e utilizzare interfacce con metodi predefiniti (default)
* Creare e utilizzare interfacce con metodi privati

---

### 2.3.5. Generici e Collezioni

* Utilizzare le classi wrapper, il boxing automatico e l'unboxing automatico
* Creare e utilizzare classi generiche, metodi con notazione a diamante e caratteri jolly
* Descrivi il Framework di raccolta e usa le interfacce di raccolta chiavi
* Usa Comparator e interfacce comparabili
* Creare e utilizzare metodi di praticità per le raccolte

---

### 2.3.6. Interfaccia funzionale ed espressioni lambda

* Definire e scrivere interfacce funzionali
* Crea e usa espressioni lambda tra cui istruzione lambdas, variabile locale per i parametri lambda

---

### 2.3.7. API Java Stream

* Descrivere l'interfaccia Stream e le pipeline
* Usa espressioni lambda e riferimenti a metodi

---

### 2.3.8. Interfacce funzionali integrate

* Utilizzare le interfacce dal pacchetto java.util.function
* Utilizzare le interfacce funzionali di base tra cui Predicato, Consumatore, Funzione e Fornitore
* Usa le variazioni primitive e binarie delle interfacce di base del pacchetto java.util.function

---

### 2.3.9. Operazioni Lambda in streaming

* Estrai i dati del flusso usando i metodi map, peek e flatMap
* Cerca i dati dello stream utilizzando i metodi di ricerca findFirst, findAny, anyMatch, allMatch e noneMatch
* Usa la classe opzionale
* Eseguire calcoli utilizzando le operazioni di conteggio, max, min, media e somma del flusso
* Ordina una raccolta usando le espressioni lambda
* Utilizzare i raccoglitori con stream, incluse le operazioni groupingBy e partitioningBy

---

### 2.3.10. Migrazione ad un'applicazione modulare

* Migrare l'applicazione sviluppata utilizzando una versione Java precedente a SE 9 a SE 11 inclusa la migrazione top-down e bottom-up, suddividendo un'applicazione Java SE 8 in moduli per la migrazione
* Esegui un'applicazione modulaized su classpath e su modulepath
* Utilizzare jdeps per determinare le dipendenze e identificare il modo per affrontare le dipendenze cicliche

---

### 2.3.11. Servizi in un'applicazione modulare
* Descrivere i componenti dei servizi, comprese le direttive
* Progetta un tipo di servizio,
* carica i servizi utilizzando ServiceLoader,
* verificare le dipendenze dei servizi inclusi i moduli consumer e provider

---

### 2.3.12. Concorrenza
* Creare thread di lavoro utilizzando Runnable, Callable e utilizzare un ExecutorService per eseguire contemporaneamente attività
* Usa java util raccolte e classi simultanee tra cui CyclicBarrier e CopyOnWriteArrayList
* Scrivi codici thread-safe
* Identificare i problemi di threading come deadlock e livelock

---

### 2.3.13. Flusso parallelo
* Sviluppa il codice che utilizza il flusso parallelo
* Implementa decomposizione e riduzione con stream


---

### 2.3.14. I / O (Fundamentals e NIO2)
* Leggi i dati e scrivi i dati della console e dei file utilizzando il flusso I / O
* Utilizzare I / O Stream per leggere e scrivere file
* Leggere e scrivere oggetti utilizzando la serializzazione
* Utilizzare l'interfaccia Path per operare su percorsi di file e directory
* Utilizzare la classe Files per controllare, eliminare, copiare o spostare un file o una directory
* Usa l'API Stream con i file

---

### 2.3.15. Codifica sicura nell'applicazione Java SE
* Prevenzione della negazione del servizio nelle applicazioni Java
* Protezione delle informazioni riservate nell'applicazione Java
* Implementazione delle linee guida per l'integrità dei dati - iniezioni e convalida dell'inclusione e dell'input
* Prevenire l'attacco esterno del codice limitando l'accessibilità e l'estensibilità, gestendo correttamente la convalida dell'input e la mutabilità
* Protezione della costruzione di oggetti sensibili
* Protezione della serializzazione e della deserializzazione

---

### 2.3.16. Applicazioni di database con JDBC
* Collegati ai database utilizzando gli URL JDBC e DriverManager
* Utilizzare PreparedStatement per eseguire operazioni CRUD
* Utilizzare le API PreparedStatement e CallableStatement per eseguire operazioni sul database

---

### 2.3.17. Localizzazione
* Usa la classe Locale
* Usa pacchetti di risorse
* Formatta messaggi, date e numeri con Java


---

### 2.3.18. annotazioni
* Descrivere lo scopo delle annotazioni e dei tipici schemi di utilizzo
* Applica annotazioni a classi e metodi
* Descrivi le annotazioni di uso comune nel JDK
* Dichiara annotazioni personalizzate