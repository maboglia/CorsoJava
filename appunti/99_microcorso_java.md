# Linguaggio Java
## Concetti base

### La prima applicazione Java

File HelloWorld.java
public class HelloWorld {
public static void main (String args[]) {
System.out.println (“Hello world!”);
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
* Attivati solo dall’interno di un altro metodo
* Eventuale uso di parametri & valore di
ritorno
* Tra i vari metodi esiste il metodo main da
cui si “parte”

### Lettere minuscole VS Maiuscole
Metodi


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
* Avviene come in C: sempre per valore
* Nel caso di parametri reference, quello che
viene copiato è il reference, NON l’oggetto
  * Equivale al passaggio per riferimento

### Valore di ritorno
* Analogo al linguaggio C
* Il tipo del metodo e il tipo ritornato devo
coincidere

### Possibilità di definire metodi ricorsivi
Tipi primitivi, Costanti e
Operatori
Tipo primitivo

### In un linguaggio ad oggetti puro i dati
dovrebbero essere definiti sotto forma
di oggetti

### Per efficienza
* Java definisce dati primitivi
* La dichiarazione di una istanza (variabile)
alloca spazio
* Un valore è associato direttamente alla
variabile (e.g, i ==
)
0

### Ne vengono definiti dimensioni e codifica

### Rappresentazione indipendente dalla
piattaforma
Tipo
boolean
char
byte
short
int
long
float
double
void
Dimensione
1
16
8
16
32
64
32
64
bit
bit
bit
bit
bit
bit
bit
bit
-
Codifica
-
Unicode
Intero con segno
Intero con segno
Intero con segno
Intero con segno
IEEE 754 sp
IEEE 754 dp
-
C2
C2
C2
C2
5Costanti

###  I tipi numerici, i char e le stringhe
seguono la sintassi C
*  Esempi
123 (int)
256789L (L o l = long)
0567 (ottale) 0xff34 (hex)
123.75 0.12375e+3 (float o double)
’a’ ’%’ ’\n’
’\123’ (\ introduce codice ASCII)
”1” ”prova\n”

### Tipo boolean
* Esempi
true
false

### Non esiste il tipo reference

### Modificatore final
final float pigreco = 3.14;
pigreco = 16.0; // NO
* Dichiara costanti simboliche
* Dovrebbero essere dichiarate sempre
static
(per non sprecare spazio per ogni istanza)
6Operatori per Interi e Reali

### Operatori aritmetici , relazionali , e di
assegnazione seguono la sintassi del C
* Aritmetici: + - ### / %
* Relazionali: == != > < >= <=
* Bitwise (interi): & | ^ << >> ~
* Di assegnazione: = += -= *= /=
&= |= ^=
* Di assegnazione/incremento: ++ --
%=

### I caratteri sono considerati interi
(come in C)
Operatori per Booleani

### Seguono la sintassi del C
&& (AND) || (OR) ! (NOT)

### Attenzione:
* Fenomeno short-circuit
... f1(x) && f2(y) && f3(z) ...
f2 e f3 possono NON essere valutate
* Gli operatori logici agiscono solo su booleani
  * Un intero NON viene considerato un booleano
come in C
  * Gli operatori relazionali forniscono valori
booleani

Operatori su reference

### Per i puntatori/reference, sono definiti:
* Gli operatori relazionali == e !=
  * N.B. test sul puntatore NON sull’oggetto
* Le assegnazioni
* L’operatore “punto”
* NON è prevista l’aritmetica dei puntatori
Operatori matematici

### Operazioni matematiche complesse sono
permesse dalla classe (!) Math (package
java.lang):
Math.sin (x) calcola sin(x)
Math.sqrt (x) calcola x^(1/2)
Math.PI ritorna pi
Math.abs (x) calcola |x|
Math.exp (x) calcola e^x
Math.pow (x, y) calcola x^y
...
* Esempio
z = Math.sin (x) – Math.PI / Math.sqrt(y)
8Strutture elementari
Commenti

### Commenti tipo C (multilinea)
/### questo e` un commento
che si estende su due linee */

### Commenti su linea singola
// questo e` un commento monolinea

### Commenti di documentazione
/*### commento per javadoc
.... */
9Blocchi e regole di scope

### I blocchi
* Sono simili ai blocchi del C
* Definiti da { e }

### Visibilità (scope)
* Analoga a quella del linguaggio C
* I parametri sono locali al metodo
* Le variabili possono essere
  * Locali al metodo
  * Locali al blocco
  * Vasto uso di definizioni locali

### Ogni blocco
* Introduce un nuovo scope per le variabili
* Le variabili si possono dichiarare
  * All’inizio del blocco
  * All’interno del blocco
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

### Stessa tipologia e sintassi del C
* if-else
* switch

### Attenzione: gli interi NON sono
booleani
* NON è possibile fare test del tipo
if(x)
con x intero
* Occorre usare operatori relazionali
if (x != 0)
Costrutti iterativi

### Semantica e sintassi analoga al C
* while
* do-while
* for
* break
* continue
11Input Output (Elementare)

### L’input/output di caratteri e di interi è
relativamente spartano

### Richiede l’utilizzo di concetti “complessi”
* Eccezioni
* I/O
usualmente introdotti in sezioni
avanzate dei corsi Java
12Output

### Comandi:
System.out.println (...)
System.out.print (...)

### Esempi:
* Visualizzare il valore di una variabile
System.out.print (x);
* Visualizzare una stringa
System.out.print (“Valore =“);
* Visualizzazione con sequenze di escape
System.out.print (“\tValore =\n”);
* Utilizzo dell’operatore di concatenazione di
stringhe (vedere String)
System.out.println (“Concatenazione” +
“ di” + “ stringhe”);
  * In costrutto di concatenazione vale anche per
tipi diversi dal tipo String
System.out.println (“Valore = “ + x);


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
if (s[i]>=‘0’ && s[i]<=‘9’)
val = val ### 10 + s[i] – ‘0’;
}
...
## Input/Output in modalità grafiche

### Java è stato progettato per lavorare in
modalità grafiche

### Una possibilità è utilizzare la classe
JOptionPane definita nel package
javax.swing

### Richiede l’utilizzo di concetti “avanzati”
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
(“Messaggio");
nValue = Integer.parseInt (inputS);
...
// Output
// (previa creazione della stringa output)
JOptionPane.showMessageDialog (
null, output, “Messaggio”,
JOptionPane.INFORMATION_MESSAGE );

## Array

* Sequenze ordinate di
  * Tipi primitivi (int, float, etc.)
  * Riferimenti ad oggetti ( vedere classi! )
* Elementi dello stesso tipo
* Indirizzati da indici
* Raggiungibili con l’operatore di
indicizzazione (parentesi quadre [])
* Raggruppati sotto lo stesso nome

### Non possono contenere oggetti (solo
dati primitivi o reference a oggetti)

### In Java gli array sono Oggetti
* Sono allocati nell’area di memoria riservata
agli oggetti creati dinamicamente (heap)

### Dimensione
* Può essere stabilita a run-time (quando
l’oggetto viene creato)
* È fissa (non può essere modificata)
* E’ nota e ricavabile per ogni array
Array Mono-dimensionali
(vettori)

## Dichiarazione di Array

### Dichiarazione di un riferimento a un
array
* Stile Java (array di int)
int [ ] vet;
* Stile C/C++
int vet[ ];

### La dichiarazione di un array non
assegna alcun spazio
vet == null
Creazione di un Array

### L’operatore new crea un array:
* Con costante numerica
int[] vet;
...
vet = new int[10];
*  Con costante simbolica
final int ARRAY_SIZE = 10;
int[] vet;
...
vet = new int[ARRAY_SIZE];
*  Con valore definito a run-time
int[] vet;
... definizione di x (run-time) ...
vet = new int[x];
* L’operatore new inizializza le variabili
  * 0 - per variabili di tipo numerico (inclusi i char)
  * false - per le variabili di tipo boolean

### Utilizzando un inizializzatore (che
permette anche di riempire l’array)
...
int[] primi = {2,3,5,7,11,13};
...
int [] pari = {0, 2, 4, 6, 8, 10,};
// La virgola finale e’ facoltativa
// (elenchi lunghi)

