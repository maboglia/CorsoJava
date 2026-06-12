# 🔹 local variable type inference: Cosa fa `var`

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

Perfetto 👍, passiamo a **Local Variable Type Inference** introdotta in **Java 10** con la parola chiave `var`.
Questa feature permette di scrivere codice più leggibile, lasciando al compilatore l’inferenza del tipo locale.
⚠️ Ricorda: non è "tipizzazione dinamica" come in JavaScript o Python, i tipi sono comunque **statici** e determinati a **compile-time**.

Ecco una raccolta di **esercizi pratici** per junior.

---

# **Esercizi su `var` (Local Variable Type Inference)**

---

## Esercizio 1 — Tipo inferito da `new`

Dichiara una variabile lista con:

```java
var lista = new ArrayList<String>();
```

* Aggiungi 3 stringhe
* Stampa il contenuto

👉 Domanda: il compilatore ha inferito `ArrayList<String>` o `ArrayList<Object>`?

---

## Esercizio 2 — Inferenza con metodi

Scrivi un metodo che ritorna un numero intero, es: `getNumero()`.
Assegna il valore a una variabile `var x = getNumero();` e stampa il tipo.

👉 Hint: usa `x.getClass().getName()`

---

## Esercizio 3 — Iterazione con `var`

Crea una lista di nomi.
Usa un ciclo `for (var nome : lista)` per stampare ogni elemento.

---

## Esercizio 4 — Inferenza con Map

Crea una mappa `Map<String, Integer>`.
Itera con `for (var entry : mappa.entrySet())` e stampa chiave e valore.

---

## Esercizio 5 — Stream + var

Crea una lista `List.of(1,2,3,4,5)`.
Usa `stream()` e in una `forEach` con `var n ->` stampa solo i numeri pari.

---

## Esercizio 6 — Non ammesso

Prova a dichiarare `var x = null;`.
👉 Domanda: perché non compila?

---

## Esercizio 7 — Array e `var`

Dichiara un array con `var arr = new int[]{1,2,3};`.
Stampa la lunghezza.

---

## Esercizio 8 — Lambda con var

Scrivi un `BiFunction<Integer, Integer, Integer>` usando parametri con `var`:

```java
(x, y) -> x + y
```

Diventa:

```java
(var x, var y) -> x + y
```

👉 Domanda: quando serve `var` nei parametri lambda?

---

## Esercizio 9 — Uso in `try-with-resources`

Apri un file di testo con:

```java
try (var reader = new BufferedReader(new FileReader("file.txt"))) {
    reader.lines().forEach(System.out::println);
}
```

👉 Domanda: quale tipo ha `reader`?

---

## Esercizio 10 — Mix con `Optional`

Dichiara:

```java
var opt = Optional.of("ciao");
```

Recupera e stampa il valore se presente.

👉 Domanda: qual è il tipo effettivo di `opt`?

