# Collection Factory Methods (Java 9)

### 1. **Cosa sono**

Java 9 ha introdotto nuovi **metodi statici `of()`** nelle interfacce `List`, `Set` e `Map`, per creare collezioni direttamente non modificabili (*immutable*) in modo conciso e sicuro ([jeps.dev][1], [Oracle Documentation][2]).

### 2. **Caratteristiche principali**

* **Immutabilità**: le collezioni create non possono essere modificate. Qualunque tentativo di operazione come `add()`, `remove()` etc. lancia una `UnsupportedOperationException` ([GeeksforGeeks][3], [Java Code Geeks][4]).
* **Null non permessi**: `List.of()` e `Set.of()` non accettano elementi null, e `Map.of()` non accetta chiavi o valori null. In presenza di `null`, viene lanciata una `NullPointerException` ([GeeksforGeeks][3], [Baeldung on Kotlin][5]).
* **Chiavi duplicate non permesse**: con `Set.of()`, elementi duplicati causano una `IllegalArgumentException`; con `Map.of()`, duplicati nelle chiavi hanno lo stesso effetto ([GeeksforGeeks][3]).
* **Efficienza interna**: utilizzo di implementazioni ottimizzate (es. `List0`, `List1`, ..., `ListN`) che riducono overhead e ottimizzano memoria ([GeeksforGeeks][3], [nikgrozev.com][6]).
* **Thread-safe per natura**: essendo immutabili, risultano automaticamente sicure in contesti concorrenti ([Oracle Documentation][2]).
* **Iterazione casuale su Set/Map**: l’ordine di iterazione non è garantito e può variare tra esecuzioni ([Oracle Documentation][2]).

### 3. **Esempi di Codice**

```java
List<String> list = List.of("Java", "Python", "Scala");
// list.add("C++"); // -> UnsupportedOperationException

Set<String> set = Set.of("Apple", "Banana", "Cherry");
// Set.of("A", "B", null); // -> NullPointerException

Map<String, Integer> map = Map.of("x", 1, "y", 2, "z", 3);
// Map.of("a", 1, "a", 2); // -> IllegalArgumentException
```

E se hai bisogno di più di 10 coppie chiave/valore:

```java
Map<String, Integer> bigMap = Map.ofEntries(
    Map.entry("k1", 1),
    Map.entry("k2", 2),
    Map.entry("k3", 3)
);
```

([chua.bitbucket.io][7], [wkorando.github.io][8], [InfoWorld][9])

### 4. **Perché è utile per i junior**

* **Sintassi semplice e leggibile**, ideale per iniziare a scrivere codice moderno.
* **Declara l'intento** di non voler modificare la collezione.
* Evita errori comuni legati a `null` o mutazioni inattese.

### 5. **Cosa pensano gli sviluppatori (citazioni da Reddit)**

> “On the top of my head and in order of supposedly most used: … 3. `List.of()`, `Map.of()`, `Set.of()`” ([Reddit][10])

> “It’s silly but my favorite new feature is the convenience factory methods. eg: `Set.of(1, 2, 3)`.” ([Reddit][11])

Queste feature sono davvero apprezzate nella community!

---

## Riepilogo in Tabella

| Metodo               | Collezione | Caratteristiche principali                                        |
| -------------------- | ---------- | ----------------------------------------------------------------- |
| `List.of(...)`       | `List<E>`  | Ordinata, no `null`, no modifiche, efficiente                     |
| `Set.of(...)`        | `Set<E>`   | Nessun duplicato, no `null`, no modifiche, ordine non garantito   |
| `Map.of(...)`        | `Map<K,V>` | Nessuna chiave duplicata, no `null`, no modifiche, ordine casuale |
| `Map.ofEntries(...)` | `Map<K,V>` | Per più di 10 coppie, usa `Map.entry(...)`                        |

---

