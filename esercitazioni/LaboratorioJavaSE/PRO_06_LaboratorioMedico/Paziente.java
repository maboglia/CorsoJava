package progetti.laboratorioMedico;

public class Paziente implements Persona, Comparable {

	private String nome;
	private String cognome;
	private String cf;
	private Dottore medico;
	
	
	
	public Paziente(String nome, String cognome, String cf) {
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}

	@Override
	public int compareTo(Object o) {
		Paziente altro = (Paziente) o;
		int c =this.cognome.compareTo(altro.cognome);
		if(c != 0) return c;
		int n = this.nome.compareTo(altro.nome);
		return n;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public String getCognome() {
		// TODO Auto-generated method stub
		return cognome;
	}

	@Override
	public Medico getMedico() {
		// TODO Auto-generated method stub
		return medico;
	}

	/**
	 * @param medico the medico to set
	 */
	public void setMedico(Dottore medico) {
		this.medico = medico;
	}

	
}
