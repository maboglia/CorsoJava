package progetti.aula.v1;

import java.util.Date;

public class Studente {	

	//stato interno della classe, contiene attributi (dati)
	/**
	 * Incapsulamento
	 */
	private String nome;
	
	private String cognome;
	Date dataNascita;
	
	int eta;
	char genere;
	boolean presente;
	
	/**
	 * metodi - operazioni sui dati
	 */
	
	
	//metodo getter
	public String getNome(){
		
		return "Sig. " + nome;
		
	}
	//metodo setter
	public void setNome(String nuovoNome){
		
		nome = nuovoNome;
		
	}
	
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	//metodi costruttori
	public Studente(){}
	//firma del metodo: NomeClasse(tipo parametro nome_parametro, tipo parametro nome_parametro, )
	public Studente(String _nome, String _cognome){
		nome = _nome;
		cognome = _cognome;		
		
	}
	public Studente(String _nome, String _cognome, char _genere){
		nome = _nome;
		cognome = _cognome;		
		this.genere = _genere;
	}

	
	
	/** Metodo per creare un nuovo studente
	 * @param _nome inserire il nome dello studente
	 * @param _cognome inserire il cognome dello studente
	 */
	public void creaStudente(String _nome, String _cognome, Date _dataNascita){
		nome = _nome;
		cognome = _cognome;
		dataNascita = _dataNascita;
	}
	
	
	
	/**
	 * 
	 */
	public void stampaSaluto(){
		
		System.out.println("Ciao!");
		System.out.println("Mi chiamo " + nome + " "+ cognome +" ");
		if (genere == 'M')
		System.out.println("Sono di genere maschile");
		else
			System.out.println("Sono di genere femminile");
		
			
		
	}
	
	public int faiAddizione(int a, int b){
		int somma = a + b;
		System.out.print( nome );
		System.out.println(somma);
		return somma;
	}
	
}
