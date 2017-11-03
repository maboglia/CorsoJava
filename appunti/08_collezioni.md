#Package java.util	

>source: Manuale Java 7 - Claudio De Sio Cesari

Framework Collections	
Metodi delle Collection e delle Map	
Implementazione di Set e SortedSet	
Implementazione di Map e SortedMap	
Implementazione di List	
Implementazione di Queue	
Algoritmi del Java Collections Framework	
Collections e Generics	
Classe StringTokenizer	

###Package java.util
Il package java.util contiene una serie di classi utili come il framework "Collections" per gestire collezioni eterogenee di ogni tipo, il modello a eventi, classi per la gestione facilitata delle date e degli orari, classi per la gestione dell’internazionalizzazione e tante altre utilità come un separatore di stringhe (StringTokenizer), un generatore di numeri casuali ecc.

##Framework Collections
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
####COLLECTION
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

####MAP
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

####Implementazione di Set e SortedSet
L’interfaccia Set rappresenta un insieme di elementi senza duplicati, ciò impone la presenza di una tecnica che consenta di distinguere gli oggetti. 
L’interfaccia Set prevede, tra l’altro, un’interfaccia derivata SortedSet che rappresenta la versione ordinata di Set.
Un’implementazione di Set è HashSet.
Un’implementazione di SortedSet è TreeSet.
Entrambe non ammettono elementi duplicati.
HashSet risulta più performante di TreeSet in quanto gestisce l’ordinamento.
####Esempio di HashSet e TreeSet

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

Come si può vedere dagli output, l’elemento duplicato (b) non è stato aggiunto e nel caso del TreeSet sono stati anche ordinati.

Per scorrere facilmente le tabelle abbiamo usato un’implementazione dell’interfaccia Iterator, che permette di iterare sugli elementi della collezione.

Dalla versione 6 di Java gli oggetti TreeSet sono "bidirezionali", infatti è possibile anche ottenere un’istanza di Iterator che itera al contrario invocando il metodo descendingIterator().

####Implementazione di Map e SortedMap
L’interfaccia Map rappresenta un insieme di elementi, ad ognuno dei quali viene associata una chiave univoca. Non sono permessi elementi duplicati e null.

E’ preferibile usare le mappe piuttosto che i set in quanto è possibile ricercare facilmente un oggetto all’interno di una mappa a partire dalla sua chiave univoca ed anche perché è possibile accedere agli oggetti in modo veloce.

Le implementazioni di Map sono HashTable e HashMap.
Un’implementazione di SortedMap è TreeMap. 

Entrambe non ammettono elementi duplicati.
HashMap risulta più performante di HashTable, in quanto quest’ultima è sincronizzata di default mentre HashMap non lo è (i metodi di accesso agli oggetti non sono Synchronized)
HashMap risulta più performante di TreeMap, in quanto quest’ultima gestisce l’ordinamento
####Esempio di HashTable e HashMap.
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

Vediamo un esempio riguardante l’iterazione sulle mappe.
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

####Implementazione di List

L’interfaccia List rappresenta un insieme di elementi. Sono permessi elementi duplicati.
Gli oggetti vengono memorizzati in locazioni di memoria contigue quindi è possibile accedere a ciascun oggetto molto velocemente mediante il suo indice all’interno della collezione. Naturalmente non è adatta per operazioni di ricerca poiché occorrerebbe scorrere tutta la lista per ricercare un oggetto al suo interno. È possibile scorrere facilmente la lista sia mediante la classe iterator che mediante accesso diretto utilizzando l’indice dell’oggetto.

Le implementazioni di List sono ArrayList e Vector.
ArrayList ha prestazioni nettamente superiori rispetto a Vector in quanto quest’ultima è sincronizzata di default mentre ArrayList non lo è (i metodi di accesso agli oggetti non sono Synchronized).
Esempio di ArrayList e Vector.
ArrayList | Vector
------------ | -------------
ArrayList lista = new ArrayList();	|Vector vett = new Vector();
lista.add("abhijit");				|vett.add("abhijit");
lista.add("smitesh");				|vett.add("smitesh");
lista.add("melissa");				|vett.add("melissa");
Iterator it = lista.iterator();		|Iterator it = vett.iterator();
while (it.hasNext()) {			|while (it.hasNext()) {
   out.print(it.next());		   	  | out.print(it.next());
}							|}

