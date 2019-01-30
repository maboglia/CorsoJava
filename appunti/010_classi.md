### Creazione di classi in Java

* Definire i termini oggetto e classe

* Descrivere la forma nella qual possiamo creare nuove classi in Java

* mostrare come, una volta creata una classe possiamo creare oggetti di questa classe e utilizzarli

### Java è un linguaggio orientato agli oggetti

* Java è un linguaggio orientato agli oggetti in cui quasi tutto è un oggetto

* Pertanto risulta fondamentale sapere come definire classi di oggetti in Java

* Anzitutto conviene definire questi termini:

* Oggetto: entità che dispone di alcune proprietà (attributi) e comportamenti (metodi)

* Classe: definisce un tipo concreto di oggetto

* In Java quasi tutto è un oggetto, ci sono solo due eccezioni: le variabili semplici e gli array

### Le classi in Java

* Il primo passo per definire una classe in Java è creare un file che deve chiamarsi esattamente come la classe e con estensione .java

* Java permette di definire solo un a classe per ogni file

* Una classe in Java è formata da:

* Attributi: (o campi/proprietà) che immagazzinano alcune informazioni sull’oggetto. Definiscono lo stato dell’oggetto

* Costruttore: metodo che si utilizza per inizializzare un oggetto

* Metodi: sono utilizzati per modificare o consultare lo stato di un oggetto. Sono equivalenti alle funzioni o procedimenti di altri linguaggi di programmazione

### Struttura di una classe


```java
public class HelloWorld {
    public static void main(String[] args) {
System.out.println("Hello World");
    }

}
```
### Creazione e uso di oggetti

* Esempio

### Incapsulamento e visibilità in Java

### Interfaccia e implementazione

* Quando disegniamo un software ci sono due aspetti che risultano fondamentali:

* Interfaccia: come il sw può essere utilizzato

* Implementazione: il codice che abbiamo utilizzato

* In Java

* Interfaccia: definita come gli elementi che sono visibili dall’esterno

* Implementazione: definita creando alcuni determinati attributi e scrivendo il codice dei differenti metodi

### Incapsulamento

* L’incapsulamento consiste nell’occultamento degli attributi di un oggetto in modo che possano essere manipolati solo attraverso metodi appositamente implementati

* Dettoo in altro modo: fare in modo che l’interfaccia sia più indipendente possibile dall’implementazione

* In Java l’incapsulamento è strettamente relazionato con la visibilità

### Visibilità

* Per indicare la visibilità di un elemento (attribuito o metodo) possiamo farlo precedere da una delle seguenti parole riservate

* public: accessibile da qualsiasi classe

* private: accessibile solo dalla classe attuale

* protected: solo dalla classe attuale, le discendenti e le classi del nostro pacchetto

* Se non indichiamo la v.: sono accessibili solo dalle classi del nostro pacchetto

### Accesso agli attributi della classe

* Gli attributi di una classe sono strettamente relazionati con la sua implementazione. Conviene contrassegnarli come private e impedirne l’accesso dall’esterno

* In futuro potremo cambiare la rappresentazione interna dell’oggetto senza alterare l’interfaccia

* In pratica:

class NomeClasse{
   private double nome1, nome2;

* Non permettiamo di accedere agli attributi perciò risulta impossibile consultarli e modificarli

* Soluzione: creare i metodi getter e setter

Metodi **getter e setter**

* Danno accesso agli attributi:

class NomeClasse{  private double nome1, nome2;

       public double getNome1(){
       return nome1;<
       } 
       public void setNome1(double nome1){ 
       this.nome1 = nome1; 
       }

* Vantaggi: possiamo cambiare la rappresentazione interna, verificare che i valori siano corretti, modificare altri aspetti dell’oggetto

### Modifica di rappresentazione interna di una classe

* Uno dei maggiori vantaggi di occultare gli attributi è che in futuro potremo cambiarli senza la necessità di cambiare l’interfaccia
Un linguaggio di programmazione __ORIENTATO AGLI OGGETTI__ (tipo Java) fornisce meccanismi per definire nuovi tipi di dato basati sul concetto di classe
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


