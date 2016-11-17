package progetti.agenda;

import java.util.ArrayList;
import java.util.Date;

public class Agenda2 {

	//dichiaro un oggetto di tipo ArrayList
	private ArrayList<Appuntamento> appuntamenti;
	
	public Agenda2(){
		this.appuntamenti =  new ArrayList<>();
	}
	
	public void creaAppuntamento(String descrizione, Date data, int priorita){
		appuntamenti.add(      new Appuntamento(descrizione, data, priorita)     ); 
	}
	
	public ArrayList<Appuntamento> leggiAgenda(){
		return this.appuntamenti;
	}
}
