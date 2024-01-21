# Classi Java

* Una classe è uno dei concetti fondamentali di OOP.
* Una classe è un modello o un progetto per la creazione di oggetti.
* Una classe non consuma memoria.
* Una classe può essere istanziata più volte.
* Una classe fa una, e solo una, cosa.

Una classe è uno dei concetti fondamentali di OOP. Una classe è un insieme di istruzioni necessarie per costruire un tipo specifico di oggetto. 
Possiamo pensare a una classe come a un modello, un progetto o una ricetta che ci dice come creare oggetti di quella classe. 

La creazione di un oggetto di quella classe è un processo chiamato istanziazione e di solito viene eseguito tramite la parola chiave `new`. 

Possiamo istanziare tutti gli oggetti che vogliamo. Una definizione di classe non consuma memoria salvata come file sul disco rigido. Una delle migliori pratiche che una classe dovrebbe seguire è il principio di responsabilità singola (SRP): una classe dovrebbe essere progettata e scritta per fare una, e solo una, cosa.

---

## Java è un linguaggio orientato agli oggetti

* Come definire classi e oggetti in Java?
* **Classe**: codice che definisce un tipo concreto di oggetto, con proprietà e comportamenti in un unico file
* **Oggetto**: istanza, esemplare della classe, entità che dispone di alcune proprietà e comportamenti propri, come gli oggetti della realtà
* In **Java** quasi tutto è un **oggetto**, ci sono solo due **eccezioni**:
  * i tipi di dato semplici (tipi primitivi) e
  * gli array (un oggetto trattato in modo _particolare_)

* Le classi, in quanto tipi di dato strutturati, prevedono **usi e regole più complessi** rispetto ai tipi semplici

---

## La classe è lo 'stampo' per gli oggetti

![Classi e oggetti](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/cookie-cutter.png)

---

## Le classi definiscono

* I dati (detti campi o attributi)
* Le azioni (metodi, comportamenti) che agiscono sui dati

Possono essere definite

* Dal programmatore (p.es. Automobile, Topo, Studente, ...)
* Dall'ambiente Java (p.es. String, System, Scanner, ...)

## La "gestione" di una classe avviene mediante

* Definizione della classe
* Instanziazione di Oggetti della classe

---

### Struttura di una classe

```java
package model;

public class Persona {

    //proprietà private - vedi incapsulamento
    private String nome;
    private String cognome;
    private int eta;

    //metodo costruttore
    public Persona (String nome, String cognome, int eta)  {
    this.nome = nome;
    this.cognome = cognome;
    this.eta = eta;
    }
    
    //per gestire le proprietà vedi metodi getters and setters    
    //metodi...

    @Override
    public String toString () {
    return this.nome + " " + this.cognome + " " +  this.eta;
    }
}
```

---

### Le classi in Java

* Il primo passo per definire una classe in Java è creare un file che deve chiamarsi esattamente come la classe e con estensione .java

* Java permette di definire solo una classe per ogni file

* Una classe in Java è formata da:

* **Attributi**: (o campi/proprietà) che immagazzinano alcune informazioni sull'oggetto. Definiscono lo stato dell'oggetto

* **Costruttore**: metodo che si utilizza per inizializzare un oggetto

* **Metodi**: sono utilizzati per modificare o consultare lo stato di un oggetto. Sono equivalenti alle funzioni o procedure di altri linguaggi di programmazione

---

## Classi e documentazione

* Java è dotato di una libreria di classi "pronte all'uso" che coprono molte esigenze
* Usare classi già definite da altri è la norma (principio DRY)
* La libreria Java standard è accompagnata da documentazione che illustra lo scopo e l'utilizzo di ciascuna classe presente
* Dalla versione 9 di Java la libreria è stata divisa in moduli

* [Documentazione Java 8](https://docs.oracle.com/javase/8/docs/api/overview-summary.html)
* [Documentazione Java 9](https://docs.oracle.com/javase/9/docs/api/overview-summary.html)
* [Documentazione Java 11](https://docs.oracle.com/en/java/javase/11/)
* [Documentazione Java 14](https://docs.oracle.com/en/java/javase/14/)
* [Documentazione Java 17](https://docs.oracle.com/en/java/javase/17/)

[esempi classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)
