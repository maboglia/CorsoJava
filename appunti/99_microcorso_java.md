# Linguaggio Java


### La prima applicazione Java

File HelloWorld.java

public class HelloWorld {
public static void main (String args[]) {
System.out.println ("Hello world!");
}
}
> javac HelloWorld.java
> java HelloWorld
HelloWorld!
>
Compilazione
(produce HelloWord.class)
Esecuzione

### Classi ...
* Non contengono istruzioni
* Contengono metodi

### Metodi ...
* Contengono le istruzioni
* Attivati solo dall'interno di un altro metodo
* Eventuale uso di parametri & valore di ritorno
* Tra i vari metodi esiste il metodo main da cui si "parte"

### Lettere minuscole VS Maiuscole Metodi


### Analoghi alle funzioni di altri linguaggi (C, PHP)
* Meccanismo di attivazione call & return
* Parametri in ingresso
* Variabili locali & istruzioni
* Valore di ritorno

### Definizione
tipoRestituito nomeMetodo (
[tipo 1 par 1 [, tipo 2 par 2 ... [tipo n par n ]]]
)
{
. . . <corpo> . . .
}

### Invocazione
* Parametri attuali (chiamante)
* Parametri formali (chiamato – definizione)

### Passaggio di parametri
* Possono essere:
  * Dati primitivi
  * Reference
* Avviene  sempre per valore
* Nel caso di parametri reference, quello che
viene copiato è il reference, NON l'oggetto
  * Equivale al passaggio per riferimento

### Valore di ritorno
* Analogo ad altri linguaggi
* Il tipo del metodo e il tipo ritornato devo coincidere

### Possibilità di definire 
* metodi ricorsivi
* [Tipi primitivi](02_tipi.md), 
* Costanti e 
* [Operatori](02_operatori.md)


### Modificatore final
final float pigreco = 3.14;
pigreco = 16.0; // NO
* Dichiara costanti simboliche
* Dovrebbero essere dichiarate sempre
static
(per non sprecare spazio per ogni istanza)
6Operatori per Interi e Reali

## Strutture elementari

## Commenti

### Commenti multilinea
/* questo e` un commento
che si estende su due linee */

### Commenti su linea singola
// questo e` un commento monolinea

### Commenti di documentazione
/** commento per javadoc
.... */

## Blocchi e regole di scope

### I blocchi
* Definiti da { e }

### Visibilità (scope)
* I parametri sono locali al metodo
* Le variabili possono essere
  * Locali al metodo
  * Locali al blocco
  * Vasto uso di definizioni locali

### Ogni blocco

* Introduce un nuovo scope per le variabili
* Le variabili si possono dichiarare
  * All'inizio del blocco
  * All'interno del blocco
{
int x;
for (int i=0; i<N; i++){
x = 12;
...
int y;
...
}
}

## Costrutti Condizionali

* if-else
* switch

### Attenzione: gli interi NON sono booleani
* NON è possibile fare test del tipo `if(x)` con x intero
* Occorre usare operatori relazionali `if (x != 0)`

## Costrutti iterativi

### Semantica e sintassi

* while
* do-while
* for
* break
* continue


## Input Output (Elementare)

### L'input/output di caratteri e di interi è relativamente spartano

### Richiede l'utilizzo di concetti "complessi"
* Eccezioni
* I/O

## Output

### Comandi:
System.out.println (...)
System.out.print (...)

### Esempi:
* Visualizzare il valore di una variabile
`System.out.print (x);`
* Visualizzare una stringa
`System.out.print ("Valore =");`
* Visualizzazione con sequenze di escape
`System.out.print ("\tValore =\n");`
* Utilizzo dell'operatore di concatenazione di stringhe
`System.out.println ("Concatenazione" + " di" + " stringhe");`
* Il costrutto di concatenazione vale anche per tipi diversi dal tipo String
`System.out.println ("Valore = " + x);`


## Input

### Lettura di un vettore di byte
byte vettore[] = new byte[10];
...
try{
System.in.read (vettore);
} catch (Exception e) {}
...

### Trasformazione della stringa di byte in
* valori booleani
* valori interi (con segno)
* valori reali (con segno)
* etc.
byte s[] = new byte[10];
int val = 0;
...
try{
System.in.read (s)
} catch (Exception e) {}
...
for (int i=0; i<s.length; i++) {
if (s[i]>=‘0' && s[i]<=‘9')
val = val ### 10 + s[i] – ‘0';
}
...
## Input/Output in modalità grafiche

