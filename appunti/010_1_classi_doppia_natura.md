# 🔹 Tipologie di classi in Java

In Java, possiamo distinguere le classi in due grandi categorie:

1. **Classi istanziabili** → possono generare oggetti con `new`.
2. **Classi non istanziabili** → non hanno senso come oggetti o non possono essere create con `new`.

👉 Questa distinzione vale sia per le classi della libreria standard, sia per le classi definite da noi.

---

## 🔹 Classi istanziabili

* Forniscono il **prototipo** di una famiglia di oggetti che condividono struttura e comportamento.
* Ogni oggetto (istanza) ha **identità propria** e contiene i propri valori per gli attributi.
* I metodi operano sui dati dell’istanza.
* Tipicamente hanno **costruttori** e attributi/metodi **non statici**.

### Esempio

```java
class Persona {
    String nome;
    int eta;

    Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    void saluta() {
        System.out.println("Ciao, mi chiamo " + nome);
    }
}

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Luca", 25);
        p1.saluta(); // "Ciao, mi chiamo Luca"
    }
}
```

---

## 🔹 Classi non istanziabili

* Raccolgono **metodi e costanti statici** utili in generale, senza legame con istanze.
* Non hanno senso come oggetti singoli (es. non esistono “più matematiche”).
* Possono essere rese non istanziabili **omettendo costruttori** o rendendoli `private`.
* Sono usate per **utility**, **costanti** o per definire un **punto d’ingresso (`main`)**.

### Esempi

* `Math` → metodi matematici (`Math.sqrt(2)`) e costanti (`Math.PI`).
* `System` → accesso al sistema (`System.out.println(...)`).

```java
System.out.println(Math.sqrt(9));  // 3.0
System.out.println(Math.PI);       // 3.1415...
```

---

## 🔹 Classi ibride

Alcune classi **istanziabili** includono anche metodi statici.

* Esempio: `String` → è istanziabile (`new String("abc")` o letterale `"abc"`), ma ha anche metodi statici (`String.valueOf(...)`).

👉 Questo **ibridismo** va usato con cautela:

* È accettabile avere **costanti statiche** o pochi metodi statici di utilità.
* Ma mischiare troppi elementi statici e dinamici può rendere il design poco chiaro.

---

## 🔹 Classi astratte e interfacce

* Una **classe astratta** non può essere istanziata, ma serve come base per altre classi.
* Un’**interfaccia** definisce solo firme di metodi (contratti), non istanze.

```java
abstract class Animale {
    abstract void verso();
}

class Cane extends Animale {
    void verso() { System.out.println("Bau!"); }
}
```

---

# ✅ Riepilogo

* **Classi istanziabili** → rappresentano concetti con molteplici versioni individuali (`Persona`, `String`, `ArrayList`).
* **Classi non istanziabili** → rappresentano concetti unici, usate per metodi e costanti (`Math`, `System`).
* **Classi ibride** → istanziabili con qualche elemento statico (`String`).
* **Classi astratte/interfacce** → non istanziabili, ma fondamentali per l’ereditarietà e il polimorfismo.

