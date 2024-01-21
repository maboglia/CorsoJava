package spotify;

public class Canzone {

	String cantante;
	String titolo;

	public Canzone(String cantante, String titolo) {
		
		this.cantante = cantante;
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		return "Canzone [cantante=" + cantante + ", titolo=" + titolo + "]";
	}
	
	
	
}
