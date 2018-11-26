package model;

public abstract class Abito implements Comparable<Abito>{

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Abito o) {
		String s1 = this.getClass().getSimpleName();
		String s2 = o.getClass().getSimpleName();
		return s1.compareTo(s2);
	}

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