### Dichiarazione e creazione possono
avvenire contestualmente

## Operazioni su Array

### L’attributo length indica la lunghezza
dell’array (numero di elementi)
* Gli elementi vanno da 0 a length-1
for (int i=0; i<vet.length; i++)
vet[i] = i;

### In Java viene fatto il bounds checking
* Maggior sicurezza
* Maggior lentezza di accesso

### Il riferimento ad array
* Non è un puntatore al primo elemento
* È un puntatore all’oggetto array
* Incrementandolo non si ottiene il secondo
elemento

## Array di oggetti

### Per gli array di oggetti (e.g., Integer)
Integer [] vet = new Integer [5];
ogni elemento e’ un riferimento

### L’inizializzazione va completata con
quella dei singoli elementi
vet[0] = new Integer (1);
vet[1] = new Integer (2);
...
vet[4] = new Integer (5);

### Confrontare con
int [] vet = new {1, 2, 3, 4, 5};
Array Multi-dimensionali
(Matrici)
6
### Array contenenti riferimenti ad altri array

Sintatticamente sono estensioni degli array a una dimensione

### Sono possibili righe di lunghezza diverse
(matrice = array di array)
* Esempio
int[][] triangle = new int[3][]
triangle

### Le righe non sono memorizzate in posizioni adiacenti
* Possono essere spostate facilmente
* Esempio
// Scambio di due righe
double[][] balance = new double[5][6];
...
double[] temp = balance[i];
balance[i] = balance[j];
balance[j] = temp;
8Linguaggio Java
Stringhe e Caratteri
Caratteristiche principali

### Classi disponibili
* String
  * Modella stringhe (sequenze – array di caratteri)
  * Non modificabile (dichiarata final)
* StringBuffer
  * Modificabile
* Character
* CharacterSet

## Classe String

### Definizione
String myString;
myString = new String (“stringa esempio”);
* Oppure
String myString =
new String (“stringa esempio”);
* Solo per il tipo String vale
String myString = “stringa esempio”;
* Il carattere “ può essere incluso come \”
* Il nome della stringa è il riferimento alla
stringa stessa
* Confrontare due stringhe NON significa
confrontare i riferimenti

### I metodi che gestiscono il tipo String
NON modificano la stringa ma ne
creano una nuova

