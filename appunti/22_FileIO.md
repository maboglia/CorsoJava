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
Queste due classi hanno la caratteristica di obbligare le sottoclassi a leggere e scrivere dividendo i dati in “pezzi” di 16 bit ognuno, quindi compatibili con il tipo char di Java.

## Byte Stream

**InputStream** e **OutputStream** sono le due superclassi astratte per i byte stream.

Queste due classi hanno la caratteristica di obbligare le sottoclassi a leggere e scrivere dividendo i dati in “pezzi” di 8 bit ognuno. Praticamente esistono gerarchie di classi parallele alle classi viste per i character stream.

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

Path path1 = Filesystems.getDefault().getPath(“/root/aFile.txt”);
Path path2 = Paths.get(“C:\\Program Files\\Notepadpp”);

Un oggetto di tipo Path, che rappresenta un percorso che punta a un file o una directory, è legato al sistema operativo nel quale abbiamo avviato il programma che ne fa uso, infatti la sintassi di definizione del percorso deve usare le convenzioni del sistema medesimo. 
Una volta ottenuto un oggetto Path è possibile utilizzare una serie di metodi potenti e semplici da utilizzare.

```java
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.lang.System.out;

public class PathDemo {
	public static void main(String[] args) {
		// Creazione path per puntare a un file
		Path path = Paths.get(“C:\\MY_JAVA_SOURCES\\Test.java”);

		// Informazioni sul path
		out.format(“toString: %s%n”, path.toString());
		out.format(“getFileName: %s%n”, path.getFileName());
		out.format(“getName(0): %s%n”, path.getName(0));
		out.format(“getNameCount: %s%n”, path.getNameCount());
		out.format(“subpath(1,2): %s%n”, path.subpath(1,2));
		out.format(“getParent: %s%n”, path.getParent());
		out.format(“getRoot: %s%n”, path.getRoot());
	}
}
```

## Classe Files

L’altro elemento fondamentale di NIO 2.0 è la classe Files, che serve per compiere svariate operazioni sui file e sulle directory, come lettura, scrittura, spostamento, ecc. 

Esistono tantissimi metodi di utilità in questa classe (oltre 55) anche se la maggior parte è abbastanza intuitiva.