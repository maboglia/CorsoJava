# Aggregazione

L’**aggregazione** è uno dei concetti fondamentali dell’**OOP** ed è considerata un **caso particolare di associazione unidirezionale**.

L’aggregazione descrive una relazione di tipo **HAS-A** (“ha un”), in cui un oggetto contiene un riferimento ad altri oggetti, pur mantenendo ciascuno il proprio ciclo di vita indipendente.

---

## Caratteristiche principali

* **Specializzazione dell’associazione**: è un’associazione, ma con un concetto semantico più forte.
* **Relazione HAS-A**: un oggetto possiede o utilizza un altro oggetto.
* **Ciclo di vita indipendente**: gli oggetti coinvolti non dipendono l’uno dall’altro per la loro esistenza. La distruzione di un oggetto non implica la distruzione dell’altro.
* **Proprietario logico**: uno degli oggetti (l’aggregatore) è considerato proprietario logico della relazione, ma non del ciclo di vita degli oggetti.

---

## Differenze rispetto ad altri concetti

* **Associazione**: relazione generica, senza vincolo di contenimento.
* **Aggregazione**: relazione più specifica di tipo HAS-A, con proprietà logica ma indipendenza di ciclo di vita.
* **Composizione**: relazione più forte in cui gli oggetti contenuti **non possono esistere** senza l’oggetto contenitore.

---

## Rappresentazione UML

In UML l’aggregazione è rappresentata con:

* Una **linea** che collega le due classi.
* Un **rombo vuoto** sul lato dell’oggetto contenitore (l’aggregatore).

![Rappresentazione UML](https://github.com/maboglia/CorsoJava/raw/master/appunti/img/aggregazione-composizione-associazione.png)

---

## Esempio in Java

### Aggregazione uno-a-molti (una Scuola ha più Studenti)

```java
class Studente {
    private String nome;

    public Studente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Scuola {
    private String nome;
    private List<Studente> studenti;

    public Scuola(String nome) {
        this.nome = nome;
        this.studenti = new ArrayList<>();
    }

    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    public List<Studente> getStudenti() {
        return studenti;
    }
}

public class Main {
    public static void main(String[] args) {
        Scuola scuola = new Scuola("Liceo Scientifico");
        Studente s1 = new Studente("Luca");
        Studente s2 = new Studente("Anna");

        scuola.aggiungiStudente(s1);
        scuola.aggiungiStudente(s2);

        for (Studente s : scuola.getStudenti()) {
            System.out.println(s.getNome() + " frequenta " + scuola);
        }
    }
}
```

### Nota sull’esempio

* La **Scuola** contiene una lista di **Studenti** (relazione HAS-A).
* Gli **Studenti** esistono anche senza la **Scuola** (ciclo di vita indipendente).
* L’oggetto **Scuola** è proprietario logico della relazione, ma non della vita degli **Studenti**.
