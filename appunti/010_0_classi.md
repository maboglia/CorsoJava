# 🔹 Classi in Java

La **classe** è uno dei concetti fondamentali della **programmazione orientata agli oggetti (OOP)**.
Una classe è un **modello (blueprint)** per la creazione di **oggetti**, che rappresentano entità con **stato** (attributi) e **comportamenti** (metodi).

---

## 🔹 Caratteristiche principali

* Una **classe** non consuma memoria da sola: occupa memoria solo quando vengono create istanze (`new`).
* Una classe può essere **istanziata più volte**, producendo oggetti distinti.
* Ogni classe dovrebbe rispettare il **principio di responsabilità singola (SRP)**: fare bene una sola cosa.

---

## 🔹 Java è orientato agli oggetti

* **Classe**: definisce un nuovo tipo, con **proprietà** (attributi) e **azioni** (metodi).
* **Oggetto**: istanza della classe, con dati propri e metodi applicabili a essi.
* In Java **quasi tutto è un oggetto**, tranne:

  * i **tipi primitivi** (`int`, `double`, `boolean`, …)
  * gli **array**, che sono oggetti ma trattati in modo speciale.

---

## 🔹 Le classi definiscono

* **Attributi** (o campi) → dati che descrivono lo stato dell’oggetto.
* **Metodi** → operazioni che l’oggetto può eseguire o che agiscono sui dati.

Esempi:

* Definite dal programmatore (`Automobile`, `Studente`, `Persona` …).
* Definite da Java (`String`, `System`, `Scanner` …).

---

## 🔹 Creazione di oggetti

La creazione di un oggetto si chiama **istanza** e avviene con `new`.

```java
Persona p1 = new Persona("Luca", "Rossi", 25);
```

Ogni volta che uso `new` creo un nuovo oggetto con i suoi valori indipendenti.

---

## 🔹 Struttura di una classe

```java
package model;

public class Persona {

    // attributi (incapsulati)
    private String nome;
    private String cognome;
    private int eta;

    // costruttore
    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    // metodo di istanza
    public void saluta() {
        System.out.println("Ciao, sono " + nome);
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " (" + eta + " anni)";
    }
}
```

---

## 🔹 Regole di base per le classi

* Ogni classe deve stare in un file con **lo stesso nome** e estensione `.java`.
* Una classe può contenere:

  * **Attributi**: variabili che rappresentano lo stato.
  * **Costruttori**: metodi speciali per inizializzare l’oggetto.
  * **Metodi**: azioni sugli oggetti.
* Per convenzione:

  * i **nomi delle classi** iniziano con la maiuscola (`Persona`),
  * i **metodi** con la minuscola (`saluta`).

---

## 🔹 Documentazione e libreria standard

* Java fornisce una ricca **libreria di classi pronte all’uso** (principio DRY: *Don’t Repeat Yourself*).
* Ogni classe della libreria è documentata con API ufficiali.
* Dalla **Java 9** la libreria standard è stata organizzata in **moduli**.

📌 Documentazione ufficiale:

* [Java 8](https://docs.oracle.com/javase/8/docs/api/overview-summary.html)
* [Java 11](https://docs.oracle.com/en/java/javase/11/)
* [Java 17](https://docs.oracle.com/en/java/javase/17/)
* [Java 21](https://docs.oracle.com/en/java/javase/21/)

---

# ✅ Riepilogo

* Una **classe** è un progetto (blueprint) → gli **oggetti** sono istanze reali.
* Ogni oggetto ha **proprietà** (attributi) e **comportamenti** (metodi).
* Le classi possono essere create dal programmatore o già pronte nella libreria Java.
* Buona pratica: seguire il **principio di responsabilità singola (SRP)**.

---

## Domande

---

Che cos’è una classe in Java?
A. Una variabile che contiene più valori
B. Un insieme di istruzioni che definisce un tipo di oggetto
C. Un metodo speciale
D. Una struttura per gestire array

---

Che cos’è un oggetto in Java?
A. Una variabile di tipo primitivo
B. Un’istanza di una classe
C. Un metodo statico
D. Una costante

---

Quale parola chiave viene usata per creare un nuovo oggetto in Java?
A. class
B. this
C. new
D. void

---

Cosa rappresentano gli attributi di una classe?
A. Le azioni che un oggetto può compiere
B. Lo stato o le proprietà dell’oggetto
C. Il costruttore della classe
D. Le regole di visibilità

---

Quale componente di una classe inizializza i suoi oggetti?
A. Metodo getter
B. Metodo setter
C. Costruttore
D. Attributo statico

---

Quale convenzione si usa per il nome delle classi in Java?
A. Tutte maiuscole
B. Tutte minuscole
C. PascalCase (iniziale maiuscola)
D. snake_case

---

Cosa restituisce il metodo toString() se non viene sovrascritto?
A. Una descrizione leggibile dell’oggetto
B. Null
C. Un identificatore interno formato da nome classe + hashcode
D. Una lista di attributi

---

Quanti oggetti posso creare a partire da una classe?
A. Uno solo
B. Nessuno
C. Un numero qualsiasi
D. Solo se la classe è statica

---

Quali tra i seguenti NON sono oggetti in Java?
A. ArrayList
B. String
C. int
D. Scanner

---

Quale principio di progettazione dice che una classe deve fare una sola cosa?
A. DRY
B. SRP (Single Responsibility Principle)
C. OCP
D. LSP
