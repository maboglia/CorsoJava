package model;

import java.util.Random;


/**
 * Classe che serve per rappresentare un generico dado
 * @author mauro
 *
 */
public class Dado {

	/**
	 * variabile di istanza: il numero delle facce
	 */
	private int numFacce;
	
	private Random rand;
	
	//costruttore mi serve per inizializzare l'oggetto
	
	public Dado(){
		
		this.numFacce = 6;
		rand = new Random();
		
	}
	
	//firma - signature del metodo: nome metodo +argomenti (numero, posizione, tipo)
	/**
	 * Costruttore del dado
	 * @param numFacce inserire un intero che rappresenta il numero di facce
	 */
	public Dado(int numFacce){
		
		this.numFacce = numFacce;
		rand = new Random();
	}
	
	public void setNumFacce (int nuovoValore){
		numFacce = nuovoValore;
	}
	
	public int  lancia(){
		//variabile locale
		int facciaDado;
		//genero un numero casuale da 1 a valore della variabile di istanza numFacce
		facciaDado = rand.nextInt(numFacce) + 1;
		
		return facciaDado;
	}
	
}