### Java è stato progettato per lavorare in modalità grafiche

### Una possibilità è utilizzare la classe JOptionPane definita nel package javax.swing


(package swing)
// Importa Classe JOPtionPane
import javax.swing.JOptionPane;
...
String inputS;
String outputS;
int nValue;
...
// Input
inputS = JOptionPane.showInputDialog
("Messaggio");
nValue = Integer.parseInt (inputS);
...
// Output
// (previa creazione della stringa output)
JOptionPane.showMessageDialog (
null, output, "Messaggio",
JOptionPane.INFORMATION_MESSAGE );


## [array](03_array.md)
## [Stringhe e Caratteri](03_stringhe.md)

## [Metodi & Classi: Concetti base](03_classi.md)

## Ereditarietà

### Meccanismo Java che realizza la
* Specializzazione
* Generalizzazione
* permettendo l'estensione di "vecchie classi" in "nuove classi"

### La classe che eredita da un'altra
* Eredita attributi e operazioni
* Può modificare attributi/operazioni ereditati (override)
* Può aggiungere attributi/operazioni

### Sintassi
public class <nuovaClasse> extends
<vecchiaClasse> {
. . .
}
Esempio 1
Automobile
colore
marca
accesa
mettiInMoto
vernicia
stampaStato

### Automobile elettrica
AutomobileElettrica
batterieCariche
ricarica
mettiInMoto
* eredita
  * attributi (colore, marca, accesa)
  * operazioni (vernicia, stampaStato)
* modifica (override)
  * mettiInMoto
* aggiunge
  * attributi (batterieCariche)
  * operazioni (ricarica )
2class Automobile {
String colore;
String marca;
boolean accesa;
void mettiInMoto() {accesa = true;}
void vernicia (String nuovoCol) { ... }
void stampaStato () { . . .}
}
class AutomobileElettrica extends Automobile {
boolean batterieCariche;
void ricarica() {batterieCariche=true;}
void mettiInMoto() {
if(batterieCariche) accesa=true;
else accesa=false;
}
}
Esempio 2
Impiegato
nome
stipendio
aumentaStipendio
stampa
Dirigente
Segretario
grado
aumentaStipendio
stampa
aumentaGrado
stampa
3class Impiegato {
private String nome;
private double stipendio;
public Impiegato(String n, double s) {
nome = n;
stipendio = s;
}
public void aumentaStipendio
(double percentuale) {
stipendio *= 1 + percentuale / 100;
}
public void stampa() {
System.out.println("Impiegato" + nome +
" " + stipendio);
}
}
class Dirigente extends Impiegato {
int grado;
public Dirigente(String n, double s) {
nome = n;
stipendio = s;
}
public void aumentaStipendi (double percentuale) {
int bonus = grado ### 3;
// 3% di bonus per ogni grado
stipendio *= 1+(percentuale+bonus)/100;
}
public void stampa() {
System.out.println("Dirigente" + nome +
" " + stipendio);
}
public void aumentaGrado() {
grado++;
}
}

Visibilità: costrutto "protected"
class Impiegato {
private String nome;
private double stipendio;
}
class Dirigente extends Impiegato {
void stampa() {
System.out.println("Dirigente" + nome +
" " + stipendio);
}
}
INACCESSIBILI

### Visibilità di attributi e metodi
* public: sono accessibili senza restrizioni
* private: sono accessibili solo all'interno
della classe in cui sono definiti
* protected: sono accessibili dalla classe e in
più sono accessibili dalle classi derivate da
quella in cui sono definiti
5Classe
stessa
Si Classe
derivata
No Altra
classe
No
Protected Si Si No
Public Si Si Si
Private
Puntatori this e super

### Puntatori
* this riferisce l'oggetto corrente
* super riferisce l'oggetto "sopra" this
("superoggetto") ovvero la superclasse
class AutomobileElettrica extends Automobile {
boolean batterieCariche;
void ricarica() {
batterieCariche=true;
}
void mettiInMoto() {
if(batterieCariche)
super.mettiInMoto();
}
}
6Ereditarietà e costruttori

### Ogni oggetto contiene un'istanza della
propria superclasse
* La superclasse deve essere inizializzata
* Il compilatore Java inserisce
automaticamente una chiamata al
costruttore di default del superoggetto
* La chiamata al costruttore del superoggetto
viene inserita come PRIMA istruzione del
nuovo costruttore
  * L'esecuzione dei costruttori procede dalla radice
verso il basso nella gerarchia di ereditarietà
  * È garantito che quando un metodo di una classe
