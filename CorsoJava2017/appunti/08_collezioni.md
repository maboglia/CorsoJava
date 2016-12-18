>source: Manuale Java 7 - Claudio De Sio Cesari

#Capitolo 10	
Package java.util	
Framework Collections	
Metodi delle Collection e delle Map	
Implementazione di Set e SortedSet	
Implementazione di Map e SortedMap	
Implementazione di List	
Implementazione di Queue	
Algoritmi del Java Collections Framework	
Collections e Generics	
Internazionalizzazione e localizzazione	
Date e orari	
Classe StringTokenizer	
Espressioni regolari	
Package java.lang	
Classe String	
Classe System	
Classe Runtime	
Classi wrapper	
Classe Math	
###Package java.util
Il package java.util contiene una serie di classi utili come il framework "Collections" per gestire collezioni eterogenee di ogni tipo, il modello a eventi, classi per la gestione facilitata delle date e degli orari, classi per la gestione dell’internazionalizzazione e tante altre utilità come un separatore di stringhe (StringTokenizer), un generatore di numeri casuali ecc.
###Framework Collections
Nella normale attività di programmazione ci si trova spesso a dover gestire un insieme di dati. In Java, le soluzioni per la gestione di un insieme di oggetti sono molteplici e, come sempre, a seconda delle circostanze, bisogna individuare la soluzione migliore da adottare.

Tutte le classi che permettono di gestire gruppi di oggetti, costituiscono il Java Collections Framework. 

Una Collection è quindi un contenitore in cui più oggetti vengono raggruppati in una singola entità, o meglio è una struttura dati che ha metodi usati per inserire, togliere, recuperare e gestire la struttura stessa.

Il Java Collection Framework è costituito dai seguenti elementi:

* Interfacce, che definiscono le operazioni classica di una generica collezione di oggetti
	Possono essere suddivise in due macro-categorie:
	* Collection, che sono ottimizzate per operazioni di inserimento, modifica e cancellazione di elementi all’interno di un insieme di oggetti
	* Map, che sono ottimizzate per operazioni di ricerca
*	Classi, che implementano le interfacce utilizzando differenti tipi di strutture dati 
* Algoritmi, che consistono in metodi per compiere operazioni sulle Collezioni, quali ad esempio operazioni di ordinamento e di ricerca

I vantaggi di avere questo framework a disposizione sono tanti: possibilità di scrivere meno codice, incremento della performance, interoperabilità tra classi non relazionate tra loro, riusabilità, algoritmi complessi già a disposizione (ad esempio quelli per l’ordinamento), ecc.

Andremo ora ad analizzare le caratteristiche del framework e studiamo le principali classi concrete che permettono di gestire al meglio le nostre collezioni di oggetti.

Ad un primo livello si trovano le interfacce Collection (la più importante) e Map.
Collection è estesa dalle interfacce Set, List e Queue. Lo scopo di queste interfacce è  permettere la manipolazione delle implementazioni indipendentemente dai dettagli di rappresentazione. Questo implica che capire a cosa servono queste interfacce significa capire la maggior parte dell’utilizzo del framework.

Esistono implementazioni dell’interfaccia Collection che ammettono elementi duplicati e altre che non lo permettono, collezioni ordinate e non ordinate. La libreria non mette a disposizione alcuna implementazione diretta di Collection, ma solo delle sue dirette sottointerfacce come Set e List.

Un Set è un tipo di collezione che, astraendo il concetto di insieme matematico, non ammette elementi duplicati. Questa interfaccia, quindi, permette di gestire collezioni di oggetti non duplicati identificabili univocamente mediante il metodo equals().

Una List è una collezione ordinata. In una lista viene sempre associato un indice a ogni elemento, che equivale alla posizione dell’elemento stesso all’interno della lista. Una lista ammette elementi duplicati (distinguibili dalla posizione). Questa interfaccia, quindi, permette di gestire collezioni di oggetti ordinati identificabili univocamente mediante un indice che rappresenta la sua posizione all’interno della lista.

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

E’ possibile aggiungere elementi mediante il metodo put(Object key, Object value) e si recuperano mediante il metodo get(Object key). In particolare, il metodo get() permette un recupero molto performante dell’elemento della collezione, mediante la specifica della chiave.
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
Algoritmi del Java Collections Framework

