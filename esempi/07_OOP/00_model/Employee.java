package esempio;

public class Employee {
	private String nome;
	private double stipendio;
	
	public Employee() {
		nome = null;
		stipendio = 0;
	}
	
	public Employee(String nuovoNome, double nuovoStipendio) {
		nome = nuovoNome;
		stipendio = nuovoStipendio;
	}
	
	public void setNome(String nuovoNome) {
		nome = nuovoNome;
	}

	public void setStipendio(double nuovoStipendio) {
		stipendio = nuovoStipendio;
	}

	public String getNome() {
		return nome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void aumentaStipendio(double percentuale) {
		stipendio = stipendio + stipendio * (percentuale / 100.0);
	}
}
