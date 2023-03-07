package corsi;

import allievi.Allievi;

public class Corsi {

	private int contatore = 0;
	private String descrizione;
	private int durataCorso;
	private Allievi[] allievi;
	
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
	public Allievi[] getAllievi() {
		return allievi;
	}
	
	public void creazioneCorsi(int grandezza){
		allievi = new Allievi[grandezza];
	}
	
	public void inserisciAllievo(Allievi allievo){
		allievi[contatore] = allievo;
		contatore++;
	}
}
