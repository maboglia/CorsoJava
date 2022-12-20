# Framework Collections

Tutte le classi che permettono di gestire gruppi di oggetti, costituiscono il Java Collections Framework.

Una Collection è un contenitore in cui più oggetti vengono raggruppati in una singola entità, o meglio è una struttura dati che ha metodi usati per inserire, togliere, recuperare e gestire la struttura stessa.

---

## Collections & Map

**Collezione di elementi**

* Mantenuti mediante "reference"
* Di tipo generico (Object)
* Definiti nel package java.util

**Non specifica se**
* Ordinati / non ordinati
* Con duplicati / senza duplicati

**Gruppo di oggetti singoli**

* List
* Set
* Queue
 
**Gruppo di coppie di oggetti**

* Map

---

Il **Java Collection Framework** è costituito dai seguenti elementi:

* __Interfacce__, che definiscono le operazioni classica di una generica collezione di oggetti
  * Possono essere suddivise in __due macro-categorie__:
    * __Collection__, che sono ottimizzate per operazioni di inserimento, modifica e cancellazione di elementi   all’interno di un insieme di oggetti
    * __Map__, che sono ottimizzate per operazioni di ricerca
* __Classi__, che implementano le interfacce utilizzando differenti tipi di strutture dati 
* __Algoritmi__, che consistono in metodi per compiere operazioni sulle Collezioni, quali ad esempio operazioni di ordinamento e di ricerca

---

**Vantaggi** 
* possibilità di scrivere meno codice, 
* incremento della performance, 
* interoperabilità tra classi non relazionate tra loro, 
* riusabilità, 
* algoritmi complessi già a disposizione

Ad un primo livello si trovano le interfacce **Collection** e **Map**.

**Collection** è estesa dalle interfacce **Set**, **List** e **Queue**.

Lo scopo di queste interfacce è permettere la manipolazione delle implementazioni indipendentemente dai dettagli di rappresentazione.

Esistono implementazioni dell’interfaccia **Collection** che ammettono elementi duplicati e altre che non lo permettono, collezioni ordinate e non ordinate.

La libreria non mette a disposizione alcuna implementazione diretta di **Collection**, ma solo delle sue dirette sottointerfacce come **Set** e **List**.

---

## Funzionalità di una Collection

  * Aggiunta di un elemento alla fine; restituisce false se non inserisce
    * `boolean add (Object o) e.g., <x>.add (<y>)`
  * Aggiunge o in posizione i 
    * `boolean add (int index, Object o)`
  * Aggiunge tutti gli elementi di c
    * `boolean addAll (Collection c)`
  * Rimuove gli elementi dal contenitore
    * `void clear()`
  * Restituisce true se contiene o
    * `boolean contains (Object o)`
  * Restituisce true se contiene tutti gli elementi specificati in c
    * `boolean containsAll (Collection c)`
  * Controlla se la struttura è vuota; restituisce true in questo caso
    * `boolean isEmpty (Object o) e.g., if (<x>.isEmpty())` ...
  * Rimuove l'oggetto o 
    * `boolean remove (Object o)`
  * Rimuove elemento di posizione index
    * `Object remove (int index)`
  * Rimuove tutti gli elementi specificati in c
    * `void removeAll (Collection c)`
  * Restituisce il numero di elementi del contenitore
    * `int size ()`
  * Restituisce l'array di object contenente tutti gli elementi
    * `Object [] toArray()`
  * Restituisce un iteratore per scorrere la collection
    * `Iterator iterator()`

---

## Iterator

Astrae il problema di iterare su tutti gli elementi di una collection

### L'iterazione
  * Crea l'iteratore: `public Iterator (Collection c)`
  * Esiste un elemento successivo? `public boolean hasNext()`
  * Preleva l'elemento successivo `public Object next()`

---


## Strutture obsolete

### Vengono mantenute per compatibilità

* Vector
* Enumeration
* Hashtable
* Stack
* BitSet


---

## Framework Collections	
* [Implementazione di List](./022_JCF_List.md)	
* [Implementazione di Set](./022_JCF_Set.md)	
* [Implementazione di Map](./022_JCFLike_Map.md)	
* [Implementazione di Queue](./022_JCF_Queue.md)	
* Metodi delle Collection e delle Map	
* Algoritmi del Java Collections Framework	
* Collections e Generics	
* Classe StringTokenizer	

___source: Manuale Java - Claudio De Sio Cesari___
