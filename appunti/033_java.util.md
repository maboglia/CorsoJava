# Il package `java.util`

Il package `java.util` è una raccolta fondamentale di classi e interfacce che forniscono strutture dati, gestione del tempo e altre utilità di base. Viene utilizzato in quasi tutte le applicazioni Java per la gestione di collezioni, calendari, operazioni matematiche, generazione di numeri casuali, e altro ancora.

---

### 1. **Collection** e **Collections**

- **Descrizione**: `Collection` è un'interfaccia che rappresenta un gruppo di oggetti (o elementi). `Collections` è una classe di utilità per operazioni di gestione delle collezioni come ordinamento e ricerca.
- **Principali Metodi**:
  - `add(Object obj)`: Aggiunge un elemento alla collezione.
  - `remove(Object obj)`: Rimuove un elemento dalla collezione.
  - `sort(List<T> list)`: Ordina gli elementi in una lista.
  - `binarySearch(List<? extends Comparable<? super T>> list, T key)`: Cerca un elemento in una lista ordinata.

---

### 2. **List**, **ArrayList** e **LinkedList**

- **Descrizione**: `List` è un'interfaccia per una sequenza ordinata di elementi. `ArrayList` e `LinkedList` sono implementazioni concrete. `ArrayList` è basata su un array dinamico, mentre `LinkedList` è una lista doppiamente collegata.
- **Principali Metodi**:
  - `get(int index)`: Restituisce l'elemento in una posizione specifica.
  - `add(E element)`: Aggiunge un elemento alla fine.
  - `remove(int index)`: Rimuove l'elemento alla posizione specificata.
  - `size()`: Restituisce la dimensione della lista.

---

### 3. **Set**, **HashSet** e **TreeSet**

- **Descrizione**: `Set` rappresenta una collezione di elementi unici. `HashSet` è basato su una tabella hash, mentre `TreeSet` implementa un set ordinato tramite un albero di ricerca binario.
- **Principali Metodi**:
  - `add(E element)`: Aggiunge un elemento al set.
  - `remove(Object obj)`: Rimuove un elemento dal set.
  - `contains(Object obj)`: Verifica se un elemento è presente.
  - `size()`: Restituisce la dimensione del set.

---

### 4. **Map**, **HashMap** e **TreeMap**

- **Descrizione**: `Map` è un'interfaccia che associa chiavi a valori. `HashMap` utilizza una tabella hash, mentre `TreeMap` ordina le coppie chiave-valore.
- **Principali Metodi**:
  - `put(K key, V value)`: Aggiunge una coppia chiave-valore alla mappa.
  - `get(Object key)`: Restituisce il valore associato a una chiave.
  - `remove(Object key)`: Rimuove la coppia chiave-valore per una chiave specifica.
  - `containsKey(Object key)`: Verifica la presenza di una chiave.

---

### 5. **Queue** e **PriorityQueue**

- **Descrizione**: `Queue` è un'interfaccia che rappresenta una coda di elementi, dove gli elementi vengono inseriti e recuperati in base a una politica FIFO. `PriorityQueue` è una coda con priorità ordinata in base all'ordine naturale degli elementi.
- **Principali Metodi**:
  - `add(E element)`: Aggiunge un elemento alla coda.
  - `poll()`: Rimuove e restituisce la testa della coda.
  - `peek()`: Restituisce la testa della coda senza rimuoverla.

---

### 6. **Iterator** e **ListIterator**

- **Descrizione**: `Iterator` è un'interfaccia per iterare sugli elementi di una collezione. `ListIterator` estende `Iterator` e permette iterazioni bidirezionali.
- **Principali Metodi**:
  - `hasNext()`: Verifica se ci sono altri elementi.
  - `next()`: Restituisce il prossimo elemento.
  - `remove()`: Rimuove l'ultimo elemento restituito dall'iteratore.
  - `hasPrevious()`: Verifica la presenza di un elemento precedente (solo in `ListIterator`).

---

### 7. **Calendar** e **GregorianCalendar**

- **Descrizione**: `Calendar` è una classe astratta per la gestione di date e orari. `GregorianCalendar` è un'implementazione che supporta il calendario gregoriano.
- **Principali Metodi**:
  - `get(int field)`: Restituisce il valore di un campo di data specifico (es. anno, mese).
  - `set(int field, int value)`: Imposta il valore di un campo di data specifico.
  - `add(int field, int amount)`: Aggiunge un valore a un campo specifico.

---

### 8. **Date**

- **Descrizione**: `Date` rappresenta una data e un orario in Java, anche se è stata sostituita da `Calendar` e dalle nuove API di tempo introdotte in Java 8.
- **Principali Metodi**:
  - `getTime()`: Restituisce il tempo in millisecondi dall'epoca (1 gennaio 1970).
  - `after(Date when)`: Verifica se la data è successiva a una data specificata.
  - `before(Date when)`: Verifica se la data è precedente a una data specificata.

---

### 9. **Random**

- **Descrizione**: Classe per la generazione di numeri casuali.
- **Principali Metodi**:
  - `nextInt()`: Restituisce un numero intero casuale.
  - `nextDouble()`: Restituisce un numero double casuale tra 0.0 e 1.0.
  - `nextBoolean()`: Restituisce un valore booleano casuale.

---

### 10. **Timer** e **TimerTask**

- **Descrizione**: `Timer` è una classe per pianificare l'esecuzione di compiti ripetuti. `TimerTask` rappresenta un compito che può essere pianificato per l'esecuzione.
- **Principali Metodi**:
  - `schedule(TimerTask task, long delay)`: Pianifica un compito per l'esecuzione dopo un certo ritardo.
  - `cancel()`: Cancella un compito pianificato.

---

### 11. **Scanner**

- **Descrizione**: Classe per l'input di dati da varie fonti come tastiera, file o stringhe.
- **Principali Metodi**:
  - `nextInt()`: Restituisce il prossimo token come intero.
  - `nextLine()`: Legge la riga successiva come stringa.
  - `close()`: Chiude lo scanner.

---

Queste classi sono cruciali per la gestione delle strutture dati e di altri aspetti delle applicazioni Java, e vengono usate frequentemente per una vasta gamma di operazioni di programmazione.
