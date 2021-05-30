package negozio1;

public class Prodotto {

	private String codice, descrizione;
	private double prezzo;
	
	/**
	 * @param codice
	 * @param descrizione
	 * @param prezzo
	 */
	public Prodotto(String codice, String descrizione, double prezzo) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @return the prezzo
	 */
	public double getPrezzo() {
		return prezzo;
	}
	
	
	
	
}
