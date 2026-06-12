# 🔹 Perché Optional?

In Java il problema storico è la **NullPointerException (NPE)**.
Prima di Java 8 si faceva così:

```java
String nome = getNomeUtente();
if (nome != null) {
    System.out.println(nome.toUpperCase());
} else {
    System.out.println("Nessun nome disponibile");
}
```

Con `Optional` possiamo incapsulare il valore e gestirlo in stile **funzionale**.

---

# 🔹 Creazione di un Optional

```java
Optional<String> nome1 = Optional.of("Mario");      // valore presente
Optional<String> nome2 = Optional.empty();          // vuoto
Optional<String> nome3 = Optional.ofNullable(null); // può essere null
```

---

# 🔹 Metodi principali

### ✅ `isPresent` / `ifPresent`

```java
Optional<String> nome = Optional.of("Anna");

if (nome.isPresent()) {
    System.out.println(nome.get()); // Anna
}

// Più elegante
nome.ifPresent(n -> System.out.println("Ciao " + n)); // Ciao Anna
```

---

### ✅ `orElse` / `orElseGet` / `orElseThrow`

```java
String nome1 = Optional.of("Luca").orElse("Sconosciuto"); 
System.out.println(nome1); // Luca

String nome2 = Optional.empty().orElse("Sconosciuto");
System.out.println(nome2); // Sconosciuto

String nome3 = Optional.empty().orElseGet(() -> "Generato al volo");
System.out.println(nome3); // Generato al volo

String nome4 = Optional.empty().orElseThrow(() -> new RuntimeException("Nome mancante"));
```

---

### ✅ `map` e `flatMap`

Trasformazioni senza dover gestire manualmente `null`.

```java
Optional<String> nome = Optional.of("mario");

// Applica una funzione se presente
Optional<String> upper = nome.map(String::toUpperCase);
System.out.println(upper.get()); // MARIO

// Evita annidamenti con flatMap
Optional<Integer> lunghezza = nome.flatMap(n -> Optional.of(n.length()));
System.out.println(lunghezza.get()); // 5
```

---

# 🔹 Uso tipico in una funzione

```java
public Optional<String> trovaUtentePerId(int id) {
    if (id == 1) {
        return Optional.of("Alice");
    }
    return Optional.empty();
}

// Utilizzo
String utente = trovaUtentePerId(1).orElse("Sconosciuto");
System.out.println(utente); // Alice

String utente2 = trovaUtentePerId(99).orElse("Sconosciuto");
System.out.println(utente2); // Sconosciuto
```

---

# 🔹 Benefici per i junior

* Riduce drasticamente i `NullPointerException`.
* Esplicita che un valore **può non esserci**.
* Si integra bene con lo stile **funzionale** (`map`, `filter`, `flatMap`).


---

# **Esercizi su `Optional`**

---

## Esercizio 1 — Creazione di `Optional`

Crea un `Optional<String>` da una variabile che può essere `null`.

* Stampa il contenuto se presente.
* In caso contrario stampa `"Valore assente"`.

👉 Hint: `Optional.ofNullable(...)`, `ifPresentOrElse`.

---

## Esercizio 2 — `Optional.orElse`

Crea un metodo `String leggiNome(String input)` che restituisce:

* il nome (`input`) se non è `null`
* `"Sconosciuto"` se è `null`.

👉 Hint: `Optional.ofNullable(input).orElse("Sconosciuto")`.

---

## Esercizio 3 — `Optional.map`

Dato un `Optional<String> nome`, trasforma il contenuto in **maiuscolo** se presente e stampalo.

👉 Hint: `nome.map(String::toUpperCase).ifPresent(...)`.

---

## Esercizio 4 — `Optional.filter`

Dato un `Optional<Integer> numero`, stampa `"pari"` solo se il numero esiste ed è pari.

👉 Hint: `numero.filter(n -> n % 2 == 0).ifPresent(...)`.

---

## Esercizio 5 — `Optional.flatMap`

Crea una classe `Utente` con attributo `Optional<Profilo> profilo`.

* Recupera il **nickname** dell’utente (se esiste), altrimenti `"guest"`.

👉 Hint: concatenare `flatMap` sugli `Optional`.

---

## Esercizio 6 — `Optional.orElseGet`

Simula la lettura di un valore da database: se `Optional` è vuoto, genera un valore di default tramite una funzione costosa.

👉 Hint: `orElseGet(() -> funzioneCostosa())`.

---

## Esercizio 7 — `Optional.orElseThrow`

Dato un `Optional<String> codice`, lancia una `IllegalArgumentException` se il codice è assente.

👉 Hint: `orElseThrow(() -> new IllegalArgumentException("Codice mancante"))`.

---

## Esercizio 8 — Uso combinato

Hai una lista di stringhe.

* Trova la **prima stringa che inizia con "A"**.
* Stampala se esiste, altrimenti `"Nessuna trovata"`.

👉 Hint: `stream().filter(...).findFirst().orElse("Nessuna trovata")`.

---

## Esercizio 9 — Metodo utility

Scrivi un metodo:

```java
public static Optional<Integer> parseNumero(String s)
```

che prova a convertire la stringa in `Integer`, restituendo `Optional.empty()` se non è un numero valido.

---

## Esercizio 10 — Optional chaining

Simula una gerarchia:

```java
class Ordine {
    Optional<Cliente> cliente;
}
class Cliente {
    Optional<Indirizzo> indirizzo;
}
class Indirizzo {
    String citta;
}
```

Recupera la città dell’ordine, se presente, altrimenti `"sconosciuta"`.

👉 Hint: catena di `flatMap`.

