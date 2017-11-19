# Classi Java

## Uso di classi
* Le classi, in quanto tipi di dato strutturati,
prevedono usi e regole più complessi rispetto
ai tipi semplici
* Abbiamo già visto alcuni aspetti nelle lezioni
precedenti, in questa serie di lucidi
completiamo e sistematizziamo la trattazione
* Per farlo, esaminiamo l’uso di classi per due
problemi molto comuni: l’interazione con
l’utente e il trattamento di sequenze di
caratteri
Classi già pronte
### Come la maggior parte dei linguaggi di
programmazione, Java è dotato di una libreria
( library ) di classi “pronte all’uso” che coprono
molte esigenze comuni (e anche meno
comuni)
* Usare classi già definite da altri è la norma
per non sprecare tempo a risolvere problemi
già risolti o a reinventare la ruota

## Uso di una classe pronta
* Quando si deve cercare e poi usare una
classe pronta all’uso i passi da seguire sono:
	* Come identificarla ? Dove cercarla ?
	* La classe è istanziabile o non istanziabile ?
	* Se è istanziabile , come creo le istanze ?
	* Quali metodi mi servono e come li uso ?

### 3. Uso di classi
	* Come identificarla ? Dove cercarla ?
	* La classe è istanziabile o non istanziabile ?
	* Se è istanziabile , come creo le istanze ?
	* Quali metodi mi servono e come li uso ?

## Classi e documentazione
* La libreria Java standard è accompagnata da
documentazione che illustra lo scopo e l’utilizzo di
ciascuna classe presente
* La documentazione è molto ampia, non ha scopo
didattico (non sempre è chiarissima) ma piuttosto di
“ Reference manual ”
* Pertanto non è pensabile e non è molto utile studiare
estensivamente o memorizzare la documentazione
prima di programmare
* Al contrario, leggere la documentazione è una delle
attività più tipiche durante la programmazione
Organizzazione delle classi
### La libreria standard segue il metodo di
organizzazione delle classi previsto da Java: le classi
tra loro “affini” sono raggruppate in package
* Ogni package ha un nome tipicamente composto da
due o più parole separate da . e contiene una o più
classi (ed eventualmente altri componenti)
* I nomi a più livelli riflettono un’organizzazione
gerarchica dei package simile a quella delle cartelle
(directory) su un disco

##Esempi di package
java. lang Package fondamentale con
classi di uso molto comune
java.io Package per l’Input/Output
java. util Package con classi varie di
utilità generale
java. text Package con classi per la
gestione ed elaborazione di
testi e dati in formato testuale
Uso di classi appartenenti
## ad un package
* Solo le classi appartenenti al package java. lang sono
automaticamente disponibili in ogni programma
* Per l’uso di altri package in una classe è necessario
“importarli” tramite la parola riservata import
* Tutte le dichiarazioni di importazione devono trovarsi
prima della definizione della classe
* Si possono importare singole classi di un package p.e.
import java. util . Random
ma è più tipico importare comunque tutto il package:
import java. util .*

## I package
* All’atto pratico un package è un insieme di file .class
tipicamente archiviati in un file compresso .zip o . jar
* Ogni classe appartiene ad un package: la
dichiarazione di appartenenza può essere effettuata
all’inizio del codice della classe usando la parola
riservata package seguita dal nome del package
* Se non si dichiara esplicitamente il package la classe
viene assegnata ad un package “anonimo” che
contiene, oltre ad essa, tutte le classi senza package
presenti nella stessa directory

### 3. Uso di classi
	* Come identificarla ? Dove cercarla ?
	* La classe è istanziabile o non istanziabile ?
	* Se è istanziabile , come creo le istanze ?
	* Se è istanziabile , come uso le istanze ?
	* Quali metodi mi servono e come li uso ?

## La doppia natura delle classi
* Le classi disponibili nella libreria standard si
possono distinguere in due tipologie principali:
	* Classi istanziabili
	* Classi non istanziabili
* La stessa distinzione è applicabile alle “nostre”
classi
Classi istanziabili
### Una classe istanziabile fornisce il prototipo di
una famiglia di oggetti (istanze della classe) che
hanno struttura simile ma proprietà distinte a
livello individuale (valori diversi degli attributi e
quindi risultati diversi prodotti dai metodi)
* L’uso tipico è la costruzione di istanze (tramite
new) e quindi l’invocazione di metodi su di esse
* Esempi: Ossequioso, Valuta, Anno, String , . . .

