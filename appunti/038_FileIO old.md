# File Input/Output

### Creare text file:
```java
PrintWriter writer = new PrintWriter("nomefile.txt", "UTF-8");
writer.println("Prima riga");
writer.println("Seconda riga");
writer.close();
```

### Creare binary file:

```java
byte data[] = ...
FileOutputStream out = new FileOutputStream("nomefile");
out.write(data);
out.close();
```

---

### Java 7+: Files class:

### Creare text file:

```java
List<String> lines = Arrays.asList("Prima riga", "Seconda riga");
Path file = Paths.get("nomefile.txt");
Files.write(file, lines, StandardCharsets.UTF_8);
//Files.write(file, lines, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
```

### Creare binary file:

```java
byte data[] = ...
Path file = Paths.get("nomefile");
Files.write(file, data);
//Files.write(file, data, StandardOpenOption.APPEND);
```

---

## Java NIO.2: Input/output di file moderno con Java Path API e metodi helper Files

Sono in circolazione da Java 7, ma non tutti sanno come utilizzare le funzionalità di I/O del file NIO.2.

Quando gli sviluppatori devono scrivere codice di input o output di file in Java, la situazione può sembrare piuttosto complessa, soprattutto perché sono disponibili diverse API. Non è sempre ovvio per i nuovi arrivati quale API utilizzare per le operazioni comuni o cosa fanno le altre API.

Questa situazione è dovuta al fatto che Java ha avuto il supporto I/O fin dalla prima versione. Queste prime versioni della funzionalità I/O enfatizzavano la portabilità a causa del forte desiderio di Java per l'indipendenza dalla piattaforma. Di conseguenza, non era sempre facile lavorarci e mancavano alcune funzionalità chiave.

Le versioni successive di Java hanno introdotto altre API per semplificare la vita degli sviluppatori, ma è stato solo con l'arrivo di Java 7 che le funzionalità di I/O di Java sono diventate semplificate e facili da usare.

---

Per lo sviluppo Java moderno, dovresti passare direttamente a queste API moderne (note come NIO.2 o semplicemente API **Path**) per attività semplici. Tutte le altre API, inclusa la gestione di I/O di basso livello, sono ancora disponibili se ne hai bisogno, ma per la maggior parte delle attività quotidiane dovrebbe essere sufficiente la semplice API **Path**.

Ci sono due parti nella semplice API, che vive nel pacchetto java.nio.file. Ancora più importante, c'è l'interfaccia **Path** stessa. Esistono anche numerosi metodi di supporto per implementare attività comuni di gestione dei file, che sono per lo più contenute nella classe Files.

Incontriamo l'API, partendo dall'astrazione fondamentale, il **Path** stesso.
Presentazione dell'API **Path** di Java

---

Un'istanza di **Path** è un oggetto che può essere utilizzato per individuare un file in un file system. Rappresenta una posizione del file system che

* È gerarchico
* È composto da una sequenza di elementi di **Path**
* È dipendente dal sistema nella sua implementazione
* Può corrispondere o meno a un file esistente

È importante notare che l'API **Path** può essere utilizzata per fare riferimento a file che non sono ancora stati creati o che sono già stati eliminati; quindi, l'ultimo punto sopra.

Questi aspetti rendono **Path** fondamentalmente diverso dall'altra astrazione Java comune (ma molto più antica) per l'I/O: l'oggetto File.

In effetti, **Path** è un'interfaccia non una classe. Ciò consente a diversi sistemi operativi e altri fornitori di file system di creare diverse implementazioni dell'interfaccia **Path**. Ciò fornisce un'astrazione condivisa ma consente anche funzionalità dipendenti dal sistema che non devono essere supportate su tutti i file system.

---

Tutte le istanze di **Path** possono essere pensate come composte da zero o più nomi di directory e quindi da un elemento name. Inoltre, alcuni percorsi hanno un componente radice (come / o C:\), ma questo non è obbligatorio perché alcune istanze (come oggetti che rappresentano percorsi relativi) non hanno una radice.

L'elemento name è l'elemento "più lontano" dalla radice della gerarchia di directory e rappresenta il nome del file o della directory. Puoi pensare intuitivamente a un **Path** come costituito dagli elementi uniti insieme da un delimitatore. Quel delimitatore è tutto ciò che è appropriato per il sistema operativo.


---

Java 7 è stato fornito con una classe **Paths** che fornisce metodi factory per la creazione di oggetti **Path**. In Java 11 e versioni successive, questi metodi sono disponibili anche come metodi statici direttamente nell'interfaccia **Path**.

Le factory forniscono metodi (Paths.get () e Path.of()) per creare oggetti Path. Il normale sovraccarico di questi metodi accetta una stringa e utilizza il provider del file system predefinito. Una versione alternativa accetta invece un URI; questo fornisce un gancio per la capacità di NIO.2 di collegare fornitori di implementazioni di file system personalizzate o non standard, come file system compatibili con la rete o file zip.

Una volta che si dispone di un oggetto Path, è possibile utilizzarlo per eseguire operazioni comuni mediante i metodi pratici e di utilità per gestire file e file system, molti dei quali sono contenuti come metodi statici nella classe Files.

---

## I metodi ausiliari

Gli zelanti sostenitori di altri linguaggi a volte si lamentano del fatto che Java abbia troppi standard. Storicamente, questo potrebbe essere stato in qualche modo accurato per Java I/O, ma i tempi sono cambiati in meglio. Ad esempio, in Java moderno una semplice operazione di copia è ora semplice come la seguente:





```java
var input = Path.of("input");
var output = Path.of("output");

try {
   File.copia(input, output);
} catch(IOException ex) {
   ex.printStackTrace();
}
```