Nei paragrafi precedenti abbiamo visto diversi tipi di Collection e alcune semplici implementazioni. Occorre specificare però che in implementazioni più complesse occorre usare metodi che consentano di sfruttare tutte le features offerte dal Collection Framework.

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
Collections.sort(persone) che riceve in input una List di oggetti che implementano l’interfaccia Comparable. Nell’esempio gli elementi vengono ordinati in base all’età
Collections.sort(persone, new CognomeComparator()) che riceve in input una List di oggetti e un’istanza di una classe che implementa l’interfaccia Comparator. Nell’esempio gli elementi vengono ordinati in base al cognome. Naturalmente è possibile creare diversi Comparator che permettono di ordinare la lista in altrettanti modi
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
Internazionalizzazione e localizzazione
L’internazionalizzazione consente a un’applicazione di adattarsi in modo automatico alle convenzioni in uso in una particolare lingua o regione senza che si debba ricorrere alla riscrittura o, peggio, alla riprogettazione dell’applicazione stessa (ad esempio le varie modalità di rappresentazione dei numeri o delle date).
La localizzazione permette l’adattamento del software a una particolare regione aggiungendo all’applicazione tutte quelle parti che dipendono dalla regione stessa, come ad esempio le scritte dei menu, dei bottoni e degli altri elementi testuali di un’interfaccia grafica.
Occorre tener presente che, nella maggior parte dei casi, con internazionalization si intendono entrambi gli aspetti.
CLASSE LOCALE

```java
nomeLocale = new Locale("language", "country", ["variant"]);
```
Per gestire l’internazionalizzazione non si può fare a meno di utilizzare la classe Locale, che astrae il concetto di "zona" sia dal punto di vista linguistico che geografico. 
Molte rappresentazioni di numerose altre classi dipendono da Locale. 
Il package java.text fornisce gli strumenti per la formattazione del testo. Alcune sue classi possiedono metodi che usano Locale.
Un esempio è la classe NumberFormat che possiede metodi che usano Locale per individuare l’uso della virgola o del punto per i numeri decimali.
Un altro esempio sono le classi (come Currency) che usano Locale per rappresentare date, orari e valute.
La classe Locale è basata essenzialmente su tre variabili: language, country e variant.
I valori dei parametri passati si riferiscono a precisi simboli definiti dallo standard ISO.
La prima variabile si riferisce al linguaggio, ovvero alla lingua. Viene specificata mediante due lettere minuscole rappresentative della zona (esempi: Italia = it, Stati Uniti = us).
La seconda variabile si riferisce permette di indicare la regione geografica. Ciò torna utile quando in una stessa nazione non necessariamente si parla un’unica lingua. Viene specificata mediante due lettere maiuscole (es: Svizzera italiana = it_CH, Svizzera tedesca = de_CH).
La terza variabile, non necessaria, permette la specifica di strutture personalizzate implementate, ad esempio, da particolari tipi di browser.
```java
// creazione di un Locale con due parametri
Italia = new Locale("it", "IT");
America = new Locale("en", "US");
Inghilterra = new Locale("en", "BG");

// creazione di un Locale col parametro opzionale
nordAmerica = new Locale("en", "US", "NORTH");
unixLocale = new Locale("it", "IT", "UNIX");
windowsLocale = new Locale("it", "IT", "WINDOWS");
```
Molti Locale sono sicuramente più usati di altri, per questi ultimi sono disponibili delle costanti facilmente accessibili.
```java
America = Locale.US;
CanadaFrancesce = Locale.CANAD_FRENCH;
```
La classe Locale possiede, inoltre, alcuni metodi che restituiscono informazioni sulla zona.

CLASSE RESOURCEBUNDLE

nomeResBundle = ResourceBundle.getBundle("nomeBundle", nomeLocale)

Un ruolo molto importante nel processo di internazionalizzazione sono le risorse, cioè file di proprietà che fanno riferimento ad un ResourceBundle. Sono semplici file di testo che contengono i messaggi, label, bottoni, parole che cambiano da una lingua all’altra e possono essere tradotti anche da persone che non conoscono la programmazione in quanto non si lavora sul codice ma all’esterno dell’applicazione.
Queste risorse hanno un formato molto semplice, in quanto contengono praticamente coppie (Chiave : valore) dove:
la chiave è una stringa
il valore è la traduzione, cioè una stringa tradotta nella lingua del particolare Locale
Per creare l’oggetto ResourceBundle bisogna invocare il metodo getBundle() passandogli come parametri il nome del bundle (cioè la risorsa) e il nome del locale.
Il metodo getBundle() per prima cosa cerca il file bundle specificato nel costruttore (nell’esempio seguente  "mioBundle"), se non lo trova cerca i file di proprietà di default.
Per recuperare il testo memorizzato nel file di proprietà basta evocare il metodo getString() sull’oggetto ResourceBundle.