## Classi non istanziabili
* Una classe non istanziabile contiene un
insieme di metodi (ed eventualmente
attributi) di natura generale non legati alle
proprietà di oggetti individuali specifici
* Non ha senso la nozione di istanza della
classe poiché non ci sono caratteristiche
differenziabili tra oggetti distinti
* Esempi: BuongiornoMain , ValutaDriver ,
AnnoDriver , Math , Collections , . . .
Una precisazione
### La distinzione tra classi istanziabili e non istanziabili
riguarda il senso logico del loro utilizzo
* Il termine “classe non istanziabile ” sarà utilizzato per
indicare una classe che non ha senso istanziare , date
le sue caratteristiche
* Tecnicamente sarebbe possibile usare l’operatore
new su classi “non istanziabili ” (composte di metodi
e attributi tutti static ) ma non avrebbe senso pratico
* Vedremo nella parte finale del corso classi di altra
natura (astratte) sulle quali non è tecnicamente
possibile usare l’operatore new

## Istanziabili vs. non istanziabili
* La stragrande maggioranza delle classi è
istanziabile ma l’esistenza di alcune classi non
istanziabili è necessaria
* La classe (indispensabile) che contiene il main
è normalmente non istanziabile
* Poiché i numeri non sono oggetti, i metodi
numerici appartengono a classi non
istanziabili
Istanziabili vs. non istanziabili
### Nel caso di una classe istanziabile attributi e metodi
rappresentano proprietà possedute da tutti gli oggetti
istanza della classe
* Ogni oggetto istanza di una classe ha una sua identità
"contiene" individualmente gli attributi e i metodi
definiti nella classe
* Ogni volta che si costruisce un’istanza con new si crea
un nuovo insieme di attributi e metodi individuali
* Nel caso di una classe non istanziabile attributi e
metodi sono “unici” a livello della classe (non esistono
istanze diversificate)

## Classi non istanziabili
* Una classe non istanziabile rappresenta
“qualcosa” di concettualmente unico, che non
esiste e non può esistere in versioni separate
ciascuna con una propria identità:
– esiste una sola matematica (la classe Math non è
istanziabile )
– esiste un solo sistema su cui un programma è
eseguito (la classe System non è istanziabile )
– esiste un solo punto di inizio di un programma (le
classi contenenti il main non sono istanziabili )
Riconoscere una classe non istanziabile

* Non ha costruttori
* Attributi e metodi sono tutti static
* Quando penso all’esecuzione dei suoi metodi
non ho bisogno di immaginare un’istanza
individuale: sono applicabili direttamente alla
classe con almeno un argomento
– Math . sqrt (2)
– Math . abs ( - 3)

