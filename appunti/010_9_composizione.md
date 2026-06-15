# Composizione

La **composizione** è uno dei concetti chiave dell’**OOP** ed è considerata un **caso più restrittivo di aggregazione**.

Mentre nell’aggregazione gli oggetti hanno un ciclo di vita indipendente, nella composizione la relazione **HAS-A** diventa molto più forte:
un oggetto contenitore **contiene** uno o più oggetti che **non possono esistere senza di esso**.

---

## Caratteristiche principali

* **Relazione forte HAS-A / PART-OF**: un oggetto è **parte integrante** di un altro.
* **Dipendenza del ciclo di vita**: se l’oggetto contenitore viene distrutto, vengono distrutti automaticamente anche gli oggetti contenuti.
* **Creazione interna**: di solito gli oggetti "parte" vengono creati all’interno della classe contenitore.
* **Migliore dell’ereditarietà**: la composizione è spesso preferita all’ereditarietà perché favorisce:

  * il **riuso del codice** (un oggetto può contenere altri oggetti con responsabilità specifiche),
  * il **controllo della visibilità** degli oggetti (gli oggetti parte non sono accessibili direttamente dall’esterno).

---

## PART-OF

La relazione di composizione può essere vista come **PART-OF** (“parte di”).

Esempio tipico:

* Un’**Auto** ha un **Motore**.
* Il **Motore** è parte integrante dell’auto.
* Se l’auto viene distrutta, anche il motore cessa di esistere.

---

## Differenze con altri concetti

* **Associazione**: relazione generica, senza vincolo di contenimento.
* **Aggregazione**: relazione HAS-A con ciclo di vita indipendente.
* **Composizione**: relazione HAS-A / PART-OF con ciclo di vita dipendente.

---

## Rappresentazione UML

In UML la composizione è rappresentata con:

* Una **linea** che collega le due classi.
* Un **rombo pieno** sul lato del contenitore.

![Rappresentazione UML](https://github.com/maboglia/CorsoJava/raw/master/appunti/img/aggregazione-composizione-associazione.png)

---

## Esempio in Java

### Composizione (un’Auto ha un Motore)

```java
class Motore {
    private int cilindrata;

    public Motore(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void avvia() {
        System.out.println("Motore avviato con cilindrata: " + cilindrata);
    }
}

class Auto {
    private String modello;
    private Motore motore;  // parte integrante

    public Auto(String modello, int cilindrata) {
        this.modello = modello;
        this.motore = new Motore(cilindrata); // il motore è creato insieme all’auto
    }

    public void avvia() {
        System.out.println("Avvio dell’auto " + modello);
        motore.avvia();
    }
}

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Fiat Panda", 1200);
        auto.avvia();
        // Quando "auto" viene distrutta, anche "motore" cessa di esistere
    }
}
```

### Nota sull’esempio

* **Auto** e **Motore** formano una relazione di composizione.
* Il **Motore** non può esistere senza l’**Auto** (ciclo di vita dipendente).
* La **composizione** garantisce un forte legame PART-OF.
