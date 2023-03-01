public class Articolo implements Comparable {
	
	private Prodotto prodotto;
	private int pezzi;
	private double prezzoFinale;
	
	public Articolo(Prodotto prodotto, int pezzi, double prezzo){
		this.prodotto = prodotto;
		this.pezzi = pezzi;
		this.prezzoFinale = prezzo;
	}
	public String ottieniDescrizione() {
		return prodotto.ottieniDescrizione();
	}
	
	public int ottieniPezzi() {
		return pezzi;
	}

	public double ottieniPrezzo() {
		return prezzoFinale;
	}
	
	public int compareTo(Object o) {
	
		if (!(o instanceof Articolo)) 
			throw new IllegalArgumentException();
		
		Articolo articolo = (Articolo)o;

		return this.prodotto.ottieniDescrizione().compareTo(articolo.prodotto.ottieniDescrizione());
	} 
}
