package model;

public class Pantalone extends Abito {

	@Override
	public String descriviProdotto() {
		// TODO Auto-generated method stub
		return "Pantalone " + this.taglia + " " + this.colore + " "  + this.prezzo ;
	}
 public Pantalone (Taglie taglia, Colori colore, double prezzo) {
		this.taglia = taglia;
		this.colore = colore;
		this.prezzo = prezzo;
		if (taglia == Taglie.XL)
		this.prezzo = prezzo * 1.5;
		
		//System.out.println(taglia.descrizione + taglia.misura);
	}
}
