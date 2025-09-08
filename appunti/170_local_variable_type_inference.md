# 🔹 Cosa fa `var`

Permette di dichiarare variabili locali **senza specificare il tipo esplicitamente**, lasciando che sia il compilatore a dedurlo in base al valore assegnato.
⚠️ Non è una variabile “dinamica” come in JavaScript o Python → il tipo resta **fortemente tipizzato e immutabile** dopo l’inferenza.

---

# 🔹 Esempio base

```java
// Prima di Java 10
String nome = "Mario";
List<String> lista = new ArrayList<>();

// Con var
var nome = "Mario";              // tipo dedotto = String
var lista = new ArrayList<String>(); // tipo dedotto = ArrayList<String>
```

---

# 🔹 Caratteristiche principali

* **Funziona solo per variabili locali** (dentro metodi, costrutti, cicli, ecc.).
* **Non cambia il tipo**: `var` non è come `Object`, il compilatore sa esattamente che tipo è.
* **Richiede inizializzazione** → non si può fare `var x;` senza assegnamento.
* Non si può usare per **parametri di metodo**, **campi di classe** o **valori di ritorno** (almeno fino a Java 21).

---

# 🔹 Esempi pratici

### ✅ Cicli più leggibili

```java
var lista = List.of("A", "B", "C");

for (var elemento : lista) {
    System.out.println(elemento);
}
```

### ✅ Tipi generici complessi

```java
var mappa = new HashMap<String, List<Integer>>();
mappa.put("primi", List.of(2, 3, 5, 7));
System.out.println(mappa);
```

### ✅ Con Stream API

```java
var nomi = List.of("Anna", "Luca", "Marco");

var lunghezze = nomi.stream()
    .map(String::length)
    .toList();

System.out.println(lunghezze); // [4, 4, 5]
```

---

# 🔹 Casi da evitare

⚠️ Quando riduce la leggibilità:

```java
var x = metodo(); // Che tipo ritorna? Poco chiaro
```

Meglio usare `var` solo quando il tipo è **ovvio dal contesto**.

---

# 🔹 Benefici per i junior

* Codice **più compatto e leggibile**.
* Elimina ripetizioni inutili (soprattutto con generics).
* Fa capire che il **tipo è dedotto, non dinamico**.

---

