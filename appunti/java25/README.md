# Scheda didattica — Java 21 e Java 25

## Dalla modernizzazione alla maturità di Java

### Obiettivi

Al termine della scheda lo studente sarà in grado di:

* comprendere perché Java 21 rappresenta una tappa importante nell'evoluzione del linguaggio;
* utilizzare **Record Patterns** e **Pattern Matching for `switch`**;
* comprendere il modello dei **Virtual Threads**;
* utilizzare le **Sequenced Collections**;
* conoscere la nuova sintassi per i programmi Java più semplici;
* riconoscere le principali novità di Java 25;
* distinguere tra funzionalità **finali** e **preview**;
* comprendere il rapporto tra virtual threads, scoped values e structured concurrency.

---

# 1. Java 21: una nuova generazione di Java

**Java 21**, rilasciato nel 2023, rappresenta una delle versioni più significative della piattaforma Java moderna.

Non si tratta soltanto di nuove funzionalità sintattiche: alcune novità modificano concretamente il modo in cui possiamo:

* modellare i dati;
* scrivere codice condizionale;
* gestire la concorrenza;
* lavorare con le collezioni;
* realizzare programmi semplici.

Tra le funzionalità più importanti troviamo:

| Funzionalità                      | Java 21    |
| --------------------------------- | ---------- |
| Record Patterns                   | **Finale** |
| Pattern Matching for `switch`     | **Finale** |
| Virtual Threads                   | **Finale** |
| Sequenced Collections             | **Finale** |
| Unnamed Variables & Patterns      | Preview    |
| Unnamed Classes / Instance `main` | Preview    |

Record Patterns e Pattern Matching for `switch` sono stati finalizzati in Java 21, così come i Virtual Threads e le Sequenced Collections. ([cr.openjdk.org][2])

---

# 2. Record Patterns

## Il problema

I `record` sono stati introdotti per rappresentare in modo conciso semplici contenitori immutabili di dati.

Supponiamo di avere:

```java
record Point(int x, int y) {}
```

Prima dei record patterns, per estrarre i dati dovevamo utilizzare esplicitamente gli accessor:

```java
Point p = new Point(10, 20);

int x = p.x();
int y = p.y();
```

Non è particolarmente complesso, ma quando i dati sono strutturati o annidati la sintassi può diventare più verbosa.

---

## Record Pattern

Java 21 permette di **destrutturare direttamente un record**:

```java
if (p instanceof Point(int x, int y)) {
    System.out.println(x + ", " + y);
}
```

Il pattern:

```text
Point(int x, int y)
```

esprime contemporaneamente:

1. il tipo dell'oggetto;
2. la struttura del record;
3. l'estrazione dei suoi componenti.

### Record annidati

Il vantaggio diventa ancora più evidente con strutture composte:

```java
record Point(int x, int y) {}
record Rectangle(Point topLeft, Point bottomRight) {}
```

È possibile lavorare direttamente sulla struttura:

```java
if (r instanceof Rectangle(
        Point(int x1, int y1),
        Point(int x2, int y2))) {

    // utilizzo diretto dei valori
}
```

### Idea chiave

> **Il pattern descrive la struttura dei dati e contemporaneamente estrae i valori che ci interessano.**

Questo porta Java verso una forma di **destructuring** tipica di altri linguaggi moderni.

---

# 3. Unnamed Variables e Unnamed Patterns

Gli **unnamed patterns e variables** sono comparsi come preview in Java 21 e sono stati finalizzati successivamente in **Java 22**. ([cr.openjdk.org][1])

L'idea è semplice:

> Se un valore non ci interessa, non dobbiamo necessariamente assegnargli un nome.

Il simbolo:

```java
_
```

può rappresentare un valore deliberatamente ignorato nelle situazioni previste dal linguaggio.

### Perché è utile?

Immaginiamo di avere una struttura:

```text
Persona
 ├── nome
 ├── cognome
 └── indirizzo
```

Se ci interessa soltanto il nome, non ha senso creare variabili per tutti gli altri componenti.

### Concetto didattico

Gli unnamed variables introducono una distinzione importante:

```text
valore utilizzato
      ↓
variabile nominata

valore ignorato
      ↓
variabile unnamed
```

