# Map

Una **Map** è una collezione che associa **chiavi (key)** a **valori (value)**.
Ogni chiave è **univoca**, mentre i valori **possono essere duplicati**.

È la struttura dati ideale per gestire **coppie chiave-valore**, come:

* codice fiscale → persona
* matricola → studente
* targa → automobile

---

## Caratteristiche principali

| Proprietà              | Descrizione                                                  |
| ---------------------- | ------------------------------------------------------------ |
| Duplicati              | ❌ Chiavi uniche, ✅ Valori duplicati                          |
| Ordinamento            | Dipende dall’implementazione                                 |
| Accesso agli elementi  | Tramite chiave                                               |
| Interfaccia base       | `Map<K, V>`                                                  |
| Derivata ordinata      | `SortedMap<K, V>`                                            |
| Implementazioni comuni | `HashMap`, `LinkedHashMap`, `TreeMap`                        |
| Thread-safe            | `Hashtable`, `ConcurrentHashMap` (in `java.util.concurrent`) |

---

## Differenze rispetto a Collection

> ⚠️ `Map` **non** estende `Collection`
> perché gestisce coppie chiave–valore invece di singoli elementi.

---

## Implementazioni principali

| Implementazione | Ordinamento             | Duplicati          | Thread-safe | Note                            |
| --------------- | ----------------------- | ------------------ | ----------- | ------------------------------- |
| `HashMap`       | ❌ Nessuno               | ❌ Chiavi duplicate | ❌ No        | Molto veloce (hash table)       |
| `LinkedHashMap` | ✅ Inserimento           | ❌ Chiavi duplicate | ❌ No        | Iterazione prevedibile          |
| `TreeMap`       | ✅ Naturale o Comparator | ❌ Chiavi duplicate | ❌ No        | Ordinamento automatico          |
| `Hashtable`     | ❌ Nessuno               | ❌ Chiavi duplicate | ✅ Sì        | Versione sincronizzata (legacy) |

---

## Interfacce collegate

| Interfaccia         | Descrizione                                                                         |
| ------------------- | ----------------------------------------------------------------------------------- |
| `Map<K,V>`          | Gestisce associazioni chiave-valore                                                 |
| `SortedMap<K,V>`    | Versione ordinata di `Map`                                                          |
| `NavigableMap<K,V>` | Estensione di `SortedMap` con navigazione facilitata (`higherKey()`, `lowerKey()`…) |

---

## Metodi principali di Map

| Metodo                                | Descrizione                                      |
| ------------------------------------- | ------------------------------------------------ |
| `void clear()`                        | Svuota la mappa                                  |
| `boolean containsKey(Object key)`     | Verifica se esiste una chiave                    |
| `boolean containsValue(Object value)` | Verifica se esiste un valore                     |
| `V get(Object key)`                   | Restituisce il valore associato alla chiave      |
| `V put(K key, V value)`               | Inserisce una coppia chiave–valore               |
| `void putAll(Map m)`                  | Inserisce tutte le coppie di un’altra mappa      |
| `V remove(Object key)`                | Rimuove una coppia tramite chiave                |
| `Set<K> keySet()`                     | Restituisce l’insieme delle chiavi               |
| `Collection<V> values()`              | Restituisce la collezione dei valori             |
| `Set<Map.Entry<K,V>> entrySet()`      | Restituisce l’insieme delle coppie chiave–valore |
| `int size()`                          | Numero di elementi                               |
| `boolean isEmpty()`                   | Verifica se la mappa è vuota                     |

---

## Esempio: HashMap

```java
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Pippo");
        map.put(2, "Pluto");
        map.put(3, "Paperino");
        map.put(4, "Qui Quo Qua");

        System.out.println("Chiave 3 → " + map.get(3));
        System.out.println("Contiene chiave 2? " + map.containsKey(2));
        System.out.println("Valori nella mappa: " + map.values());
    }
}
```

**Output possibile:**

```
Chiave 3 → Paperino
Contiene chiave 2? true
Valori nella mappa: [Pippo, Pluto, Paperino, Qui Quo Qua]
```

---

## Esempio: LinkedHashMap (ordine di inserimento)

```java
Map<String, Integer> linked = new LinkedHashMap<>();

linked.put("Uno", 1);
linked.put("Due", 2);
linked.put("Tre", 3);

System.out.println(linked);
```

**Output:**

```
{Uno=1, Due=2, Tre=3}
```

> Gli elementi vengono restituiti **nell’ordine di inserimento**.

---

## Esempio: TreeMap (ordinamento naturale)

```java
Map<String, Integer> tree = new TreeMap<>();

tree.put("C", 3);
tree.put("A", 1);
tree.put("B", 2);

System.out.println(tree);
```

**Output:**

```
{A=1, B=2, C=3}
```

> `TreeMap` ordina automaticamente le chiavi in **ordine crescente**.

---

## Esempio: Hashtable (thread-safe)

```java
import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Uno");
        table.put(2, "Due");
        table.put(3, "Tre");

        System.out.println(table);
    }
}
```

**Output:**

```
{3=Tre, 2=Due, 1=Uno}
```

