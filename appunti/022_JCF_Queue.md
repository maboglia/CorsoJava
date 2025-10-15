# Queue

Una **Queue** è una collezione ordinata che gestisce gli elementi secondo la logica **FIFO** (*First In, First Out*):
➡️ il **primo elemento inserito** è anche **il primo ad essere rimosso**.

Le code vengono spesso utilizzate per:

* gestire richieste in sequenza (es. processi, messaggi, task);
* implementare strutture dati come **buffer** o **code di stampa**;
* simulare comportamenti asincroni o concorrenziali.

---

## Caratteristiche principali

| Proprietà                    | Descrizione                                                                     |
| ---------------------------- | ------------------------------------------------------------------------------- |
| Ordinamento logico           | FIFO (First In First Out)                                                       |
| Accesso limitato             | Solo in testa (rimozione) e in coda (inserimento)                               |
| Nessun indice diretto        | Gli elementi non sono accessibili tramite indice                                |
| Operazioni principali        | `offer()`, `poll()`, `peek()`                                                   |
| Gestione sicura degli errori | Metodi che lanciano eccezioni o restituiscono valori speciali (`null`, `false`) |

---

## Interfaccia Queue

L’interfaccia `Queue<E>` estende `Collection<E>` e aggiunge nuovi metodi per gestire gli elementi **in modo controllato**.
Ogni operazione esiste in **due versioni**:

| Operazione        | Lancia eccezione se fallisce | Restituisce valore speciale |
| ----------------- | ---------------------------- | --------------------------- |
| Inserimento       | `add(e)`                     | `offer(e)`                  |
| Lettura (testa)   | `element()`                  | `peek()`                    |
| Rimozione (testa) | `remove()`                   | `poll()`                    |

> Le implementazioni più comuni di `Queue` sono `LinkedList`, `PriorityQueue` e `ArrayDeque`.

---

## Implementazioni principali

| Implementazione | Struttura interna           | Caratteristiche principali                                        |
| --------------- | --------------------------- | ----------------------------------------------------------------- |
| `LinkedList`    | Lista doppiamente collegata | Supporta FIFO e operazioni in testa/coda                          |
| `PriorityQueue` | Heap binario                | Ordina automaticamente gli elementi per priorità                  |
| `ArrayDeque`    | Array ridimensionabile      | Gestisce efficacemente inserimenti in testa e in coda (FIFO/LIFO) |

---

## Esempio: Queue con LinkedList

```java
Queue<Integer> q = new LinkedList<>();

// Aggiunta di elementi
for (int i = 0; i < 5; i++)
    q.add(i);

System.out.println("Elementi della coda: " + q);

// Rimozione del primo elemento (testa)
int removed = q.remove();
System.out.println("Elemento rimosso: " + removed);

// Visualizza la testa senza rimuoverla
int head = q.peek();
System.out.println("Testa della coda: " + head);

// Dimensione della coda
System.out.println("Dimensione: " + q.size());
```

**Output**

```
Elementi della coda: [0, 1, 2, 3, 4]
Elemento rimosso: 0
Testa della coda: 1
Dimensione: 4
```

---

## Esempio: PriorityQueue

La **PriorityQueue** è una coda che **estrae gli elementi in base alla loro priorità**, non in ordine di inserimento.
Gli elementi devono essere *comparabili* (implementare `Comparable`) o forniti con un `Comparator`.

```java
Queue<String> coda = new PriorityQueue<>();

for (int i = 0; i < 5; i++) {
    coda.offer("Elemento #" + i);
}

// Stampa ed estrae in base all’ordine naturale
while (!coda.isEmpty()) {
    System.out.println(coda.poll());
}
```

> 🔸 A differenza di `LinkedList`, gli elementi vengono gestiti **secondo un ordinamento interno**.
> 🔸 È utile per implementare **scheduler**, **gestori di eventi** o **code con priorità**.

---

## Interfaccia Deque

`Deque<E>` (*Double-Ended Queue*) estende `Queue` e permette di **inserire e rimuovere elementi da entrambe le estremità**.
Può essere usata come:

* **Queue** (FIFO)
* **Stack** (LIFO)

---

### Esempio: Deque con LinkedList