Questa è all'incirca la stessa quantità di codice che ci si aspetterebbe in un linguaggio apparentemente più compatto. Inoltre, questo codice è più sicuro, perché l'eccezione verificata costringe il programmatore ad affrontare la situazione fin troppo comune che la copia potrebbe fallire, piuttosto che permettere che un errore silenzioso provochi ulteriori problemi a valle.

Avviso: noterai che l'unica eccezione verificata generata dai metodi in Path è una IOException. Questo aiutoÈ l'obiettivo della semplicità di codifica, ma a volte può oscurare un problema di fondo. Potrebbe essere necessario scrivere una gestione extra delle eccezioni se si desidera gestire un sottotipo esplicito di IOException.

---

La classe Files è enorme e vale la pena familiarizzare con i metodi in essa contenuti. (Esistono anche varianti che utilizzano le API precedenti, incluso File, ma iniziamo usando solo l'API moderna.)

Ecco il mio suggerimento: prima di scrivere un metodo di I/O file da zero, controlla se Files ha già un metodo che fa quello che vuoi (o qualcosa di simile).

Il codice seguente mostra alcuni dei principali metodi in Files. Il loro funzionamento è generalmente autoesplicativo. Alcuni dei metodi Files offrono l'opportunità di passare argomenti facoltativi in modo da poter fornire un comportamento aggiuntivo (possibilmente specifico dell'implementazione) per l'operazione.

Nei commenti seguenti, sono esplicito sui tipi restituiti per quei metodi in cui il tipo restituito è importante. Alcuni degli altri metodi, come copy(), non hanno tipi restituiti particolarmente utili. Il punto di questi metodi sono gli effetti collaterali, ovvero la copia effettiva del file.

---

```java
Path sorgente, destinazione;
Attributes attr;

// Creazione di file
//
// Esempio di Path --> /home/ben/.profile
// Esempio di attributi --> rw-rw-rw-
Files.createFile(target, attr);

// Eliminazione di file
Files.delete(destinazione);
boolean eliminato = Files.deleteIfExists(target);

// Copia/spostamento di file
Files.copy(origine, destinazione);
Files.move(sorgente, destinazione);

// Metodi di utilità per recuperare informazioni
long dimensione = Files.size(target);
FileTime fTime = Files.getLastModifiedTime(target);
System.out.println(fTime.to(TimeUnit.SECONDS));

Map<String, ?> attrs = Files.readAttributes(target, "*");
System.out.println(attrs);

// Metadati del file
boolean isDir = Files.isDirectory(target);
boolean isSym = Files.isSymbolicLink(target);

// Leggendo e scrivendo
Set di caratteri cs = StandardCharsets.UTF_8;
List<String> lines = Files.readAllLines(source, cs);
byte[] b = Files.readAllBytes(sorgente);

// Ovviamente non dovresti mai memorizzare un flusso in una variabile temporanea.
// Questo esempio è solo per indicare il tipo restituito, e in real
// il codice verrebbe utilizzato come origine di una pipeline di flusso.
Stream<String> tmp = Files.lines(source, cs);
```

---

Alcuni dei metodi di cui sopra hanno un comportamento predefinito di cui devi essere a conoscenza. Ad esempio, per impostazione predefinita, un'operazione di copia non sovrascriverà un file esistente, quindi è necessario specificare questo comportamento come opzione di copia, come segue:

```java


Files.copy(Path.of("input.txt"), Path.of("output.txt"),
            StandardCopyOption.REPLACE_EXISTING);
```


StandardCopyOption è un'enumerazione che implementa un'interfaccia denominata CopyOption. Questa interfaccia è implementata da un enum chiamato LinkOption. Il primo caso è per i file regolari, mentre il modulo di collegamento serve a specificare come devono essere gestiti i collegamenti simbolici, a condizione che il sistema operativo sottostante supporti i collegamenti simbolici, ovviamente.

Questa leggera complessità aggiuntiva viene utilizzata per consentire a Files.copy() e ad altri metodi di avere un argomento variadico finale di CopyOption che consente allo sviluppatore di avere un modo molto flessibile per specificare il comportamento di copia richiesto. Una versione di questo modello è visibile in un paio di altri punti dell'API.
Una breve ma rilevante storia dell'I/O Java

---

Uno dei motivi per cui Java è così popolare è perché le sue ricche librerie offrono API potenti e concise per risolvere la maggior parte delle tue esigenze di programmazione. Tuttavia, ci sono alcune aree in cui le versioni precedenti di Java non erano all'altezza. Un esempio di questo tipo di mal di testa per gli sviluppatori era tradizionalmente nelle API di I/O. Ci sono stati diversi tentativi per risolvere questo problema, portando a diverse API I/O diverse.


* Java 1.0: le API File, InputStream e OutputStream
* Java 1.1: L'API Readers and Writeers
* Java 1.4: la nuova API I/O (NIO).
* Java 7: l'API del Path (NIO.2)

La classe java.io.File originale, in particolare, presentava limitazioni significative.

* Non gestiva i nomi dei file in modo coerente su tutte le piattaforme.
* Non è riuscito ad avere un modello unificato per gli attributi dei file.
* Era difficile usarlo per attraversare le directory.
* Non consentiva l'uso di funzionalità specifiche della piattaforma (come i collegamenti simbolici).

---

Anche le API precedenti non riuscivano a gestire le operazioni non bloccanti per i file system. Queste limitazioni e la necessità di fornire supporto per approcci moderni all'I/O, hanno portato al lavoro che è diventato NIO.2 in Java 7 (come specificato in JSR 203: More New I/O APIs for the Java Platform “NIO.2 ”). Questo progetto aveva tre obiettivi principali.

