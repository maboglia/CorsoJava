package settimana06;

import java.util.ArrayList;

public class Zaino {

	private String marca;
	private String colore;
	private double volume;
	
	ArrayList<Oggetto> cose;

	public Zaino(String marca, String colore, double volume) {
		this.marca = marca;
		this.colore = colore;
		this.volume = volume;
		inizializzaCose();
	}

	private void inizializzaCose() {
		cose = new ArrayList();
		cose.add(new Oggetto("penna", "biro blu", 0.05));
		cose.add(new Oggetto("quaderno", "righe", 0.10));
		
	}
	
	public void elencaContenuto(){
		for (Oggetto oggetto : cose) {
			System.out.println(oggetto.getNome()  + " " 
					+ oggetto.getDescrizione()  
					+ " " 
					+ oggetto.getVolume() );
		}
	}
	
	public double infoVolume(){
		double vol = 0;
		for (Oggetto oggetto : cose) {
			vol += oggetto.getVolume();
		}
		return vol;
	}
	
	public Oggetto prendiCosa (int posizione){
		Oggetto o = cose.get(posizione);
		cose.remove(posizione);
		return o;
	}
	
	
	public boolean inserisciCosa(Oggetto o){
		
		if (   this.volume - ( this.infoVolume() + o.getVolume()     )  >= 0          ){
			cose.add(o);
			return true;
		}
		System.out.println("oggetto " + o.getNome() + " non inserito!");
		return false;
	}
	
	
	
	
	
	
	
	
}
