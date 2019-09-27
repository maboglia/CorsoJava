package corso;

import java.util.ArrayList;

public class Registro {

	
	ArrayList<Studente> studenti;

	public Registro() {
		
		this.studenti = new ArrayList<>();
		this.inizializzaRegistro();
	}

	private void inizializzaRegistro() {
		
		//inizializzo il mio arraylist di studenti
		studenti.add(new Studente("Annarita", "Amendola", 'F'  ));
		studenti.add(new Studente("Umberto", "Angelone", 'M'  ));
		studenti.add(new Studente("Edita", "Burovaite", 'F'  ));
		studenti.add(new Studente("Federica", "Caiulo", 'F'  ));
		studenti.add(new Studente("Paolo", "Cetola", 'M'  ));
		studenti.add(new Studente("Maurizio", "Cristiani", 'M'  ));
		studenti.add(new Studente("Marco", "De palma", 'M'  ));
		studenti.add(new Studente("Luca ", "Di Biase", 'M'  ));
		studenti.add(new Studente("emmanuel", "dzuko sakepa", 'M'  ));
		studenti.add(new Studente("Jean claude", "fansi", 'M'  ));
		studenti.add(new Studente("Michele", "La riccia", 'M'  ));
		studenti.add(new Studente("Tina", "Labate", 'F'  ));
		studenti.add(new Studente("Raul", "Lara Molina", 'M'  ));
		studenti.add(new Studente("Teresa", "Missanelli", 'F'  ));
		studenti.add(new Studente("Chiara", "Quattrocchi", 'F'  ));

	}
	
	public ArrayList<Studente> getStudenti() {
		return studenti;
	}
	
	
}
