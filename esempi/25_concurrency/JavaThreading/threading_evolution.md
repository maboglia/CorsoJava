# Programmazione concorrente in Java

## ExecutorService · Callable · Future · CompletionService · CompletableFuture

---

## 1. Perché utilizzare questi strumenti?

La gestione diretta dei thread tramite `Thread` è utile per comprendere i fondamenti, ma nelle applicazioni reali diventa rapidamente difficile da gestire.

Il problema può essere sintetizzato così:

```text
Creare Thread manualmente
        ↓
Gestire il ciclo di vita
        ↓
Coordinare i risultati
        ↓
Gestire errori e interruzioni
        ↓
Gestire molti task
```

Java mette a disposizione API di livello superiore che permettono di separare:

```text
CHE COSA FARE
      ↓
Task
```

da:

```text
COME E DOVE ESEGUIRLO
      ↓
Executor / Thread Pool
```

Le principali tecnologie affrontate in questa scheda sono:

```text
ExecutorService
      ↓
Callable + Future
      ↓
CompletionService
      ↓
CompletableFuture
```

---

# 2. ExecutorService

## Cos'è?

`ExecutorService` è un'interfaccia della libreria Java che permette di delegare l'esecuzione dei task a un **executor**.

Il programmatore non deve più creare e gestire direttamente ogni singolo thread.

Il modello diventa:

```text
Task
 │
 ▼
ExecutorService
 │
 ▼
Thread Pool
 │
 ├── Thread 1
 ├── Thread 2
 └── Thread 3
```

---

## Thread Pool

Un Thread Pool è un insieme di thread riutilizzabili.

Supponiamo di avere 10 task:

```text
Task 1
Task 2
Task 3
Task 4
...
Task 10
```

e un pool di 3 thread:

```text
┌─────────────────────────┐
│      Thread Pool        │
│                         │
│ Thread 1 → Task 1       │
│ Thread 2 → Task 2       │
│ Thread 3 → Task 3       │
└─────────────────────────┘

Task 4 ... Task 10
        ↓
       coda
```

Quando un thread termina un task, può eseguire il successivo.

---

## Creazione del pool

Uno dei metodi più semplici è:

```text
Executors.newFixedThreadPool(n)
```

dove `n` rappresenta il numero di thread disponibili.

Concettualmente:

```text
ExecutorService
      │
      ├── Thread 1
      ├── Thread 2
      └── Thread 3
```

---

## `submit()`

Un task viene inviato all'executor tramite:

```text
submit()
```

Il task viene inserito nel sistema di esecuzione e verrà eseguito da uno dei thread disponibili.

---

## `shutdown()`

Quando non devono più essere inviati task:

```text
shutdown()
```

indica all'executor di non accettare ulteriori attività.

I task già sottomessi possono comunque completare la propria esecuzione.

Schema:

```text
submit(task)
submit(task)
submit(task)
       ↓
shutdown()
       ↓
terminazione ordinata
```

---

## Concetto chiave

Con `ExecutorService` il programmatore non ragiona più principalmente in termini di:

```text
"creo un thread"
```

ma di:

```text
"invio un task"
```

Questa è una differenza concettuale importante.

---

# 3. Callable

## Runnable: nessun risultato

`Runnable` rappresenta un'attività che non restituisce un risultato.

```text
Runnable
   │
   └── run()
         ↓
       void
```

È adatto quando interessa semplicemente eseguire un'operazione.

---

## Callable: restituisce un risultato

`Callable<T>` permette invece di rappresentare un task che produce un valore.

```text
Callable<T>
    │
    └── call()
          ↓
          T
```

Per esempio:

```text
Callable<DownloadResult>
```

può eseguire un download e restituire:

```text
DownloadResult
```

---

## Confronto

| Runnable                                             | Callable<T>                         |
| ---------------------------------------------------- | ----------------------------------- |
| `run()`                                              | `call()`                            |
| non restituisce valore                               | restituisce `T`                     |
| `void`                                               | `T`                                 |
| non pensato per restituire direttamente un risultato | adatto a elaborazioni con risultato |
| può essere inviato a un executor                     | può essere inviato a un executor    |

---

# 4. Future

Quando un `Callable` viene inviato a un `ExecutorService`, il risultato non è immediatamente disponibile.

Java restituisce un oggetto:

```text
Future<T>
```

Il `Future` rappresenta un risultato **disponibile in futuro**.

Schema:

```text
Callable<T>
     │
     │ submit()
     ▼
ExecutorService
     │
     ▼
Future<T>
     │
     │ task in esecuzione
     ▼
risultato T
```

---

## `get()`

Il risultato viene recuperato con:

