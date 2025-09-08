# Cos’è il Pattern Matching?

Il **Pattern Matching** permette di **verificare il tipo di un oggetto** e contemporaneamente **estrarne il valore** senza dover fare il classico cast manuale.

* Riduce il **boilerplate** di `instanceof` + cast.
* Si integra bene con `switch` e `instanceof`.

---

## Esempio classico (prima del pattern matching)

```java
Object obj = "Ciao";

if (obj instanceof String) {
    String s = (String) obj;  // cast obbligatorio
    System.out.println(s.toUpperCase());
}
```

---

## Con Pattern Matching

```java
Object obj = "Ciao";

if (obj instanceof String s) {
    System.out.println(s.toUpperCase());
}
```

* Qui `s` è **automaticamente disponibile** nel blocco `if`.
* Non serve fare il cast manualmente.

---

## Pattern Matching con switch (Java 17+)

```java
Object obj = 123;

String result = switch (obj) {
    case String s -> "Stringa di lunghezza " + s.length();
    case Integer i -> "Numero pari? " + (i % 2 == 0);
    default -> "Altro tipo";
};

System.out.println(result); // Numero pari? true
```

* Lo switch **ritorna un valore** direttamente.
* Si possono combinare più pattern.

---

## Pattern Matching con Record

Se hai un **record**, puoi “scomporlo” con pattern matching:

```java
public record Punto(int x, int y) {}

Object p = new Punto(3, 5);

if (p instanceof Punto(int a, int b)) {
    System.out.println("x=" + a + ", y=" + b);
}
```

* Qui estrai direttamente i campi del record senza scrivere getter.

---

## Benefici principali

* **Riduce codice boilerplate** (cast e `instanceof`).
* **Più leggibile** e sicuro.
* Facilita la combinazione con **Records** e **Switch Expressions**.
* Passaggio fondamentale verso uno **stile più funzionale e dichiarativo** in Java.

