package model;

public abstract class Abito {

	Taglie taglia; 
	Colori colore;
	String misura;
	String marca;
	Double prezzo;
	
	public abstract String descriviProdotto();

	/**
	 * @return the prezzo
	 */
	public Double getPrezzo() {
		return prezzo;
	}
	
	
}