viene eseguito (costruttore compreso), la
superclasse sia già inizializzata completamente
7Esempio
class Arte {
Arte() {
System.out.println("Costruttore Arte"); }
}
class Disegno extends Arte {
Disegno() {
System.out.println("Costruttore Disegno"); }
}
class DisegnoAnimato extends Disegno {
DisegnoAnimato() {
System.out.println("Costruttore DisegnoAnimato");
}
}
DisegnoAnimato d = new DisegnoAnimato();
Costruttore classe Arte
Costruttore classe Disegno
Costruttore classe Disegno Animato
Costruttori con parametri

### Se i costruttori hanno parametri
* Il compilatore non è in grado di inserire automaticamente la chiamata
* Le istanze delle superclassi devono essere inizializzate correttamente tramite chiamate esplicite ai costruttori (utilizzando la variabile super)
* La chiamata del costruttore della superclasse deve essere la PRIMA istruzione del costruttore
  * Il compilatore lo controlla
  * L'ordine di inizializzazione degli oggetti è sempre quello giusto

Esempio
class Dirigente extends Impiegato {
int grado;
Dirigente(String n, double s) {
super (n,s);
grado = 1;
}
void aumentaStipendio(double percentuale) {
int bonus = grado ### 3;
super.aumentaStipendio(percentuale+bonus);
}
...
}

## La classe Object - Albero di derivazione

### Tutte le classi in Java derivano dalla
classe Object

### Non si può definire una classe che non
eredita da nessun'altra classe
* Ogni classe esclusa Object ha una
superclasse
* Se non specificato altrimenti, una classe
deriva direttamente da Object
class Mammifero {
...
}
Object
Mammifero
La classe Object

### Contiene alcuni metodi generali Esempi
* String toString()
  * Restituisce una stringa che rappresenta
univocamente l'oggetto
* boolean equals(Object obj)
  * Restituisce vero se obj e this sono lo stesso
oggetto

### Normalmente questi metodi sono
ridefiniti (overridden) nelle classi
derivate
10Dynamic binding

### Per binding si intende l'associazione
messaggio – metodo
Automobile a;
for(int i=0; i<garage.length; i++){
a = garage[i]
a.mettiInMoto();
}
messaggio
metodo ?
Automobile
colore
marca
accesa
mettiInMoto
vernicia
stampaStato
AutomobileElettrica
batterieCariche
ricarica
mettiInMoto
11
### Due scelte possibili
* Statico
  * Associazione fatta in base al mpile time
* Dinamico (default in Java)
  * Associazione fatta in base al tipo run time
  * Java sceglie il corretto metodo dell'appropriata
sottoclasse associata all'oggetto

### N.B. se le classi non sono legate da
ereditarietà è possibile una scelta sola
Moto m;
m.mettiInMoto();
Aereo a;
a.mettiInMoto();
Moto Aereo
mettiInMoto mettiInMoto
L'attributo final

### Definisce un dato elemento come non
più modificabile
* Applicato a variabile la trasforma in
costante
* Applicato a un metodo
  * Ne impedisce l'overriding in classi derivate
  * Ne rende possibile l'inlining (binding statico -
più efficiente)
* Applicato a una classe
  * Impedisce di derivare da essa altre classi (la
classe deve essere una foglia dell'albero di
ereditarietà)
12Casting di oggetti
Type Casting di Oggetti

### È possibile modificare il tipo di un
riferimento ad oggetto soltanto tra tipi
in relazione di ereditarietà

### L'oggetto rimane invariato
EssereVivente
Animale
Vegetale
Downcasting
EssereUmano
Fungo
Upcasting
Lichene
13Upcasting

### Caratteristiche
* È sempre affidabile (è sempre vero che un
auto elettrica è un auto)
* È automatico

###  Poichè ogni classe è (direttamente o
indirettamente) sottoclasse di Object è
sempre possibile fare upcast di qualsiasi
oggetto su Object
QualcheClasse a = new QualcheClasse();
Object o;
o = a;
(vedi Collection)
Downcasting

### Caratteristiche
* Non è automatico (richiede cast esplicito)
* Può non essere affidabile
  * Non tutte le auto sono autoelettriche
  * Un downcasting può provocare un errore run-time

### Per evitare un errore a run time
* instanceof (Run Time Type Identification)
Automobile a = new Automobile();
AutoElettrica ae;
if (a instanceof AutoElettrica){
ae = (AutoElettrica) a;
ae.ricarica();
}
14Linguaggio Java
Package, Tipi primitivi/Classi
Wrapper, Classe astratta,
Interfaccia, Memorizzazione
Package
1Motivazione

