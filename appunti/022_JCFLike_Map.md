# Map


* `Map` è una collezione che associa chiavi ai suoi elementi. Le mappe non possono contenere chiavi duplicate e ogni chiave può essere associata a un solo valore.

* `Map` non è propriamente una Collection poiché non implementa l’interfaccia Collection.
* Associazione chiave-valore (key-value)
  * codice fiscale - persona
  * matricola - studente
* Permette ricerche data la chiave
* Non possono esserci chiavi duplicate

---

## Implementazioni di Map  

* **HashMap**
  * Implementazione basata su tabella di hash
  * Possibile impostare capacità e fattore di carico per ottimizzare le prestazioni
* **TreeMap**
  * Implementazione basata su struttura ad albero
  * Si ottengono i dati ordinati
  * Disponibilità del metodo subMap() che fornisce un sotto-albero
* **LinkedHashMap**
  * Sottoclasse dell'HashMap
  * Mantiene l'ordine di inserimento dei dati grazie a una lista (in aggiunta alla hash)
  * Gli iterator forniscono l'ordine di inserzione


---


## Implementazione di Map e SortedMap

L’interfaccia `Map` rappresenta un insieme di elementi, ad ognuno dei quali viene associata una chiave univoca. 

Non sono permessi elementi duplicati e null.

E’ preferibile usare le mappe piuttosto che i set in quanto è possibile ricercare facilmente un oggetto all’interno di una mappa a partire dalla sua chiave univoca ed anche perché è possibile accedere agli oggetti in modo veloce.

Le implementazioni di `Map` sono HashTable e `HashMap`.

Un’implementazione di `SortedMap` è `TreeMap`. 

Entrambe non ammettono elementi duplicati.

`HashMap` risulta più performante di `HashTable`, in quanto quest’ultima è sincronizzata di default mentre `HashMap` non lo è 
(i metodi di accesso agli oggetti non sono Synchronized)

`HashMap` risulta più performante di `TreeMap`, in quanto quest’ultima gestisce l’ordinamento

---

## I metodi delle Map sono i seguenti:

* `public void clear()`
permette di svuotare la `Map`
* `public boolean containsKey(Object arg0)`
verifica l’esistenza di un oggetto all’interno della `Map` in base alla sua chiave
* `public boolean containsValue(Object arg0)`
verifica l’esistenza di un oggetto all’interno della `Map` in base al suo valore
* `public Set entrySet()`
restituisce la `Map` sottoforma di Set
* `public Object get(Object arg0)`
restituisce l’oggetto in base alla sua chiave
* `public boolean isEmpty()`
verifica se la `Map` è vuota
* `public Set keySet()`
restituisce le chiavi della `Map` sottoforma di Set
* `public Object put(Object arg0, Object arg1)`
aggiunge un oggetto alla `Map`
* `public void putAll(Map arg0)`
aggiunge una `Map` di oggetti alla `Map` considerata
* `public Object remove(Object arg0)`
rimuove un oggetto dalla `Map`
* `public int size()`
restituisce il numero di elementi presenti nella `Map`
* `public Collection values()`
restituisce la `Map` sottoforma di Collection


---



### Funzionalità di un SortedMap (TreeMap)

* `Comparator comparator ()` Produce meccanismo di confronto

* `Object firstKey()` Produce la chiave più piccola

* `Object lastKey()` Produce la chiave più grande

* `SortedMap subMap(<from>, <to>)` Crea una sotto-map dalla map completa
estraendono una porzione

* `SortedMap headMap(<to>)` Crea una sotto-map con elementi minori di
quello indicato

* `SortedMap tailMap(<from>)` Crea una sotto-map con elementi maggiori o
uguali a quello indicato

---

## Esempio di HashTable e HashMap.
HashTable | HashMap
------------ | -------------
HashTable hash = new HashTable();	|	HashMap map = new HashMap();
hash.put("1", "Data attuale");		|	map.put("1", "Data attuale");
hash.put("2", new Date());			|	map.put("2", new Date());
hash.put("3", hash);				|	map.put("3", map);
int size = hash.size();			|	int size = map.size();
for (int i=1; 1<=size; i++) {		|	for (int i=1; 1<=size; i++) {
   out.print(hash.get(""+i));		   |	out.print(map.get(""+i));
}							|	}

E’ possibile aggiungere elementi mediante il metodo put(Object key, Object value) e si recuperano mediante il metodo get(Object key). 
In particolare, il metodo get() permette un recupero molto performante dell’elemento della collezione, mediante la specifica della chiave.

---

## Map.Entry ed entrySet()

Per iterare sulle mappe occorre utilizzare, oltre al solito iterator, anche:

* la **classe innestata** `Map.Entry`, la quale astrae una coppia di tipo chiave-valore che rappresenta un elemento di una mappa
* il metodo **entrySet()** restituisce un insieme ordinato (in base alle chiavi) degli elementi della mappa

---

## Iterator: l’iterazione sulle mappe.

```java
HashMap<Integer, String> map = new HashMap<Integer, String>();
map.put(1, "pippo");
map.put(2, "pluto");
map.put(3, "paperino");
map.put(4, "quiquoqua");
  
Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
while (it.hasNext()) {
	Map.Entry<Integer, String> entry = it.next();
	System.out.println("Chiave: " + entry.getKey());
	System.out.println("Valore: " + entry.getValue());
}
```