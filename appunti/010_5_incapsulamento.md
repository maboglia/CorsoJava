# Incapsulamento e visibilità in Java

* **due aspetti** che risultano fondamentali in un software:
  * **Interfaccia**: definita come gli **elementi che sono visibili dall'esterno**, cioè come il sw può essere utilizzato
  * **Implementazione**: la realizzazione pratica interna dei metodi e la loro interazione con le proprietà degli oggetti
* L'incapsulamento è uno dei concetti fondamentali di OOP.
* L'incapsulamento è la tecnica mediante la quale lo stato dell'oggetto è nascosto dal mondo esterno e viene esposto un insieme di metodi pubblici per l'accesso a questo stato.
* L'incapsulamento si ottiene quando ogni oggetto mantiene il proprio stato privato, all'interno di una classe.
* L'incapsulamento è noto come meccanismo di occultamento dei dati.
* L'incapsulamento ha una serie di importanti vantaggi ad esso associati, come codice debolmente accoppiato, riutilizzabile, sicuro e facile da testare.
* In Java, l'incapsulamento viene implementato tramite i modificatori di accesso: public, private e protected.

---

## Incapsulamento

* L'incapsulamento consiste nell'**occultamento degli attributi** di un oggetto in modo che possano essere **manipolati solo attraverso metodi** appositamente implementati. p.es la proprietà `saldo` di un oggetto `conto corrente`

* Bisogna fare in modo che l'interfaccia sia più indipendente possibile dall'implementazione

* In Java l'incapsulamento è strettamente relazionato con la visibilità

---

### Visibilità

* Per indicare la visibilità di un elemento (attribuito o metodo) possiamo farlo precedere da una delle seguenti parole riservate

* `public`: accessibile da qualsiasi classe
* `private`: accessibile solo dalla classe attuale
* `protected`: solo dalla classe attuale, le discendenti e le classi del nostro package
* `package`: se **non indichiamo la visibilità**: sono accessibili **solo dalle classi del nostro package**

---


### Accesso agli attributi della classe

* Gli attributi di una classe sono strettamente relazionati con la sua implementazione. 
* Conviene contrassegnarli come `private` e impedirne l'accesso dall'esterno
* In futuro potremo cambiare la rappresentazione interna dell'oggetto senza alterare l'interfaccia
* per consultarli e modificarli aggiungiamo i metodi accessori e mutatori:  `getters` e `setters`

---

### Modifica di rappresentazione interna di una classe

* Uno dei maggiori vantaggi di occultare gli attributi è che in **futuro potremo cambiarli** senza la necessità di cambiare l'interfaccia
* Un linguaggio di programmazione __ORIENTATO AGLI OGGETTI__  fornisce meccanismi per definire nuovi tipi di dato basati sul concetto di classe
* Una classe definisce un insieme di oggetti (conti bancari, dipendenti, automobili, rettangoli, ecc...).
* Un oggetto è una struttura dotata di proprie **variabili** (che rappresentano il suo stato) propri **metodi** (che realizzano le sue funzionalità)

[esempi classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)