### Concatenazione di stringhe
* Operatore concat
  * myString1.concat(myString2)
  * String s2 = “Ciao”.concat(“ a tutti”).concat(“!”);
  * String s2 = “Ciao”.concat(“ a tutti”.concat(“!”));
* Utile per definire stringhe che occupano più
di una riga
3* Operatore +
“questa stringa” + ”e` formata da tre” +
“stringhe”
* La concatenazione funziona anche con altri
tipi, che vengono automaticamente
convertiti in stringhe
System.out.println (”pi Greco = ” + 3.14);
System.out.println (”x = ” + x);

### Lunghezza stringa
* int length()
  * myString.length()
  * “Ciao”.length() restituisce 4
  * “”.length() restituisce 0
* Se la lunghezza è N, i caratteri sono
indicizzati da 0 a N-1

### Carattere i-esimo
* char charAt (int)
  * myString.charAt(i)

### Confronta stringa con s
* boolean equals (String s)
  * myString.equals (“stringa”)
ritorna true o false
* boolean equalsIgnoreCase (String s)
  * myString.equalsIgnoreCase (“StRiNgA”)
4
### Confronta con s facendone la differenza
* int compareTo (String str)
  * myString.compareTo (“stringa”)
ritorna un valore >=< 0

### Trasforma int in String
* String valueOf (int)
* Disponibile per tutti tipi primitivi

### Restituisce indice prima occorrenza di c
* int indexOf (char c)
* int indexOf (char c, int fromCtrN)

### Altri metodi
* String toUpperCase (String str)
* String toLowerCase (String str)
* String substring (
int startIndex, int endIndex)
* String substring (int startIndex)
5
### Esempio
...
String s1, s2;
s1 = new String(“Prima stringa”);
s2 = new String(“Prima stringa”);
System.out.println(s1);
/// Prima stringa
System.out.println(“Lunghezza di s1 = ” +
s1.length());
// 26
if (s1.equals(s2)) ...
// true
if (s1 == s2) ...
// false
String s3 = s3.substring (2, 6);
// s3 == “ima s“
...
StringTokenizer

### La classe StringTokenizer permette
l’estrazione di sottostringhe
* StringTokenizer (String str, String delim)
  * Costruisce un estrattore di token per la stringa
str
  * delim e’ il delimitatore ricercato tra i token
estratti
* La classe StringTokenizer mette quindi a
disposizione metodi per la gestione dei
token
  * public boolean hasMoreTokens()
  * public String nextToken()
6
###  Esempio
// il numero di token e’ noto: nome, eta’, reddito
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
Classe StringBuffer

### Un oggetto String
* NON è modificabile
* Una volta creato non possiamo aggiungere,
eliminare, modificare caratteri (i metodi
visti creano nuove stringhe)
* Tale restrizione è dovuta a ragioni di
efficienza
7
### Le considerazione precedenti non sono
vere per la classe StringBuffer

### Esempio
StringBuffer myStringBuffer = new
stringBuffer (“stringa modificabile”);
myStringBuffer.setCharAt (8, ‘M’);
// Trasforma in “stringa Modificabile”

### Si usa raramente

### Un oggetto StringBuffer non può essere
utilizzato per operazioni di I/O
System.out.println
(myStringBuffer.toString());

### Metodi:
* Aggiunta di caratteri
myStringBuffer.append (“aggiunta”);
* insert
* delete
* reverse
8Classe Character

### La classe involucro Character si trova in
java.lang

### Include metodi statici per verificare le
proprietà di un carattere

### Esempio
String s = “Stringa Generica.”
char c = s.charAt (0);
... Character.isUpperCase(c) ... // true
... Character.isDigit(c) ...
// false
...

### Predicati vari
* boolean
* boolean
* boolean
* boolean
* boolean
* boolean
isLetter (char c)
isDigit (char c)
isLetterOrDigit (char c)
isSpaceChar (char c)
isLowerCase (char c)
isUpperCase (char c)

### Trasformazioni varie
* char toUpperCase (char c)
* char toLowerCase (char c)
9Linguaggio Java
Metodi & Classi: Concetti base
Classi: Concetti Base

### Estendono il concetto di “struttura” del
linguaggio C

### Definiscono:
* I dati (detti campi o attributi)
* Le azioni (dette metodi o funzioni membro)
che sui dati agiscono

### Possono essere definite
* Dal programmatore (ex. Automobile)
* Dall’ambiente Java (ex. String, System,
etc.)
1
### La “gestione” di una classe avviene
mediante
* Definizione della classe
* Instanziazione di Oggetti della classe
Definizione di un Classe
2
### Definizione
class <nomeClasse) {
<campi>
<metodi>
}

### Esempi
* Classe contenente dati ma non azioni
class DataOnly {
boolena b;
char c;
int i;
float f;
}
* Classe contenente dati e azioni
class Automobile {
String colore;
String marca;
boolean accesa;
Nome
Automobile
Attributi
void mettiInMoto() {
accesa = true;
}
void vernicia (String nuovoCol) { Messaggi/
Metodi
colore = nuovoCol;
}
colore
marca
accesa
mettiInMoto
vernicia
stampaStato
void stampaStato () {
System.out.println(“Questa auto e` una “+
marca + “ “ + colore);
if (accesa)
System.out.println(“Il motore e` acceso”);
else
System.out.println(“Il motore e` spento”);
}
}
3
### Dati & Metodi
* Public: visibili all’esterno della classe
* Private: visibili solo dall’interno della classe
* Protected: ...
* Nessuna specifica (amichevole): ...

