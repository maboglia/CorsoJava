package esempi.week4;

public class Studente {

	//dichiarazione delle variabili di tipo stringa

	private static int matricola  = 0;
	private String nome, cognome;
	private char genere;

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola() {
		if (matricola == 13) 
		this.matricola = matricola + 2;
		else
		this.matricola = matricola + 1;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	//overload dei metodi
	public Studente(){ 
		this.setMatricola();
	}
	
	public Studente(String cognome){ 
		this.cognome = cognome; 
		this.setMatricola();
		}
	
	public Studente(String nome, String cognome, char genere){
		this.nome = nome;
		this.cognome = cognome;
		this.genere= genere;
		this.setMatricola();
	}
	
	public char getGenere() {
		return genere;
	}

	public void setGenere(char genere) {
		this.genere = genere;
	}

	public void presentaStudente(){
		System.out.println( this  );
	}

	@Override
	public String toString() {
		
			return  "Nome: " + this.nome + "\n" +
						"Cognome: " + this.cognome + "\n" +
						"Genere: " + this.genere + "\n" +
						"Matricola: " + this.matricola + "\n" +
						"---------------------------------------------";
	}
	
	
}
