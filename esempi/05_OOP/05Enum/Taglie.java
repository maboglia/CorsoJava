package enumerazioni;

public enum Taglie {

	S(38), M(42), L(46), XL(50, "occhio che veste gigante!!!");
	
	private int tagliaeu;
	private String descrizione;
	
	private Taglie(int tagliaeu) {
		this.tagliaeu = tagliaeu;
		this.descrizione = "slim fit";
	}
	
	private Taglie(int tagliaeu, String descrizione) {
		this.tagliaeu = tagliaeu;
		this.descrizione = descrizione;
	}
	
	
	
	public String stampaTaglia() {
		return "La taglia in formato EU è " + this.tagliaeu + ", " + this.descrizione; 
	}
	
}