mioMessaggio = resourceBundle.getBundle("mioBundle", mioLocale);
String testo = mioMessaggio.getString("header");
System.out.println("testo");

La stringa che ritorna dall’esempio è quella che corrisponde alla chiave che abbiamo specificato e sarà nella lingua identificata dal Locale.
Poiché nei file properties non variano le chiavi ma le corrispondenti traduzioni, si possono aggiungere altre risorse senza cambiare nulla nel codice.
ESEMPIO COMPLETO DI LOCALE E RESOURCEBUNDLE
Vediamo un esempio completo. 
Costruiamo prima il file example.java che contiene il codice per la dichiarazione e la gestione del Locale e del ResourceBundle.

/* Example.java */

public class Example {
	static public void main(String[] args) {
		String language;	 // stringa per il codice della lingua
		String country;	 // stringa per il codice del paese

		language = new String("en");
		country = new String("US");

		Locale mioLocale;	 // dichiarazione Locale
		Resourcebundle testo;	 // dichiarazione ResourceBundle

		presentLocale = new Locale(language, country);
		testo = Resourcebundle.getBundle("MyBundle", mioLocale);

		System.out.println(testo.getString("header"));
		System.out.println(testo.getString("block1"));
	}
}

Costruiamo ora i file properties.

/* MyBundle.properties */
header = Welcome to my webpage
block1 = Please follow the directions to learn how to play the game

/* MyBundle_es_US.properties */
header = Welcome to my webpage
block1 = Please follow the directions to learn how to play the game

/* MyBundle_es_ES.properties */
header = Bienvenidos a mi webpage
block1 = Sigue los directions para entender como jugar

Date e orari
Sicuramente una delle problematiche ricorrenti di un programmatore è la manipolazione delle date e delle ore. Purtroppo le date sono degli oggetti molto complesse da gestire, che assumono forme diverse a seconda del luogo geografico in cui ci troviamo.
La classe principale per gestire date e orari è Calendar (che ha sostituito la classe deprecata Date). Altre classi utili sono GregorianCalendar, TimeZone e SimpleTimeZone. 
La complessità è aumentata dal fatto che, oltre a queste classi, è molto probabile che serva utilizzarne altre quali DateFormat e SimpleDateFormat, le quali permettono la trasformazione da stringa a data e viceversa.
Visto che sarebbe impossibile analizzare tutte le proprietà e tutti i metodi di queste classi, riportiamo una serie di esempi che ci aiuteranno a prendere confidenza con tali classi.
Nel primo esempio stampiamo semplicemente la data odierna con l’orario attuale.

GregorianCalendar calendario = new GregorianCalendar();
int anno = calendario.get(Calendar.YEAR);
int mese = calendario.get(Calendar.MONTH) + 1;
int giorno = calendario.get(Calendar.DATE);
int ore = calendario.get(Calendar.HOUR);
int min = calendario.get(Calendar.MINUTE);
int sec = calendario.get(Calendar.SECOND);

System.out.println(giorno + "/" + mese + "/" + anno);
System.out.println(ore + ":" + minuti + ":" + secondi);

La classe GregorianCalendar è molto semplice da utilizzare. Sono disponibili diversi costruttori. Il costruttore senza parametri inizializza l’oggetto con la data e l’ora attuale. Con il metodo get(), ereditato da Calendar, è possibile trarre tutte le informazioni disponibili.
Java ha messo a disposizione la classe SimpleDateFormat che permette di trattare le date nel formato più adatto alla nostra esigenza.
Col prossimo esempio vediamo come stampare la data odierna usando la classe descritta.

GregorianCalendar calendario = new GregorianCalendar();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy – HH:mm:ss);
System.out.println(sdf.format(calendario.getTime()));

Il costruttore della classe SimpleDateFormat prende in ingresso una stringa che rappresenta il formato della data che vogliamo stampare. 
Il metodo getTime() della classe GregorianCalendar restituisce un’istanza di Date. 
Il metodo format() della classe SimpleDateFormat, che restituisce in ingresso una Date, restituisce una stringa che corrisponde al formato che abbiamo impostato.
E’ possibile sfruttare la classe SimpleDateFormat anche per ottenere un’istanza della classe Calendar.

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy – HH:mm:ss);
String miaData = "15/04/1988";
GregorianCalendar calendario = new GregorianCalendar();
try {
	calendario.setTime(sdf.parse(miaData));
} catch(ParseException exc) {
	exc.printStackTrace();
}

