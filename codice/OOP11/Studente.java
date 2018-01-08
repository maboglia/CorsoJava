
public class Studente{

	String matricola;
	String nome;
	String cognome;
	
	public Studente(String m, String n, String c) {
		this.matricola = m;
		this.cognome = c;
		this.nome = n;
	}

	
//restituire < 0 se this < other	
//restituire 0 se this == other	
//restituire >0 se this > other	
	
//	@Override
//	public int compareTo(Studente o) {
//
//		int comparaCognome = this.matricola.compareTo(o.matricola);
//		return comparaCognome;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Studente: " +  this.cognome;
	}
	
}

