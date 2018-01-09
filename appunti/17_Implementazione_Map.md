# Implementazione di Map e SortedMap
L’interfaccia Map rappresenta un insieme di elementi, ad ognuno dei quali viene associata una chiave univoca. Non sono permessi elementi duplicati e null.

E’ preferibile usare le mappe piuttosto che i set in quanto è possibile ricercare facilmente un oggetto all’interno di una mappa a partire dalla sua chiave univoca ed anche perché è possibile accedere agli oggetti in modo veloce.

Le implementazioni di Map sono HashTable e HashMap.
Un’implementazione di SortedMap è TreeMap. 

Entrambe non ammettono elementi duplicati.

HashMap risulta più performante di HashTable, in quanto quest’ultima è sincronizzata di default mentre HashMap non lo è (i metodi di accesso agli oggetti non sono Synchronized)

HashMap risulta più performante di TreeMap, in quanto quest’ultima gestisce l’ordinamento


## I metodi delle Map sono i seguenti:

* public void clear()
permette di svuotare la map
* public boolean containsKey(Object arg0)
verifica l’esistenza di un oggetto all’interno della map in base alla sua chiave
* public boolean containsValue(Object arg0)
verifica l’esistenza di un oggetto all’interno della map in base al suo valore
* public Set entrySet()
restituisce la map sottoforma di Set
* public Object get(Object arg0)
restituisce l’oggetto in base alla sua chiave
* public boolean isEmpty()
verifica se la map è vuota
* public Set keySet()
restituisce le chiavi della map sottoforma di Set
* public Object put(Object arg0, Object arg1)
aggiunge un oggetto alla map
* public void putAll(Map arg0)
aggiunge una map di oggetti alla map considerata
* public Object remove(Object arg0)
rimuove un oggetto dalla map
* public int size()
restituisce il numero di elementi presenti nella map
* public Collection values()
restituisce la map sottoforma di Collection




## Esempio di HashTable e HashMap.
HashTable | HashMap
------------ | -------------
HashTable hash = new HashTable();	|	HashMap map = new HashMap();
hash.put("1", "Data attuale");		|	map.put("1", "Data attuale");
hash.put("2", new Date());			|	map.put("2", new Date());
hash.put("3", hash);				|	map.put("3", hash);
int size = hash.size();			|	int size = hash.size();
for (int i=1; 1<=size; i++) {		|	for (int i=1; 1<=size; i++) {
   out.print(hash.get(""+i));		   |	out.print(hash.get(""+i));
}							|	}

E’ possibile aggiungere elementi mediante il metodo put(Object key, Object value) e si recuperano mediante il metodo get(Object key). 
In particolare, il metodo get() permette un recupero molto performante dell’elemento della collezione, mediante la specifica della chiave.

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
## Map.Entry ed entrySet()
Per iterare sulle mappe occorre utilizzare, oltre al solito iterator, anche:
* la classe innestata Map.Entry, la quale astrae una coppia di tipo chiave-valore che rappresenta un elemento di una mappa
* il metodo entrySet() restituisce un insieme ordinato (in base alle chiavi) degli elementi della mappa