### La classe è un elemento di
modularizzazione più potente della
procedura
* Progresso rispetto al modello procedurale
* È ancora piccolo
* Occorre un livello di modularità più ampio
  * Insieme di classi
Regole

[package](20_JavaPackages.md) 


Librerie grafiche
[Tipi Primitivi – Classi Wrapper](02_tipi.md)

## Classi Astratte

### Un metodo astratto è un metodo di cui
non viene specificata l'implementazione

### Una classe astratta è una classe avente
almeno un metodo astratto

### Esempio
abstract class Forma {
...
abstract void stampa();
...
}
Uso delle Classi Astratte

### Una classe astratta
* È una classe non completamente definita
* Non può essere istanziata

### Per ottenere una classe concreta
(istanziabile) da una astratta occorre
definire tutte le implementazioni
mancanti ovvero
* Ereditare la classe facendo l'overriding di
tutti i metodi astratti

### Permette di trattare omogeneamente
oggetti con caratteristiche diverse
(tramite upcasting)
11Interfacce
Interfacce

### Un'interfaccia è una classe
completamente astratta , cioè del tutto
priva della parte di implementazione
* Tutti i metodi sono astratti
* Non vi sono attributi
  * È possibile definire solo "attributi" final (in
pratica costanti)
  * Definendo un attributo in un'interfaccia questo
viene automaticamente considerato final
12
### Un'interfaccia
* Ha tutti i vantaggi e le indicazioni d'uso
delle classi astratte
* Presenta maggior flessibilità rispetto
all'ereditarietà di una classe astratta
Memorizzazione
13Tipi di memoria

### Si differenziano per la durata di
esistenza degli elementi che vi sono
memorizzati
* Memoria statica
  * Contiene gli elementi che esistono per tutta la
durata del programma
* Heap o memoria dinamica
  * Contiene gli elementi creati durante il
programma
* Stack
  * Contiene gli elementi creati durante una
chiamata di procedura
Memorizzazione oggetti

### Gli oggetti vengono allocati nella
memoria heap
heap
codice
oggetto
reference
stato
14Memorizzazione delle Variabili

