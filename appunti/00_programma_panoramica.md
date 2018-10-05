# Java Fondamentale

### Caratteristiche di Java

* Semplice e familiare

* Orientato a oggetti

* Indipendente dalla piattaforma

* interpretato

* Sicuro

* Robusto

* Distribuito e dinamico

* Multi-thread

### Semplice e familiare

* Basato su C

* Sviluppato da zero

* Estremamente semplice: senza puntatori, macro, registri, tipizzazione

* Apprendimento rapido

* Semplificazione della programmazione

* Riduzione del numero di errori



### Orientato a oggetti



* Orientato a oggetti dalla base

* In Java tutto è un oggetto

* Incorpora le caratteristiche

* Incapsulamento

* Polimorfismo

* Ereditarietà

* Collegamento dinamico

* Non sono disponibili

* Ereditarietà multipla

* Overload degli operatori



### Indipendente dalla piattaforma



* Più efficiente di altri linguaggi interpretati

* Soluzione: la macchina virtuale

* JVM (non è proprio la JVM)

* Linguaggio macchina bytecodes



### Interpretato



* Il bytecode deve essere interpretato

[!["java_processo"](http://www.bogliaccino.it/img/java_processo-400x87.jpg)](http://www.bogliaccino.it/corso-android-2-java-fondamentale/java_processo/)



* Vantaggi rispetto ad altri linguaggi interpretati

* Codice più compatto

* Efficiente

* Codice confidenziale (non esposto)



### sicuro



* Supporta la sicurezza di tipo sandboxing

* Verifica del bytecode

* Altre misure di sicurezza

* Caricatore di classi

* Restrizioni nell’accesso alla rete



### Robusto



* L’esecuzione nella JVM impedisce di bloccare il sistema

* L’assegnazione dei tipi è molto restrittiva

* La gestione della memoria è sempre a carico del sistema

* Il controllo del codice avviene sia a tempo di compilazione sia a tempo di esecuzione (runtime)



### Distribuito e dinamico



* Disegnato per un’esecuzione remota e distribuita

* Sistema dinamico

* Classe collegata quando è richiesta

* Può essere caricata via rete

* Dinamicamente estensibile

* Disegnato per adattarsi ad ambienti in evoluzione





### Multi-thread



* Soluzione semplice ed elegante per la multiprogrammazione

* Un programma può lanciare differenti processi

* Non si tratta di nuovi processi, condividono il codice e le variabili col processo principale

* Simultaneamente si possono svolgere vari compiti



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

Esempio in aula

### Esempio di classe

Esempio in aula

### Creazione e utilizzazione di oggetti

Esempio in aula

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

esempio

### Ereditarietà in Java

* Definire il concetto di ereditarietà

* Descrivere la forma nella qual possiamo creare una nuova classe in java estendendone una già esistente

* Mostrare alcuni casi in cui l’ereditarietà può essere molto utile

### Come riutilizzare il codice

* Uno dei grandi vantaggi della programmazione a oggetti è la facilità nel riutillizzare il codice

* In Java si realizza attraverso l’ereditarietà

* Per esempio immaginiamo di disporre di un sistema di georeferenziazione in cui la classe principale è

Geopunto {attributi: longitudine, latitudine}

* Dobbiamo modificare il sistema per aggiungere un nuovo attributo, l’altitudine

a)Modifichiamo direttamente la classe Geopunto Errore

b)Creiamo una nuova classe che erediti da Geopunto:

NuovoGeopunto {Geopunto + attributo: altitudine}

### Estendere la classe

### Quando utilizzare l’ereditarietà

* Per modificare classi già esistenti

* In un ambiente di sviluppo reale disponiamo di centinaia di classi. Per esempio la classe Button che rappresenta un bottone

* Immagina di dover creare un nuovo tipo di bottone che riproduca un suono quando viene schiacciato

* Con l’ereditarietà risulta molto semplice

* Per non dover riprogrammare due volte lo stesso codice

* Devi creare varie classi, p.es Cliente, Venditore, Distributore

* Esiste una parte del codice comune a tutte quante, p.es Piva, indirizzo, SpedireLettera()

* Crei una classe addizionale che raccolga il codice comune, es ParteCommerciale da cui ereditino le parti comuni

### Il polimorfismo in Java

* Introdurre la classe Object e ripassare il concetto di ereditarietà

* Definire il concetto di polimorfismo

* Mostrare alcuni casi in cui il polimorfismo può essere molto utile

* Descrivere alcuni strumenti di Java utili quando lavoriamo col polimorfismo

### L’ ereditarietà e la classe Object

* L’ ereditarietà ci permette di creare nuove classi a partire da altre già esistenti

* Quelle classi che non indichiamo in modo esplicito da dove derivino lo faranno in modo automatico dalla classe Object

* Pertanto la classe Object è la radice dell’albero genealogico dell’ereditarietà in Java. Come dire che tutti gli oggetti discendono da tale classe

* Questa classe dispone di una serie di metodi che pertanto sono disponibili in tutti gli oggetti che creiamo

* Tra questi metodi troviamo, p.es

* toString(), getClass(), equals(Object o), …

### L’ ereditarietà e la classe Object

* Un oggetto della classe figlia appartiene anche alla classe padre ed agli ascendenti

* Per esempio un oggetto della classe vista prima ComplessoAmpliato appartiene tanto alla classe Complesso, quanto a Object

### Il polimorfismo

* Il polimorfismo consiste nel dichiarare un oggetto di una classe, però istanziandolo come un discendente di tale classe (non si può fare il contrario!)
```
  <Classe_padre> <oggetto> =

  new <Classe_figlia> (<parametri>);
```
### Perché si usa il polimorfismo

* Quando stiamo sviluppando una applicazione Android e vogliamo inserire un bottone, spesso vogliamo aggiungere una grafica di sfondo

* Per far questo avremo bisogno di un oggetto Drawable

* Abbiamo a disposizione moltissimi sfondi

Ma magari non sappiamo che tipo di disegno sarà!

### Conversione di tipi (TYPE CAST)

mostra esempio in aula

### Uso di INSTANCEOF

* La keyword riservata instanceof permette di verificare se un oggetto appartiene ad una classe