Questo rende esplicita l'intenzione del programmatore.

---

# 4. Pattern Matching for `switch`

Una delle evoluzioni più importanti di Java 21 riguarda `switch`.

Tradizionalmente `switch` lavorava soprattutto con:

* valori numerici;
* `String`;
* `enum`.

Il controllo del tipo richiedeva spesso `if/else` e cast.

---

## Prima

Un codice tradizionale poteva essere:

```java
if (obj instanceof String) {
    String s = (String) obj;
    ...
} else if (obj instanceof Integer) {
    Integer n = (Integer) obj;
    ...
}
```

Con il pattern matching:

```java
switch (obj) {
    case String s -> ...
    case Integer n -> ...
    default -> ...
}
```

Il controllo del tipo e il cast vengono integrati nel pattern.

---

## Guarded patterns

È inoltre possibile aggiungere condizioni:

```java
switch (obj) {
    case String s when s.length() > 10 -> ...
    case String s -> ...
    default -> ...
}
```

La struttura diventa quindi:

```text
switch
  │
  ├── tipo + pattern
  │
  ├── tipo + pattern + condizione
  │
  └── default
```

### Vantaggi

* meno `if/else`;
* meno cast espliciti;
* maggiore leggibilità;
* maggiore sicurezza rispetto ai cast manuali;
* possibilità di esprimere direttamente la struttura dei casi.

---

# 5. Virtual Threads

Questa è probabilmente la novità più importante di Java 21 per la programmazione concorrente.

I **Virtual Threads**, introdotti definitivamente con Java 21 tramite JEP 444, sono thread leggeri gestiti dalla JVM. ([openjdk.org][3])

## Platform Threads

Tradizionalmente:

```text
Java Thread
     │
     ▼
OS Thread
```

Un thread Java tradizionale è strettamente associato a un thread del sistema operativo.

I thread sono quindi una risorsa relativamente costosa.

---

## Virtual Threads

Con i virtual threads:

```text
Virtual Thread  ─┐
Virtual Thread  ─┤
Virtual Thread  ─┼──► Platform Threads ───► CPU
Virtual Thread  ─┤
Virtual Thread  ─┘
```

Molti virtual threads possono essere gestiti utilizzando un numero molto più contenuto di thread del sistema operativo.

La JVM effettua il **mounting/unmounting** dei virtual threads sui platform threads.

---

## Perché sono importanti?

Il modello tradizionale tende a utilizzare:

```text
Request
   ↓
Thread Pool
   ↓
Platform Thread
```

I virtual threads permettono invece di adottare più facilmente il modello:

```text
Request
   ↓
Virtual Thread
```

senza che ogni richiesta debba necessariamente occupare permanentemente un thread del sistema operativo.

La documentazione ufficiale sottolinea proprio la possibilità di mantenere il semplice modello **thread-per-request**, ma con thread molto più economici. ([openjdk.org][3])

---

## Creazione

Una delle API più interessanti è:

```java
Executors.newVirtualThreadPerTaskExecutor()
```

Concettualmente:

```java
try (var executor =
        Executors.newVirtualThreadPerTaskExecutor()) {

    executor.submit(() -> {
        // task
    });
}
```

### Regola importante

I virtual threads **non devono essere utilizzati come un tradizionale thread pool**.

Il principio è:

```text
Platform Threads → spesso pool

Virtual Threads → un thread per task
```

La documentazione di OpenJDK raccomanda esplicitamente di non creare pool di virtual threads: sono progettati per essere creati in grande quantità e utilizzati per singoli task. ([openjdk.org][3])

---

# 6. Sequenced Collections

Java 21 introduce un'API uniforme per le collezioni che possiedono un ordine definito.

Prima esistevano differenze tra:

```text
List
Set
Map
```

nel modo di accedere al primo e all'ultimo elemento.

Java 21 introduce le **Sequenced Collections**, con operazioni concettualmente uniformi:

```java
getFirst()
getLast()
reversed()
```

### Idea

Prima:

```text
List → modalità A
LinkedHashSet → modalità B
LinkedHashMap → modalità C
```

Dopo:

```text
Sequenced Collection
       │
       ├── first
       ├── last
       └── reversed
```

