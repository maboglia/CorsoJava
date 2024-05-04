package enumerazioni;

public enum Colori {

	RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");
	
	String esadecimale;
	
	private Colori(String esa) {
		esadecimale = esa;
	}
	
	@Override
	public String toString() {
		
		return esadecimale;
	}
	
}