## In memoria ...
Math
E
2.7182
PI 3.1415
public
. . .
public
. . .
public
a)
. . .
public
static double abs(double a)
static double cos(double a)
static double sqrt(double
static float ulp(float f)


## Classi istanziabili
### Una classe istanziabile rappresenta “qualcosa”
che esiste in molteplici versioni individuali che
hanno una struttura comune ma ciascuna con
una propria identità:
– esistono molte sequenze di caratteri (la classe
String è istanziabile )
– esistono molte valute (la classe Valuta è
istanziabile )
– esistono molte persone (un’ipotetica classe
Persona è istanziabile )

## Riconoscere una classe istanziabile

* Ha costruttori
* Attributi e metodi sono tutti (o quasi) non
static
* Quando penso all’esecuzione dei suoi metodi
ho bisogno di immaginare un’istanza
individuale a cui applicarli (anche senza
argomenti esterni, perché usano attributi
interni)
– Persona. codiceFiscale () // NO! QUALE PERSONA?
– String . toUpperCase () // NO! QUALE STRINGA?
In memoria (1) ...

## Persona
String nome;
String cognome;
. . .
public Persona (String _nome, String _cognome)
. . .
public String codiceFiscale()
. . .

## In memoria (2) ...
Persona
String nome;
String cognome;
. . .
public Persona (String _nome, String _cognome)
. . .
public String codiceFiscale()
. . .
String nome= “Mario”;
String cognome “Rossi”;
. . .
String nome= “Ugo”;
String cognome “Neri”;
. . .

## Ogni volta che eseguo new Persona
ne creo una nuova istanza distinta
String nome= “Luca”;
String cognome “Verdi”;

Due livelli di definizione
* Dalla discussione precedente emerge che
esistono due “livelli” di definizione per
attributi e metodi
	* Nel caso di classi istanziabili attributi e metodi
sono definiti a livello di istanza
	* Nel caso di classi non istanziabili attributi e
metodi sono definiti a livello di classe

## Il modificatore static
* La parola riservata static viene usata per
indicare il livello di definizione di un attributo
o metodo
* Se la parola static è presente l’attributo o
metodo è definito a livello di classe
* Se la parola static non è presente l’attributo o
metodo è definito a livello di istanza
Il modificatore static
### La parola riservata static viene usata per
indicare il Il
livello
di definizione del
di un attributo
significato
o metodo
modificatore static non
* Se la parola static è presente l’attributo o
metodo
è definito
livello vedere
di classe con
ha nulla
a a che
* Se
parola static italiano
non è presente
l’attributo o
il la termine
“statico”
metodo è definito a livello di istanza

## Static vs. non static
* Ogni attributo o metodo non static esiste
concretamente in ogni istanza creata
– Esiste in “molteplici versioni” se vengono create
più istanze
– Non esiste concretamente se il programma non
crea almeno un’istanza (tramite operatore new)
* Ogni attributo o metodo static esiste
concretamente a livello di classe
– Esiste in un’unica versione
– La sua esistenza non dipende da cosa fa il
programma
Tirando le somme
### Una classe non istanziabile (come Math o
BuongiornoMain )
– non contiene nessun costruttore esplicito
– dovrebbe contenere solo attributi e metodi static
* Una classe istanziabile (come Ossequioso o
String )
– ha almeno un costruttore (di solito esplicito)
– dovrebbe avere almeno un attributo o metodo
non static

## Classi istanziabili “ibride”
* Alcune classi istanziabili (p.e. String ) della
libreria standard contengono attributi o
metodi static ed hanno quindi natura ibrida
* E’ come se la classe avesse due sottoparti
(una static e una no) ognuna delle quali
segue le proprie regole
* Salvo rari casi, è sconsigliabile realizzare
classi istanziabili ibride (sono accettabili
attributi costanti definiti come static )
Proprietà a livello di classe e di istanza
Proprietà collettive a livello di classe,
referenziabili indipendentemente
dall'esistenza di istanze
Proprietà individuali:
esistono concretamente
solo a livello di istanze

Def. classe
metodi static

Una classe
istanziabile
“pura” ha solo
questa parte
attributi non static
metodi non static
istanza1
istanzaN
attributi non static
metodi non static

Una classe NON
istanziabile
“pura” ha solo
questa parte
attributi static
attributi non static
. . .
metodi non static

## Accesso a metodi e attributi static
* Essendo definiti a livello di classe, attributi e metodi
static sono acceduti/invocati tramite il nome della
classe:
NomeClasse . nomeMetodoStatic (...)
NomeClasse . nomeAttributoStatic
P.e.
Math . sqrt (2);
String . valueOf ( Math .PI);
* In caso di classe istanziabile ibrida è equivalente, ma
sconsigliabile, accedere tramite una qualunque istanza
della classe:
nomeIstanza . nomeMetodoStatic (...)
nomeIstanza . nomeAttributoStatic

## Accesso a metodi e attributi non static
* La sintassi è simile al caso precedente, ma
ovviamente l’accesso/invocazione è possibile solo
tramite un’istanza specifica (ed ogni accesso è
diversificato):
nomeIstanza . nomeMetodoNonStatic (...)
nomeIstanza . nomeAttributoNonStatic
* P.e.
maggiordomoIta .saluta();
altraValuta . tassoRif

## Accesso ad attributi e
metodi della propria classe
* All'interno del corpo di un metodo si possono riferire in
modo abbreviato attributi e metodi definiti nella stessa
classe
* Se nel corpo di un metodo appare il nome di un metodo
o attributo static della sua classe è sottinteso che sia
preceduto dal nome della classe stessa
* P.e. nel corpo del metodo main di BuongiornoMain
...= new Ossequioso(SALUTO_ITA);
Forma estesa
equivalente
...= new Ossequioso(BuongiornoMain
.SALUTO_ITA);
Ossequioso( BuongiornoMain.SALUTO_ITA);

