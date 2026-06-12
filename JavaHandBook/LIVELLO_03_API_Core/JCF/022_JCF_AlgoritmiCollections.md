# 🧠 Algoritmi del Java Collections Framework

## 🔍 Introduzione

Il **Java Collections Framework (JCF)** fornisce una serie di **algoritmi statici** nella classe `Collections`, che operano direttamente sulle strutture dati come `List`, `Set`, `Map` ecc.
Questi algoritmi sono **già ottimizzati**, **testati** e **riutilizzabili**.

---

## ⚙️ Principali algoritmi disponibili in `java.util.Collections`

| Metodo                                              | Descrizione                                                                     | Note                          |
| --------------------------------------------------- | ------------------------------------------------------------------------------- | ----------------------------- |
| `sort(List<T> list)`                                | Ordina gli elementi in base all’ordinamento naturale (definito da `Comparable`) |                               |
| `sort(List<T> list, Comparator<? super T> c)`       | Ordina la lista secondo un criterio personalizzato (`Comparator`)               |                               |
| `shuffle(List<?> list)`                             | Mischia casualmente gli elementi della lista                                    | Utile per test o giochi       |
| `reverse(List<?> list)`                             | Inverte l’ordine degli elementi                                                 |                               |
| `max(Collection<? extends T> coll)`                 | Restituisce l’elemento massimo                                                  | Richiede elementi comparabili |
| `min(Collection<? extends T> coll)`                 | Restituisce l’elemento minimo                                                   |                               |
| `binarySearch(List<? extends T> list, T key)`       | Ricerca binaria (lista ordinata)                                                | Richiede lista già ordinata   |
| `fill(List<? super T> list, T obj)`                 | Riempie la lista con un elemento specifico                                      |                               |
| `copy(List<? super T> dest, List<? extends T> src)` | Copia elementi da una lista a un’altra                                          |                               |
| `nCopies(int n, T obj)`                             | Crea una lista immutabile con *n* copie dello stesso oggetto                    |                               |
| `singleton(T obj)`                                  | Crea una lista/set immutabile contenente un solo elemento                       |                               |
| `unmodifiableList(Collection<? extends T> c)`       | Restituisce una vista non modificabile della lista                              | Utile per sicurezza dati      |

---

## 🧩 Esempio pratico: ordinamento di oggetti personalizzati

### Classe `Persona`

```java
public class Persona implements Comparable<Persona> {
    private String nome;
    private String cognome;
    private int eta;

    public Persona(int eta, String nome, String cognome) {
        this.eta = eta;
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public int getEta() { return eta; }

    @Override
    public String toString() {
        return nome + " " + cognome + " (" + eta + ")";
    }

    @Override
    public int compareTo(Persona p) {
        return Integer.compare(this.eta, p.eta);
    }
}
```

---

### Comparator per cognome

```java
import java.util.Comparator;

public class CognomeComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getCognome().compareTo(p2.getCognome());
    }
}
```

---

### Esempio d’uso

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Persona> persone = new ArrayList<>();
        persone.add(new Persona(27, "Marco", "Bianco"));
        persone.add(new Persona(80, "Luca", "Arancio"));
        persone.add(new Persona(75, "Giovanni", "Rossi"));
        persone.add(new Persona(29, "Mario", "Bianchi"));

        System.out.println("Lista non ordinata:");
        print(persone);

        System.out.println("\nOrdina per età:");
        Collections.sort(persone);
        print(persone);

        System.out.println("\nOrdina per cognome:");
        Collections.sort(persone, new CognomeComparator());
        print(persone);

        System.out.println("\nInverte l’ordine:");
        Collections.reverse(persone);
        print(persone);
    }

    private static void print(Collection<Persona> coll) {
        for (Persona p : coll) {
            System.out.println(p);
        }
    }
}
```

---

## 🧮 Risultato esempio

```
Lista non ordinata:
Marco Bianco (27)
Luca Arancio (80)
Giovanni Rossi (75)
Mario Bianchi (29)

Ordina per età:
Marco Bianco (27)
Mario Bianchi (29)
Giovanni Rossi (75)
Luca Arancio (80)

Ordina per cognome:
Luca Arancio (80)
Marco Bianco (27)
Mario Bianchi (29)
Giovanni Rossi (75)

Inverte l’ordine:
Giovanni Rossi (75)
Mario Bianchi (29)
Marco Bianco (27)
Luca Arancio (80)
```

---

## ✅ Conclusione

Gli **algoritmi di `Collections`** permettono di:

* evitare codice duplicato o errori logici
* ordinare, cercare, copiare, modificare e proteggere collezioni
* applicare facilmente diversi criteri di ordinamento tramite `Comparable` e `Comparator`
* garantire performance ottimali con strutture già ottimizzate