### Variabili di istanza
* Memorizzate all'interno degli oggetti
(nell'heap)

### Variabili automatiche ( locali )
* Memorizzate nello stack

### Variabili statiche
* Memorizzate in aree statiche
Variabili di istanza

### Dichiarate all'interno di una classe
(attributi)
Class Window {
boolean visible;
...
Window1
visible
Window2
heap
visible

### Memorizzate in ogni istanza della classe

### Create/inizializzate alla creazione di
ogni istanza della classe
15Variabili automatiche (locali)

### Dichiarate all'interno dei metodi
Class Window {
...
void resize () {
int i;
for (i=0; i<5; i++)
...

### Memorizzate nello stack

### Create/inizializzate automaticamente
all'ingresso del blocco in cui sono
dichiarate

### Distrutte automaticamente all'uscita
Variabili statiche

### Dichiarate nelle classi o nei metodi con
qualificatore
static Class ColorWindow {
static String color;
...

### Memorizzate in copia unica
* associate alla classe => anche dette
variabili di classe

### Memorizzate in aree statiche

### Create/inizializzate al caricamento della
classe
16Static area
ColorWindow
color
heap
ColorWindow1
ColorWindow2
Distruzione di Oggetti

### Non viene fatta in modo esplicito
* Il programmatore non deve preoccuparsi di
distruggere gli oggetti

### Viene eseguita automaticamente
*  Garbage collector
  * Componente del Run Time che ha il compito di
recuperare lo spazio nella memoria heap
  * Quando necessario (per esempio quando si
esaurisce lo spazio disponibile in memoria
principale) esegue un'analisi dei riferimenti e
distrugge gli oggetti per i quali non esistono più
riferimenti
17Linguaggio Java
Exceptions
Motivazione

### Terminologia
* Errore: sbaglio del programmatore (non
gestibile)
* Eccezione: evento anomalo recuperabile

### La portabilità richiede la gestione delle
eccezioni
* Separare la gestione delle eccezioni dalla
gestione del caso nominale
* Permettere al client di una funzione di
gestire l'eccezione in modo appropriato (il
server spesso non conosce il modo migliore
per gestire l'errore)
1
### Esempio
readFile {
open the file;
determine its size;
allocate that much memory;
read the file into memory;
close the file;
}
readFile()
(client)
open file()
(server)
errorCodeType readFile {
initialize errorCode = 0;
open the file;
if (theFileIsOpen) {
determine the length of the file;
if (gotTheFileLength) {
allocate that much memory;
if (gotEnoughMemory) {
read the file into memory;
if (readFailed) {errorCode = -1;}
} else {errorCode = -2;}
} else {errorCode = -3;}
close the file;
if (theFileDidntClose && errorCode == 0) {
errorCode = -4;
} else {errorCode = errorCode and -4;}
} else {errorCode = -5;}
return errorCode;
}
2Concetti fondamentali

### Una istruzione non terminata
* Causa la creazione di un oggetto che
rappresenta quanto è successo
* Tale oggetto appartiene a una classe
derivata da Throwable (derivata da Object)
* Tali oggetti sono le eccezioni

### Si dice che l'eccezione
* Viene "gettata" (thrown) e
* In seguito deve essere "gestita" ovvero
"catturata" (catch)

### Costrutti per la gestione delle eccezioni
* try { } ... catch {}
  * "Getta" l'eccezione a livello di un blocco di
istruzioni
  * La "cattura" effettuandone la gestione
* throws
  * "Getta" l'eccezione a livello di metodi
* throw
  * "Getta" l'eccezione a livello di codice / istruzioni
3try ... catch

### Cattura le eccezioni generate in una
regione di codice
try {
// codice in cui possono verificarsi le eccezioni
...
}
catch (IOException e) {
// codice per gestire IOException e
...
}

### Per catturare eccezioni di classi diverse
si possono usare blocchi catch multipli
try {
...
}
catch(MalformedURLException mue) {
// qui recupero l'errore "malformedURL"
...
}
catch(IOException e) {
// qui recupero tutti altri errori di IO
...
}

### Costrutti try-catch possono essere
annidati (catch che include try-catch)
4
### Il blocco "finally" esegue istruzioni al
termine del blocco try-catch
* Senza di eccezioni
* Con eccezioni
* In presenza di return, break e continue
try {
...
}
catch (...) {
...
}
catch (...) {
...
}
...
finally {
...
}

### Esempio
* La System.in.read può provocare una
eccezione controllata di tipo IOException
* Occorre quindi inserirla in un blocco
try...catch...
byte b[] = new byte[10];
try {
System.in.read (b);
} catch (Exception e) {
...
}
...
5throws

### Permette a un metodo di gettare
eccezioni
<tipoMetodo> <nomeMetodo> (<argomenti>)
throws <classeEccezione 1 >
[, <classeEccezione 2 >
...
[, <classeEccezione n > ]...] {
...
}

### Le eccezioni gettate sono catturate
(responsabilità) dal chiamante

### Esempio
* Chi chiama il metodo leggi deve sapere se la
lettura è andata a buon fine oppure no
* Con try-catch gestiamo l'eccezione a livello
del chiamato (metodo leggi)
...
byte b[] = new byte[10];
try {
System.in.read (b);
} catch (Exception e) {
...
}
...
6* Sapere se la lettura è andata a buon fine, non
"interessa" tanto al chiamato (metodo leggi)
quanto al chiamante
static String leggi (String val) throws
IOException {
byte b[] = new byte[10];
System.in.read (b); // Senza try ... Catch
val = "";
for (int i=0; i<b.length; i++) {
val = val + (char) b[i];
}
return (val);
}
throw

### Permette di "gettare" in modo
"esplicito" una eccezione a livello di
codice
throw <oggettoEccezione>

### Provoca
* L'interruzione dell'esecuzione del metodo
* L'avvio della fase di cattura dell'eccezione
generata
* Dato che le eccezioni sono oggetti, chi getta
l'eccezione deve creare l'oggetto eccezione
(operatore new) che la descrive
7
### Esempio
...
if ( y==0 ){
throw new ArithmeticException (
"Frazione con denominatore nullo.");
}
z = x/y;
...
Classi di Eccezioni

### È una classe, subclass di Throwable o
discendenti, definita in java.lang
* Error: hard failure
* Exception: non sistemiche
* RuntimeException: il compilatore non forza il
catch
8
### Error
* Gli errori sono trattabili ma in genere
costituiscono situazioni non recuperabili
* OutOfMemoryError

### Exception
* ArithmeticException
  * Condizioni eccezionali in operazioni aritmetiche
(e.g., divisione per zero)
* ArrayIndexOutOfBoundsException
  * Accesso a posizione inesistente di un array
* ClassCastException
  * Cast di un riferimento a un sottotipo di cui
l'oggeto non è instanza
* NegativeArraySizeException
  * Creazione di un array di dimensione negativa
* NullPointerException
  * Tentativo di accesso a un elemento tramite un
riferimento uguale a null
* NumberFormatException
  * Conversione di una stringa in un valore numerico
senza che la stringa abbia formato opportuno
* ClassNotFoundException
* InstantiationException
* NoSuchMethodException
* IllegalAccessException
* EmptyStackException

### RuntimeException
* NullPointerException
9Definizione di una eccezione

### È possibile dichiarare eccezioni proprie,
se quelle fornite dal sistema (java.lang)
non sono sufficienti

### Si realizza creando sottoclassi di
Throwable
* Tali sottoclassi sono del tutto "assimilabili"
a classi "standard", e.g., possono
  * ereditare attributi e metodi
  * ridefinire il metodo costruttore
  * definire dei metodi get/set
  * etc.

### Esempio
public class NewExc extends
ArithmeticException {
public NewExc (String msg) {
super (msg);
}
}
...
try ... catch (NewExc e) ...
...
static String leggi (String val) throws
NewExc ...
...
throw new NewExc ("messaggio") ...
10Eccezioni controllate e non

### Le eccezioni si dividono in
* Controllate
  * Istanze di RuntimeException o delle sue
sottoclassi
  * Il compilatore si assicura esplicitamente che
quando un metodo solleva una'eccezione la tratti
esplicitamente
  * Questo può essere fatto mediante i costrutti
try-catch o throws
  * In caso contrario segnala un errore di
compilazione
* Non controllate
  * Sono tutte le altre eccezioni, ovvero istanze di
Exception ma non di RuntimeException
  * L'eccezione può non essere gestita
esplicitamente dal codice
  * Viene "passata" automaticamente da metodo
chiamato a metodo chiamante
  * Il compilatore non si lamenta

### Le eccezioni controllate vincolano il
programmatore ad occuparsi della loro
gestione

### Le eccezioni controllate possono rendere
troppo pesante la scrittura del codice
(e.g., NullPointerException non è
controllata)
11Linguaggio Java
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
8Linguaggio Java
Containers
Array

### Struttura dati efficiente ogni volta che
il numero di elementi è noto

### Permettono di contenere
* Dati primitivi
* Oggetti

### Sugli array si effettua
* Type-checking
* Bound-checking

### Ri-dimensionamento poco efficiente
* Utilizzo di altre strutture qualora il numero
di dati sia ignoto
1
### Il pacchetto java.util contiene metodi
statici di utilità
  * Copia di un valore in tutti gli (o alcuni) elementi
di un array
Arrays.fill (<array>, <value>);
Arrays.fill (<array>, <from>, <to>,
<value>);
  * Copia di array
System.arraycopy (<arraySrc>, <offsetSrc>,
<arrayDst>, <offsetDst>, <#elements>);
  * Confronta due array
Arrays.equals (<array1>, <array2>);
  * Ordina un array (di oggetti che implementino
l'interfaccia Comparable)
Arrays.sort (<array>);
  * Ricerca binaria (o dicotomica)
Arrays.binarySearch (<array>);
Introduzione, Tassonomia
& Classificazione
2Collections & Map

### Collezione di elementi
* Mantenuti mediante "reference"
* Di tipo generico (Object)
* Definiti nel package java.util

### Non specifica se
* Ordinati / non ordinati
* Con duplicati / senza duplicati
Tassonomia

### Simbologia
* Caselle
* Caselle
* Caselle
* Caselle
* Frecce
punteggiate: interfaccie
tratteggiate: classi astratte
continue: classi "normali"
in grassetto: classi più comuni
  * Classe implementa interfaccia o classe astratta
  * Classe astratta implementa parzialmente una
interfaccia
3Involucri principali
Tipi di Implementazione
Hash Resizable Balanced
Table Array Tree
List
ArrayList
Linked
List
LinkedList
(Vector)
Set HashSet TreeSet LinkedHas
hSet
Map HashMap TreeMap LinkedHas
hMap
4Collections

### Gruppo di oggetti singoli

### List
* Contiene elementi con ordine specifico
(e.g., stesso ordine di inserzione)
* Elementi duplicati
* ArrayList
  * Implementazione di una lista mediante array
  * Ricerca veloce
  * Inserzione/cancellazione lenta
* LinkedList
  * Implementa di una lista mediante lista linkata
  * Ottimo accesso sequenziale
  * Ottima inserzione e cancellazione
  * Accesso diretto lento
* Vector
  * Mantenuto per compatibilità
  * Più lento di ArrayList

### Set
* No elementi duplicati (elementi non inseriti
se presenti)
* No ordine (esiste un ordinamento ma è
interno)
5* HashSet
  * Set implementati come una Hash (accesso
veloce)
* TreeSet
  *  Set implementati come un albero
* LinkedHashSet
  * Sottoclasse di HashSet
  * Mantiene l'ordine di inserimento dei dati grazie
a una lista (in aggiunta alla hash)
  * Gli iterator forniscono l'ordine di inserzione
Map

### Gruppo di coppie di oggetti
* Associazione chiave-valore (key-value)
  * ex: codice fiscale - persona
  * matricola - studente
* Permette ricerche data la chiave
* No chiavi duplicate
* HashMap
  * Implementazione basata su tabella di hash
  * Possibile impostare capacità e fattore di carico
per ottimizzare le prestazioni
6* TreeMap
  * Implementazione basata su struttura ad albero
  * Si ottengono i dati ordinati
  * Disponibilità del metodo subMap() che fornisce
un sotto-albero
* LinkedHashMap
  * Sottoclasse dell'HashMap
  * Mantiene l'ordine di inserimento dei dati grazie
a una lista (in aggiunta alla hash)
  * Gli iterator forniscono l'ordine di inserzione
Strutture obsolete

### Vengono mantenute per compatibilità
* Vector
* Enumeration
* Hashtable
* Stack
* BitSet

### Evitarne l'utilizzo
7Funzionalità – Utilizzo
Funzionalità di una Collection
  * Aggiunta di un elemento alla fine; restituisce
false se non inserisce
boolean add (Object o)
e.g., <x>.add (<y>)
  * Aggiunge o in posizione i
boolean add (int index, Object o)
  * Aggiunge tutti gli elementi di c
boolean addAll (Collection c)
  * Rimuove gli elementi dal contenitore
void clear()
  * Restituisce true se contiene o
boolean contains (Object o)
  * Restituisce true se contiene tutti gli elementi
specificati in c
boolean containsAll (Collection c)
8  * Controlla se la struttura è vuota; restituisce
true in questo caso
boolean isEmpty (Object o)
e.g., if (<x>.isEmpty()) ...
  * Rimuove l'oggetto o
boolean remove (Object o)
  * Rimuove elemento di posizione index
Object remove (int index)
  * Rimuove tutti gli elementi specificati in c
void removeAll (Collection c)
  * Restituisce il numero di elementi del contenitore
int size ()
  * Restituisce l'array di object contenente tutti gli
elementi
Object [] toArray()
  * Restituisce un iteratore per scorrere la
collection
Iterator iterator()

### Esempio
package java.util.*;
...
ArrayList c1 = new ArrayList ();
ArrayList c2 = new ArrayList ();
...
c1.add ("one");
c1.add ("two");
c1.add ("three");
c2.addAll (c1);
if (c2.isEmpty()) // false
{ ... }
c2.clear ();
if (c2.isEmtpy()) // true
{ ...}
System.out.println (c1);
9
### Esempio
public class Cat { ... }
public class Dog { ... }
...
List cats = new ArrayList ();
for (int i=0; i<n; i++) {
cats.add (new Cat (...)};
}
cats.add (new Dog (...)};
...
for (int i=0; i<n; i++) {
((Cat) cats.get (i)) ...
// Dog: rilevato a run-time
}
* Soluzione
  * Sovrascrivere in Cat il metodo add
  * Il metodo add in Cat accetta solo cat da
inserire

### Esempio
* Definizione specifica
LinkedList <x> = new LinkedList ();
* Definizione generica
List <x> = new LinkedList ();
  * Utilizza l'interfaccia List invece
dell'implementazione LinkedList
  * Aumenta la libertà a livello di codice per
successive modifiche, e.g.
List <x> = new ArrayList ();
10
### Funzionalità di una LinkedList
  * Aggiunge in prima posizione
void addFirst (Object o)
  * Aggiunge in ultima posizione
void addLast (Object o)
  * Restituisce l'elemento di posizione index
Object get(int index)
  * Estrae il primo elemento della lista
Object getFirst()
  * Estrae l'ultimo elemento della lista
Object getLast()
  * Restituisce l'indice dell'ultimo elemento uguale a
c
int lastIndexOf (Object c)
  * Eliminano e restituiscono il primo (l'ultimo)
elemento
Object removeFirst ()
Object removeLast ()

### Esempio
LinkedList ll = new LinkedList();
// Crea LikedList
ll.add("10");
ll.add(new Integer(11);
ll.addLast(new Integer(13));
ll.addFirst(new Integer(20));
11
### Funzionalità di un SortedSet (TreeSet)
  * Estrae l'elemento più piccolo
Object first()
  * Estrae l'elemento più grande
Object last()
  * Crea un sottoset dal set completo estraendono
una porzione
SortedSet subSet (<from>, <to>)
  * Crea un sottoset con elementi minori di quello
indicato
SortedSet headSet (<to>)
  * Crea un sottoset con elementi maggiori o uguali
a quello indicato
SortedSet tailSet (<from>)

### Funzionalità di un Vector
* Obsoleto
* Molto utilizzato
* Mantenuto per compatibilità
  * Crea Vector di 10 posizioni, capacity increment
= 1
Vector()
  * Crea Vector di dimensione size
Vector(int size)
  * Restituisce la dimensione del Vector
int capacity ()
  * Come add ma sostituisce
set(int index, Object o)
  * Restituisce elemento index
Object get(int index)
12
### Esempio
Vector v = new Vector(3);
// 3 ref a null
v.add("10");
// 10 in posizione 0
v.add(new Integer(11));
// 11 in posizione 1
v.add(0, new Integer(13));
// 13 in posizione 0, poi 10 e 11
v.set(0, new Integer(20));
// 20 in posiz 0 (replace)
v.get(0);
// rende 20
v.add(11, new Integer(30));
// exception (out of bounds)
Funzionalità di una Map
  * Elimina ogni elemento della map
void clear()
  * Aggiunge la coppia key-value alla Map
Object put(Object key, Object value)
  * Rimuove elementi singoli
Object remove (Object key)
  * Restituisce elementi data la chiave
Object get (Object key)
  * Controlla l'esistenza di una chiave oppure di un
valore
boolean containsKey (Object key)
boolean containsValue (Object value)
  * Restituisce il numero elementi
int size()
  * Controlla esistano elementi nella map
boolean isEmpty()
13
### Funzionalità di un SortedMap (TreeMap)
  * Produce meccanismo di confronto
Comparator comparator ()
  * Produce la chiave più piccola
Object firstKey ()
  * Produce la chiave più grande
Object lastKey ()
  * Crea una sotto-map dalla map completa
estraendono una porzione
SortedMap subMap (<from>, <to>)
  * Crea una sotto-map con elementi minori di
quello indicato
SortedMap headMap (<to>)
  * Crea una sotto-map con elementi maggiori o
uguali a quello indicato
SortedMap tailMap (<from>)
Iterator
14Iterator

### Astrae il problema di iterare su tutti gli
elementi di una collection

### L'iterazione è permessa da
  * Crea l'iteratore
public Iterator (Collection c)
  * Esiste un elemento successivo?
public boolean hasNext()
  * Preleva l'elemento successivo
public Object next()

### Esempio
...
ArrayList myList = new ArrayList ();
...
// Riempio la struttura, e.g.:
// for (int i=0; i<10; i++)
//
myList.add (new myObject (i));
...
Iterator it = myList.iterator ();
while (it.hasNext ())
((myObject)
myList.next ()).<accessoAttributo>);
15
### Esempio
Vector v = new Vector(3);
v.add ("10");
...
Iterator iv = v.iterator();
while (iv.hasNext()) {
// agire su iv.next()
}

### Esempio
LinkedList ll = new LinkedList();
ll.add ("10");
...
Iterator il = ll.iterator();
while (il.hasNext()) {
// agire su il.next()
}
Prestazioni & Algoritmi
16Vector/ArrayList vs. LinkedList

### Tempo d'accesso a elemento i-esimo
* Vector: costante
* Linked List: lineare

### Tempo di inserimento in testa e di
cancellazione in mezzo
* Vector: lineare
* Linked List: costante
HashMap

### Get e set a tempo costante (se no
collisioni)

### Size iniziale
* initial capacity (default = 16)

### Riallocazione automatica quando load
factor superato
* load factor (default = .75)
17Algoritmi

### Definiti static su Arrays, lavorano su
array di Object
  * Merge sort, n log(n)
sort()
  * Ricerca binaria o dicotomica (assume array
ordinato)
binarySearch()

### Definiti static su Collections, lavorano
su List
  * Ordinamento dei dati
binarySearch()
sort()
  * Contrario dell'ordinamento
shuffle()
  * Ottiene valori specifici
min()
max()
18