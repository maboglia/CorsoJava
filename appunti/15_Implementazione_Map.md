# Implementazione di Map e SortedMap
L’interfaccia Map rappresenta un insieme di elementi, ad ognuno dei quali viene associata una chiave univoca. Non sono permessi elementi duplicati e null.

E’ preferibile usare le mappe piuttosto che i set in quanto è possibile ricercare facilmente un oggetto all’interno di una mappa a partire dalla sua chiave univoca ed anche perché è possibile accedere agli oggetti in modo veloce.

Le implementazioni di Map sono HashTable e HashMap.
Un’implementazione di SortedMap è TreeMap. 

Entrambe non ammettono elementi duplicati.
HashMap risulta più performante di HashTable, in quanto quest’ultima è sincronizzata di default mentre HashMap non lo è (i metodi di accesso agli oggetti non sono Synchronized)
HashMap risulta più performante di TreeMap, in quanto quest’ultima gestisce l’ordinamento

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
map.put(1, "Sam");
map.put(2, "John");
map.put(3, "Sunny");
map.put(4, "Linda");
  
Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
while (it.hasNext()) {
	Map.Entry<Integer, String> entry = it.next();
	System.out.println("Chiave: " + entry.getKey());
	System.out.println("Valore: " + entry.getValue());
}
```

Per iterare sulle mappe occorre utilizzare, oltre al solito iterator, anche:
* la classe innestata Map.Entry astrae una coppia di tipo chiave-valore che rappresenta un elemento di una mappa
* il metodo entrySet() restituisce un insieme ordinato (in base alle chiavi) degli elementi della mappa