### La definizione di classe non rappresenta
alcun oggetto.
Polimorfismo (overloading)
4
### Una classe può avere più metodi con lo
stesso nome

### I metodi devono essere distinguibili in
base al
* Numero dei parametri
* Tipo dei parametri

### Il metodo da eseguire viene scelto in
base al
* Numero e tipo di parametri
* Non esiste alcuna discriminazione sul valore
di ritorno

### Esempio
class Automobile {
String colore;
void vernicia () {
colore = “bianco”;
}
void vernicia (int i) {
switch (i) {
case 1: colore = “nero”; break;
...
}
}
void vernicia (String nuovoCol) {
colore = nuovoCol;
}
}
5Instanziare una Classe

### Crea degli oggetti appartenenti a una
classe

### Gli oggetti sono caratterizzati da
* Classe di appartenenza - tipo (ne descrive
attributi e metodi)
* Stato (valore attuale degli attributi)
* Identificatore univoco (reference - handle
- puntatore)
6
### Per creare un oggetto occorre
* Dichiarare una istanza
  * Tecnica analoga a quella utilizzata per i tipi
primitivi
  * La dichiarazione non alloca spazio ma solo una
riferimento (puntatore) che per default vale
null
* Allocazione e inizializzazione
  * Riservano lo spazio necessario creando
effettivamente l’oggetto appartenente a quella
classe
a
Oggetto
Automobile
Creare un Oggetto

### Il costrutto new
* Crea una nuova istanza della classe
specificata, allocandone la memoria
* Restituisce il riferimento all’oggetto creato
Automobile a = new Automobile ();
Motorcycle m = new Motorcycle ();
String s = new String (“ABC”);
* Chiama il costruttore del nuovo oggetto
(vedere in seguito)
7Utilizzo della Classe

### Per “gestire” una classe occorre
* Accedere ai metodi della classe
  * Messaggi
* Accedere agli attributi della classe
8Messaggi

### L’invio di un messaggio provoca
l’esecuzione del metodo

### Inviare un messaggio ad un oggetto
* Usare la notazione “puntata”
rif-oggetto.messaggio(parametri)
* Sintassi analoga alla chiamata di funzioni in
linguaggio C

### I metodi definiscono l’implementazione
delle operazioni

### I messaggi che un oggetto può
accettare coincidono con i nomi dei
metodi
mettiInMoto, vernicia, etc.

### I messaggi includono i parametri
vernicia(“Rosso”)

### Esempi
Automobile a = new Automobile();
a.mettiInMoto();
a.vernicia(“Blu”);
9
### Caso particolare
* Metodi che devono inviare messaggi allo
stesso oggetto cui appartengono
* In questo caso la notazione puntata è
superflua in quanto è sottinteso il
riferimento
public class Libro {
int nPagine;
public void leggiPagina (int nPagina) {...}
public void leggiTutto () {
for (int i=0; i<nPagine; i++)
leggiPagina (i);
}
}
Attributi

### Stessa notazione “puntata” dei messaggi
rif-oggetto.attributo
* Il riferimento viene usato come una
qualunque variabile
Automobile a=new Automobile();
a.colore = “Blu”;
boolean x = a.accesa;
10* I metodi che fanno riferimento ad
attributi dello stesso oggetto possono
tralasciare il rif-oggetto
public class Automobile {
String colore;
void vernicia(){
colore = “Verde”;
// colore si riferisce
// all’oggetto corrente
}
}
Esempio (messaggi e attributi)
public class Automobile {
String colore;
public void vernicia () {
colore = “bianco”;
}
public void vernicia (String nuovoCol) {
colore = nuovoCol;
}
}
...
Automobile a1, a2;
a1 = new Automobile ();
a1.vernicia (“verde”);
a2 = new Automobile ();
11Construttore
Costruttore

### Specifica le operazioni di
inizializzazione (attributi, etc.) che
vogliamo vengano eseguite su ogni
oggetto della classe appena viene creato

### Tale metodo ha
* Lo stesso nome della classe
* Tipo non specificato

### Non possono esistere attributi non
inizializzati
* Gli attributi vengono inizializzati comunque
con valori di default
12
### Se non viene dichiarato un costruttore,
ne viene creato uno di default vuoto e
senza parametri

### Spesso si usa l’overloading definendo
diversi costruttori

### Si osservi che la distruzione di oggetti
(garbage-collection) non è a carico del
programmatore
Esempio (costruttori con overloading)
Class Window {
String title;
String color;
// Finestra senza titolo ne` colore
Window () {
...
}
// Finestra con titolo senza colore
Window (String t) {
...
title = t;}
// Finestra con titolo e colore
Window (String t, String c) {
...
title = t; color = c;}
}
13Puntatore Auto-referenziante
Operatore this

### La parola riservata this e’
utilizzata quale puntatore auto-
referenziante
*  this riferisce l’oggetto (e.g., classe)
corrente

