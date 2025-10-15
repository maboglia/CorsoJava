# List

Una **List** è una **collezione ordinata** che mantiene un **indice numerico** per ogni elemento.
Gli elementi sono accessibili per posizione e possono essere **duplicati**, poiché l’identificazione avviene tramite indice.

---

## Caratteristiche principali

| Proprietà                | Descrizione                                          |
| ------------------------ | ---------------------------------------------------- |
| Ordinata                 | Gli elementi sono memorizzati in un ordine preciso   |
| Indicizzata              | Ogni elemento è accessibile tramite un indice intero |
| Duplicati                | Sono ammessi elementi duplicati                      |
| Posizione deterministica | L’ordine di inserimento è mantenuto                  |

Le principali implementazioni sono:

| Implementazione | Struttura interna            | Vantaggi                        | Svantaggi                           |
| --------------- | ---------------------------- | ------------------------------- | ----------------------------------- |
| `ArrayList`     | Array dinamico               | Accesso diretto veloce          | Inserzione e cancellazione lente    |
| `LinkedList`    | Lista doppiamente collegata  | Inserzione/cancellazione rapide | Accesso diretto lento               |
| `Vector`        | Array dinamico sincronizzato | Thread-safe (vecchio)           | Prestazioni inferiori a `ArrayList` |

---

## L’interfaccia List

L’interfaccia `List<E>` estende `Collection<E>` e rappresenta una sequenza ordinata di elementi.

> Permette di accedere, inserire o rimuovere elementi in posizioni specifiche.

### Ereditarietà

```
Collection<E>
   ↳ List<E>
       ↳ ArrayList<E>
       ↳ LinkedList<E>
       ↳ Vector<E>
```

La classe astratta **AbstractList** (che estende **AbstractCollection**) fornisce un modello di base per creare implementazioni personalizzate di liste.

---

## Concetto chiave

Una **List** può essere vista come un **array dinamico**, la cui dimensione si adatta automaticamente in base agli inserimenti o alle rimozioni di elementi.
È molto usata quando la quantità di dati non è nota in anticipo.

---

## Metodi principali di Collection (ereditati da List)

| Metodo                                      | Descrizione                                               |
| ------------------------------------------- | --------------------------------------------------------- |
| `boolean add(E e)`                          | Aggiunge un elemento in fondo                             |
| `boolean addAll(Collection<? extends E> c)` | Aggiunge tutti gli elementi di un’altra collezione        |
| `void clear()`                              | Rimuove tutti gli elementi                                |
| `boolean contains(Object o)`                | Verifica se l’elemento è presente                         |
| `boolean containsAll(Collection<?> c)`      | Verifica se tutti gli elementi specificati sono contenuti |
| `boolean isEmpty()`                         | Ritorna `true` se la lista è vuota                        |
| `Iterator<E> iterator()`                    | Restituisce un iteratore per scorrere gli elementi        |
| `boolean remove(Object o)`                  | Rimuove la prima occorrenza dell’oggetto specificato      |
| `boolean removeAll(Collection<?> c)`        | Rimuove tutti gli elementi contenuti in `c`               |
| `int size()`                                | Numero di elementi presenti                               |
| `Object[] toArray()`                        | Converte la lista in un array                             |

---

## Metodi specifici di List

| Metodo                              | Descrizione                                   |
| ----------------------------------- | --------------------------------------------- |
| `void add(int index, E element)`    | Inserisce un elemento in posizione specifica  |
| `E get(int index)`                  | Restituisce l’elemento all’indice specificato |
| `E set(int index, E element)`       | Sostituisce l’elemento all’indice specificato |
| `E remove(int index)`               | Rimuove l’elemento all’indice specificato     |
| `int indexOf(Object o)`             | Primo indice dell’elemento specificato        |
| `int lastIndexOf(Object o)`         | Ultimo indice dell’elemento specificato       |
| `ListIterator<E> listIterator()`    | Restituisce un iteratore bidirezionale        |
| `List<E> subList(int from, int to)` | Restituisce una vista parziale della lista    |

---

## `ArrayList`

La classe `ArrayList<E>` è un’implementazione di `List` basata su **array ridimensionabile**.

