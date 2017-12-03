# Package java.util	
___source: Manuale Java 7 - Claudio De Sio Cesari___

## Framework Collections	
* Metodi delle Collection e delle Map	
* Implementazione di Set e SortedSet	
* Implementazione di Map e SortedMap	
* Implementazione di List	
* Implementazione di Queue	
* Algoritmi del Java Collections Framework	
* Collections e Generics	
* Classe StringTokenizer	

### Package java.util
Il package java.util contiene una serie di classi utili come il framework "Collections" per gestire collezioni eterogenee di ogni tipo, il modello a eventi, classi per la gestione facilitata delle date e degli orari, classi per la gestione dell’internazionalizzazione e tante altre utilità come un separatore di stringhe (StringTokenizer), un generatore di numeri casuali ecc.

## Framework Collections
Nella normale attività di programmazione ci si trova spesso a dover gestire un insieme di dati. 

In Java, le soluzioni per la gestione di un insieme di oggetti sono molteplici e, come sempre, a seconda delle circostanze, bisogna individuare la soluzione migliore da adottare.

Tutte le classi che permettono di gestire gruppi di oggetti, costituiscono il Java Collections Framework. 

Una Collection è quindi un contenitore in cui più oggetti vengono raggruppati in una singola entità, o meglio è una struttura dati che ha metodi usati per inserire, togliere, recuperare e gestire la struttura stessa.

Il Java Collection Framework è costituito dai seguenti elementi:

* Interfacce, che definiscono le operazioni classica di una generica collezione di oggetti
	Possono essere suddivise in due macro-categorie:
	* Collection, che sono ottimizzate per operazioni di inserimento, modifica e cancellazione di elementi all’interno di un insieme di oggetti
	* Map, che sono ottimizzate per operazioni di ricerca
* Classi, che implementano le interfacce utilizzando differenti tipi di strutture dati 
* Algoritmi, che consistono in metodi per compiere operazioni sulle Collezioni, quali ad esempio operazioni di ordinamento e di ricerca

I vantaggi di avere questo framework a disposizione sono tanti: possibilità di scrivere meno codice, incremento della performance, interoperabilità tra classi non relazionate tra loro, riusabilità, algoritmi complessi già a disposizione (ad esempio quelli per l’ordinamento), ecc.

Andremo ora ad analizzare le caratteristiche del framework e studiamo le principali classi concrete che permettono di gestire al meglio le nostre collezioni di oggetti.

Ad un primo livello si trovano le interfacce Collection (la più importante) e Map.

Collection è estesa dalle interfacce Set, List e Queue. 
Lo scopo di queste interfacce è permettere la manipolazione delle implementazioni indipendentemente dai dettagli di rappresentazione. 
Questo implica che capire a cosa servono queste interfacce significa capire la maggior parte dell’utilizzo del framework.

Esistono implementazioni dell’interfaccia Collection che ammettono elementi duplicati e altre che non lo permettono, collezioni ordinate e non ordinate. 
La libreria non mette a disposizione alcuna implementazione diretta di Collection, ma solo delle sue dirette sottointerfacce come Set e List.

Un Set è un tipo di collezione che, astraendo il concetto di insieme matematico, non ammette elementi duplicati. 
Questa interfaccia, quindi, permette di gestire collezioni di oggetti non duplicati identificabili univocamente mediante il metodo equals().

Una List è una collezione ordinata. In una lista viene sempre associato un indice a ogni elemento, che equivale alla posizione dell’elemento stesso all’interno della lista. 
Una lista ammette elementi duplicati (distinguibili dalla posizione). 
Questa interfaccia, quindi, permette di gestire collezioni di oggetti ordinati identificabili univocamente mediante un indice che rappresenta la sua posizione all’interno della lista.

Una Queue permette di gestire collezioni di oggetti gestiti con la filosofia FIFO (First In First Out) in modo che il primo oggetto inserito sia il primo candidato ad essere letto.

Map è una collezione che associa chiavi ai suoi elementi. Le mappe non possono contenere chiavi duplicate e ogni chiave può essere associata a un solo valore.

