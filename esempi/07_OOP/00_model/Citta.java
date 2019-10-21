package collezioni;

public class Citta {

	private String nome;
	private long popolazione;
	private String regione;
	
	public Citta(String nome, long pop, String regione) {
		this.nome = nome;
		this.popolazione = pop;
		this.regione = regione;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRegione() {
		return regione;
	}
	
	public long getPopolazione() {
		return popolazione;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome  + " "+ this.regione + " "+this.popolazione;
	}
}
