package model;

public class Giacca extends Abito {

	
	
	@Override
	public String descriviProdotto() {
//		System.out.println(this.taglia);
		return "Giacca " + this.taglia + " " + this.colore + " "  + this.prezzo ;

	}

	public Giacca() {

	}

	public Giacca(Taglie taglia, Colori colore, double prezzo) {
		this.taglia = taglia;
		this.colore = colore;
		this.prezzo = prezzo;
		if (taglia == Taglie.XL)
		this.prezzo = prezzo * 1.5;
		
		//System.out.println(taglia.descrizione + taglia.misura);
	}
	
	
	
}
