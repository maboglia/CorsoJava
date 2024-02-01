# Esercizio Prodotto-Carrello

Scrivere una classe java **Prodotto** che rappresenta un **prodotto** ordinabile in un sito internet per vendite on-line. Il **prodotto** e' caratterizzato da una descrizione (stringa), dal prezzo (double) e da un booleano che posto uguale a TRUE rappresenta il fatto che il **prodotto** e' in promozione. La classe ha un costruttore che presi in ingresso una stringa, un double e un boolean li imposta come campi d'esemplare del nuovo oggetto, e in piu' fornisce i seguenti metodi:

* `isInPromozione()` che restituisce un boolean che rappresenta il fatto che il **prodotto** su cui si invoca il metodo e' in promozione
* `getPrezzo()`che restituisce il prezzo del **prodotto**
* `setPrezzo(d)` che preso in ingresso un double d lo imposta come nuovo prezzo del **prodotto**

Scrivere poi una classe java **Carrello**. Un **carrello** e' caratterizzato da una stronga rappresentante il nome del cliente che sta acquistando e da un array (inizialmente vuoto) di prodotti ordinati, ognuno dei quali ha associata la quantita' ordinata. La classe ha un costruttore che prende in ingresso il nome del cliente e inizializza il nuovo **carrello**, e inoltre fornisce i seguenti metodi:

* `aggiungiProdotto(p,q)` che presi in ingresso un prodotto p e un intero q aggiunge il prodotto p all'array dei prodotti ordinati, con quantita' corrispondente q
* `totale()` che restituisce il totale dell'ordine
* `totalePromozione()` che restituisce l'importo totale dei prodotti in promozione contenuti nell'ordine
* `numeroTotaleProdotti()` che restituisce la somma delle quantita' ordinate di tutti i prodotti
* `prodottiOrdinati()` che restituisce il numero dei diversi prodotti ordinati

Si scrivano le classi in modo da poter compilare ed eseguire la seguente classe di prova senza doverla modificare.

```java
public class ProvaEserc1 {
	public static void main(String[] args) {
		Prodotto p1 = new Prodotto("ram",22.5,false);
		Prodotto p2 = new Prodotto("hd",62.5,false);
		Prodotto p3 = new Prodotto("alimentatore",74,false);
		Prodotto p4 = new Prodotto("monitor",300,false);
		Prodotto p5 = new Prodotto("tastiera",25.5,true);
		Prodotto p6 = new Prodotto("mouse",12.5,true);
		Carrello o = new Carrello("Il carrello di Andrea");
		o.aggiungiProdotto(p1, 3);
		o.aggiungiProdotto(p2, 4);
		o.aggiungiProdotto(p3, 3);
		o.aggiungiProdotto(p4, 1);
		o.aggiungiProdotto(p5, 3);
		o.aggiungiProdotto(p6, 2);
		System.out.println("Totale:             " + o.totale());
		System.out.println("Totale promozione:  " + o.totalePromozione());
		System.out.println("Prodotti:           " + o.prodottiOrdinati());
		System.out.println("Prodotti ordinati:  " + o.numeroTotaleProdotti());
		p1.setPrezzo(10);
		p2.setPrezzo(10);
		p3.setPrezzo(10);
		p4.setPrezzo(10);
		p5.setPrezzo(10);
		p6.setPrezzo(10);
		System.out.println("Totale:             " + o.totale());
		System.out.println("Totale promozione:  " + o.totalePromozione());
		System.out.println("Prodotti:           " + o.prodottiOrdinati());
		System.out.println("Prodotti ordinati:  " + o.numeroTotaleProdotti());		
	}	
}
```