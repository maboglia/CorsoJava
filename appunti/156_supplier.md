# 🔹 Cos’è un Supplier?

* È un’interfaccia funzionale **senza argomenti** che **restituisce un valore**.
* La sua definizione è:

```java
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
```

👉 È come una **fabbrica di oggetti/valori**: ogni volta che chiami `get()`, produce un risultato.

---

# 🔹 Quando usarlo?

Usalo quando:

* Non hai bisogno di input, ma vuoi ottenere un valore.
* Vuoi **ritardare la creazione** di un oggetto finché non serve.
* Vuoi **astrarre la logica di fornitura** (factory pattern funzionale).

---

# 🔹 Esempi pratici

## 1️⃣ Supplier con lambda

```java
Supplier<String> sup = () -> "Ciao dal Supplier!";
System.out.println(sup.get()); // Ciao dal Supplier!
```

---

## 2️⃣ Supplier con method reference

```java
Supplier<Date> nowSupplier = Date::new;
System.out.println(nowSupplier.get()); // stampa la data corrente
```

---

## 3️⃣ Supplier in combinazione con `Stream.generate()`

Perfetto per creare stream infiniti:

```java
Supplier<Double> randomSupplier = Math::random;

Stream.generate(randomSupplier)
      .limit(5)
      .forEach(System.out::println);
```

👉 Stampa 5 numeri casuali.

---

## 4️⃣ Uso in lazy initialization

```java
Supplier<List<String>> listaSupplier = ArrayList::new;

// la lista viene creata solo quando serve
List<String> lista = listaSupplier.get();
lista.add("Java");
System.out.println(lista); // [Java]
```

---

# 🔹 Differenza con altre interfacce

* `Supplier<T>` → prende **0 argomenti**, restituisce `T`.
* `Consumer<T>` → prende `T`, **non restituisce niente**.
* `Function<T,R>` → prende `T`, restituisce `R`.
* `Predicate<T>` → prende `T`, restituisce `boolean`.

---

# 🚀 Esempio completo

```java
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class SupplierDemo {
    public static void main(String[] args) {
        // 1. Supplier semplice
        Supplier<String> sup = () -> "Hello Supplier!";
        System.out.println(sup.get());

        // 2. Supplier con method reference
        Supplier<Date> now = Date::new;
        System.out.println(now.get());

        // 3. Supplier con Stream.generate
        Stream.generate(Math::random)
              .limit(3)
              .forEach(System.out::println);

        // 4. Supplier per creazione oggetti
        Supplier<List<String>> listaSup = ArrayList::new;
        List<String> l = listaSup.get();
        l.add("Java");
        l.add("Lambda");
        System.out.println(l);
    }
}
```

---

# 🔹 Esercizi su `Supplier`

### **Esercizio 1 – Supplier di costanti**

Crea un `Supplier<String>` che restituisca sempre la stringa `"Benvenuto in Java!"` e stampane il risultato chiamando più volte `get()`.

---

### **Esercizio 2 – Supplier di oggetti**

Definisci una classe `Prodotto` con campi `id` e `nome`.
Scrivi un `Supplier<Prodotto>` che generi un nuovo oggetto `Prodotto` ogni volta che viene chiamato `get()`.

---

### **Esercizio 3 – Supplier di numeri casuali**

Crea un `Supplier<Integer>` che fornisca numeri casuali da 1 a 10.
Usalo con `Stream.generate()` per stampare 5 numeri casuali.

---

### **Esercizio 4 – Lazy initialization**

Crea un `Supplier<List<String>>` che produca una nuova lista vuota.
Popola la lista solo al momento della prima chiamata e stampa il contenuto.

---

### **Esercizio 5 – Supplier con method reference**

Usa un `Supplier<Date>` con method reference (`Date::new`) per ottenere la data corrente.
Stampala tre volte in momenti diversi.

---

### **Esercizio 6 – Factory con Supplier**

Scrivi un metodo generico `creaOggetto(Supplier<T> sup)` che accetta un `Supplier<T>` e restituisce un nuovo oggetto di tipo `T`.
Provalo con diversi supplier (`ArrayList::new`, `HashSet::new`, ecc.).

---

### **Esercizio 7 – Supplier e Optional**

