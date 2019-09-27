package aula;

import java.util.GregorianCalendar;
/**
 * 
 * @author mauro
 *
 */
public class Studente {
     
	
	//  Dati, attributi, proprietà, campi: stato interno
	String nome; // qui scrivi il nome de
	String cognome;
	GregorianCalendar data_nascita;
	int eta;
	char genere;
	int matricola;
	static int generaMatricola;
	boolean presente;
	
	//Metodo -------------------------------------------------//
/**
 * Costruttore dell'oggetto studente che inizializza tutti i parametri		
 * @param nome inserisci una String che riporta il nome dello studente
 * @param cognome
 * @param data_nascita
 * @param eta
 * @param genere
 */
	public Studente(String nome, String cognome, char genere) {
		generaMatricola++;
		this.matricola =    generaMatricola ;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = 0;
		this.genere = genere;
		this.presente = false;
		this.data_nascita = 	new GregorianCalendar(1900, 0, 1);
	}
	//overload del metodo costruttore
	public Studente(String nome, String cognome, GregorianCalendar data_nascita, char genere) {
		generaMatricola++;
		this.matricola =    generaMatricola ;
		this.nome = nome;
		this.cognome = cognome;
		this.data_nascita = data_nascita;
		this.eta = 0;
		this.genere = genere;
		this.presente = false;
	}
	
	public String stampaInfo(){
		
		return 
				"matricola: " + this.matricola + "\n " + 
				"nome: " + this.nome.toUpperCase() + "\n" + 
				"cognome: " + this.cognome.toUpperCase() + "\n " + 
				"genere: " + this.genere + "\n" + 
				//"data_nascita: " + this.data_nascita.getTime()+ " " + 
				"presente: " + this.presente+ "\n" ;
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "-------------------------------------------"+ "\n " +
				"matricola: " + this.matricola + "\n " + 
		"nome: " + this.nome.toUpperCase() + "\n" + 
		"cognome: " + this.cognome.toUpperCase() + "\n " + 
		"presente: " + this.presente + "\n " + 
		 "\n" ;
	}
	


	
	
	
}
