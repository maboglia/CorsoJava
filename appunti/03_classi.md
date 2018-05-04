# Classi Java
## Introduzione alla Programmazione Orientata agli Oggetti 
### (Object Oriented Programming – OOP)
                      
                 
## Programmazione imperativa
Abbiamo visto come programmare utilizzando i seguenti tipi di dati:

* Tipi di dato primitivi (int, double, char, boolean, ecc...) 
* Le stringhe
* Gli array

I programmi fatti fino ad ora consistevano di una sequenza di comandi
strutture di controllo (cicli, scelte condizionali, ecc...) ed eventualmente metodi ausiliari
che consentivano di manipolare i dati per calcolare il risultato voluto.
Questo modo di programmare prende il nome di __PROGRAMMAZIONE IMPERATIVA__, imperativa in quanto basata su comandi
                     
## Programmazione imperativa
Nella programmazione imperativa:
Un programma prevede uno stato globale costituito dai valori delle sue variabili
I comandi del programma modificano lo stato fino a raggiungere uno stato finale (che include il risultato)
                        
## Programmazione imperativa
Ad esempio, il seguente programma (che calcola il prodotto di x e y):
ha la seguente dinamica:
```java
int x=10, y=3, p=0;
for (int i=0; i<y; i++)
p+=x;
```
                 
## Programmazione orientata agli oggetti
* Sebbene sia possibile scrivere programmi interessanti con i tipi di dato visti fino ad ora, spesso i programmi hanno bisogno di manipolare strutture dati che rappresentano più fedelmente le entità del mondo reale.
Ad esempio, immaginate di dover scrivere programmi per la gestione di...
* Conti bancari: ogni conto bancario ha un proprio saldo, un proprio intestatario, una propria lista di movimenti, ecc...
* Dipendenti: ogni dipendente di un’azienda ha una propria matricola, un proprio stipendio, un proprio orario di lavoro, ecc...
* Parchi macchine: ogni automobile ha la propria targa, il proprio contachilometri, il proprio storico delle manutenzioni, ecc...
* Rettangoli: ogni rettangolo ha la propria base, altezza e posizione nel piano.
* Scrivere un programma di questo tipo usando solo interi, array e strighe pùo diventare abbastanza complicato...
* ogni entità del mondo reale (e.g. il conto bancario) prevede un proprio stato interno (e.g. saldo, ecc...) e delle proprie funzionalità (e.g. versamento, prelievo, ecc...)
* Per questo motivo un linguaggio di programmazione __ORIENTATO AGLI OGGETTI__ (tipo Java) fornisce meccanismi per definire nuovi tipi di dato basati sul concetto di classe
* Una classe definisce un insieme di oggetti (conti bancari, dipendenti, automobili, rettangoli, ecc...).
* Un oggetto è una struttura dotata di:
proprie variabili (che rappresentano il suo stato) propri metodi (che realizzano le sue funzionalità)


## Uso di classi
* Le classi, in quanto tipi di dato strutturati,
prevedono usi e regole più complessi rispetto
ai tipi semplici

* due problemi molto comuni: l’interazione con
l’utente e il trattamento di sequenze di
caratteri

## Classi già pronte
* Come la maggior parte dei linguaggi di
programmazione, Java è dotato di una libreria
( library ) di classi “pronte all’uso” che coprono
molte esigenze comuni (e anche meno comuni)
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

## Classi e documentazione
* La libreria Java standard è accompagnata da
documentazione che illustra lo scopo e l’utilizzo di
ciascuna classe presente
* La documentazione è molto ampia, non ha scopo
didattico, ma piuttosto di __Reference manual__
* non è pensabile e non è molto utile studiare
estensivamente o memorizzare la documentazione
prima di programmare
* leggere la documentazione è una delle
attività più tipiche durante la programmazione


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

##Esempi di package
* java.lang Package fondamentale con
classi di uso molto comune
* java.io Package per l’Input/Output
* java.util Package con classi varie di
utilità generale
* java.text Package con classi per la
gestione ed elaborazione di
testi e dati in formato testuale

## Uso di classi appartenenti ad un package
* Solo le classi appartenenti al package java.lang sono
automaticamente disponibili in ogni programma
* Per l’uso di altri package in una classe è necessario
“importarli” tramite la parola riservata import
* Tutte le dichiarazioni di importazione devono trovarsi
prima della definizione della classe
* Si possono importare singole classi di un package p.e.
import java.util.Random
ma è più tipico importare comunque tutto il package:
import java.util.*

