package progetti.agenda;

import java.util.Date;

public class Agenda {

	private Appuntamento[] appuntamenti;
	private final int NUM_APPUNTAMENTI = 10;
	private int contatore = 0;
	
	public Agenda(){
		this.appuntamenti =  new Appuntamento[NUM_APPUNTAMENTI];
	}
	
	public void creaAppuntamento(String descrizione, Date data, int priorita){

		
		if (this.contatore < NUM_APPUNTAMENTI )
		appuntamenti[contatore] =  new Appuntamento(descrizione, data, priorita); 

		this.contatore++;
		
	}
	
	public Appuntamento[] leggiAgenda(){
		
		return this.appuntamenti;
		
	}
	
	
	
	
}
