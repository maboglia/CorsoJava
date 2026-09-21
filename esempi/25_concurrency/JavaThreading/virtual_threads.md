# Virtual Threads in Java

## Introduzione

Nel percorso precedente abbiamo seguito questa evoluzione:

```text
Thread
  ↓
Runnable
  ↓
ExecutorService
  ↓
Callable + Future
  ↓
CompletionService
  ↓
CompletableFuture
```

Con i **Virtual Threads** Java introduce un modo molto più leggero di creare e gestire thread.

Il concetto fondamentale è:

> Un Virtual Thread è comunque un `Thread`, ma è molto più economico da creare e mantenere rispetto a un platform thread tradizionale.

I Virtual Threads sono stati introdotti come funzionalità definitiva in **Java 21**, dopo essere stati sviluppati nel progetto **Loom**.

---

# 1. Platform Thread e Virtual Thread

Prima dei Virtual Threads, quando scrivevamo:

```text
new Thread(...)
```

creavamo un **platform thread**.

Un platform thread è strettamente associato a un thread gestito dal sistema operativo.

Il modello può essere rappresentato così:

```text
Java Thread
     │
     ▼
OS Thread
     │
     ▼
CPU
```

Creare migliaia di questi thread può diventare costoso in termini di:

* memoria;
* gestione da parte del sistema operativo;
* context switching;
* scheduling.

---

# 2. Il modello dei Virtual Threads

Un Virtual Thread è invece gestito principalmente dalla JVM.

Il modello diventa concettualmente:

```text
Virtual Threads
      │
      ├── Virtual Thread 1
      ├── Virtual Thread 2
      ├── Virtual Thread 3
      ├── ...
      └── Virtual Thread 10000
                │
                ▼
          JVM Scheduler
                │
                ▼
        Platform Threads
                │
                ▼
               CPU
```

I Virtual Threads vengono eseguiti sopra un numero molto più contenuto di platform threads, chiamati **carrier threads**.

Quindi:

```text
molti Virtual Threads
        ↓
pochi Platform Threads
        ↓
CPU
```

---

# 3. Perché sono importanti?

Il vantaggio principale è che possiamo rappresentare le attività concorrenti in modo molto naturale.

Per esempio:

```text
Richiesta HTTP 1 → Virtual Thread
Richiesta HTTP 2 → Virtual Thread
Richiesta HTTP 3 → Virtual Thread
...
Richiesta HTTP 10000 → Virtual Thread
```

senza dover necessariamente gestire un numero equivalente di thread del sistema operativo.

Questo è particolarmente interessante per applicazioni che gestiscono molte operazioni di I/O:

* HTTP;
* database;
* file;
* socket;
* servizi remoti;
* chiamate ad API.

---

# 4. Il concetto fondamentale: blocking non significa necessariamente sprecare un OS thread

Questa è probabilmente la differenza concettuale più importante rispetto al modello tradizionale.

Supponiamo che un thread debba effettuare una richiesta HTTP:

```text
Virtual Thread
      │
      ▼
HTTP request
      │
      ▼
attesa risposta
```

Durante l'attesa il Virtual Thread può essere **sospeso**, permettendo al carrier thread di essere utilizzato per altre attività.

Concettualmente:

```text
Virtual Thread A
      │
      ├── HTTP request
      │
      └── sospeso in attesa
               │
               ▼
       carrier disponibile
               │
               ▼
Virtual Thread B
```

Questo è uno dei motivi per cui i Virtual Threads sono particolarmente adatti a workload con molta attesa I/O.

---

# 5. Un esempio molto semplice

La creazione di un Virtual Thread può essere molto simile alla creazione di un thread tradizionale.

Concettualmente:

```text
Thread.startVirtualThread(task)
```

crea e avvia un Virtual Thread.

La cosa interessante è che il programmatore continua a ragionare in termini di:

```text
Thread
```

e non deve necessariamente trasformare tutto il programma in una pipeline asincrona.

---

# 6. Il confronto con `Thread`

Il nostro primo esempio utilizzava:

```text
Thread
   ↓
start()
```

Con i Virtual Threads possiamo avere:

```text
Virtual Thread
      ↓
start()
```

Il modello di programmazione rimane quindi molto simile.

