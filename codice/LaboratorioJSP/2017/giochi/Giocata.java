package giochi;

import java.util.Scanner;
/*spostare in una classe esterna*/


public class Giocata {
	public String[] scelta = { "PIETRA", "FORBICI", "CARTA" };

	StringBuilder sb = new StringBuilder("");
	int sceltaUtente = 0;
	int sceltaComputer = 0;
	double percentuale = 0;

	/**variabili di classe / globali */
	static int vittorieUmano = 0;
	static int vittoriePC = 0;
	static int numeroGiocate = 0;

//	private Scanner sc = new Scanner(System.in);

	public void setSceltaUtente(int sceltaUtente) {
		this.sceltaUtente = sceltaUtente;
	}
	
	
	
	
	public Giocata(int sceltaUtente){
		//proprieta della classe: static
		Giocata.numeroGiocate++;
		//this.messaggioUtente();
		this.sceltaUtente = sceltaUtente;
		
			
			if( this.sceltaUtente > 0 && this.sceltaUtente < 4 )
			{

				this.gioca();

				System.out.println(sb);
				//sb.setLength(0);
				
			}

		else 
		{
			//l'utente ha sbagliato a schiacciare...

		}
	}

	/**
	 * 
	 */
	private void gioca() {

		//risposta computer
		this.sceltaComputer = (int) (Math.random() * 3) + 1;
		
		if(this.sceltaUtente != this.sceltaComputer)
		{
			//valuta scelta
			this.valutazioneRisultato();
		}
		else
			sb.append("pareggio");
	}

	
	
	/**
	 * @param sceltaUtente
	 * @param sceltaComputer
	 */
	private void valutazioneRisultato() {
		if (sceltaUtente == 1) {
			if (sceltaComputer == 2) {
				vittorieUmano++;
				sb.append("vince utente");
			} else {
				vittoriePC++;
				sb.append("vince computer");
			}
		}

		else if (sceltaUtente == 2) {
			if (sceltaComputer == 3) {
				vittorieUmano++;
				sb.append("vince utente");
			} else {
				vittoriePC++;
				sb.append("vince computer");
			}
		}

		else if (sceltaUtente == 3) {
			if (sceltaComputer == 1) {
				vittorieUmano++;
				sb.append("vince utente");
			} else {
				vittoriePC++;
				sb.append("vince computer");
			}
		}

		percentuale = (double) (vittorieUmano * 100) / numeroGiocate;

		sb.append("\n" + "numero giocate " + numeroGiocate);
		sb.append("\n" + "vittorie umano " + vittorieUmano);
		sb.append("\n" + "vittorie pc " + vittoriePC);
		sb.append("\n" + "pareggi " + (numeroGiocate - (vittoriePC + vittorieUmano)));
		sb.append("\n" + "perc successo umano " + percentuale + "%");

		
		
		
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
//	return this.sceltaUtente + "  " + this.sceltaComputer;
	return this.sb.toString();
}

}