### Utilizzato per
* Referenziare la classe appena
istanziata
14* Evitare il conflitto tra nomi
class Automobile{
String colore;
...
...
void vernicia (String colore) {
this.colore = colore;
}
}
. . .
Automobile a2, a1 = new Automobile;
a1.vernicia(“bianco”); // a1 == this
a2.vernicia(“rosso”);
// this == a2
* Evitare il conflitto tra nomi
class Automobile{
String colore;
...
...
void vernicia (String colore) {
this.colore = colore;
}
}
. . .
Automobile a2, a1 = new Automobile;
a1.vernicia(“bianco”); // a1 == this
a2.vernicia(“rosso”);
// this == a2
15Notazioni Puntate

### Le notazioni puntate possono essere
combinate
System.out.println(“Hello world!”);
* System è una classe del package
java.lang
* out è una variabile di classe contenente il
riferimento ad un oggetto della classe
PrintStream che punta allo standard
output
* println è un metodo della classe
PrintStream che stampa una linea di
testo
Operazioni su reference

### Definiti gli operatori relazionali == e !=
* Attenzione: il test di uguaglianza viene
fatto sul puntatore (reference) e NON
sull’oggetto
* Stabiliscono se i reference si riferiscono
allo stesso oggetto

### È definita l’assegnazione

### È definito l’operatore punto (notazione
puntata)

### NON è prevista l’aritmetica dei
puntatori
16Visibilità ed encapsulation

### Motivazione
* Modularità = diminuire le interazioni
* Info Hiding = delegare responsabilità

### Supporto sintattico
* private
  * attributo/metodo visibile solo da istanze della
stessa classe
* public
  * attributo/metodo visibile ovunque
17Accesso
Metodo della
stessa classe Metodo di
altra classe
Private Si No
Public Si Si
Getters e setters

### Aggiungere metodi per leggere scrivere
un attributo privato

### Può infrangere (indirettamente)
l’encapsulation
String getColor() {
return color;
}
void setColor(String newColor) {
color = newColor;
}
18class Automobile {
public String colore;
}
Automobile a = new Automobile();
a.colore = “bianco”; // ok
class Automobile {
private String colore;
public void vernicia(String colore)
{this.colore = colore;}
// ok
}
Automobile a = new Automobile();
a.colore = “bianco”; // error
a.vernicia(“verde”); // ok
Variabili e metodi di classe
19Variabili di classe

### Rappresentano proprietà comuni a tutte
le istanze

### Esistono anche in assenza di istanze
(oggetti)

### Dichiarazione: static

### Accesso: nome-classe . attributo
class Automobile {
static int numeroRuote = 4;
}
Automobile.numeroRuote;
Metodi di classe

### Funzioni non associate ad alcuna istanza
* Dichiarazione: static
* Accesso: nome-classe . metodo()
class HelloWorld {
public static void main (String args[]) {
System.out.println(“Hello World!”);
}
}
double y = Math.cos(x);
// cos metodo static
20Linguaggio Java
Ereditarietà
Ereditarietà

### Meccanismo Java che realizza la
* Specializzazione
* Generalizzazione
permettendo l’estensione di “vecchie
classi” in “nuove classi”

### La classe che eredita da un’altra
* Eredita attributi e operazioni
* Può modificare attributi/operazioni
ereditati (override)
* Può aggiungere attributi/operazioni
1
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
System.out.println(“Impiegato” + nome +
“ ” + stipendio);
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
System.out.println(“Dirigente” + nome +
“ ” + stipendio);
}
public void aumentaGrado() {
grado++;
}
}
4Visibilità: costrutto “protected”
class Impiegato {
private String nome;
private double stipendio;
}
class Dirigente extends Impiegato {
void stampa() {
System.out.println(“Dirigente” + nome +
“ ” + stipendio);
}
}
INACCESSIBILI

### Visibilità di attributi e metodi
* public: sono accessibili senza restrizioni
* private: sono accessibili solo all’interno
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
* this riferisce l’oggetto corrente
* super riferisce l’oggetto “sopra” this
(“superoggetto”) ovvero la superclasse
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

### Ogni oggetto contiene un’istanza della
propria superclasse
* La superclasse deve essere inizializzata
* Il compilatore Java inserisce
automaticamente una chiamata al
costruttore di default del superoggetto
* La chiamata al costruttore del superoggetto
viene inserita come PRIMA istruzione del
nuovo costruttore
  * L’esecuzione dei costruttori procede dalla radice
verso il basso nella gerarchia di ereditarietà
  * È garantito che quando un metodo di una classe
viene eseguito (costruttore compreso), la
superclasse sia già inizializzata completamente
7Esempio
class Arte {
Arte() {
System.out.println(“Costruttore Arte”); }
}
class Disegno extends Arte {
Disegno() {
System.out.println(“Costruttore Disegno”); }
}
class DisegnoAnimato extends Disegno {
DisegnoAnimato() {
System.out.println(“Costruttore DisegnoAnimato”);
}
}
DisegnoAnimato d = new DisegnoAnimato();
Costruttore classe Arte
Costruttore classe Disegno
Costruttore classe Disegno Animato
Costruttori con parametri