## I package
* All’atto pratico un package è un insieme di file .class
tipicamente archiviati in un file compresso .zip o .jar
* Ogni classe appartiene ad un package: la
dichiarazione di appartenenza può essere effettuata
all’inizio del codice della classe usando la parola
riservata package seguita dal nome del package
* Se non si dichiara esplicitamente il package la classe
viene assegnata ad un package “anonimo” che
contiene, oltre ad essa, tutte le classi senza package
presenti nella stessa directory


## La doppia natura delle classi
* Le classi disponibili nella libreria standard si
possono distinguere in due tipologie principali:
	* Classi istanziabili
	* Classi non istanziabili
* La stessa distinzione è applicabile alle “nostre”
classi

## Classi istanziabili
* Una classe istanziabile fornisce il prototipo di
una famiglia di oggetti (istanze della classe) che
hanno struttura simile ma proprietà distinte a
livello individuale (valori diversi degli attributi e
quindi risultati diversi prodotti dai metodi)
* L’uso tipico è la costruzione di istanze (tramite
new) e quindi l’invocazione di metodi su di esse

## Classi non istanziabili
* Una classe non istanziabile contiene un
insieme di metodi (ed eventualmente
attributi) di natura generale non legati alle
proprietà di oggetti individuali specifici
* Non ha senso la nozione di istanza della
classe poiché non ci sono caratteristiche
differenziabili tra oggetti distinti

## Altre considerazioni
* La distinzione tra classi istanziabili e non istanziabili
riguarda il senso logico del loro utilizzo
* Il termine “classe non istanziabile ” sarà utilizzato per
indicare una classe che non ha senso istanziare, date
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
numerici appartengono a classi non istanziabili

## Classi istanziabili
* Nel caso di una classe istanziabile attributi e metodi
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

## Riconoscere una classe non istanziabile
* Non ha costruttori
* Attributi e metodi sono tutti static
* Quando penso all’esecuzione dei suoi metodi
non ho bisogno di immaginare un’istanza
individuale: sono applicabili direttamente alla
classe con almeno un argomento
```java
Math . sqrt (2)
Math . abs ( - 3)

// In memoria ...
Math.E //2.7182
MATH.PI //3.1415

```

## Classi istanziabili

Una classe istanziabile rappresenta “qualcosa”
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

## Static vs. non static
* Ogni attributo o metodo non static esiste
concretamente in ogni istanza creata
* Esiste in “molteplici versioni” se vengono create
più istanze
* Non esiste concretamente se il programma non
crea almeno un’istanza (tramite operatore new)

* Ogni attributo o metodo static esiste
concretamente a livello di classe
* Esiste in un’unica versione
* La sua esistenza non dipende da cosa fa il programma


### Una classe non istanziabile 
* non contiene nessun costruttore esplicito
* dovrebbe contenere solo attributi e metodi static
### Una classe istanziabile 
* ha almeno un costruttore (di solito esplicito)
* dovrebbe avere almeno un attributo o metodo non static

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

## Accesso a metodi e attributi static
* Essendo definiti a livello di classe, attributi e metodi
static sono acceduti/invocati tramite il nome della
classe:
```java
NomeClasse.nomeMetodoStatic (...)
NomeClasse.nomeAttributoStatic
//P.e.
Math.sqrt (2);
String.valueOf ( Math .PI);
```
* In caso di classe istanziabile ibrida è equivalente, ma
sconsigliabile, accedere tramite una qualunque istanza
della classe:
```java
nomeIstanza.nomeMetodoStatic (...)
nomeIstanza.nomeAttributoStatic
```

## Accesso a metodi e attributi non static
* La sintassi è simile al caso precedente, ma
ovviamente l’accesso/invocazione è possibile solo
tramite un’istanza specifica (ed ogni accesso è
diversificato):
```java
nomeIstanza.nomeMetodoNonStatic (...)
nomeIstanza.nomeAttributoNonStatic
```
* Accesso ad attributi e metodi della propria classe
* All'interno del corpo di un metodo si possono riferire in
modo abbreviato attributi e metodi definiti nella stessa
classe
* Se nel corpo di un metodo appare il nome di un metodo
o attributo static della sua classe è sottinteso che sia
preceduto dal nome della classe stessa

