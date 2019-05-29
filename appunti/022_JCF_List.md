
# Implementazione di List

L’interfaccia List rappresenta un insieme di elementi. Sono permessi elementi duplicati.

Gli oggetti vengono memorizzati in locazioni di memoria contigue quindi è possibile accedere a ciascun oggetto molto velocemente mediante il suo indice all’interno della collezione. 

Non è adatta per operazioni di ricerca poiché occorrerebbe scorrere tutta la lista per ricercare un oggetto al suo interno. È possibile scorrere facilmente la lista sia mediante la classe iterator che mediante accesso diretto utilizzando l’indice dell’oggetto.

La classe astratta **AbstractList**, che estende **AbstractCollection**, definisce un modello di comportamento generico per la costruzione di liste. 

Sostanzialmente, le liste sono come degli array dinamici, che possono variare "al volo" le loro dimensioni, per fare spazio a più o meno elementi. 

Esistono diversi tipi di liste, secondo la loro implementazione. 

Dentro **java.util** trovano posto due classi derivate da **AbstractList**, chiamate **Vector** e **ArrayList**.

Entrambe forniscono un'implementazione completa e funzionante del concetto di lista.


## Le implementazioni di List sono ArrayList e Vector.

ArrayList ha prestazioni nettamente superiori rispetto a Vector in quanto quest’ultima è sincronizzata di default mentre ArrayList non lo è (i metodi di accesso agli oggetti non sono Synchronized).


## I metodi delle Collection sono i seguenti:

* `public boolean add(Object o)`
aggiunge un oggetto alla Collection
* `public boolean addAll(Collection c)`
aggiunge una collection di oggetti alla collection considerata
* `public void clear()`
svuota la collection
* `public boolean contains(Object o)`
verifica l’esistenza di un oggetto all’interno della collection
* `public boolean containsAll(Collection c)`
verifica l’esistenza di una collection all’interno della collection considerata
* `public boolean isEmpty()`
verifica se la collection è vuota
* `public Iterator iterator()`
restituisce un’istanza di Iterator che permette di scorrere gli elementi
* `public boolean remove(Object o)`
rimuove un oggetto dalla collection
* `public boolean removeAll(Collection c)`
rimuove una collection dalla collection considerata
* `public int size()`
restituisce il numero di elementi presenti nella collection
* `public Object[] toArray()`
restituisce la collection sottoforma di array
* `public Object[] toArray(Object[] a)`
restituisce la collection sottoforma di array



I membri della classe ArrayList.
--------------------------------------------------------------
Costruttori pubblici:
---|---
ArrayList()|Costruisce una lista di tipo ArrayList inizialmente vuota.
Metodi pubblici:
---|---
void add(int i, Object o)|Aggiunge l'oggetto o alla lista, disponendolo alla posizione i. Se la posizione è già occupata, l'elemento corrispondente e tutti i suoi successivi verranno avanzati di un posto.
boolean add(Object o)|	Aggiunge l'oggetto o in coda alla lista.
void clear()|		Ripulisce la lista, eliminando tutti i suoi elementi.
Object clone()|Clona l'oggetto. ArrayList implementa l'interfaccia cloneable.
boolean contains(Object o)|Restituisce true se la lista contiene l'oggetto o.
boolean equals(Object o)|Restituisce true se o è una lista dal contenuto identico all'oggetto di invocazione.
Object get(int i)|	Restituisce l'elemento alla posizione i.
int indexOf(Object o)|	Restituisce l'indice dell'elemento o, o -1 se l'elemento non compare nella lista.
boolean isEmpty()|	Restituisce true se la lista è vuota.
Object remove(int i)|	Individua l'elemento alla posizione i, lo rimuove dalla lista e lo restituisce al codice chiamante. Tutti gli elementi successivi saranno arretrati di una posizione.
Object set(int i, Object o)|Sostituisce con o l'elemento alla posizione i. Restituisce l'elemento rimpiazzato.
int size()|		Restituisce il numero di elementi nella lista.
Object[] toArray()|	Converte la lista in un array.


I membri della classe Vector.
--------------------------------------------------------------
Costruttori pubblici:
---|---
Vector()|Costruisce una lista di tipo Vector inizialmente vuota.

