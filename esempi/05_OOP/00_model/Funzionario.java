package esempio;

public class Funzionario extends Impiegato {

	public Funzionario(String n) {
		super(n); // chiama il costruttore della classe base
		setStipendio(2500);
	}
	
	public String getNome() {
		String n = super.getNome(); // chiamo getNome di Impiegato
		return n + " (Funzionario)"; // aggiungo una stringa mia
	}
}
