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


# **Esercizi su Stream API**

---

## Esercizio 1 — Filtrare numeri

Data una lista di numeri interi, usa gli **Stream** per stampare solo i numeri **pari**.

👉 Hint: `stream().filter(n -> n % 2 == 0).forEach(System.out::println)`

---

## Esercizio 2 — Trasformare stringhe

Hai una lista di stringhe. Convertile tutte in **maiuscolo** e stampale.

👉 Hint: `map(String::toUpperCase)`

---

## Esercizio 3 — Ordinare

Ordina una lista di numeri:

1. in ordine crescente
2. in ordine decrescente

👉 Hint: `sorted()`, `sorted(Comparator.reverseOrder())`

---

## Esercizio 4 — Somma

Calcola la somma dei numeri in una lista.

👉 Hint: `mapToInt(Integer::intValue).sum()`

---

## Esercizio 5 — Media

Data una lista di voti, calcola la **media**.

👉 Hint: `mapToInt(...).average()`

---

## Esercizio 6 — Prima occorrenza

Trova il **primo numero maggiore di 50** in una lista.

👉 Hint: `filter(...).findFirst()`

---

## Esercizio 7 — Conteggio

Conta quanti nomi nella lista iniziano con la lettera `"A"`.

👉 Hint: `filter(...).count()`

---

## Esercizio 8 — Collezionare in Set

Data una lista con elementi duplicati, raccogli i valori unici in un `Set`.

👉 Hint: `collect(Collectors.toSet())`

---

## Esercizio 9 — Raggruppamento

Hai una lista di parole. Raggruppale per **lunghezza** in una `Map<Integer, List<String>>`.

👉 Hint: `collect(Collectors.groupingBy(String::length))`

---

## Esercizio 10 — FlatMap

Hai una lista di frasi (`List<String>`). Ottieni la lista di **tutte le parole** (splittando sugli spazi).

👉 Hint: `flatMap(s -> Arrays.stream(s.split(" ")))`

---

## Esercizio 11 — Max e Min

Trova il numero **più grande** e quello **più piccolo** in una lista.

👉 Hint: `max(Comparator.naturalOrder())`, `min(...)`

---

## Esercizio 12 — Riduzione custom

Data una lista di stringhe, concatenale tutte in una sola stringa separata da virgole.

👉 Hint: `reduce("", (a,b) -> a.isEmpty()? b : a + "," + b)`

---

## Esercizio 13 — Operazioni parallele

Crea una lista di numeri grandi e calcola la loro somma usando uno **stream parallelo**.

👉 Hint: `parallelStream()`

---

## Esercizio 14 — anyMatch / allMatch / noneMatch

Data una lista di numeri:

* verifica se **almeno uno** è negativo
* verifica se **tutti** sono positivi
* verifica se **nessuno** è uguale a zero

👉 Hint: `anyMatch`, `allMatch`, `noneMatch`

---

## Esercizio 15 — Pipeline completa

Data una lista di numeri:

1. tieni solo i numeri dispari
2. calcola il loro quadrato
3. ordina i risultati
4. raccogli in una lista

👉 Hint: `filter → map → sorted → collect(Collectors.toList())`

