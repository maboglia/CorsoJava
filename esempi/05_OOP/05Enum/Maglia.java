package enumerazioni;

public class Maglia {

	Colori colore;
	String scritta;

	public Maglia(Colori colore, String scritta) {
		this.colore = colore;
		this.scritta = scritta;
	}

	@Override
	public String toString() {
		return "Maglia [colore=" + colore + ", scritta=" + scritta + "]";
	}
	
	
	
}
