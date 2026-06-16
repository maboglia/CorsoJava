# Evoluzione di Java: principali novità da Java 8 a Java 26

Dalla versione 8, il linguaggio Java ha subito una trasformazione enorme: sintassi più moderna, maggiore produttività, migliori performance, supporto cloud-native, concorrenza semplificata e nuove funzionalità orientate ai dati e all’AI. ([docs.oracle.com][1])

---

# Java 8 (2014) — La rivoluzione moderna

## Novità principali

### Lambda Expressions

Permettono programmazione funzionale e codice più compatto.

```java
list.forEach(x -> System.out.println(x));
```

### Stream API

Elaborazione funzionale di collezioni.

```java
numeri.stream()
       .filter(n -> n > 10)
       .map(n -> n * 2)
       .forEach(System.out::println);
```

### Method Reference

```java
System.out::println
```

### Optional

Riduce i `NullPointerException`.

```java
Optional<String> nome = Optional.of("Mario");
```

### Nuova Date/Time API (`java.time`)

Sostituisce `Date` e `Calendar`.

```java
LocalDate.now();
```

### Interface Default Methods

```java
default void saluta() {
    System.out.println("Ciao");
}
```

---

# Java 9 (2017)

## Module System (Project Jigsaw)

Grande cambiamento architetturale. Introduce i moduli.

```java
module mio.modulo {
    requires java.sql;
}
```

## Factory Methods per Collections

```java
List.of("A", "B", "C");
Set.of(1,2,3);
```

## JShell

REPL interattiva per Java.

---

# Java 10 (2018)

## `var` — Type Inference Locale

```java
var nome = "Mario";
```

Java deduce automaticamente il tipo.

---

# Java 11 (LTS, 2018)

## Nuovi metodi String

```java
"isBlank()"
"lines()"
"repeat()"
```

## HTTP Client API

```java
HttpClient.newHttpClient();
```

## Lambda con `var`

```java
(var x, var y) -> x + y
```

---

# Java 12–13

## Switch Expressions (preview)

```java
var risultato = switch(giorno) {
    case "LUN" -> 1;
    default -> 0;
};
```

---

# Java 14

## Switch Expressions definitive

([docs.oracle.com][1])

## Helpful NullPointerException

Messaggi di errore molto più chiari.

---

# Java 15

## Text Blocks

Stringhe multilinea leggibili.

```java
String sql = """
    SELECT *
    FROM utenti
    WHERE id = 1
""";
```

([docs.oracle.com][1])

---

# Java 16

## Record

Classe immutabile automatica.

```java
public record Persona(String nome, int eta) {}
```

## Pattern Matching per `instanceof`

```java
if(obj instanceof String s) {
    System.out.println(s.length());
}
```

([docs.oracle.com][1])

---

# Java 17 (LTS, 2021)

## Sealed Classes

```java
public sealed class Animale
    permits Cane, Gatto {}
```

Controlla quali classi possono estendere una classe.

## Miglioramenti performance e sicurezza

## Forte adozione enterprise

Molte aziende sono migrate direttamente da Java 8 → 17.

([docs.oracle.com][1])

---

# Java 18–19

## UTF-8 di default

## Virtual Threads (preview)

Inizio del progetto Loom.

```java
Thread.startVirtualThread(() -> {
    System.out.println("Hello");
});
```

## Structured Concurrency (preview)

---

# Java 20

## Continuano

* Virtual Threads
* Record Patterns
* Pattern Matching

---

# Java 21 (LTS, 2023)

Una delle release più importanti dopo Java 8.

## Virtual Threads definitive

Concorrenza leggera e scalabile.

```java
try(var executor = Executors.newVirtualThreadPerTaskExecutor()) {
    executor.submit(() -> lavoro());
}
```

## Record Patterns

```java
if(obj instanceof Punto(int x, int y)) {
    System.out.println(x);
}
```

## Pattern Matching for Switch

