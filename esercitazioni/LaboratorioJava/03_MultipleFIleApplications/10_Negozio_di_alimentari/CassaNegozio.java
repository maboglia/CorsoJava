import java.util.*;

public class CassaNegozio implements Cassa {

	private Map prodotti = new HashMap();

	private List fattura = new LinkedList();
	private double totaleLordo;

	private String codicePromozione;
	private int scontoPromozione;

	public void aggiungiProdotto(String codice, String desc, double prezzo) {
		Prodotto p = new Prodotto(codice, desc, prezzo);
		prodotti.put(codice, p);
	}

	public void promozione(String codice, int sconto) {
		codicePromozione = codice;
		scontoPromozione = sconto;
	}

	public void leggi(String codice, int pezzi) throws ProdottoInesistente{
		Prodotto p = (Prodotto) prodotti.get(codice);
		
		if (p == null)
			throw new ProdottoInesistente();
		
		double prezzo = pezzi * p.ottieniPrezzo();
		
		if (inPromozione(p))
			prezzo *= (100 - scontoPromozione)/100.0;

		fattura.add(new Articolo(p, pezzi, prezzo));
		
		totaleLordo += prezzo;
	}
	
	private boolean inPromozione(Prodotto p) {
		return p.ottieniCodice().equals(codicePromozione);
	}
	
	public double totale() {
		return totaleLordo;
	}

	public double netto() {
		return totaleLordo / (1 + IVA);
	}

	public double tasse() {
		return totaleLordo / (1 + IVA) * IVA;
	}

	public void stampa() {
	
		Collections.sort(fattura);
		
		for(Iterator i=fattura.iterator(); i.hasNext(); ){
			Articolo articolo = (Articolo)i.next();
			
			System.out.print(articolo.ottieniPezzi()+ " x ");
			System.out.print("\t");
			System.out.print(articolo.ottieniDescrizione());
			System.out.print("\t");
			System.out.println(articolo.ottieniPrezzo());
		}
	}
	
	public void chiude() {
		fattura = new LinkedList();
		totaleLordo = 0;
	}
}