### Vantaggio

Il codice può ragionare maggiormente in termini di **ordine della collezione**, invece di dipendere dalla specifica implementazione.

---

# 7. Compact Source Files e Instance `main`

Gli appunti parlano di:

> Unnamed Classes & Instance Main Methods

Questa funzionalità è stata introdotta come preview in Java 21 e successivamente è diventata **Compact Source Files and Instance `main` Methods** in Java 25. ([cr.openjdk.org][4])

Lo scopo è ridurre il codice necessario per scrivere piccoli programmi.

Tradizionalmente:

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

Il nuovo modello permette di avvicinarsi a:

```java
void main() {
    System.out.println("Hello");
}
```

La classe viene implicitamente definita dal compilatore.

### Utilità didattica

Questa caratteristica è particolarmente interessante per:

* primi programmi;
* esempi;
* esercizi;
* piccoli esperimenti;
* materiale didattico;
* prototipi.

L'obiettivo non è eliminare le classi, ma **ridurre il boilerplate quando la struttura completa di una classe non aggiunge valore didattico o concettuale**.

---

# 8. Java 25: dalla modernizzazione alla maturità

Se Java 21 rappresenta una grande fase di modernizzazione, **Java 25 consolida diverse idee introdotte negli anni precedenti**.

Tra le funzionalità più interessanti:

| Funzionalità                           | Java 25    |
| -------------------------------------- | ---------- |
| Module Import Declarations             | **Finale** |
| Compact Source Files / Instance `main` | **Finale** |
| Flexible Constructor Bodies            | **Finale** |
| Scoped Values                          | **Finale** |
| Primitive Types in Patterns            | Preview    |
| Stable Values                          | Preview    |
| Structured Concurrency                 | Preview    |

Java 25 ha finalizzato, tra le altre, module import declarations, compact source files/instance `main` e flexible constructor bodies. ([openjdk.org][5])

---

# 9. Primitive Patterns

Java 25 estende il pattern matching anche ai **tipi primitivi**.

L'obiettivo è rendere il pattern matching più uniforme anche per:

```text
int
long
double
boolean
...
```

La funzionalità **Primitive Types in Patterns, `instanceof`, and `switch`** è però ancora una **preview feature in Java 25**, non una funzionalità definitiva. ([OpenJDK Bug Tracker][6])

### Perché è interessante?

Finora pattern matching e primitive types appartenevano in parte a due mondi distinti.

Java 25 cerca di avvicinarli:

```text
Object patterns
       +
Primitive patterns
       ↓
Pattern matching più uniforme
```

### Concetto didattico

Il programmatore non deve più pensare soltanto:

> "Posso fare pattern matching su questo oggetto?"

ma può ragionare sempre più in termini di:

> "Quale pattern descrive questo valore?"

---

# 10. Module Import Declarations

Java 25 introduce:

```java
import module java.base;
```

invece di dover importare manualmente numerosi package.

Per esempio, un'applicazione che utilizza diverse API standard potrebbe richiedere molti import:

```java
import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
...
```

Con i module imports è possibile importare le API esportate da un modulo.

La sintassi è:

```java
import module nome.modulo;
```

La funzionalità è stata **finalizzata in Java 25**. ([openjdk.org][5])

### Obiettivo

Ridurre:

* boilerplate;
* numero di import;
* difficoltà iniziale nell'apprendimento delle API modulari.

È particolarmente interessante nei:

* prototipi;
* programmi didattici;
* piccoli esempi;
* esplorazione di API.

---

# 11. Flexible Constructor Bodies

I record hanno una sintassi molto compatta:

```java
record Person(String name, int age) {}
```

Java 25 rende più flessibile il corpo dei costruttori, permettendo di eseguire determinate operazioni prima dell'invocazione del costruttore della superclasse.

Questo consente di inserire direttamente nel costruttore una parte della logica necessaria per:

* validazione;
* preparazione dei dati;
* trasformazione;
* inizializzazione.

### Idea

Prima:

```text
Record
  ↓
costruttore molto vincolato
  ↓
factory method
```

Java 25:

```text
Record
  ↓
costruttore più espressivo
  ↓
validazione / preparazione
  ↓
super(...)
```

