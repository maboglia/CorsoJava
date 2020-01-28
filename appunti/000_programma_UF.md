# Corso Tecnico Sviluppo Software

* [programma completo](https://github.com/maboglia/CorsoJava/blob/master/appunti/000_programma_Java.md)
* [schema argomenti](https://github.com/maboglia/CorsoJava/blob/master/appunti/000_schema.md)


## Lab 1 

* [Fondamenti di programmazione](https://github.com/maboglia/Fondamenti) 
* **Algoritmi** e strutture dati 
* Java: le basi del linguaggio 
* struttura del **JDK**
* **OOP** teoria, definizione
* **variabile**: definizione
* Primo approccio al codice
* metodo main e metodi ausiliari

# 3. Argomenti dell'esame (Programmatore Java SE 11 I - 1Z0-815)


---

## 3.1. Comprensione della tecnologia e dell'ambiente Java

* Descrivere la tecnologia Java e l'ambiente di sviluppo Java
* Identificare le funzionalità chiave del linguaggio Java



## 3.2. Creazione di un programma Java semplice

* Crea un programma Java eseguibile con una classe main
* Compilare ed eseguire un programma Java dalla riga di comando
* Creare e importare pacchetti

---

## Lab 2 


 
## 3.3. Lavorare con tipi di dati primitivi Java e API String

* Dichiarare e inizializzare le variabili (incluso il casting e la promozione di tipi di dati primitivi)
* Identificare l'ambito della variabile
* Usa l'inferenza del tipo di variabile locale
* Crea e manipola stringhe
* Manipola i dati usando la classe StringBuilder e i suoi metodi



__LE VARIABILI IN JAVA__ 
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

## La classe Math

* uso di una classe con metodi statici
* accedere a proprietà e metodi senza istanziare nuovi oggetti 

## Classi istanziabili

* tipo di utilizzo classe
  * creo oggetto, 
  * attraverso l'oggetto, con l'opertore dot (.) accedo ai suoi metodi e variabili 
* relazioni tra classi: uso, aggregazione, teoria delle classi 


---

## Lab 3 


## 3.4. Utilizzo di operatori e costrutti decisionali
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

## Lab 4 

**IDENTIFICATORI E TIPI DI DATO** 

* Schema Libero
* Case sensitive 
* Commenti
* Regole per gli identificatori 

---


## 3.5. Lavorare con Java Arrays
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


## Lab 5 


## 3.6. Descrivere e usare oggetti e classi
* Dichiarare e creare istanze di oggetti Java e spiegare i cicli di vita degli oggetti (inclusa la creazione, la dereferenziazione mediante riassegnazione e la garbage collection)
* Definire la struttura di una classe Java
* Leggi o scrivi nei campi oggetto


## 3.7. Creazione e utilizzo di metodi

* Creare metodi e costruttori con argomenti e valori di ritorno
* Creare e invocare metodi sovraccarichi
* Applica la parola chiave statica a metodi e campi


## 3.8. Applicazione dell'incapsulamento
* Applica modificatori di accesso
* Applicare i principi di incapsulamento a una classe



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



## Lab 6 

**Ereditarietà in Java**

* Teoria:
  * Class design: diversi ruoli degli oggetti/attori del progetto
  * diverse classi con differenti relazioni tra esse
  * @override toString() (solo in caso di extends)


---


## Lab 7 


## 3.9. Riutilizzo delle implementazioni tramite ereditarietà

* Creare e utilizzare sottoclassi e superclassi
* Creare ed estendere le classi astratte
* Abilita il polimorfismo con metodi prioritari
* Utilizza il polimorfismo per lanciare e chiamare metodi, differenziando il tipo di oggetto rispetto al tipo di riferimento
* Distingua il sovraccarico, l'override e il nascondimento



## aggregazione
![Esempio Aggregazione](../images/image010.jpg)

* OOP design, ereditarietà
* Ereditarietà in Java


---


## Lab 8 

* proviamo un altro IDE tra IntelliJIdea, NetBeans, Eclipse

### Eccezioni


# 3.11. Gestione dell'eccezione

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

			
## Lab 9 

**Advanced OOP design**


## 3.10. Programmazione astratta attraverso le interfacce

* Creare e implementare interfacce
* Distingua l'ereditarietà delle classi dall'ereditarietà dell'interfaccia comprese le classi astratte
* Dichiarare e utilizzare le istanze List e ArrayList
* Comprensione dell'espressione lambda


* [interfacce](015_interfacce.md)
	

---


## Lab 10 


* gestire le collezioni: List, Set e Map 
* la classe Collections
* Vector, ArrayList 
* HashSet, TreeSet

* [focus date, valute](022_API_Java_date_time.md)


---


## Lab 11


## 3.12. Comprensione dei moduli

* Descrivi il JDK modulare
* Dichiarare i moduli e abilitare l'accesso tra i moduli
* Descrivi come viene compilato ed eseguito un progetto modulare
 

---


## Lab 12

* [introduzione JSP](058_JSP_1.md)
*	Hello World JSP 
*	GlassFish e TomCat


---


## Lab 13

### Elementi Sintassi JAVA

* Java Advanced: enumerazioni
* Java Advanced: inizializzatore statico
* Creare Jar eseguibili, creare e includere Jar nel progetto 

* Verifica OCA Java - 2: statements e costrutti del linguaggio

### Elementi Sintassi JAVA

* Java advanced: 
  * nested classes, 
  * member classes, 
  * anonymous inner classes
* Reflection, Class, Constructor classes
		

---


## Lab 14

### Elementi Sintassi JAVA


* design patterns
  * singleton
	* decorator
	* mvc
	* dao


---

## Lab 15


### JAVA WEB

* [approfondimento JSP](059_JSP_2.md)
* [JSP: le direttive]
* [JSP: le direttive]
* [JSP: le espressioni]
* [JSP: le dichiarazioni]


---


## Lab 16

* JSP e Servlet
* JSTL: Jsp standard action
* Servlet REST controller: doGet, doPost
* RequestDispatcher

---


## Lab 17

* Java RESTful services
* JAX-RS

---


## Lab 18

* JAXB

---


## Lab 19

* JDBC
  * connector-j
  * Connection
  * DriverManager
  * Statement, PreparedStatement
  * ResulSet
  * executeQuery
  * executeUpdate

---


## Lab 20

### Elementi Sintassi JAVA
* pattern
  * singleton	
  * [decorator](034_decorator_pattern.md)

---

## Lab 21

### Elementi Sintassi JAVA
* Java NIO
* MVC + Database
	
---

## Lab 22 Spring

* Introduzione al framework
* Spring Boot, MVC
* IOC - Inversion Of Control
* DI - Dependency Injection