Questo è uno dei punti di forza dei Virtual Threads:

> permettono di mantenere un modello di programmazione apparentemente sincrono e semplice, riducendo il costo della concorrenza.

---

# 7. Virtual Threads e Runnable

Nel nostro percorso avevamo introdotto:

```text
Runnable
```

come rappresentazione del task.

Questa idea rimane valida.

Possiamo concettualmente avere:

```text
Runnable
   │
   ▼
Virtual Thread
```

Quindi non è necessario abbandonare `Runnable`.

Il task rimane separato dal meccanismo di esecuzione.

---

# 8. Virtual Threads ed ExecutorService

Qui il collegamento con `lez05` diventa particolarmente interessante.

Avevamo:

```text
ExecutorService
       │
       ▼
Thread Pool
       │
       ├── Thread
       ├── Thread
       └── Thread
```

Con i Virtual Threads possiamo utilizzare un executor dedicato:

```text
ExecutorService
       │
       ▼
Virtual Threads
```

In Java è disponibile:

```text
Executors.newVirtualThreadPerTaskExecutor()
```

Il nome è molto significativo:

> un Virtual Thread per ogni task.

---

# 9. Virtual Thread per Task

Supponiamo di avere:

```text
1000 task
```

Con un fixed thread pool:

```text
newFixedThreadPool(10)
```

avremo:

```text
1000 task
      ↓
10 thread
      ↓
coda dei task
```

Con:

```text
newVirtualThreadPerTaskExecutor()
```

il modello diventa:

```text
1000 task
      ↓
1000 Virtual Threads
```

I Virtual Threads sono sufficientemente leggeri da rendere praticabile questo modello per moltissimi task concorrenti.

---

# 10. Attenzione: non significa "un thread per ogni cosa" senza limiti

Il fatto che i Virtual Threads siano economici non significa che possiamo ignorare le risorse del sistema.

Continuano a esistere risorse limitate:

```text
CPU
Database connections
File descriptors
Memoria
Rete
API remote
```

Per esempio:

```text
10000 Virtual Threads
        ↓
10000 connessioni simultanee al database
```

potrebbero comunque essere un problema.

Quindi:

> I Virtual Threads riducono il costo dei thread, non eliminano i limiti delle risorse esterne.

---

# 11. Virtual Threads e Callable

Anche il nostro modello:

```text
Callable<T>
     ↓
Future<T>
```

rimane valido.

Possiamo avere:

```text
Callable<DownloadResult>
        ↓
Virtual Thread
        ↓
Future<DownloadResult>
```

Il Virtual Thread esegue il task e il `Future` rappresenta il risultato.

Quindi i concetti introdotti in `lez05` non vengono cancellati.

Vengono semplicemente utilizzati con un diverso modello di esecuzione.

---

# 12. Virtual Threads e CompletionService

Lo stesso ragionamento vale per:

```text
ExecutorCompletionService
```

Possiamo avere:

```text
Callable
   ↓
Virtual Thread
   ↓
CompletionService
   ↓
risultati completati
```

Il vantaggio dei Virtual Threads riguarda principalmente il costo e la scalabilità della gestione dei task, mentre `CompletionService` continua a occuparsi del problema diverso:

> come recuperare i risultati quando i task terminano?

Sono quindi concetti complementari.

---

# 13. Virtual Threads e CompletableFuture

Anche qui è importante non creare una contrapposizione artificiale.

Non è:

```text
Virtual Threads
      VS
CompletableFuture
```

Sono strumenti che risolvono problemi in parte diversi.

`CompletableFuture` è particolarmente utile per costruire:

```text
pipeline asincrone
```

come:

```text
A
 ↓
thenApply()
 ↓
B
 ↓
thenAccept()
```

I Virtual Threads permettono invece di esprimere molte attività concorrenti usando un modello di programmazione più vicino al codice sincrono tradizionale.

---

# 14. Due modi di affrontare lo stesso problema

Consideriamo il nostro downloader.

## Approccio `CompletableFuture`

Il modello può essere:

```text
HTTP async
     ↓
CompletableFuture
     ↓
thenApply()
     ↓
thenAccept()
     ↓
allOf()
```

