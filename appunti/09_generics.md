#Generics e Varargs
	Generics
	Sintassi
	Generics e List
	Interfaccia Iterator
	Interfaccia Map
	Creare i propri tipi Generics
	Java 7 e la deduzione automatica del tipo
	
###Collections e Generics
Se si provano a runnare alcuni dei precedenti esempi con un JDK 1.5 o superiore, si avranno alcuni messaggi di warning dopo aver compilato. Questi warning sono dovuti all’introduzione, in Java 5, dei Generics. Negli esempi sono state utilizzate Collection "raw type", che sono delle Collection non parametrizzate mediante Generics.
I Generics offrono la loro più classica utilità nell’uso delle Collection. Essi, infatti, permettono di fare in modo che una particolare Collection sia parametrizzata con un certo tipo. La sintassi fa uso di parentesi angolari "<" e ">".
Ad esempio, col seguente codice, indicheremo che la nostra Collection potrà contenere solo e solamente stringhe.
```java
Vector<String> vector = new Vector<String>();
```
Se si provasse ad aggiungere a vector un eventuale oggetto che non sia di tipo String otterremmo un warning in compilazione.
Java diventa così un linguaggio ancora più robusto, sicuro e fortemente tipizzato.
Un altro vantaggio nell’uso delle Generics sta nel fatto che sapendo da quali tipi è costituita la Collection, ogni casting è superfluo.	
	
##Java 5 – Tiger
	Caratteristiche della versione 5 di Java, quella definita Tiger. 
	Questa versione, infatti, ha sconvolto completamente Java mettendone in discussione anche le caratteristiche ormai assodate come la semplicità.

	Java è un linguaggio in continua evoluzione. Tiger non è stata pensata come il capolinea della programmazione Java, bensì come una svolta.
	Nella storia di Java, i cambiamenti non riguardanti librerie e prestazioni sono pochi. Le modifiche apportate dalla release 5 di Java permettono di scrivere 	meno codice e di risolvere i bug già in fase di compilazione. 
	Tuttavia questo ha portato ad una perdita di "semplicità" anche se è stata mantenuta, comunque, la compatibilità con le versioni precedenti. 
	Infatti, anche se sono definite novità clamorose come un nuovo ciclo for, e nuove keyword, queste saranno trasformate dal compilatore in istruzioni 	"vecchie", che saranno interpretabili anche da Virtual Machine meno aggiornate.
	
	Generics
	Una delle nuove caratteristiche di Java 5 sono i Generics (o Generici). 
	Questi forniscono la possibilità di creare un modello generale di tipo. 
	In particolare:
	i metodi generici permettono di specificare mediante una singola dichiarazione di metodo un insieme di metodi correlati
	le classi generiche permettono di specificare mediante una singola dichiarazione di classe un insieme di tipi correlati
	Con l’uso dei Generics è possibile scrivere un metodo generico sort in grado di ordinare gli elementi di un array di Integer, di String e, in generale, 
	quelli di un array di un qualsiasi tipo che supporta una funzione di ordinamento.

	È anche possibile scrivere una classe generica Stack (pila) che possa essere utilizzata per memorizzare interi, numeri a virgola mobile, stringhe, e 
	qualsiasi altro tipo di dati.
	Inoltre, essi assicurano la sicurezza dei tipi a tempo di compilazione che permette di individuare a tempo di compilazione errori di compatibilità sui tipi.
	
	Sintassi
	I generici ci permettono di dichiarare una struttura specificando che essa accetterà solo un certo tipo. Inoltre, bisognerà anche assegnare al nome della 	
	struttura un’istanza che accetti lo stesso tipo di elementi.
	La sintassi si basa sull’uso delle parentesi angolari che delimitano la sezione parametro del tipo all’interno della quale possono esserci uno o più 
	parametri tipo separati da virgola.

```java
List<String> strings = new ArrayList<String>();
LinkedList<String> list = new LinkedList<String>();
Vector<String> vector = new Vector<String>();
HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
```

N.B. I generici non si possono applicare ai tipi di dati primitivi.
La seguente istruzione produrrebbe messaggi di errore.

