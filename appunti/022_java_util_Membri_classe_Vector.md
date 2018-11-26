I membri della classe Vector.
--------------------------------------------------------------
Costruttori pubblici:
..|..
---|---
Vector()|Costruisce una lista di tipo Vector inizialmente vuota.

Metodi pubblici:
..|..
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