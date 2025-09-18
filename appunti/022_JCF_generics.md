# 🔹 Cos’è un Generic?

I **Generics** permettono di scrivere classi, interfacce e metodi che funzionano con **tipi diversi**, mantenendo la **sicurezza di tipo** e senza dover fare cast espliciti.

I **Generics** sono stati introdotti in Java 5, ma sono fondamentali per capire bene tutte le API moderne (Collections, Stream, Optional, ecc.).

👉 Prima dei Generics (Java 1.4):

```java
List lista = new ArrayList();
lista.add("Ciao");
String s = (String) lista.get(0); // serve il cast!
```

👉 Con i Generics (Java 5+):

```java
List<String> lista = new ArrayList<>();
lista.add("Ciao");
String s = lista.get(0); // niente cast, più sicuro
```

---

# 🔹 Tipi di uso dei Generics

## 1️⃣ Classi e interfacce generiche

```java
class Box<T> {  // T = "type parameter"
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}

// Uso
Box<String> b1 = new Box<>();
b1.set("Hello");
System.out.println(b1.get()); // Hello

Box<Integer> b2 = new Box<>();
b2.set(123);
System.out.println(b2.get()); // 123
```

---

## 2️⃣ Metodi generici

Un metodo può essere parametrizzato indipendentemente dalla classe in cui si trova.

```java
public static <T> void stampaArray(T[] array) {
    for (T elem : array) {
        System.out.println(elem);
    }
}

public static void main(String[] args) {
    String[] nomi = {"Anna", "Luca"};
    Integer[] numeri = {1, 2, 3};

    stampaArray(nomi);    // funziona con String
    stampaArray(numeri);  // funziona con Integer
}
```

---

## 3️⃣ Generics con bounded type

Possiamo **limitare i tipi ammessi**.

```java
class MathBox<T extends Number> {
    private T numero;

    public MathBox(T numero) { this.numero = numero; }
    public double getDoppio() {
        return numero.doubleValue() * 2;
    }
}

// Uso
MathBox<Integer> iBox = new MathBox<>(10);
System.out.println(iBox.getDoppio()); // 20.0

// MathBox<String> sBox = new MathBox<>("ciao"); ❌ ERRORE: String non estende Number
```

---

## 4️⃣ Wildcards (`?`)

Le wildcards permettono flessibilità nei metodi.

* `?` → tipo sconosciuto
* `? extends T` → sottotipi di T
* `? super T` → supertipi di T

Esempio:

```java
public static void stampaLista(List<?> lista) {
    for (Object o : lista) {
        System.out.println(o);
    }
}

List<String> s = Arrays.asList("uno", "due");
stampaLista(s); // funziona
```

Con `extends`:

```java
public static double somma(List<? extends Number> lista) {
    double totale = 0;
    for (Number n : lista) {
        totale += n.doubleValue();
    }
    return totale;
}

List<Integer> interi = Arrays.asList(1, 2, 3);
System.out.println(somma(interi)); // 6.0
```

---

## 5️⃣ Diamond operator (`<>`)

Introdotto in **Java 7**, permette di evitare ripetizioni.

```java
Map<String, List<Integer>> mappa = new HashMap<>(); // senza ripetere i tipi
```

---

# 🚀 Esempio completo

```java
import java.util.*;

class Box<T> {
    private T value;
    public Box(T value) { this.value = value; }
    public T get() { return value; }
}

public class GenericsDemo {
    public static <T> void stampaArray(T[] arr) {
        for (T elem : arr) {
            System.out.println(elem);
        }
    }

    public static double somma(List<? extends Number> lista) {
        return lista.stream().mapToDouble(Number::doubleValue).sum();
    }

    public static void main(String[] args) {
        // Classe generica
        Box<String> b1 = new Box<>("Ciao");
        System.out.println(b1.get());

        Box<Integer> b2 = new Box<>(42);
        System.out.println(b2.get());

        // Metodo generico
        String[] parole = {"Java", "Generics"};
        stampaArray(parole);

        // Bounded type
        List<Double> decimali = Arrays.asList(1.5, 2.5, 3.0);
        System.out.println("Somma: " + somma(decimali));
    }
}
```

---

## Esercizi sui Generics

---

### **Esercizio 1 – Box generico**

Crea una classe `Box<T>` che possa contenere un valore di tipo generico.

* Scrivi metodi `set` e `get`.
* Crea un `Box<String>` e un `Box<Integer>` e stampa i valori.

---

### **Esercizio 2 – Metodo generico stampaArray**

Scrivi un metodo generico `stampaArray(T[] array)` che stampi qualsiasi array passato in input.

* Testalo con un array di `String` e uno di `Integer`.

---

### **Esercizio 3 – MathBox con bounded types**

Crea una classe `MathBox<T extends Number>` che:

* memorizza un numero `T`
* ha un metodo `double getQuadrato()` che restituisce il quadrato del numero.
  Prova a usare sia `Integer` che `Double`.

---

### **Esercizio 4 – Wildcard ?**

Scrivi un metodo `stampaLista(List<?> lista)` che accetta una lista di qualsiasi tipo e stampa gli elementi.
Testalo con una `List<String>` e una `List<Integer>`.

---

### **Esercizio 5 – Somma con extends**

Scrivi un metodo `somma(List<? extends Number> lista)` che restituisce la somma dei numeri contenuti in una lista.
Testalo con `List<Integer>` e `List<Double>`.

---

### **Esercizio 6 – Copia con super**

Scrivi un metodo `copia(List<? super Integer> destinazione, List<Integer> sorgente)` che copi tutti gli elementi dalla sorgente alla destinazione.
Testalo con:

```java
List<Number> numeri = new ArrayList<>();
List<Integer> interi = Arrays.asList(1,2,3);
copia(numeri, interi);
```

---

### **Esercizio 7 – Pair\<K,V>**

Crea una classe generica `Pair<K,V>` con due campi chiave/valore e un metodo `toString()`.
Crea:

* `Pair<String, Integer>` con nome ed età
* `Pair<String, String>` con username e password

---

### **Esercizio 8 – Repository generico**

Crea un’interfaccia generica `Repository<T>` con i metodi `save(T t)` e `List<T> findAll()`.
Implementala con una classe `InMemoryRepository<T>`.
Testala con oggetti `String` e `Integer`.

---

### **Esercizio 9 – Stack<T>**

Implementa una classe generica `Stack<T>` con metodi `push`, `pop` e `isEmpty()`.
Testala con `Integer` e `String`.

---

### **Esercizio 10 – Uso con Stream**

Scrivi un metodo generico che prenda una `List<T>` e restituisca una nuova lista con gli elementi trasformati in stringhe.
Suggerimento: usa `stream().map(Object::toString).toList()`.

