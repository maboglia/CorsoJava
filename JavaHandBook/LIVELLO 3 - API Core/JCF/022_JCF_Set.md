# Set

Un **Set** è una collezione che rappresenta l’**insieme matematico**:
➡️ non ammette **elementi duplicati** e non garantisce un ordinamento specifico (salvo alcune implementazioni particolari).

---

## Caratteristiche principali

| Proprietà               | Descrizione                                                                        |
| ----------------------- | ---------------------------------------------------------------------------------- |
| Duplicati               | ❌ Non ammessi                                                                      |
| Ordinamento             | Non garantito (dipende dall’implementazione)                                       |
| Identificazione univoca | Basata sui metodi `equals()` e `hashCode()`                                        |
| Accesso casuale         | Non supportato                                                                     |
| Iterazione              | Tramite `Iterator` o `for-each`                                                    |
| Null                    | Accettato da alcune implementazioni (`HashSet`, `LinkedHashSet`), non da `TreeSet` |

---

## Interfaccia Set e SortedSet

L’interfaccia `Set<E>` estende `Collection<E>` e **assicura l’unicità degli elementi**.

L’interfaccia `SortedSet<E>` estende `Set<E>` fornendo una **vista ordinata** dell’insieme secondo:

* l’**ordine naturale** degli elementi (definito da `Comparable`);
* oppure un **`Comparator`** personalizzato.

---

## Implementazioni principali

| Implementazione | Ordinamento                         | Duplicati | Struttura interna                  | Note                             |
| --------------- | ----------------------------------- | --------- | ---------------------------------- | -------------------------------- |
| `HashSet`       | ❌ Nessuno                           | ❌         | Tabella hash                       | Accesso rapido (O(1))            |
| `LinkedHashSet` | ✅ Ordine di inserimento             | ❌         | Hash + Lista doppiamente collegata | Iterazione prevedibile           |
| `TreeSet`       | ✅ Ordinamento naturale o Comparator | ❌         | Albero bilanciato (Red-Black Tree) | Ordinato ma più lento (O(log n)) |

---

## Esempio: HashSet

```java
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hash = new HashSet<>();

        hash.add("c");
        hash.add("a");
        hash.add("b");
        hash.add("b"); // duplicato ignorato

        for (String s : hash) {
            System.out.print(s + " ");
        }
    }
}
```

**Output possibile:**

```
a b c
```

> ⚠️ L’ordine **non è garantito**: dipende dalla funzione hash interna.

---

## Esempio: TreeSet (SortedSet)

```java
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> tree = new TreeSet<>();

        tree.add("c");
        tree.add("a");
        tree.add("b");
        tree.add("b"); // duplicato ignorato

        for (String s : tree) {
            System.out.print(s + " ");
        }
    }
}
```

**Output:**

```
a b c
```

> `TreeSet` ordina automaticamente gli elementi secondo l’**ordine naturale** (es. alfabetico per stringhe, crescente per numeri).

---

## Esempio: LinkedHashSet

```java
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> linked = new LinkedHashSet<>();

        linked.add("c");
        linked.add("a");
        linked.add("b");
        linked.add("b"); // duplicato ignorato

        for (String s : linked) {
            System.out.print(s + " ");
        }
    }
}
```

**Output:**

```
c a b
```

> `LinkedHashSet` mantiene l’**ordine di inserimento** degli elementi.

---

## Confronto tra HashSet, LinkedHashSet e TreeSet

| Caratteristica                 | **HashSet**           | **LinkedHashSet**                | **TreeSet**                   |
| ------------------------------ | --------------------- | -------------------------------- | ----------------------------- |
| Duplicati                      | ❌ No                  | ❌ No                             | ❌ No                          |
| Ordinamento                    | ❌ Nessuno             | ✅ Inserimento                    | ✅ Naturale o Comparator       |
| Velocità (inserimento/ricerca) | ⚡ Molto veloce (O(1)) | ⚡ Veloce (O(1))                  | 🕓 Più lento (O(log n))       |
| Implementazione interna        | Hash table            | Hash table + linked list         | Red-black tree                |
| Accetta `null`                 | ✅ Sì (uno solo)       | ✅ Sì (uno solo)                  | ❌ No                          |
| Uso tipico                     | Insiemi senza ordine  | Insiemi ordinati per inserimento | Insiemi ordinati naturalmente |

---

## Esempio con `Iterator`

Tutte le implementazioni di `Set` supportano l’iterazione tramite `Iterator`:

```java
Set<String> insieme = new HashSet<>();
insieme.add("uno");
insieme.add("due");
insieme.add("tre");

Iterator<String> it = insieme.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

Per `SortedSet` come `TreeSet`, è possibile usare anche un **iteratore inverso**:

```java
SortedSet<Integer> numeri = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
Iterator<Integer> desc = ((TreeSet<Integer>) numeri).descendingIterator();
while (desc.hasNext()) {
    System.out.print(desc.next() + " ");
}
```

**Output:**

```
5 4 3 2 1
```

---

## SortedSet: metodi specifici

| Metodo                   | Descrizione                                                 |
| ------------------------ | ----------------------------------------------------------- |
| `first()`                | Restituisce il primo elemento                               |
| `last()`                 | Restituisce l’ultimo elemento                               |
| `headSet(E toElement)`   | Sottoinsieme con elementi minori di `toElement`             |
| `tailSet(E fromElement)` | Sottoinsieme con elementi maggiori o uguali a `fromElement` |
| `subSet(E from, E to)`   | Sottoinsieme compreso tra due valori                        |

---

## Esempio: sottoinsiemi con TreeSet

```java
SortedSet<Integer> numeri = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

System.out.println("HeadSet(<4): " + numeri.headSet(4));
System.out.println("TailSet(4): " + numeri.tailSet(4));
System.out.println("SubSet(2,6): " + numeri.subSet(2, 6));
```

**Output:**

```
HeadSet(<4): [1, 2, 3]
TailSet(4): [4, 5, 6, 7]
SubSet(2,6): [2, 3, 4, 5]
```

---

## Riepilogo

| Tipo di Set     | Ordinamento   | Prestazioni | Null  | Struttura      | Uso tipico             |
| --------------- | ------------- | ----------- | ----- | -------------- | ---------------------- |
| `HashSet`       | ❌ No          | ⚡ O(1)      | ✅ Uno | Hash table     | Raccolte non ordinate  |
| `LinkedHashSet` | ✅ Inserimento | ⚡ O(1)      | ✅ Uno | Hash + Lista   | Iterazione prevedibile |
| `TreeSet`       | ✅ Naturale    | 🕓 O(log n) | ❌     | Red-black tree | Insiemi ordinati       |

---

## Collegamenti utili

* [List](./022_JCF_List.md)
* [Queue](./022_JCF_Queue.md)
* [Map](./022_JCFLike_Map.md)
* [Algoritmi del Java Collections Framework](./022_JCF_Algoritmi.md)

---

📘 *Fonte: Manuale Java – Claudio De Sio Cesari (rielaborata e aggiornata da M. Boglia)*