### Se i costruttori hanno parametri
* Il compilatore non è in grado di inserire
automaticamente la chiamata
* Le istanze delle superclassi devono essere
inizializzate correttamente tramite
chiamate esplicite ai costruttori (utilizzando
la variabile super)
* La chiamata del costruttore della
superclasse deve essere la PRIMA
istruzione del costruttore
  * Il compilatore lo controlla
  * L’ordine di inizializzazione degli oggetti è
sempre quello giusto
8Esempio
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
La classe Object
9Albero di derivazione

### Tutte le classi in Java derivano dalla
classe Object

### Non si può definire una classe che non
eredita da nessun’altra classe
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
univocamente l’oggetto
* boolean equals(Object obj)
  * Restituisce vero se obj e this sono lo stesso
oggetto

### Normalmente questi metodi sono
ridefiniti (overridden) nelle classi
derivate
10Dynamic binding

### Per binding si intende l’associazione
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
  * Associazione fatta in base al tipo compile time
* Dinamico (default in Java)
  * Associazione fatta in base al tipo run time
  * Java sceglie il corretto metodo dell’appropriata
sottoclasse associata all’oggetto

### N.B. se le classi non sono legate da
ereditarietà è possibile una scelta sola
Moto m;
m.mettiInMoto();
Aereo a;
a.mettiInMoto();
Moto Aereo
mettiInMoto mettiInMoto
L’attributo final

### Definisce un dato elemento come non
più modificabile
* Applicato a variabile la trasforma in
costante
* Applicato a un metodo
  * Ne impedisce l’overriding in classi derivate
  * Ne rende possibile l’inlining (binding statico -
più efficiente)
* Applicato a una classe
  * Impedisce di derivare da essa altre classi (la
classe deve essere una foglia dell’albero di
ereditarietà)
12Casting di oggetti
Type Casting di Oggetti

### È possibile modificare il tipo di un
riferimento ad oggetto soltanto tra tipi
in relazione di ereditarietà

### L’oggetto rimane invariato
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

### Un package è un insieme logico di classi

### Fisicamente le classi stanno su uno o più
file, tutti contenuti in una stessa
directory

### Ogni package definisce un suo scope
(ambiente di visibilità dei nomi)
* Stessi nomi in package diversi senza
conflitti
2Nomi

### Un package è identificato univocamente
da un nome costruito gerarchicamente
(notazione puntata)
java.util
grafica.altaRisoluzione.mioPackage

### Convenzione per generare nomi unici
* Usare come prefisso del nome del package
il proprio nome internet invertito
it.polito.softeng.mioPackage
Creazione di un package

### Tutti i file del package devono
contenere la riga
package <nomePackage>;
quale prima riga del file (tranne i
commenti)

### Specifica che la classe pubblica
contenuta in quel file fa parte di quel
package
3Utilizzo di un package

### Un package può essere utilizzato
* Mediante importazione del package
* Mediante riferimento esplicito

### Importare un package significa
* Importare la singola classe del package
import
nomePackage.nomeClass;
* Importare tutte le classi del package
import
nomePackage;
* Esempi
import java.util.ArrayList;
import java.util.*;
import java.util;

### Riferimento esplicito (senza import)
* Specificare il nome per intero
... java.util.ArrayList ...
  * Invece di
import java.util.*;
... ArrayList ...

### Collisioni
* Se due package definiscono classi omonime
possono essere importati entrambi
* La collisione si verifica solo quando si
utilizzano gli elementi in conflitto
4Storage (directory)

### La directory in cui il package risiede
deve avere un path che corrisponde a
quello del nome
java.util
<->
java/util

### Il path è relativo a uno dei percorsi di
ricerca automatica definiti nella
variabile di ambiente CLASSPATH

### Un sottoalbero di package può essere
sostituito da un
* File zippato ( .zip)
* File archiviato ( .jar)
Esempio
CLASSPATH=c:\java\jdk\lib;c:\java\mylibs

### Per installare il package
didattica.esercizi
/
si hanno 2 possibilità
java
jdk mylibs
lib didattica
didattica esercizi
esercizi
5Visibilità

### Le regole di encapsulation / visibilità si
applicano anche ai package

### Euristica: minimizzare il numero di
classi/attributi/metodi visibili al di fuori
di un package
Modificatori di visibilità

### Su attributi o metodi di classi entro
package
* private: visibile solo da istanze della stessa
classe
* public: visibile da istanze di qualsiasi classe
all’interno del package
  * anche da istanze all’esterno del package SE la
classe è public
* package VALORE DI DEFAULT: visibile da
istanze di qualsiasi classe, all’interno del
package
6Accesso
Metodo della
stessa classe
entro package Metodo di
altra classe
entro package Metodo di altra
classe fuori
package
Private
attributo/metodo Si No No
Package
attributo/metodo Si Si No
Public
attributo/metodo
su package class Si Si No
Public
attributo/metodo
su public class Si Si Si
Modificatori di visibilità

### Classi all’interno di un package
* public: elementi (attributi metodi) public
della classe sono visibili anche fuori dal
package
* package (VALORE DI DEFAULT): elementi
(attributi metodi) public della classe sono
visibili solo all’interno del package
7Librerie (package) Standard

### Il package java.lang contiene alcune
classi basilari

### Viene importato automaticamente (non
occorre import)
java
applet
awt
data
event
transfer
beans
image
io
lang
math
net
rmi
util
peer
Librerie grafiche
Tipi Primitivi – Classi Wrapper
8Tipi primitivi

