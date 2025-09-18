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

