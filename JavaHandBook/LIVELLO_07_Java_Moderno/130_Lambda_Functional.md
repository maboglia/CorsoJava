# **Lambda Expressions** e **Functional Programming in Java**, introdotti con **Java 8**.

---

# Lambda Expressions

Una **lambda** è un “blocco di codice” che può essere passato come parametro.
Prima di Java 8, per passare una funzione bisognava usare classi anonime verbose:

```java
// Prima di Java 8
List<String> lista = Arrays.asList("cane", "gatto", "leone");

lista.sort(new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
});
```

Con le **lambda expressions**:

```java
// Con Java 8
List<String> lista = Arrays.asList("cane", "gatto", "leone");

lista.sort((a, b) -> a.compareTo(b));
```

---

# Functional Interfaces

Un’interfaccia con **un solo metodo astratto** può essere rappresentata da una lambda.
Java fornisce interfacce già pronte in `java.util.function`:

* `Predicate<T>` → ritorna `boolean`
* `Function<T, R>` → trasforma `T` in `R`
* `Consumer<T>` → esegue un’azione su `T`
* `Supplier<T>` → produce un valore `T`

Esempi:

```java
Predicate<String> nonVuota = s -> !s.isEmpty();
System.out.println(nonVuota.test("ciao")); // true

Function<String, Integer> lunghezza = s -> s.length();
System.out.println(lunghezza.apply("Java")); // 4

Consumer<String> stampa = s -> System.out.println("Ciao " + s);
stampa.accept("Mondo"); // Ciao Mondo

Supplier<Double> random = () -> Math.random();
System.out.println(random.get());
```

---

# Stream API + Lambda

Le lambda brillano davvero quando usate con gli **Stream** (programmazione funzionale):

```java
List<String> nomi = Arrays.asList("Luca", "Anna", "Marco", "Alessia");

List<String> filtrati = nomi.stream()
    .filter(n -> n.startsWith("A"))  // Predicate
    .map(String::toUpperCase)        // Function
    .sorted()                        // Comparator implicito
    .toList();

System.out.println(filtrati); // [ALESSIA, ANNA]
```

---

# Benefici per i junior

* **Meno codice boilerplate** → più leggibile.
* **Più vicino al “pensiero funzionale”** → cosa fare, non come farlo.
* **Composizione di operazioni** → con Stream possiamo concatenare trasformazioni.

---


# **Esercizi su Lambda & Functional Programming**

## Esercizio 1 — Filtrare una lista con `Predicate`

Crea una lista di numeri interi e stampa solo quelli **pari** usando una `lambda`.

👉 Hint: usa `List.of(...)` e `stream().filter(...)`.

---

## Esercizio 2 — Ordinare con `Comparator`

Hai una lista di stringhe. Ordinale:

1. per **lunghezza crescente**
2. per **ordine alfabetico inverso**

👉 Hint: usa `list.stream().sorted((a,b) -> ...)`.

---

## Esercizio 3 — Trasformazioni con `map`

Hai una lista di nomi. Trasforma tutti i nomi in **maiuscolo** e stampali.

👉 Hint: `stream().map(String::toUpperCase)`.

---

## Esercizio 4 — Somma con `reduce`

Calcola la somma di una lista di interi con `reduce`.

👉 Hint: `stream().reduce(0, (a,b) -> a+b)`.

---

## Esercizio 5 — Funzioni come parametri

Scrivi un metodo che accetta una `List<String>` e una `Function<String,String>` e applica quella funzione a tutti gli elementi.

Esempio d’uso:

```java
trasforma(List.of("ciao", "lambda"), s -> s.toUpperCase());
```

---

## Esercizio 6 — `Predicate` combinati

Data una lista di stringhe, filtra quelle che:

* hanno lunghezza > 3
* iniziano con la lettera "A"

👉 Hint: usa `Predicate<String>` e `.and(...)`.

---

## Esercizio 7 — Supplier & Random

Crea un `Supplier<Integer>` che genera un numero casuale tra 1 e 100.
Usalo per generare una lista di 5 numeri casuali.

👉 Hint: `Stream.generate(supplier).limit(5)`.

---

## Esercizio 8 — Consumer

Crea un `Consumer<String>` che stampa un messaggio in maiuscolo, e applicalo a una lista di parole.

👉 Hint: `forEach(consumer)`.

---

## Esercizio 9 — Interfaccia funzionale custom

Definisci un’interfaccia funzionale `Operazione` con un metodo `int esegui(int a, int b)`.
Usala per definire:

* somma: `(a,b) -> a+b`
* moltiplicazione: `(a,b) -> a*b`

---

## Esercizio 10 — Pipelines di operazioni

Data una lista di numeri, calcola la **media dei quadrati dei numeri pari**.

👉 Hint: `filter` → `map` → `mapToInt` → `average`.

---

