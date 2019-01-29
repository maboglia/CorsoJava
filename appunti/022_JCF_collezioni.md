# Framework Collections

Tutte le classi che permettono di gestire gruppi di oggetti, costituiscono il Java Collections Framework.

Una Collection è un contenitore in cui più oggetti vengono raggruppati in una singola entità, o meglio è una struttura dati che ha metodi usati per inserire, togliere, recuperare e gestire la struttura stessa.

Il Java Collection Framework è costituito dai seguenti elementi:

* __Interfacce__, che definiscono le operazioni classica di una generica collezione di oggetti
  * Possono essere suddivise in __due macro-categorie__:
    * __Collection__, che sono ottimizzate per operazioni di inserimento, modifica e cancellazione di elementi   all’interno di un insieme di oggetti
    * __Map__, che sono ottimizzate per operazioni di ricerca
* __Classi__, che implementano le interfacce utilizzando differenti tipi di strutture dati 
* __Algoritmi__, che consistono in metodi per compiere operazioni sulle Collezioni, quali ad esempio operazioni di ordinamento e di ricerca

I vantaggi di avere questo framework a disposizione sono tanti: possibilità di scrivere meno codice, incremento della performance, interoperabilità tra classi non relazionate tra loro, riusabilità, algoritmi complessi già a disposizione (ad esempio quelli per l’ordinamento), ecc.

Andremo ora ad analizzare le caratteristiche del framework e studiamo le principali classi concrete che permettono di gestire al meglio le nostre collezioni di oggetti.

Ad un primo livello si trovano le interfacce Collection e Map.

Collection è estesa dalle interfacce Set, List e Queue.

Lo scopo di queste interfacce è permettere la manipolazione delle implementazioni indipendentemente dai dettagli di rappresentazione.

Questo implica che capire a cosa servono queste interfacce significa capire la maggior parte dell’utilizzo del framework.

Esistono implementazioni dell’interfaccia Collection che ammettono elementi duplicati e altre che non lo permettono, collezioni ordinate e non ordinate.

La libreria non mette a disposizione alcuna implementazione diretta di Collection, ma solo delle sue dirette sottointerfacce come Set e List.

* Un Set è un tipo di collezione che, astraendo il concetto di insieme matematico, non ammette elementi duplicati.

* Questa interfaccia, quindi, permette di gestire collezioni di oggetti non duplicati identificabili univocamente mediante il metodo equals().

* Una List è una collezione ordinata. In una lista viene sempre associato un indice a ogni elemento, che equivale alla posizione dell’elemento stesso all’interno della lista.

* Una lista ammette elementi duplicati (distinguibili dalla posizione).

* Questa interfaccia, quindi, permette di gestire collezioni di oggetti ordinati identificabili univocamente mediante un indice che rappresenta la sua posizione all’interno della lista.

* Una Queue permette di gestire collezioni di oggetti gestiti con la filosofia FIFO (First In First Out) in modo che il primo oggetto inserito sia il primo candidato ad essere letto.

* Map è una collezione che associa chiavi ai suoi elementi. Le mappe non possono contenere chiavi duplicate e ogni chiave può essere associata a un solo valore.

* Map non è propriamente una Collection poiché non implementa l’interfaccia Collection.

---

## Framework Collections	
* [Implementazione di List](./15_Implementazione_List.md)	
* [Implementazione di Set](./15_Implementazione_Set.md)	
* [Implementazione di Map](./15_Implementazione_Map.md)	
* [Implementazione di Queue](./15_Implementazione_Queue.md)	
* Metodi delle Collection e delle Map	
* Algoritmi del Java Collections Framework	
* Collections e Generics	
* Classe StringTokenizer	

___source: Manuale Java 7 - Claudio De Sio Cesari___


Collections & Map

### Collezione di elementi
* Mantenuti mediante "reference"
* Di tipo generico (Object)
* Definiti nel package java.util

### Non specifica se
* Ordinati / non ordinati
* Con duplicati / senza duplicati

### Gruppo di oggetti singoli

### List
* Contiene elementi con ordine specifico
(e.g., stesso ordine di inserzione)
* Elementi duplicati
* ArrayList
  * Implementazione di una lista mediante array
  * Ricerca veloce
  * Inserzione/cancellazione lenta
* LinkedList
  * Implementa di una lista mediante lista linkata
  * Ottimo accesso sequenziale
  * Ottima inserzione e cancellazione
  * Accesso diretto lento
* Vector
  * Mantenuto per compatibilità
  * Più lento di ArrayList

## Set
* No elementi duplicati (elementi non inseriti se presenti)
* No ordine (esiste un ordinamento ma è interno)
* HashSet
  * Set implementati come una Hash (accesso veloce)
* TreeSet
  *  Set implementati come un albero
* LinkedHashSet
  * Sottoclasse di HashSet
  * Mantiene l'ordine di inserimento dei dati grazie a una lista (in aggiunta alla hash)
  * Gli iterator forniscono l'ordine di inserzione

## Map

### Gruppo di coppie di oggetti

* Associazione chiave-valore (key-value)
  * ex: codice fiscale - persona
  * matricola - studente
* Permette ricerche data la chiave
* No chiavi duplicate
* HashMap
  * Implementazione basata su tabella di hash
  * Possibile impostare capacità e fattore di carico per ottimizzare le prestazioni
* TreeMap
  * Implementazione basata su struttura ad albero
  * Si ottengono i dati ordinati
  * Disponibilità del metodo subMap() che fornisce un sotto-albero