## Accesso ad attributi e metodi della propria classe
* Se nel corpo di un metodo (non static ) appare il nome
di un metodo o attributo non static della sua classe è
sottinteso che sia riferito all’istanza su cui è stato
invocato il metodo
* P.e. nel corpo del metodo tassoConversione di Valuta
return tassoRif /...
si intende l’attributo tassoRif dell’istanza riferita da
sterlina se si sta eseguendo l’invocazione
sterlina.tassoConversione
(...) mentre si intende
sterlina. tassoConversione(...)
l’attributo tassoRif dell’istanza riferita da dollaro se
si sta eseguendo dollaro.tassoConversione
(...)
dollaro. tassoConversione(...)

## Incroci vietati
* Nel corpo di un metodo static non si può accedere
ad attributi e metodi non static della stessa classe
* Infatti il metodo static deve poter essere invocato a
livello di classe (anche in assenza di istanze) mentre
attributi e metodi non static esistono solo se c’è
almeno un’istanza
* Nel corpo di un metodo non static si può accedere a
qualunque attributo e metodo della stessa classe (se
esiste l’istanza ovviamente esiste la classe)
Errori subdoli

### Eventuali mescolanze improprie di static e
non static causano errori di compilazione
* Si può “accontentare” il compilatore facendo
grossi errori concettuali (p.e. aggiungendo
static dove non deve stare)
* Modificare il codice per accontentare il
compilatore senza pensare al significato della
modifica può solo peggiorare le cose

## Errori subdoli
NON modificare
MAI il codice per
accontentare il compilatore
senza pensare al significato
della modifica
Errori subdoli
##L’uso improprio
del modificatore static
causa errori DISASTROSI
talvolta ritenuti MISTERIOSI

