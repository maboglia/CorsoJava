# 📚 Sequenced Collections (Java 21)

## 🔹 Cos’è

* Prima di Java 21, le **Collection** non avevano un contratto preciso sull’**ordine degli elementi**, tranne casi particolari (`List`, `LinkedHashMap`, ecc.).
* Con Java 21 è stata introdotta la nuova **interfaccia `SequencedCollection`** e i suoi derivati:

  * `SequencedCollection<E>`
  * `SequencedSet<E>`
  * `SequencedMap<K,V>`

👉 Servono a **standardizzare l’accesso ordinato** a collezioni che hanno un ordine **ben definito** (inizio → fine).

---

## 🔹 API principali

### `SequencedCollection<E>`

Estende `Collection<E>` e aggiunge metodi per accedere a **primo e ultimo elemento**:

* `E getFirst()` → restituisce il primo elemento
* `E getLast()` → restituisce l’ultimo elemento
* `void addFirst(E e)` → inserisce in testa
* `void addLast(E e)` → inserisce in coda
* `SequencedCollection<E> reversed()` → vista della collezione invertita

---

### `SequencedSet<E>`

Estende `Set<E>` + `SequencedCollection<E>`.
Garantisce **ordine deterministico** degli elementi.

Implementazioni:

* `LinkedHashSet` → mantiene ordine di inserimento
* `SortedSet` → mantiene ordine naturale o definito da `Comparator`

---

### `SequencedMap<K,V>`

Estende `Map<K,V>`, aggiungendo metodi simili a `Deque`:

* `Map.Entry<K,V> firstEntry()`
* `Map.Entry<K,V> lastEntry()`
* `void putFirst(K,V)`
* `void putLast(K,V)`
* `SequencedMap<K,V> reversed()`

Implementazioni:

* `LinkedHashMap`
* `SortedMap`

---

## 🔹 Esempi pratici

### 1️⃣ SequencedCollection con `ArrayList`

```java
import java.util.*;

public class SequencedCollectionDemo {
    public static void main(String[] args) {
        SequencedCollection<String> sc = new ArrayList<>();

        sc.addFirst("Primo");
        sc.addLast("Ultimo");
        sc.add("Centro");

        System.out.println(sc.getFirst());  // Primo
        System.out.println(sc.getLast());   // Ultimo
        System.out.println(sc.reversed());  // [Ultimo, Centro, Primo]
    }
}
```

---

### 2️⃣ SequencedSet con `LinkedHashSet`

```java
SequencedSet<Integer> ss = new LinkedHashSet<>();
ss.addFirst(10);
ss.addLast(20);
ss.add(30);

System.out.println(ss);          // [10, 20, 30]
System.out.println(ss.reversed()); // [30, 20, 10]
```

---

### 3️⃣ SequencedMap con `LinkedHashMap`

```java
SequencedMap<Integer, String> sm = new LinkedHashMap<>();
sm.putFirst(1, "Uno");
sm.putLast(2, "Due");
sm.putLast(3, "Tre");

System.out.println(sm.firstEntry()); // 1=Uno
System.out.println(sm.lastEntry());  // 3=Tre
System.out.println(sm.reversed());   // {3=Tre, 2=Due, 1=Uno}
```

---

## 🔹 Vantaggi

✅ API uniforme per accedere a primo/ultimo elemento.
✅ Più leggibile rispetto a `list.get(0)` o `list.get(list.size()-1)`.
✅ Si applica a più collezioni (liste, set, mappe).
✅ `reversed()` fornisce viste invertite senza copiare i dati.

❌ Disponibile solo da **Java 21**.

