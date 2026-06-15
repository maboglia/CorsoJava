# 🏗️ **Collectors in Java**

📌 `Collectors` è una classe utility che fornisce metodi statici per ridurre (cioè **collezionare**) gli elementi di uno **Stream** in una struttura di dati o in un singolo risultato.
La firma tipica è:

```java
<R, A> Collector<T, A, R>
```

dove:

* `T` = tipo degli elementi nello stream
* `A` = tipo dell’accumulatore intermedio
* `R` = tipo del risultato finale

---

## 🔹 1. **toList / toSet / toCollection**

Raccoglie gli elementi in una lista, un set o una collezione specifica.

```java
List<String> nomi = Stream.of("Anna", "Luca", "Marco")
                          .collect(Collectors.toList());

Set<String> unici = Stream.of("A", "B", "A")
                          .collect(Collectors.toSet());

LinkedList<String> linked = Stream.of("uno", "due", "tre")
                          .collect(Collectors.toCollection(LinkedList::new));
```

---

## 🔹 2. **joining**

Concatena stringhe con delimitatori, prefissi e suffissi.

```java
String unito = Stream.of("Java", "Scala", "Kotlin")
                     .collect(Collectors.joining(", "));
// Risultato: "Java, Scala, Kotlin"
```

Con prefisso/suffisso:

```java
String unito = Stream.of("A", "B", "C")
                     .collect(Collectors.joining(" - ", "[", "]"));
// Risultato: [A - B - C]
```

---

## 🔹 3. **counting**

Conta gli elementi.

```java
long totale = Stream.of(1, 2, 3, 4, 5)
                    .collect(Collectors.counting());
// Risultato: 5
```

---

## 🔹 4. **summing / averaging**

Somma o calcola la media di campi numerici.

```java
int somma = Stream.of(1, 2, 3)
                  .collect(Collectors.summingInt(Integer::intValue));

double media = Stream.of(10, 20, 30)
                     .collect(Collectors.averagingDouble(Integer::doubleValue));
```

---

## 🔹 5. **summarizing**

Restituisce statistiche (conteggio, somma, min, max, media).

```java
IntSummaryStatistics stats = Stream.of(1, 2, 3, 4, 5)
                                   .collect(Collectors.summarizingInt(Integer::intValue));

System.out.println(stats.getAverage()); // 3.0
System.out.println(stats.getMax());     // 5
System.out.println(stats.getMin());     // 1
```

---

## 🔹 6. **groupingBy**

Raggruppa gli elementi in una mappa.

```java
Map<Integer, List<String>> byLength =
    Stream.of("Java", "Go", "Python", "C")
          .collect(Collectors.groupingBy(String::length));

/*
Risultato:
2 -> [Go, C]
4 -> [Java]
6 -> [Python]
*/
```

Può avere un secondo collector annidato:

```java
Map<Integer, Long> contaPerLunghezza =
    Stream.of("Java", "Go", "Python", "C", "C++", "PHP")
          .collect(Collectors.groupingBy(String::length, Collectors.counting()));
```

---

## 🔹 7. **partitioningBy**

Divide in due gruppi (true/false) in base a un predicato.

```java
Map<Boolean, List<Integer>> partizione =
    Stream.of(1, 2, 3, 4, 5, 6)
          .collect(Collectors.partitioningBy(n -> n % 2 == 0));

/*
Risultato:
true -> [2, 4, 6]
false -> [1, 3, 5]
*/
```

---

## 🔹 8. **toMap**

Raccoglie elementi in una mappa.

```java
Map<Integer, String> mappa =
    Stream.of("A", "BB", "CCC")
          .collect(Collectors.toMap(String::length, s -> s));
// Attenzione: errore se ci sono chiavi duplicate!
```

Per risolvere i conflitti (chiavi duplicate):

```java
Map<Integer, String> mappa = 
    Stream.of("A", "BB", "CC")
          .collect(Collectors.toMap(
              String::length,
              s -> s,
              (s1, s2) -> s1 + "," + s2
          ));
```

---

## 🔹 9. **collectingAndThen**

Permette di applicare una trasformazione finale.

```java
List<String> immutabile = 
    Stream.of("x", "y", "z")
          .collect(Collectors.collectingAndThen(
              Collectors.toList(),
              Collections::unmodifiableList
          ));
```

---

##  In sintesi

* **Collezioni** → `toList`, `toSet`, `toMap`, `toCollection`
* **Stringhe** → `joining`
* **Numeri** → `counting`, `summing`, `averaging`, `summarizing`
* **Raggruppamenti** → `groupingBy`, `partitioningBy`
* **Post-elaborazioni** → `collectingAndThen`

---

## **tabella riassuntiva** dei metodi più utili della classe `Collectors`

---

