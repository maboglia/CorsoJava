package listaspesa;

public class ModificaVoce {

	private Voce voce;
	private int posizione;
	
	
	public ModificaVoce() {

		this.voce = new Voce("");
		this.posizione = -1;
	}
	
	public ModificaVoce(Voce _voce, int _posizione) {
		
		this.voce = _voce;
		this.posizione = _posizione;
	}

	/**
	 * @return the voce
	 */
	public Voce getVoce() {
		return voce;
	}

	/**
	 * @param voce the voce to set
	 */
	public void setVoce(Voce voce) {
		this.voce = voce;
	}

	/**
	 * @return the posizione
	 */
	public int getPosizione() {
		return posizione;
	}

	/**
	 * @param posizione the posizione to set
	 */
	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}
	
	/**
	 * @param posizione the posizione to set
	 */
	public void setMessaggio(String messaggio) {
		this.voce.setMessaggio(messaggio);
	}
	
	
	
	
}
