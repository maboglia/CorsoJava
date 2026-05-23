# 📝 String Templates (Java 21 Preview)

## 🔹 Cos’è

* Una nuova feature che permette di **interpolare variabili e valori nelle stringhe** in modo sicuro e leggibile.
* Non serve più concatenare (`+`) o usare `String.format(...)`.
* Basato su un nuovo concetto: **Template Processor**.

👉 Obiettivo: semplificare la creazione di stringhe dinamiche **leggibili, sicure e personalizzabili**.

---

## 🔹 Sintassi base

```java
String nome = "Alice";
int eta = 30;

String msg = STR."Ciao, mi chiamo \{nome} e ho \{eta} anni.";
System.out.println(msg);
```

📌 Output:

```
Ciao, mi chiamo Alice e ho 30 anni.
```

* `STR` è un **template processor predefinito** che genera stringhe.
* `\{...}` indica un’espressione Java da interpolare.

---

## 🔹 Perché è utile?

Prima di Java 21:

```java
String msg = "Ciao, mi chiamo " + nome + " e ho " + eta + " anni.";
// oppure
String msg = String.format("Ciao, mi chiamo %s e ho %d anni.", nome, eta);
```

Con String Templates:

```java
String msg = STR."Ciao, mi chiamo \{nome} e ho \{eta} anni.";
```

✅ Più leggibile
✅ Meno errori con i placeholder `%s`, `%d`, ecc.
✅ Sicuro (evita injection se usato con processor specializzati)

---

## 🔹 Altri esempi

### 1️⃣ Espressioni dentro il template

```java
int a = 5, b = 3;
String result = STR."La somma di \{a} + \{b} è \{a+b}";
System.out.println(result); // La somma di 5 + 3 è 8
```

---

### 2️⃣ Uso con oggetti

```java
record Persona(String nome, int eta) {}

Persona p = new Persona("Luca", 25);
String descr = STR."Persona: nome=\{p.nome()}, età=\{p.eta()}";
System.out.println(descr);
```

---

### 3️⃣ Multi-line con Text Blocks

```java
String titolo = "Report";
int righe = 42;

String report = STR."""
    Titolo: \{titolo}
    Numero di righe: \{righe}
    """;
System.out.println(report);
```

---

## 🔹 Template Processor personalizzati

Non esiste solo `STR`.
Si possono scrivere **processor custom** per scopi particolari (es. SQL, JSON, HTML).

Esempio (fittizio):

```java
String query = SQL."SELECT * FROM utenti WHERE id = \{userId}";
```

👉 In futuro i processor specializzati potranno:

* Sanitizzare input (evitare SQL injection).
* Validare dati.
* Generare strutture complesse.

---

## 🔹 Stato della feature

* **Java 21** → Preview (prima versione).
* **Java 22–23** → ulteriori refinement.
* **Java 24?** → attesa stabilizzazione.

---

# 🚀 Esercizio rapido

Scrivi un programma che:

1. Definisce `String nome = "Giulia"; int punti = 120;`
2. Usa un **String Template** per stampare:

   ```
   Benvenuta Giulia! Hai totalizzato 120 punti.
   ```