Crea un `Optional<String>` vuoto.
Usa `orElseGet(Supplier)` per fornire un valore di default tramite un `Supplier<String>`.

---

### **Esercizio 8 – Supplier di password random**

Scrivi un `Supplier<String>` che generi password casuali di 8 caratteri usando lettere e numeri.
Stampa 3 password generate.

---

### **Esercizio 9 – Catena di Supplier**

Crea un `Supplier<Integer>` che fornisce un numero casuale.
Poi un `Supplier<String>` che prende quel numero e lo trasforma in una stringa tipo `"Numero generato: X"`.
Stampalo.

---

### **Esercizio 10 – Cache con Supplier**

Implementa un `Supplier<Double>` che simula un calcolo pesante (es. `Math.random() * 1000` con `Thread.sleep(2000)`).
Ottimizzalo in modo che il valore venga calcolato **solo la prima volta**, e le volte successive venga restituito lo stesso risultato (memoization).

---

```java
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Prodotto {
    private static int counter = 1;
    private int id;
    private String nome;

    public Prodotto(String nome) {
        this.id = counter++;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Prodotto{id=" + id + ", nome='" + nome + "'}";
    }
}

public class SupplierEsercizi {
    public static void main(String[] args) {
        // Esercizio 1 – Supplier di costanti
        Supplier<String> supCostante = () -> "Benvenuto in Java!";
        System.out.println(supCostante.get());
        System.out.println(supCostante.get());

        // Esercizio 2 – Supplier di oggetti
        Supplier<Prodotto> supProdotto = () -> new Prodotto("Articolo");
        System.out.println(supProdotto.get());
        System.out.println(supProdotto.get());

        // Esercizio 3 – Supplier di numeri casuali
        Supplier<Integer> supRandom = () -> new Random().nextInt(10) + 1;
        Stream.generate(supRandom)
              .limit(5)
              .forEach(System.out::println);

        // Esercizio 4 – Lazy initialization
        Supplier<List<String>> listaSupplier = ArrayList::new;
        List<String> lista = listaSupplier.get();
        lista.add("Java");
        lista.add("Lambda");
        System.out.println(lista);

        // Esercizio 5 – Supplier con method reference
        Supplier<Date> dateSupplier = Date::new;
        System.out.println(dateSupplier.get());
        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
        System.out.println(dateSupplier.get());

        // Esercizio 6 – Factory con Supplier
        System.out.println(creaOggetto(ArrayList::new));
        System.out.println(creaOggetto(HashSet::new));

        // Esercizio 7 – Supplier e Optional
        Optional<String> opt = Optional.empty();
        String valore = opt.orElseGet(() -> "Valore di default da Supplier");
        System.out.println(valore);

        // Esercizio 8 – Supplier di password random
        Supplier<String> supPassword = () -> {
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            Random r = new Random();
            return IntStream.range(0, 8)
                    .mapToObj(i -> "" + chars.charAt(r.nextInt(chars.length())))
                    .collect(Collectors.joining());
        };
        System.out.println(supPassword.get());
        System.out.println(supPassword.get());
        System.out.println(supPassword.get());

        // Esercizio 9 – Catena di Supplier
        Supplier<Integer> numeroCasuale = () -> new Random().nextInt(100);
        Supplier<String> descrizione = () -> "Numero generato: " + numeroCasuale.get();
        System.out.println(descrizione.get());

        // Esercizio 10 – Cache con Supplier (memoization)
        Supplier<Double> heavyComputation = memoize(() -> {
            try {
                Thread.sleep(2000); // simula calcolo costoso
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return Math.random() * 1000;
        });

        System.out.println("Primo calcolo: " + heavyComputation.get()); // lento
        System.out.println("Secondo calcolo: " + heavyComputation.get()); // immediato
    }

    // Metodo generico per esercizio 6
    public static <T> T creaOggetto(Supplier<T> sup) {
        return sup.get();
    }

    // Funzione di memoization per esercizio 10
    public static <T> Supplier<T> memoize(Supplier<T> sup) {
        return new Supplier<>() {
            private T value;
            private boolean isComputed = false;

            @Override
            public T get() {
                if (!isComputed) {
                    value = sup.get();
                    isComputed = true;
                }
                return value;
            }
        };
    }
}

```