## Errori subdoli
public class Valuta
{
private String nome;
static
private double tassoRif;
tassoRif ;
Si aggiunge static per compilare
3
public Valuta(String
Valuta( String _nome, double _ tassoRif)
tassoRif )
{
Si intrufola uno static di troppo
nome = _nome;
per distrazione o come
tassoRif = _tassoRif
;
_ tassoRif;
}
residuo di un copia/incolla
public static double tassoConversione (Valuta altraValuta)
altraValuta )
{
return tassoRif/
tassoRif / altraValuta.
altraValuta . tassoRif;
tassoRif ;
}
}
Il “driver” non cambia . . .
## public class ValutaDriver
{
public static void main ( String args [])
{
Valuta sterlina = new Valuta("Sterlina",1.40);
Valuta dollaro = new Valuta("Dollaro",0.67);
Valuta franco = new Valuta("Franco Svizzero",0.60);
System.out.print
("Risultato 1 = ");
System.out. print("Risultato
System.out.println
(sterlina.tassoConversione
tassoConversione(dollaro));
(dollaro));
System.out. println(sterlina.
System.out.print
("Risultato 2 = ");
System.out. print("Risultato
System.out.println
(dollaro.tassoConversione
tassoConversione(sterlina));
(sterlina));
System.out. println(dollaro.
System.out.print
("Risultato 3 = ");
System.out. print("Risultato
System.out.println
(dollaro.tassoConversione
tassoConversione(franco));
(franco));
System.out. println(dollaro.
}
}

##. . . ma il risultato sì !

### 3. Uso di classi
	* Come identificarla ? Dove cercarla ?
	* La classe è istanziabile o non istanziabile ?
	* Se è istanziabile , come creo le istanze ?
	* Se è istanziabile , come uso le istanze ?
	* Quali metodi mi servono e come li uso ?

##Due esempi
* Come primi esempi di classi pronte istanziabili
useremo le classi String e StringBuffer del package
java. lang
* La classe String ha lo scopo di rappresentare
stringhe (sequenze) di caratteri che non devono
essere modificate dopo essere state costruite
(oggetti immutabili)
* La classe StringBuffer ha lo scopo di rappresentare
stringhe (sequenze) di caratteri che possono essere
modificate dopo essere state costruite (in Java 6 c’è
anche una classe molto simile di nome StringBuilder )
Definizione di variabili
### tipo nome; oppure
tipo nome1,..., nomeN ;
String nome;
StringBuffer risultato;
Ossequioso maggiordomoIta, maggiordomoFra;
Dopo la definizione esiste solo il
riferimento, non un oggetto di tipo
nome
null
String !
Il valore speciale null è il valore
iniziale di default per qualunque
nome non è un oggetto di tipo String
variabile di tipo strutturato.
è solo un riferimento utilizzabile per
Esso indica che il riferimento è nullo e
accedere ad un oggetto String
non c'e' nessun oggetto riferito

##Operatore new
* L'operatore new NomeClasse crea un nuovo oggetto
con le proprietà definite in NomeClasse (istanza della
classe) e ritorna il riferimento ad esso
* L'operatore new dà luogo all’invocazione di un metodo
costruttore passandogli gli argomenti necessari
* Il costruttore invocato deve essere di una classe
uguale o "compatibile" con la definizione della variabile
* Ogni classe può avere più costruttori che si
differenziano per la lista degli argomenti
Costruttori
### La classe String ha 15 costruttori alternativi in Java 6
(erano 11 in Java 2)
* La classe StringBuffer ha 4 costruttori alternativi in
Java 6 (erano 3 in Java 2)
* La scelta del costruttore da invocare avviene tramite
gli argomenti attuali che vengono passati
* Il modo più tipico di costruire un oggetto String o
StringBuffer è quello di passargli una sequenza di
caratteri tra doppie virgolette (che di fatto è un
oggetto String creato automaticamente)

##New di un oggetto String
String saluto;
saluto = new String("Ciao ciao");
Ciao ciao
saluto
null
Varianti sul tema
### L'operatore new può essere usato al
momento della definizione
String saluto = new String("Ciao ciao");
StringBuffer salutino = new StringBuffer("Bye");
StringBuffer saluto2 = new StringBuffer(saluto);
* Solo per la classe String , in quanto di uso
molto comune, Java offre la forma compatta
String s = "Ciao ciao";

##Costruzioni diverse
String saluto = new String("Ciao ciao");
StringBuffer salutino = new StringBuffer("Bye");
StringBuffer saluto2 = new StringBuffer(saluto);
saluto
salutino
saluto2
Ciao ciao Bye Ciao ciao
metodi classe
String metodi classe
StringBuffer metodi classe
StringBuffer

### 3. Uso di classi
	* Come identificarla ? Dove cercarla ?
	* La classe è istanziabile o non istanziabile ?
	* Se è istanziabile , come creo le istanze ?
	* Se è istanziabile , cosa posso fare con le istanze ?
	* Quali metodi mi servono e come li uso ?

##Operazioni su istanze
* Le principali operazioni che si possono
effettuare sulle variabili che riferiscono
istanze di una classe sono:
	* assegnamento
	* confronto
	* invocazione di metodi
Operazioni su istanze
### Le principali operazioni che si possono
effettuare sulle variabili che riferiscono
istanze di una classe sono:
	* assegnamento
	* confronto
	* invocazione di metodi

##Assegnamenti tra variabili di
tipi strutturati
String saluto1, saluto2, saluto3;
saluto1 = new String("Ciao ciao");
saluto2 = new String("Buongiorno");
...
saluto1
null
Ciao ciao
saluto2=saluto1;
metodi classe
String
saluto1=saluto3;
saluto2
saluto3

##Buongiorno
Buongiorno
metodi
metodi classe
classe
String
String
nullAssegnamenti tra
variabili di tipi strutturati
PRIMA
v2
v1
v2
v1
null
null
DOPO
v1 = v2;
null
null
v1
v1
null
v2
v2

##Assegnamenti tra variabili di
tipi strutturati
PRIMA
v1
DOPO
v1 = v2;
v1
null
v2
null
v2
null
v1 v1
v2 v2
Il valore è il riferimento !
### Il valore di una variabile di tipo strutturato è il
riferimento ad un oggetto (istanza di una
classe)
* Una stessa variabile può riferire oggetti
diversi in momenti diversi a seguito di
operazioni di assegnazione sul suo valore
* Se la variabile contiene il valore null non
riferisce nessun oggetto in quel momento

## Oggetti e riferimenti
* Le variabili hanno un nome, gli oggetti no
* Per utilizzare un oggetto bisogna passare attraverso
una variabile che ne contiene il riferimento
* Uno stesso oggetto può essere riferito da più variabili e
quindi essere raggiunto tramite nomi diversi (di
variabili)
* Il rapporto variabili - oggetti riferiti è dinamico, il
riferimento iniziale non necessariamente rimane legato
all’oggetto per tutta la sua esistenza
* Se un oggetto non è (più) riferito da nessuna variabile
diventa irraggiungibile (e quindi inutilizzabile)

Operazioni su istanze
### Le principali operazioni che si possono
effettuare sulle variabili che riferiscono
istanze di una classe sono:
	* assegnamento
	* confronto
	* invocazione di metodi

##Confronti tra variabili di tipo
strutturato
* E’ possibile applicare gli operatori di confronto == e
!= a variabili di tipo strutturato
* Se uno dei due termini del confronto è il valore null
si verifica se una certa variabile riferisce un oggetto
oppure no,
p.e. saluto3 != null
* Se entrambi i termini del confronto sono variabili, si
verifica se hanno lo stesso valore (cioè riferiscono
esattamente lo stesso oggetto)
* Raramente questo è desiderato e utile
Il valore è il riferimento !

##String saluto1 = new String ("Buongiorno");
String saluto2 = new String ("Buongiorno");
saluto1 == saluto2 ??
FALSE
saluto1
saluto2
Buongiorno Buongiorno
metodi classe
String metodi classe
String

##Il valore è il riferimento !
String saluto1 = new String ("Buongiorno");
String saluto2 = saluto1
saluto1 == saluto2 ??
TRUE
saluto1
Buongiorno
metodi classe
String

##saluto2Confronto tra riferimenti vs.
confronto tra oggetti
* Usare == fa il confronto tra i riferimenti non fra i
valori contenuti negli oggetti (p.e. le sequenze di
caratteri contenute nelle istanze di String )
* Di solito si vogliono confrontare i contenuti non i
riferimenti: per questo si usa il metodo equals
* Il metodo booleano equals della classe String accetta
come argomento il riferimento ad un altro oggetto e
ritorna true se le stringhe contenute sono uguali (in
modo case sensitive), false altrimenti
* Il metodo booleano equalsIgnoreCase fa lo stesso
senza distinguere maiuscole/minuscole

##Confronto
String saluto1 = new String ("Buongiorno");
String saluto2 = new String ("Buongiorno");
saluto1 == saluto2; // false
saluto1.equals
(saluto2); // true
saluto1. equals(saluto2);
saluto1
saluto2
Buongiorno Buongiorno
metodi classe
String metodi classe
String
Confronto

## 
String saluto1 = new String ("Buongiorno");
String saluto2 = new String ("buongiorno");
saluto1 == saluto2; // false
saluto1.equals
(saluto2); // false
saluto1. equals(saluto2);
saluto1.equalsIgnoreCase
(saluto2); // true
saluto1. equalsIgnoreCase(saluto2);
saluto1
saluto2
Buongiorno buongiorno
metodi classe
String metodi classe
String

## Una particolarità di String
* Usare esplicitamente new oppure la forma
abbreviata per inizializzare un oggetto String
non è esattamente la stessa cosa
* Se si usa esplicitamente new, la Java Virtual
Machine crea oggetti distinti anche se di
contenuto uguale
* Se non si usa esplicitamente new, la Java
Virtual Machine evita di creare oggetti distinti
ma dal contenuto uguale
Una particolarità di String
##String saluto1 = new String ("Buongiorno");
String saluto2 = new String ("Buongiorno");
saluto1
saluto2
Buongiorno Buongiorno
metodi classe
String metodi classe
String

## Una particolarità di String
String saluto1 = "Buongiorno";
String saluto2 = "Buongiorno";
saluto1
saluto2
Buongiorno
metodi classe
String
Alcune distinzioni
a = "b";
a
a è una variabile di tipo String
Il riferimento ad un oggetto
che contiene una stringa
composta dal solo carattere b
viene copiato “dentro” a
"b"

##Alcune distinzioni
a = 'b';
a è una variabile di tipo char
Il valore corrispondente
al singolo carattere b
viene copiato “dentro” alla variabile a

a = ' ';
a è una variabile di tipo char

Il valore corrispondente
al singolo carattere spazio
(invisibile, detto anche blank)
viene copiato “dentro” a
a
‘ ’

##Alcune distinzioni
a = " ";
a
a è una variabile di tipo String
Il riferimento ad un oggetto
che contiene una stringa
composta dal solo carattere
spazio viene copiato “dentro” a

##" "Alcune distinzioni
a = "";
a
a è una variabile di tipo String
Il riferimento ad un oggetto
che contiene una stringa vuota
composta da nessun carattere
viene copiato “dentro” a
Non confondere stringa vuota
(detta anche nulla) con riferimento null
""

## Operazioni su istanze
* Le principali operazioni che si possono
effettuare sulle variabili che riferiscono
istanze di una classe sono:
	* assegnamento
	* confronto
	* invocazione di metodi
Metodi
### I metodi non static rappresentano operazioni
effettuabili su singoli oggetti
* La documentazione indica per ogni metodo il
tipo ritornato e la lista degli argomenti formali
che rappresentano i dati che il metodo deve
ricevere in ingresso da chi lo invoca
* Per ogni argomento formale sono specificati:
– un nome
– un tipo

##Esempi di metodi di String
Tipo ritornato
Nome del metodo
public char charAt ( int index)
index )
Lista argomenti attuali
(uno solo in questo caso)
Returns the character at the specified index.
index . An index ranges from 0 to
length()
length () - 1.
Lista argomenti attuali
(due in questo caso)
public String substring ( int beginIndex,
beginIndex , int endIndex)
endIndex )
Tipo ritornato
Nome del metodo
Returns a new string that is a substring of this string. The substring
begins at the specified beginIndex and extends to the character at
index endIndex - 1. Thus the length of the substring is endIndex-
endIndex -
beginIndex.
beginIndex .
Esempi di metodi di String
##Tipo ritornato
Nome del metodo
Lista argomenti attuali
public int length ()
(nessuno in questo caso)
Returns the length of this string. The length is equal to the number
of 16-
16 - bit Unicode characters in the string.
Tipo ritornato
Nome del metodo
Lista argomenti attuali
public String toUpperCase ()
(nessuno in questo caso)
Converts all of the characters in this String to upper case using the rules
of the default locale.
N.B. Il metodo toUpperCase (così come il metodo
corrispondente toLowerCase)
toLowerCase ) restituisce un riferimento ad un
nuovo oggetto String:
String : quello iniziale rimane immutato !