* Una nuova interfaccia del file system
* Un'API per operazioni di I/O asincrone (al contrario di polling, non bloccanti) su socket e file
* Il completamento della funzionalità socket-channel (precedentemente definita in JSR 51), inclusa l'aggiunta del supporto per l'associazione, la configurazione delle opzioni e i datagrammi multicast

e tre obiettivi secondari:

* Accesso completo agli attributi dei file
* Possibilità di accedere alle API specifiche del file system
* Un'interfaccia del fornitore di servizi (SPI) per implementazioni di file system collegabili

Queste sono riconoscibilmente le capacità fondamentali offerte dall'API Path e non sorprende che l'API sia stata adottata con entusiasmo dagli sviluppatori. Nonostante ciò, tuttavia, a volte è necessario interagire con codice precedente o con codice relativamente nuovo scritto da uno sviluppatore che preferisce i vecchi metodi di I/O su file. Ecco perché la familiarità con le altre API fornite da JDK ripagherà i dividendi per il programmatore attento.

Fondamentale per queste API precedenti è la classe File.

---

## La vecchia classe File

La classe File è la pietra angolare del modo originale di Java di eseguire l'I/O di file. L'astrazione rappresenta i metadati sulla posizione di un file system, ovvero sia i file che le directory.

La buona notizia è che File fornisce un ampio set di metodi per interrogare i metadati del file system che l'oggetto rappresenta, ad esempio


```java

// Gestione dei permessi
boolean canX = f.canExecute();
boolean canR = f.canRead();
boolean canW = f.canWrite();

boolean ok;
ok = f.setReadOnly();
ok = f.setExecutable(true);
ok = f.setReadable(true);
ok = f.setWritable(falso);

// Viste diverse del nome del file
File absF = f.getAbsoluteFile();
File canF = f.getCanonicalFile();
String absName = f.getAbsolutePath();
String canName = f.getCanonicalPath();
String name = f.getName();
String pName = getParent();
URI fileURI = f.toURI(); // Crea l'URI per il Path del file

// Metadati del file
boolean esiste = f.esiste();
boolean isAbs = f.isAbsolute();
boolean isDir = f.isDirectory();
boolean isFile = f.isFile();
boolean isHidden = f.isHidden();
long modTime = f.lastModified(); // millis dall'epoca
boolean updateOK = f.setLastModified(updateTime); // milli
long fileLen = f.lunghezza();

// Operazioni di gestione dei file
boolean rinominato = f.renameTo(destFile);
boolean cancellato = f.delete();

// Create non sovrascriverà il file esistente
boolean createdOK = f.createNewFile();

// Gestione dei file temporanei
File tmp = File.createTempFile("my-tmp", ".tmp");
tmp.deleteOnExit();

// Gestione delle directory
boolean createdDir = dir.mkdir();
String[] fileNames = dir.list();
File[] file = dir.listFiles();
```

---

La cattiva notizia: nonostante il gran numero di metodi nella classe File, alcune funzionalità di base non sono e non sono mai state fornite direttamente. Notoriamente, File non fornisce un modo per leggere direttamente il contenuto di un file.

Non solo, ma il modo in cui File astrae su file e directory può essere ingombrante da gestire e porta a codice come il seguente:

```java

// Ottieni un oggetto file per rappresentare la home directory dell'utente
var homedir = new File(System.getProperty("user.home"));

// Crea un oggetto per rappresentare un file di configurazione presente in homedir
var f = new File(homedir, "app.conf");

// Verifica che il file esista, che sia realmente un file e che sia leggibile
if (f.exists() && f.isFile() && f.canRead()) {

   // Crea un oggetto file per una nuova directory di configurazione
   var configdir = new File(f, ".configdir");

   configdir.mkdir();

   // Infine, sposta il file di configurazione nella sua nuova home
   f.renameTo(new File(configdir, ".config"));
}
```

---

Ciò dimostra alcuni dei problemi con l'astrazione File, in particolare che è molto generale e richiede molto lavoro per interrogare un oggetto File. Nell'esempio, per determinare cosa rappresenta un oggetto File e le sue capacità richiede troppo codice.

Come notato in precedenza, di per sé la classe File non fornisce tutte le funzionalità necessarie per l'I/O. Invece, deve essere abbinato all'astrazione del flusso I/O (che non deve essere confuso con i flussi Java introdotti in Java 8 per facilitare un approccio più funzionale alla gestione delle raccolte).

L'API del flusso I/O era presente nella primissima versione di Java come un modo per gestire flussi sequenziali di byte da dischi o altre fonti.

Il nucleo di questa API è una coppia di classi astratte, InputStream e OutputStream. Questi sono molto usati e tutte le sottoclassi devono fornire un metodo che restituisca oppure restituisca il successivo byte di input. Non dovrebbe sorprendere che i flussi di input e output standard, System.in e System.out (che sono le rappresentazioni Java di STDIN e STDOUT), siano flussi di questo tipo.

Il principale svantaggio di questa API è che l'utilizzo dei flussi è spesso scomodo e di solito richiede agli sviluppatori di utilizzare array di byte e altre astrazioni di basso livello.

---

Ad esempio, per contare tutte le volte in cui la a minuscola (valore ASCII 97) compare nel libro Alice in Wonderland è necessario un codice come il seguente:

```java

try (var is = new FileInputStream("/Users/ben/alice.txt")) {
   var buf = new byte[4096];
   int len, count = 0;
   while ((len = is.read(buf)) > 0) {
     per (var i = 0; i < len; i = i + 1)
       se (buf[i] == 97) {
         contare = contare + 1;
       }
   }
   System.out.println("'a's seen: "+ count);
} catch (IOException e) {
   e.printStackTrace();
}
```