La funzionalità è stata finalizzata in Java 25. ([cr.openjdk.org][7])

---

# 12. Scoped Values

Gli **Scoped Values** rappresentano un'evoluzione importante per la propagazione di dati immutabili nel codice concorrente.

Il concetto è:

```text
Scope
  │
  ├── Task A
  ├── Task B
  └── Task C
```

Un valore può essere associato allo scope e reso disponibile alle operazioni eseguite al suo interno.

### Rispetto a ThreadLocal

Il confronto concettuale è:

```text
ThreadLocal
    ↓
dato associato al thread

Scoped Value
    ↓
dato associato allo scope
```

Questo è particolarmente interessante in presenza di **virtual threads**.

Gli Scoped Values sono stati finalizzati in Java 25. ([OpenJDK Mail][8])

### Esempi di utilizzo

Sono adatti, ad esempio, per propagare:

* contesto di una richiesta;
* informazioni di autenticazione;
* correlation ID;
* configurazioni immutabili;
* dati di contesto.

---

# 13. Stable Values

Gli **Stable Values** sono un'altra funzionalità introdotta in Java 25 come **preview**.

L'idea è quella di avere un valore:

```text
inizializzazione
       ↓
valore immutabile
       ↓
utilizzo concorrente
```

con la possibilità di separare il momento della dichiarazione da quello dell'inizializzazione.

È quindi una forma di **immutabilità differita**.

Gli Stable Values non devono essere presentati, almeno in Java 25, come una funzionalità definitiva: sono una preview API. ([OpenJDK Mail][9])

---

# 14. Structured Concurrency

La **Structured Concurrency** completa concettualmente il modello introdotto dai virtual threads.

Il problema tradizionale è facilmente riconoscibile:

```text
crea task
   ↓
crea Future
   ↓
salva Future
   ↓
attendi
   ↓
gestisci eccezioni
   ↓
cancella task
   ↓
shutdown executor
```

La gestione manuale può diventare complessa.

La structured concurrency propone invece di trattare attività correlate come una **singola unità di lavoro**:

```text
Operazione principale
       │
       ├── Task A
       ├── Task B
       └── Task C
             │
             ▼
       risultato complessivo
```

Il ciclo di vita delle attività figlie viene quindi legato a quello dell'operazione principale.

### Vantaggi concettuali

* gestione del ciclo di vita;
* propagazione degli errori;
* cancellazione;
* sincronizzazione;
* maggiore leggibilità.

### Attenzione

Anche la **Structured Concurrency in Java 25 è ancora una preview**, quindi non va presentata come API definitiva del linguaggio. ([OpenJDK Mail][10])

---

# 15. Java 21 → Java 25: il filo conduttore

Le funzionalità viste non sono isolate.

Possiamo leggerle come parti di una stessa evoluzione.

```text
JAVA MODERNO
     │
     ├── Dati
     │    ├── Records
     │    └── Record Patterns
     │
     ├── Controllo
     │    └── Pattern Matching
     │
     ├── Collezioni
     │    └── Sequenced Collections
     │
     ├── Concorrenza
     │    ├── Virtual Threads
     │    ├── Scoped Values
     │    └── Structured Concurrency
     │
     ├── Sintassi
     │    ├── Compact Source Files
     │    └── Instance main
     │
     └── Moduli
          └── Module Import
```

La direzione generale è evidente:

> **meno boilerplate, maggiore espressività e un modello di concorrenza più semplice da comprendere.**

---

# 16. Il percorso didattico

Per un corso Java moderno, queste funzionalità possono essere introdotte seguendo un percorso progressivo:

### Livello 1 — Dati

```text
Classi
   ↓
Record
   ↓
Record Patterns
```

### Livello 2 — Pattern

```text
instanceof
   ↓
Pattern Matching
   ↓
switch con pattern
```

### Livello 3 — Collections

```text
List / Set / Map
       ↓
Sequenced Collections
```

### Livello 4 — Concorrenza classica

```text
Thread
   ↓
Runnable
   ↓
ExecutorService
   ↓
Callable / Future
   ↓
CompletionService
   ↓
CompletableFuture
```

### Livello 5 — Concorrenza moderna

