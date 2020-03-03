package esempio;

public class Impiegato {
	private String nome;
	private double stipendio;
	
	public Impiegato(String n) {
		nome = n;
		stipendio = 1500.0;
	}
	
	public void setNome(String n) {
		nome = n;
	}
	
	public void setStipendio(double s) {
		stipendio = s;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getStipendio() {
		return stipendio;
	}
}