##Concatenazione di stringhe
* L'operatore + si applica a due (o più) variabili
di tipo String (o meglio: almeno una String
e altre trasformabili in String )
* Il risultato è un nuovo oggetto String il cui
contenuto è la sequenza di caratteri risultante
dalla concatenazione delle sequenze
corrispondenti alle variabili coinvolte
int estratto = . . . ;
System.out.println
("Il numero vincente e'" + estratto);
System.out. println("Il
Esempi di metodi di
##StringBuffer
public StringBuffer append(
append ( String str)
str )
Appends the string to this string buffer.
public StringBuffer insert(
insert ( int offset, String str)
str )
Inserts the string into this string buffer.
public StringBuffer deleteCharAt(
deleteCharAt ( int index)
index )
Removes the character at the specified position in this StringBuffer
( shortening the StringBuffer by one character).
character ).
public StringBuffer reverse()The
reverse ()The character sequence contained in this
string buffer is replaced by the reverse of the sequence.
sequence .
N.B. I metodi della classe StringBuffer normalmente
modificano il contenuto dell’oggetto su cui sono invocati e
restituiscono un riferimento all’oggetto stesso (anziché ad uno
nuovo, come normalmente fanno i metodi della classe String)
String )

##Invocazione di metodi
* L’invocazione di un metodo non static su un
oggetto istanza della classe in cui il metodo è
definito si effettua con la sintassi:
nomeVar.
nomeVar . nomeMetodo(lista
nomeMetodo (lista argomenti attuali)
Argomenti attuali e formali
### Ogni volta che si invoca un metodo si deve
specificare una lista di argomenti attuali
* Gli argomenti attuali e formali sono in
corrispondenza posizionale
* Gli argomenti attuali possono essere delle
variabili o delle espressioni
* Gli argomenti attuali devono rispettare il tipo
attribuito agli argomenti formali

##Un saluto maiuscolo
public class Ossequioso
{
private String mioSaluto;
mioSaluto ;
public Ossequioso (String
( String cosaDevoDire)
cosaDevoDire )
{
mioSaluto = cosaDevoDire;
cosaDevoDire ;
}
. . .
public void salutaUpper ()
{
System.out.println
( mioSaluto.
System.out. println(
mioSaluto . toUppercase());
toUppercase ());
}
}
Un saluto a rovescio
##public class Ossequioso
{
private String mioSaluto;
mioSaluto ;
public Ossequioso (String
( String cosaDevoDire)
cosaDevoDire )
{
mioSaluto = cosaDevoDire;
cosaDevoDire ;
}
. . .
public void salutaRovescio ()
{
StringBuffer rovescio = new StringBuffer(
StringBuffer ( mioSaluto);
mioSaluto );
rovescio.reverse
();
rovescio. reverse();
System.out.println
(rovescio);
System.out. println(rovescio);
}
}

##
* 3. Uso di classi
	* Come identificarla ? Dove cercarla ?
	* La classe è istanziabile o non istanziabile ?
	* Se è istanziabile , come creo le istanze ?
	* Se è istanziabile , cosa posso fare con le istanze ?
	* Quali metodi mi servono e come li uso ?
Lunghi elenchi
### La documentazione di ogni classe ( istanziabile o
no) contiene l’elenco dei metodi disponibili
* La classe Math non è istanziabile e contiene 54
metodi (tutti static ovviamente)
* La classe String è “ istanziabile ibrida” e contiene
70 metodi di cui 13 static
* La classe StringBuffer è “ istanziabile pura” e
contiene 53 metodi (nessuno static ovviamente)