Questo approccio è scomodo e utilizza alcuni trucchi in stile C che dovrebbero essere lasciati nel passato. 

---


Al contrario, il codice corrispondente che utilizza l'API Path è molto più dichiarativo e flessibile.

```java

var alice = Path.of("/Users/ben/alice.txt");
try {
   long count = Files.lines(alice)
                     .flatMap(l -> Stream.of(l.split("")))
                     .filter(s -> s.equals("a"))
                     .contare();
   System.out.println("'a's seen: "+ count);
} catch (IOException e) {
   e.printStackTrace();
}
```


Ora non dovrebbe sorprendere che non posso consigliare di utilizzare le vecchie API di basso livello. Invece, le API più moderne basate su Path si adatteranno molto meglio per la maggior parte del tempo. Tuttavia, ci sono circostanze in cui è necessario utilizzare una combinazione delle API moderne e di alcune delle alternative precedenti.

---

## Bridging delle API di file e Path

Ecco un esempio che mostra la facile interazione tra gli oggetti Path e File. Innanzitutto, si noti come i metodi Path factory possono essere utilizzati per accedere allo stesso Path in modi diversi.

```java

var p = Path.of("/Users/ben/cluster.txt");
var p2 = Path.of(new URI("file:///Users/ben/cluster.txt"));
System.out.println(p2.equals(p));
```

Non sorprende che questo sia vero. Convertiamo ora un Path in un oggetto File e usiamolo normalmente.

```java

File f = p.toFile();
System.out.println(f.isDirectory());
```

L'aggiunta di un metodo toPath() a File consente di andare nella direzione opposta.

```java

Path p3 = f.toPath();
System.out.println(p3.equals(p));
```

---

Questa coppia di metodi consente il movimento senza sforzo tra le due API e consente un facile refactoring del codice basato su File, quindi usa Path.

Puoi utilizzare altri metodi bridge nella nuova classe helper Files per accedere alle API di I/O meno recenti come FileInputStream.

```java

var inputFile = new File("input");
try (var in = new FileInputStream(inputFile)) {
   Files.copy(in, Paths.get("output"));
} catch(IOException ex) {
   ex.printStackTrace();
}
```

---

Esistono anche metodi factory di convenienza per la creazione di lettori, scrittori e flussi di file.

```java

BufferedReader br = Files.newBufferedReader(target, cs);
BufferedWriter bwr = Files.newBufferedWriter(target, cs);

InputStream è = Files.newInputStream(target);
OutputStream os = Files.newOutputStream(target);
```

È possibile utilizzare questi metodi per scrivere codice come il seguente, che utilizza posizioni Path specificate:

```java

var logFile = Path.of("/tmp/mio.log");
try (var writer =
        Files.newBufferedWriter(logFile, StandardCharsets.UTF_8,
                                StandardOpenOption.WRITE)) {
   writer.write("Ciao Mondo!");
   //...
} catch (IOException e) {
   //...
}
```

Ciò fornisce un semplice collegamento al codice precedente che utilizza l'API Readers and Writers.
---

## Estensibilità con FileSystem e FileStore

L'API Path è stata progettata pensando all'estensibilità per i futuri tipi di file I/O. Ad esempio, le interfacce OpenOption e CopyOption possono essere estese per fornire opzioni aggiuntive per l'apertura e la copia di file o entità simili a file. Per quanto riguarda questa estensibilità, tre dei tipi più importanti nel pacchetto java.nio.file sono

* Path: il concetto di un Path di directory sul file system
* FileSystem: interfacce con i file system
* FileStore: gestisce i dispositivi, le partizioni e così via sottostanti

---

Hai già visto come il fatto che Path sia un'interfaccia si presta all'estensibilità.

Queste sono le altre due classi.

* FileSystem è essenzialmente una fabbrica per la creazione di oggetti per accedere a file e altri oggetti nel file system, indipendentemente dal fatto che quel file system sia il file system predefinito o un file system alternativo recuperato dal suo URI. Ha metodi di supporto associati in FileSystems che creano nuovi file system tramite un meccanismo SPI (Service Provider Interface). Un oggetto FileSystem predefinito è sempre disponibile e corrisponde al file system locale sulla macchina in cui è stata avviata la JVM.
* Un'istanza di FileStore gestisce the dettagli concreti di basso livello su come interagire con i bit ei byte di un FileSystem. Questa classe non è spesso necessaria all'utente finale; invece, le astrazioni di livello superiore sono sufficienti per quasi tutte le applicazioni.

---


Dovresti utilizzare l'API Path per l'I/O di file ove possibile. Ricorda che puoi collegare le API precedenti se necessario ed è intelligente essere a conoscenza dei componenti di livello inferiore e dei dettagli di implementazione per ogni evenienza

_(Ben Evans)_


---

## NIO 2.0 in pratica

_(Ben Evans)_

---
## Attributi dei file

Ogni file system ha il proprio set di attributi e la propria interpretazione del significato di tali attributi di file. Fortunatamente, tutte le versioni moderne di Java supportano gli attributi dei file nei numerosi file system tramite implementazioni delle interfacce FileAttributeView e BasicFileAttributes.

A proposito, devi prestare particolare attenzione quando scrivi codice specifico per il file system. Assicurati sempre che la logica e la gestione delle eccezioni coprano tutti i casi in cui il tuo codice potrebbe essere eseguito su un file system diverso.

