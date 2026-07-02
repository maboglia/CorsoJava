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
```---
# String e StringBuilder

* le classi String e StringBuilder del package java.lang
* La classe String ha lo scopo di rappresentare stringhe (sequenze) di caratteri che non devono essere modificate dopo essere state costruite(oggetti immutabili)
* La classe StringBuilder ha lo scopo di rappresentare stringhe (sequenze) di caratteri che possono essere modificate dopo essere state costruite 

---

## Definizione di variabili

* tipo nome; oppure
* tipo nome1,..., nomeN ;
* String nome;
* StringBuilder risultato;
* Dopo la definizione esiste solo il riferimento, non un oggetto di tipo nome, null, String !

---

## null

* Il valore speciale null è il valore iniziale di default per qualunque variabile di tipo strutturato.
* indica che il riferimento è nullo e non c'e' nessun oggetto riferito
* nome non è un oggetto di tipo String è solo un riferimento utilizzabile per accedere ad un oggetto String

---

## Operatore new

* L'operatore new NomeClasse crea un nuovo oggetto con le proprietà definite in NomeClasse (istanza dellaclasse) e ritorna il riferimento ad esso
* L'operatore new dà luogo all’invocazione di un metodo costruttore passandogli gli argomenti necessari
* Il costruttore invocato deve essere di una classe uguale o "compatibile" con la definizione della variabile
* Ogni classe può avere più costruttori che si differenziano per la lista degli argomenti

---

## Costruttori

* La scelta del costruttore da invocare avviene tramite gli argomenti attuali che vengono passati

* New di un oggetto String
```java
String saluto;
saluto = new String("Ciao ciao");
```
* L'operatore new può essere usato al momento della definizione
```java
String saluto = new String("Ciao ciao");
```
* Solo per la classe String , in quanto di uso molto comune, Java offre la forma compatta
```java
String s = "Ciao ciao";
```

---

## Una particolarità di String

* Usare esplicitamente new oppure la forma abbreviata per inizializzare un oggetto String non è esattamente la stessa cosa 
* Se si usa esplicitamente new, la Java Virtual Machine crea oggetti distinti anche se di contenuto uguale 
* Se non si usa esplicitamente new, la Java Virtual Machine evita di creare oggetti distinti ma dal contenuto uguale

---

I più importanti metodi di cui sono dotati gli oggetti di tipo String.
--------------------------------------------------------------------------------------
Tipo restituito|Metodi e parametri|Descrizione
---|----|---
int|charAt(int i)|Restituisce il carattere alla posizione i.
boolean|endsWith(String s)	|Restituisce true se l'oggetto di invocazione termina con la sottostringa s.
boolean|equals(String s)	|Restituisce true quando l'oggetto di invocazione e s rappresentano la medesima sequenza.
int|indexOf(char c)	|Restituisce la prima posizione del carattere c, oppure -1 nel caso tale carattere non faccia parte della stringa.
int|indexOf(char c, int i)	|Come il precedente, con la differenza che la ricerca del carattere c comincia dalla posizione i.
int|indexOf(String s)	|Restituisce la prima posizione della sottostringa s, oppure -1 nel caso tale sottostringa non compaia nell'oggetto di invocazione.
int|indexOf(String s, int i)	|Come il precedente, con la differenza che la ricerca della sottostringa s prende piede dalla posizione i.
int|length()	|Restituisce la lunghezza della stringa.
String|replace(char c1, char c2)	|Restituisce una nuova stringa, ottenuta dall'oggetto di invocazione sostituendo il carattere c2 ad ogni occorrenza del carattere c1.
boolean|starsWith(String s)	|Restituisce true se l'oggetto di invocazione inizia con la sottostringa s.
String|toLowerCase()	|Restituisce una nuova stringa, ottenuta traslando verso il minuscolo ogni carattere dell'oggetto di invocazione.
String|toUpperCase()	|Restituisce una nuova stringa, ottenuta traslando verso il maiuscolo ogni carattere dell'oggetto di invocazione.
String|trim()	|Restituisce una nuova stringa, ottenuta dall'oggetto di invocazione eliminando gli spazi che precedono il primo carattere significativo e quelli che seguono l'ultimo. In pratica, " ciao ".trim() restituisce "ciao".

---

* Le stringhe in Java sono oggetti. 
* La particolarità di questa classe è quella di essere l’unica classe che è possibile istanziare come se fosse un tipo di dato primitivo.

	
```java
int compareTo(String other)
```

Esegue una comparazione lessicale. Ritorna un intero:

* `< 0` se la stringa corrente è minore della stringa other
* `= 0` se le due stringhe sono identiche
* `> 0` se la stringa corrente è maggiore di other

---

```java
int indexOf(int ch)
```
Restituisce l’indice del carattere specificato

```java
int lastIndexOf(int ch)
```
E’ come indexOf() ma viene restituito l’indice dell’ultima occorrenza trovata

```java
int length()
```
Restituisce il numero di caratteri di cui è costituita la stringa corrente

```java
String replace(char oldChar, char newChar)
```
Restituisce una nuova stringa, dove tutte le occorrenze di oldChar sono rimpiazzate con newChar

---

```java
String substring(int startIndex)
```
Restituisce una sottostringa della stringa corrente, composta dai caratteri che partono dall’indice startIndex alla fine

```java
String substring(int startIndex, int number)
```
Restituisce una sottostringa della stringa corrente, composta dal numero number di caratteri che partono dall’indice startIndex

```java
String toLowerCase()
```
Restituisce una nuova stringa equivalente a quella corrente ma con tutti i caratteri minuscoli

```java
String toUpperCase()
```
Restituisce una nuova stringa equivalente a quella corrente ma con tutti i caratteri maiuscoli
---
# Classi wrapper:


* Nella versione 1.5 di Java è stata introdotta una funzionalità davvero comoda che viene chiamata boxing (inscatolamento) che permette ai valori dei tipi primitivi di essere convertiti in oggetti, e viceversa. In particolare:
* l’autoboxing è un casting automatico che permette ai valori dei tipi primitivi di essere convertiti in oggetti
* l’unboxing effettua il casting inverso
* Gli oggetti che rappresentano i tipi primitivi sono detti classi wrapper (in italiano "involucro") che sono classi che fanno da contenitore a un tipo di dato primitivo, astraendo proprio il concetto di tipo. 
__N.B. Tutte le classi wrapper sono classi final per cui non possono essere estese.__

---

## Classi "Wrapper" per tipi Primitivi

* Se si vogliono trattare anche i dati primitivi come oggetti si possono utilizzare le classi "wrapper"
* Un oggetto di una classe "wrapper" incorpora un dato primitivo e fornisce metodi per operare su di esso
* Le classi wrapper dei tipi primitivi sono definite nel package java.lang

---

### Corrispondenza

| Tipo Primitivo | ClasseWrapper |
| -------------- | ------------- |
| boolean        | Boolean       |
| char           | Character     |
| byte           | Byte          |
| short          | Short         |
| int            | Integer       |
| long           | Long          |
| float          | Float         |
| double         | Double        |
| void           | Void          |

---


* In Java, ogni tipo primitivo possiede una corrispondente classe wrapper: Byte, Short, Integer, Long, Float, Double, Boolean, Character. 
* Ciascuna di queste classi permette di manipolare i valori di tipo primitivo come se fossero valori di oggetti. 
* Spesso abbiamo a che fare con tipi primitivi (int, double, boolean, …) che sono tipi semplici e, quindi, non possiedono metodi. 
* I wrapper, invece, essendo degli oggetti, sono dotati di metodi ed attributi.
* Prima dell’introduzione dell’autoboxing, programmando in Java ci si poteva trovare nella necessità di convertire un tipo primitivo nella sua corrispondente classe wrapper.

---

```java
Integer x = new Integer(10);
Double y = new Double(5.5f);
Boolean z = Boolean.parseBoolean("true");
````

Occorreva prima creare un nuovo oggetto di una classe wrapper.

---


Le stesse operazioni precedenti possono essere ora eseguite mediante il seguente codice.

```java

Integer x = 10;
Double y = 5.5f;
Boolean z = true;
```
L’autoboxing permette al developer di non preoccuparsi delle operazioni di conversione.
Da notare che è grazie all’autoboxing che possiamo inserire i tipi primitivi all’interno delle Collection in maniera totalmente trasparente e senza preoccuparci di convertire i dati.


---

Classi wrapper|tipo primitivo
---|---
Boolean | è la classe wrapper per il tipo boolean.
Byte | è la classe wrapper per il tipo byte.
Character | è la classe wrapper per il tipo char.
Double | è la classe wrapper per il tipo double.
Float | è la classe wrapper per il tipo float.
Integer | è la classe wrapper per il tipo int.
Long | è la classe wrapper per il tipo long.
Short | è la classe wrapper per il tipo short.


---

## Metodi statici della famiglia parse:

* `Byte.parseByte(String s)`
* `Double.parseDouble(String s)`
* `Float.parseFloat(String s)`
* `Integer.parseInt(String s)`
* `Long.parseLong(String s)`
* `Short.parseShort(String s`)

---


## Classe Character

La classe wrapper Character si trova in java.lang

Include metodi statici per verificare le proprietà di un carattere

---

### Esempio
```
String s = "Stringa Generica."
char c = s.charAt (0);
... Character.isUpperCase(c) ... // true
... Character.isDigit(c) ...
// false
...
```

---

### Predicati vari

* `boolean isLetter (char c)`
* `boolean isDigit (char c)`
* `boolean isLetterOrDigit (char c)`
* `boolean isSpaceChar (char c)`
* `boolean isLowerCase (char c)`
* `boolean isUpperCase (char c)`

---

### Trasformazioni varie

* `char toUpperCase (char c)`
* `char toLowerCase (char c)`---
# Math: la matematica

La classe `Math` in Java è una classe utilitaria che fornisce metodi statici per operazioni matematiche comuni come il calcolo di radici quadrate, esponenziali, logaritmi, trigonometria, e altro. Non è possibile creare un'istanza di `Math`, poiché tutti i suoi metodi sono statici e non richiedono un oggetto per essere invocati.

---

### Principali Metodi della Classe `Math`

Ecco alcuni dei metodi più utilizzati della classe `Math`:

---

#### 1. **Funzioni esponenziali e logaritmi**

- **`Math.pow(double base, double exponent)`**:
  Restituisce il risultato della base elevata all'esponente, cioè `base^exponent`.

  ```java
  double result = Math.pow(2, 3);  // 8.0
  ```

- **`Math.exp(double a)`**:
  Restituisce `e^a`, dove `e` è la costante di Eulero (circa 2.71828).

  ```java
  double result = Math.exp(1);  // 2.718281828459045
  ```

- **`Math.log(double a)`**:
  Restituisce il logaritmo naturale (base `e`) di un numero.

  ```java
  double result = Math.log(10);  // 2.302585092994046
  ```

- **`Math.log10(double a)`**:
  Restituisce il logaritmo in base 10 di un numero.

  ```java
  double result = Math.log10(100);  // 2.0
  ```

---

#### 2. **Funzioni trigonometriche**

- **`Math.sin(double a)`**:
  Restituisce il seno dell'angolo in radianti.

  ```java
  double result = Math.sin(Math.PI / 2);  // 1.0
  ```

- **`Math.cos(double a)`**:
  Restituisce il coseno dell'angolo in radianti.

  ```java
  double result = Math.cos(Math.PI);  // -1.0
  ```

- **`Math.tan(double a)`**:
  Restituisce la tangente dell'angolo in radianti.

  ```java
  double result = Math.tan(Math.PI / 4);  // 1.0
  ```

- **`Math.toRadians(double angolo)`**:
  Converte un angolo in gradi in radianti.

  ```java
  double radians = Math.toRadians(90);  // 1.5708 (radianti)
  ```

- **`Math.toDegrees(double angolo)`**:
  Converte un angolo in radianti in gradi.

  ```java
  double degrees = Math.toDegrees(Math.PI / 2);  // 90.0
  ```

---

#### 3. **Funzioni per radici e arrotondamenti**

- **`Math.sqrt(double a)`**:
  Restituisce la radice quadrata di un numero positivo.

  ```java
  double result = Math.sqrt(16);  // 4.0
  ```

- **`Math.cbrt(double a)`**:
  Restituisce la radice cubica di un numero.

  ```java
  double result = Math.cbrt(27);  // 3.0
  ```

- **`Math.round(double a)`**:
  Restituisce il valore dell'argomento arrotondato al valore intero più vicino. Restituisce un `long`.

  ```java
  long rounded = Math.round(2.5);  // 3
  ```

- **`Math.ceil(double a)`**:
  Restituisce il più piccolo intero maggiore o uguale a `a`.

  ```java
  double result = Math.ceil(2.3);  // 3.0
  ```

- **`Math.floor(double a)`**:
  Restituisce il più grande intero minore o uguale a `a`.

  ```java
  double result = Math.floor(2.7);  // 2.0
  ```

- **`Math.abs(double a)`**:
  Restituisce il valore assoluto del numero.

  ```java
  double result = Math.abs(-5.0);  // 5.0
  ```

---

#### 4. **Funzioni per il calcolo di valori estremi**

- **`Math.max(double a, double b)`**:
  Restituisce il valore massimo tra due numeri.

  ```java
  double result = Math.max(10, 20);  // 20.0
  ```

- **`Math.min(double a, double b)`**:
  Restituisce il valore minimo tra due numeri.

  ```java
  double result = Math.min(10, 20);  // 10.0
  ```

---

#### 5. **Costanti**

La classe `Math` contiene alcune costanti predefinite che sono utilizzate frequentemente in calcoli matematici:

- **`Math.PI`**:
  Il valore di `π` (pi), utilizzato in calcoli geometrici.

  ```java
  System.out.println(Math.PI);  // 3.141592653589793
  ```