Il metodo parse() della classe SimpleDateFormat riceve in ingresso una stringa e restituisce un oggetto Date.
Il metodo setTime della classe GregorianCalendar ci permette di impostare la data. Abbiamo utilizzato il blocco try-catch perché questa operazione potrebbe sollevare una ParseException, nel caso in cui una stringa passata al metodo parse(), non rappresenti una data convertibile.
Come ultimo esempio vediamo come convertire una data dal formato americano in quello italiano utilizzando le tecniche analizzate in precedenza.

SimpleDateFormat formatIT = new SimpleDateFormat("dd/MM/yyyy"); 
SimpleDateFormat formatUS = new SimpleDateFormat("yyyy/MM/dd");

Date dataIT;
try {
	dataIT = formatUS.parse("2007/04/05");
	String dataUS = formatIT.format(dataIT);
	System.out.println(dataUS);
} catch(ParseException exc) {
	exc.printStackTrace();
}

Volendo confrontare due date possiamo utilizzare i metodi after(), before() e equals() presenti nella classe Date.

GregorianCalendar c1 = 
new gregorianCalendar(2013, GregorianCalendar.FEBRUARY, 05);
GregorianCalendar c2 = 
new gregorianCalendar(2013, GregorianCalendar.FEBRUARY, 05);

Date data1 = c1.getTime();
Date data2 = c2.getTime();

Il metodo:
data1.after(data2) 	restituirà false
data1.equals(data2) 	restituirà false
data1.before(data2)	restituirà true
Classe StringTokenizer
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
Per scandire l’intero testo si può usare un ciclo while con all’interno l’invocazione del metodo hasMoreTokens() che ritorna true se sono presenti altri token, altrimenti false.
Per stampare il token appena recuperato si può invocare il metodo nextToken() sull’oggetto StringTokenizer.

StringTokenizer st = new StringTokenizer("Stringa da dividere");
while (st.hasMoreTokens()) {
	// Due metodi per fare la stessa cosa
System.out.println(st.nextToken());
System.out.println(st.nextElement().toString());
}

Espressioni regolari
Esiste un modo più potente per analizzare testo in Java. Dalla versione 1.4 di Java, infatti, sono state introdotte le espressioni regolari (regular expressions). 
Queste possono essere usate sia per validare una stringa sia per effettuare ricerche all’interno di un testo, a partire da un’espressione regolare. Si tratta di un pseudo-linguaggio sintetico e a volte criptico, composto appunto di espressioni, con una sintassi non ambigua, per individuare determinate aree di testo.
La sintassi è abbastanza vasta. Essenzialmente ci occorre conoscere tre tipologie di espressioni:
i gruppi di caratteri (character classes)
classi predefinite
quantificatori (greedy quantifier)
GRUPPI DI CARATTERI
Per definire un’espressione regolare è necessario conoscere alcune regole base. Le seguenti riguardano il singolo carattere.


Alcuni esempi.


CLASSI PREDEFINITE
Esistono anche forme abbreviate per rappresentare un insieme di caratteri.


QUANTIFICATORI
I quantificatori servono a indicare la molteplicità di caratteri, parole, espressioni o gruppi di caratteri. Noi indichiamo soltanto quelli appartenenti alla tipologia "greedy quantifier":


PACKAGE JAVA.UTIL.REGEX
Adesso che abbiamo i requisiti indispensabili per scrivere un’espressione regolare, vediamo come utilizzare il package java.util.regex per validare le nostre stringhe o ricercare del testo al loro interno. Questo package definisce due semplici classi sulle quali si basa tutta la libreria che utilizza le espressioni regolari:
Pattern, che rappresenta l’espressione regolare effettiva. Per ottenere un’istanza della classe Pattern è necessario invocare il metodo statico compile() che accetta come parametro una stringa che rappresenta l’espressione regolare. La classe Pattern dispone anche del metodo statico matches() che riceve in input due stringhe, la prima è l’espressione regolare, la seconda è la stringa da validare. Il metodo restituisce un booleano, true se la stringa rispetta il formato, false altrimenti
Matcher, che definisce diversi metodi per la ricerca e l’analisi del testo. Per ottenere un’istanza della classe Matcher, è necessario invocare il metodo statico matcher() su un’istanza dell’oggetto Pattern
L’eccezione che viene sollevata nel momento in cui viene individuato un errore di sintassi nel pattern di un’espressione regolare è PatternSyntaxException.
Per verificare se un stringa rispetta il formato definito dall’espressione regolare possiamo utilizzare due metodi.
Nel primo caso utilizziamo il metodo statico matches() della classe Pattern, passandogli l’espressione regolare e la stringa da validare.

public static Boolean check(String regex, String input) {
	if (Pattern.matches(regex, input))	return true;
	else							return false;
}

