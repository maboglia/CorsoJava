package progetti.archivioCD;

public class CD {

	private String titolo, autore;
	private final static String DESCRIZIONE = "Titolo: %s Autore: %s";
	
	
	
	public CD(String titolo, String autore) {
		
		this.titolo = titolo;
		this.autore = autore;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuffer result = new StringBuffer();
		result.append(String.format(DESCRIZIONE, titolo, autore));
		
		return result.toString();
	}
	
	
	
	
	
}
