# 🔹 Cos’è JShell?

È il **REPL di Java** (Read–Eval–Print Loop), cioè un ambiente interattivo da console dove puoi scrivere ed eseguire codice Java **riga per riga** senza dover creare file `.java` e compilarli.

👉 È pensato per:

* **sperimentare rapidamente** con codice Java,
* fare **prove veloci su API**,
* **insegnare** (perfetto per junior!).

---

# 🔹 Avvio

Da terminale:

```bash
jshell
```

Vedrai un prompt tipo:

```
|  Welcome to JShell -- Version 17
|  For an introduction type: /help intro

jshell>
```

---

# 🔹 Esempi base

Scrivi direttamente codice Java:

```java
jshell> int x = 5;
x ==> 5

jshell> x + 10
$2 ==> 15
```

* I risultati intermedi vengono salvati in variabili automatiche (`$1`, `$2`, …).
* Puoi riassegnare e continuare:

```java
jshell> String nome = "Anna";
nome ==> "Anna"

jshell> nome.toUpperCase()
$3 ==> "ANNA"
```

---

# 🔹 Metodi e classi

Puoi definire metodi e classi al volo:

```java
jshell> int somma(int a, int b) { return a + b; }
|  created method somma(int,int)

jshell> somma(3, 4)
$4 ==> 7

jshell> class Persona {
   ...> String nome;
   ...> Persona(String nome) { this.nome = nome; }
   ...> }
|  created class Persona

jshell> new Persona("Marco").nome
$5 ==> "Marco"
```

---

# 🔹 Comandi speciali

JShell non è solo Java, ma ha anche comandi:

* `/help` → mostra l’help
* `/vars` → variabili definite
* `/methods` → metodi definiti
* `/classes` → classi definite
* `/imports` → import attivi
* `/save script.jsh` → salva la sessione
* `/open script.jsh` → riapre una sessione salvata
* `/exit` → esce

---

# 🔹 Import utili di default

JShell importa già alcuni pacchetti comuni:

```java
import java.io.*;
import java.math.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;
```

---

# 🔹 Vantaggi per i junior

* **Zero setup**: niente `public static void main(...)`.
* Ideale per **provare al volo codice Java**.
* Aiuta a capire meglio API come **Stream, Optional, Lambda** sperimentando direttamente.

---