Essa non è propriamente una Collection poiché non implementa l’interfaccia Collection.

Metodi delle Collection e delle Map
#### COLLECTION
I metodi delle Collection sono i seguenti:
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

#### MAP
I metodi delle Map sono i seguenti:
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

## Implementazione di Queue
L’interfaccia Queue rappresenta un insieme di elementi gestiti mediante FIFO. 
Questa interfaccia estende Collection definendo nuovi metodi per l’inserimento, la rimozione e l’utilizzo dei dati. Ognuno di questi metodi è presente in due forme:
la prima lancia un’eccezione se l’operazione fallisce
la seconda ritorna un valore speciale (come null o false) se l’operazione fallisce


L’implementazione di Queue è PriorityQueue.
Esempio di Queue.
```java
Queue coda = new PriorityQueue();
for (int i=0; i<50; i++) {
	coda.offer("String #" + i);
}
while (!coda.isEmpty()) {
	System.out.println(coda.poll());
}
```
La PriorityQueue è una coda che estrae gli elementi secondo la priorità assegnata.


## Algoritmi del Java Collections Framework

Tra le carateristiche offerte dal Collection Framework esistono classi ed algoritmi come, ad esempio, quelli di ordinamento che se avessimo usato array o altre strutture avremmo dovuto definire ad-hoc.
Infatti, Collections ha metodi che implementano complicati algoritmi come:

* sort() (ordina)
* shuffle() (mischia – il contrario di ordina)
* max() (restituisce l’elemento massimo)
* reverse() (inverte l’ordine degli elementi)
* binarySeach() (ricerca binaria)

Altri metodi, detti "di convenienza", permettono la creazione di:
* collection immutabili di un numero definito di oggetti identici (metodo ncopies())
* un oggetto singleton, che si può istanziare una sola volta (metodo singleton())

## ESEMPIO

utilizzare gli algoritmi per ordinare una lista.

```java
public static void main(String[] args) {
	List<Persona> persone = new ArrayList<Persona>();

	persone.add(new Persona(27, "marco", "bianco"));
	persone.add(new Persona(80, "luca", "arancio"));
	persone.add(new Persona(75, "giovanni", "rossi"));
	persone.add(new Persona(29, "mario", "bianchi"));

	System.out.println("Lista non ordinata");
	print(persone);

	System.out.println("Ordina per eta");
	Collections.sort(persone);
	print(persone);

	System.out.println("Ordina per cognomi");
	Collections.sort(persone, new CognomeComparator());
	print(persone);
}

private static void print(Collection<Persona> coll) {
	Iterator<Persona> it = coll.iterator();

	while (it.hasNext()) {
		Persona p = it.next();
		System.out.println(p.getNome() + " " +
   p.getCognome() + " " +
   p.getEta());
	}
}
```
```java
private String nome;
private String cognome;
private int eta;

public Persona() {}

public Persona(int eta, String nome, String nome) {
	setEta(eta);
	setNome(nome);
	setCognome(cognome);
}

public String toString() {
	return nome + " " + cognome + " " + eta;
}

public boolean equals(Persona p) {
	if (cognome.equals(p.getCognome()) && 
    nome.equals(p.getNome()) &&
    eta == p.getEta())
	return true;
else
	return false;
}

public int compareTo(Persona p) {
	if (getEta() == p.getEta())	return 0;
	else if (getEta()>p.getEta())	return 1;
	else 						return -1;	
}
```
Sono stati usati due metodi per ordinare la lista:

Collections.sort(persone) che riceve in input una List di oggetti che implementano l’interfaccia Comparable. 
Nell’esempio gli elementi vengono ordinati in base all’età

Collections.sort(persone, new CognomeComparator()) che riceve in input una List di oggetti e un’istanza di una classe che implementa l’interfaccia Comparator. 

Nell’esempio gli elementi vengono ordinati in base al cognome. Naturalmente è possibile creare diversi Comparator che permettono di ordinare la lista in altrettanti modi