```text
ExecutorService
       ↓
Virtual Threads
       ↓
Scoped Values
       ↓
Structured Concurrency
```

Questo collegamento è particolarmente importante perché consente di **non presentare i Virtual Threads come un argomento isolato**, ma come la naturale evoluzione del percorso sulla concorrenza.

---

# 17. Java 21 e Java 25: cosa ricordare

| Tema                        | Java 21   | Java 25                    |
| --------------------------- | --------- | -------------------------- |
| Record Patterns             | Final     | —                          |
| Pattern Matching `switch`   | Final     | —                          |
| Virtual Threads             | **Final** | Consolidati                |
| Sequenced Collections       | **Final** | Consolidate                |
| Unnamed Variables           | Preview   | Già finalizzate in Java 22 |
| Compact Source Files        | Preview   | **Final**                  |
| Instance `main`             | Preview   | **Final**                  |
| Module Import               | —         | **Final**                  |
| Flexible Constructor Bodies | —         | **Final**                  |
| Scoped Values               | Preview   | **Final**                  |
| Primitive Patterns          | —         | **Preview**                |
| Stable Values               | —         | **Preview**                |
| Structured Concurrency      | Preview   | **Preview**                |

---

# 18. Messaggio finale

Java 21 può essere visto come una delle versioni che hanno dato una forte spinta alla **modernizzazione del linguaggio**.

Java 25 prosegue questa direzione cercando soprattutto di **consolidare e semplificare**.

Il filo conduttore può essere sintetizzato in quattro parole:

> **Espressività — Semplicità — Concorrenza — Sicurezza**

Non significa che Java stia diventando un linguaggio completamente diverso.

Al contrario, uno degli aspetti più interessanti della sua evoluzione è che molte nuove funzionalità vengono integrate nel modello esistente:

```text
Java tradizionale
       │
       ├── OOP
       ├── classi
       ├── interfacce
       ├── collections
       ├── thread
       └── eccezioni
              │
              ▼
        Java moderno
              │
       ├── records
       ├── patterns
       ├── virtual threads
       ├── scoped values
       ├── structured concurrency
       └── sintassi più compatta
```

**La vera evoluzione di Java non consiste quindi nell'abbandonare il modello storico, ma nel renderlo progressivamente più espressivo, conciso e adatto allo sviluppo moderno.**

([openjdk.org][3])

### Fonti e approfondimenti

[1]: https://cr.openjdk.org/~alanb/sc/api/preview-list.html?utm_source=chatgpt.com "Preview List (Java SE 21 & JDK 21 [ad-hoc build])"
[2]: https://cr.openjdk.org/~gbierman/jep440%2B441/jep440%2B441-20230406/specs/patterns-switch-record-patterns-jls.html?utm_source=chatgpt.com "Pattern Matching for switch and Record Patterns"
[3]: https://openjdk.org/jeps/444?utm_source=chatgpt.com "JEP 444: Virtual Threads"
[4]: https://cr.openjdk.org/~hannesw/release-selector/api.00/jdk21/preview-list.html?utm_source=chatgpt.com "Preview List (Java SE 21 & JDK 21)"
[5]: https://openjdk.org/jeps/8344700?utm_source=chatgpt.com "JEP 511: Module Import Declarations"
[6]: https://bugs.openjdk.org/secure/attachment/114428/JLS-instanceof.pdf?utm_source=chatgpt.com "Primitive types in patterns, instanceof, and switch (Third Preview)"
[7]: https://cr.openjdk.org/~pminborg/computed-constant2/api/java.compiler/javax/lang/model/SourceVersion.html?utm_source=chatgpt.com "SourceVersion (Java SE 26 [ad-hoc build])"
[8]: https://mail.openjdk.org/pipermail/compiler-dev/2025-May/030147.html?utm_source=chatgpt.com "RFR: 8355022: Implement JEP 506: Scoped Values [v4]"
[9]: https://mail.openjdk.org/pipermail/core-libs-dev/2025-January/138940.html?utm_source=chatgpt.com "New candidate JEP: 502: Stable Values (Preview)"
[10]: https://mail.openjdk.org/pipermail/loom-dev/2025-September/007860.html?utm_source=chatgpt.com "Problem report on the usage of Structured Concurrency (5th preview)"