### In un mondo OO ideale, vi sono solo
classi e istanze di classi

### Java
* Per efficenza usa tipi primitivi per int,
float etc.
* Per completezza
  * Definisce anche classi per interi, float etc.
(classi wrapper)
  * Definisce operazioni per passare dai dati
primitivi alle classi wrapper
Classi “Wrapper” per tipi Primitivi

### Se si vogliono trattare anche i dati
primitivi come oggetti si possono
utilizzare le classi “wrapper”

### Un oggetto di una classe “wrapper”
incorpora un dato primitivo e fornisce
metodi per operare su di esso

### Le classi wrapper dei tipi primitivi sono
definite nel package java.lang
9
### Corrispondenza
Tipo Primitivo
boolean
char
byte
short
int
long
float
double
void
ClasseWrapper
Boolean
Character
Byte
Short
Integer
Long
Float
Double
Void
Classi Astratte
10Classi Astratte

### Un metodo astratto è un metodo di cui
non viene specificata l’implementazione

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
* Ereditare la classe facendo l’overriding di
tutti i metodi astratti

### Permette di trattare omogeneamente
oggetti con caratteristiche diverse
(tramite upcasting)
11Interfacce
Interfacce

### Un’interfaccia è una classe
completamente astratta , cioè del tutto
priva della parte di implementazione
* Tutti i metodi sono astratti
* Non vi sono attributi
  * È possibile definire solo “attributi” final (in
pratica costanti)
  * Definendo un attributo in un’interfaccia questo
viene automaticamente considerato final
12
### Un’interfaccia
* Ha tutti i vantaggi e le indicazioni d’uso
delle classi astratte
* Presenta maggior flessibilità rispetto
all’ereditarietà di una classe astratta
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
* Memorizzate all’interno degli oggetti
(nell’heap)

### Variabili automatiche ( locali )
* Memorizzate nello stack

### Variabili statiche
* Memorizzate in aree statiche
Variabili di istanza

### Dichiarate all’interno di una classe
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

### Dichiarate all’interno dei metodi
Class Window {
...
void resize () {
int i;
for (i=0; i<5; i++)
...

### Memorizzate nello stack

### Create/inizializzate automaticamente
all’ingresso del blocco in cui sono
dichiarate

### Distrutte automaticamente all’uscita
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
principale) esegue un’analisi dei riferimenti e
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
gestire l’eccezione in modo appropriato (il
server spesso non conosce il modo migliore
per gestire l’errore)
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

### Si dice che l’eccezione
* Viene “gettata” (thrown) e
* In seguito deve essere “gestita” ovvero
“catturata” (catch)

### Costrutti per la gestione delle eccezioni
* try { } ... catch {}
  * “Getta” l’eccezione a livello di un blocco di
istruzioni
  * La “cattura” effettuandone la gestione
* throws
  * “Getta” l’eccezione a livello di metodi
* throw
  * “Getta” l’eccezione a livello di codice / istruzioni
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
// qui recupero l’errore “malformedURL”
...
}
catch(IOException e) {
// qui recupero tutti altri errori di IO
...
}

### Costrutti try-catch possono essere
annidati (catch che include try-catch)
4
### Il blocco “finally” esegue istruzioni al
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
* Con try-catch gestiamo l’eccezione a livello
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
“interessa” tanto al chiamato (metodo leggi)
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

### Permette di “gettare” in modo
“esplicito” una eccezione a livello di
codice
throw <oggettoEccezione>

### Provoca
* L’interruzione dell’esecuzione del metodo
* L’avvio della fase di cattura dell’eccezione
generata
* Dato che le eccezioni sono oggetti, chi getta
l’eccezione deve creare l’oggetto eccezione
(operatore new) che la descrive
7
### Esempio
...
if ( y==0 ){
throw new ArithmeticException (
“Frazione con denominatore nullo.”);
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
l’oggeto non è instanza
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
* Tali sottoclassi sono del tutto “assimilabili”
a classi “standard”, e.g., possono
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
throw new NewExc (“messaggio”) ...
10Eccezioni controllate e non

### Le eccezioni si dividono in
* Controllate
  * Istanze di RuntimeException o delle sue
sottoclassi
  * Il compilatore si assicura esplicitamente che
quando un metodo solleva una’eccezione la tratti
esplicitamente
  * Questo può essere fatto mediante i costrutti
try-catch o throws
  * In caso contrario segnala un errore di
compilazione
* Non controllate
  * Sono tutte le altre eccezioni, ovvero istanze di
Exception ma non di RuntimeException
  * L’eccezione può non essere gestita
esplicitamente dal codice
  * Viene “passata” automaticamente da metodo
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
Generalità sull’I/O

### L’Input/Output è descritto nel package
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
### Usualmente l’I/O da file
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
File <inF> = new File (“<nameIn>”);
FileReader <inR> = new FileReader (<inF>);
File <outF> = new File (“<nameOut>”);
FileWriter <outW> = new FileWriter (<outF>);
int c;
while ((c = <inR>.read()) != -1)
<outW>.write (c);
<inR>.close ();
<outW>.close ();
}

