# Classi Java

Le classi estendono il concetto di "struttura" di altri linguaggi

### Definiscono:

* I dati (detti campi o attributi)
* Le azioni (dette metodi o funzioni membro) che sui dati agiscono

### Possono essere definite
* Dal programmatore (ex. Automobile)
* Dall'ambiente Java (ex. String, System, etc.)

### La "gestione" di una classe avviene mediante
* Definizione della classe
* Instanziazione di Oggetti della classe

---


### Creazione di classi in Java

* Definire i termini oggetto e classe

* Descrivere la forma nella qual possiamo creare nuove classi in Java

* mostrare come, una volta creata una classe possiamo creare oggetti di questa classe e utilizzarli

---


### Java è un linguaggio orientato agli oggetti

* Java è un linguaggio orientato agli oggetti in cui quasi tutto è un oggetto

* Pertanto risulta fondamentale sapere come definire classi di oggetti in Java

* Anzitutto conviene definire questi termini:

* Oggetto: entità che dispone di alcune proprietà (attributi) e comportamenti (metodi)

* Classe: definisce un tipo concreto di oggetto

* In Java quasi tutto è un oggetto, ci sono solo due eccezioni: le variabili semplici e gli array

---


### Le classi in Java

* Il primo passo per definire una classe in Java è creare un file che deve chiamarsi esattamente come la classe e con estensione .java

* Java permette di definire solo un a classe per ogni file

* Una classe in Java è formata da:

* Attributi: (o campi/proprietà) che immagazzinano alcune informazioni sull'oggetto. Definiscono lo stato dell'oggetto

* Costruttore: metodo che si utilizza per inizializzare un oggetto

* Metodi: sono utilizzati per modificare o consultare lo stato di un oggetto. Sono equivalenti alle funzioni o procedimenti di altri linguaggi di programmazione

---


### Struttura di una classe


```java
public class HelloWorld {
    public static void main(String[] args) {
System.out.println("Hello World");
    }

}
```

## Incapsulamento e visibilità in Java

### Interfaccia e implementazione

* Quando disegniamo un software ci sono due aspetti che risultano fondamentali:

* Interfaccia: come il sw può essere utilizzato

* Implementazione: il codice che abbiamo utilizzato

In Java

* Interfaccia: definita come gli elementi che sono visibili dall'esterno

* Implementazione: definita creando alcuni determinati attributi e scrivendo il codice dei differenti metodi

---


### Incapsulamento

* L'incapsulamento consiste nell'occultamento degli attributi di un oggetto in modo che possano essere manipolati solo attraverso metodi appositamente implementati: fare in modo che l'interfaccia sia più indipendente possibile dall'implementazione

* In Java l'incapsulamento è strettamente relazionato con la visibilità

### Visibilità

* Per indicare la visibilità di un elemento (attribuito o metodo) possiamo farlo precedere da una delle seguenti parole riservate

* `public`: accessibile da qualsiasi classe

* `private`: accessibile solo dalla classe attuale

* `protected`: solo dalla classe attuale, le discendenti e le classi del nostro pacchetto

* Se **non indichiamo la visibilità**: sono accessibili solo dalle classi del nostro pacchetto

---


### Accesso agli attributi della classe

* Gli attributi di una classe sono strettamente relazionati con la sua implementazione. 
* Conviene contrassegnarli come private e impedirne l'accesso dall'esterno
* In futuro potremo cambiare la rappresentazione interna dell'oggetto senza alterare l'interfaccia
* Se non permettiamo di accedere agli attributi, risulta impossibile consultarli e modificarli
* Soluzione: creare i metodi getter e setter

---



### Modifica di rappresentazione interna di una classe

* Uno dei maggiori vantaggi di occultare gli attributi è che in futuro potremo cambiarli senza la necessità di cambiare l'interfaccia
* Un linguaggio di programmazione __ORIENTATO AGLI OGGETTI__ (tipo Java) fornisce meccanismi per definire nuovi tipi di dato basati sul concetto di classe
* Una classe definisce un insieme di oggetti (conti bancari, dipendenti, automobili, rettangoli, ecc...).
* Un oggetto è una struttura dotata di proprie **variabili** (che rappresentano il suo stato) propri **metodi** (che realizzano le sue funzionalità)


---


## Uso di classi
* Le classi, in quanto tipi di dato strutturati, prevedono usi e regole più complessi rispetto ai tipi semplici



## Classi già pronte

* Come la maggior parte dei linguaggi di programmazione, Java è dotato di una libreria di classi "pronte all'uso" che coprono molte esigenze
* Usare classi già definite da altri è la norma per non sprecare tempo a risolvere problemi già risolti o a reinventare la ruota (DRY)

---

## Uso di una classe pronta
* Quando si deve cercare e poi usare una classe pronta all'uso i passi da seguire sono:
  * Come identificarla ? Dove cercarla ?
  * La classe è istanziabile o non istanziabile ?
  * Se è istanziabile , come creo le istanze ?
  * Quali metodi mi servono e come li uso ?

---


## Classi e documentazione
* La libreria Java standard è accompagnata da
documentazione che illustra lo scopo e l'utilizzo di
ciascuna classe presente
* La documentazione è molto ampia, non ha scopo
didattico, ma piuttosto di __Reference manual__
* non è pensabile e non è molto utile studiare
estensivamente o memorizzare la documentazione
prima di programmare
* leggere la documentazione è una delle
attività più tipiche durante la programmazione

---

