# Classi Java

### Java è un linguaggio orientato agli oggetti

* In Java quasi tutto è un oggetto

* Come definire classi e oggetti in Java?

* **Classe**: codice che definisce un tipo concreto di oggetto, con proprietà e comportamenti in un unico file

* **Oggetto**: istanza, esemplare della classe, entità che dispone di alcune proprietà e comportamenti propri, come gli oggetti della realtà

* In **Java** quasi tutto è un **oggetto**, ci sono solo due **eccezioni**: i tipi di dato semplici (tipi primitivi) e gli array (un oggetto trattato in modo _particolare_)

* Le classi, in quanto tipi di dato strutturati, prevedono **usi e regole più complessi** rispetto ai tipi semplici

---

Le classi estendono il concetto di "struttura" di altri linguaggi

### Definiscono

* I dati (detti campi o attributi)
* Le azioni (metodi, comportamenti) che agiscono sui dati

### Possono essere definite

* Dal programmatore (p.es. Automobile, Topo, Studente, ...)
* Dall'ambiente Java (p.es. String, System, Scanner, ...)

---

### La "gestione" di una classe avviene mediante

* Definizione della classe
* Instanziazione di Oggetti della classe


### Struttura di una classe


```java
public class HelloWorld {

    public static void main(String[] args) {
	  	System.out.println("Hello World");
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

* Come la maggior parte dei linguaggi di programmazione, Java è dotato di una libreria di classi "pronte all'uso" che coprono molte esigenze
* Usare classi già definite da altri è la norma per non sprecare tempo a risolvere problemi già risolti o a reinventare la ruota (DRY)
* La libreria Java standard è accompagnata da documentazione che illustra lo scopo e l'utilizzo di ciascuna classe presente, 
* Dalla versione 9 di Java la libreria è stata divisa in moduli

* [Documentazione Java 8](https://docs.oracle.com/javase/8/docs/api/overview-summary.html)
* [Documentazione Java 9](https://docs.oracle.com/javase/9/docs/api/overview-summary.html)
* [Documentazione Java 11](https://docs.oracle.com/en/java/javase/11/)
* [Documentazione Java 13](https://docs.oracle.com/en/java/javase/13/)