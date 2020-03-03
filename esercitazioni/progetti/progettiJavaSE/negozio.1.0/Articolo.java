package negozio1;

public class Articolo implements Comparable<Articolo>{

	private Prodotto prodotto;
	
	private int pezzi;
	private double prezzoFinale;
	/**
	 * @param prodotto
	 * @param pezzi
	 * @param prezzoFinale
	 */
	public Articolo(Prodotto prodotto, int pezzi, double prezzoFinale) {
		this.prodotto = prodotto;
		this.pezzi = pezzi;
		this.prezzoFinale = prezzoFinale;
	}
	/**
	 * @return the prodotto
	 */
	public String getProdotto() {
		return prodotto.getDescrizione();
	}
	/**
	 * @return the pezzi
	 */
	public int getPezzi() {
		return pezzi;
	}
	/**
	 * @return the prezzoFinale
	 */
	public double getPrezzoFinale() {
		return prezzoFinale;
	}
	@Override
	public int compareTo(Articolo o) {

		return this.prodotto.getDescrizione().compareTo(o.getProdotto());
				
	}
	
	
	
	

}
