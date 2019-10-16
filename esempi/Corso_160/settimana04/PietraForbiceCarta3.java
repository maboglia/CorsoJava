package settimana04;

import java.util.ArrayList;
import java.util.Scanner;

/*spostare in una classe esterna*/
class Giocata {
	public String[] scelta = { "PIETRA", "FORBICI", "CARTA" };

	StringBuilder sb = new StringBuilder("");
	int sceltaUtente = 0;
	int sceltaComputer = 0;
	double percentuale = 0;

	/**variabili di classe / globali */
	static int vittorieUmano = 0;
	static int vittoriePC = 0;
	static int numeroGiocate = 0;

	private Scanner sc = new Scanner(System.in);
	
	public Giocata(  ){
		//proprieta della classe: static
		Giocata.numeroGiocate++;
		this.messaggioUtente();

		if (sc.hasNextInt()){
			this.sceltaUtente = sc.nextInt();
			System.out.println("##########siamo qui#######");
			if( this.sceltaUtente > 0 && this.sceltaUtente < 4 )
			{
				System.out.println("Partita giocata n. " + numeroGiocate);
				this.gioca();
				System.out.println(sb);
				sb.setLength(0);
				
			}
		}
		else 
		{
			this.messaggioUtente();
			this.sceltaUtente = sc.nextInt();
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

	/**
	 * @param sceltaUtente
	 * @param sceltaComputer
	 */
	private void messaggioUtente() {
		System.out.println("--------------------------------");

		System.out.println("1) " + scelta[0]);
		System.out.println("2) " + scelta[1]);
		System.out.println("3) " + scelta[2]);

		System.out.println("scegli premendo 1,2,3");
		System.out.println("--------------------------------");
	}
}


public class PietraForbiceCarta3 {

	//contenitore giocate
	static ArrayList<Giocata> report = new ArrayList<>();
	//guardia del ciclo: vuoi giocare o uscire?
	static boolean continua = true;
	
	static Scanner sc = new Scanner(System.in);
	


	public static void main(String[] args) {
		Giocata g;
		while (continua) {
			//chiedo all'utente cosa vuol fare
			stampa("Per giocare premi 1,2 o 3");
			stampa("altrimenti esci dal gioco");
			//se l'utente mette un numero sballato non posso giocare
			//richiesta utente

			String s = sc.next();
			
			if (s.equals("1")||s.equals("2")||s.equals("3"))
					{
				g = new Giocata();
				report.add(g);
				}
			else
			{
				stampa("Game Over");
				continua = false;
			}
			
			
//		//System.out.println(sb);
//		report.add(sb.toString());
//		sb.setLength(0);
//		System.out.println(report.get(0));
//		System.out.println(report.size());

		for (Giocata e : report) {
			System.out.println(e.sceltaUtente+" "+e.sceltaComputer);
		}
		
		for (Giocata e : report) {
			System.out.println(e.sb);
		}
		
		}

	} /* fine metodo main() */

	private static void stampa(String string) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------------");
		System.out.println(string);
		System.out.println("------------------------------------------");
	}


}
