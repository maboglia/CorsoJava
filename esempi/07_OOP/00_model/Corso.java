package model;

import model.Allievo;

public class Corso {

	private int contatore = 0;
	private String descrizione;
	private int durataCorso;
	private Allievo[] allievi;
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getDurataCorso() {
		return durataCorso;
	}
	public void setDurataCorso(int durataCorso) {
		this.durataCorso = durataCorso;
	}
	public int getContatore() {
		return contatore;
	}
	public Allievo[] getAllievi() {
		return allievi;
	}
	
	public void creazioneCorsi(int grandezza){
		Allievo = new Allievo[grandezza];
	}
	
	public void inserisciAllievo(Allievo allievo){
		Allievo[contatore] = allievo;
		contatore++;
	}
}
