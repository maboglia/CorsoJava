class Colonna {

	private String nome;
	private int quantita;

	public Colonna(String nome, int quantita) {
		this.nome = nome;
		this.quantita = quantita;
	}

	public String ottieniNome() {
		return nome;
	}

	public void decrementaQuantita() {
		quantita--;
	}

	public int ottieniQuantita() {
		return quantita;
	}
}