##La ricerca del metodo
* Capire se esistono una classe e/o un metodo
che fanno ciò che ci serve non è sempre
facile: esiste un mare di classi ognuna delle
quali può contenere decine di metodi
* I libri, gli esempi già fatti, i programmatori più
esperti possono essere indispensabili per
indirizzare la ricerca
* In subordine, può essere utile anche la ricerca
su Internet
La ricerca del metodo
### Se nessuno ci indirizza e nemmeno Internet ci
aiuta si procede per tentativi seguendo
l’ordine logico:
– individuare il package
– individuare la classe
– individuare il metodo
* I nomi delle classi e dei metodi ci dovrebbero
aiutare

##Esempio di ricerca
* Supponiamo di voler arrotondare un numero
floating point all’intero più vicino: ci sarà un
metodo che lo fa per noi ?
* Essendo un’operazione matematica
fondamentale la ricerca si orienta sul package
java. lang e sulla classe Math
* Sapendo che in inglese round significa
(anche) arrotondare vediamo se c’è un
metodo con questo nome
Overloading di metodi
### Esistono due metodi round nella classe Math
* I due metodi hanno lo stesso nome ma sono
distinguibili in base alla lista degli argomenti: uno
riceve in ingresso un argomento float , l’altro riceve in
ingresso un argomento double
* La definizione di metodi con lo stesso nome ma liste
degli argomenti diverse, cioè varianti diverse dello
stesso metodo è detta overloading
* A seconda degli argomenti passati verrà selezionato
ed eseguito il metodo appropriato

