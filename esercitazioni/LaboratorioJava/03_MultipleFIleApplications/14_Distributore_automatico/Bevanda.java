class Bevanda {

	private String nome;
	private double prezzo;

	public Bevanda(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public String ottieniNome() {
		return nome;
	}

	public double ottieniPrezzo() {
		return prezzo;
	}

}