Il codice rappresenta esplicitamente la pipeline asincrona.

---

## Approccio Virtual Threads

Possiamo invece pensare:

```text
Virtual Thread
      ↓
HTTP request
      ↓
attesa
      ↓
salvataggio
      ↓
risultato
```

Il codice può rimanere molto più simile a quello sequenziale.

Questo è uno dei motivi per cui i Virtual Threads sono interessanti:

> la concorrenza può essere espressa attraverso codice apparentemente sincrono.

---

# 15. Il nostro downloader: nuova evoluzione

Il progetto iniziato con:

```text
lez04

Thread
 ↓
download URL
```

può essere ulteriormente evoluto.

## Versione iniziale

```text
URL
 ↓
Thread
 ↓
download
```

## ExecutorService

```text
URL
 ↓
Callable
 ↓
ExecutorService
 ↓
Thread Pool
 ↓
download
```

## CompletableFuture

```text
URL
 ↓
sendAsync()
 ↓
CompletableFuture
 ↓
pipeline asincrona
 ↓
download
```

## Virtual Threads

```text
URL
 ↓
Virtual Thread
 ↓
download
 ↓
attesa I/O
 ↓
salvataggio
```

---

# 16. Un confronto didattico

| Approccio           | Modello              | Punto caratterizzante                   |
| ------------------- | -------------------- | --------------------------------------- |
| `Thread`            | thread manuali       | controllo diretto                       |
| `ExecutorService`   | thread pool          | gestione centralizzata                  |
| `Callable + Future` | task con risultato   | risultato futuro                        |
| `CompletionService` | task + risultati     | ordine di completamento                 |
| `CompletableFuture` | pipeline asincrona   | composizione                            |
| Virtual Threads     | thread molto leggeri | grande concorrenza con modello semplice |

La tabella non rappresenta una graduatoria.

Ogni tecnologia risponde a esigenze differenti.

---

# 17. Virtual Threads: soprattutto I/O-bound

I Virtual Threads sono particolarmente interessanti quando il programma passa molto tempo in attesa.

Per esempio:

```text
HTTP
 ↓
attesa
 ↓
HTTP
 ↓
attesa
 ↓
database
 ↓
attesa
```

In questi casi possiamo avere moltissime attività concorrenti.

---

# 18. CPU-bound: attenzione

Consideriamo invece un'elaborazione molto pesante:

```text
calcoli matematici
algoritmi CPU-intensive
elaborazione immagini
compressione
crittografia
```

Qui il problema principale non è il costo dei thread, ma la quantità di CPU disponibile.

Se abbiamo:

```text
8 core
```

creare:

```text
10000 Virtual Threads
```

non significa avere 10000 unità di calcolo parallele.

I Virtual Threads migliorano soprattutto la gestione della concorrenza quando molte attività sono in attesa.

---

# 19. Virtual Threads e Thread Pool tradizionali

Questo è un punto didattico importante.

Con i platform threads spesso usiamo:

```text
fixedThreadPool(10)
```

per limitare il numero di thread.

Con i Virtual Threads normalmente non abbiamo bisogno di creare un piccolo pool di Virtual Threads per ottenere il vantaggio principale.

Il modello tipico è:

```text
newVirtualThreadPerTaskExecutor()
```

cioè:

```text
un Virtual Thread
        ↓
per ogni task
```

Il numero di Virtual Threads può quindi essere molto maggiore del numero di CPU.

---

# 20. Ma allora i Thread Pool sono inutili?

No.

È importante non trasformare il concetto in:

```text
Virtual Threads = niente ExecutorService
```

L'`ExecutorService` rimane utile per gestire il ciclo di vita e l'invio dei task.

Cambia il tipo di thread utilizzato.

Possiamo quindi avere:

```text
ExecutorService
       │
       ├── platform threads
       │
       └── virtual threads
```

Il problema da risolvere determina quale modello è più adatto.

---

# 21. Un punto importante: non usare i Virtual Threads come semplice "pool più grande"

Il vantaggio non è:

```text
Thread Pool da 10
        ↓
Thread Pool da 10000
```

Il modello concettuale è diverso.

Con i Virtual Threads vogliamo poter rappresentare le attività concorrenti in modo naturale:

```text
task 1 → virtual thread
task 2 → virtual thread
task 3 → virtual thread
...
```

senza dover gestire manualmente un piccolo numero di thread riutilizzabili come nel modello tradizionale.

---

# 22. Collegamento con il progetto didattico

Il percorso completo può ora essere aggiornato:

```text
lez01
Thread
  │
  ▼
lez02
Runnable
  │
  ▼
lez03
join()
  │
  ▼
lez04
Thread + HttpClient
  │
  ▼
lez05
ExecutorService
  │
  ├── Callable
  └── Future
  │
  ▼
lez06
CompletionService
  │
  ▼
lez07
CompletableFuture
  │
  ▼
lez08
Virtual Threads
```

La nuova lezione può quindi essere vista come un **nuovo ramo dell'evoluzione**, non semplicemente come il "passo successivo" di una catena obbligatoria.

---

# 23. Il punto didattico più importante

Dopo aver studiato `CompletableFuture`, si potrebbe pensare:

> "Per fare concorrenza devo trasformare tutto in codice asincrono."

I Virtual Threads permettono di introdurre una prospettiva diversa:

```text
Concorrenza
    ≠
necessariamente codice asincrono complesso
```

Possiamo avere codice strutturalmente semplice:

```text
scarica pagina
attendi risposta
salva file
restituisci risultato
```

ed eseguire molte copie di questa attività contemporaneamente tramite Virtual Threads.

---

# 24. Schema finale

```text
                 CONCORRENZA JAVA
                       │
       ┌───────────────┼────────────────┐
       │               │                │
       ▼               ▼                ▼
 ExecutorService  CompletableFuture  Virtual Threads
       │               │                │
       │               │                │
       ▼               ▼                ▼
 Thread Pool       Pipeline async   Thread leggerissimi
       │               │                │
       ▼               ▼                ▼
 Callable/Future   thenApply()      blocking I/O
       │           thenAccept()          │
       ▼           allOf()               ▼
CompletionService exceptionally()   alta concorrenza
```

---

# 25. Regola pratica

Una sintesi utile da ricordare:

```text
Thread
→ "voglio creare e gestire un thread"

ExecutorService
→ "voglio delegare la gestione dei thread"

Callable + Future
→ "voglio eseguire un task e ottenere un risultato"

CompletionService
→ "voglio ricevere i risultati man mano che i task terminano"

CompletableFuture
→ "voglio costruire una pipeline asincrona"

Virtual Thread
→ "voglio gestire moltissime attività concorrenti
   mantenendo un modello di programmazione semplice"
```

---

# 26. Il progetto finale: due strade

A questo punto il nostro downloader può essere sviluppato secondo due modelli principali.

### Modello asincrono

```text
URL
 ↓
HttpClient.sendAsync()
 ↓
CompletableFuture
 ↓
pipeline
 ↓
allOf()
 ↓
report
```

### Modello Virtual Threads

```text
URL
 ↓
Virtual Thread
 ↓
HttpClient.send()
 ↓
attesa
 ↓
salvataggio
 ↓
DownloadResult
 ↓
report
```

Entrambi possono ottenere concorrenza elevata, ma esprimono la soluzione in maniera diversa.

---

# Conclusione

I Virtual Threads rappresentano un'importante evoluzione della concorrenza in Java perché permettono di gestire un numero molto elevato di attività concorrenti con un costo molto più basso rispetto ai tradizionali platform threads.

Il punto fondamentale è però capire **dove si collocano nel percorso già studiato**.

Non sostituiscono automaticamente:

* `ExecutorService`;
* `Callable`;
* `Future`;
* `CompletionService`;
* `CompletableFuture`.

Piuttosto, offrono un nuovo modo di eseguire i task.

La distinzione fondamentale è:

```text
ExecutorService
    → COME gestisco l'esecuzione dei task

Callable
    → COSA deve fare il task

Future
    → COME rappresento il risultato futuro

CompletionService
    → COME recupero i risultati completati

CompletableFuture
    → COME compongo operazioni asincrone

Virtual Thread
    → SU QUALE TIPO DI THREAD posso eseguire
      moltissime attività concorrenti
```

Ed è proprio questo il collegamento naturale con tutto il percorso precedente.