```java
switch(obj) {
    case String s -> System.out.println(s);
    case Integer i -> System.out.println(i);
    default -> {}
}
```

## Sequenced Collections

([docs.oracle.com][1])

---

# Java 22

## Unnamed Variables e Patterns

```java
for(var _ : lista) {
    System.out.println("ciao");
}
```

## Migliorie Panama e Foreign Memory API

([docs.oracle.com][1])

---

# Java 23–25

## Evoluzione continua di

* Pattern Matching
* Primitive Types
* Vector API
* Structured Concurrency
* AI support
* Performance JVM

## Java 25 (LTS)

### Module Import Declarations

```java
import module java.sql;
```

### Compact Source Files

```java
void main() {
    System.out.println("Hello");
}
```

Perfetto per studenti e piccoli programmi.

([docs.oracle.com][1])

---

# Java 26 (2026)

## HTTP/3 Support

Supporto moderno per reti e microservizi.

## Rimozione definitiva Applet API

Le applet vengono eliminate completamente.

## Primitive Types in Pattern Matching

```java
switch(x) {
    case int i -> ...
}
```

## Migliorie G1 Garbage Collector

## Vector API avanzata

## Structured Concurrency migliorata

## AOT Object Caching

([InfoWorld][2])

---

# Le innovazioni più importanti dell’era moderna di Java

| Area                      | Novità                   |
| ------------------------- | ------------------------ |
| Programmazione funzionale | Lambda, Stream API       |
| Sintassi moderna          | `var`, Text Blocks       |
| Data-oriented programming | Record, Pattern Matching |
| Architettura              | Moduli                   |
| Concorrenza               | Virtual Threads          |
| Sicurezza                 | Strong encapsulation     |
| Performance               | Nuovi GC, Vector API     |
| Cloud & Microservizi      | HTTP Client, HTTP/3      |
| Semplificazione           | Compact source files     |

---

# Versioni LTS fondamentali

| Versione | Stato                        |
| -------- | ---------------------------- |
| Java 8   | Storica, ancora diffusissima |
| Java 11  | Prima LTS moderna            |
| Java 17  | LTS enterprise molto usata   |
| Java 21  | LTS attuale consigliata      |
| Java 25  | Nuova LTS                    |

---

# Migrazione tipica nelle aziende

Molte aziende:

* sono rimaste anni su Java 8;
* poi sono migrate direttamente a Java 17 o 21;
* oggi usano Java soprattutto per:

  * backend enterprise;
  * microservizi;
  * cloud;
  * sistemi ad alte prestazioni.

La community segnala che il passaggio 8 → 11 è stato il più delicato per via dei moduli e dell’incapsulamento delle API interne. ([Reddit][3])

---

# Conclusione

Dal Java 8 al Java 26 il linguaggio è diventato:

* più semplice;
* più espressivo;
* più funzionale;
* più veloce;
* più adatto al cloud;
* più competitivo rispetto a Kotlin, Go e C#.

Le innovazioni più impattanti sono state:

* Lambda + Stream API;
* Record;
* Pattern Matching;
* Virtual Threads;
* nuova concorrenza Project Loom;
* modernizzazione della JVM e del networking.

Per chi studia Java oggi, le versioni più importanti da conoscere sono:

* Java 8 (fondamenta moderne)
* Java 17 (enterprise)
* Java 21 (stato dell’arte attuale).

[1]: https://docs.oracle.com/en/java/javase/26/language/java-language-changes-summary.html?utm_source=chatgpt.com "Java Language Changes Summary"
[2]: https://www.infoworld.com/article/4050993/jdk-26-the-new-features-in-java-26.html?utm_source=chatgpt.com "JDK 26: The new features in Java 26 | InfoWorld"
[3]: https://www.reddit.com/r/programming/comments/bt8dcq?utm_source=chatgpt.com "Upgrading from Java 8 to Java 12"