## Accesso ad attributi e metodi della propria classe
* Se nel corpo di un metodo (non static ) appare il nome
di un metodo o attributo non static della sua classe è
sottinteso che sia riferito all’istanza su cui è stato
invocato il metodo

## Attenzione
* Nel corpo di un metodo static non si può accedere
ad attributi e metodi non static della stessa classe
* Il metodo static deve poter essere invocato a
livello di classe (anche in assenza di istanze) mentre
attributi e metodi non static esistono solo se c’è
almeno un’istanza
* Nel corpo di un metodo non static si può accedere a
qualunque attributo e metodo della stessa classe (se
esiste l’istanza ovviamente esiste la classe)
* Eventuali mescolanze improprie di static e
non static causano errori di compilazione
* __EVITARE__ di “accontentare” il compilatore facendo
grossi errori concettuali (p.e. aggiungendo
static dove non deve stare)

## String e StringBuilder
* le classi String e StringBuilder del package
java.lang
* La classe String ha lo scopo di rappresentare
stringhe (sequenze) di caratteri che non devono
essere modificate dopo essere state costruite
(oggetti immutabili)
* La classe StringBuilder ha lo scopo di rappresentare
stringhe (sequenze) di caratteri che possono essere
modificate dopo essere state costruite 


## Definizione di variabili
* tipo nome; oppure
* tipo nome1,..., nomeN ;
* String nome;
* StringBuilder risultato;
* Dopo la definizione esiste solo il 
riferimento, non un oggetto di tipo nome, null, String !

## null
* Il valore speciale null è il valore
iniziale di default per qualunque
variabile di tipo strutturato.
* indica che il riferimento è nullo e
non c'e' nessun oggetto riferito
* nome non è un oggetto di tipo String
è solo un riferimento utilizzabile per
accedere ad un oggetto String

## Operatore new
* L'operatore new NomeClasse crea un nuovo oggetto
con le proprietà definite in NomeClasse (istanza della
classe) e ritorna il riferimento ad esso
* L'operatore new dà luogo all’invocazione di un metodo
costruttore passandogli gli argomenti necessari
* Il costruttore invocato deve essere di una classe
uguale o "compatibile" con la definizione della variabile
* Ogni classe può avere più costruttori che si
differenziano per la lista degli argomenti

## Costruttori
* La scelta del costruttore da invocare avviene tramite
gli argomenti attuali che vengono passati

* New di un oggetto String
```java
String saluto;
saluto = new String("Ciao ciao");
```
* L'operatore new può essere usato al
momento della definizione

```java
String saluto = new String("Ciao ciao");
```
* Solo per la classe String , in quanto di uso
molto comune, Java offre la forma compatta
```java
String s = "Ciao ciao";
```

## Operazioni su istanze
* Le principali operazioni che si possono effettuare sulle variabili che riferiscono istanze di una classe sono:
	* assegnamento
	* confronto
	* invocazione di metodi
* Le principali operazioni che si possono effettuare sulle variabili che riferiscono istanze di una classe sono: 
	* assegnamento
	* confronto
	* invocazione di metodi

* Il valore di una variabile di tipo strutturato è il riferimento ad un oggetto (istanza di una classe)
* Una stessa variabile può riferire oggetti diversi in momenti diversi a seguito di operazioni di assegnazione sul suo valore
* Se la variabile contiene il valore null non riferisce nessun oggetto in quel momento

## Oggetti e riferimenti
* Le variabili hanno un nome, gli oggetti no
* Per utilizzare un oggetto bisogna passare attraverso una variabile che ne contiene il riferimento
* Uno stesso oggetto può essere riferito da più variabili e quindi essere raggiunto tramite nomi diversi (di variabili)
* Il rapporto variabili - oggetti riferiti è dinamico, il riferimento iniziale non necessariamente rimane legato all’oggetto per tutta la sua esistenza
* Se un oggetto non è (più) riferito da nessuna variabile diventa irraggiungibile (e quindi interviene il garbage collector)

## Operazioni su istanze
* Le principali operazioni che si possono effettuare sulle variabili che riferiscono istanze di una classe sono:
	* assegnamento
	* confronto
	* invocazione di metodi

