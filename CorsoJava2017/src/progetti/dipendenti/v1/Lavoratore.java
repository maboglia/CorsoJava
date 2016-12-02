package progetti.dipendenti.v1;

public  class Lavoratore {

	private String nome, cognome;
	
	private static final double STIPENDIO_BASE = 22;

	public Lavoratore(String nome, String cognome) {

		this.nome = nome;
		this.cognome = cognome;
		System.out.println("ho costruito un oggetto di tipo Lavoratore");
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}
	
	public double calcolaStipendio(int numeroOre){
		
		return numeroOre * STIPENDIO_BASE;
		
	}
	

}
