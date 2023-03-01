class CartaPrepagata {

	private int id;
	private double credito;

	public CartaPrepagata(int id, double credito) {
		this.id = id;
		this.credito = credito;
	}

	public int ottieniId() {
		return id;
	}

	public double ottieniCredito() {
		return credito;
	}

	public void riduciCredito(double costo) {
		credito -= costo;
	}

	public void ricarica(double ammontare) {
		credito += ammontare;
	}
}