## Confronti tra variabili di tipo strutturato
* E’ possibile applicare gli operatori di confronto == e != a variabili di tipo strutturato
* Se uno dei due termini del confronto è il valore null si verifica se una certa variabile riferisce un oggetto oppure no,
p.e. saluto3 != null
* Se entrambi i termini del confronto sono variabili, si verifica se hanno lo stesso valore (cioè riferiscono esattamente lo stesso oggetto)
# Confronto tra riferimenti vs. confronto tra oggetti

* Usare == fa il confronto tra i riferimenti non fra i valori contenuti negli oggetti (p.e. le sequenze di caratteri contenute nelle istanze di String ) 
* Di solito si vogliono confrontare i contenuti non i riferimenti: per questo si usa il metodo __equals__ 
* Il metodo booleano equals della classe String accetta come argomento il riferimento ad un altro oggetto e ritorna true se le stringhe contenute sono uguali (in modo case sensitive), false altrimenti 
* Il metodo booleano equalsIgnoreCase fa lo stesso senza distinguere maiuscole/minuscole


## Una particolarità di String

* Usare esplicitamente new oppure la forma abbreviata per inizializzare un oggetto String non è esattamente la stessa cosa 
* Se si usa esplicitamente new, la Java Virtual Machine crea oggetti distinti anche se di contenuto uguale 
* Se non si usa esplicitamente new, la Java Virtual Machine evita di creare oggetti distinti ma dal contenuto uguale


## Operazioni su istanze
* Le principali operazioni che si possono
effettuare sulle variabili che riferiscono
istanze di una classe sono:
	* assegnamento
	* confronto
	* invocazione di metodi


## Metodi
* I metodi non static rappresentano operazioni
effettuabili su singoli oggetti
* La documentazione indica per ogni metodo il
tipo ritornato e la lista degli argomenti formali
che rappresentano i dati che il metodo deve
ricevere in ingresso da chi lo invoca
* Per ogni argomento formale sono specificati:
	* un nome
	* un tipo


## Invocazione di metodi
* L’invocazione di un metodo non static su un
oggetto istanza della classe in cui il metodo è
definito si effettua con la sintassi:
* Ogni volta che si invoca un metodo si deve
specificare una lista di argomenti attuali
* Gli argomenti attuali e formali sono in
corrispondenza posizionale
* Gli argomenti attuali possono essere delle
variabili o delle espressioni
* Gli argomenti attuali devono rispettare il tipo
attribuito agli argomenti formali
* La documentazione di ogni classe ( istanziabile o
no) contiene l’elenco dei metodi disponibili
* La classe Math non è istanziabile e contiene 54
metodi (tutti static ovviamente)
* La classe String è “ istanziabile ibrida” e contiene
70 metodi di cui 13 static
* La classe StringBuffer è “ istanziabile pura” e
contiene 53 metodi (nessuno static ovviamente)

## La ricerca del metodo
* Capire se esistono una classe e/o un metodo
che fanno ciò che ci serve non è sempre
facile: esiste un mare di classi ognuna delle
quali può contenere decine di metodi
* I libri, gli esempi già fatti, i programmatori più
esperti possono essere indispensabili per
indirizzare la ricerca
* individuare il package
* individuare la classe
* individuare il metodo


      
## Gestione memoria nella JVM (1)
Per capire meglio come funzionano classi e oggetti diamo uno sguardo “sotto il cofano” della Java Virtual Machine (JVM)
La memoria usata dalla JVM è concettualmente divisa in tre parti
* Ambiente delle classi: area di memoria in cui vengono caricate (allocate) tutte le classi che costituiscono il programma
* Stack: area di memoria in cui vengono caricati (allocati) i record di attivazione dei metodi, e quindi tutte le variabili locali
* Heap: area di memoria in cui vengono caricati (allocati) tutti i vari oggetti creati nel programma, man mano che vengono creati.
   

## Nell’ambiente delle classi

* vengono memorizzati il codice dei metodi e le variabili statiche di tutte le classi del programma
* sono le parti condivise dai vari oggetti della classe
* le variabili statiche sono utilizzabili anche in assenza di oggetti

## Nello stack

* vengono memorizzate le variabili locali dei metodi in esecuzione
* per le variabili di tipi primitivi viene memorizzato il valore (esempio: somma)
* per le variabili di tipo classe viene memorizzato un riferimento
(indirizzo di memoria di un oggetto) 