Il listato 1 manipola i permessi dei file di un file di testo (sample.txt) che si trova nella home directory di un utente. L'utente (ben) desidera concedere ad altri nello stesso gruppo il permesso di leggere il file. La classe POSIX PosixFileAttributes specifica del sistema consente di aggiungere l'autorizzazione di sola lettura al gruppo (e fornisce un esempio dell'API).

---

### Listato 1. Supporto degli attributi di file in NIO.2


```java
import java.nio.file.attribute.*;

import static java.nio.file.attribute.PosixFilePermission.GROUP_READ;

try {
    var teamList = Path.of("/Users/ben/sample.txt");
    PosixFileAttributes attrs =
        Files.readAttributes(teamList, PosixFileAttributes.class);

    Set<PosixFilePermission> posixFilePermissions = attrs.permissions();

    var owner = attrs.owner().getName();
    var perms = PosixFilePermissions.toString(posixFilePermissions);
    System.out.format("%s %s%n", owner, perms);

    posixFilePermissions.add(GROUP_READ);
    Files.setPosixFilePermissions(teamList, posixFilePermissions);
} catch(IOException e) {
    e.printStackTrace();
}
```

Il codice inizia importando alcune classi di attributi e una costante PosixFilePermission, quindi ottiene un handle per il file sample.txt. Utilizzando un metodo helper da Files, ottiene l'accesso agli attributi PosixFileAttributes e successivamente agli attributi PosixFilePermission. Il codice ripete le autorizzazioni correnti e quindi aggiunge la nuova autorizzazione di lettura del gruppo al file.

(Ho lasciato alcune informazioni di tipo non necessarie per facilitare la leggibilità nell'esempio. Nel codice funzionante, parte di questo boilerplate potrebbe essere rimosso.)

---

## Collegamenti simbolici

Oltre a questi tipi di attributi di base, Java dispone anche di un sistema estensibile per supportare funzioni speciali del sistema operativo. Mostrerò questo supporto esaminando un esempio di supporto di collegamento simbolico. I collegamenti simbolici (link simbolici) sono disponibili in molti sistemi operativi comuni inclusi (ma non limitati a) Linux, macOS e Windows.

Un collegamento simbolico può essere pensato come un puntatore a un altro file o directory e nella maggior parte dei casi questi collegamenti vengono trattati in modo trasparente. Ad esempio, l'utilizzo di un collegamento simbolico per passare a una directory ti porterà nella directory a cui punta il collegamento simbolico. Tuttavia, alcuni software, come le utilità di backup, devono discernere e manipolare i collegamenti simbolici come caso speciale. NIO.2 lo consente.

---

Il supporto Java per i collegamenti simbolici segue fondamentalmente la semantica dell'implementazione UNIX. L'esempio seguente esamina e segue un collegamento simbolico per /opt/maven che punta alla directory specifica per apache-maven-3.6.1. Il file system è simile al seguente:

```text
ben$ ls -l /opt/
totale 0
drwxr-xr-x 9 root wheel 288 21 aprile 2019 apache-maven-3.6.1
lrwxr-xr-x 1 root wheel 18 21 aprile 2019 maven -> apache-maven-3.6.1
```


---

### Listato 2. Esplorazione di un collegamento simbolico

Il listato 2 esplora il collegamento simbolico.

```java
Path path = Path.of("/opt/maven");
try {
    if (Files.isSymbolicLink(path)) {
        Path contents = Files.readSymbolicLink(path);
        Path target = path.toRealPath();
        System.out.println("Link contents: "+ contents);
        System.out.println("Link target: "+ target);
        var attrs = Files.readAttributes(target, BasicFileAttributes.class);
        System.out.println(attrs);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

Il codice inizia controllando se il Path è un collegamento simbolico e, in tal caso, legge il contenuto del collegamento simbolico. Questo è espresso come un oggetto Path, ma non punta alla destinazione del collegamento. In questo caso, i contenuti contengono il componente a Path singolo apache-maven-3.6.1, che non punta al Path fisico effettivo, /opt/apache-maven-3.6.1.

---

Invece, per accedere al file, usa toRealPath(), che restituisce un Path che è il Path fisico completamente risolto.

Nota: questa discussione riguarda solo i collegamenti simbolici. Nelle API Java, più file hard-link (supponendo che siano supportati dal sistema operativo) non vengono distinti. Ad esempio, tutti gli hard link sono trattati come equivalenti.

---
## Trattare con le directory in NIO.2

La capacità di Java di navigare nelle directory è stata oggetto di un'importante revisione in NIO.2. L'aggiunta della nuova interfaccia java.nio.file.DirectoryStream e le relative classi di implementazione consentono di eseguire i seguenti tipi di operazioni:

* Itera sulle voci in una directory
* Gestisci strutture di directory di grandi dimensioni
* Filtra le voci utilizzando reespressioni regolari e rilevamento del contenuto basato su MIME
* Eseguire operazioni ricorsive di spostamento, copia ed eliminazione tramite il metodo walkFileTree()

---

Il listato 3 mostra un semplice esempio di come utilizzare una corrispondenza del modello di espressione regolare per elencare tutti i file .java in una directory di progetto.

### Listato 3. Trovare i file corrispondenti


```java
try {
    var dir = Path.of("/Users/ben/projects/openjdk/jdk");
    DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.java");
    for (Path entry: stream) {
        System.out.println(entry.getFileName());
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

Il codice inizia da un Path di base e costruisce un DirectoryStream. È fonte di confusione perché, nonostante il nome, questa classe non implementa l'interfaccia Stream (infatti, DirectoryStream è precedente a Java 8). Invece, la classe è destinata ad essere utilizzata come strumento di filtraggio. Il codice itera sulle voci che sono state trovate e le stampa ciascuna.

Il listato 3 mostra quanto sia facile utilizzare questa API quando si ha a che fare con una singola directory. Ma c'è un problema che vedrai se esegui il codice: non restituisce risultati. Questo perché il codice cercherà solo in una singola directory, il che non è molto utile.

---

Cosa puoi fare se devi filtrare in modo ricorsivo tra più directory?

Ad esempio, i file sorgente di Java in genere si trovano in una struttura di pacchetto. E il codice sorgente di OpenJDK non è memorizzato nella directory principale ma più in basso nel file system in src/java.base/share/classes/java/lang/. Pertanto, i file di origine esistono in più directory, a più livelli di profondità nel file system. Hai bisogno di un modo per gestire questo layout e la ricorsione che percorre l'albero delle directory è un modo naturale per raggiungere questo obiettivo.

L'esplorazione di un albero di directory è una caratteristica relativamente rara di Java e coinvolge una serie di interfacce e dettagli di implementazione. Il metodo chiave da utilizzare per percorrere la directory è

```java
Files.walkFileTree(Path inizialeDir, FileVisitor<? super Path> visitatore);
```

---


Fornire la startingDir è abbastanza facile, ma per quanto riguarda un'implementazione dell'interfaccia FileVisitor? Sfortunatamente, non è così semplice come fornire un lambda; infatti, è necessario implementare almeno cinque metodi.

* `FileVisitResult preVisitDirectory(T dir)`
* `FileVisitResult preVisitDirectoryFailed(T dir, IOException exc)`
* `FileVisitResult visitFile(T file, BasicFileAttributes attrs)`
* `FileVisitResult visitFileFailed(T file, IOException exc)`
* `FileVisitResult postVisitDirectory(T dir, IOException exc)`

Sembra una discreta quantità di lavoro, ma fortunatamente l'API fornisce un'implementazione predefinita, **SimpleFileVisitor**. Continuando dall'esempio nel Listato 3 di trovare i file sorgente .java in una directory, ora puoi elencare i file sorgente .java da tutte le directory che si trovano sotto /Users/ben/projects/openjdk/jdk. Il listato 4 mostra questo utilizzo del metodo walkFileTree().

---

### Listato 4. Ricerca del codice sorgente Java nelle sottodirectory


```java


var startingDir = Path.of("/Users/ben/projects/openjdk/jdk");
Files.walkFileTree(startingDir, new FindJavaVisitor());

public class FindJavaVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (file != null && attrs != null) {
            if (file.getFileName().toString().endsWith(".java")) {
                System.out.println(file.getFileName());
            }
        }
        return FileVisitResult.CONTINUE;
    }
}
```

Si inizia creando un oggetto Path e quindi si chiama il metodo Files.walkFileTree(). Passa un oggetto **FindJavaVisitor**, che è un'implementazione che estende SimpleFileVisitor. In altre parole, lascia che SimpleFileVisitor faccia la maggior parte del lavoro di attraversamento delle directory e così via. L'unico codice che devi scrivere è quando esegui l'override del metodo visitFile(). In questo metodo, scrivi un semplice codice per vedere se un file termina con .java e fai eco al suo nome su stdout se lo fa.

---

Altri casi d'uso potrebbero essere lo spostamento, la copia, l'eliminazione o la modifica ricorsiva dei file. Nella maggior parte dei casi, dovrai solo implementare un'estensione alla classe SimpleFileVisitor, ma la flessibilità è presente nell'API se desideri implementare il tuo FileVisitor completo.
Guarda i servizi e le notifiche di modifica dei file

I file e le directory sono entità che possono cambiare in vari modi, dati i loro attributi e il loro contenuto. Come fai a sapere che sono cambiati in modo da poter reagire a quell'evento?

Le API Java forniscono la possibilità di monitorare un file o una directory per le modifiche. Questo viene fatto attraverso la classe WatchService in java.nio.file. Questa classe utilizza i thread client gestiti dalla VM per tenere d'occhio i file o le directory registrati per le modifiche e restituirà un evento quando viene rilevata una modifica. Non è necessario gestire questi thread.

Questo tipo di notifica degli eventi può essere utileul per il monitoraggio della sicurezza, l'aggiornamento dei dati da un file delle proprietà, la ricerca della creazione o delle modifiche del registro e molti altri casi d'uso. Nel Listato 5, WatchService viene utilizzato per rilevare eventuali modifiche alla home directory dell'utente ben e per stampare un evento di modifica sulla console.

---

### Listato 5. Utilizzo di WatchService


```java
try {
    var watcher = FileSystems.getDefault().newWatchService();
    var dir = Path.of("/Users/ben");

    var registered = dir.register(watcher, ENTRY_MODIFY);

    while (!shutdown) {
        WatchKey key = null;
        try {
            key = watcher.take();
            for (WatchEvent<?> event : key.pollEvents()) {
                if (event == null) {
                    continue;
                }
                if (event.kind() == ENTRY_MODIFY) {
                    System.out.println("Home dir changed!");
                }
            }
            key.reset();
        } catch (InterruptedException e) {
            // Log interruption
            shutdown = true;
        }
    }
} catch (IOException | InterruptedException e) {
    e.printStackTrace();
}
```

---

La configurazione iniziale comporta l'ottenimento del WatchService predefinito e un handle sulla ben home directory. La prossima è la registrazione di un orologio di modifica su quella directory. Quindi, utilizzando il modello di arresto sicuro (di solito visto con una variabile booleana volatile shutdown), il metodo take() su WatchService si blocca fino a quando non diventa disponibile un WatchKey. Non appena la chiave viene resa disponibile, il codice esegue il polling di WatchKey per un elenco di oggetti WatchEvent.

Se viene trovato un WatchEvent di tipo ENTRY_MODIFY, il codice comunica tale fatto echeggiando l'evento. Infine, reimposta la chiave in modo che sia pronta per il prossimo evento.

Questa tecnica non è ampiamente utilizzata, ma può essere un approccio utile e una buona cosa da tenere nella cassetta degli attrezzi delle ricette I/O.

---

A proposito, alcune implementazioni del file system possono occasionalmente restituire un evento nullo, quindi dovresti controllare quella condizione.
File temporanei

I metodi helper nella classe Files includono funzionalità per creare e utilizzare directory e file temporanei. (Si noti che i sistemi operativi simili a UNIX puliscono automaticamente le aree di lavoro temporanee come /tmp, spesso al riavvio del sistema. Non si dovrebbero mai trattare queste aree come memoria permanente.)

Il modo più semplice per creare un file temporaneo è

```java
Path p;
try {
     p = Files.createTempFile("temp", null);
} catch (IOException e) {
     e.printStackTrace();
}
// codice con cui lavorare p
```

---

Dopo aver finito con il file, per impostazione predefinita, devi eliminarlo. Questo diventa rapidamente noioso, ma fortunatamente l'API ha una soluzione semplice. La classe Files fornisce metodi pratici per attività come un flusso di output da un Path. Questi helper hanno la possibilità di specificare le opzioni su come il file deve essere aperto e chiuso, come le seguenti:

```java
Path p;
try {
     p = Files.createTempFile("temp", null);
     System.out.println(p.getFileName());
     prova (var output = Files.newOutputStream(p, DELETE_ON_CLOSE)) {
         // funziona con OutputStream
         // Il file temporaneo verrà automaticamente ripulito
     }
} catch (IOException e) {
     e.printStackTrace();
}
```

Come puoi vedere, il file temporaneo verrà automaticamente eliminato quando il file viene chiuso, il che avverrà quando il blocco try interno sarà completo. Questo è molto più pulito e sicuro rispetto alla richiesta di pulizia manuale e dimostra una buona interazione con la funzionalità del linguaggio try-with-resources.

---

Il Listato 6 decomprime un file .jar in una directory temporanea. Questo utilizza non solo la gestione della directory temporanea, ma anche un ZipInputStream. Questa è una classe molto utile per lavorare con i file .zip (ricorda che i file JAR sono in realtà solo file .zip con una directory di metadati memorizzata al loro interno insieme al codice).

### Listato 6. Lavorare con i file .zip


```java
public static Path unpackJar(String zipFilePath) throws IOException {
    var tmpDir = Files.createTempDirectory(Path.of("/tmp"), "jar-extract");

    try (var zipIn = new ZipInputStream(new FileInputStream(zipFilePath))) {
        var entry = zipIn.getNextEntry();

        while (entry != null) {
            var newFile = tmpDir.resolve(entry.getName());
            if (entry.isDirectory()) {
                Files.createDirectory(newFile);
            } else {
                Files.copy(zipIn, newFile);
            }
            zipIn.closeEntry();
            entry = zipIn.getNextEntry();
        }
    }

    return tmpDir;
}
```

---

## Legacy: Package java.io

Per eseguire l'elaborazione dei file in Java, è necessario importare il package java.io, che contiene le definizioni delle seguenti classi di flussi:

classe|descrizione
---|---
classe InputStream	| per input di byte da un file una per l'output
classe OutputStream	| per output di byte verso un file
classe Reader		| per input di caratteri da un file
classe Writer		| per output di caratteri verso un file

---
## Il flusso - Stream

Per prelevare informazioni da una fonte esterna (un file, una rete, ecc.), un programma deve aprire uno stream su essa e leggerne le informazioni in maniera sequenziale.

Allo stesso modo un programma può spedire a una destinazione esterna aprendo uno stream su essa e scrivendo le informazioni sequenzialmente.

---

## Character Stream

Gli stream che leggono o scrivono caratteri nei file sono detti character stream. I file che sono creati usando stream a caratteri sono detti file di testo.

**Reader** e **Writer** sono le due superclassi astratte per i character stream.
Queste due classi hanno la caratteristica di obbligare le sottoclassi a leggere e scrivere dividendo i dati in "pezzi" di 16 bit ognuno, quindi compatibili con il tipo char di Java.

---

## Byte Stream

Gli stream che leggono o scrivono byte (dati binari) nei file sono detti byte stream. I file che sono creati usando degli stream binari sono detti file binari.

**InputStream** e **OutputStream** sono le due superclassi astratte per i byte stream.

Queste due classi hanno la caratteristica di obbligare le sottoclassi a leggere e scrivere dividendo i dati in "pezzi" di 8 bit ognuno. Praticamente esistono gerarchie di classi parallele alle classi viste per i character stream.


I programmi dovrebbero utilizzare i byte stream per le informazioni di tipo non testuale, come, ad esempio, immagini o suoni.

---

## Le classi astratte di Reader e InputStream

Reader e InputStream definiscono gli stessi metodi, ma per differenti tipi di dati.
In particolare, Reader dichiara i metodi per leggere flussi di caratteri da una sorgente, mentre InputStream dichiara i metodi per leggere byte ed array di byte.


Il metodo read() della classe **Reader** si occupa di leggere flussi di caratteri da una sorgente specifica e restituisce:

* un int (da 0 a 65535) che rappresenta il carattere letto
* il valore -1 se il file è terminato

Il metodo read() della classe **InputStream** si occupa di leggere un byte alla volta da una sorgente specifica e restituisce:
un int (da 0 a 255) che rappresenta il byte letto
il valore -1 se il file è terminato

---

## Le classi astratte di Writer e OutputStream

  Il metodo write() della classe Writer si  occupa di scrivere flussi di caratteri in una destinazione specifica. Il carattere è passato come argomento di tipo int.
  Il metodo write() della classe InputStream si occupa di scrivere un byte alla volta. Il byte è passato come argomento di tipo int.

---

## IOException

l'I/O da file

* Richiede la gestione di eccezioni controllate
* La radice della gerarchia di queste eccezioni è IOExcetion

```java
import java.io.*;

public metodo() throws IOException {
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
```

* Chiusura degli stream
  * gli stream devono essere chiusi, oggi si può fare con il blocco try-with-resources
* Lettura da tastiera
  * Reader+BufferedReader
  * Scanner


---

#

## Object Stream: Serializzazione di oggetti

Tutte le classi che implementano l'interfaccia Serializable possono essere salvate su persistenza attraverso un ObjectOutputStream e caricate con un ObjectInputStream. Queste ultime sono classi che implementano le interfacce ObjectOutput e ObjectInput e consentono agli oggetti di essere letti o scritti in uno stream (possibilmente un file).

Scriviamo una classe Java  con un solo campo id ed i corrispondenti metodi getter e setter.

```java

    public class Base implements Serializable {
        private int id;
     
        public int getId() {
            return id;
        }
     
        public void setId(int id) {
            this.id = id;
        }
    }


```

Creiamo un'altra classe che estende la classe base (chiamata Figlia) aggiungendo un campo nome.

```java
    public class Figlia extends Base implements Serializable {
        private String nome;
     
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome() {
            return nome;
        }
    }


```

Scriviamo un blocco di codice di prova per serializzare e deserializzare un oggetto (usando le classi descritte all'inizio di questo paragrafo).

```java
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


```

---

## snippets


### I costrutti

`File <inF> = new File ("<nameIn>");`
`FileReader <inR> = new FileReader (inF);`
`File <outF> = new File ("<nameOut>");`
`FileWriter <outW> = new FileWriter (outF);`

possono essere scritti come segue

`FileReader <inR> = new FileReader("<nameIn>");`
`FileWriter <outW> = new FileWriter("<nameOut>");`

---
### Metodi generali

  * Chiusura del file
`public void close () throws IOException`
  * Scrittura dei caratteri nel "buffer"
`public void flush () throw IOEXception`

---
### Modalità di lettura

  * Il metodo read restituisce (-1) al raggiungimento di EOF
  * Lettura di caratteri singoli
`public int read () throws IOException`
  * Lettura di un numero di caratteri pari alla lunghezza di un vettori di caratteri
`public int read (char [] charArray) throws IOException`

---
### Modalità di scrittura

* Scrittura di caratteri singoli
  * `public void write (int c) throws IOException`
* Scrittura di un vettore di caratteri
  * `public void write (char [] charArray) throws IOException`
* Scrittura parziale di un vettore di caratteri
  * `public void write (char [] charArray, int da, int a) throws IOException`
* Scrittura di una stringa
  * `public void write (String s) throws IOException`
* Scrittura parziale di una stringa
  * `public void write (String s, int da, int a) throws IOException`

---

## I/O orientato alle righe

La lettura di righe intere è permessa dalla classe BufferedReader

### I metodi di BufferedReader

* Sono analoghi a quelli della classe Writer (metodo write)
* L'I/O bufferizzato è più efficiente
  * Lettura di una riga intera
  * (conclusa dai caratteri `\n = linefeed`, `\r = carriage return`) 

```java
public String readLine () throws IOException
//Ritorna null al raggiungimento di EOF
import java.io.*;
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
```

---

### I costrutti

* `FileReader <inR> = new FileReader("<nameIn>");`
* `BufferedReader <inB> = new BufferedReader(<inR>);`

* `FileWriter <outF> = new FileWriter("<nameOut>");`
* `BufferedWriter <outW> = new BufferedWriter(outF);`

possono essere scritti come

* `BufferedReader <inB> = new BufferedReader(new FileReader ("<nameIn>"));`
* `BufferedWriter <outW> = new BufferedWriter(new FileWriter ("<nameOut>"));`

## La classe file

### La classe file permette controlli su
* File
* Directory

---
### Definisce/rappresenta nomi/path

  * Crea un oggetto di tipo file
`public File (String pathName)`
e.g.,
`File <x> = new File ("<nameIn>");`
`File <y> = new File ("c:\dir1\dir2", "<nameOut>");`

---
### Check file/direttory

* Verifica che l'oggetto esista
  * `public boolean exists()`
e.g., if (<x>.exists ()) ...
* Verifica se l'oggetto è un file
  * `public boolean isFile()`
e.g., if (<x>.isFile ()) ...
* Verifica se l'oggetto è una directory
  * `public boolean isDirectory()`
* Restituisce il nome del file o directory
  * `public String getName()`
* Restituisce la stringa che descrive il path
  * completo del file
`public String getAbsolutePath ()`
* Restituisce dimensione in byte
  * `public long length ()`
* Controlla se il file può essere scritto
  * `public boolean canWrite()`
* Controlla se il file può essere letto
  * `public boolean canRead ()`

---
### Contenuto di una directory

* Restituisce l'array di stringhe contenenti I nomi dei file/directory nel direttorio corrente
* `String [] list ()`
* e.g.,
* `String fileName[] = <x>.list ();`
* `for (int i=0; i<fileName.length; i++)`
* `System.out.println (filename[i]);`