Nel secondo caso creiamo prima un’istanza della classe Matcher e poi richiamiamo il metodo matcher().

public static boolean check(String regex, String input) {
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(input);

	if (matcher.matches())	return true;
	else					return false;
}

E’ possibile, inoltre, utilizzare il package java.util.regex per ricercare una stringa all’interno di un’altra.

String regex = "[a-zA-Z0-9._%-]+@[ a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
String input = "pippo@email.it;pluto@email.it;paperino@email.it";

Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(input);

while (matcher.find())
	System.out.println(matcher.group());

Il metodo find() della classe Matcher, ricerca una sottostringa all’interno della stringa di ingresso che rispetta il formato dell’espressione regolare. Il metodo find() funziona come un iterator, cioè aggiorna gli indici ad ogni iterazione.
Package java.lang
Il package java.lang è il package più importante dell’API di Java, in quanto contiene moltissime classi e interfacce fondamentali per la programmazione Java, tanto che questo package viene importato in automatico in tutti i programmi.
Oltre alle classe Thread e all’interfaccia Runnable di cui abbiamo parlato nella lezione precedente, questo package contiene classi che già abbiamo utilizzato come la classe String, la Object e la System.
Ora andremo ad introdurre le classi più utilizzate e famose, in modo tale da avere una visione di insieme del package.
Classe String
La classe String è già stata tratta più volte nelle lezioni precedenti. 
Abbiamo visto come le stringhe in Java siano degli oggetti. La particolarità di questa classe è quella di essere l’unica classe che è possibile istanziare come se fosse un tipo di dato primitivo.
Vediamo i metodi più importanti di questa classe:
int compareTo(String other)
Esegue una comparazione lessicale. Ritorna un intero:
< 0 se la stringa corrente è minore della stringa other
= 0 se le due stringhe sono identiche
> 0 se la stringa corrente è maggiore di other
int indexOf(int ch)
Restituisce l’indice del carattere specificato
int lastIndexOf(int ch)
E’ come indexOf() ma viene restituito l’indice dell’ultima occorrenza trovata
int length()
Restituisce il numero di caratteri di cui è costituita la stringa corrente
String replace(char oldChar, char newChar)
Restituisce una nuova stringa, dove tutte le occorrenze di oldChar sono rimpiazzate con newChar
String substring(int startIndex)
Restituisce una sottostringa della stringa corrente, composta dai caratteri che partono dall’indice startIndex alla fine
String substring(int startIndex, int number)
Restituisce una sottostringa della stringa corrente, composta dal numero number di caratteri che partono dall’indice startIndex
String toLowerCase()
Restituisce una nuova stringa equivalente a quella corrente ma con tutti i caratteri minuscoli
String toUpperCase()
Restituisce una nuova stringa equivalente a quella corrente ma con tutti i caratteri maiuscoli

Classe System
La classe System ha il compito di interfacciare il programma Java con il sistema operativo sul quale sussiste la virtual machine.
Tutto ciò che esiste nella classe System è dichiarato statico. 
VARIABILI
Iniziamo subito esaminando tre attributi statici, che rappresentano i flussi (stream) di informazioni scambiati con la console (standard input, standard output, standard error):
	static PrintStream out
	static PrintStream err
	static InputStream in
Ciascuno di questi tre attributi è un oggetto e sfrutta i metodi della classe relativa.
Ad esempio, nelle precedenti lezioni, abbiamo spesso utilizzato il metodo println() della classe PrintStream invocandolo sull’oggetto statico out della classe System.
Infatti, l’oggetto out è di tipo PrintStream e viene usato per indicare l’output di default del sistema.
Esiste anche l’oggetto err, anch’esso di tipo PrintStream, che viene usato per segnalare gli errori che avvengono durante l’esecuzione del programma. Solitamente coincide con l’output di cui sopra.
Infine esiste l’oggetto in che è di tipo InputStream (package System.io di cui parleremo in una delle prossime lezioni), che serve per ricevere il flusso di informazioni dallo standard input. Tipicamente è la tastiera.
E’ possibile, però, modificare il puntamento di queste tre variabili verso altre fonti di input o di output. Esistono infatti i metodi statici setOut(), setErr() e setIn().
METODI
Dopo aver parlato delle variabili membro della classe System, diamo uno sguardo ai metodi più interessanti.
Un metodo di cui abbiamo già parlato è il metodo arraycopy() che permette di copiare il contenuto di un array in un altro.
Un altro metodo è il metodo exit(int code) che consente di bloccare istantaneamente l’esecuzione del programma. Il codice che viene specificata come parametro potrebbe servire al programmatore per capire perché si è interrotto il programma. Questo risulta, però, un sistema piuttosto rudimentale dopo aver visto la gestione delle eccezioni e delle asserzioni.

