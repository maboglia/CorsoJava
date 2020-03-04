package progetti.laboratorioMedico;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Dottore extends Paziente implements Medico{

	private String matricola;
	private List<Paziente> pazienti = new LinkedList<>();
	
	
	public Dottore(String nome, String cognome, String cf, String matricola) {
		super(nome, cognome, cf);
		this.matricola = matricola;
	}

	@Override
	public String getMatricola() {
		// TODO Auto-generated method stub
		return matricola;
	}

	public void aggiungiPaziente(Paziente p){
		pazienti.add(p);
	}
	
	public Collection<Paziente> getPazienti(){
		Collections.sort(pazienti);
		return pazienti;
	}
	
}