## Nell’heap
* per ogni oggetto creato vengono memorizzate le variabili d’istanza (ossia, le variabili non statiche)
* ogni oggetto nell’heap contiene anche il nome della classe di appartenenza
   
## Riferimenti (1)
I riferimenti meritano un approfondimento.
Abbiamo visto che una variabile di un tipo primitivo contiene direttamente il valore del dato
La dichirazione della variabile x alloca la memoria necessaria per contenere un int
Un assegnamento alla variabile x scrive un valore nella memoria precedentemente allocata
L’assegnamento di x a y copia il contenuto della variabile (il valore)
La modifica di y non modifica x 
```java        
        y = 40;
        int x;
        x = 33;
        int y = x;
```           
## Riferimenti (2)

Una variabile di un tipo classe contiene invece un riferimento a un oggetto La dichirazione della variabile primo di tipo Rettangolo alloca la
memoria necessaria per contenere un riferimento (inizializzato a null)
La creazione dell’oggetto primo alloca un nuovo oggetto e assegna un riferimento alla variabile
```java        
           Rettangolo primo;
                   primo = new Rettangolo(10,30)
```        
## Riferimenti (3)
L’assegnamento di primo a secondo copia il contenuto della variabile (il riferimento)
La modifica di secondo modifica l’oggetto riferito anche da primo
```java        
           Rettangolo secondo = primo;
                   secondo.base = 15;
```        
## Riferimenti (4)
Lo stesso discorso vale anche quando si passa un oggetto a un metodo come parametro
Viene passato il riferimento
Ogni modifica fatta all’oggetto all’interno del metodo non viene persa alla quando il metodo termina (il chiamante vedrà l’oggetto modificato)
Lo stesso discorso vale per gli array (gli array sono in realtà oggetti!)
   
## Riferimenti (5)
Una conseguenza del fatto che le variabili di tipo classe contengono riferimenti, è che l’opearatore di confronto == non si comporta (con gli oggetti) come uno si potrebbe aspettare...
Infatti oggetto1 == oggetto2 vale true solo se oggetto1 e oggetto2 sono (riferimenti al) lo stesso oggetto.
Esempio:
Abbiamo che:
```java
        Rettangolo r1 = new Rettangolo(10,12); 
        Rettangolo r2 = r1;
        Rettangolo r3 = new Rettangolo(10,12);
        System.out.println(r1==r2); // stampa true 
        System.out.println(r1==r3); // stampa false
```             
## Riferimenti (6)
Una soluzione a questo problema pùo essere il metodo equals.
Tutti gli oggetti (capiremo perchè) dispongono di alcuni metodi di base
Uno di questi è equals, e permette di confrontare due oggetti Lo abbiamo visto nelle stringhe
  Nelle classi più comuni della Libreria Standard di Java, il metodo equals è implementato in modo da confrontare una per una tutte le variabili interne di una coppia di oggetti
Anche nelle proprie classi si pùo implementare tale metodo (vedremo...)
```java
        s1.equals(s2);
```         
## Garbage collection (1)
Un’altra conseguenza del fatto che le operazioni (lettura, assegnamento, copia, ...) su variabili di tipo classe lavorino su riferimenti è che si possono ottenere oggetti orfani (privi di riferimenti).
Ad esempio:
supponiamo di creare due oggetti di tipo Rettangolo
```java
          Rettangolo primo = new Rettangolo(10,30); 
          Rettangolo secondo = new Rettangolo(20,50);
```             
## Garbage collection (2)
ora assegniamo secondo a primo
come è possibile accedere al vecchio valore di primo (il rettangolo di dimensioni 10 e 30) ???
Il vecchio oggetto è rimasto orfano... (nessun riferimento ad esso)
```java
            Rettangolo primo = secondo;
```         
## Garbage collection (3)
Il vecchio oggetto non è più utilizzabile!!! (è garbage, spazzatura)
Il linguaggio Java (come molti linguaggi moderni) prevede un meccanismo di rimozione degli oggetti privi di riferimenti detto Garbage Collector
Il garbage collector viene eseguito periodicamente dalla Java Virtual Machine. Interrompe per un attimo l’esecuzione del programma e pulisce la memoria dagli oggetti privi di riferimenti
    

