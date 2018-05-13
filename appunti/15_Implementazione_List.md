# Implementazione di List

L’interfaccia List rappresenta un insieme di elementi. Sono permessi elementi duplicati.

Gli oggetti vengono memorizzati in locazioni di memoria contigue quindi è possibile accedere a ciascun oggetto molto velocemente mediante il suo indice all’interno della collezione. 

Non è adatta per operazioni di ricerca poiché occorrerebbe scorrere tutta la lista per ricercare un oggetto al suo interno. È possibile scorrere facilmente la lista sia mediante la classe iterator che mediante accesso diretto utilizzando l’indice dell’oggetto.

## Le implementazioni di List sono ArrayList e Vector.

ArrayList ha prestazioni nettamente superiori rispetto a Vector in quanto quest’ultima è sincronizzata di default mentre ArrayList non lo è (i metodi di accesso agli oggetti non sono Synchronized).


## I metodi delle Collection sono i seguenti:

* public boolean add(Object o)
aggiunge un oggetto alla Collection
* public boolean addAll(Collection c)
aggiunge una collection di oggetti alla collection considerata
* public void clear()
svuota la collection
* public boolean contains(Object o)
verifica l’esistenza di un oggetto all’interno della collection
* public boolean containsAll(Collection c)
verifica l’esistenza di una collection all’interno della collection considerata
* public boolean isEmpty()
verifica se la collection è vuota
* public Iterator iterator()
restituisce un’istanza di Iterator che permette di scorrere gli elementi
* public boolean remove(Object o)
rimuove un oggetto dalla collection
* public boolean removeAll(Collection c)
rimuove una collection dalla collection considerata
* public int size()
restituisce il numero di elementi presenti nella collection
* public Object[] toArray()
restituisce la collection sottoforma di array
* public Object[] toArray(Object[] a)
restituisce la collection sottoforma di array




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
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable 
Package 
java.util 
La classe ArrayList permette di gestire array di oggetti dinamici. E indica il tipo di elementi contenuti nell’array. 
Costruttore 
ArrayList() 
Costruisce una array dinamico di oggetti con una capacità iniziale di 10 elementi. 
Alcuni Metodi 
### add 
* boolean add (Object oggetto)
Inserisce l'oggetto specificato alla fine del vettore restituisce true 
* void add (int indice,Object oggetto)
Inserisce l'oggetto nella posizione specificata all'interno del vettore, spostando gli elementi già presenti di una posizione verso destra 
restituisce true 

### clear 
* void clear() 
* elimina tutti gli elementi presenti nel vettore 
 
### contains 
* boolean contains(Object oggetto)
* restituisce true se il vettore contiene l'elemento specificato; false altrimenti 1 

### get 
* Object get(int indice)
* restituisce l'elemento che si trova nella posizione specificata 
* 
### remove 
* Object remove(int indice)
* rimuove l'elemento che si trova nella posizione specificata, spostando gli elementi già presenti di una posizione verso sinistra 

### isEmpty 
* boolean isEmpty()
* restituisce true se l'array è vuoto; false altrimenti 
* 
### set 
* Object set(int indice,Object oggetto)
sostituisce l'elemento nella posizione indicata, con l'oggetto specificato 
restituisce l'elemento che si trovava in precedenza nella posizione indicata e che è stato 
sostituito 

### size 
* int size() 
* restituisce il numero di elementi dell'array 