# Framework Collections

Il **Java Collections Framework (JCF)** fornisce un insieme unificato di **interfacce, classi e algoritmi** per gestire insiemi di oggetti in modo efficiente e flessibile.
È parte integrante del package `java.util`.

Una **Collection** è un contenitore che raggruppa più oggetti in una singola unità logica, offrendo metodi per **inserire**, **rimuovere**, **ricercare** e **gestire** gli elementi.

![JCF](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/java_jcf.gif)

---

## Collections & Map

### Collezione di elementi

* Gli elementi sono mantenuti tramite **reference**
* Sono **oggetti generici** (possono essere di qualunque tipo, tramite generics)
* Tutte le interfacce e classi risiedono in `java.util`

### Caratteristiche non definite

Una `Collection` non specifica se:

* Gli elementi sono **ordinati o non ordinati**
* Gli elementi possono essere **duplicati o unici**

### Classificazione principale

**Gruppi di oggetti singoli**

* `List`
* `Set`
* `Queue`

**Gruppi di coppie chiave–valore**

* `Map`

---

## Struttura del Framework

Il **Java Collection Framework** è costituito da:

1. **Interfacce**
   Definiscono le operazioni fondamentali sulle collezioni.
   Si dividono in due categorie principali:

   * **Collection**, ottimizzate per operazioni di inserimento, modifica e cancellazione di elementi.
   * **Map**, ottimizzate per operazioni di ricerca basate su chiavi.

2. **Classi**
   Implementano le interfacce, utilizzando diverse **strutture dati interne** (array, liste collegate, alberi, hash table, ecc.).

3. **Algoritmi**
   Sono metodi statici (principalmente nella classe `Collections`) che consentono operazioni comuni come **ordinamento**, **ricerca**, **shuffling**, **reverse**, ecc.

---

## Vantaggi del Framework Collections

* Riduzione del codice da scrivere
* Migliori performance grazie a implementazioni ottimizzate
* Interoperabilità tra classi non direttamente correlate
* Elevato grado di riusabilità
* Disponibilità di algoritmi complessi già implementati

---

## Gerarchia delle principali interfacce

* **Collection** è la superinterfaccia generale, estesa da:

  * `List`
  * `Set`
  * `Queue`

* **Map** è separata da `Collection`, ma fa parte dello stesso framework.

Le interfacce permettono di **manipolare le collezioni indipendentemente dall’implementazione concreta**, che può essere:

* Ordinata o non ordinata
* Con o senza duplicati

> ⚠️ Non esiste un’implementazione diretta di `Collection`.
> Le implementazioni concrete riguardano le sue sottointerfacce (`List`, `Set`, `Queue`).

---

## Principali metodi di una Collection

| Operazione                                                       | Descrizione                     | Metodo                                      |
| ---------------------------------------------------------------- | ------------------------------- | ------------------------------------------- |
| Aggiungere un elemento                                           | Inserisce un nuovo elemento     | `boolean add(E e)`                          |
| Aggiungere in posizione specifica (solo `List`)                  | Inserisce in indice specificato | `void add(int index, E e)`                  |
| Aggiungere tutti gli elementi di un’altra collezione             | Unisce due collezioni           | `boolean addAll(Collection<? extends E> c)` |
| Rimuovere tutti gli elementi                                     | Svuota la collezione            | `void clear()`                              |
| Verificare se contiene un elemento                               | Ricerca per uguaglianza         | `boolean contains(Object o)`                |
| Verificare se contiene tutti gli elementi di un’altra collezione |                                 | `boolean containsAll(Collection<?> c)`      |

---

## Altri metodi utili

| Operazione                                                   | Descrizione                             | Metodo                               |
| ------------------------------------------------------------ | --------------------------------------- | ------------------------------------ |
| Verificare se è vuota                                        | Ritorna `true` se non ci sono elementi  | `boolean isEmpty()`                  |
| Rimuovere un elemento specifico                              | Cancella il primo elemento uguale a `o` | `boolean remove(Object o)`           |
| Rimuovere in posizione specifica (solo `List`)               | Cancella l’elemento all’indice `index`  | `E remove(int index)`                |
| Rimuovere tutti gli elementi presenti in un’altra collezione |                                         | `boolean removeAll(Collection<?> c)` |
| Restituire la dimensione                                     | Numero di elementi                      | `int size()`                         |
| Convertire in array                                          |                                         | `Object[] toArray()`                 |
| Ottenere un iteratore                                        | Per scorrere gli elementi               | `Iterator<E> iterator()`             |

---

## L’interfaccia Iterator

L’interfaccia `Iterator` astrae il meccanismo di scorrimento degli elementi di una collezione, indipendentemente dalla sua struttura interna.

### Metodi principali

```java
Iterator<String> it = collection.iterator();

while (it.hasNext()) {
    String elemento = it.next();
    System.out.println(elemento);
}
```

| Metodo              | Descrizione                                     |
| ------------------- | ----------------------------------------------- |
| `boolean hasNext()` | Ritorna `true` se esiste un elemento successivo |
| `E next()`          | Restituisce l’elemento successivo               |
| `void remove()`     | Rimuove l’ultimo elemento restituito            |

---

## Classi considerate “obsolete”

Mantenute per compatibilità con versioni precedenti di Java, ma **non consigliate per nuovi progetti**:

* `Vector`
* `Stack`
* `Hashtable`
* `Enumeration`
* `BitSet`

> Usa invece `ArrayList`, `Deque`, `HashMap` e gli iteratori moderni.

---

## Framework Collections – Approfondimenti

* [Implementazione di List](./022_JCF_List.md)
* [Implementazione di Set](./022_JCF_Set.md)
* [Implementazione di Map](./022_JCFLike_Map.md)
* [Implementazione di Queue](./022_JCF_Queue.md)
* Metodi delle Collection e delle Map
* Algoritmi del Java Collections Framework
* Collections e Generics
* Classe StringTokenizer

---

📘 *Fonte originale: Manuale Java - Claudio De Sio Cesari (versione aggiornata e riorganizzata)*