- **`Math.E`**:
  La costante `e`, base del logaritmo naturale.

  ```java
  System.out.println(Math.E);  // 2.718281828459045
  ```

---

### Esempi di utilizzo della classe `Math`

---

#### Esempio 1: Calcolo della distanza tra due punti in un piano cartesiano (Teorema di Pitagora)

```java
public class MathExample {
    public static void main(String[] args) {
        double x1 = 1.0, y1 = 2.0, x2 = 4.0, y2 = 6.0;
        
        // Calcola la distanza tra i due punti
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.println("La distanza tra i due punti è: " + distance);  // 5.0
    }
}
```

---

#### Esempio 2: Calcolo del seno, coseno e tangente di un angolo in radianti

```java
public class TrigonometryExample {
    public static void main(String[] args) {
        double angleInRadians = Math.toRadians(45);  // 45 gradi in radianti
        
        double sin = Math.sin(angleInRadians);
        double cos = Math.cos(angleInRadians);
        double tan = Math.tan(angleInRadians);
        
        System.out.println("Seno: " + sin);  // 0.7071067811865475
        System.out.println("Coseno: " + cos);  // 0.7071067811865476
        System.out.println("Tangente: " + tan);  // 1.0
    }
}
```

---

### Conclusione

La classe `Math` fornisce un'ampia gamma di metodi utili per eseguire calcoli matematici in Java. Essendo una classe statica, tutti i metodi sono accessibili senza dover creare un'istanza della classe, il che la rende molto pratica per operazioni matematiche di base e avanzate. Utilizzando correttamente i metodi di `Math`, puoi eseguire operazioni come il calcolo delle radici, dei logaritmi, delle funzioni trigonometriche e molte altre, in modo semplice ed efficiente.

## I membri della classe Math.

Questa classe serve per fare calcoli matematici e ha due attributi:

## Costanti pubbliche statiche

```java
static double E	; //E di Eulero
static double PI; //Pi greca
```

---

---

### Mette a disposizione i metodi per le principali funzioni matematiche

* valore assoluto, 
* tangente, 
* logaritmo, 
* potenza, 
* massimo, 
* minimo, 
* seno, 
* coseno, 
* esponenziale, 
* radice quadrata
* arrotondamento classico, per eccesso e per difetto
* generazione di numeri casuali


---

## Metodi pubblici statici:

* double **abs**(double a)
* float **abs**(float a)
* int **abs**(int a)
* long **abs**(long a)
* double **acos**(double a)
* double **asin**(double a)
* double **atan**(double a)
* double **atan2**(double y, double x)
* double **ceil**(double a)
* double **cos**(double a)
* double **exp**(double a)
* double **floor**(double a)
* double **log**(double a)

---

## Metodi pubblici statici:
* double **max**(double a, double b)
* float **max**(float a, float b)
* int **max**(int a, int b)
* long **max**(long a, long b)
* double **min**(double a, double b)
* float **min**(float a, float b)
* int **min**(int a, int b)
* long **min**(long a, long b)
* double **pow**(double a, double b)
* double **random**()
* double **rint**(double a)
* long **round**(double a)
* int **round**(float a)
* double **sin**(double a)
* double **sqrt**(double a)
* double **tan**(double a)
* double **toDegrees**(double angrad)
* double **toRadians**(double angdeg)---
# Package java.lang

Il package `java.lang` è uno dei package fondamentali in Java, e viene automaticamente importato in ogni programma Java. Contiene le classi di base per la gestione di stringhe, numeri, oggetti, thread e altre operazioni di sistema. Qui sotto sono elencate le classi principali di `java.lang` con una breve descrizione di ognuna.

---

### 1. **Object**

- **Descrizione**: È la superclasse di tutte le classi in Java. Ogni classe in Java eredita da `Object`, quindi contiene metodi base come `equals()`, `hashCode()`, `toString()`, `clone()` e `finalize()`.
- **Principali Metodi**:
  - `equals(Object obj)`: Confronta due oggetti per verificarne l'uguaglianza.
  - `hashCode()`: Restituisce un valore hash dell'oggetto.
  - `toString()`: Restituisce una rappresentazione in stringa dell'oggetto.

---

### 2. **String**

- **Descrizione**: Rappresenta una sequenza immutabile di caratteri. La classe `String` è largamente utilizzata in Java per la manipolazione di stringhe.
- **Principali Metodi**:
  - `length()`: Restituisce la lunghezza della stringa.
  - `charAt(int index)`: Restituisce il carattere in una posizione specifica.
  - `substring(int beginIndex, int endIndex)`: Estrae una sottostringa.
  - `concat(String str)`: Concatena due stringhe.

---

### 3. **StringBuilder** e **StringBuffer**

- **Descrizione**: Classi per la manipolazione di stringhe mutevoli. `StringBuilder` non è thread-safe, mentre `StringBuffer` è thread-safe.
- **Principali Metodi**:
  - `append(String str)`: Aggiunge una stringa alla fine.
  - `insert(int offset, String str)`: Inserisce una stringa a una data posizione.
  - `delete(int start, int end)`: Elimina caratteri in un intervallo.

---

### 4. **Math**

- **Descrizione**: Fornisce metodi per operazioni matematiche come funzioni trigonometriche, logaritmi, esponenziali e altro.
- **Principali Metodi**:
  - `abs(double a)`: Restituisce il valore assoluto.
  - `sqrt(double a)`: Restituisce la radice quadrata.
  - `pow(double a, double b)`: Calcola la potenza.
  - `random()`: Restituisce un numero pseudo-casuale.

---

### 5. **Integer**, **Double**, **Float**, **Long**, **Byte**, **Short** e **Boolean**

- **Descrizione**: Classi wrapper per i tipi primitivi (rispettivamente `int`, `double`, `float`, `long`, `byte`, `short` e `boolean`). Permettono di gestire i tipi primitivi come oggetti.
- **Principali Metodi**:
  - `parseInt(String s)`: Converte una stringa in un intero (es. per `Integer`).
  - `valueOf(String s)`: Converte una stringa nel valore primitivo corrispondente.

---

### 6. **System**

- **Descrizione**: Fornisce l'accesso a funzionalità di sistema, come input/output standard e variabili di ambiente.
- **Principali Metodi**:
  - `currentTimeMillis()`: Restituisce l'ora corrente in millisecondi.
  - `exit(int status)`: Termina l'applicazione.
  - `gc()`: Richiama il garbage collector.

---

### 7. **Thread**

- **Descrizione**: Rappresenta un thread di esecuzione. Java permette di creare programmi multi-threaded per eseguire operazioni parallele.
- **Principali Metodi**:
  - `start()`: Avvia l'esecuzione del thread.
  - `run()`: Definisce il codice da eseguire nel thread.
  - `join()`: Attende che il thread termini.

---

### 8. **Runnable**

- **Descrizione**: Interfaccia funzionale che rappresenta un compito da eseguire in un thread.
- **Principali Metodi**:
  - `run()`: Metodo che contiene il codice da eseguire.

---

### 9. **Exception** e **RuntimeException**

- **Descrizione**: Superclassi di tutte le eccezioni. `Exception` è utilizzata per gestire le eccezioni controllate, mentre `RuntimeException` è utilizzata per eccezioni non controllate.
- **Principali Metodi**:
  - `getMessage()`: Restituisce il messaggio dell'eccezione.
  - `printStackTrace()`: Stampa la traccia dello stack al momento dell'eccezione.

---

### 10. **Class**

- **Descrizione**: Rappresenta il runtime della classe di un oggetto. Permette di ispezionare il tipo dell'oggetto e di riflettere sulla struttura delle classi.
- **Principali Metodi**:
  - `forName(String className)`: Carica una classe per nome.
  - `getMethods()`: Restituisce tutti i metodi pubblici della classe.
  - `newInstance()`: Crea una nuova istanza della classe.

---

Queste classi costituiscono la base della programmazione in Java e offrono numerosi strumenti e funzionalità per gestire aspetti fondamentali del linguaggio.