| Metodo `Collectors`                                           | Cosa fa                                                                           | Esempio mini one-liner                                                                                                                        |
| ------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `toList()`                                                    | Colleziona gli elementi dello stream in una `List`                                | `List<String> lista = stream.collect(Collectors.toList());` ([Oracle Documentation][1])                                                       |
| `toSet()`                                                     | Colleziona elementi unici in un `Set`                                             | `Set<Integer> set = stream.collect(Collectors.toSet());` ([GeeksforGeeks][2])                                                                 |
| `toCollection(...)`                                           | Colleziona in una collezione specificata (es. `LinkedList`, `TreeSet`)            | `List<String> linked = stream.collect(Collectors.toCollection(LinkedList::new));` ([Oracle Documentation][1])                                 |
| `joining()`                                                   | Concatena stringhe, con o senza delimitatore / prefisso / suffisso                | `String s = names.stream().collect(Collectors.joining(", "));` ([GeeksforGeeks][2])                                                           |
| `counting()`                                                  | Conta il numero di elementi nello stream                                          | `long n = stream.collect(Collectors.counting());` ([GeeksforGeeks][3])                                                                        |
| `summingInt(...)` / `summingLong(...)` / `summingDouble(...)` | Somma valori derivati dagli elementi                                              | `int sum = stream.collect(Collectors.summingInt(String::length));` ([Medium][4])                                                              |
| `averagingInt(...)` / `averagingDouble(...)`                  | Calcola la media dei valori derivati                                              | `double media = stream.collect(Collectors.averagingInt(Integer::intValue));` ([Oracle Documentation][1])                                      |
| `summarizingInt(...)` / `summarizingDouble(...)`              | Statistiche (min, max, somma, media, conteggio) in un oggetto `SummaryStatistics` | `IntSummaryStatistics stats = stream.collect(Collectors.summarizingInt(Integer::intValue));` ([java67.com][5])                                |
| `groupingBy(...)`                                             | Raggruppa gli elementi in base ad una funzione classificatrice, produce una `Map` | `Map<Integer,List<String>> m = stream.collect(Collectors.groupingBy(String::length));` ([java67.com][5])                                      |
| `partitioningBy(...)`                                         | Divide lo stream in due gruppi (predicato vero/falso)                             | `Map<Boolean,List<Integer>> p = stream.collect(Collectors.partitioningBy(n -> n % 2 == 0));` ([java67.com][5])                                |
| `toMap(keyMapper, valueMapper)`                               | Costruisce una mappa dagli elementi usando mappatori per chiave e valore          | `Map<String,Integer> m = stream.collect(Collectors.toMap(s->s, String::length));` ([GeeksforGeeks][6])                                        |
| `toMap(..., mergeFunction)`                                   | Come sopra, ma risolve conflitti di chiave con `mergeFunction`                    | `Map<String,Integer> m = stream.collect(Collectors.toMap(k->k, v->1, Integer::sum));` ([GeeksforGeeks][6])                                    |
| `collectingAndThen(downstream, finisher)`                     | Applica un collector, poi una trasformazione finale sul risultato                 | `List<String> immut = stream.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));` ([GeeksforGeeks][7]) |
| `reducing(...)`                                               | Riduce gli elementi con un `BinaryOperator` (es. max / min / custom)              | `Optional<Tipo> max = stream.collect(Collectors.reducing(BinaryOperator.maxBy(Comparator.naturalOrder())));` ([Oracle Documentation][8])      |

---


[1]: https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html?utm_source=chatgpt.com "Collectors (Java Platform SE 8 )"
[2]: https://www.geeksforgeeks.org/java-collectors/?utm_source=chatgpt.com "Java Collectors - GeeksforGeeks"
[3]: https://www.geeksforgeeks.org/java-8-collectors-counting-with-examples/?utm_source=chatgpt.com "Java 8 | Collectors counting() with Examples - GeeksforGeeks"
[4]: https://nicksamoylov.medium.com/java-streams-27-collect-3-collectors-summing-averaging-and-summarizing-302b4e200b70?utm_source=chatgpt.com "Java streams 27. Collect 3. Collectors summing, averaging, and summarizing. | by Nick Samoylov | Medium"
[5]: https://www.java67.com/2018/11/10-examples-of-collectors-in-java-8.html?utm_source=chatgpt.com "10 Examples of Collectors + Stream in Java 8 - groupingBy(), toList(), toMap() | Java67"
[6]: https://www.geeksforgeeks.org/collectors-tomap-method-in-java-with-examples/?utm_source=chatgpt.com "Collectors toMap() method in Java with Examples - GeeksforGeeks"
[7]: https://www.geeksforgeeks.org/collectors-collectingandthen-method-in-java-with-examples/?utm_source=chatgpt.com "Collectors collectingAndThen() method in Java with Examples - GeeksforGeeks"
[8]: https://docs.oracle.com/javase/9/docs/api///java/util/stream/Collectors.html?utm_source=chatgpt.com "Collectors (Java SE 9 & JDK 9 )"

---

Dopo **Java 8**, sono stati introdotti alcuni **nuovi Collectors** che arricchiscono la Stream API.

---

| Metodo `Collectors`                | Da Java     | Cosa fa                                                          | Esempio mini one-liner                                                                                                                                           |
| ---------------------------------- | ----------- | ---------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `filtering(predicate, downstream)` | **Java 9**  | Filtra elementi prima di passarli a un collector downstream      | `Map<Integer,List<String>> m = stream.collect(Collectors.groupingBy(String::length, Collectors.filtering(s -> s.startsWith("J"), Collectors.toList())));`        |
| `flatMapping(mapper, downstream)`  | **Java 9**  | Applica un mapping che restituisce uno stream e poi lo raccoglie | `Map<Integer,List<String>> m = stream.collect(Collectors.groupingBy(String::length, Collectors.flatMapping(s -> Stream.of(s.split("")), Collectors.toList())));` |
| `teeing(c1, c2, merger)`           | **Java 12** | Combina i risultati di due collectors in uno solo                | `double media = stream.collect(Collectors.teeing(Collectors.summingInt(Integer::intValue), Collectors.counting(), (sum, count) -> sum / (double) count));`       |