##Implementazione di Queue
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


##Algoritmi del Java Collections Framework

Nei paragrafi precedenti abbiamo visto diversi tipi di Collection e alcune semplici implementazioni. 
Occorre specificare però che in implementazioni più complesse occorre usare metodi che consentano di sfruttare tutte le features offerte dal Collection Framework.

Nello specifico, infatti, esistono classi ed algoritmi aggiuntivi come, ad esempio, quelli di ordinamento che se avessimo usato array o altre strutture avremmo dovuto definire ad-hoc.
Infatti, Collections ha metodi che implementano complicati algoritmi come:

* sort() (ordina)
* shuffle() (mischia – il contrario di ordina)
* max() (restituisce l’elemento massimo)
* reverse() (inverte l’ordine degli elementi)
* binarySeach() (ricerca binaria)
Altri metodi, detti "di convenienza", permettono la creazione di:
collection immutabili di un numero definito di oggetti identici (metodo ncopies())
un oggetto singleton, che si può istanziare una sola volta (metodo singleton())

ESEMPIO
Ora vediamo come è semplice utilizzare gli algoritmi per ordinare una lista.
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
Sono stati usati due metodi per ordinare la lista:

Collections.sort(persone) che riceve in input una List di oggetti che implementano l’interfaccia Comparable. 
Nell’esempio gli elementi vengono ordinati in base all’età

Collections.sort(persone, new CognomeComparator()) che riceve in input una List di oggetti e un’istanza di una classe che implementa l’interfaccia Comparator. 
Nell’esempio gli elementi vengono ordinati in base al cognome. Naturalmente è possibile creare diversi Comparator che permettono di ordinare la lista in altrettanti modi

Per completezza si riporta anche la classe Persona. 
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

###Classe StringTokenizer
Spesso risulta necessario manipolare dei token di testo.
Una semplice classe che permette di separare i contenuti di una stringa in più parti, chiamate token, è la classe StringTokenizer.
Questa classe si utilizza solitamente per estrarre le parole di una stringa.
L’utilizzo di base è estremamente semplice, occorrono:
una stringa da "navigare", cioè da cui estrarre i token
un delimitatore, che serve per identificare i token
Un token è, quindi, la sequenza massima di caratteri consecutivi che non sono delimitatori.
CREARE OGGETTO STRINGTOKENIZER
Occorre creare in prima istanza l’oggetto StringTokenizer, usando il costruttore dell’omonima classe. 
Il costruttore può accettare da 1 a 3 parametri:
la stringa da cui estrarre i token
il delimitatore, che può essere:
esplicito [st2 – st3]
di default " \t\n\r\f" (notare che il primo delimitatore e uno spazio) [st1]
un booleano che, se settato a true, considera token anche gli stessi delimitatori
```java
StringTokenizer st1 = new StringTokenizer("Stringa da dividere");
StringTokenizer st2 = new StringTokenizer("Stringa sezionata", ";");
StringTokenizer st3 = new StringTokenizer("Ciao Mamma", "a", true);

Output [st1]
	Stringa
	da
	dividere
Output [st2]
	Stringa selezionata
Output [st3]
	Ci
	a
	o M
	a
	mm
	a
```	
Per scandire l’intero testo si può usare un ciclo while con all’interno l’invocazione del metodo hasMoreTokens() che ritorna true se sono presenti altri token, altrimenti false.
Per stampare il token appena recuperato si può invocare il metodo nextToken() sull’oggetto StringTokenizer.

StringTokenizer st = new StringTokenizer("Stringa da dividere");
while (st.hasMoreTokens()) {
	// Due metodi per fare la stessa cosa
System.out.println(st.nextToken());
System.out.println(st.nextElement().toString());
}
