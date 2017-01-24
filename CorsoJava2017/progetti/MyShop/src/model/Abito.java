package model;

public abstract class Abito {

	String misura;
	Enum taglia; 
	String colore;
	Double prezzo;
	String marca;
	
	public abstract String descriviProdotto();
}
