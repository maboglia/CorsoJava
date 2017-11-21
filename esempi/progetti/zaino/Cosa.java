package progetti.zaino;

public class Cosa {

	private String nome, descrizione;

	public Cosa(String nome, String descrizione) {
		this.nome = nome;
		this.descrizione = descrizione;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n Oggetto contenuto: " +this.getNome() + "\n Descizione dell'oggetto: " + this.getDescrizione();
	}
	
	
	
	
}
