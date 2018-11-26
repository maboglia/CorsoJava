package negozio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CassaNegozio implements Cassa {

	private Map<String, Prodotto> prodotti = new HashMap<>();
	
	private List<Articolo> fattura = new LinkedList<>();
	private List<Prodotto> fatturaOld = new ArrayList<>();
	
	private double totaleLordo;
	
	private String codicePromozione;
	private int scontoPromozione;
	
	
	public void aggiungiProdotto(String codice, String descrizione, double prezzo){
		
		Prodotto p = new Prodotto(codice, descrizione, prezzo);
		prodotti.put(codice, p);
		
	}
	
	public void promozione(String codice, int sconto){
		  codicePromozione = codice;
		  scontoPromozione = sconto;
		
	}
	
	private boolean inPromozione(Prodotto p){
		return p.getCodice().equals(codicePromozione);
	}
	
	@Override
	public void leggi(String codice, int pezzi) throws ProdottoInesistente {

		Prodotto p = prodotti.get(codice);
		
		if (p == null) {
			throw new ProdottoInesistente();
		}

		double prezzo = pezzi * p.getPrezzo();

		if(inPromozione(p)){
			prezzo *= (100 - scontoPromozione) / 100.0;
		}
		
		//idea di ludovica e alberto
		for (int i = 0; i < pezzi; i++) {
			fatturaOld.add(p);
		}
		
		//altra idea
		fattura.add(new Articolo(p, pezzi, prezzo));
		
		//TODO: gestire la promozione sui prodotti
		
		totaleLordo += prezzo;
		
	}

	@Override
	public double totale() {
		// TODO Auto-generated method stub
		return totaleLordo;
	}

	@Override
	public double netto() {
		// TODO Auto-generated method stub
		return totaleLordo / (1 + IVA);
	}

	@Override
	public double tasse() {
		// TODO Auto-generated method stub
		return totaleLordo / (1 + IVA) *  IVA; 
	}

	@Override
	public void stampa() {

		Collections.sort(fattura);
		
		System.out.println(fattura);
		for (Articolo articolo : fattura) {
			System.out.println(articolo.getProdotto() + "\t" + articolo.getPezzi() + "\t" + articolo.getPrezzoFinale() );
		}
		//System.out.println(fatturaOld);
		
	}

	@Override
	public void chiude() {
		// TODO Auto-generated method stub
		fattura = new LinkedList<>();
		fatturaOld = new ArrayList<>();
		totaleLordo=0;
	}

	
	
	
}
