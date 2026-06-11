## Cos’è?

Parliamo di **Single-File Source-Code Execution**, introdotta in **Java 11**.

Da **Java 11** puoi eseguire direttamente un file `.java` senza compilare manualmente con `javac`.
👉 Il JDK compila e avvia il programma in un solo passo.

---

## Prima di Java 11

Bisognava fare due passaggi:

```bash
javac Hello.java   # compilazione -> crea Hello.class
java Hello         # esecuzione
```

---

## Con Java 11+

Basta un solo comando:

```bash
java Hello.java
```

Il compilatore compila “al volo” in memoria e avvia il programma.

---

## Esempio

File `Hello.java`:

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Ciao dal Single File Execution!");
    }
}
```

Esecuzione:

```bash
java Hello.java
```

**Output:**

```
Ciao dal Single File Execution!
```

---

## Esecuzione di script

Puoi usare anche codice senza `class`, tipo script:

```java
// File script.java
System.out.println("Somma = " + (3 + 5));
```

Esegui:

```bash
java script.java
```

**Output:**

```
Somma = 8
```

---

## Caratteristiche

* Funziona solo con **file singoli** (`.java`).
* Se il codice usa altre classi, bisogna comunque compilare in modo tradizionale.
* Perfetto per **script veloci**, **demo** e **insegnamento**.

---

## Benefici per i junior

* Zero boilerplate → puoi iniziare subito a scrivere Java.
* Ideale per **esercizi veloci** senza dover aprire un IDE complesso.
* Avvicina Java al mondo “scripting” come Python o Node.js.

---

