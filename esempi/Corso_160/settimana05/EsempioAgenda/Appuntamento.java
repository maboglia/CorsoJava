package settimana05;

public class Appuntamento {

	private String descrizione;
	private int priorita;
	private int giorno;
	private int mese;
	private int anno;
	

	//public Appuntamento() {}
	
	
	public Appuntamento(String descrizione, int giorno, int mese, int anno) {

		this.descrizione = descrizione;
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
	}



	public Appuntamento(String descrizione) {

		this.descrizione = descrizione;
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



	/**
	 * @return the priorita
	 */
	public int getPriorita() {
		return priorita;
	}



	/**
	 * @param priorita the priorita to set
	 */
	public void setPriorita(int priorita) {
		this.priorita = priorita;
	}



	/**
	 * @return the giorno
	 */
	public int getGiorno() {
		return giorno;
	}



	/**
	 * @param giorno the giorno to set
	 */
	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}



	/**
	 * @return the mese
	 */
	public int getMese() {
		return mese;
	}



	/**
	 * @param mese the mese to set
	 */
	public void setMese(int mese) {
		this.mese = mese;
	}



	/**
	 * @return the anno
	 */
	public int getAnno() {
		return anno;
	}



	/**
	 * @param anno the anno to set
	 */
	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String leggiDataCompleta(){
		String s = this.giorno + "/" +this.mese + "/" + this.anno;
		
		return s;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("--------------------------" );
		sb.append("\n");
		sb.append(this.descrizione);
		sb.append("\n");
		sb.append(this.leggiDataCompleta());
		
		
		return sb.toString();
	}


	
	
	
}
