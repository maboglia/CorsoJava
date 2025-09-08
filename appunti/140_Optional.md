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

