# Cos’è una Switch Expression?

Prima di Java 12, `switch` era solo un **statement**, cioè non restituiva un valore e spesso richiedeva `break` per evitare il “fall-through”.

Con **Switch Expressions**:

* `switch` può **ritornare un valore**.
* Usa **freccia `->`** invece di due punti `:` per una sintassi più pulita.
* Fall-through implicito evitato (non serve più `break`).

---

## Sintassi base

### Vecchio stile

```java
int giorno = 3;
String nomeGiorno;

switch (giorno) {
    case 1: nomeGiorno = "Lunedì"; break;
    case 2: nomeGiorno = "Martedì"; break;
    case 3: nomeGiorno = "Mercoledì"; break;
    default: nomeGiorno = "Sconosciuto";
}
System.out.println(nomeGiorno); // Mercoledì
```

### Nuovo stile (Switch Expression)

```java
int giorno = 3;

String nomeGiorno = switch (giorno) {
    case 1 -> "Lunedì";
    case 2 -> "Martedì";
    case 3 -> "Mercoledì";
    default -> "Sconosciuto";
};

System.out.println(nomeGiorno); // Mercoledì
```

---

## Più istruzioni in un case

Se servono più istruzioni:

```java
int giorno = 3;

String messaggio = switch (giorno) {
    case 1, 2, 3 -> {
        System.out.println("Giorno lavorativo");
        yield "Giorno " + giorno; // yield restituisce il valore
    }
    case 6, 7 -> "Weekend";
    default -> "Sconosciuto";
};

System.out.println(messaggio);
```

* `yield` serve per **ritornare un valore** da un blocco con più istruzioni.
* Non serve più `break` per evitare il fall-through.

---

## Switch su String

Funziona anche con String e Enum:

```java
String frutto = "Mela";

int calorie = switch (frutto) {
    case "Mela" -> 52;
    case "Banana" -> 89;
    default -> 0;
};

System.out.println(calorie); // 52
```

---

## Benefici per i junior

* Sintassi più **chiara e leggibile**.
* Nessun problema di fall-through.
* Facilita l’uso in contesti funzionali, perché può **ritornare valori** direttamente.
* Consente di usare **più costanti in un case** con la virgola.

---

Le **Switch Expressions** introdotte in **Java 12** (stabilizzate in Java 14) hanno reso il `switch` molto più potente e leggibile:

* possono restituire un valore,
* supportano la sintassi con `->`,
* permettono `yield` nei casi complessi.


---

# 🧩 **Esercizi su Switch Expressions (Java 12+)**

---

## 🔹 Esercizio 1 — Giorni della settimana

Scrivi una switch expression che, dato un numero (1–7), restituisce il giorno della settimana come stringa.
Esempio: `1 → "Lunedì"`.

👉 Hint:

```java
String giorno = switch(n) {
    case 1 -> "Lunedì";
    ...
    default -> "Sconosciuto";
};
```

---

## 🔹 Esercizio 2 — Vocale o consonante

Scrivi un metodo che, dato un carattere (`char`), restituisca `"vocale"` se è una vocale (`a,e,i,o,u`), altrimenti `"consonante"`.

---

## 🔹 Esercizio 3 — Calcolatrice semplice

Crea un metodo che accetta due numeri e un operatore (`+`, `-`, `*`, `/`) e restituisce il risultato usando uno switch expression.

---

## 🔹 Esercizio 4 — Grouping dei case

Data una stringa che rappresenta una stagione (`"dicembre"`, `"gennaio"`, `"febbraio"` → `"Inverno"`, ecc.), usa la sintassi **case multiplo** per restituire la stagione.

👉 Hint:

```java
String stagione = switch(mese) {
    case "dicembre","gennaio","febbraio" -> "Inverno";
    ...
};
```

---

## 🔹 Esercizio 5 — Con `yield`

Scrivi un metodo che, dato un voto numerico (0–30), restituisce una valutazione:

* 28–30 → `"Eccellente"`
* 24–27 → `"Buono"`
* 18–23 → `"Sufficiente"`
* altrimenti `"Insufficiente"`

👉 Usa `yield` in blocchi quando ci sono più condizioni.

---

## 🔹 Esercizio 6 — Enum con switch expression

Crea un `enum Giorno { LUN, MAR, MER, GIO, VEN, SAB, DOM }`.
Scrivi una switch expression che restituisca `true` se il giorno è lavorativo, `false` altrimenti.

---

## 🔹 Esercizio 7 — Switch con return

Scrivi un metodo `String descriviNumero(int n)` che restituisce:

* `"zero"` se `n == 0`
* `"positivo"` se > 0
* `"negativo"` se < 0

👉 Usa `return switch(...) { ... };`

---

## 🔹 Esercizio 8 — Switch con tipi diversi

Data una variabile `Object obj`, usa `switch` (con pattern matching se vuoi anticipare il passo successivo) per:

* `"String"` → stampa `"È una stringa"`
* `"Integer"` → stampa `"È un intero"`
* default → `"Altro tipo"`

---

## 🔹 Esercizio 9 — Menù CLI

Scrivi un piccolo programma che mostra un menù:
1 → `"Visualizza prodotti"`
2 → `"Aggiungi prodotto"`
3 → `"Esci"`

👉 Usa uno switch expression per interpretare la scelta.

---

## 🔹 Esercizio 10 — Refactoring

Prendi un vecchio codice con `switch-case` e `break`, riscrivilo con la nuova sintassi `->`.

