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
	protected Voce getVoce() {
		return voce;
	}

	/**
	 * @param voce the voce to set
	 */
	protected void setVoce(Voce voce) {
		this.voce = voce;
	}

	/**
	 * @return the posizione
	 */
	protected int getPosizione() {
		return posizione;
	}

	/**
	 * @param posizione the posizione to set
	 */
	protected void setPosizione(int posizione) {
		this.posizione = posizione;
	}
	
	
	
	
}
