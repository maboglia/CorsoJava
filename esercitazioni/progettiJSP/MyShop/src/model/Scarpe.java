package model;

public class Scarpe extends Abito {

	@Override
	public String descriviProdotto() {
		// TODO Auto-generated method stub
		return "Scarpe " + this.taglia + " " + this.colore + " "  + this.prezzo ;
	}
	 public Scarpe(Taglie taglia, Colori colore, double prezzo) {
			this.taglia = taglia;
			this.colore = colore;
			this.prezzo = prezzo;

		}
}
