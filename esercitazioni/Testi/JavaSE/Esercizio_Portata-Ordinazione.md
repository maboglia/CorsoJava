# Esercizio Portata-Ordinazione

Scrivere una classe java **Portata** che rappresenta una **portata** ordinabile in un ristorante. La **portata** e' caratterizzata da una descrizione (stringa), dal prezzo (double) e da un booleano che posto uguale a TRUE rappresenta il fatto che la **portata** e' una bevanda. La classe ha un costruttore che presi in ingresso una stringa, un double e un boolean li imposta come campi d'esemplare del nuovo oggetto, e in piu' fornisce i seguenti metodi:

* `isBevanda()` che restituisce un boolean che rappresenta il fatto che la **portata** su cui si invoca il metodo e' una bevanda
* `getPrezzo()` che restituisce il prezzo della **portata**
* `setPrezzo(d)` che preso in ingresso un double d lo imposta come nuovo prezzo della **portata**

Scrivere poi una classe java **Ordinazione**. Un'**ordinazione** e' caratterizzata da una stringa rappresentante il nome del cliente che ha effetuato l'**ordinazione** e da un array (inizialmente vuoto) di portate ordinate, ognuna delle quali ha associata la quantita' ordinata. La classe ha un costruttore che prende in ingresso il nome del cliente e inizializza la nuova **ordinazione**, e inoltre fornisce i seguenti metodi:

* `aggiungiPortata(p,q)` che presi in ingresso una portata p e un intero q aggiunge la portata p all'array delle portate ordinate, con quantita' corrispondente q
* `conto()` che restituisce il conto totale dell'**ordinazione**
* `contoBevande()` che restituisce il costo totale delle bevande contenute nell'**ordinazione**
* `numeroTotalePortate()` che restituisce la somma delle quantita' ordinate di tutte le portate
* `portateOrdinate()` che restituisce il numero delle diverse portate ordinate

Si scrivano le classi in modo da potercompilare ed eseguire la seguente classe di prova senza doverla modificare.

```java
public class ProvaEserc1 {
	public static void main(String[] args) {
		Portata p1 = new Portata("antipasto",8.5,false);
		Portata p2 = new Portata("amatriciana",12.5,false);
		Portata p3 = new Portata("bistecca",25,false);
		Portata p4 = new Portata("insalata",3,false);
		Portata p5 = new Portata("negramaro",15.5,true);
		Portata p6 = new Portata("acqua",2.5,true);
		Ordinazione o = new Ordinazione("luca");
		o.aggiungiPortata(p1, 3);
		o.aggiungiPortata(p2, 4);
		o.aggiungiPortata(p3, 3);
		o.aggiungiPortata(p4, 1);
		o.aggiungiPortata(p5, 3);
		o.aggiungiPortata(p6, 2);
		System.out.println("Conto:          " + o.conto());
		System.out.println("Conto bevande:  " + o.contoBevande());
		System.out.println("Portate:        " + o.portateOrdinate());
		System.out.println("Totale portate: " + o.numeroTotalePortate());
		p1.setPrezzo(10);
		p2.setPrezzo(10);
		p3.setPrezzo(10);
		p4.setPrezzo(10);
		p5.setPrezzo(10);
		p6.setPrezzo(10);
		System.out.println("Conto:          " + o.conto());
		System.out.println("Conto bevande:  " + o.contoBevande());
		System.out.println("Portate:        " + o.portateOrdinate());
		System.out.println("Totale portate: " + o.numeroTotalePortate());		
	}	
}
```