##Esempi di overloading
* Nella classe Math i metodi abs , max e min
sono definiti ciascuno in 4 versioni diverse
* Nella classe String il metodo substring è
definito in 2 versioni diverse
* Nella classe StringBuffer il metodo append è
definito in 13 versioni diverse
* Se una classe istanziabile ha più costruttori
essi sono (ovviamente) in overloading
Altro esempio di ricerca

### Supponiamo di voler verificare se una
sequenza di caratteri ne contiene uno in
particolare: ci sarà un metodo che lo fa per
noi ?
* Essendo un’operazione fondamentale sui
caratteri la ricerca si orienta sul package
java. lang e sulle classi String o StringBuffer
* Stavolta non è facile ipotizzare un nome di
metodo, scorriamo la lista . . .

## Complicazioni
* Il metodo contains sembra essere quello che
ci serve (in effetti lo è) ma richiede
conoscenze che non abbiamo ancora
* Peraltro il metodo contains non esisteva fino
alla versione 1.4
* Il metodo indexOf (in 4 versioni) non fa
esattamente quello che ci serve ma quasi . . .
Uso “creativo” dei metodi

### Il metodo indexOf (nella versione che riceve
in ingresso un char ) restituisce la posizione
della prima occorrenza nella stringa del char
specificato
* Se nella stringa il char non c’è, restituisce - 1
* Quindi possiamo sapere se il char è presente
o meno distinguendo tra risultati non negativi
e il risultato - 1

## Ricerche senza successo
* Ci interessa un metodo che calcoli il logaritmo
in base 2 di un numero
* Essendo un’operazione matematica
fondamentale la ricerca si orienta sul package
java. lang e sulla classe Math
* Ci sono il metodo log (base e) e il metodo
log10 (base 10), ma in base 2 non c’è
* Dovremo scrivercelo noi
##