### I costrutti
File <inF> = new File (“<nameIn>");
FileReader <inR> = new FileReader (inF);
File <outF> = new File (“<nameOut>");
FileWriter <outW> = new FileWriter (outF);
possono essere scritti come segue
FileReader <inR> = new FileReader
(”<nameIn>”);
FileWriter <outW> = new FileWriter
(“<nameOut>”);
3
### Metodi generali
  * Chiusura del file
public void close () throws IOException
  * Scrittura dei caratteri nel “buffer”
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
* L’I/O bufferizzato è più efficiente
  * Lettura di una riga (conclusa dai caratteri \n
= linefeed, \r = carriage return) intera
public String readLine ()
throws IOException
Ritorna null al raggiungimento di EOF
5import java.io.*;
...
public ...throws IOException {
FileReader <inR> = new FileReader (“<nameIn>”);
BufferedReader <inB> = new BufferedReader (<inR>);
FileWriter <outF> = new FileWriter (“<nameOut>”);
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
(“<nameIn>”);
BufferedReader <inB> = new BufferedReader
(<inR>);
FileWriter <outF> = new FileWriter
(“<nameOut>”);
BufferedWriter <outW> = new BufferedWriter
(outF);
possono essere scritti come
BufferedReader <inB> = new BufferedReader
(new FileReader (“<nameIn>”));
BufferedWriter <outW> = new BufferedWriter
(new FileWriter (“<nameOut>”));
6La classe file

### La classe file permette controlli su
* File
* Directory

### Definisce/rappresenta nomi/path
  * Crea un oggetto di tipo file
public File (String pathName)
e.g.,
File <x> = new File (“<nameIn>”);
File <y> = new File (
“c:\dir1\dir2”, “<nameOut>”);

### Check file/direttory
  * Verifica che l’oggetto esista
public boolean exists()
e.g., if (<x>.exists ()) ...
  * Verifica se l’oggetto è un file
public boolean isFile()
e.g., if (<x>.isFile ()) ...
  * Verifica se l’oggetto è una directory
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
  * Restituisce l’array di stringhe contenenti I nomi
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
l’interfaccia Comparable)
Arrays.sort (<array>);
  * Ricerca binaria (o dicotomica)
Arrays.binarySearch (<array>);
Introduzione, Tassonomia
& Classificazione
2Collections & Map

### Collezione di elementi
* Mantenuti mediante “reference”
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
continue: classi “normali”
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
  * Mantiene l’ordine di inserimento dei dati grazie
a una lista (in aggiunta alla hash)
  * Gli iterator forniscono l’ordine di inserzione
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
  * Sottoclasse dell’HashMap
  * Mantiene l’ordine di inserimento dei dati grazie
a una lista (in aggiunta alla hash)
  * Gli iterator forniscono l’ordine di inserzione
Strutture obsolete

### Vengono mantenute per compatibilità
* Vector
* Enumeration
* Hashtable
* Stack
* BitSet

### Evitarne l’utilizzo
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
  * Rimuove l’oggetto o
boolean remove (Object o)
  * Rimuove elemento di posizione index
Object remove (int index)
  * Rimuove tutti gli elementi specificati in c
void removeAll (Collection c)
  * Restituisce il numero di elementi del contenitore
int size ()
  * Restituisce l’array di object contenente tutti gli
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
c1.add (“one”);
c1.add (“two”);
c1.add (“three”);
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
  * Utilizza l’interfaccia List invece
dell’implementazione LinkedList
  * Aumenta la libertà a livello di codice per
successive modifiche, e.g.
List <x> = new ArrayList ();
10
### Funzionalità di una LinkedList
  * Aggiunge in prima posizione
void addFirst (Object o)
  * Aggiunge in ultima posizione
void addLast (Object o)
  * Restituisce l’elemento di posizione index
Object get(int index)
  * Estrae il primo elemento della lista
Object getFirst()
  * Estrae l’ultimo elemento della lista
Object getLast()
  * Restituisce l’indice dell’ultimo elemento uguale a
c
int lastIndexOf (Object c)
  * Eliminano e restituiscono il primo (l’ultimo)
elemento
Object removeFirst ()
Object removeLast ()

### Esempio
LinkedList ll = new LinkedList();
// Crea LikedList
ll.add(“10”);
ll.add(new Integer(11);
ll.addLast(new Integer(13));
ll.addFirst(new Integer(20));
11
### Funzionalità di un SortedSet (TreeSet)
  * Estrae l’elemento più piccolo
Object first()
  * Estrae l’elemento più grande
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
v.add(“10”);
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
  * Controlla l’esistenza di una chiave oppure di un
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

### L’iterazione è permessa da
  * Crea l’iteratore
public Iterator (Collection c)
  * Esiste un elemento successivo?
public boolean hasNext()
  * Preleva l’elemento successivo
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
v.add (“10”);
...
Iterator iv = v.iterator();
while (iv.hasNext()) {
// agire su iv.next()
}

### Esempio
LinkedList ll = new LinkedList();
ll.add (“10”);
...
Iterator il = ll.iterator();
while (il.hasNext()) {
// agire su il.next()
}
Prestazioni & Algoritmi
16Vector/ArrayList vs. LinkedList

### Tempo d’accesso a elemento i-esimo
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
  * Contrario dell’ordinamento
shuffle()
  * Ottiene valori specifici
min()
max()
18