I membri della classe ArrayList.
--------------------------------------------------------------
Costruttori pubblici:
..|..
---|---
ArrayList()|Costruisce una lista di tipo ArrayList inizialmente vuota.
Metodi pubblici:
..|..
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