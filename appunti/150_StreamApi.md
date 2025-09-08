# 🔹 Cos’è uno Stream?

Uno **Stream** è una sequenza di dati su cui si possono applicare operazioni **in stile funzionale** (map, filter, reduce…).
⚠️ **Attenzione**: uno stream **non modifica** la collezione originale → crea un “flusso di trasformazioni”.

---

# 🔹 Creare uno Stream

```java
List<String> lista = Arrays.asList("Luca", "Anna", "Marco");

// Da collezione
Stream<String> stream1 = lista.stream();

// Da array
Stream<Integer> stream2 = Arrays.stream(new Integer[]{1, 2, 3});

// Diretto
Stream<String> stream3 = Stream.of("a", "b", "c");
```

---

# 🔹 Operazioni sugli Stream

Gli stream hanno due tipi di operazioni:

* **Intermedie** → trasformano (ritornano un altro Stream).
* **Terminali** → producono un risultato (lista, somma, stampa…).

---

## ✅ Operazioni intermedie

```java
List<String> nomi = Arrays.asList("Luca", "Anna", "Marco", "Alessia");

nomi.stream()
    .filter(n -> n.startsWith("A"))   // Seleziona nomi con A
    .map(String::toUpperCase)         // Trasforma in maiuscolo
    .sorted()                         // Ordina alfabeticamente
    .forEach(System.out::println);    // Terminale: stampa
```

**Output:**

```
ALESSIA
ANNA
```

---

## ✅ Operazioni terminali

### `collect()`

```java
List<String> lista = Arrays.asList("a", "bb", "ccc");

List<Integer> lunghezze = lista.stream()
    .map(String::length)
    .collect(Collectors.toList());

System.out.println(lunghezze); // [1, 2, 3]
```

---

### `reduce()`

Per accumulare valori (somma, concatenazione, ecc.).

```java
List<Integer> numeri = Arrays.asList(1, 2, 3, 4, 5);

int somma = numeri.stream()
    .reduce(0, (a, b) -> a + b);

System.out.println(somma); // 15
```

---

### `anyMatch`, `allMatch`, `noneMatch`

```java
List<String> nomi = Arrays.asList("Luca", "Anna", "Marco");

boolean qualcunoConA = nomi.stream().anyMatch(n -> n.startsWith("A"));
System.out.println(qualcunoConA); // true

boolean tuttiConA = nomi.stream().allMatch(n -> n.startsWith("A"));
System.out.println(tuttiConA); // false
```

---

## ✅ Parallel Streams

Facile parallelizzare operazioni (⚠️ utile solo con dataset grandi).

```java
List<Integer> numeri = IntStream.rangeClosed(1, 1_000_000).boxed().toList();

int somma = numeri.parallelStream().reduce(0, Integer::sum);

System.out.println(somma); // 500000500000
```

---

# 🔹 Benefici per i junior

* **Codice più leggibile** rispetto ai `for`.
* **Operazioni dichiarative** (“cosa fare” invece di “come fare”).
* **Facile parallelizzare**.
* Si integra con **lambda** e **Optional**.

---

