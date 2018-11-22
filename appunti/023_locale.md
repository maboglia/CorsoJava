# Internazionalizzazione e localizzazione
L'internazionalizzazione consente a un'applicazione di adattarsi in modo automatico alle convenzioni in uso in una particolare lingua o regione senza che si debba ricorrere alla riscrittura o, peggio, alla riprogettazione dell'applicazione stessa (ad esempio le varie modalità di rappresentazione dei numeri o delle date).
La localizzazione permette l'adattamento del software a una particolare regione aggiungendo all'applicazione tutte quelle parti che dipendono dalla regione stessa, come ad esempio le scritte dei menu, dei bottoni e degli altri elementi testuali di un'interfaccia grafica.
Occorre tener presente che, nella maggior parte dei casi, con internazionalization si intendono entrambi gli aspetti.



#CLASSE LOCALE

```java
nomeLocale = new Locale("language", "country", ["variant"]);
```
La classe Locale  astrae il concetto di "zona" sia dal punto di vista linguistico che geografico. 
Molte rappresentazioni di numerose altre classi dipendono da Locale. 
Il package java.text fornisce gli strumenti per la formattazione del testo. 
Alcune sue classi possiedono metodi che usano Locale.
Un esempio è la classe NumberFormat che possiede metodi che usano Locale per individuare l'uso della virgola o del punto per i numeri decimali.
Un altro esempio sono le classi (come Currency) che usano Locale per rappresentare date, orari e valute.

La classe Locale è basata essenzialmente su tre variabili: language, country e variant.
I valori dei parametri passati si riferiscono a precisi simboli definiti dallo standard ISO.
La prima variabile si riferisce al linguaggio, ovvero alla lingua. 
Viene specificata mediante due lettere minuscole rappresentative della zona (esempi: Italia = it, Stati Uniti = us).
La seconda variabile si riferisce permette di indicare la regione geografica. 
Ciò torna utile quando in una stessa nazione non necessariamente si parla un'unica lingua. 
Viene specificata mediante due lettere maiuscole (es: Svizzera italiana = it_CH, Svizzera tedesca = de_CH).
La terza variabile (opzionale) permette la specifica di strutture personalizzate implementate, ad esempio, da particolari tipi di browser.
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



#CLASSE RESOURCEBUNDLE

nomeResBundle = ResourceBundle.getBundle("nomeBundle", nomeLocale)

Un ruolo molto importante nel processo di internazionalizzazione sono le risorse, cioè file di proprietà che fanno riferimento ad un ResourceBundle. Sono semplici file di testo che contengono i messaggi, label, bottoni, parole che cambiano da una lingua all'altra e possono essere tradotti anche da persone che non conoscono la programmazione in quanto non si lavora sul codice ma all'esterno dell'applicazione.
Queste risorse hanno un formato molto semplice, in quanto contengono praticamente coppie (Chiave : valore) dove:
la chiave è una stringa
il valore è la traduzione, cioè una stringa tradotta nella lingua del particolare Locale
Per creare l'oggetto ResourceBundle bisogna invocare il metodo getBundle() passandogli come parametri il nome del bundle (cioè la risorsa) e il nome del locale.
Il metodo getBundle() per prima cosa cerca il file bundle specificato nel costruttore (nell'esempio seguente  "mioBundle"), se non lo trova cerca i file di proprietà di default.
Per recuperare il testo memorizzato nel file di proprietà basta evocare il metodo getString() sull'oggetto ResourceBundle.

mioMessaggio = resourceBundle.getBundle("mioBundle", mioLocale);
String testo = mioMessaggio.getString("header");
System.out.println("testo");

La stringa che ritorna dall'esempio è quella che corrisponde alla chiave che abbiamo specificato e sarà nella lingua identificata dal Locale.
Poiché nei file properties non variano le chiavi ma le corrispondenti traduzioni, si possono aggiungere altre risorse senza cambiare nulla nel codice.


# ESEMPIO LOCALE E RESOURCEBUNDLE
## file example.java: contiene il codice per la dichiarazione e la gestione del Locale e del ResourceBundle.
```java
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
```
## file properties.
```java
/* MyBundle.properties */
header = Welcome to my webpage
block1 = Please follow the directions to learn how to play the game

/* MyBundle_es_US.properties */
header = Welcome to my webpage
block1 = Please follow the directions to learn how to play the game

/* MyBundle_es_ES.properties */
header = Bienvenidos a mi webpage
block1 = Sigue los directions para entender como jugar
```