Metodi pubblici:
---|---
void add(int i, Object o)|Aggiunge l'oggetto o alla lista, disponendolo alla posizione i. Se la posizione è gia occupata, l'elemento corrispondente e tutti i suoi successivi verranno avanzati di un posto.
boolean add(Object o)|	Aggiunge l'oggetto o in coda alla lista.
void clear()|		Ripulisce la lista, eliminando tutti i suoi elementi.
Object clone()|		Clona l'oggetto. Vector implementa l'interfaccia Cloneable.
boolean contains(Object o)|Restituisce true se la lista contiene l'oggetto o.
Enumeration elements()|	Restituisce l'enumerazione di tutti gli elementi della lista.
boolean equals(Object o)|Restituisce true se o è una lista dal contenuto identico all'oggetto di invocazione.
Object firstElement()|	Restituisce il primo elemento della lista.
Object get(int i)|	Restituisce l'elemento alla posizione i.
int indexOf(Object o)|	Restituisce l'indice dell'elemento o, oppure -1 se l'elemento non compare nella lista.
int indexOf(Object o, int s)|Come il precedente, solo che inizia la ricerca a partire dalla posizione s.
boolean isEmpty|Restituisce true se la lista è vuota.
Object lastElement()|	Restituisce l'ultimo elemento della lista.
Object remove(int i)|	Individua l'elemento alla posizione i, lo rimuove dalla lista e lo restituisce al codice chiamante. Tutti gli elementi successivi saranno arretrati di una posizione.
boolean remove(Object o)|Rimuove la prima occorrenza dell'oggetto o, se ne esiste almeno una. Se la rimozione ha avuto luogo, restituisce true.
Object set(int i, Object o)|Sostituisce con o l'elemento alla posizione i. Restituisce l'elemento rimpiazzato.
int size()|		Restituisce il numero degli elementi nella lista.
Object[] toArray()|	Converte la lista in un array.




## Esempio di ArrayList e Vector.

ArrayList | Vector
------------ | -------------
ArrayList lista = new ArrayList();	|Vector vett = new Vector();
lista.add("paperino");				|vett.add("paperino");
lista.add("pluto");				|vett.add("pluto");
lista.add("pippo");				|vett.add("pippo");
Iterator it = lista.iterator();		|Iterator it = vett.iterator();
while (it.hasNext()) {			|while (it.hasNext()) {
   out.print(it.next());		   	  | out.print(it.next());
}							|}



## La classe ArrayList 

* `public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable` 

* Package java.util 

La classe ArrayList permette di gestire array di oggetti dinamici. E indica il tipo di elementi contenuti nell’array.

## Costruttore 
`ArrayList()` 

Costruisce una array dinamico di oggetti con una capacità iniziale di 10 elementi. 

Alcuni Metodi 
### add 
* `boolean add (Object oggetto)`
Inserisce l'oggetto specificato alla fine del vettore restituisce true 
* `void add (int indice,Object oggetto)`
Inserisce l'oggetto nella posizione specificata all'interno del vettore, spostando gli elementi già presenti di una posizione verso destra 
restituisce true 

### clear 
* `void clear() `
* elimina tutti gli elementi presenti nel vettore 
 
### contains 
* `boolean contains(Object oggetto)`
* restituisce true se il vettore contiene l'elemento specificato; false altrimenti 1 

### get 
* `Object get(int indice)`
* restituisce l'elemento che si trova nella posizione specificata 
* 
### remove 
* `Object remove(int indice)`
* rimuove l'elemento che si trova nella posizione specificata, spostando gli elementi già presenti di una posizione verso sinistra 

### isEmpty 
* `boolean isEmpty()`
* restituisce true se l'array è vuoto; false altrimenti 
* 
### set 
* `Object set(int indice,Object oggetto)`
sostituisce l'elemento nella posizione indicata, con l'oggetto specificato 
restituisce l'elemento che si trovava in precedenza nella posizione indicata e che è stato 
sostituito 

### size 
* `int size() `
* restituisce il numero di elementi dell'array 


### LinkedList

Funzionalità di una LinkedList
  * Aggiunge in prima posizione

void addFirst (Object o)
  * Aggiunge in ultima posizione
void addLast (Object o)
  * Restituisce l'elemento di posizione index
Object get(int index)
  * Estrae il primo elemento della lista
Object getFirst()
  * Estrae l'ultimo elemento della lista
Object getLast()
  * Restituisce l'indice dell'ultimo elemento uguale a
c
int lastIndexOf (Object c)
  * Eliminano e restituiscono il primo (l'ultimo) elemento

```java
Object removeFirst ()
Object removeLast ()
```

```java
edList ll = new LinkedList();
// Crea LikedList
ll.add("10");
ll.add(new Integer(11);
ll.addLast(new Integer(13));
ll.addFirst(new Integer(20));
11
```


### Prestazioni & Algoritmi

Vector/ArrayList vs. LinkedList

### Tempo d'accesso a elemento i-esimo

* Vector: costante
* Linked List: lineare

### Tempo di inserimento in testa e di cancellazione in mezzo

* Vector: lineare
* Linked List: costante