if (continua == false) {
	System.err.println("Si è verificato un problema!");
	System.exit(0);
}

Altri metodi interessanti sono i metodi setProperty(String key, String value) e getProperty(String key) che servono rispettivamente ad impostare le proprietà del sistema e a recuperare informazioni sulle proprietà del sistema.
Gli oggetti di tipo Properties sono specializzazioni di tabelle hash di Java: è possibile pensarli come tabelle che rappresentano coppie chiave-valore.
Per esempio, potremmo ottenere la versione di Java che si sta usando mediante il codice:

System.out.print("Versione Java Runtime Environment (JRE): ");
System.out.println(System.getProperty("java.version"));
    
System.out.print("Directory di installazione Java: ");
System.out.println(System.getProperty("java.home"));

Oppure si potrebbe impostare una nuova proprietà mediante il codice:

System.setProperty("Claudio.cognome", "De Sio");

Un elenco con tutte le properties di sistema è riportato in basso.

Classe Runtime
Questa classe astrae il concetto di runtime (esecuzione) del programma. Non ha costruttori pubblici e una sua istanza si ottiene chiamando il metodo factory getRuntime().
Caratteristica interessante di questa classe è permette di eseguire comandi del sistema operativo direttamente da Java, come ad esempio exec (di cui esistono più versioni).
Bisogna tener conto che l’uso della classe Runtime potrebbe compromettere la portabilità delle applicazioni, infatti questa classe dipende fortemente dal sistema operativo.
Classi wrapper
Nella versione 1.5 di Java è stata introdotta una funzionalità davvero comoda che viene chiamata boxing (inscatolamento) che permette ai valori dei tipi primitivi di essere convertiti in oggetti, e viceversa. In particolare:
l’autoboxing è un casting automatico che permette ai valori dei tipi primitivi di essere convertiti in oggetti
l’unboxing effettua il casting inverso
Gli oggetti che rappresentano i tipi primitivi sono detti classi wrapper (in italiano "involucro") che sono classi che fanno da contenitore a un tipo di dato primitivo, astraendo proprio il concetto di tipo. 
N.B. Tutte le classi wrapper sono classi final per cui non possono essere estese.
In Java, ogni tipo primitivo possiede una corrispondente classe wrapper: Byte, Short, Integer, Long, Float, Double, Boolean, Character. Ciascuna di queste classi permette di manipolare i valori di tipo primitivo come se fossero valori di oggetti. 
Spesso abbiamo a che fare con tipi primitivi (int, double, boolean, …) che sono tipi semplici e, quindi, non possiedono metodi. I wrapper, invece, essendo degli oggetti, sono dotati di metodi ed attributi.
Prima dell’introduzione dell’autoboxing, programmando in Java ci si poteva trovare nella necessità di convertire un tipo primitivo nella sua corrispondente classe wrapper.

Integer x = new Integer(10);
Double y = new Double(5.5f);
Boolean z = Boolean.parseBoolean("true");

Occorreva prima creare un nuovo oggetto di una classe wrapper.
Le stesse operazioni precedenti possono essere ora eseguite mediante il seguente codice.

Integer x = 10;
Double y = 5.5f;
Boolean z = true;

L’autoboxing permette al developer di non preoccuparsi delle operazioni di conversione.
Da notare che è grazie all’autoboxing che possiamo inserire i tipi primitivi all’interno delle Collection in maniera totalmente trasparente e senza preoccuparci di convertire i dati.
Classe Math
Per terminare la nostra trattazione del java.lang, comunque parziale vista l’immensità del package, esaminiamo brevemente la classe java.lang.Math (diversa dalla classe java.math). 
Questa classe serve per fare calcoli matematici e ha due attributi:
static double E		E di Eulero
static double PI	Pi greca
Consta di 31 metodi che rappresentano:
le funzioni matematiche di valore assoluto, tangente, logaritmo, potenza, massimo, minimo, seno, coseno, esponenziale, radice quadrata
arrotondamento classico, per eccesso e per difetto
generazione di numeri casuali

#LEZIONE 12	1
	Generics
	Sintassi
	Generics e List
	Interfaccia Iterator
	Interfaccia Map
	Creare i propri tipi Generics
	Java 7 e la deduzione automatica del tipo
	Varargs
	Annotazioni
	Sintassi
	Tipi di annotations

	Generics e Varargs
	Caratteristiche della versione 5 di Java, quella definita Tiger. Questa versione, infatti, ha sconvolto completamente Java mettendone in discussione anche le caratteristiche ormai assodate come la semplicità.
	Andremo, dunque, a descrivere le innovazioni principali portate da Tiger come i Generics e i varargs.
	Infine verranno introdotte le annotazioni e alcuni dei suoi tipi più utilizzati.