```java
Deque<String> deque = new LinkedList<>();

deque.add("Elemento 1 (Tail)");
deque.addFirst("Elemento 2 (Head)");
deque.addLast("Elemento 3 (Tail)");
deque.push("Elemento 4 (Head)");
deque.offer("Elemento 5 (Tail)");
deque.offerFirst("Elemento 6 (Head)");

System.out.println(deque);

deque.removeFirst();
deque.removeLast();
System.out.println("Dopo rimozione testa e coda: " + deque);
```

**Output**

```
[Elemento 6 (Head), Elemento 4 (Head), Elemento 2 (Head), Elemento 1 (Tail), Elemento 3 (Tail), Elemento 5 (Tail)]
Dopo rimozione testa e coda: [Elemento 4 (Head), Elemento 2 (Head), Elemento 1 (Tail), Elemento 3 (Tail)]
```

---

### Esempio: ArrayDeque

`ArrayDeque` è un’implementazione ad alte prestazioni di `Deque` basata su array ridimensionabile.

```java
Deque<String> dq = new ArrayDeque<>();

dq.add("One");
dq.addFirst("Two");
dq.addLast("Three");

System.out.println("ArrayDeque: " + dq);

// Come stack (LIFO)
System.out.println("Pop: " + dq.pop());

// Come queue (FIFO)
System.out.println("Poll: " + dq.poll());
System.out.println("PollFirst: " + dq.pollFirst());
System.out.println("PollLast: " + dq.pollLast());
```

---

## Metodi principali di Queue e Deque

| Metodo                               | Descrizione                                                |
| ------------------------------------ | ---------------------------------------------------------- |
| `offer(E e)`                         | Inserisce un elemento in coda                              |
| `poll()`                             | Rimuove e restituisce l’elemento in testa                  |
| `peek()`                             | Restituisce la testa senza rimuoverla                      |
| `addFirst(E e)` / `addLast(E e)`     | Inserisce in testa/coda                                    |
| `removeFirst()` / `removeLast()`     | Rimuove dalla testa/coda                                   |
| `pollFirst()` / `pollLast()`         | Rimuove e restituisce testa/coda (null se vuoto)           |
| `offerFirst(E e)` / `offerLast(E e)` | Inserisce in testa/coda se possibile                       |
| `peekFirst()` / `peekLast()`         | Restituisce testa/coda senza rimuovere                     |
| `pop()`                              | Rimuove e restituisce l’elemento in testa (come uno stack) |

---

## Queue thread-safe

Le implementazioni **thread-safe** di code e deque si trovano nel package `java.util.concurrent`:

| Classe                  | Descrizione                               |
| ----------------------- | ----------------------------------------- |
| `ConcurrentLinkedQueue` | Coda non bloccante, altamente performante |
| `LinkedBlockingQueue`   | Coda bloccante basata su lista            |
| `PriorityBlockingQueue` | Versione thread-safe di `PriorityQueue`   |
| `ArrayBlockingQueue`    | Coda a dimensione fissa, bloccante        |
| `LinkedBlockingDeque`   | Implementazione di `Deque` bloccante      |

> Queste classi sono fondamentali per la **programmazione concorrente** in Java (es. produttore/consumatore).

---

## Riepilogo

| Tipo di Queue           | Ordine                | Thread-safe | Note                             |
| ----------------------- | --------------------- | ----------- | -------------------------------- |
| `LinkedList`            | FIFO                  | ❌           | Implementa anche `Deque`         |
| `PriorityQueue`         | Ordinata per priorità | ❌           | Usa `Comparable`/`Comparator`    |
| `ArrayDeque`            | FIFO / LIFO           | ❌           | Alternativa efficiente a `Stack` |
| `PriorityBlockingQueue` | Ordinata per priorità | ✅           | Uso concorrente                  |
| `ConcurrentLinkedQueue` | FIFO                  | ✅           | Uso concorrente non bloccante    |

---

## Approfondimenti

* [Implementazione di List](./022_JCF_List.md)
* [Implementazione di Set](./022_JCF_Set.md)
* [Implementazione di Map](./022_JCFLike_Map.md)
* [Algoritmi del Java Collections Framework](./022_JCF_Algoritmi.md)

---

📘 *Fonte originale: Manuale Java - Claudio De Sio Cesari (rielaborata e aggiornata da M. Boglia)*

