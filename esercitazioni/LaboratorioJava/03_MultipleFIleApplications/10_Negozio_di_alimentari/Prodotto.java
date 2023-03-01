public class Prodotto {
	
	private String codice;
	private String desc;
	private double prezzo;
	
	public Prodotto(String codice, String desc, double prezzo){
		this.codice = codice;
		this.desc = desc;
		this.prezzo	= prezzo;
	}
	
	public double ottieniPrezzo(){
		return prezzo;
	}
	
	public String ottieniCodice(){
		return codice;
	}
	
	public String ottieniDescrizione(){
		return desc;
	}
}