##Java 5 – Tiger
	Java è un linguaggio in continua evoluzione. Tiger non è stata pensata come il capolinea della programmazione Java, bensì come una svolta.
	Nella storia di Java, i cambiamenti non riguardanti librerie e prestazioni sono pochi. Le modifiche apportate dalla release 5 di Java permettono di scrivere meno codice e di risolvere i bug già in fase di compilazione. Tuttavia questo ha portato ad una perdita di "semplicità" anche se è stata mantenuta, comunque, la compatibilità con le versioni precedenti. Infatti, anche se sono definite novità clamorose come un nuovo ciclo for, e nuove keyword, queste saranno trasformate dal compilatore in istruzioni "vecchie", che saranno interpretabili anche da Virtual Machine meno aggiornate.
	Generics
	Una delle nuove caratteristiche di Java 5 sono i Generics (o Generici). 
	Questi forniscono la possibilità di creare un modello generale di tipo. 
	In particolare:
	i metodi generici permettono di specificare mediante una singola dichiarazione di metodo un insieme di metodi correlati
	le classi generiche permettono di specificare mediante una singola dichiarazione di classe un insieme di tipi correlati
	Con l’uso dei Generics è possibile scrivere un metodo generico sort in grado di ordinare gli elementi di un array di Integer, di String e, in generale, quelli di un array di un qualsiasi tipo che supporta una funzione di ordinamento.
	È anche possibile scrivere una classe generica Stack (pila) che possa essere utilizzata per memorizzare interi, numeri a virgola mobile, stringhe, e qualsiasi altro tipo di dati.
	Inoltre, essi assicurano la sicurezza dei tipi a tempo di compilazione che permette di individuare a tempo di compilazione errori di compatibilità sui tipi.
	Sintassi
	I generici ci permettono di dichiarare una struttura specificando che essa accetterà solo un certo tipo. Inoltre, bisognerà anche assegnare al nome della struttura un’istanza che accetti lo stesso tipo di elementi.
	La sintassi si basa sull’uso delle parentesi angolari che delimitano la sezione parametro del tipo all’interno della quale possono esserci uno o più parametri tipo separati da virgola.

List<String> strings = new ArrayList<String>();
LinkedList<String> list = new LinkedList<String>();
Vector<String> vector = new Vector<String>();
HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

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

Varargs
L’overload è la caratteristica polimorfica di Java basata sul concetto per cui un metodo  univocamente individuato dalla sua firma (cioè dal nome e dalla lista dei parametri). Essa permette, quindi, allo sviluppatore di usare lo stesso nome per più metodi variando la lista degli argomenti.
Ci sono casi in cui però l’overload non basta a soddisfare pienamente le esigenze di uno sviluppatore, come quando è necessaria una lista di argomenti variabile in numero. In casi simili, prima dell’avvento di Java 5, la soluzione era usare array e collezioni.

public class DeveloperJava extends Developer {
	private ArrayList <Java5Feature> updates;
	// Costruttori
	public DeveloperJava (String nome) {
		super(nome);
updates = new ArrayList<Java5Feature>();
	}
	public DeveloperJava (String nome, Java5Feature[] features) {
		super(nome);
		updates = new ArrayList<Java5Feature>();
	}
	// Getters e Setters
	public void addUpdate (Java5Feature update) {
		updates.add(update);
	}
	public void removeUpdate (Java5Feature update) {
		updates.remove(update);
	}
	public void addUpdates (Java5Feature[] features) {
		for (Java5Feature update : features) {
			updates.add(update);
		}
	}
	public void removeUpdates(Java5Feature[] features) {
		for (Java5Feature update : features) {
			updates.remove(update);
		}
	}
}

In questo esempio, il numero degli argomenti del costruttore poteva essere di grandezza variabile, ecco perché si è preferito creare un costruttore che prende in input un array di Java5Feature, piuttosto che creare tanti costruttori, ognuno che aggiungeva un nuovo parametro al precedente.
Una soluzione alternativa poteva essere quella di usare uan clection come ArrayList.
Con l’avvento di Java 5, i varargs (variable arguments) rendono tutto più semplice e leggibile. 