> `Hashtable` è sincronizzata ma **obsoleta** — meglio usare `ConcurrentHashMap`.

---

## Iterazione su una Map

### 1️⃣ Usando `entrySet()`

```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "Pippo");
map.put(2, "Pluto");
map.put(3, "Paperino");

for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println("Chiave: " + entry.getKey() + ", Valore: " + entry.getValue());
}
```

---

### 2️⃣ Usando `keySet()` e `values()`

```java
for (Integer key : map.keySet()) {
    System.out.println("Chiave: " + key);
}
for (String value : map.values()) {
    System.out.println("Valore: " + value);
}
```

---

## Esempio con `Iterator`

```java
Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
while (it.hasNext()) {
    Map.Entry<Integer, String> entry = it.next();
    System.out.println(entry.getKey() + " → " + entry.getValue());
}
```

---

## SortedMap e TreeMap: metodi specifici

| Metodo                           | Descrizione                                        |
| -------------------------------- | -------------------------------------------------- |
| `Comparator comparator()`        | Restituisce il comparatore usato per l’ordinamento |
| `K firstKey()`                   | Chiave minima                                      |
| `K lastKey()`                    | Chiave massima                                     |
| `SortedMap subMap(K from, K to)` | Porzione compresa tra due chiavi                   |
| `SortedMap headMap(K to)`        | Chiavi minori di `to`                              |
| `SortedMap tailMap(K from)`      | Chiavi maggiori o uguali a `from`                  |

---

### Esempio: sottoMappe con TreeMap

```java
SortedMap<Integer, String> numeri = new TreeMap<>();

numeri.put(1, "Uno");
numeri.put(2, "Due");
numeri.put(3, "Tre");
numeri.put(4, "Quattro");
numeri.put(5, "Cinque");

System.out.println("HeadMap(<3): " + numeri.headMap(3));
System.out.println("TailMap(3): " + numeri.tailMap(3));
System.out.println("SubMap(2,5): " + numeri.subMap(2, 5));
```

**Output:**

```
HeadMap(<3): {1=Uno, 2=Due}
TailMap(3): {3=Tre, 4=Quattro, 5=Cinque}
SubMap(2,5): {2=Due, 3=Tre, 4=Quattro}
```

---

## Confronto tra implementazioni

| Caratteristica   | **HashMap**                 | **LinkedHashMap**      | **TreeMap**             | **Hashtable**             |
| ---------------- | --------------------------- | ---------------------- | ----------------------- | ------------------------- |
| Ordinamento      | ❌ Nessuno                   | ✅ Inserimento          | ✅ Naturale / Comparator | ❌ Nessuno                 |
| Chiavi duplicate | ❌                           | ❌                      | ❌                       | ❌                         |
| Valori duplicati | ✅                           | ✅                      | ✅                       | ✅                         |
| Thread-safe      | ❌                           | ❌                      | ❌                       | ✅                         |
| Null come chiave | ✅ (una sola)                | ✅ (una sola)           | ❌                       | ❌                         |
| Null come valore | ✅                           | ✅                      | ❌                       | ❌                         |
| Prestazioni      | ⚡ O(1)                      | ⚡ O(1)                 | 🕓 O(log n)             | 🐢 O(1), ma sincronizzata |
| Uso tipico       | Accesso veloce senza ordine | Iterazione prevedibile | Mappa ordinata          | Accesso sincronizzato     |

---

## Esempio finale comparativo

```java
Map<String, Integer> hashMap = new HashMap<>();
Map<String, Integer> linkedMap = new LinkedHashMap<>();
Map<String, Integer> treeMap = new TreeMap<>();

for (String k : List.of("B", "A", "C")) {
    hashMap.put(k, 1);
    linkedMap.put(k, 1);
    treeMap.put(k, 1);
}

System.out.println("HashMap: " + hashMap);
System.out.println("LinkedHashMap: " + linkedMap);
System.out.println("TreeMap: " + treeMap);
```

**Output:**

```
HashMap: {A=1, B=1, C=1}     // ordine interno (non garantito)
LinkedHashMap: {B=1, A=1, C=1} // ordine di inserimento
TreeMap: {A=1, B=1, C=1}       // ordine naturale
```

---

## Riepilogo

| Tipo            | Ordinamento   | Thread-safe | Null | Complessità media | Uso consigliato            |
| --------------- | ------------- | ----------- | ---- | ----------------- | -------------------------- |
| `HashMap`       | ❌ Nessuno     | ❌ No        | ✅ Sì | O(1)              | Mappa veloce non ordinata  |
| `LinkedHashMap` | ✅ Inserimento | ❌ No        | ✅ Sì | O(1)              | Ordine prevedibile         |
| `TreeMap`       | ✅ Naturale    | ❌ No        | ❌ No | O(log n)          | Mappa ordinata             |
| `Hashtable`     | ❌ Nessuno     | ✅ Sì        | ❌ No | O(1)              | Uso legacy / sincronizzato |

---

📘 *Fonte: Manuale Java – Claudio De Sio Cesari (rielaborata e aggiornata da M. Boglia)*