```java
public class ArrayList<E> 
    extends AbstractList<E> 
    implements List<E>, RandomAccess, Cloneable, Serializable
```

**Package:** `java.util`

### Costruttori principali

```java
new ArrayList<>();          // capacità iniziale 10
new ArrayList<>(int capacity);
new ArrayList<>(Collection<? extends E> c);
```

### Metodi più usati

| Metodo                       | Descrizione                      |
| ---------------------------- | -------------------------------- |
| `boolean add(E e)`           | Aggiunge alla fine               |
| `void add(int index, E e)`   | Inserisce in posizione specifica |
| `void clear()`               | Svuota la lista                  |
| `boolean contains(Object o)` | Verifica presenza                |
| `E get(int index)`           | Restituisce elemento             |
| `E set(int index, E e)`      | Sostituisce elemento             |
| `E remove(int index)`        | Rimuove e restituisce elemento   |
| `boolean isEmpty()`          | Verifica se vuota                |
| `int size()`                 | Numero di elementi               |
| `Object[] toArray()`         | Converte in array                |

### Esempio

```java
ArrayList<String> lista = new ArrayList<>();
lista.add("Paperino");
lista.add("Pluto");
lista.add("Pippo");

for (String nome : lista) {
    System.out.println(nome);
}
```

---

## `LinkedList`

`LinkedList<E>` implementa sia `List<E>` che `Deque<E>` e rappresenta una **lista doppiamente collegata**.
Offre prestazioni ottime per inserimenti e cancellazioni in qualsiasi posizione.

### Metodi principali

| Metodo                      | Descrizione                             |
| --------------------------- | --------------------------------------- |
| `void addFirst(E e)`        | Inserisce in testa                      |
| `void addLast(E e)`         | Inserisce in coda                       |
| `E getFirst()`              | Restituisce il primo elemento           |
| `E getLast()`               | Restituisce l’ultimo elemento           |
| `E removeFirst()`           | Rimuove e restituisce il primo elemento |
| `E removeLast()`            | Rimuove e restituisce l’ultimo elemento |
| `int lastIndexOf(Object o)` | Ultima occorrenza di un elemento        |

### Esempio

```java
LinkedList<Integer> ll = new LinkedList<>();
ll.add(10);
ll.add(11);
ll.addLast(13);
ll.addFirst(20);

System.out.println(ll); // [20, 10, 11, 13]
```

---

## `Vector` (obsoleta ma compatibile)

`Vector<E>` è una vecchia implementazione sincronizzata di `List`.
Oggi si preferisce usare `ArrayList`, più efficiente e moderna.

```java
Vector<String> vett = new Vector<>();
vett.add("Paperino");
vett.add("Pluto");
vett.add("Pippo");

Iterator<String> it = vett.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

> ✅ Usa `ArrayList` a meno che non sia richiesta **sincronizzazione automatica**.

---

## Prestazioni: ArrayList vs LinkedList

| Operazione                | `ArrayList`            | `LinkedList`            |
| ------------------------- | ---------------------- | ----------------------- |
| Accesso casuale (get/set) | **O(1)**               | **O(n)**                |
| Inserimento in testa      | **O(n)**               | **O(1)**                |
| Inserimento in coda       | **O(1)** (amortizzato) | **O(1)**                |
| Cancellazione in mezzo    | **O(n)**               | **O(1)** (se nodo noto) |
| Memoria                   | Più compatta           | Maggior overhead (link) |

---

## Riepilogo

* Usa `ArrayList` per accesso rapido e frequenti letture.
* Usa `LinkedList` per frequenti inserimenti e cancellazioni.
* Evita `Vector`, usato solo per compatibilità legacy.

---

## Approfondimenti

* [Implementazione di Queue](./022_JCF_Queue.md)
* [Implementazione di Set](./022_JCF_Set.md)
* [Implementazione di Map](./022_JCFLike_Map.md)
* [Algoritmi del Java Collections Framework](./022_JCF_Algoritmi.md)

---

📘 *Fonte originale: Manuale Java - Claudio De Sio Cesari (rielaborata e aggiornata da M. Boglia)*

