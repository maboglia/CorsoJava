# **Lambda Expressions** e **Functional Programming in Java**, introdotti con **Java 8**.

---

# 🔹 Lambda Expressions

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

# 🔹 Functional Interfaces

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

# 🔹 Stream API + Lambda

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

# 🔹 Benefici per i junior

* **Meno codice boilerplate** → più leggibile.
* **Più vicino al “pensiero funzionale”** → cosa fare, non come farlo.
* **Composizione di operazioni** → con Stream possiamo concatenare trasformazioni.

---

