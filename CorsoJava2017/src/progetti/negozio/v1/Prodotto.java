package progetti.negozio.v1;

public class Prodotto {

	private String nome;
	private double prezzo; 
	
	public Prodotto(String nome, double prezzo) {

		this.nome = nome;
		this.prezzo = prezzo;
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
	 * @return the prezzo
	 */
	public double getPrezzo() {
		return prezzo;
	}

	/**
	 * @param prezzo the prezzo to set
	 */
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}



}