- [Object](https://github.com/maboglia/CorsoJava/blob/master/appunti/API_Java/021_java_lang_Object.md)
- [System](https://github.com/maboglia/CorsoJava/blob/master/appunti/API_Java/021_java_lang_System.md)
- Package
- Class
- ClassLoader
- ClassValue

---

[Classi wrapper](https://github.com/maboglia/CorsoJava/blob/master/appunti/021_Classi_wrapper.md) e gestione tipi

- Boolean
- Byte
- Character
- Double
- Float
- Integer
- Long
- Short
- Void
- Enum

---

Gestire le Stringhe

- [String](https://github.com/maboglia/CorsoJava/blob/master/appunti/007_stringhe.md)
- [StringBuilder](https://github.com/maboglia/CorsoJava/blob/master/appunti/007_stringhe.md)

Gestire i numeri - Math

- [Math](https://github.com/maboglia/CorsoJava/blob/master/appunti/API_Java/021_java_lang_Math.md)
- StrictMath
- Number

Altre funzionalità

- Compiler
- Process
- Runtime
- SecurityManager
- StackTraceElement
- Thread
- Throwable
---
La classe `Object` è la **superclasse di tutte le classi in Java**. Questo significa che ogni classe in Java, direttamente o indirettamente, eredita da `Object`. È una classe fondamentale nel linguaggio, poiché fornisce metodi comuni che tutte le classi possono utilizzare.

---

### Caratteristiche principali della classe `Object`

1. **Superclasse di tutte le classi**:
   La classe `Object` è la radice della gerarchia delle classi in Java. Qualunque classe tu definisca in Java, ereditando da essa, avrà automaticamente accesso ai metodi della classe `Object`.

   Esempio:

   ```java
   class MyClass extends Object {
       // MyClass è una sottoclasse di Object
   }
   ```

2. **Metodi principali**:
   La classe `Object` fornisce una serie di metodi generali che sono disponibili per tutte le classi in Java. Questi metodi possono essere **sovrascritti** (override) nelle sottoclassi per comportamenti personalizzati. Ecco alcuni dei metodi principali:

   - **`toString()`**:
     Questo metodo restituisce una rappresentazione in formato stringa dell'oggetto. Di default, restituisce una stringa che contiene il nome della classe e l'indirizzo di memoria dell'oggetto, ma molte classi sovrascrivono questo metodo per fornire informazioni più significative sull'oggetto.

     ```java
     @Override
     public String toString() {
         return "MyClass Object";
     }
     ```

   - **`equals(Object obj)`**:
     Questo metodo confronta l'oggetto corrente con un altro oggetto passato come parametro. La versione predefinita in `Object` confronta gli indirizzi di memoria (cioè verifica se gli oggetti sono la stessa istanza), ma le classi spesso sovrascrivono questo metodo per effettuare confronti basati sul contenuto degli oggetti.

     ```java
     @Override
     public boolean equals(Object obj) {
         if (this == obj) return true;
         if (obj == null || getClass() != obj.getClass()) return false;
         MyClass myClass = (MyClass) obj;
         return this.someField == myClass.someField;
     }
     ```

   - **`hashCode()`**:
     Restituisce un valore intero che rappresenta un "codice hash" dell'oggetto. Il codice hash viene utilizzato dalle strutture dati come `HashMap` o `HashSet` per identificare rapidamente gli oggetti. Se si sovrascrive `equals()`, è buona pratica sovrascrivere anche `hashCode()` per garantire la coerenza.

     ```java
     @Override
     public int hashCode() {
         return Objects.hash(someField);
     }
     ```

   - **`getClass()`**:
     Restituisce un oggetto di tipo `Class` che rappresenta la classe dell'oggetto corrente. È utile per ottenere informazioni sulla classe di un oggetto a runtime.

     ```java
     Class<?> clazz = obj.getClass();
     System.out.println(clazz.getName());
     ```

   - **`clone()`**:
     Crea e restituisce una copia dell'oggetto. La classe `Object` fornisce una versione predefinita di questo metodo, ma è necessario implementare l'interfaccia `Cloneable` per utilizzarlo correttamente. Se non implementata, il metodo `clone()` lancerà un'eccezione `CloneNotSupportedException`.

     ```java
     @Override
     protected Object clone() throws CloneNotSupportedException {
         return super.clone();
     }
     ```

   - **`finalize()`**:
     Viene chiamato dal garbage collector prima che un oggetto venga eliminato dalla memoria. È una specie di "metodo di pulizia" che può essere utilizzato per liberare risorse (come file aperti o connessioni di rete) prima che l'oggetto venga distrutto. Tuttavia, questo metodo è stato deprecato nelle versioni recenti di Java.

     ```java
     @Override
     protected void finalize() throws Throwable {
         // Pulizia delle risorse
         super.finalize();
     }
     ```

   - **`wait()`, `notify()`, `notifyAll()`**:
     Questi metodi sono utilizzati per la gestione della concorrenza e del multithreading. Vengono invocati sugli oggetti che agiscono come monitor per il sincronismo tra i thread.

     ```java
     synchronized (obj) {
         obj.wait();
     }
     ```

---

### Esempio di utilizzo della classe `Object`

```java
public class Person extends Object {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);
        
        System.out.println(p1.toString());  // Person{name='Alice', age=30}
        System.out.println(p1.equals(p2));  // true
        System.out.println(p1.hashCode()); // Un codice hash basato su name e age
    }
}
```

---

### Perché è importante la classe `Object`?

1. **Ereditarietà universale**: Poiché tutte le classi in Java ereditano da `Object`, ogni oggetto in Java ha accesso ai metodi di `Object` (come `toString()`, `equals()`, `hashCode()`, ecc.).
2. **Polimorfismo**: I metodi di `Object` sono fondamentali per il polimorfismo, poiché permettono di trattare oggetti di tipo diverso in modo uniforme. Puoi, ad esempio, scrivere un codice che accetta qualsiasi oggetto (di tipo `Object`) e utilizzare i suoi metodi, come `toString()`, senza sapere il tipo esatto dell'oggetto.

---

### Conclusione

La classe `Object` è centrale nel design di Java, poiché fornisce metodi di base per il confronto, la visualizzazione e la gestione della memoria degli oggetti. Sebbene molte di queste funzionalità possano essere sovrascritte dalle sottoclassi per un comportamento più specifico, tutte le classi in Java ereditano da `Object` e beneficiano dei suoi metodi.
---
I membri della classe System.
----------------------------------------------------------------------------
Costanti pubbliche statiche:
* java.io.PrintStream **err**
* java.io.InputStream **in**
* java.io.PrintStream **out**

Metodi pubblici statici:
* void **arraycopy**(Object src, int srcPos, Object dest, int destPos, int length)
* long **currentTimeMillis**()
* void **exit**(int status)
* void **gc**()
* java.util.Properties **getProperties**()
* String **getProperty**(String key)
* String **getProperty**(String key, String default) 
* SecurityManager **getSecurityManager**()
* void **runFinalization**()
* void **setErr**(java.io.PrintStream err)
* void **setIn**(java.io.InputStream in)
* void **setOut**(java.io.PrintStream out)
* void **setProperties**(java.util.Properties properties) 
* String **setProperty**(String key, String value)
* void **setSecurityManager**(SecurityManager s)




## Classe System

La classe System ha il compito di interfacciare il programma Java con il sistema operativo sul quale sussiste la virtual machine.

Tutto ciò che esiste nella classe System è dichiarato statico.

### VARIABILI
Iniziamo subito esaminando tre attributi statici, che rappresentano i flussi (stream) di informazioni scambiati con la console (standard input, standard output, standard error):
```java

static PrintStream out

static PrintStream err

static InputStream in
```

* Ciascuno di questi tre attributi è un oggetto e sfrutta i metodi della classe relativa.
* l’oggetto out è di tipo PrintStream e viene usato per indicare l’output di default del sistema.
* l’oggetto err, anch’esso di tipo PrintStream, che viene usato per segnalare gli errori che avvengono durante l’esecuzione del programma. 
* l’oggetto in è di tipo InputStream: serve per ricevere il flusso di informazioni dallo standard input. p.es la tastiera.
* E’ possibile modificare il puntamento di queste tre variabili verso altre fonti di input o di output usando i metodi statici setOut(), setErr() e setIn().

### METODI Principali

* il metodo arraycopy() permette di copiare il contenuto di un array in un altro.

* il metodo exit(int code) che consente di bloccare istantaneamente l’esecuzione del programma. 

```java
if (continua == false) {
	System.err.println("Si è verificato un problema!");
	System.exit(0);
}
```
Altri metodi interessanti:

```java
	setProperty(String key, String value) e 
	getProperty(String key) che servono rispettivamente ad impostare le proprietà del sistema e a recuperare informazioni sulle proprietà del sistema.
```

Gli oggetti di tipo Properties sono specializzazioni di tabelle hash di Java, semplici coppie chiave-valore.

Per esempio:

```java

System.out.print("Versione Java Runtime Environment (JRE): ");
System.out.println(System.getProperty("java.version"));
* 
System.out.print("Java è installato su: ");
System.out.println(System.getProperty("java.home"));
```


 impostare una nuova proprietà mediante il codice:

```java

System.setProperty("User.lastName", "Verdi");
```

Le proprietà automaticamente disponibili nell'ambiente Java.
-----------------------------------------------------------------
Chiave|Valore
---|---
java.version|La versione di Java in uso.
java.vendor|Il produttore della versione di Java in uso.
java.vendor.url|L'URL del produttore della versione di Java in uso.
java.home|La directory di installazione di Java.
java.vm.specification.version|La versione delle specifiche della macchina virtuale in uso.
java.vm.specification.vendor|Il produttore delle specifiche della macchina virtuale in uso.
java.vm.specification.name|Il nome delle specifiche della macchina virtuale in uso.
java.vm.version|La versione della macchina virtuale in uso.
java.vm.vendor|Il produttore della macchina virtuale in uso.
java.vm.name|Il nome della macchina virtuale in uso.
java.specification.version|La versione delle specifiche di Java in uso.
java.specification.vendor|Il produttore delle specifiche di Java in uso.
java.specification.name|Il nome delle specifiche di Java in uso.
java.class.version|La versione delle classi di Java.
java.class.path|Il percorso delle classi di Java.
java.library.path|Il percorso delle librerie di Java.
java.io.tmpdir|Il percorso della directory dei file temporanei.
java.ext.dirs|I percorsi delle directory che contengono le estensioni di Java.
os.name|Il nome del sistema operativo in uso.
os.arch|L'architettura del sistema operativo in uso.
os.version|La versione del sistema operativo in uso.
file.separator|La sequenza per la separazione degli elementi dei percorsi nel sistema in uso.
path.separator|La sequenza per la separazione dei percorsi nel sistema in uso.
line.separator|La sequenza impiegata dal sistema in uso per esprimere il ritorno a capo.
user.name|Il nome dell'utente che sta usando l'applicazione.
user.home|La home directory dell'utente che sta usando l'applicazione.
user.dir|L'attuale cartella di lavoro dell'utente che sta usando l'applicazione.
---
# Le proprietà automaticamente disponibili nell'ambiente Java

Chiave|Valore
---|---
java.version|La versione di Java in uso.
java.vendor|Il produttore della versione di Java in uso.
java.vendor.url|L'URL del produttore della versione di Java in uso.
java.home|La directory di installazione di Java.
java.vm.specification.version|La versione delle specifiche della macchina virtuale in uso.
java.vm.specification.vendor|Il produttore delle specifiche della macchina virtuale in uso.
java.vm.specification.name|Il nome delle specifiche della macchina virtuale in uso.
java.vm.version|La versione della macchina virtuale in uso.
java.vm.vendor|Il produttore della macchina virtuale in uso.
java.vm.name|Il nome della macchina virtuale in uso.
java.specification.version|La versione delle specifiche di Java in uso.
java.specification.vendor|Il produttore delle specifiche di Java in uso.
java.specification.name|Il nome delle specifiche di Java in uso.
java.class.version|La versione delle classi di Java.

---

Chiave|Valore
---|---
java.class.path|Il percorso delle classi di Java.
java.library.path|Il percorso delle librerie di Java.
java.io.tmpdir|Il percorso della directory dei file temporanei.
java.ext.dirs|I percorsi delle directory che contengono le estensioni di Java.
os.name|Il nome del sistema operativo in uso.
os.arch|L'architettura del sistema operativo in uso.
os.version|La versione del sistema operativo in uso.
file.separator|La sequenza per la separazione degli elementi dei percorsi nel sistema in uso.
path.separator|La sequenza per la separazione dei percorsi nel sistema in uso.
line.separator|La sequenza impiegata dal sistema in uso per esprimere il ritorno a capo.
user.name|Il nome dell'utente che sta usando l'applicazione.
user.home|La home directory dell'utente che sta usando l'applicazione.
user.dir|L'attuale cartella di lavoro dell'utente che sta usando l'applicazione.

---

## codice `System.getProperty("java.version")`

```java
  String[] keys = {
   "java.version","java.vendor","java.vendor.url",
   "java.home","java.vm.specification.version",
   "java.vm.specification.vendor","java.vm.specification.name",
   "java.vm.version","java.vm.vendor","java.vm.name",
   "java.specification.version","java.specification.vendor",
   "java.specification.name","java.class.version",
   "java.class.path","java.library.path","java.io.tmpdir",
   "java.exist.dirs","os.name","os.arch","os.version",
   "file.separator","path.separator","line.separator",
   "user.name","user.home","user.id"
  };
  for(int i=0; i<keys.length; i++){
   System.out.println(
    "[" + keys[i] + "] " + System.getProperty(keys[i]));
  }

```
---
# Java Date - Legacy - Classi deprecate o non più utilizzate

Fino a Java 7, la classe principale per gestire date e orari è Calendar (che ha sostituito la classe Date, dichiarata **deprecata**).

Altre classi utili sono **GregorianCalendar**, **SimpleTimeZone** e **SimpleTimeZone**.

---

I membri resi disponibili dalla classe Date
--------------------------------------------------------------

### Costruttori pubblici

..|..
---|---
Date()|   Costruisce un oggetto Date che incapsula la data e l'ora correnti.
Date(long t)|  Costruisce un oggetto Date che incapsula la data e l'ora espressi dall'argomento t. L'argomento è un long che riporta i millisecondi trascorsi dal 1è Gennaio 1970 sino alla data rappresentata.
---

---

### Metodi pubblici

..|..
---|---
boolean after(Date d)| Restituisce true se la data di invocazione è successiva alla data d.
boolean before(Date d)| Restituisce true se la data di invocazione è precedente alla data d.
Object clone()|  Clona l'oggetto. Date implementa l'interfaccia Cloneable.
int compareTo(Date d)| Compara la data di invocazione con d. Restituisce 0 se le due date sono uguali, un valore negativo se la data di invocazione precede la data d o un valore positivo se la data di invocazione è successiva alla data d.
int compareTo(Object)| Se l'argomento fornito è una istanza di Date, agisce come compareTo(Date d). In caso contrario, propaga una ClassCastException.
boolean equals(Object o)|Restituisce true se l'argomento è una data equivalente a quella di invocazione.
long getTime()|  Restituisce la data dell'oggetto sotto forma di valore long, che esprime i millisecondi trascorsi dal 1 Gennaio 1970 sino alla data rappresentata.
int hashCode()|  Calcola un codice hash per l'oggetto.
void setTime(long t)| Imposta la data rappresentata con un argomento di tipo long, che esprime i millisecondi trascorsi dal 1 Gennaio 1970 sino alla data rappresentata.
String toString()| Fornisce una rappresentazione in stringa della data.

---

## Classe GregorianCalendar

### Costruttori pubblici

GregorianCalendar  Costruisce un GregorianCalendar che rappresenta la data e l'ora correnti.

..|..
---|---
GregorianCalendar(int year, int month, int date)| Costruisce un GregorianCalendar che rappresenta la data espressa mediante gli argomenti forniti. GregorianCalendar(int year, int month, int date,int hour, int minute)||Costruisce un GregorianCalendar che rappresenta la data e l'ora espressa mediante gli argomenti forniti.
---

---

### Metodi pubblici

..|..
---|---
boolean after(Object o)| Restituisce true se la data rappresentata È successiva alla data espressa dall'oggetto o, che deve essere istanza di Calendar.
boolean before(Object o)|Restituisce true se la data rappresentata È precedente alla data espressa dall'oggetto o, che deve essere istanza di Calendar.
Object clone()|  Clona l'oggetto. GregorianCalendar implementa l'interfaccia Cloneable.
booleans equals(Object o)|Restituisce true se l'argomento rappresenta una data equivalente a quella rappresentata dall'oggetto di invocazione.
int get(int field)| Recupera il valore di uno dei campi della data rappresentata. L'argomento specifica il campo di interesse.
Date getTime()|  Restituisce un oggetto Date che rappresenta la data incapsulata dall'oggetto di invocazione.
long getTimeInMillis()| Restituisce la data rappresentata dall'oggetto sotto forma di valore long, che esprime i millisecondi trascorsi dal 1 Gennaio 1970 sino alla data rappresentata.
int hashCode()|  Calcola un codice hash per l'oggetto.
void set(int field, int value)|Imposta su value il valore del campo rappresentato dall'intero field.
void setTime(Date d)| Imposta la data rappresentata prelevando il suo valore all'argomento d.
void SetTimeInMillis(long l)|Imposta la data rappresentata mediante un argomento di tipo long, che esprime i millisecondi trascorsi dal 1 Gennaio 1970 sino alla data rappresentata.
String toString()| Fornisce una rappresentazione in stringa della data. rappresentata.
--------------------------------------------------------------
Costanti statiche:
..|..
---|---
AM_PM|Il campo che informa se l'ora espressa è prima o dopo mezzogiorno.
DAY_OF_MONTH|Il campo che riporta il giorno del mese.
DAY_OF_WEEK|Il campo che riporta il giorno della settimana.
DAY_OF_YEAR|Il campo che riporta il giorno dell'anno.
HOUR|Il campo che riporta l'ora del mattino o del pomeriggio, a seconda del contenuto del campo AM_PM
HOUR_OF_DAY|Il campo che riporta l'ora del giorno, in un intervallo tra 0 e 23.
MILLISECOND|Il campo che riporta i millisecondi.
MINUTE|Il campo che riporta i minuti.
MONTH|Il campo che riporta il mese.
SECOND|Il campo che riporta i secondi.
WEEK_OF_MONTH|Il campo che riporta la settimana del mese.
WEEK_OF_YEAR|Il campo che riporta la settimana dell'anno.
YEAR|Il campo che riporta l'anno.

---

## GreorianCalendar

La classe __GregorianCalendar__ è molto semplice da utilizzare.

Sono disponibili diversi costruttori.
Il costruttore senza parametri inizializza l’oggetto con la data e l’ora attuale.
Con il metodo get(), ereditato da Calendar, è possibile ricevere tutte le informazioni disponibili per l'oggetto di tipo data.

---

### Primo esempio

stampiamo semplicemente la data odierna con l’orario attuale.

```java
GregorianCalendar calendario = new GregorianCalendar();
int anno = calendario.get(Calendar.YEAR);
int mese = calendario.get(Calendar.MONTH) + 1;
int giorno = calendario.get(Calendar.DATE);
int ore = calendario.get(Calendar.HOUR);
int min = calendario.get(Calendar.MINUTE);
int sec = calendario.get(Calendar.SECOND);

System.out.println(giorno + "/" + mese + "/" + anno);
System.out.println(ore + ":" + minuti + ":" + secondi);
```

---

## Formattare la data: SimpleDateFormat

la classe SimpleDateFormat che permette di trattare le date nel formato più adatto alla nostra esigenza.

---

### Secondo esempio

come stampare la data odierna usando __SimpleDateFormat__ per formattare l'output.

```java

GregorianCalendar calendario = new GregorianCalendar();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy – HH:mm:ss");
System.out.println(sdf.format(calendario.getTime()));
```

 - Il costruttore della classe SimpleDateFormat prende in ingresso una stringa che rappresenta il formato della data che vogliamo stampare. 
 - Il metodo getTime() della classe GregorianCalendar restituisce un’istanza di Date. 
 - Il metodo format() della classe SimpleDateFormat, che restituisce in ingresso una Date, restituisce una stringa che corrisponde al formato che abbiamo impostato.
 - E’ possibile sfruttare la classe SimpleDateFormat anche per ottenere un’istanza della classe Calendar.

```java
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy – HH:mm:ss");
String miaData = "15/04/1988";
GregorianCalendar calendario = new GregorianCalendar();
try {
 calendario.setTime(sdf.parse(miaData));
} catch(ParseException exc) {
 exc.printStackTrace();
}
```

 Il metodo __parse()__ della classe SimpleDateFormat riceve in ingresso una stringa e restituisce un oggetto Date.
 Il metodo __setTime()__ della classe GregorianCalendar ci permette di impostare la data.

Bisogna utilizzare un blocco try-catch perché potrebbe essere sollevata una __ParseException__, nel caso in cui una stringa passata al metodo parse(), non rappresenti una data convertibile.

---

## Terzo esempio

come convertire una data dal formato americano in quello italiano utilizzando le tecniche analizzate in precedenza.

```java
SimpleDateFormat formatIT = new SimpleDateFormat("dd/MM/yyyy"); 
SimpleDateFormat formatUS = new SimpleDateFormat("yyyy/MM/dd");

Date dataIT;
try {
 dataIT = formatUS.parse("2017/12/25");
 String dataUS = formatIT.format(dataIT);
 System.out.println(dataUS);
} catch(ParseException exc) {
 exc.printStackTrace();
}
```

Volendo confrontare due date possiamo utilizzare i metodi

* `after()`
* `before()`
* `equals()`
presenti nella classe Date.

```java
GregorianCalendar c1 = 
new gregorianCalendar(2013, GregorianCalendar.FEBRUARY, 05);
GregorianCalendar c2 = 
new gregorianCalendar(2013, GregorianCalendar.FEBRUARY, 05);

Date data1 = c1.getTime();
Date data2 = c2.getTime();
```

Il metodo:

```java
data1.after(data2)  restituirà false
data1.equals(data2) restituirà false
data1.before(data2) restituirà true
```

---
# Date e orari

Le date sono degli oggetti molto complessi da gestire: assumono forme diverse a seconda del luogo geografico in cui ci troviamo.
La  manipolazione delle date e delle ore è una delle attività ricorrenti di un programmatore. 

Inoltre sono disponibili le più moderne LocalDate e LocalDateTime.
Oltre a queste classi, è molto probabile che serva utilizzarne altre quali: **DateFormat** e **SimpleDateFormat**, 
che permettono la trasformazione da stringa a data e viceversa.

---

## In Java 8: LocalDate, LocalTime, LocalDateTime

```java
      LocalDate oggi = LocalDate.now(); // Data di oggi
      System.out.println("oggi: " + oggi);

      //settare una data precisa (mese 1-based)
      LocalDate mauroBirthday = LocalDate.of(1969, 7, 28);
      //Per il mese possiamo usare le costanti di Month
      mauroBirthday = LocalDate.of(1969, Month.JULY, 28);
      
      System.out.println("mauroBirthday: " + mauroBirthday);
```

---

## In Java 8: LocalDate, LocalTime, LocalDateTime II

```java
      LocalDate inizioCorsi = LocalDate.of(2017, Month.OCTOBER, 12);
      LocalDate natale = LocalDate.of(2017, Month.DECEMBER, 25);

      System.out.println("Fino a  natale: " + inizioCorsi.until(natale));
      System.out.println("Fino a  natale: " + inizioCorsi.until(natale, ChronoUnit.DAYS));
 
      LocalDate festaLiberazione = LocalDate.of(2017, Month.APRIL, 25);
      LocalDate natale = LocalDate.of(2017, Month.DECEMBER, 25);

      System.out.println("Fino a  natale: " + festaLiberazione.until(natale));
      System.out.println("Fino a  natale: " + festaLiberazione.until(natale, ChronoUnit.DAYS));

      System.out.println(oggi.plusMonths(1));
      System.out.println(oggi.minusMonths(1));
```

---

## In Java 8: LocalDate, LocalTime, LocalDateTime III

```java
      DayOfWeek inizioMillennio = LocalDate.of(2000, 1, 1).getDayOfWeek();
      System.out.println("inizioMillennio: " + inizioMillennio);
      System.out.println(inizioMillennio.getValue());
      System.out.println(DayOfWeek.SATURDAY.plus(3));	  
      LocalDateTime ldt = LocalDateTime.now();
      System.out.println(ldt);

      LocalDate ld = LocalDate.of(2009, 1, 28);
      System.out.println(ld);

      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
      System.out.println(dtf.format(ld));



```

---

## Convertire LocalDate a java.sql.Date

```java
import java.sql.Date;
//...
LocalDate locald = LocalDate.of(1969, 07, 28);
Date date = Date.valueOf(locald); 
r.setDateOfBirth(date);
```

---

## l'operazione contraria è

```java
Date date = r.getDate();
LocalDate localD = date.toLocalDate();
```

r è il record e .getDate() il metodo per farsi ritornare la data. 
Se avessi un campo dataNascita ilmetodo dovrebbe chiamarsi getDateNascita().

Usa le classi del package java.time invece di java.util.Date e java.sql.Date con** JDBC 4.2 o superiore.**

---

## Esempio con PreparedStatement

```java
myPreparedStatement.setObject( 
    … ,                                         // qui passa il numero ordinale dell'argomento.
    myJavaUtilDate.toInstant()                  // Converti da `java.util.Date` nel più moderno `java.time.Instant` (UTC).
        .atZone( ZoneId.of( "Europe/Rome" ) )  // Sette un time zone particolare, per determinare la data. Instanziando un `ZonedDateTime`.
        .toLocalDate()                          // Estrai la data di tipo `java.time.LocalDate` dall'oggetto.
)
```

---

### esempi

```java
LocalDate todayLocalDate = LocalDate.now( ZoneId.of( "Europe/Paris" ) );  
// Usare "continent/region" come region name; non usare quelli codificati da 3 lettere.

LocalDate localDate = ResultSet.getObject( 1 , LocalDate.class );

//la questione è irrelevante in JDBC 4.2 o successive.
```

---

## Converti a java.sql.Date

```java
java.sql.Date sqlDate = java.sql.Date.valueOf( todayLocalDate );

//viceversa

LocalDate localDate = sqlDate.toLocalDate();
```

---

### Nuovi metodi di java.util.Date 

* java.util.Date.from( Instant ) 
* java.util.Date::toInstant.

```java
Instant instant = myUtilDate.toInstant();

ZoneId zoneId = ZoneId.of ( "America/Montreal" );
ZonedDateTime zdt = ZonedDateTime.ofInstant ( instant , zoneId );
LocalDate localDate = zdt.toLocalDate();
```

```java
public class MainClass {

  public static void main(String[] args) {
    java.util.Date utilDate = new java.util.Date();
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    System.out.println("utilDate:" + utilDate);
    System.out.println("sqlDate:" + sqlDate);

  }

}

//http://www.java2s.com/Tutorial/Java/0040__Data-Type/ConvertfromajavautilDateObjecttoajavasqlDateObject.htm
```
---
# Dizionari e mappe

* Un dizionario è una raccolta di coppie chiave-valore. 
* La classe astratta Dictionary definisce l'uso dei dizionari nel pacchetto java.util.
* I dizionari hanno diversi tipi di implementazioni (Hashtable, Properties, ...).

---

Metodo|Descrizione
---|---
`Enumeration elements()`|Restituisce l'enumerazione dei valori presenti nel dizionario.
`Object get(Object key)`|Restituisce il valore dell'elemento con chiave key, o null se tale elemento non fa parte dell'insieme.
`boolean isEmpty`|Restituisce true se l'insieme è vuoto.
`Enumeration keys()`|Restituisce l'enumerazione delle chiavi presenti nel dizionario.
`Object put(Object key, Object value)`|Nel caso non esista un elemento con chiave key, lo crea con valore value. In caso contrario, ne aggiorna semplicemente il valore. In caso di aggiornamento, il vecchio valore viene restituito, altrimenti sarà ritornato null.
`Object remove(Object key)`|Rimuove dall'insieme l'elemento con chiave key. Se l'elemento non esiste, restituisce null, altrimenti ritorna il suo valore.
int size()|Restituisce il numero degli elementi presenti nell'insieme.

---

### Properties deriva da Hashtable e definisce nuovi metodi

Metodo|Descrizione
---|---
`String getProperty(String key)`|Restituisce il valore dalla proprietà chiamata key, o null se tale proprietà non esiste.
`String getProperty(String key, String defaultValue)`|Restituisce il valore dalla proprietà chiamata key, o defaultValue se tale proprietà non esiste.
`list(java.io.PrintStream out)`|Elenca tutte le proprietà nel canale out.
`load(java.io.InputStream in)`|Carica dal canale di input in un insieme di proprietà precedentemente salvato.
`Enumerations propertyNames()`|Restituisce l'enumerazione dei nomi di ogni proprietà conservata nell'insieme.
`Object setProperty(String key,String value)`	|Nel caso non esista una	proprietà chiamata key, la crea con valore value. In caso contrario, ne aggiorna semplicemente il valore. In caso di aggiornamento, il  vecchio valore viene restituito, altrimenti sarà ritornato null.
`void store(java.io.OutputStream out,String header)`|Salva tutte le proprietà nel canale out, facendole precedere dall'intestazione header.

---

## L'interfaccia enumeration stabilisce due metodi:

1. `boolean hasMoreElements()`
   Restituisce true fin quando ci sono elementi da esaminare.
2. `Object nextElement()`
   Restituisce l'elemento successivo.---
# I membri della classe Random

## Costruttori pubblici:

metodo|descrizione
---|---
Random()|Costruisce un nuovo generatore di numeri pseudo-casuali, usando la data e l'ora correnti come seme.
Random(int seed)|Costruisce un nuovo generatore di numeri pseudo-casuali, usando il seme specificato.

---

## Metodi pubblici:

metodo|descrizione
---|---
`boolean nextBoolean()`|Restituisce il boolean successivo nella sequenza pseudo-casuale.
`void nextBytes(bytes[] b)`|Registra sull'argomento fornito una sequenza di b.length numeri pseudo-casuali, in formato byte.
`double nextDouble()`|Restituisce il double successivo nella sequenza pseudo-casuale, compreso tra 0 (incluso) ed 1 (escluso).
`float nextFloat()`|Restituisce il float successivo nella sequenza pseudo-casuale, compreso tra 0 (incluso) ed 1 (escluso).
`double nextGaussian()`|Restituisce il double gaussiano successivo nella sequenza pseudo-casuale, compreso tra 0 (incluso) ed 1 (escluso).
`int nextInt()`|Restituisce l'int successivo nella sequenza pseudo-casuale.
`int nextInt(int n)`|Restituisce l'int successivo nella sequenza pseudo-casuale, compreso tra 0 (incluso) ed n (escluso).
`long nextLong()`|Restituisce il long successivo nella sequenza pseudo-casuale.
`void setSeed(long seed)`|Reimposta il seme della sequenza.---
# Map

Una **Map** è una collezione che associa **chiavi (key)** a **valori (value)**.
Ogni chiave è **univoca**, mentre i valori **possono essere duplicati**.

È la struttura dati ideale per gestire **coppie chiave-valore**, come:

* codice fiscale → persona
* matricola → studente
* targa → automobile

---

## Caratteristiche principali

| Proprietà              | Descrizione                                                  |
| ---------------------- | ------------------------------------------------------------ |
| Duplicati              | ❌ Chiavi uniche, ✅ Valori duplicati                          |
| Ordinamento            | Dipende dall’implementazione                                 |
| Accesso agli elementi  | Tramite chiave                                               |
| Interfaccia base       | `Map<K, V>`                                                  |
| Derivata ordinata      | `SortedMap<K, V>`                                            |
| Implementazioni comuni | `HashMap`, `LinkedHashMap`, `TreeMap`                        |
| Thread-safe            | `Hashtable`, `ConcurrentHashMap` (in `java.util.concurrent`) |

---

## Differenze rispetto a Collection

> ⚠️ `Map` **non** estende `Collection`
> perché gestisce coppie chiave–valore invece di singoli elementi.

---

## Implementazioni principali

| Implementazione | Ordinamento             | Duplicati          | Thread-safe | Note                            |
| --------------- | ----------------------- | ------------------ | ----------- | ------------------------------- |
| `HashMap`       | ❌ Nessuno               | ❌ Chiavi duplicate | ❌ No        | Molto veloce (hash table)       |
| `LinkedHashMap` | ✅ Inserimento           | ❌ Chiavi duplicate | ❌ No        | Iterazione prevedibile          |
| `TreeMap`       | ✅ Naturale o Comparator | ❌ Chiavi duplicate | ❌ No        | Ordinamento automatico          |
| `Hashtable`     | ❌ Nessuno               | ❌ Chiavi duplicate | ✅ Sì        | Versione sincronizzata (legacy) |

---

## Interfacce collegate

| Interfaccia         | Descrizione                                                                         |
| ------------------- | ----------------------------------------------------------------------------------- |
| `Map<K,V>`          | Gestisce associazioni chiave-valore                                                 |
| `SortedMap<K,V>`    | Versione ordinata di `Map`                                                          |
| `NavigableMap<K,V>` | Estensione di `SortedMap` con navigazione facilitata (`higherKey()`, `lowerKey()`…) |

---

## Metodi principali di Map

| Metodo                                | Descrizione                                      |
| ------------------------------------- | ------------------------------------------------ |
| `void clear()`                        | Svuota la mappa                                  |
| `boolean containsKey(Object key)`     | Verifica se esiste una chiave                    |
| `boolean containsValue(Object value)` | Verifica se esiste un valore                     |
| `V get(Object key)`                   | Restituisce il valore associato alla chiave      |
| `V put(K key, V value)`               | Inserisce una coppia chiave–valore               |
| `void putAll(Map m)`                  | Inserisce tutte le coppie di un’altra mappa      |
| `V remove(Object key)`                | Rimuove una coppia tramite chiave                |
| `Set<K> keySet()`                     | Restituisce l’insieme delle chiavi               |
| `Collection<V> values()`              | Restituisce la collezione dei valori             |
| `Set<Map.Entry<K,V>> entrySet()`      | Restituisce l’insieme delle coppie chiave–valore |
| `int size()`                          | Numero di elementi                               |
| `boolean isEmpty()`                   | Verifica se la mappa è vuota                     |

---

## Esempio: HashMap

```java
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Pippo");
        map.put(2, "Pluto");
        map.put(3, "Paperino");
        map.put(4, "Qui Quo Qua");

        System.out.println("Chiave 3 → " + map.get(3));
        System.out.println("Contiene chiave 2? " + map.containsKey(2));
        System.out.println("Valori nella mappa: " + map.values());
    }
}
```

**Output possibile:**

```
Chiave 3 → Paperino
Contiene chiave 2? true
Valori nella mappa: [Pippo, Pluto, Paperino, Qui Quo Qua]
```

---

## Esempio: LinkedHashMap (ordine di inserimento)

```java
Map<String, Integer> linked = new LinkedHashMap<>();

linked.put("Uno", 1);
linked.put("Due", 2);
linked.put("Tre", 3);

System.out.println(linked);
```

**Output:**

```
{Uno=1, Due=2, Tre=3}
```

> Gli elementi vengono restituiti **nell’ordine di inserimento**.

---

## Esempio: TreeMap (ordinamento naturale)

```java
Map<String, Integer> tree = new TreeMap<>();

tree.put("C", 3);
tree.put("A", 1);
tree.put("B", 2);

System.out.println(tree);
```

**Output:**

```
{A=1, B=2, C=3}
```

> `TreeMap` ordina automaticamente le chiavi in **ordine crescente**.

---

## Esempio: Hashtable (thread-safe)

```java
import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Uno");
        table.put(2, "Due");
        table.put(3, "Tre");

        System.out.println(table);
    }
}
```

**Output:**

```
{3=Tre, 2=Due, 1=Uno}
```

> `Hashtable` è sincronizzata ma **obsoleta** — meglio usare `ConcurrentHashMap`.

---

## Iterazione su una Map

### 1️⃣ Usando `entrySet()`

```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "Pippo");
map.put(2, "Pluto");
map.put(3, "Paperino");

for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println("Chiave: " + entry.getKey() + ", Valore: " + entry.getValue());
}
```

---

### 2️⃣ Usando `keySet()` e `values()`

```java
for (Integer key : map.keySet()) {
    System.out.println("Chiave: " + key);
}
for (String value : map.values()) {
    System.out.println("Valore: " + value);
}
```

---

## Esempio con `Iterator`

```java
Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
while (it.hasNext()) {
    Map.Entry<Integer, String> entry = it.next();
    System.out.println(entry.getKey() + " → " + entry.getValue());
}
```

---

## SortedMap e TreeMap: metodi specifici

| Metodo                           | Descrizione                                        |
| -------------------------------- | -------------------------------------------------- |
| `Comparator comparator()`        | Restituisce il comparatore usato per l’ordinamento |
| `K firstKey()`                   | Chiave minima                                      |
| `K lastKey()`                    | Chiave massima                                     |
| `SortedMap subMap(K from, K to)` | Porzione compresa tra due chiavi                   |
| `SortedMap headMap(K to)`        | Chiavi minori di `to`                              |
| `SortedMap tailMap(K from)`      | Chiavi maggiori o uguali a `from`                  |

---

### Esempio: sottoMappe con TreeMap

```java
SortedMap<Integer, String> numeri = new TreeMap<>();

numeri.put(1, "Uno");
numeri.put(2, "Due");
numeri.put(3, "Tre");
numeri.put(4, "Quattro");
numeri.put(5, "Cinque");

System.out.println("HeadMap(<3): " + numeri.headMap(3));
System.out.println("TailMap(3): " + numeri.tailMap(3));
System.out.println("SubMap(2,5): " + numeri.subMap(2, 5));
```

**Output:**

```
HeadMap(<3): {1=Uno, 2=Due}
TailMap(3): {3=Tre, 4=Quattro, 5=Cinque}
SubMap(2,5): {2=Due, 3=Tre, 4=Quattro}
```

---

## Confronto tra implementazioni

| Caratteristica   | **HashMap**                 | **LinkedHashMap**      | **TreeMap**             | **Hashtable**             |
| ---------------- | --------------------------- | ---------------------- | ----------------------- | ------------------------- |
| Ordinamento      | ❌ Nessuno                   | ✅ Inserimento          | ✅ Naturale / Comparator | ❌ Nessuno                 |
| Chiavi duplicate | ❌                           | ❌                      | ❌                       | ❌                         |
| Valori duplicati | ✅                           | ✅                      | ✅                       | ✅                         |
| Thread-safe      | ❌                           | ❌                      | ❌                       | ✅                         |
| Null come chiave | ✅ (una sola)                | ✅ (una sola)           | ❌                       | ❌                         |
| Null come valore | ✅                           | ✅                      | ❌                       | ❌                         |
| Prestazioni      | ⚡ O(1)                      | ⚡ O(1)                 | 🕓 O(log n)             | 🐢 O(1), ma sincronizzata |
| Uso tipico       | Accesso veloce senza ordine | Iterazione prevedibile | Mappa ordinata          | Accesso sincronizzato     |

---

## Esempio finale comparativo

```java
Map<String, Integer> hashMap = new HashMap<>();
Map<String, Integer> linkedMap = new LinkedHashMap<>();
Map<String, Integer> treeMap = new TreeMap<>();

for (String k : List.of("B", "A", "C")) {
    hashMap.put(k, 1);
    linkedMap.put(k, 1);
    treeMap.put(k, 1);
}

System.out.println("HashMap: " + hashMap);
System.out.println("LinkedHashMap: " + linkedMap);
System.out.println("TreeMap: " + treeMap);
```

**Output:**

```
HashMap: {A=1, B=1, C=1}     // ordine interno (non garantito)
LinkedHashMap: {B=1, A=1, C=1} // ordine di inserimento
TreeMap: {A=1, B=1, C=1}       // ordine naturale
```

---

## Riepilogo

| Tipo            | Ordinamento   | Thread-safe | Null | Complessità media | Uso consigliato            |
| --------------- | ------------- | ----------- | ---- | ----------------- | -------------------------- |
| `HashMap`       | ❌ Nessuno     | ❌ No        | ✅ Sì | O(1)              | Mappa veloce non ordinata  |
| `LinkedHashMap` | ✅ Inserimento | ❌ No        | ✅ Sì | O(1)              | Ordine prevedibile         |
| `TreeMap`       | ✅ Naturale    | ❌ No        | ❌ No | O(log n)          | Mappa ordinata             |
| `Hashtable`     | ❌ Nessuno     | ✅ Sì        | ❌ No | O(1)              | Uso legacy / sincronizzato |

---

📘 *Fonte: Manuale Java – Claudio De Sio Cesari (rielaborata e aggiornata da M. Boglia)*

---
# Il package java.time

Il package `java.time`, introdotto in Java 8, fornisce un’API moderna per la gestione di date, orari e zone temporali, sostituendo classi precedenti come `Date` e `Calendar`. Offre classi immutabili e thread-safe, semplificando la gestione e manipolazione di date e orari.

---

### 1. **LocalDate**

- **Descrizione**: Rappresenta una data (anno, mese e giorno) senza informazioni sull’orario e senza fuso orario. Utile per rappresentare compleanni, anniversari, e date specifiche.
- **Principali Metodi**:
  - `now()`: Restituisce la data corrente.
  - `of(int year, int month, int dayOfMonth)`: Crea un’istanza per una data specifica.
  - `plusDays(long days)`: Aggiunge giorni alla data.
  - `getDayOfWeek()`: Restituisce il giorno della settimana.

---

### 2. **LocalTime**

- **Descrizione**: Rappresenta solo un orario (ore, minuti, secondi, nanosecondi) senza data né fuso orario.
- **Principali Metodi**:
  - `now()`: Restituisce l’orario corrente.
  - `of(int hour, int minute)`: Crea un’istanza per un orario specifico.
  - `plusHours(long hours)`: Aggiunge ore all’orario.
  - `getHour()`: Restituisce l’ora.

---

### 3. **LocalDateTime**

- **Descrizione**: Rappresenta una data e un orario senza fuso orario. È una combinazione di `LocalDate` e `LocalTime`.
- **Principali Metodi**:
  - `now()`: Restituisce la data e l’orario corrente.
  - `of(int year, int month, int dayOfMonth, int hour, int minute)`: Crea un’istanza con data e orario specifici.
  - `plusDays(long days)`: Aggiunge giorni alla data.
  - `toLocalDate()`: Estrae solo la data.

---

### 4. **ZonedDateTime**

- **Descrizione**: Rappresenta una data e un orario con informazioni sul fuso orario, utile per rappresentare orari specifici in diverse zone geografiche.
- **Principali Metodi**:
  - `now(ZoneId zone)`: Restituisce la data e orario corrente in una zona specifica.
  - `of(int year, int month, int dayOfMonth, int hour, int minute, ZoneId zone)`: Crea un’istanza con data, orario e zona specifici.
  - `withZoneSameInstant(ZoneId zone)`: Converte l’istanza in una nuova zona mantenendo l’ora istantanea.

---

### 5. **Instant**

- **Descrizione**: Rappresenta un punto preciso sulla linea del tempo (in millisecondi da "Epoch Time", 1 gennaio 1970 UTC).
- **Principali Metodi**:
  - `now()`: Restituisce l’istante corrente.
  - `plusSeconds(long seconds)`: Aggiunge secondi all’istante.
  - `toEpochMilli()`: Restituisce il valore dell’istante in millisecondi.

---

### 6. **Duration**

- **Descrizione**: Rappresenta un intervallo di tempo in ore, minuti, secondi e nanosecondi, utile per misurare intervalli tra due istanti.
- **Principali Metodi**:
  - `between(Temporal startInclusive, Temporal endExclusive)`: Calcola la durata tra due istanti.
  - `plusHours(long hours)`: Aggiunge ore alla durata.
  - `toMinutes()`: Restituisce la durata in minuti.

---

### 7. **Period**

- **Descrizione**: Rappresenta un periodo di tempo in anni, mesi e giorni, utile per rappresentare intervalli come "2 anni e 3 mesi".
- **Principali Metodi**:
  - `ofYears(int years)`: Crea un periodo di un certo numero di anni.
  - `between(LocalDate startDate, LocalDate endDate)`: Calcola il periodo tra due date.
  - `getYears()`: Restituisce gli anni del periodo.

---

### 8. **Year** e **YearMonth**

- **Descrizione**: `Year` rappresenta un anno, mentre `YearMonth` rappresenta una combinazione di anno e mese.
- **Principali Metodi**:
  - `now()`: Restituisce l’anno corrente (per `Year`) o anno e mese corrente (per `YearMonth`).
  - `isLeap()`: Verifica se un anno è bisestile.
  - `atMonth(int month)`: Crea un `YearMonth` a partire da un anno e un mese.

---

### 9. **MonthDay**

- **Descrizione**: Rappresenta una combinazione di mese e giorno, senza anno. È utile per date ricorrenti come compleanni.
- **Principali Metodi**:
  - `now()`: Restituisce il mese e il giorno correnti.
  - `of(int month, int dayOfMonth)`: Crea un’istanza con un mese e giorno specifico.
  - `isValidYear(int year)`: Verifica se la data è valida in un anno specifico (utile per 29 febbraio).

---

### 10. **ZoneId** e **ZoneOffset**

- **Descrizione**: `ZoneId` rappresenta un fuso orario e `ZoneOffset` rappresenta una differenza di ore e minuti rispetto a UTC.
- **Principali Metodi**:
  - `of(String zoneId)`: Restituisce un’istanza di `ZoneId` per un fuso orario specifico.
  - `getAvailableZoneIds()`: Restituisce tutti i fusi orari disponibili.
  - `ofHours(int hours)`: Crea un `ZoneOffset` di un certo numero di ore rispetto a UTC.

---

### 11. **Clock**

- **Descrizione**: Fornisce l’ora corrente, consentendo il controllo dell'ora per test e altre esigenze. Può essere utilizzato per ottenere l'ora corrente di `Instant`, `LocalDateTime`, ecc.
- **Principali Metodi**:
  - `systemUTC()`: Restituisce l’orologio di sistema in UTC.
  - `systemDefaultZone()`: Restituisce l’orologio di sistema nella zona predefinita.
  - `instant()`: Restituisce l’istante corrente dell’orologio.

---

### 12. **TemporalAdjusters**

- **Descrizione**: Classe di utilità che fornisce implementazioni predefinite di `TemporalAdjuster` per manipolare facilmente le date.
- **Principali Metodi**:
  - `firstDayOfMonth()`: Regola una data al primo giorno del mese.
  - `lastDayOfMonth()`: Regola una data all’ultimo giorno del mese.
  - `next(DayOfWeek dayOfWeek)`: Regola una data al prossimo giorno della settimana specificato.

---

Il package `java.time` fornisce una gestione moderna e flessibile del tempo in Java, rendendo semplice e sicuro lavorare con date, orari e fusi orari in modo immutabile e thread-safe.
---
# Internazionalizzazione e localizzazione

L'internazionalizzazione consente a un'applicazione di adattarsi in modo automatico alle convenzioni in uso in una particolare lingua o regione.

La localizzazione permette l'adattamento del software a una particolare regione aggiungendo all'applicazione tutte quelle parti che dipendono dalla regione stessa.

Occorre tener presente che, nella maggior parte dei casi, con internazionalizzazione si intendono entrambi gli aspetti.

---

## CLASSE Locale

```java
nomeLocale = new Locale("language", "country", ["variant"]);
```

La classe Locale  astrae il concetto di "zona" sia dal punto di vista linguistico che geografico. 

Molte rappresentazioni di numerose altre classi dipendono da Locale. 
Il package java.text fornisce gli strumenti per la formattazione del testo. 

Alcune sue classi possiedono metodi che usano Locale.
Un esempio è la classe NumberFormat che possiede metodi che usano Locale per individuare l'uso della virgola o del punto per i numeri decimali.

---

## Currency

Un altro esempio sono le classi (come Currency) che usano Locale per rappresentare date, orari e valute.

La classe Locale è basata essenzialmente su tre variabili: language, country e variant.

I valori dei parametri passati si riferiscono a precisi simboli definiti dallo standard ISO.

La prima variabile si riferisce al linguaggio, ovvero alla lingua. 
Viene specificata mediante due lettere minuscole rappresentative della zona (esempi: Italia = it, Stati Uniti = us).

La seconda variabile si riferisce permette di indicare la regione geografica. 

Ciò torna utile quando in una stessa nazione non necessariamente si parla un'unica lingua. 

Viene specificata mediante due lettere maiuscole (es: Svizzera italiana = it_CH, Svizzera tedesca = de_CH).

La terza variabile (opzionale) permette la specifica di strutture personalizzate implementate, ad esempio, da particolari tipi di browser.

---


```java
// creazione di un Locale con due parametri
Italia = new Locale("it", "IT");
America = new Locale("en", "US");
Inghilterra = new Locale("en", "UK");

// creazione di un Locale col parametro opzionale
nordAmerica = new Locale("en", "US", "NORTH");
unixLocale = new Locale("it", "IT", "UNIX");
windowsLocale = new Locale("it", "IT", "WINDOWS");
```
Molti Locale sono sicuramente più usati di altri, per questi ultimi sono disponibili delle costanti facilmente accessibili.

```java
America = Locale.US;
CanadaFrancesce = Locale.CANAD_FRENCH;
```
La classe Locale possiede, inoltre, alcuni metodi che restituiscono informazioni sulla zona.

---

## CLASSE ResourceBundle

`nomeResBundle = ResourceBundle.getBundle("nomeBundle", nomeLocale)`

Un ruolo molto importante nel processo di internazionalizzazione sono le risorse, cioè file di proprietà che fanno riferimento ad un ResourceBundle. 

Sono semplici file di testo che contengono i messaggi, label, bottoni, parole che cambiano da una lingua all'altra e possono essere tradotti anche da persone che non conoscono la programmazione in quanto non si lavora sul codice ma all'esterno dell'applicazione.

Queste risorse hanno un formato molto semplice, in quanto contengono praticamente coppie (Chiave : valore) dove:

* la chiave è una stringa
* il valore è la traduzione, cioè una stringa tradotta nella lingua del particolare Locale

---

Per creare l'oggetto ResourceBundle bisogna invocare il metodo getBundle() passandogli come parametri il nome del bundle (cioè la risorsa) e il nome del locale.

Il metodo getBundle() per prima cosa cerca il file bundle specificato nel costruttore, se non lo trova cerca i file di proprietà di default.

Per recuperare il testo memorizzato nel file di proprietà basta evocare il metodo getString() sull'oggetto ResourceBundle.

```java
mioMessaggio = resourceBundle.getBundle("mioBundle", mioLocale);
String testo = mioMessaggio.getString("header");
System.out.println("testo");
```

---

La stringa che ritorna dall'esempio è quella che corrisponde alla chiave che abbiamo specificato e sarà nella lingua identificata dal Locale.

Poiché nei file properties non variano le chiavi ma le corrispondenti traduzioni, si possono aggiungere altre risorse senza cambiare nulla nel codice.

---

## ESEMPIO Locale e ResourceBundle

### file example.java: 
contiene il codice per la dichiarazione e la gestione del Locale e del ResourceBundle.

```java
/* Example.java */

public class Example {
	static public void main(String[] args) {
		String language;	 // stringa per il codice della lingua
		String country;	 // stringa per il codice del paese

		language = new String("it");
		country = new String("IT");

		Locale mioLocale;	 // dichiarazione Locale
		Resourcebundle testo;	 // dichiarazione ResourceBundle

		presentLocale = new Locale(language, country);
		testo = Resourcebundle.getBundle("MyBundle", mioLocale);

		System.out.println(testo.getString("header"));
		System.out.println(testo.getString("block1"));
	}
}
```

---

## I file `.properties`

```java

/* MyBundle.properties */
header = Welcome to my webpage
block1 = Please follow the directions to learn how to play the game


/* MyBundle_es_ES.properties */
header = Bienvenidos a mi webpage
block1 = Sigue los directions para entender como jugar
```---
# Il package `java.util`

Il package `java.util` è una raccolta fondamentale di classi e interfacce che forniscono strutture dati, gestione del tempo e altre utilità di base. Viene utilizzato in quasi tutte le applicazioni Java per la gestione di collezioni, calendari, operazioni matematiche, generazione di numeri casuali, e altro ancora.

---

### 1. **Collection** e **Collections**

- **Descrizione**: `Collection` è un'interfaccia che rappresenta un gruppo di oggetti (o elementi). `Collections` è una classe di utilità per operazioni di gestione delle collezioni come ordinamento e ricerca.
- **Principali Metodi**:
  - `add(Object obj)`: Aggiunge un elemento alla collezione.
  - `remove(Object obj)`: Rimuove un elemento dalla collezione.
  - `sort(List<T> list)`: Ordina gli elementi in una lista.
  - `binarySearch(List<? extends Comparable<? super T>> list, T key)`: Cerca un elemento in una lista ordinata.

---

### 2. **List**, **ArrayList** e **LinkedList**

- **Descrizione**: `List` è un'interfaccia per una sequenza ordinata di elementi. `ArrayList` e `LinkedList` sono implementazioni concrete. `ArrayList` è basata su un array dinamico, mentre `LinkedList` è una lista doppiamente collegata.
- **Principali Metodi**:
  - `get(int index)`: Restituisce l'elemento in una posizione specifica.
  - `add(E element)`: Aggiunge un elemento alla fine.
  - `remove(int index)`: Rimuove l'elemento alla posizione specificata.
  - `size()`: Restituisce la dimensione della lista.

---

### 3. **Set**, **HashSet** e **TreeSet**

- **Descrizione**: `Set` rappresenta una collezione di elementi unici. `HashSet` è basato su una tabella hash, mentre `TreeSet` implementa un set ordinato tramite un albero di ricerca binario.
- **Principali Metodi**:
  - `add(E element)`: Aggiunge un elemento al set.
  - `remove(Object obj)`: Rimuove un elemento dal set.
  - `contains(Object obj)`: Verifica se un elemento è presente.
  - `size()`: Restituisce la dimensione del set.

---

### 4. **Map**, **HashMap** e **TreeMap**

- **Descrizione**: `Map` è un'interfaccia che associa chiavi a valori. `HashMap` utilizza una tabella hash, mentre `TreeMap` ordina le coppie chiave-valore.
- **Principali Metodi**:
  - `put(K key, V value)`: Aggiunge una coppia chiave-valore alla mappa.
  - `get(Object key)`: Restituisce il valore associato a una chiave.
  - `remove(Object key)`: Rimuove la coppia chiave-valore per una chiave specifica.
  - `containsKey(Object key)`: Verifica la presenza di una chiave.

---

### 5. **Queue** e **PriorityQueue**

- **Descrizione**: `Queue` è un'interfaccia che rappresenta una coda di elementi, dove gli elementi vengono inseriti e recuperati in base a una politica FIFO. `PriorityQueue` è una coda con priorità ordinata in base all'ordine naturale degli elementi.
- **Principali Metodi**:
  - `add(E element)`: Aggiunge un elemento alla coda.
  - `poll()`: Rimuove e restituisce la testa della coda.
  - `peek()`: Restituisce la testa della coda senza rimuoverla.

---

### 6. **Iterator** e **ListIterator**

- **Descrizione**: `Iterator` è un'interfaccia per iterare sugli elementi di una collezione. `ListIterator` estende `Iterator` e permette iterazioni bidirezionali.
- **Principali Metodi**:
  - `hasNext()`: Verifica se ci sono altri elementi.
  - `next()`: Restituisce il prossimo elemento.
  - `remove()`: Rimuove l'ultimo elemento restituito dall'iteratore.
  - `hasPrevious()`: Verifica la presenza di un elemento precedente (solo in `ListIterator`).

---

### 7. **Calendar** e **GregorianCalendar**

- **Descrizione**: `Calendar` è una classe astratta per la gestione di date e orari. `GregorianCalendar` è un'implementazione che supporta il calendario gregoriano.
- **Principali Metodi**:
  - `get(int field)`: Restituisce il valore di un campo di data specifico (es. anno, mese).
  - `set(int field, int value)`: Imposta il valore di un campo di data specifico.
  - `add(int field, int amount)`: Aggiunge un valore a un campo specifico.

---

### 8. **Date**

- **Descrizione**: `Date` rappresenta una data e un orario in Java, anche se è stata sostituita da `Calendar` e dalle nuove API di tempo introdotte in Java 8.
- **Principali Metodi**:
  - `getTime()`: Restituisce il tempo in millisecondi dall'epoca (1 gennaio 1970).
  - `after(Date when)`: Verifica se la data è successiva a una data specificata.
  - `before(Date when)`: Verifica se la data è precedente a una data specificata.

---

### 9. **Random**

- **Descrizione**: Classe per la generazione di numeri casuali.
- **Principali Metodi**:
  - `nextInt()`: Restituisce un numero intero casuale.
  - `nextDouble()`: Restituisce un numero double casuale tra 0.0 e 1.0.
  - `nextBoolean()`: Restituisce un valore booleano casuale.

---

### 10. **Timer** e **TimerTask**

- **Descrizione**: `Timer` è una classe per pianificare l'esecuzione di compiti ripetuti. `TimerTask` rappresenta un compito che può essere pianificato per l'esecuzione.
- **Principali Metodi**:
  - `schedule(TimerTask task, long delay)`: Pianifica un compito per l'esecuzione dopo un certo ritardo.
  - `cancel()`: Cancella un compito pianificato.

---

### 11. **Scanner**

- **Descrizione**: Classe per l'input di dati da varie fonti come tastiera, file o stringhe.
- **Principali Metodi**:
  - `nextInt()`: Restituisce il prossimo token come intero.
  - `nextLine()`: Legge la riga successiva come stringa.
  - `close()`: Chiude lo scanner.

---

Queste classi sono cruciali per la gestione delle strutture dati e di altri aspetti delle applicazioni Java, e vengono usate frequentemente per una vasta gamma di operazioni di programmazione.
---
# Espressioni regolari

Le espressioni regolari (regex o regexp) sono potenti strumenti per la ricerca e la manipolazione di testo basato su modelli di stringhe. Una regex è una sequenza di caratteri che definisce un modello di ricerca. Questi modelli possono essere utilizzati in vari contesti, come la validazione di stringhe, la ricerca di testo in un documento o la sostituzione di parti di una stringa.

Ecco alcune informazioni fondamentali sulle espressioni regolari:

---

### Sintassi di Base

- **Caratteri Literal:** I caratteri normali (non speciali) nella regex corrispondono esattamente a se stessi. Ad esempio, il pattern `"abc"` corrisponde alla stringa "abc".

- **Meta-Caratteri:** Alcuni caratteri hanno significati speciali nella regex e sono noti come meta-caratteri. Alcuni esempi di meta-caratteri comuni includono `^`, `$`, `*`, `+`, `?`, `.`, `()`, `[]`, `{}`, etc.

---

### Quantificatori

- `*`: Corrisponde a zero o più occorrenze del carattere precedente. Ad esempio, `"a*"` corrisponde a "", "a", "aa", "aaa", ecc.

- `+`: Corrisponde a una o più occorrenze del carattere precedente. Ad esempio, `"a+"` corrisponde a "a", "aa", "aaa", ecc., ma non a "".

- `?`: Rende facoltativo il carattere precedente, corrispondendo a zero o una sola occorrenza.

- `{n}`: Corrisponde esattamente a n occorrenze del carattere precedente. Ad esempio, `"a{3}"` corrisponde a "aaa".

- `{n,}`: Corrisponde a n o più occorrenze del carattere precedente.

- `{n,m}`: Corrisponde a un numero compreso tra n e m di occorrenze del carattere precedente.

---

### Gruppi e Parentesi

- `()`: Utilizzati per raggruppare parti di una regex. Consentono di applicare quantificatori o altri costrutti a un gruppo di caratteri.

- `|`: Funge da operatore logico OR. Ad esempio, `"a|b"` corrisponde a "a" o "b".

---

### Caratteri Speciali

- `.` (punto): Corrisponde a qualsiasi singolo carattere, ad eccezione di un carattere di nuova riga.

- `^`: Indica l'inizio di una riga.

- `$`: Indica la fine di una riga.

- `\`: Utilizzato per l'escape di caratteri speciali o per introdurre sequenze di escape speciali.

---

### Classi di Caratteri

- `[]`: Definisce una classe di caratteri. Ad esempio, `"[aeiou]"` corrisponde a qualsiasi vocale.

- `[^]`: Corrisponde a qualsiasi carattere che non è nell'insieme specificato.

---

### Caratteri di Escape

- `\d`: Corrisponde a un carattere numerico.

- `\w`: Corrisponde a un carattere alfanumerico o all'underscore.

- `\s`: Corrisponde a uno spazio bianco (spazio, tabulazione, nuova riga).

---

### Esempi di Utilizzo

- **Email Validation:**

  ```regex
  ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$
  ```

- **Data (Formato MM/DD/YYYY):**

  ```regex
  ^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/\d{4}$
  ```

- **Ricerca di URL:**

  ```regex
  https?://(?:www\.)?[a-zA-Z0-9-]+\.[a-zA-Z]{2,}
  ```

---

### Strumenti Online

Ci sono vari strumenti online che consentono di testare ed esplorare espressioni regolari, come Regex101 o RegExr. Questi strumenti sono utili per sperimentare e capire come funzionano le espressioni regolari.

---

### Conclusioni

Le espressioni regolari sono uno strumento potente e flessibile per manipolare e analizzare stringhe di testo. Tuttavia, possono diventare complesse e difficili da leggere a causa della loro sintassi. Pratica ed esperienza sono chiave per diventare competenti nell'uso delle espressioni regolari.

---

## Espressioni regolari in Java

In Java, le espressioni regolari sono implementate nel package `java.util.regex`. L'utilizzo delle espressioni regolari in Java coinvolge principalmente due classi: `Pattern` e `Matcher`.

Ecco una breve panoramica sull'uso delle espressioni regolari in Java:

---

### Creazione di un Modello (Pattern):

```java
import java.util.regex.Pattern;

// Creare un pattern per cercare sequenze di tre cifre
Pattern pattern = Pattern.compile("\\d{3}");
```

---

### Ricerca di Corrispondenze (Matcher):

```java
import java.util.regex.Matcher;

// Creare un matcher per cercare il pattern nella stringa di input
Matcher matcher = pattern.matcher("123-456-789");

// Verificare se c'è una corrispondenza
if (matcher.find()) {
    System.out.println("Corrispondenza trovata: " + matcher.group());
} else {
    System.out.println("Nessuna corrispondenza trovata.");
}
```

---

### Alcuni Esempi di Utilizzo:

#### Validazione di un Indirizzo Email:

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    private static final String EMAIL_PATTERN =
        "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private final Pattern pattern;

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean isValid(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator();
        String testEmail = "test@example.com";

        if (validator.isValid(testEmail)) {
            System.out.println("L'indirizzo email è valido.");
        } else {
            System.out.println("L'indirizzo email non è valido.");
        }
    }
}
```

---

#### Estrazione di Numeri Telefonici da una Stringa:

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExtractor {
    public static void main(String[] args) {
        String inputText = "Il mio numero è 123-456-7890 e il numero di casa è 987-654-3210.";

        Pattern pattern = Pattern.compile("\\b\\d{3}-\\d{3}-\\d{4}\\b");
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()) {
            System.out.println("Numero telefonico trovato: " + matcher.group());
        }
    }
}
```

---

Questi sono solo esempi di base e le espressioni regolari possono diventare molto complesse a seconda delle esigenze. È possibile combinare diversi simboli e costrutti per creare modelli avanzati. La documentazione ufficiale di Java offre una guida completa sulla sintassi delle espressioni regolari: [Java Regex Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html).

---

#### Ricercare una stringa all’interno di un’altra.

```java
String regex = "[a-zA-Z0-9._%-]+@[ a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
String input = "pippo@gmail.com;pluto@gmail.com;paperino@gmail.com";

Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(input);

while (matcher.find())
	System.out.println(matcher.group());
```

Il metodo **find()** della classe Matcher, ricerca una sottostringa all’interno della stringa di ingresso che rispetta il formato dell’espressione regolare. Il metodo **find()** funziona come un iterator, cioè aggiorna gli indici ad ogni iterazione.
---
# Moduli

In Java, i moduli sono una caratteristica introdotta a partire da Java 9 per migliorare la modularità e l'organizzazione del codice. Consentono di organizzare le classi e i pacchetti in unità logiche più grandi chiamate moduli. Questi moduli possono essere definiti all'interno di un'applicazione Java utilizzando un file speciale chiamato `module-info.java`.

Ecco una spiegazione più dettagliata dei moduli in Java:

1. **Moduli**: Un modulo è una collezione logica di classi e pacchetti che formano un'unità funzionale separata all'interno di un'applicazione Java. I moduli consentono di definire le dipendenze tra i moduli stessi, in modo che l'applicazione possa essere suddivisa in componenti più gestibili.

2. **File `module-info.java`**: Ogni modulo è definito all'interno di un file chiamato `module-info.java`. Questo file viene collocato nella radice del modulo e contiene le informazioni chiave sul modulo, come il suo nome, le dipendenze da altri moduli e quali pacchetti espone o nasconde.

3. **Esportazione e Apertura dei Pacchetti**: Il file `module-info.java` può specificare quali pacchetti del modulo sono esportati e quindi accessibili da altri moduli. Può anche specificare pacchetti che sono aperti per la riflessione, consentendo l'accesso ai loro membri da parte di altri moduli.

4. **Dipendenze tra Moduli**: Un modulo può dichiarare le sue dipendenze da altri moduli nel file `module-info.java`. Questo garantisce che i moduli dipendenti abbiano accesso ai pacchetti esportati dal modulo dipendente.

5. **Classpath vs. Modulo Path**: In Java, è possibile eseguire un'applicazione utilizzando il classpath tradizionale o il modulo path introdotto con i moduli. L'uso dei moduli path offre un migliore isolamento tra i moduli e un controllo più rigoroso sulle dipendenze.

Ecco un esempio semplice di un file `module-info.java`:

```java
module mioModulo {
    requires altroModulo;
    exports com.mioModulo.pacchetto;
    opens com.mioModulo.pacchetto.reflection;
}
```

In questo esempio:

- Il modulo `mioModulo` richiede il modulo `altroModulo`.
- Il modulo `mioModulo` esporta il pacchetto `com.mioModulo.pacchetto` in modo che altri moduli possano accedervi.
- Il pacchetto `com.mioModulo.pacchetto.reflection` è aperto per la riflessione.

L'introduzione dei moduli in Java è stata una risposta alla necessità di creare applicazioni più modulari e di gestire meglio le dipendenze tra le librerie. Ciò aiuta a migliorare la manutenibilità e la sicurezza delle applicazioni Java.


---

Un modulo è un gruppo di pacchetti e risorse strettamente correlati insieme a un nuovo file descrittore del modulo.

In altre parole, è un'astrazione "pacchetto di pacchetti Java" che ci permette di rendere il nostro codice ancora più riutilizzabile.

---

## pacchetti

I pacchetti all'interno di un modulo sono identici ai pacchetti Java che abbiamo utilizzato sin dall'inizio di Java.

Quando creiamo un modulo, organizziamo il codice internamente in pacchetti proprio come abbiamo fatto in precedenza con qualsiasi altro progetto.

Oltre a organizzare il nostro codice, i pacchetti vengono utilizzati per determinare quale codice è pubblicamente accessibile al di fuori del modulo.

---

## Risorse

Ogni modulo è responsabile delle proprie risorse, come i file multimediali o di configurazione.

In precedenza, mettevamo tutte le risorse nel livello principale del nostro progetto e gestivamo manualmente quali risorse appartenevano a parti diverse dell'applicazione.

Con i moduli, possiamo spedire immagini e file XML richiesti con il modulo che ne ha bisogno, rendendo i nostri progetti molto più facili da gestire.

---

## Descrittore del modulo

Quando creiamo un modulo, includiamo un file descrittore che definisce diversi aspetti del nostro nuovo modulo:

* Nome: il nome del nostro modulo
* Dipendenze: un elenco di altri moduli da cui dipende questo modulo
* Pacchetti pubblici: un elenco di tutti i pacchetti che vogliamo accessibili dall'esterno del modulo
* Servizi offerti: possiamo fornire implementazioni di servizi che possono essere utilizzate da altri moduli
* Servizi consumati: consente al modulo corrente di essere un consumatore di un servizio
* Autorizzazioni di _reflection_: consente esplicitamente ad altre classi di utilizzare la _reflection_ per accedere ai membri privati ​​di un pacchetto

Le regole di denominazione dei moduli sono simili a come denominiamo i pacchetti (i punti sono consentiti, i trattini no). È molto comune fare nomi in stile progetto (mio.modulo) o Reverse-DNS (it.bogliaccino.miomodulo).

Dobbiamo elencare tutti i pacchetti che vogliamo che siano pubblici perché per impostazione predefinita tutti i pacchetti sono privati ​​del modulo.

Lo stesso vale per la _reflection_. Per impostazione predefinita, non possiamo usare la _reflection_ sulle classi che importiamo da un altro modulo.

Più avanti nell'articolo, vedremo esempi di come utilizzare il file descrittore del modulo.

---

## Tipi di modulo

Esistono **quattro** tipi di moduli nel nuovo sistema di moduli:

* **Moduli di sistema** - Questi sono i moduli elencati quando eseguiamo il comando list-modules sopra. Includono i moduli Java SE e JDK.
* **Moduli dell'applicazione**: questi moduli sono ciò che di solito vogliamo creare quando decidiamo di utilizzare i moduli. Sono denominati e definiti nel file module-info.class compilato incluso nel JAR assemblato.
* **Moduli automatici**: possiamo includere moduli non ufficiali aggiungendo file JAR esistenti al percorso del modulo. Il nome del modulo sarà derivato dal nome del JAR. I moduli automatici avranno pieno accesso in lettura a ogni altro modulo caricato dal percorso.
* **Modulo senza nome**: quando una classe o un JAR viene caricata nel percorso di classe, ma non nel percorso del modulo, viene automaticamente aggiunto al modulo senza nome. È un modulo generico per mantenere la compatibilità con le versioni precedenti del codice Java scritto in precedenza.

---

## Distribuzione

I moduli possono essere distribuiti in due modi: come file JAR o come progetto compilato "esploso". Questo, ovviamente, è uguale a qualsiasi altro progetto Java, quindi non dovrebbe sorprendere.

Possiamo creare progetti multi-modulo composti da una “applicazione principale” e diversi moduli di libreria.

Dobbiamo stare attenti però perché possiamo avere solo un modulo per file JAR.

Quando impostiamo il nostro file di build, dobbiamo assicurarci di raggruppare ogni modulo nel nostro progetto come un jar separato.

---

### Moduli predefiniti

Quando installiamo Java 9, possiamo vedere che JDK ora ha una nuova struttura.

Hanno preso tutti i pacchetti originali e li hanno spostati nel nuovo sistema di moduli.

Possiamo vedere cosa sono questi moduli digitando nella riga di comando:

`java --list-modules`

Questi moduli sono suddivisi in quattro gruppi principali: java, javafx, jdk e Oracle.

I moduli java sono le classi di implementazione per la specifica del linguaggio SE principale.

I moduli javafx sono le librerie dell'interfaccia utente FX.

Tutto ciò che serve al JDK stesso è conservato nei moduli jdk.

Infine, tutto ciò che è specifico di Oracle è nei moduli Oracle.

---

## Dichiarazioni del modulo

Per impostare un modulo, abbiamo bisogno di mettere un file speciale alla radice dei nostri pacchetti chiamato `module-info.java`

Questo file è noto come descrittore del modulo e contiene tutti i dati necessari per creare e utilizzare il nostro nuovo modulo.

Costruiamo il modulo con una dichiarazione il cui corpo è vuoto o composto da direttive del modulo:

```java
module myModuleName {
// tutte le direttive sono facoltative
}
```

Iniziamo la dichiarazione del modulo con la parola chiave module seguita dal nome del modulo.

Il modulo funzionerà con questa dichiarazione, ma normalmente avremo bisogno di più informazioni.

È qui che entrano in gioco le direttive del modulo.

[leggi tutto](https://www.baeldung.com/java-9-modularity)

---

### require

La nostra prima direttiva è necessaria. Questa direttiva del modulo ci consente di dichiarare le dipendenze del modulo:

```java
module mio.modulo {
require modulo.nome;
}
```

Ora, mio.modulo ha sia una dipendenza runtime che una dipendenza in fase di compilazione da modulo.nome.

E tutti i tipi pubblici esportati da una dipendenza sono accessibili dal nostro modulo quando usiamo questa direttiva.

---

### require statico

A volte scriviamo codice che fa riferimento a un altro modulo, ma che gli utenti della nostra libreria non vorranno mai usare.

Ad esempio, potremmo scrivere una funzione di utilità che stampi abbastanza il nostro stato interno quando è presente un altro modulo di registrazione. Ma non tutti i consumatori della nostra libreria vorranno questa funzionalità e non vogliono includere una libreria di registrazione aggiuntiva.

In questi casi, vogliamo utilizzare una dipendenza opzionale. Utilizzando la direttiva require static, creiamo una dipendenza solo in fase di compilazione:

```java
module mio.modulo {
require statico modulo.nome;
}
```

---

### require Transitive

Di solito lavoriamo con le biblioteche per semplificarci la vita.

Tuttavia, dobbiamo assicurarci che qualsiasi modulo che introduce il nostro codice introduca anche queste dipendenze "transitive" aggiuntive o non funzionerà.

Fortunatamente, possiamo utilizzare la direttiva transitiva richiede per costringere qualsiasi consumatore a valle a leggere anche le nostre dipendenze richieste:

```java
module mio.modulo {
require transitivo modulo.nome;
}
```

Ora, quando uno sviluppatore richiede mio.modulo, non dovrà anche dire richiede modulo.nome affinché il nostro modulo funzioni ancora.

---

### Esportazioni

Per impostazione predefinita, un modulo non espone nessuna delle sue API ad altri moduli. Questo forte incapsulamento è stato uno dei motivi principali per la creazione del sistema di moduli in primo luogo.

Il nostro codice è significativamente più sicuro, ma ora dobbiamo aprire esplicitamente la nostra API al mondo intero se vogliamo che sia utilizzabile.

Usiamo la direttiva export per esporre tutti i membri pubblici del pacchetto denominato:

```java
module mio.modulo {
esporta com.my.package.name;
}
```

Ora, quando qualcuno richiede mio.modulo, avrà accesso ai tipi pubblici nel nostro pacchetto com.my.package.name, ma non a qualsiasi altro pacchetto.

---

### Esportazioni ... in

Possiamo usare le esportazioni ... per aprire le nostre classi pubbliche al mondo.

Ma cosa succede se non vogliamo che il mondo intero acceda alla nostra API?

Possiamo limitare quali moduli hanno accesso alle nostre API utilizzando le esportazioni ... alla direttiva.

Analogamente alla direttiva sulle esportazioni, dichiariamo un pacchetto come esportato. Ma elenchiamo anche quali moduli stiamo consentendo di importare questo pacchetto come richiesto. Vediamo come appare:

```java
module mio.modulo {
esporta com.my.package.name in com.specific.package;
}
```

---

### uses

Un servizio è un'implementazione di un'interfaccia specifica o di una classe astratta che può essere utilizzata da altre classi.

Designiamo i servizi che il nostro modulo consuma con la direttiva uses.

Nota che il nome della classe che usiamo è l'interfaccia o la classe astratta del servizio, non la classe di implementazione:

```java
module mio.modulo {
uses class.name;
}
```

Dovremmo notare qui che c'è una differenza tra una direttiva require e la direttiva uses.

Potremmo richiedere un modulo che fornisce un servizio che vogliamo utilizzare, ma quel servizio implementa un'interfaccia da una delle sue dipendenze transitive.

Invece di forzare il nostro modulo a richiedere tutte le dipendenze transitive per ogni evenienza, usiamo la direttiva uses per aggiungere l'interfaccia richiesta al percorso del modulo.

[leggi tutto](https://www.baeldung.com/java-9-modularity)---
# Runtime


* Questa classe astrae il concetto di `runtime` (esecuzione) del programma. Non ha costruttori pubblici e una sua istanza si ottiene chiamando il metodo factory `getRuntime()`.
* Caratteristica interessante di questa classe è permette di eseguire comandi del sistema operativo direttamente da Java, come ad esempio `exec` (di cui esistono più versioni).
* Bisogna tener conto che l’uso della classe Runtime potrebbe **compromettere la portabilità** delle applicazioni, infatti questa classe dipende fortemente dal sistema operativo.

---

## Classe Runtime

Puoi eseguire un comando di sistema, per esempio

* `Runtime.getRuntime().exec("<command>")` 
* `Runtime.getRuntime().exec("tree")` 

Funziona solo per i comandi compresi nel path di ambiente, non funziona con comandi come echo, del, ... 

Per eseguire questi comandi usa `cmd /c` prima del comando. Per esempio
* `Runtime.getRuntime().exec("cmd /c echo echo")`


```java
public static void main(String[] args) {
    String command="netstat";
    try {
        Process process = Runtime.getRuntime().exec(command);
        System.out.println("output stream: "+process.getOutputStream());
        BufferedReader reader=new BufferedReader( new InputStreamReader(process.getInputStream()));
        String s; 
        while ((s = reader.readLine()) != null){
            System.out.println("input stream: " + s);
        }                   
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```---
# Classe StringBuffer

## Un oggetto String

* NON è modificabile
* Una volta creato non possiamo aggiungere, eliminare, modificare caratteri (i metodi visti creano nuove stringhe)
* Tale restrizione è dovuta a ragioni di efficienza

### Le considerazione precedenti non sono vere per la classe StringBuffer

### Esempio

`StringBuffer myStringBuffer = new stringBuffer ("stringa modificabile");

myStringBuffer.setCharAt (8, ‘M'); // Trasforma in "stringa Modificabile"`

---

### Si usa raramente

### Un oggetto StringBuffer non può essere utilizzato per operazioni di I/O

`System.out.println (myStringBuffer.toString());`

### Metodi

* Aggiunta di caratteri
`myStringBuffer.append ("aggiunta");`
* insert
* delete
* reverse

---

I più importanti metodi di cui sono dotati gli oggetti di tipo StringBuffer
--------------------------------------------------------------------------------------

Tipo restituito|Metodi e parametri|Descrizione
---|---|---
StringBuffer|append(boolean b)|Aggiunge il valore b in coda alla stringa. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|append(char c)|Aggiunge il carattere c in coda alla stringa. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|append(char[] c)|Aggiunge i caratteri contenuti nell'array in coda alla stringa. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|append(double d)|Aggiunge il valore di d in coda alla stringa. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|append(float f)|Aggiunge il valore di f in coda alla stringa. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|append(int i)|Aggiunge il valore di i in coda alla stringa. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|append(long l)|Aggiunge il valore di l in coda alla stringa. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|append(Object obj)|Aggiunge il valore di obj.String() in coda alla stringa. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|append(String s)|Aggiunge s in coda alla stringa. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|append(StringBuffer s)|Aggiunge s in coda alla stringa. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
char|chatAt(int i)|Restituisce il carattere alla posizione i.
StringBuffer|delete(int start, int end)|Rimuove tutti i caratteri dall'indice start (incluso) all'indice end (escluso). Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|deleteCharAt(int i)|Rimuove il carattere alla posizione i. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer. 
int|indexOf(String s)|Restituisce la prima posizione della sottostringa s, oppure -1 nel caso tale sottostringa non compaia nell'oggetto di invocazione.
int|indexOfString(String s, int i)|Come il precedente, con la differenza che la ricerca della sottostringa s prende prende piede dalla posizione i.
StringBuffer|insert(int offset, boolean b)|Aggiunge il valore di b alla stringa, inserendolo alla posizione offset. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|insert(int offset, char c)|Aggiunge il carattere c alla stringa, inserendolo alla posizione offset. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|insert(int offset, char[] c)|Aggiunge i caratteri contenuti nell'array alla stringa, inserendoli alla posizione offset. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|insert(int offset, double d)|Aggiunge il valore di d alla stringa, inserendolo alla posizione offset. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|insert(int offset, float f)|Aggiunge il valore di f alla stringa, inserendolo alla posizione offset. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|insert(int offset, int i)|Aggiunge il valore di i alla stringa, inserendolo alla posizione offset. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|insert(int offset, long l)|Aggiunge il valore di l alla stringa, inserendolo alla posizione offset. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|insert(int offset, Object obj)|Aggiunge il valore di obj.toString() in coda alla stringa. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|insert(int offset, String s)|Aggiunge s in coda alla stringa. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
StringBuffer|insert(int offset, StringBuffer s)|Aggiunge s in coda alla stringa. Modifica l'oggetto di invocazione, ed in più restituisce un riferimento allo stesso StringBuffer.
int|length()|Restituisce la dimensione della stringa.
StringBuffer|setCharAt(int i, char c)|Cambia in c il carattere alla posizione i.
void String  toString()|Restituisce un oggetto String con il medesimo contenuto dello StringBuffer di invocazione.
---
# Package `java.util`

Il package java.util contiene una serie di classi utili come il framework "Collections" per gestire collezioni eterogenee di ogni tipo, il modello a eventi, classi per la gestione facilitata delle date e degli orari, classi per la gestione dell’internazionalizzazione e tante altre utilità come un separatore di stringhe (StringTokenizer), un generatore di numeri casuali ecc.

---

## StringTokenizer

### La classe StringTokenizer permette l'estrazione di sottostringhe

* StringTokenizer (String str, String delim)
  * Costruisce un estrattore di token per la stringa str
* delim e' il delimitatore ricercato tra i token estratti
* La classe StringTokenizer mette quindi a disposizione metodi per la gestione dei token
  * public boolean hasMoreTokens()
  * public String nextToken()

### Esempio

// il numero di token e' noto: nome, eta', reddito
String str;
StringTokenizer st = new StringTokenizer(str," ");
// Anche: StringTokenizer st =
//
new StringTokenizer (str);
while (st.hasMoreTokens()){
String token = st.nextToken();
... Integer.parseInt(token) ...
// int eta = Integer.parseInt (st.nextToken ());
// double reddito = Double.parseDouble
//
(st.nextToken ());
}

### Classe StringTokenizer

Spesso risulta necessario manipolare dei token di testo.
Una semplice classe che permette di separare i contenuti di una stringa in più parti, chiamate token, è la classe
__StringTokenizer__.

Questa classe si utilizza solitamente per estrarre le parole di una stringa
L’utilizzo di base è estremamente semplice, occorrono:
una stringa da "navigare", cioè da cui estrarre i token
un delimitatore, che serve per identificare i token
Un token è, quindi, la sequenza massima di caratteri consecutivi che non sono delimitatori.

---

## CREARE OGGETTO STRINGTOKENIZER

Occorre creare in prima istanza l’oggetto StringTokenizer, usando il costruttore dell’omonima classe.

* Il costruttore può accettare da 1 a 3 parametri:
la stringa da cui estrarre i token
il delimitatore, che può essere:
esplicito [st2 – st3]
di default " \t\n\r\f" (notare che il primo delimitatore e uno spazio) [st1]
un booleano che, se settato a true, considera token anche gli stessi delimitatori

```java
StringTokenizer st1 = new StringTokenizer("Stringa da dividere");
StringTokenizer st2 = new StringTokenizer("Stringa sezionata", ";");
StringTokenizer st3 = new StringTokenizer("Ciao Mamma", "a", true);
``` 

Per scandire l’intero testo si può usare un ciclo while con all’interno l’invocazione del metodo hasMoreTokens() che ritorna true se sono presenti altri token, altrimenti false.
Per stampare il token appena recuperato si può invocare il metodo nextToken() sull’oggetto StringTokenizer.

```java
StringTokenizer st = new StringTokenizer("Stringa da dividere");
while (st.hasMoreTokens()) {
 // Due metodi per fare la stessa cosa
System.out.println(st.nextToken());
System.out.println(st.nextElement().toString());
}
```

### Costruttori pubblici

Costruttore|definizione
---|---
StringTokenizer(String str)|Costruisce uno StringTokenizer per la stringa str, che come delimitatori usa i caratteri "\t\n\r\f".
StringTokenizer(String str, String delim)|  Costruisce uno StringTokenizer per la stringa str, che come delimitatori usa i caratteri contenuti nella stringa delim.
StringTokenizer(String str, String delim, boolean returnDelims)|Costruisce uno StringTokenizer per la stringa str, che come delimitatori usa i caratteri contenuti nella stringa delim. Se returnDelims è true, i caratteri divisori verranno restituiti come token.

Metodi pubblici:
Metodo|Definizione
---|---
int countTokens()|Restituisce il numero dei token elaborati.
boolean hasMoreElements()|Come il successivo hasMoreTokens().
boolean hasMoreTokens()|Restituisce true se ci sono ancora dei token da considerare.
Object nextElement()|Restituisce il token successivo, sotto forma di Object.
String nextToken()|Restituisce il token successivo, sotto forma di String.
String nextToken(String delim)|Imposta una nuova serie di caratteri delimitatori, quindi restituisce il token successivo.
---
# UUID

UUID, acronimo di "Universally Unique Identifier", è un identificatore univoco universale. È un identificatore standardizzato a livello globale, definito da RFC 4122, che viene utilizzato per identificare univocamente qualcosa senza bisogno di un'autorità centrale di gestione.

In Java, la classe `java.util.UUID` fornisce metodi per la generazione e la gestione degli UUID. Ecco un esempio di come utilizzare gli UUID in Java:

```java
import java.util.UUID;

public class UUIDExample {
    public static void main(String[] args) {
        // Generazione di un UUID casuale
        UUID uuid1 = UUID.randomUUID();
        System.out.println("Random UUID: " + uuid1);

        // Creazione di un UUID a partire da un array di byte
        byte[] byteArray = {0x01, 0x02, 0x03, 0x04};
        UUID uuid2 = UUID.nameUUIDFromBytes(byteArray);
        System.out.println("UUID from byte array: " + uuid2);

        // Conversione di una stringa UUID in un oggetto UUID
        String uuidString = "550e8400-e29b-41d4-a716-446655440000";
        UUID uuid3 = UUID.fromString(uuidString);
        System.out.println("UUID from string: " + uuid3);

        // Ottenere componenti di un UUID
        System.out.println("Most significant bits: " + uuid1.getMostSignificantBits());
        System.out.println("Least significant bits: " + uuid1.getLeastSignificantBits());
    }
}
```

In questo esempio:

- Utilizziamo il metodo `randomUUID()` per generare un UUID casuale.
- Usiamo il metodo `nameUUIDFromBytes(byte[])` per creare un UUID a partire da un array di byte.
- Utilizziamo il metodo `fromString(String)` per creare un UUID da una stringa UUID valida.
- Utilizziamo i metodi `getMostSignificantBits()` e `getLeastSignificantBits()` per ottenere le parti più e meno significative dell'UUID, rispettivamente.

Gli UUID sono utilizzati in una vasta gamma di contesti, come ad esempio identificatori di risorse in sistemi distribuiti, identificatori di documenti, identificatori di sessione, e altro ancora. Poiché gli UUID sono progettati per essere univoci in modo affidabile, sono particolarmente utili in scenari in cui è necessario evitare collisioni di identificatori.
---
---
