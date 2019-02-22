package studenti;

public class Studente {

    /**
     * Stato interno della classe
     * 
     * */
	final int ANNO = 2017;
	private String nome;
	private String cognome;
    private int year;
    private int eta;
    private int challengeJS;
    private int challengeJava;
    
	/**
	 * Costruttore vuoto senza argomenti 
	 */
	public Studente() {}

	/**  Costruttore di studente con 3 parametri
	 * @param nome - inserire nome studente
	 * @param cognome - inserire cognome studente
	 * @param year - inserire anno di nascita nel formato yyyy
	 */
	public Studente(String nome, String cognome, int year) {
		this.nome = nome;
		this.cognome = cognome;
		this.year = year;
		this.setEta();
	}

	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
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
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the eta
	 */
	public int getEta() {
		return eta;
	}

	/**
	 * 
	 */
	public void setEta() {
		if(this.year > 0)
		this.eta = this.ANNO - this.year;
		else this.eta = 10;
	
	}

	/**
	 * @return the challengeJS
	 */
	public int getChallengeJS() {
		return challengeJS;
	}

	/**
	 * @param challengeJS the challengeJS to set
	 */
	public void setChallengeJS(int challengeJS) {
		this.challengeJS = challengeJS;
	}

	/**
	 * @return the challengeJava
	 */
	public int getChallengeJava() {
		return challengeJava;
	}

	/**
	 * @param challengeJava the challengeJava to set
	 */
	public void setChallengeJava(int challengeJava) {
		this.challengeJava = challengeJava;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", challengeJS=" + challengeJS
				+ ", challengeJava=" + challengeJava + "]";
	}
	
	public String firma(){
		return this.nome + " " + this.cognome;
	}
    
	
	public String firmaInversa(){
		return this.cognome + " " + this.nome;
	}
	
	
}
