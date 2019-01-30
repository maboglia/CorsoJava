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

esempio

### Ereditarietà in Java

* Definire il concetto di ereditarietà

* Descrivere la forma nella qual possiamo creare una nuova classe in java estendendone una già esistente

* Mostrare alcuni casi in cui l’ereditarietà può essere molto utile

### Come riutilizzare il codice

* Uno dei grandi vantaggi della programmazione a oggetti è la facilità nel riutilizzare il codice

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