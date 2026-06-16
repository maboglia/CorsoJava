Questo codice è un classico esempio di avvio di una GUI in **Java Swing**, usando il thread corretto per l’interfaccia grafica.

```java
SwingUtilities.invokeLater(new Runnable() {
    public void run() {
        JFrame frame = new JFrame("Hello World");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
});
```

Vediamolo riga per riga.

---

## 1. `SwingUtilities.invokeLater(...)`

`Swing` non è thread-safe: tutti gli aggiornamenti dell’interfaccia devono essere eseguiti nell’**Event Dispatch Thread (EDT)**.

```java
SwingUtilities.invokeLater(...)
```

significa:

> “Esegui questo codice appena possibile nel thread grafico di Swing.”

Perché serve?

Se crei o modifichi componenti Swing da thread sbagliati, puoi avere:

* GUI che si blocca
* repaint strani
* race condition
* bug difficili da riprodurre

Quindi questa è la forma consigliata:

```java
public static void main(String[] args) {
    SwingUtilities.invokeLater(...);
}
```

---

## 2. `new Runnable()`

Qui stai creando un **oggetto anonimo** che implementa l’interfaccia `Runnable`.

`Runnable` ha un solo metodo:

```java
public interface Runnable {
    void run();
}
```

Quindi:

```java
new Runnable() {
    public void run() {
        ...
    }
}
```

equivale a dire:

> “Questo è il blocco di codice che Swing dovrà eseguire.”

In Java moderno si scriverebbe con lambda:

```java
SwingUtilities.invokeLater(() -> {
    ...
});
```

---

## 3. Metodo `run()`

Il codice dentro `run()` verrà eseguito sull’EDT.

```java
public void run() {
```

Dentro trovi la costruzione della finestra.

---

# Parte GUI

---

## 4. Creazione del `JFrame`

```java
JFrame frame = new JFrame("Hello World");
```

`JFrame` è una finestra desktop Swing.

Crea una finestra con titolo:

```text
Hello World
```

Visivamente:

```text
+------------------------+
| Hello World         X |
+------------------------+
|                        |
|                        |
+------------------------+
```

`frame` è la variabile che rappresenta la finestra.

Entity: Java Swing

---

## 5. Dimensioni finestra

```java
frame.setSize(600, 500);
```

Imposta:

* larghezza = 600 px
* altezza = 500 px

Quindi:

```text
600 x 500
```

---

## 6. Cosa succede quando chiudi

```java
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

Quando premi la X della finestra:

```text
X
```

l’applicazione termina.

Possibili opzioni:

### `EXIT_ON_CLOSE`

Chiude tutto:

```java
System.exit(0);
```

### `DISPOSE_ON_CLOSE`

Distrugge solo quella finestra.

### `DO_NOTHING_ON_CLOSE`

Non fa nulla.

Qui hai scelto:

```java
EXIT_ON_CLOSE
```

quindi:

> chiudi finestra → termina programma

---

## 7. Mostrare la finestra

```java
frame.setVisible(true);
```

Fino a questo momento la finestra esiste **ma non è visibile**.

Con:

```java
setVisible(true)
```

Swing la disegna a schermo.

Senza questa riga:

* il frame viene creato
* ma non lo vedi

---

# Flusso completo

Il programma fa questo:

### Step 1

Chiede a Swing:

> “Esegui del codice nel thread grafico”

↓

### Step 2

Swing esegue `run()`

↓

### Step 3

Crea finestra:

```java
new JFrame(...)
```

↓

### Step 4

Imposta dimensioni:

```java
600x500
```

↓

### Step 5

Imposta comportamento chiusura

↓

### Step 6

Mostra finestra

---

# Analogia semplice

Immagina Swing come un receptionist che gestisce tutte le richieste GUI.

Tu non puoi entrare direttamente nella sala controlli.

Devi lasciare un ticket:

```java
invokeLater(...)
```

Il receptionist lo mette in coda.

Quando arriva il turno:

```java
run()
```

viene eseguito.

---

# Versione moderna (Java 8+)

Lo stesso codice oggi si scrive spesso così:

```java
SwingUtilities.invokeLater(() -> {
    JFrame frame = new JFrame("Hello World");
    frame.setSize(600, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
});
```

Più compatto, stesso comportamento.

---

# In sintesi

Questo codice:

✅ usa il thread corretto per Swing
✅ crea una finestra `JFrame`
✅ la imposta a 600×500
✅ fa terminare il programma alla chiusura
✅ la rende visibile

In pratica è il **“Hello World” di Swing**.