```text
future.get()
```

Ma `get()` è una chiamata **bloccante**.

Se il task non è ancora terminato:

```text
main
 │
 └── future.get()
          │
          ├── attende
          │
          └── risultato disponibile
```

---

## Problema dell'attesa

Supponiamo di avere:

```text
Future 1 → 10 secondi
Future 2 → 2 secondi
Future 3 → 1 secondo
```

Se elaboriamo:

```text
future1.get()
future2.get()
future3.get()
```

il programma attende prima `Future 1`.

Anche se `Future 2` e `Future 3` sono già terminati, i loro risultati vengono elaborati successivamente.

Questo problema porta naturalmente alla soluzione successiva.

---

# 5. ExecutorCompletionService

## Obiettivo

`ExecutorCompletionService` permette di recuperare i risultati **nell'ordine in cui i task terminano**.

Supponiamo:

```text
Task 1 → 10 s
Task 2 → 2 s
Task 3 → 1 s
```

Ordine di completamento:

```text
Task 3
Task 2
Task 1
```

Il `CompletionService` permette di ricevere i risultati in questo ordine.

---

## Schema

```text
                 ┌── Task 1 ───────────── 10 s
                 │
Executor         ├── Task 2 ─── 2 s
                 │
                 └── Task 3 ─ 1 s
                                     
                        ↓
              CompletionService
                        ↓
                 risultato 3
                 risultato 2
                 risultato 1
```

---

## `submit()`

I task vengono inviati al `CompletionService`.

Il `CompletionService` utilizza internamente un `ExecutorService` per eseguirli.

Quindi:

```text
CompletionService
       │
       ▼
ExecutorService
       │
       ▼
Thread Pool
```

---

## `take()`

Il metodo:

```text
take()
```

restituisce il prossimo `Future` relativo a un task completato.

Se non ci sono ancora task terminati, `take()` attende.

```text
take()
  │
  ├── risultato disponibile → restituisce Future
  │
  └── nessun risultato → attende
```

---

## `poll()`

`poll()` funziona diversamente.

Non attende:

```text
poll()
```

restituisce:

```text
Future
```

se disponibile, altrimenti:

```text
null
```

Confronto:

| Metodo   | Comportamento             |
| -------- | ------------------------- |
| `take()` | attende un risultato      |
| `poll()` | controlla senza attendere |

---

# 6. Quando utilizzare CompletionService?

È particolarmente utile quando:

* abbiamo molti task;
* i task hanno tempi diversi;
* vogliamo elaborare immediatamente i risultati disponibili;
* l'ordine di sottomissione non è importante;
* vogliamo reagire al completamento dei task.

Esempio:

```text
Download di 100 pagine

Pagina 37 terminata
       ↓
elabora risultato

Pagina 82 terminata
       ↓
elabora risultato

Pagina 12 terminata
       ↓
elabora risultato
```

Non è necessario aspettare che tutte le 100 pagine siano terminate.

---

# 7. CompletableFuture

## Perché un'altra tecnologia?

`Future` permette di rappresentare un risultato futuro, ma presenta un limite importante:

```text
future.get()
```

è bloccante.

`CompletableFuture` introduce invece un modello più moderno di **programmazione asincrona**.

Il concetto fondamentale diventa:

```text
quando questa operazione termina
        ↓
esegui quest'altra operazione
        ↓
poi questa
        ↓
gestisci eventuali errori
```

---

# 8. Pipeline asincrona

Un `CompletableFuture` permette di costruire una sequenza di operazioni.

Esempio concettuale:

```text
Richiesta HTTP
      ↓
risposta
      ↓
elaborazione
      ↓
salvataggio file
      ↓
risultato
```

Ogni passaggio può essere rappresentato come uno stage della pipeline.

---

# 9. `sendAsync()`

Nel nostro progetto di download web viene utilizzato:

```text
HttpClient.sendAsync()
```

che restituisce un `CompletableFuture`.

Il modello diventa:

```text
HTTP Request
     │
     ▼
sendAsync()
     │
     ▼
CompletableFuture
     │
     └── risultato futuro
```

Il thread chiamante può continuare a lavorare senza attendere direttamente la risposta HTTP.

---

# 10. `thenApply()`

`thenApply()` permette di trasformare il risultato di uno stage.

Schema:

```text
A
 ↓
thenApply()
 ↓
B
```

Nel downloader:

```text
HttpResponse
      ↓
DownloadResult
```

È quindi particolarmente adatto alle trasformazioni:

```text
A → B
```

---

# 11. `thenAccept()`

`thenAccept()` viene utilizzato quando vogliamo consumare il risultato senza produrre un nuovo valore.

Schema:

```text
A
 ↓
thenAccept()
 ↓
azione
```

Per esempio:

```text
DownloadResult
      ↓
stampa risultato
```

Il risultato finale dello stage è `Void`.

---

# 12. `thenRun()`

`thenRun()` esegue un'azione al completamento dello stage precedente.

Non riceve il risultato precedente.

Schema:

```text
operazione
    ↓
completata
    ↓
thenRun()
    ↓
azione finale
```

È utile, per esempio, per:

* stampare un messaggio;
* aggiornare uno stato;
* avviare un'operazione finale;
* generare un report.

---

# 13. `exceptionally()`

Una pipeline asincrona deve gestire anche gli errori.

`exceptionally()` permette di definire un comportamento alternativo in caso di completamento eccezionale.

Schema:

```text
operazione
     │
     ├── successo ──→ risultato
     │
     └── errore ────→ exceptionally()
                           ↓
                    risultato alternativo
```

Nel nostro progetto, un errore può essere trasformato in un:

```text
DownloadResult
```

con:

```text
success = false
```

Questo permette di trattare in modo uniforme successi ed errori.

---

# 14. `handle()`

`handle()` permette di gestire contemporaneamente:

```text
risultato
```

e:

```text
eccezione
```

Schema:

```text
             ┌── risultato
operazione ──┤
             └── errore
                    ↓
                 handle()
                    ↓
               nuovo risultato
```

È utile quando vogliamo produrre comunque un risultato finale, indipendentemente dal fatto che l'operazione sia terminata correttamente o meno.

---

# 15. `allOf()`

Quando abbiamo molti `CompletableFuture`, possiamo avere la necessità di sapere quando **tutte le operazioni sono terminate**.

A questo serve:

```text
CompletableFuture.allOf(...)
```

Schema:

```text
Future 1 ────────┐
Future 2 ────┐   │
Future 3 ──┐ │   │
Future 4 ──┤ │   │
            ▼ ▼   ▼
             allOf()
                │
                ▼
          tutti completati
```

`allOf()` restituisce un:

```text
CompletableFuture<Void>
```

che viene completato quando tutti i future forniti hanno terminato la propria esecuzione.

---

# 16. Timeout

Una richiesta asincrona potrebbe non terminare mai o richiedere troppo tempo.

`CompletableFuture` permette di impostare un timeout con:

```text
orTimeout()
```

Concettualmente:

```text
operazione
     │
     ├── termina entro il limite
     │       ↓
     │     OK
     │
     └── supera il limite
             ↓
          TimeoutException
```

Il timeout può quindi essere gestito dalla pipeline tramite `exceptionally()` o altri meccanismi di gestione degli errori.

---

# 17. `orTimeout()` e `completeOnTimeout()`

Sono due meccanismi simili ma con una differenza importante.

### `orTimeout()`

Se il tempo viene superato:

```text
CompletableFuture
       ↓
completamento eccezionale
```

È adatto quando il timeout deve essere considerato un errore.

### `completeOnTimeout()`

Se il tempo viene superato:

```text
CompletableFuture
       ↓
risultato alternativo
```

È utile quando vogliamo fornire un valore di fallback.

Schema:

```text
                 timeout
                    │
          ┌─────────┴─────────┐
          ▼                   ▼
     orTimeout()       completeOnTimeout()
          │                   │
       errore              fallback
```

---

# 18. Confronto complessivo

| Tecnologia          | Scopo principale                                         |
| ------------------- | -------------------------------------------------------- |
| `Thread`            | Gestione diretta dei thread                              |
| `Runnable`          | Definizione di un task                                   |
| `ExecutorService`   | Gestione di Thread Pool                                  |
| `Callable<T>`       | Task che restituisce un risultato                        |
| `Future<T>`         | Rappresentazione di un risultato futuro                  |
| `CompletionService` | Recupero dei risultati nell'ordine di completamento      |
| `CompletableFuture` | Programmazione asincrona e composizione delle operazioni |

---

# 19. Evoluzione del modello

L'evoluzione può essere letta come una progressiva astrazione.

## Livello 1 — Thread

```text
Io creo il thread
Io lo avvio
Io ne gestisco il ciclo di vita
```

---

## Livello 2 — ExecutorService

```text
Io definisco il task
        ↓
ExecutorService gestisce i thread
```

---

## Livello 3 — Callable + Future

```text
Io definisco il task
        ↓
il task produce un risultato
        ↓
Future rappresenta il risultato futuro
```

---

## Livello 4 — CompletionService

```text
molti task
    ↓
molti risultati
    ↓
recupero nell'ordine di completamento
```

---

## Livello 5 — CompletableFuture

