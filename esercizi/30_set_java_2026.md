# 30 set di verifica/esercitazione pensati 

Gli argomenti coperti:

* tipi primitivi e reference
* variabili e scope
* operatori
* control flow
* array
* `List` / `ArrayList`
* metodi
* classi e oggetti
* incapsulamento
* costruttori
* ereditarietà (base)
* interfacce
* lambda / functional programming
* stream (base)
* `record`

Ogni set contiene:

1. **Domanda teorica**
2. **Mini esercizio pratico**

---

# Set 1 — Tipi primitivi

### Teoria

Qual è la differenza tra tipi primitivi e tipi reference in Java?

### Esercizio

Dichiara variabili dei tipi:

* `int`
* `double`
* `char`
* `boolean`

Assegna valori e stampali.

---

# Set 2 — Variabili

### Teoria

Spiega differenza tra:

* variabile locale
* variabile di istanza
* variabile statica

### Esercizio

Scrivi un programma che dichiari:

```java
int eta = 25;
String nome = "Mario";
```

e stampi:

```text
Mario ha 25 anni
```

---

# Set 3 — Type Casting

### Teoria

Cos’è il casting implicito? E quello esplicito?

### Esercizio

Converti:

```java
double prezzo = 19.99;
```

in un intero.

---

# Set 4 — Operatori

### Teoria

Spiega differenza tra:

* `=`
* `==`
* `!=`

### Esercizio

Verifica se due interi sono uguali e stampa il risultato.

---

# Set 5 — If

### Teoria

Quando si usa `if`, `else if`, `else`?

### Esercizio

Dato:

```java
int voto = 27;
```

stampa:

* insufficiente
* sufficiente
* buono
* ottimo

---

# Set 6 — Switch

### Teoria

Quando conviene usare `switch` invece di `if`?

### Esercizio

Dato numero 1–7 stampa giorno settimana.

---

# Set 7 — While

### Teoria

Differenza tra `while` e `do-while`.

### Esercizio

Stampa numeri da 1 a 10 con `while`.

---

# Set 8 — For

### Teoria

Descrivi le 3 parti del `for`.

### Esercizio

Calcola somma dei numeri da 1 a 100.

---

# Set 9 — Break e Continue

### Teoria

A cosa servono `break` e `continue`?

### Esercizio

Stampa numeri 1–20 saltando multipli di 3.

---

# Set 10 — Array

### Teoria

Cos’è un array? Quali limiti ha?

### Esercizio

Crea:

```java
int[] numeri = {2,4,6,8};
```

e stampa tutti gli elementi.

---

# Set 11 — Array Length

### Teoria

Come si ottiene la lunghezza di un array?

### Esercizio

Calcola massimo valore in array.

---

# Set 12 — Array multidimensionali

### Teoria

Cos’è un array bidimensionale?

### Esercizio

Dichiara matrice 2x3 e stampala.

---

# Set 13 — Metodi

### Teoria

Cos’è la signature di un metodo?

### Esercizio

Scrivi metodo:

```java
somma(int a, int b)
```

---

# Set 14 — Return

### Teoria

A cosa serve `return`?

### Esercizio

Metodo che restituisce quadrato di un numero.

---

# Set 15 — Overloading

### Teoria

Cos’è l’overloading?

### Esercizio

Scrivi due metodi `area()`:

* quadrato
* rettangolo

---

# Set 16 — Classi

### Teoria

Cos’è una classe? Cos’è un oggetto?

### Esercizio

Crea classe:

```java
Studente
```

con campi:

* nome
* voto

---

# Set 17 — Oggetti

### Teoria

Come si istanzia un oggetto?

### Esercizio

Crea 2 oggetti `Studente`.

---

# Set 18 — Costruttori

### Teoria

Cos’è un costruttore?

### Esercizio

Aggiungi costruttore a `Studente`.

---

# Set 19 — Incapsulamento

### Teoria

Perché usare `private`?

### Esercizio

Trasforma attributi in privati con getter/setter.

---

# Set 20 — Static

### Teoria

Differenza tra membro static e non static.

### Esercizio

Classe `Contatore` con campo static che conta oggetti.

---

# Set 21 — ToString

### Teoria

Perché override di `toString()`?

### Esercizio

Implementa `toString()` in `Studente`.

---

# Set 22 — List

### Teoria

Differenza tra array e `List`.

### Esercizio

Crea:

```java
List<String> nomi
```

e aggiungi 5 nomi.

---

# Set 23 — ArrayList

### Teoria

Perché `ArrayList` è dinamico?

### Esercizio

Rimuovi elemento da `ArrayList`.

---

# Set 24 — Iterazione su List

### Teoria

Confronta:

* for classico
* enhanced for
* forEach

### Esercizio

Stampa tutti elementi di lista.

---

# Set 25 — Interfacce

### Teoria

Cos’è un’interfaccia?

### Esercizio

Definisci:

```java
interface Volante
```

con metodo:

```java
vola()
```

---

# Set 26 — Implementazione interfacce

### Teoria

Perché Java usa interfacce?

### Esercizio

Classe `Aereo` implementa `Volante`.

---

# Set 27 — Lambda

### Teoria

Cos’è una lambda expression?

### Esercizio

Scrivi lambda che somma due numeri.

Esempio:

```java
(a,b) -> a+b
```

---

# Set 28 — Programmazione funzionale

### Teoria

Cosa significa passare una funzione come parametro?

### Esercizio

Usa:
Java Development Kit `forEach`
per stampare lista di stringhe in maiuscolo.

---

# Set 29 — Stream API

### Teoria

A cosa serve uno stream?

### Esercizio

Da lista interi:

```java
[1,2,3,4,5,6]
```

filtra solo pari.

---

# Set 30 — Record

### Teoria

Cos’è un `record`? Quando usarlo?

### Esercizio

Definisci:

```java
record Persona(String nome, int eta)
```

Istanzia due persone e stampale.

---

## Possibile griglia di valutazione

Puoi usare questa metrica:

| Valutazione | Criterio                                       |
| ----------- | ---------------------------------------------- |
| 18–21       | Conoscenze minime, codice con errori           |
| 22–24       | Sufficiente autonomia                          |
| 25–27       | Buona padronanza                               |
| 28–30       | Ottima comprensione e buona qualità del codice |