List<int> ints = new ArrayList<int>();

##Generics e List
I generics permettono di dichiarare una lista specificando che essa accetterà solo stringhe. Inoltre, bisogna anche assegnare a strings un’istanza che accetti lo stesso tipo di elementi (stringhe).

List<String> strings = new ArrayList<String>();

A questo punto abbiamo una lista che accetta solo stringhe, e nessun altro tipo di oggetto.

// non produce errore
strings.add("si può usare String");
// produce errore in fase di compilazione
strings.add(new StringBuffer("non si può usare " + "StringBuffer"));

I generics sono utilizzati anche come parametri sia di input che di output dei metodi. Segue un esempio di dichiarazione di un metodo che prende un tipo generico in input e ne restituisce un altro in output.

public List<String> getListOfMapValues (Map<Integer, String> map) {
	List<String> list = new ArrayList<String>();
	for (int i=0; i<map.size(); i++) {
		list.add(map.get(i));
	}
	return list;
}

##Interfaccia Iterator
Oltre a List, tutte le classi e tutte le interfacce Collections supportano ora i generics. Più o meno quanto visto per List vale per tutte le altre Collections (con l’eccezione di Map, come vedremo tra poco) e anche per Iterator ed Enumeration.
Consideriamo il seguente codice di esempio.

List<String> strings = new ArrayList<String>();
strings.add("Generics");
strings.add("Ciclo for migliorato");
strings.add("Varargs");
...
Iterator it = strings.iterator();
while (it.hasNext()) {
	String string = it.next();
	System.out.println(string);
}

Viene prodotto un errore in quanto bisogna dichiarare anche l’Iterator come generico.

Iterator<String> it = strings.iterator();
while (it.hasNext()) {
	String string = it.next();
	System.out.println(string);
}

N.B. Attenzione a non utilizzare Iterator come generico su una Collection non generica. Si rischia un’inevitabile eccezione al runtime se la Collection non è stata riempita come ci si aspetta.
Interfaccia Map
L’interfaccia Map, nella sua dichiarazione, dichiara due parametri: K (key) e V (value). 
Public interface Map<K, V>;

Per una mappa possono essere parametrizzati sia la chiavi che i valori. Nel seguente esempio, le chiavi saranno dichiarate di tipo Integer mentre i valori di tipo String.

Map<Integer, String> map = new HashMap<Integer, String>();

Ovviamente, in casi del genere, grazie all’autoboxing sarà possibile utilizzare interi primitivi per valorizzare la chiave. Ad esempio, il seguente codice inizializza la mappa e ne stampa i valori con un ciclo sulle chiavi.

map.put(0, "generics");
map.put(1, "ciclo for migliorato");
map.out(2, "varargs");
for (int i=0; i<3; i++) {
	System.out.println(map.get(i));
}

Creare i propri tipi Generics
Una qualsiasi classe è parametrizzabile, dunque è possibile definire i propri tipi Generics.
```java
public class MioGeneric <E> {
	private List<E> list;
	
public MioGeneric() {
	list = new ArrayList<E>();
}
public void add(E e) {
	list.add(e);
}

public void remove(int i) {
	list.remove(i);
}

public E get(int i) {
	return list.get(i);
}

public int size() {
	return list.size();
}

public boolean isEmpty() {
	return list.size() == 0;
}

public String toString() {
	StringBuilder sb = new StringBuilder();
	int size = size();
	for (int i=0; i<size; i++) {
		sb.append(get(i) + (i != size-1 ? "-" : ""));
	}
	return sb.toString();
}
}
```

Java 7 e la deduzione automatica del tipo
Java 7 ha introdotto un piccolo cambiamento di sintassi per la creazione dei tipi generici, che prende il nome di deduzione automatica del tipo per la creazione di una istanza generica.
Con l’avvento di questo cambiamento potremo ora omettere i parametri per l’oggetto istanziato usando l’operatore diamond (rombo).
Di seguito è riportato un esempio.

ArrayList<String> arrayList = new ArrayList<String>(); // Java 5-6
ArrayList<String> arrayList = new ArrayList<>();       // Java 7