public class DeveloperJava extends Developer {
	private ArrayList<Java5Feature> updates;
	// Costruttori
	public DeveloperJava () {
		updates = new ArrayList<Java5Feature>();
	}
	public DeveloperJava (String nome) {
		super(nome);
		updates = new ArrayList<Java5Feature>();
	}
	public DeveloperJava (String nome, Java5Feature... features) {
		super(nome);
		updates = new ArrayList<Java5Feature>();
		addUpdates(features);
	}
	// Getters e Setters
	public void addUpdate (Java5Feature update) {
		updates.add(update);
	}
	public void removeUpdate (Java5Feature update) {
		updates.remove(update);
	}
	public void addUpdates (Java5Feature... features) {
		for (Java5Feature update : features) {
			updates.add(update);
		}
	}
	public void removeUpdates(Java5Feature... features) {
		for (Java5Feature update : features) {
			updates.remove(update);
		}
	}
}

Come è possibile notare, questa classe è identica alla precedente, tranne per il fatto che utilizza la sintassi dei varargs (i puntini sospensivi "…"). Effettivamente, i varargs, all’interno del metodo dove sono dichiarati, sono considerati a tutti gli effetti array, quindi, come per gli array, se ne può ricavare la dimensione con la variabile length ed eseguire cicli su di essi.
Il vantaggio di avere varargs in luogo di un array o di una collection risiede essenzialmente nel fatto che, per chiamare un metodo dichiarante argomenti variabili, non bisogna creare array o collection.
Annotazioni
Le annotazioni sono lo strumento utilizzato da Java per definire metadati, cioè "informazioni sulle informazioni".
Possiamo definire un’annotation (annotazione) come un appunto che mettiamo per specificare qualcosa relativo al codice che stiamo scrivendo, un attributo particolare, un metodo o una classe che hanno delle peculiarità.
Le annotazioni servono soprattutto per il compilatore che, ricorrendo al loro utilizzo, avrà la possibilità di effettuare determinate operazioni.
Sintassi
Ogni annotazione si presenta con il simbolo @ seguito dal nome dell’annotazione.
Eventualmente può essere valorizzata con dei valori, tra parentesi tonde come coppia nome-valore. Essa precede la classe, il metodo o l’attributo che vogliamo annotare.
Un’annotazione si presente nella seguente forma.

@Autore(
  name = "Claudio De Sio",
  company = "informatica.it"
)
class ClasseAnnotata() {
  ...
}

Nell’esempio abbiamo annotato la classe con l’annotazione Autore ed i due attributi name e company.
Tipi di annotations
@DEPRECATED
L’annotazione @Deprecated viene usata per specificare che l’elemento indicato è un elemento deprecato, cioè, attivo (per mantenere retrocompatibilità) ma non consigliato in quanto è stato rimpiazzato da uno nuovo e supportato.

public class TestDeprecated {
  @Deprecated
  public void metodoA() {
    System.out.println("Questo metodo è DEPRECATO, usa metodoB().");
  }

  public void metodoB() {
    System.out.println("Questo metodo è SUPPORTATO.");
  }
}

La compilazione di questa classe non darà alcun segnale, procederà tutto normalmente. Sarà la compilazione della classe che userà TestDeprecated a ricevere segnalazioni di warning dal compilatore quando viene utilizzato il metodo metodoA().
@OVERRIDE
L’annotazione @Override è probabilmente la più utile in quanto consente di evitare degli errori, che in fase di codifica spesso accadono. L’annotazione dice che l’elemento indicato è un elemento che fa l’override (sovrascrive) del relativo elemento, del genitore da cui eredita.

class A{
  void metodo1(){
    System.out.println("Metodo 1″);
  }
}

class B extends A{
  @Override
  void metodoo1(){
    System.out.println("Override A.metodo1()");
  }
}

Abbiamo la classe genitore A che presenta un metodo, metodo1(). Creiamo una classe B, erede di A. Vogliamo fare l’override di metodo1(), quindi annotiamo il metodo presente nella classe B con l’annotazione @Override, indicando che il metodo annotato è un metodo che sovrascrive un metodo del genitore.
Se si prova a compilare il codice, il compilatore restituirà un errore. Se notate, infatti, è stato inserito un errore di battitura nel nome del metodo. Senza l’annotazione @Override la compilazione sarebbe andata a buon fine e non ci saremmo accorti dell’errore.
@SUPPRESSWARNING
L’annotazione @SuppressWarning è utile quando vogliamo sopprimere le indicazioni di warning da parte del compilatore, ad esempio, perché stiamo usando dei metodi deprecati.

@SuppressWarnings({"deprecation"})
public void usaMetodoDeprecato() {
TestDeprecated t = new TestDeprecated();
t.metodoA();
}

Pur usando dei metodi deprecated, al compilatore abbiamo segnalato di sopprimere i warning.