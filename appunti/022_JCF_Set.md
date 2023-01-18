# Set

* Un `Set` è un tipo di collezione che, astraendo il concetto di insieme matematico, non ammette elementi duplicati.

* Questa interfaccia, quindi, permette di gestire collezioni di oggetti non duplicati identificabili univocamente mediante il metodo equals().

* No elementi duplicati (elementi non inseriti se presenti)
* No ordine (esiste un ordinamento ma è interno)
* `HashSet`
  * `Set` implementati come una Hash (accesso veloce)
* `TreeSet`
  *  `Set` implementati come un albero
* `LinkedHashSet`
  * Sottoclasse di `HashSet`
  * Mantiene l'ordine di inserimento dei dati grazie a una lista (in aggiunta alla hash)
  * Gli iterator forniscono l'ordine di inserzione

---

## Implementazione di `Set` e `SortedSet`

L’interfaccia `Set` rappresenta un insieme di elementi senza duplicati, ciò impone la presenza di una tecnica che consenta di distinguere gli oggetti. 

L’interfaccia `Set` prevede, tra l’altro, un’interfaccia derivata `SortedSet` che rappresenta la versione ordinata di `Set`.

* Un’implementazione di `Set` è `HashSet`.

* Un’implementazione di `SortedSet` è `TreeSet`.

* Entrambe non ammettono elementi duplicati.

* `HashSet` risulta più performante di `TreeSet`.

---

## Esempio di `HashSet` e `TreeSet`

HashSet | TreeSet
------------ | -------------
HashSet hash = new HashSet();	|	TreeSet tree = new TreeSet();
hash.add("c");			|		tree.add("c");
hash.add("a");			|		tree.add("a");
hash.add("b");			|		tree.add("b");
hash.add("b");			|		tree.add("b");
Iterator it = hash.iterator();	|	Iterator it = tree.iterator();
while (it.hasNext) {			|	while (it.hasNext()) {
   System.out.print(it.next());	|	System.out.print(it.next());
}				|			}

L’output sarà:
	c a b			|			a b c

---

Come si può vedere dagli output, l’elemento duplicato (b) non è stato aggiunto e nel caso del `TreeSet` sono stati anche ordinati.

Per scorrere facilmente le tabelle abbiamo usato un’implementazione dell’interfaccia `Iterator`, che permette di iterare sugli elementi della collezione. (vd anche `descendingIterator`())
