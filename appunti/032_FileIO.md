# File Input/Output

## Package java.io
Per eseguire l’elaborazione dei file in Java, è necessario importare il package java.io, che contiene le definizioni delle seguenti classi di flussi:
una per l’input
classe|descrizione
---|---
classe Reader		| per input di caratteri da un file
classe InputStream	| per input di byte da un file una per l’output
classe Writer		| per output di caratteri verso un file
classe OutputStream	| per output di byte verso un file
## Il flusso - Stream

## Character Stream

**Reader** e **Writer** sono le due superclassi astratte per i character stream.
Queste due classi hanno la caratteristica di obbligare le sottoclassi a leggere e scrivere dividendo i dati in "pezzi" di 16 bit ognuno, quindi compatibili con il tipo char di Java.

## Byte Stream

**InputStream** e **OutputStream** sono le due superclassi astratte per i byte stream.

Queste due classi hanno la caratteristica di obbligare le sottoclassi a leggere e scrivere dividendo i dati in "pezzi" di 8 bit ognuno. Praticamente esistono gerarchie di classi parallele alle classi viste per i character stream.

I programmi dovrebbero utilizzare i byte stream per le informazioni di tipo non testuale, come, ad esempio, immagini o suoni.

Il metodo read() della classe Reader si occupa di leggere flussi di caratteri da una sorgente specifica e restituisce:
* un int (da 0 a 65535) che rappresenta il carattere letto
* il valore -1 se il file è terminato

Il metodo read() della classe InputStream si occupa di leggere un byte alla volta da una sorgente specifica e restituisce:
un int (da 0 a 255) che rappresenta il byte letto
il valore -1 se il file è terminato


## Classe IOException



## Le classi astratte di Reader e InputStream

Reader e InputStream definiscono gli stessi metodi, ma per differenti tipi di dati.
In particolare, Reader dichiara i metodi per leggere flussi di caratteri da una sorgente, mentre InputStream dichiara i metodi per leggere byte ed array di byte.

## Le classi astratte di Writer e OutputStream

    Il metodo write() della classe Writer si  occupa di scrivere flussi di caratteri in una destinazione specifica. Il carattere è passato come argomento di tipo int.
    Il metodo write() della classe InputStream si occupa di scrivere un byte alla volta. Il byte è passato come argomento di tipo int.

## Chiusura degli stream

## Lettura da tastiera

## Metodo BufferedReader

## Metodo Scanner

## Gestione dei file – Classe File

## Serializzazione di oggetti

## Primo esempio di serializzazione

Tutte le classi che implementano l’interfaccia Serializable possono essere salvate su persistenza attraverso un ObjectOutputStream e caricate con un ObjectInputStream. Queste ultime sono classi che implementano le interfacce ObjectOutput e ObjectInput e consentono agli oggetti di essere letti o scritti in uno stream (possibilmente un file).
Scriviamo una classe Java (con molta originalità chiamata Base) con un solo campo id ed i corrispondenti metodi getter e setter.

    public class Base implements Serializable {
        private int id;
     
        public int getId() {
            return id;
        }
     
        public void setId(int id) {
            this.id = id;
        }
    }

Creiamo un’altra classe che estende la classe base (chiamata Figlia) aggiungendo un campo nome.

    public class Figlia extends Base implements Serializable {
        private String nome;
     
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome() {
            return nome;
        }
    }

