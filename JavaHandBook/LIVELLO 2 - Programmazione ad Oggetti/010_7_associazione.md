# Associazione

L’**associazione** è uno dei concetti fondamentali della **Programmazione Orientata agli Oggetti (OOP)**.
Essa descrive la **relazione tra due classi indipendenti**, ovvero classi che non appartengono gerarchicamente l’una all’altra (non c’è ereditarietà né composizione).

L’associazione definisce una **relazione di molteplicità tra oggetti**, cioè specifica come e quanti oggetti di una classe possono essere collegati ad oggetti di un’altra classe.

---

## Caratteristiche principali

* **Indipendenza**: le classi coinvolte nell’associazione non dipendono l’una dall’altra per esistere.
* **Nessun proprietario**: non esiste un "titolare" della relazione, gli oggetti hanno un proprio ciclo di vita indipendente.
* **Durata di vita autonoma**: la distruzione di un oggetto non implica la distruzione automatica dell’altro.
* **Direzione**: l’associazione può essere:

  * **Unidirezionale**: un oggetto "conosce" l’altro e può utilizzarne i metodi/attributi.
  * **Bidirezionale**: entrambi gli oggetti si conoscono e possono interagire.
* **Molteplicità**:

  * **Uno-a-uno (1:1)**
  * **Uno-a-molti (1:N)**
  * **Molti-a-uno (N:1)**
  * **Molti-a-molti (N:M)**

---

## Differenze con altri tipi di relazione

* **Aggregazione**: relazione "ha un" in cui un oggetto può contenere altri, ma questi possono esistere anche da soli.
* **Composizione**: relazione "fa parte di" più forte, in cui il ciclo di vita dei sotto-oggetti dipende dall’oggetto contenitore.
* **Associazione**: relazione più generica, senza vincolo di contenimento.

---

## Rappresentazione UML

In UML l’associazione è rappresentata con una **linea semplice** che collega le due classi.

* La direzionalità viene indicata con una **freccia** (→) se unidirezionale.
* La molteplicità si indica vicino alle estremità (es. `1..*`, `0..1`, `*`).

![Rappresentazione UML](https://github.com/maboglia/CorsoJava/raw/master/appunti/img/aggregazione-composizione-associazione.png)

---

## Esempio in Java

### Associazione uno-a-molti (un Dipartimento ha più Docenti)

```java
class Docente {
    private String nome;

    public Docente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Dipartimento {
    private String nome;
    private List<Docente> docenti;

    public Dipartimento(String nome) {
        this.nome = nome;
        this.docenti = new ArrayList<>();
    }

    public void aggiungiDocente(Docente docente) {
        docenti.add(docente);
    }

    public List<Docente> getDocenti() {
        return docenti;
    }
}

public class Main {
    public static void main(String[] args) {
        Dipartimento dip = new Dipartimento("Informatica");
        Docente d1 = new Docente("Rossi");
        Docente d2 = new Docente("Bianchi");

        dip.aggiungiDocente(d1);
        dip.aggiungiDocente(d2);

        for (Docente d : dip.getDocenti()) {
            System.out.println(d.getNome() + " lavora nel dipartimento " + dip);
        }
    }
}
```

In questo esempio:

* **Dipartimento** e **Docente** sono indipendenti.
* Un **Dipartimento** può avere più **Docenti**.
* I docenti esistono anche senza il dipartimento (indipendenza della vita degli oggetti).

