# Esercizio Annotazione-BloccoNote

Si realizzi una classe JAVA **Annotazione** per la rappresentazione di annotazioni. Un'**annotazione** e' caratterizzata dal testo (una stringa), dalla descrizione (una stringa) e dal tipo (una stringa). La classe deve avere un metodo costruttore che prese in ingresso tre stringhe rappresenanti rispettivamente il testo, la descrizione ed il tipo, inizializzi opportunamente le variabili di istanza del nuovo oggetto. La classe deve inoltre fornire i seguenti metodi:

* `haTipo(c)` che data una stringa c restituisce un valore booleano true se il tipo dell'**annotazione** e' uguale alla stringa passata come parametro, false altrimenti;
* `uguali(s)` che presa in ingresso un'**annotazione** s restituisce un valore booleano true se l'**annotazione** in ingresso ha lo stesso testo dell'oggetto di invocazione, false altrimenti;
* `toString()` che restituisce una stringa contenente la rappresentazione dell'**annotazione** nel formato Testo, Descrizione, Tipo.

Si realizzi poi una classe **BloccoNote** per la rappresentazione di insiemi di annotazioni. Un'istanza della classe deve contenere un array di annotazioni e deve fornire i seguenti metodi:

* `aggiungi(u,d,c)` che prese in ingresso tre stringhe u,d e c aggiunge al blocco note una nuova annotazione avente u come testo, d come descrizione e c come tipo;
* `eliminaTipo(c)` che presa in ingresso una stinga c elimina dall'insieme delle annotazioni tutte le annotazioni aventi c come tipo;
* `haDuplicati()` che restituisce un valore booleano true se all'interno del blocco note ci sono due annotazioni uguali fra loro (ovvero aventi lo stesso testo), false altrimenti;
* `quanteTipo(c)` che data una stringa c restituisce un intero corrispondente al numero di annotazioni contenute nel blocco note con tipo c;
* `quanteAnnotazioni()` che restituisce un intero rappresentante il numero totale di annotazioni memorizzate nel blocco note;
* `stampaTipo(c)` che data una stringa c stampa tutte le annotazioni aventi c come tipo;

Scrivere le classi in modo da compilare ed eseguire la seguente classe di prova senza modificarla.


```java
public class ProvaEserc1 {

	public static void main(String[] args) {
		Annotazione s1 = new Annotazione("a","b1","c1");
		Annotazione s2 = new Annotazione("a","b2","c2");
		Annotazione s3 = new Annotazione("a3","b3","c3");
		System.out.println(s1);
		System.out.println(s1.haTipo("c1"));
		System.out.println(s1.haTipo("c2"));
		System.out.println(s1.uguali(s2));
		System.out.println(s1.uguali(s3));
		BloccoNote pref = new BloccoNote();
		pref.aggiungi("http://www.google.it", "GOOGLE", "Motore di ricerca");
		pref.aggiungi("http://www.amazon.com", "AMAZON", "Shop on-line");
		pref.aggiungi("http://www.itunesstore.com", "ITUNES", "Shop on-line");
		pref.aggiungi("http://www.ebay.it", "EBAY", "Shop on-line");
		pref.aggiungi("http://www.repubblica.it", "REPUBBLICA", "Informazione");
		System.out.println("Totale annotazioni: " + pref.quanteAnnotazioni());
		System.out.println(pref.quanteTipo("Motore di ricerca"));
		System.out.println(pref.quanteTipo("Shop on-line"));
		System.out.println(pref.quanteTipo("Pippo"));
		System.out.println(pref.quanteTipo("Informazione"));
		pref.stampaTipo("Shop on-line");
		pref.eliminaTipo("Shop on-line");
		pref.stampaTipo("Shop on-line");
		System.out.println("Totale annotazioni: " + pref.quanteAnnotazioni());
		System.out.println(pref.quanteTipo("Motore di ricerca"));
		System.out.println(pref.quanteTipo("Shop on-line"));
		System.out.println(pref.quanteTipo("Informazione"));
		System.out.println(pref.haDuplicati());
		pref.aggiungi("http://www.google.it", "FUGOL", "Pastrocchio di rierca");
		System.out.println(pref.haDuplicati());		
	}
	
}
```