```text
operazione asincrona
        ↓
trasformazione
        ↓
altra operazione
        ↓
gestione errore
        ↓
coordinamento
        ↓
risultato finale
```

---

# 20. Esempio concettuale: downloader web

Il progetto utilizzato nel percorso didattico può essere rappresentato così:

```text
              LISTA URL
                  │
        ┌─────────┼─────────┐
        ▼         ▼         ▼
     URL 1      URL 2      URL 3
        │         │         │
        ▼         ▼         ▼
   HTTP async  HTTP async  HTTP async
        │         │         │
        ▼         ▼         ▼
   CompletableFuture
        │         │         │
        └─────────┼─────────┘
                  ▼
                allOf()
                  │
                  ▼
            Report finale
```

Ogni download può avere:

```text
SUCCESS
```

oppure:

```text
ERROR
```

oppure:

```text
TIMEOUT
```

Il report finale raccoglie tutti i risultati.

---

# 21. Confronto pratico

## ExecutorService + Callable + Future

Da utilizzare quando:

* vogliamo un modello relativamente semplice;
* abbiamo task indipendenti;
* ci serve un risultato;
* vogliamo controllare esplicitamente un Thread Pool.

Modello:

```text
submit()
   ↓
Future
   ↓
get()
```

---

## CompletionService

Da utilizzare quando:

* abbiamo molti task;
* vogliamo reagire ai risultati appena disponibili;
* l'ordine di completamento è importante.

Modello:

```text
submit()
   ↓
CompletionService
   ↓
take()
   ↓
risultato disponibile
```

---

## CompletableFuture

Da utilizzare quando:

* vogliamo operazioni asincrone;
* dobbiamo concatenare più operazioni;
* dobbiamo combinare più risultati;
* vogliamo gestire elegantemente gli errori;
* vogliamo costruire pipeline asincrone.

Modello:

```text
async operation
      ↓
thenApply()
      ↓
thenAccept()
      ↓
exceptionally()
      ↓
allOf()
```

---

# 22. Mappa concettuale finale

```text
                    CONCORRENZA JAVA
                           │
          ┌────────────────┼────────────────┐
          │                │                │
          ▼                ▼                ▼
    ExecutorService   CompletionService  CompletableFuture
          │                │                │
          │                │                ├── thenApply()
          │                │                ├── thenAccept()
          │                │                ├── thenRun()
          │                │                ├── exceptionally()
          │                │                ├── handle()
          │                │                ├── allOf()
          │                │                └── timeout
          │                │
          ├── Thread Pool  ├── take()
          │                └── poll()
          │
          ├── Runnable
          │
          └── Callable
                 │
                 ▼
               Future
                 │
                 └── get()
```

---

# 23. Domande di verifica

### Concetti fondamentali

1. Qual è la differenza tra `Thread` ed `ExecutorService`?
2. Che cosa rappresenta un Thread Pool?
3. Perché è preferibile riutilizzare i thread?
4. Qual è la differenza tra `Runnable` e `Callable`?
5. Che cosa rappresenta un `Future`?
6. Perché `Future.get()` può essere bloccante?
7. Qual è il problema dell'elaborazione sequenziale di più `Future`?

### CompletionService

8. Qual è lo scopo di `ExecutorCompletionService`?
9. Qual è la differenza tra `take()` e `poll()`?
10. Perché `CompletionService` è utile quando i task hanno tempi di esecuzione differenti?

### CompletableFuture

11. Che cosa rappresenta un `CompletableFuture`?
12. A cosa serve `thenApply()`?
13. Qual è la differenza tra `thenApply()` e `thenAccept()`?
14. A cosa serve `thenRun()`?
15. Come si gestiscono gli errori con `exceptionally()`?
16. Quando può essere utile `handle()`?
17. A cosa serve `allOf()`?
18. Che cosa succede quando viene superato il timeout di `orTimeout()`?
19. Qual è la differenza tra `orTimeout()` e `completeOnTimeout()`?

---

# 24. Regola pratica da ricordare

Una buona sintesi del percorso è:

```text
ExecutorService
    → gestisce i thread

Callable
    → definisce un task con risultato

Future
    → rappresenta il risultato futuro

CompletionService
    → permette di ricevere i risultati man mano che arrivano

CompletableFuture
    → permette di costruire pipeline asincrone
```

La progressione fondamentale è quindi:

```text
Thread
  ↓
ExecutorService
  ↓
Callable + Future
  ↓
CompletionService
  ↓
CompletableFuture
```

Non si tratta semplicemente di API alternative: rappresentano **livelli progressivi di astrazione nella gestione della concorrenza e dell'asincronia in Java**.
