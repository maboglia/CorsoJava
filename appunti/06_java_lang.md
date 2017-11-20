# Package java.lang
* Il package java.lang è il package più importante dell’API di Java, in quanto contiene moltissime classi e interfacce fondamentali per la programmazione Java, tanto che questo package viene importato in automatico in tutti i programmi.
* Oltre alle classe Thread e all’interfaccia Runnable di cui abbiamo parlato nella lezione precedente, questo package contiene classi che già abbiamo utilizzato come la classe String, la Object e la System.
* Ora andremo ad introdurre le classi più utilizzate e famose, in modo tale da avere una visione di insieme del package.

## Classe String
* Le stringhe in Java sono oggetti. 
* La particolarità di questa classe è quella di essere l’unica classe che è possibile istanziare come se fosse un tipo di dato primitivo.

	
```java
int compareTo(String other)
```
	Esegue una comparazione lessicale. Ritorna un intero:
	< 0 se la stringa corrente è minore della stringa other
	= 0 se le due stringhe sono identiche
	> 0 se la stringa corrente è maggiore di other
	
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
* Ad esempio, nelle precedenti lezioni, abbiamo spesso utilizzato il metodo println() della classe PrintStream invocandolo sull’oggetto statico out della classe System.
* Infatti, l’oggetto out è di tipo PrintStream e viene usato per indicare l’output di default del sistema.
* Esiste anche l’oggetto err, anch’esso di tipo PrintStream, che viene usato per segnalare gli errori che avvengono durante l’esecuzione del programma. 
* Solitamente coincide con l’output di cui sopra.
* Infine esiste l’oggetto in che è di tipo InputStream (package System.io di cui parleremo in una delle prossime lezioni), che serve per ricevere il flusso di informazioni dallo standard input. Tipicamente è la tastiera.
* E’ possibile, però, modificare il puntamento di queste tre variabili verso altre fonti di input o di output. Esistono infatti i metodi statici setOut(), setErr() e setIn().

### METODI
Dopo aver parlato delle variabili membro della classe System, diamo uno sguardo ai metodi più interessanti.

* il metodo arraycopy() permette di copiare il contenuto di un array in un altro.

* il metodo exit(int code) che consente di bloccare istantaneamente l’esecuzione del programma. 

```java
if (continua == false) {
	System.err.println("Si è verificato un problema!");
	System.exit(0);
}
```
Altri metodi interessanti sono i metodi 
```java
	setProperty(String key, String value) e 
	getProperty(String key) che servono rispettivamente ad impostare le proprietà del sistema e a recuperare informazioni sulle proprietà del sistema.
```
Gli oggetti di tipo Properties sono specializzazioni di tabelle hash di Java: è possibile pensarli come tabelle che rappresentano coppie chiave-valore.
Per esempio, potremmo ottenere la versione di Java che si sta usando mediante il codice:
```java

System.out.print("Versione Java Runtime Environment (JRE): ");
System.out.println(System.getProperty("java.version"));
    
System.out.print("Directory di installazione Java: ");
System.out.println(System.getProperty("java.home"));
```
Oppure si potrebbe impostare una nuova proprietà mediante il codice:
```java

System.setProperty("Claudio.cognome", "De Sio");
```
Un elenco con tutte le properties di sistema è riportato in basso.

### Classe Runtime
* Questa classe astrae il concetto di runtime (esecuzione) del programma. Non ha costruttori pubblici e una sua istanza si ottiene chiamando il metodo factory getRuntime().
* Caratteristica interessante di questa classe è permette di eseguire comandi del sistema operativo direttamente da Java, come ad esempio exec (di cui esistono più versioni).
* Bisogna tener conto che l’uso della classe Runtime potrebbe compromettere la portabilità delle applicazioni, infatti questa classe dipende fortemente dal sistema operativo.

### Classi wrapper
* Nella versione 1.5 di Java è stata introdotta una funzionalità davvero comoda che viene chiamata boxing (inscatolamento) che permette ai valori dei tipi primitivi di essere convertiti in oggetti, e viceversa. In particolare:
* l’autoboxing è un casting automatico che permette ai valori dei tipi primitivi di essere convertiti in oggetti
* l’unboxing effettua il casting inverso
* Gli oggetti che rappresentano i tipi primitivi sono detti classi wrapper (in italiano "involucro") che sono classi che fanno da contenitore a un tipo di dato primitivo, astraendo proprio il concetto di tipo. 
__N.B. Tutte le classi wrapper sono classi final per cui non possono essere estese.__

* In Java, ogni tipo primitivo possiede una corrispondente classe wrapper: Byte, Short, Integer, Long, Float, Double, Boolean, Character. 
* Ciascuna di queste classi permette di manipolare i valori di tipo primitivo come se fossero valori di oggetti. 
* Spesso abbiamo a che fare con tipi primitivi (int, double, boolean, …) che sono tipi semplici e, quindi, non possiedono metodi. 
* I wrapper, invece, essendo degli oggetti, sono dotati di metodi ed attributi.
* Prima dell’introduzione dell’autoboxing, programmando in Java ci si poteva trovare nella necessità di convertire un tipo primitivo nella sua corrispondente classe wrapper.

```java
Integer x = new Integer(10);
Double y = new Double(5.5f);
Boolean z = Boolean.parseBoolean("true");
````

Occorreva prima creare un nuovo oggetto di una classe wrapper.
Le stesse operazioni precedenti possono essere ora eseguite mediante il seguente codice.
```java

Integer x = 10;
Double y = 5.5f;
Boolean z = true;
```
L’autoboxing permette al developer di non preoccuparsi delle operazioni di conversione.
Da notare che è grazie all’autoboxing che possiamo inserire i tipi primitivi all’interno delle Collection in maniera totalmente trasparente e senza preoccuparci di convertire i dati.

### Classe Math
Per terminare la nostra trattazione del java.lang, comunque parziale vista l’immensità del package, esaminiamo brevemente la classe java.lang.Math (diversa dalla classe java.math). 
Questa classe serve per fare calcoli matematici e ha due attributi:

```java
static double E		E di Eulero
static double PI	Pi greca
```

### Consta di 31 metodi che rappresentano: le funzioni matematiche di 
* 	valore assoluto, 
* 	tangente, 
* 	logaritmo, 
* 	potenza, 
* 	massimo, 
* 	minimo, 
* 	seno, 
* 	coseno, 
* 	esponenziale, radice quadrata
*   arrotondamento classico, per eccesso e per difetto
*   generazione di numeri casuali
