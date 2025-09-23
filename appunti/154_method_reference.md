Servono per scrivere codice più **compatto** e **leggibile**, quando una lambda si limita a **chiamare un metodo esistente**.

---

# 🔹 Cos’è un Method Reference?

I **Method Reference** sono un’estensione elegante delle **Lambda Expression** introdotte in **Java 8**.

Un **Method Reference** è una scorciatoia per scrivere una lambda che invoca direttamente un metodo già definito.
Invece di scrivere:

```java
list.forEach(s -> System.out.println(s));
```

possiamo scrivere:

```java
list.forEach(System.out::println);
```

---

# 🔹 Tipi di Method Reference

## 1️⃣ **Riferimento a un metodo statico**

Formato:

```java
ClassName::staticMethod
```

Esempio:

```java
List<Integer> numeri = Arrays.asList(1, 2, 3, 4);

numeri.forEach(System.out::println); // equivale a n -> System.out.println(n)
```

Altro esempio:

```java
Function<String, Integer> parser = Integer::parseInt;
System.out.println(parser.apply("42")); // 42
```

---

## 2️⃣ **Riferimento a un metodo di istanza di un oggetto**

Formato:

```java
object::instanceMethod
```

Esempio:

```java
String testo = "hello";
Supplier<String> sup = testo::toUpperCase;
System.out.println(sup.get()); // HELLO
```

---

## 3️⃣ **Riferimento a un metodo di istanza di un tipo arbitrario**

Formato:

```java
ClassName::instanceMethod
```

Usato quando lo stream fornisce l’oggetto target.

Esempio:

```java
List<String> parole = Arrays.asList("java", "lambda", "stream");

List<String> maiuscole = parole.stream()
                               .map(String::toUpperCase) // equivale a s -> s.toUpperCase()
                               .toList();

System.out.println(maiuscole); // [JAVA, LAMBDA, STREAM]
```

---

## 4️⃣ **Riferimento a un costruttore**

Formato:

```java
ClassName::new
```

Esempio:

```java
Supplier<List<String>> listaSupplier = ArrayList::new;
List<String> nuovaLista = listaSupplier.get();
```

Altro esempio con stream:

```java
List<String> copia = parole.stream()
                           .collect(Collectors.toCollection(ArrayList::new));
```

---

# 🔹 Quando usare Method Reference?

👉 Quando la **lambda chiama direttamente un metodo esistente** senza altra logica.
✔️ Più leggibile
✔️ Più conciso
✔️ Evita boilerplate

---

# 🔹 Esempio completo

```java
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> nomi = Arrays.asList("Anna", "Luca", "Marco");

        // Lambda classica
        nomi.forEach(n -> System.out.println(n));

        // Method reference (più compatto)
        nomi.forEach(System.out::println);

        // Mapping con metodo di istanza
        List<Integer> lunghezze = nomi.stream()
                                      .map(String::length)
                                      .toList();
        System.out.println(lunghezze); // [4, 4, 5]

        // Costruttore
        Supplier<List<String>> creaLista = ArrayList::new;
        List<String> listaVuota = creaLista.get();
        System.out.println(listaVuota.isEmpty()); // true
    }
}
```

---

## 📝 Esercizi sui Method Reference (tracce)

### **Esercizio 1 – Print con method reference**

Dato un `List<String>`, stampare tutti gli elementi usando un method reference invece di una lambda.

```java
List<String> nomi = Arrays.asList("Anna", "Luca", "Marco");
// TODO: usare System.out::println
```

---

### **Esercizio 2 – Static method reference**

Usa `Integer::parseInt` come method reference per trasformare una `List<String>` in una `List<Integer>`.

```java
List<String> numeriStr = Arrays.asList("1", "2", "3");
// TODO: trasformare in List<Integer>
```

---

### **Esercizio 3 – Instance method di un oggetto**

Crea una variabile `String s = "ciao";` e usa un method reference per ottenere `s.toUpperCase()` tramite un `Supplier<String>`.

```java
String s = "ciao";
// TODO: usare Supplier e s::toUpperCase
```

---

### **Esercizio 4 – Instance method di un tipo arbitrario**

Dato un `List<String>`, convertire ogni stringa in maiuscolo usando `String::toUpperCase`.

```java
List<String> parole = Arrays.asList("java", "lambda", "stream");
// TODO: usare .map(String::toUpperCase)
```

---

### **Esercizio 5 – Reference a costruttore**

Crea una nuova `ArrayList` usando `ArrayList::new` come `Supplier<List<String>>`.

```java
// TODO: creare Supplier<List<String>> con ArrayList::new
```

---

### **Esercizio 6 – Ordinamento con method reference**

Ordina una lista di stringhe usando `String::compareToIgnoreCase` invece di una lambda.

```java
List<String> nomi = Arrays.asList("mario", "Anna", "luca");
// TODO: ordinare usando List.sort con method reference
```

---

### **Esercizio 7 – ForEach su oggetto custom**

Crea una classe `Persona` con un metodo `saluta()` che stampa "Ciao, sono <nome>".
Dato un `List<Persona>`, stampare i saluti usando un method reference.

```java
// TODO: listaPersone.forEach(Persona::saluta)
```

