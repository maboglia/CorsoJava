# Package java.lang
* Il package java.lang è il package più importante dell’API di Java, in quanto contiene moltissime classi e interfacce fondamentali per la programmazione Java, tanto che questo package viene importato in automatico in tutti i programmi.
* Object

* System

* Boolean
* Byte
* Character
* Double
* Float
* Integer
* Long
* Short

* String 
* 
* Math

* Class
* ClassLoader
* ClassValue
* Compiler
* Enum
* InheritableThreadLocal
* Number
* Package
* Process
* ProcessBuilder
* ProcessBuilder.Redirect
* Runtime
* RuntimePermission
* SecurityManager
* StackTraceElement
* StrictMath
* StringBuffer
* StringBuilder
* Thread
* ThreadGroup
* ThreadLocal
* Throwable
* Void


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
* 
System.out.print("Directory di installazione Java: ");
System.out.println(System.getProperty("java.home"));
```
Oppure si potrebbe impostare una nuova proprietà mediante il codice:
```java

System.setProperty("User.lastName", "Belushi");
```
Un elenco con tutte le properties di sistema è riportato in basso.

### Classe Runtime
* Questa classe astrae il concetto di runtime (esecuzione) del programma. Non ha costruttori pubblici e una sua istanza si ottiene chiamando il metodo factory getRuntime().
* Caratteristica interessante di questa classe è permette di eseguire comandi del sistema operativo direttamente da Java, come ad esempio exec (di cui esistono più versioni).
* Bisogna tener conto che l’uso della classe Runtime potrebbe compromettere la portabilità delle applicazioni, infatti questa classe dipende fortemente dal sistema operativo.

## Altre classi del package `java.lang`

* Classe String
* Classi wrapper
* Classe Math