* LinkedHashMap
  * Sottoclasse dell'HashMap
  * Mantiene l'ordine di inserimento dei dati grazie a una lista (in aggiunta alla hash)
  * Gli iterator forniscono l'ordine di inserzione

## Strutture obsolete

### Vengono mantenute per compatibilità

* Vector
* Enumeration
* Hashtable
* Stack
* BitSet


## Funzionalità di una Collection

  * Aggiunta di un elemento alla fine; restituisce false se non inserisce
    * boolean add (Object o) e.g., <x>.add (<y>)
  * Aggiunge o in posizione i 
    * boolean add (int index, Object o)
  * Aggiunge tutti gli elementi di c
    * boolean addAll (Collection c)
  * Rimuove gli elementi dal contenitore
    *void clear()
  * Restituisce true se contiene o
    * boolean contains (Object o)
  * Restituisce true se contiene tutti gli elementi specificati in c
    * boolean containsAll (Collection c)
  * Controlla se la struttura è vuota; restituisce true in questo caso
    * boolean isEmpty (Object o) e.g., if (<x>.isEmpty()) ...
  * Rimuove l'oggetto o 
    * boolean remove (Object o)
  * Rimuove elemento di posizione index
    * Object remove (int index)
  * Rimuove tutti gli elementi specificati in c
    * void removeAll (Collection c)
  * Restituisce il numero di elementi del contenitore
    * int size ()
  * Restituisce l'array di object contenente tutti gli elementi
    * Object [] toArray()
  * Restituisce un iteratore per scorrere la collection
    * Iterator iterator()

```java
age java.util.*;
...
ArrayList c1 = new ArrayList ();
ArrayList c2 = new ArrayList ();
...
c1.add ("one");
c1.add ("two");
c1.add ("three");
c2.addAll (c1);
if (c2.isEmpty()) // false
{ ... }
c2.clear ();
```if (c2.isEmtpy()) // true
{ ...}
System.out.println (c1);
9
```java
ic class Cat { ... }
public class Dog { ... }
...
List cats = new ArrayList ();
for (int i=0; i<n; i++) {
cats.add (new Cat (...)};
}
cats.add (new Dog (...)};
...
for (int i=0; i<n; i++) {
((Cat) cats.get (i)) ...
// Dog: rilevato a run-time
```}
* Soluzione
  * Sovrascrivere in Cat il metodo add
  * Il metodo add in Cat accetta solo cat da
inserire

```java
finizione specifica
LinkedList <x> = new LinkedList ();
* Definizione generica
List <x> = new LinkedList ();
  * Utilizza l'interfaccia List invece
dell'implementazione LinkedList
  * Aumenta la libertà a livello di codice per
successive modifiche, e.g.
List <x> = new ArrayList ();
10

### Funzionalità di un SortedSet (TreeSet)
  * Estrae l'elemento più piccolo
Object first()
  * Estrae l'elemento più grande
Object last()
```  * Crea un sottoset dal set completo estraendono
una porzione
SortedSet subSet (<from>, <to>)
  * Crea un sottoset con elementi minori di quello
indicato
SortedSet headSet (<to>)
  * Crea un sottoset con elementi maggiori o uguali
a quello indicato
SortedSet tailSet (<from>)

### Funzionalità di un Vector
* Obsoleto
* Molto utilizzato
* Mantenuto per compatibilità
  * Crea Vector di 10 posizioni, capacity increment
= 1
Vector()
  * Crea Vector di dimensione size
Vector(int size)
  * Restituisce la dimensione del Vector
int capacity ()
  * Come add ma sostituisce
set(int index, Object o)
  * Restituisce elemento index
Object get(int index)
12
```java
or v = new Vector(3);
// 3 ref a null
v.add("10");
// 10 in posizione 0
v.add(new Integer(11));
// 11 in posizione 1
v.add(0, new Integer(13));
// 13 in posizione 0, poi 10 e 11
v.set(0, new Integer(20));
// 20 in posiz 0 (replace)
v.get(0);
// rende 20
```v.add(11, new Integer(30));
// exception (out of bounds)

Iterator
14Iterator

### Astrae il problema di iterare su tutti gli
elementi di una collection

### L'iterazione è permessa da
  * Crea l'iteratore
public Iterator (Collection c)
  * Esiste un elemento successivo?
public boolean hasNext()
  * Preleva l'elemento successivo
public Object next()

```java

ArrayList myList = new ArrayList ();
...
// Riempio la struttura, e.g.:
// for (int i=0; i<10; i++)
//
myList.add (new myObject (i));
...
Iterator it = myList.iterator ();
while (it.hasNext ())
((myObject)
myList.next ()).<accessoAttributo>);
```15
```java
or v = new Vector(3);
v.add ("10");
...
Iterator iv = v.iterator();
while (iv.hasNext()) {
// agire su iv.next()
}

```java
edList ll = new LinkedList();
ll.add ("10");
...
```Iterator il = ll.iterator();
while (il.hasNext()) {
// agire su il.next()
}
```

HashMap

### Get e set a tempo costante (se no
collisioni)

### Size iniziale
* initial capacity (default = 16)

### Riallocazione automatica quando load
factor superato
* load factor (default = .75)
17Algoritmi

### Definiti static su Arrays, lavorano su
array di Object
  * Merge sort, n log(n)
sort()
  * Ricerca binaria o dicotomica (assume array
ordinato)
binarySearch()

### Definiti static su Collections, lavorano
su List
  * Ordinamento dei dati
binarySearch()
sort()
  * Contrario dell'ordinamento
shuffle()
  * Ottiene valori specifici
min()
max()
18