Scriviamo un blocco di codice di prova per serializzare e deserializzare un oggetto (usando le classi descritte all’inizio di questo paragrafo).

    public static void main (String[] args) {
    Figlia f = new Figlia();
    f.setId(123);
    f.setNome("ABC");

    System.out.println(f.getId() + " " + f.getNome());

    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream out = new ObjectOutputStream(bos);
    out.writeObject(f);
    out.close();

    ObjectInputStream in = new ObjectInputStream(
        new ByteArrayInputStream(bos.toByteArray()));
    f = (Figlia) in.readObject();
    in.close();

    System.out.println(f.getId() + " " + f.getNome());

## Secondo esempio di serializzazione

## NIO 2.0

Una delle novità più importanti della versione 7 di Java è senza dubbio rappresentata dalle innovazioni apportate alle API per la gestione dei file. 

Una prima release delle API per l’input/output fu rilasciata con la versione 1.4 di Java: furono introdotte le API NIO (New Input Output) mediante il package java.nio. 

Questa release aveva lo scopo di migliorare e fornire un’alternativa all’utilizzo del package java.io. Questo nuovo package consente semplicemente operazioni più complesse chela libreria IO non permette. 

Con l’uscita della nuova versione di Java, è stata rilasciata una versione 2.0 di queste API, chiamate NIO 2.0 (More New Input Output) che, rispetto alla prima versione, hanno una curva di apprendimento nettamente più semplice.

La differenza sostanziale tra le API classiche (package java.io) e le nuove API (java.nio) sta nel fatto che:

le prime lavorano con stream di byte e stream di caratteri
le seconde lavorano principalmente con buffer, channel e selector

## Buffer, channel e selector

## Novità principali

Le novità più importanti di NIO 2.0 risiedono essenzialmente nell’introduzione della classe Files e dell’interfaccia (e sue implementazioni) Path, che forniscono metodi più semplici ed efficienti per l’utilizzo di operazioni legate ai file. Infatti, sebbene la tradizionale classe java.io.File sia ancora disponibile, è stato introdotto un nuovo meccanismo che ha al centro le nuove classi java.nio.Path e java.nio.Files. 

Delle nuove caratteristiche offerte da NIO 2.0, tratteremo quelle di maggior impatto ed utilità per la programmazione quotidiana, come la nuova file system API, iniziando a descrivere il suo tipo più importante: l’interfaccia Path.

Dopodiché andremo a descrivere i principali metodi offerti dalla classe Files.

## Interfaccia Path

Per ottenere un’istanza di Path, occorre utilizzare l’oggetto FileSystem o più semplicemente l’oggetto Paths. 

```java
Path path1 = Filesystems.getDefault().getPath("/root/aFile.txt");
Path path2 = Paths.get("C:\\Program Files\\Notepadpp");
```
Un oggetto di tipo Path, che rappresenta un percorso che punta a un file o una directory, è legato al sistema operativo nel quale abbiamo avviato il programma che ne fa uso, infatti la sintassi di definizione del percorso deve usare le convenzioni del sistema medesimo. 
Una volta ottenuto un oggetto Path è possibile utilizzare una serie di metodi potenti e semplici da utilizzare.

```java
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.lang.System.out;

public class PathDemo {
	public static void main(String[] args) {
		// Creazione path per puntare a un file
		Path path = Paths.get("C:\\MY_JAVA_SOURCES\\Test.java");

		// Informazioni sul path
		out.format("toString: %s%n", path.toString());
		out.format("getFileName: %s%n", path.getFileName());
		out.format("getName(0): %s%n", path.getName(0));
		out.format("getNameCount: %s%n", path.getNameCount());
		out.format("subpath(1,2): %s%n", path.subpath(1,2));
		out.format("getParent: %s%n", path.getParent());
		out.format("getRoot: %s%n", path.getRoot());
	}
}
```

## Classe Files

L’altro elemento fondamentale di NIO 2.0 è la classe Files, che serve per compiere svariate operazioni sui file e sulle directory, come lettura, scrittura, spostamento, ecc. 

Esistono tantissimi metodi di utilità in questa classe (oltre 55) anche se la maggior parte è abbastanza intuitiva.


## File di configurazione nella cartella WEB-INF

```java
InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("/my.properties");
```

Lettura sequenziale di file di testo (e canali di input)

## Passo 1: apertura file in lettura

Per leggere un file di testo avente come nome la stringa s, creare innanzitutto un oggetto java.io.FileReader come segue (dopo aver importato java.io.*):

FileReader f;

try {
    f = new FileReader(s);
}
catch(FileNotFoundException e){
    // errore: non è possibile aprire il file s
}

Si noti che il costruttore FileReader(s) lancia una eccezione verificata FileNotFoundException se non è possibile aprire il file s.

## Passo 2: creazione canale di lettura associato al file da leggere

Poiché non è possibile usare direttamente l'oggetto FileReader f per leggere dal file, bisogna creare un secondo oggetto di classe java.io.BufferedReader passando f al costruttore BufferedReader in modo da creare un canale di lettura associato al file.

BufferedReader b = new BufferedReader(f);


Nota importante: la parte introduttiva della documentazione standard della classe BufferedReader fornisce un esempio di creazione di un canale di lettura associato a un file (passi 1 e 2).

## Passo 3: lettura di stringhe dal canale di lettura

A questo punto, invocando ripetutamente il metodo readLine() sull'oggetto BufferedReader b si leggono una alla volta le righe del file. Quando readLine() restituisce null vuole dire che le righe del file sono state tutte lette e l'oggetto BufferedReader ha esaurito il suo scopo.

Ad esempio, il seguente frammendo di codice stampa a video tutte le righe del file:

try {
    for (;;) {
        String r = b.readLine(); // legge la prossima riga del file
        if (r == null) break; // esce dal ciclo se le righe sono finite
        System.out.println(r); // stampa a video la riga letta dal file
    }
}
catch(IOException e){
    // Errore nella lettura del file
}


Si noti che il metodo readLine potrebbe lanciare una eccezione verificata di tipo IOException.

## Passo 4: chiusura canale di input associato al file

Quando la lettura del file è stata ultimata, è buona norma chiudere il canale di input associato al file invocando il metodo close():

b.close();


Nota: fare attenzione a non chiamare close() su un canale BufferedReader non associato a un file, ma ad esempio al canale standard System.in.

## Esempio 1

Scrivere una classe pubblica LetturaFile con un metodo pubblico void stampaFile(String s) che, dato il nome di un file s, ne stampa a video tutte le righe, oppure lancia un'eccezione non verificata se si incontrano errori nella lettura.

LetturaFile.java
import java.io.*;

public class LetturaFile {
    public static void stampaFile(String s){
        BufferedReader b = null;
   
        try {
            // apre file
            b = new BufferedReader(new FileReader(s));
                   
            // legge file e scrive le righe lette su System.out
            for (;;) {
                String r = b.readLine(); // legge la prossima riga del file
                if (r == null) break; // esce dal ciclo se le righe sono finite
                System.out.println(r); // stampa a video la riga letta dal file
            }
           
            // chiude il canale di input
            b.close();
        }
        catch(FileNotFoundException e) { // cattura errori prodotti da new FileReader(s)
            throw new RuntimeException("Errore: impossibile aprire il file " + s);
        }
        catch(IOException e) { // cattura errori prodotti da readLine()
            if (b!= null) b.close();
            throw new RuntimeException("Errore di lettura del file " + s);
        }
    }
}

Notare che FileNotFoundException è una sottoclasse di IOException e quindi togliendo il catch(FileNotFoundException e) il programma sarebbe comunque corretto, solo che darebbe lo stesso errore sia in caso di errore di apertura file (new FileReader(...)) che di lettura file (b.readLine()).

Programma di prova:

    public static void main(String[] args){
        stampaFile("LetturaFile.java");
    }


## Esempio 2

Una variante dell'esercizio precedente assume che il metodo non prenda come parametro un nome di file, ma un canale di lettura BufferedReader assumendo che sia stato già creato al momento dell'invocazione.

Scrivere una classe pubblica LetturaFile con metodo pubblico void stampaCanaleInput(BufferedReader b) che, dato un canale di lettura b, ne stampa a video tutte le righe, oppure lancia un'eccezione non verificata se si incontrano errori nella lettura.

LetturaFile.java
import java.io.*;

public class LetturaFile {
    public static void stampaCanaleInput(BufferedReader b){
        try {
            // legge file e scrive le righe lette su System.out
            for (;;) {
                String r = b.readLine(); // legge la prossima riga del file
                if (r == null) break; // esce dal ciclo se le righe sono finite
                System.out.println(r); // stampa a video la riga letta dal file
            }
        }
        catch(IOException e) { // cattura errori prodotti da readLine()
            throw new RuntimeException("Errore di I/O");
        }
    }
}


Programma di prova:

    public static void main(String[] args){
        BufferedReader b;

        try { // prova ad aprire il file
            b = new BufferedReader(new FileReader("LetturaFile.java"));
        }
        catch(FileNotFoundException e) { // cattura errori prodotti da new FileReader()
            throw new RuntimeException("Errore: impossibile aprire il file");
        }
        
        stampaCanaleInput(b);
        b.close();
    }


Scrittura sequenziale di file di testo (e canali di output)

## Passo 1: creazione canale di scrittura associato al file

Per creare un file di testo con nome miofile.txt, creare un oggetto java.io.PrintStream come segue (dopo aver importato java.io.*):

PrintStream f;

try {
    f = new PrintStream("miofile.txt");
}
catch(FileNotFoundException e){
    throw new RuntimeException("errore apertura file");
}

Si noti che il costruttore PrintStream(s) (si legga la documentazione):

    crea un nuovo file con il nome s se il file non esiste ancora;
    apre il file in scrittura se il file esiste, cancellandone il contenuto precedente;
    lancia una eccezione verificata FileNotFoundException se non è possibile aprire il file per la scrittura (la documentazione recita: "If the given file object does not denote an existing, writable regular file and a new regular file of that name cannot be created, or if some other error occurs while opening or creating the file").


## Passo 2: scrittura sul canale di output associato al file

Da questo punto in poi, l'oggetto p può essere usato per scrivere con i metodi print e println della classe PrintStream (si noti che System.out è un oggetto PrintStream). Ad esempio:

p.println("prova scrittura su file");


## Passo 3: chiusura canale di output associato al file

Quando la scrittura del file è stata ultimata, è buona norma chiudere il canale di output associato al file invocando il metodo close():

p.close();


Nota: fare attenzione a non chiamare close() su un canale PrintStream non associato a un file, ma ad esempio al canale standard System.out:

PrintStream p = System.out; // System.out è un riferimento di tipo PrintStream al terminale standard
p.close(); // chiude il terminale di output
System.out.println("questa stringa non verrà mai stampata");


## Esempio 1

Scrivere una classe pubblica ScritturaFile con un metodo pubblico void scriviSuFile(Object[] v, String s) che, dato un array v di oggetti e una stringa s, crea un file di nome s contenente le stringhe associate agli oggetti dell'array, oppure lancia un'eccezione non verificata se si incontrano errori nella scrittura del file.

ScritturaFile.java
import java.io.*;

public class ScritturaFile {
    public static void scriviSuFile(Object[] v, String s){

        PrintStream p;

        try {
             p = new PrintStream(s);
        }
        catch(FileNotFoundException e){
            throw new RuntimeException("errore accesso file");
        }

        for (int i=0; i<v.length; i++) p.println(v[i]);

        p.close();
    }

    public static void main(String[] args){
        scriviSuFile(new String[]{"uno", "due", "tre"}, "miofile.txt");
    }
}


Programma di prova:

    public static void main(String[] args){
        scriviSuFile(new String[]{"uno", "due", "tre"}, "miofile.txt");
    }


## Esempio 2

Una variante dell'esercizio precedente assume che il metodo non prenda come parametro un nome di file, ma un canale di scrittura PrintStream assumendo che sia stato già creato al momento dell'invocazione (ad esempio associandolo a un file o al terminale di output System.out).

Scrivere una classe pubblica ScritturaFile con un metodo pubblico void scriviSuCanaleOutput(Object[] v, PrintStream p) che, dato un array v di oggetti e un canale di output p, scrive su quel canale le stringhe associate agli oggetti dell'array, oppure lancia un'eccezione non verificata se si incontrano errori nella scrittura del file.

ScritturaFile.java
import java.io.*;

public class ScritturaFile {
    public static void scriviSuCanaleOutput(Object[] v, PrintStream p){
        for (int i=0; i<v.length; i++) p.println(v[i]);
    }   
}


Nota importante: sarebbe errato fare p.close() perché il canale di output p potrebbe dover rimanere ancora in uso (esempio ovvio: se p==System.out).

Programma di prova:

    public static void main(String[] args){
        scriviSuCanaleOutput(new String[]{"uno", "due", "tre"}, System.out);
    }




Streams
Generalità sull'I/O

### L'Input/Output è descritto nel package
java.io

### Modalità principali di manipolazione
* Stream di caratteri
  * Classi di lettura: contengono Reader nel nome
  * Classi di scrittura: contengono Writer nel nome
* Stream di byte
  * Classi di lettura: contengono InputStream nel
nome
  * Classi di scrittura: contengono OutputStream
nel nome
1
### Usualmente l'I/O da file
* Richiede la gestione di eccezioni controllate
* La radice della gerarchia di queste
eccezioni è IOExcetion
public ... ( ... ) throws IOException {
...
// Stream - I/O
...
}
I/O orientato a caratteri singoli
2import java.io.*;
...
public ... throws IOException {
File <inF> = new File ("<nameIn>");
FileReader <inR> = new FileReader (<inF>);
File <outF> = new File ("<nameOut>");
FileWriter <outW> = new FileWriter (<outF>);
int c;
while ((c = <inR>.read()) != -1)
<outW>.write (c);
<inR>.close ();
<outW>.close ();
}

### I costrutti
File <inF> = new File ("<nameIn>");
FileReader <inR> = new FileReader (inF);
File <outF> = new File ("<nameOut>");
FileWriter <outW> = new FileWriter (outF);
possono essere scritti come segue
FileReader <inR> = new FileReader
("<nameIn>");
FileWriter <outW> = new FileWriter
("<nameOut>");
3
### Metodi generali
  * Chiusura del file
public void close () throws IOException
  * Scrittura dei caratteri nel "buffer"
public void flush () throw IOEXception

### Modalità di lettura
  * Il metodo read restituisce (-1) al
raggiungimento di EOF
  * Lettura di caratteri singoli
public int read () throws IOException
  * Lettura di un numero di caratteri pari alla
lunghezza di un vettori di caratteri
public int read (char [] charArray) throws
IOException

### Modalità di scrittura
  * Scrittura di caratteri singoli
public void write (int c) throws
IOException
  * Scrittura di un vettore di caratteri
public void write (char [] charArray)
throws IOException
  * Scrittura parziale di un vettore di caratteri
public void write (char [] charArray, int
da, int a) throws IOException
  * Scrittura di una stringa
public void write (String s) throws
IOException
  * Scrittura parziale di una stringa
public void write (String s, int da, int a)
throws IOException
4I/O orientato alle righe

### La lettura di righe intere è permessa
dalla classe BufferedReader

### I metodi di tale classe
* Sono analoghi a quelli della classe Writer
(metodo write)
* L'I/O bufferizzato è più efficiente
  * Lettura di una riga (conclusa dai caratteri \n
= linefeed, \r = carriage return) intera
public String readLine ()
throws IOException
Ritorna null al raggiungimento di EOF
5import java.io.*;
...
public ...throws IOException {
FileReader <inR> = new FileReader ("<nameIn>");
BufferedReader <inB> = new BufferedReader (<inR>);
FileWriter <outF> = new FileWriter ("<nameOut>");
BufferedWriter <outB> = new BufferedReader (<outF>);
String str;
...
while ((str = <inB>.readLine ()) != null)
<outB>.write (str);
...
<inB>.close ();
<outB>.close ();
}

### I costrutti
FileReader <inR> = new FileReader
("<nameIn>");
BufferedReader <inB> = new BufferedReader
(<inR>);
FileWriter <outF> = new FileWriter
("<nameOut>");
BufferedWriter <outW> = new BufferedWriter
(outF);
possono essere scritti come
BufferedReader <inB> = new BufferedReader
(new FileReader ("<nameIn>"));
BufferedWriter <outW> = new BufferedWriter
(new FileWriter ("<nameOut>"));
6La classe file

### La classe file permette controlli su
* File
* Directory

### Definisce/rappresenta nomi/path
  * Crea un oggetto di tipo file
public File (String pathName)
e.g.,
File <x> = new File ("<nameIn>");
File <y> = new File (
"c:\dir1\dir2", "<nameOut>");

### Check file/direttory
  * Verifica che l'oggetto esista
public boolean exists()
e.g., if (<x>.exists ()) ...
  * Verifica se l'oggetto è un file
public boolean isFile()
e.g., if (<x>.isFile ()) ...
  * Verifica se l'oggetto è una directory
public boolean isDirectory()
  * Restituisce il nome del file o directory
public String getName(
  * Restituisce la stringa che descrive il path
completo del file
public String getAbsolutePath (
7  * Restituisce dimensione in byte
public long length ()
  * Controlla se il file può essere scritto
public boolean canWrite()
  * Controlla se il file può essere letto
public boolean canRead ()

### Contenuto di una directory
  * Restituisce l'array di stringhe contenenti I nomi
dei file/direcotory nel direttorio corrente
String [] list ()
e.g.,
String fileName[] = <x>.list ();
for (int i=0; i<fileName.length; i++)
System.out.println (filename[i]);