[1]: https://jeps.dev/docs/jdk9/jeps/269?utm_source=chatgpt.com "JDK9新特性-JEP 269: Convenience Factory Methods for Collections | JEPs"
[2]: https://docs.oracle.com/en/java/javase/11/core/creating-immutable-lists-sets-and-maps.html?utm_source=chatgpt.com "Creating Unmodifiable Lists, Sets, and Maps"
[3]: https://www.geeksforgeeks.org/java/java-convenience-factory-methods-for-collections/?utm_source=chatgpt.com "Java Convenience Factory Methods for Collections - GeeksforGeeks"
[4]: https://www.javacodegeeks.com/2018/02/java-9-example-factory-methods-collection-creating-unmodifiable-list-set-map.html?utm_source=chatgpt.com "Java 9 Example - Factory Methods for Collection - Creating Unmodifiable List, Set, and Map - Java Code Geeks"
[5]: https://www.baeldung.com/java-9-collections-factory-methods?utm_source=chatgpt.com "Java 9 Convenience Factory Methods for Collections | Baeldung"
[6]: https://nikgrozev.com/2021/12/04/java-9-and-afterwards/?utm_source=chatgpt.com "New Features in Java 9 and Later Versions"
[7]: https://chua.bitbucket.io/java/J5c_CollectionPart2.html?utm_source=chatgpt.com "The Collection Framework - Java Programming Tutorial"
[8]: https://wkorando.github.io/sip-of-java/006.html?utm_source=chatgpt.com "Convenience Factory Methods for Collections | sip-of-java"
[9]: https://www.infoworld.com/article/2252508/java-9s-other-new-enhancements-part-1.html?utm_source=chatgpt.com "Java 9’s other new enhancements, Part 1: Collections factory methods | InfoWorld"
[10]: https://www.reddit.com/r/java/comments/15ae93f?utm_source=chatgpt.com "What are your most used java features since java 9?"
[11]: https://www.reddit.com/r/java/comments/mhury9?utm_source=chatgpt.com "A categorized list of all Java and JVM features since JDK 8 to 16"

---

# **Esercizi su Collection Factory Methods**

---

## Esercizio 1 — Creazione di una lista

Crea una lista immutabile di 5 nomi usando `List.of()`.

* Stampala.
* Prova ad aggiungere un nuovo elemento e osserva cosa succede.

👉 Hint: solleva `UnsupportedOperationException`.

---

## Esercizio 2 — Set immutabile

Crea un `Set` di colori (`"rosso", "verde", "blu"`) con `Set.of()`.

* Stampa gli elementi.
* Verifica se contiene `"giallo"`.

---

## Esercizio 3 — Map immutabile

Crea una `Map<String, Integer>` con i prodotti e le scorte:

* `"Tavolo" → 10`, `"Sedia" → 5`, `"Lampada" → 3`.
  Stampa tutte le coppie chiave → valore.

---

## Esercizio 4 — Uso in metodi

Scrivi un metodo `stampaLista(List<String> lista)` e passagli una lista creata con `List.of("A","B","C")`.

---

## Esercizio 5 — Liste nidificate

Crea una lista di liste (`List<List<String>>`) con:

* `["Java","Python"]`
* `["C","C++"]`
  e stampala.

---

## Esercizio 6 — Map con più valori

Usa `Map.ofEntries(...)` per creare una mappa con coppie chiave → valore:

* `"Roma" → "Italia"`
* `"Parigi" → "Francia"`
* `"Berlino" → "Germania"`

👉 Hint: `Map.entry("Roma","Italia")`.

---

## Esercizio 7 — Confronto immutabile vs mutabile

Crea una lista con `List.of("x","y","z")` e una con `new ArrayList<>(List.of("x","y","z"))`.

* Aggiungi un elemento a entrambe e spiega la differenza.

---

## Esercizio 8 — Uso con Stream

Crea una lista `List.of(1,2,3,4,5)` e usa uno stream per calcolare la somma.

---

## Esercizio 9 — Immutabilità condivisa

Mostra che due variabili che puntano alla stessa `List.of(...)` non possono modificare il contenuto.

---

## Esercizio 10 — Factory Methods e metodo custom

Scrivi un metodo che prende in input una `List<String>` creata con `List.of(...)` e restituisce una **copia mutabile** con `new ArrayList<>(...)`.

