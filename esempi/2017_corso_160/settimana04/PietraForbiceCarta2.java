package settimana04;

import java.util.ArrayList;
import java.util.Scanner;



public class PietraForbiceCarta2 {

	static String[] scelta = { "PIETRA", "FORBICI", "CARTA" };
	static boolean continua = true;
	static int vittorieUmano = 0;
	static int vittoriePC = 0;
	static int numeroGiocate = 0;
	static double percentuale = 0;
	static StringBuilder sb = new StringBuilder("");

	
	static ArrayList<String> report = new ArrayList<>();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (continua) {

			messaggioUtente();

			int sceltaUtente = sc.nextInt();
			int sceltaComputer = (int) (Math.random() * 3) + 1;

			if (sceltaUtente == sceltaComputer) {
				numeroGiocate++;
				sb.append("pareggio");
			} else if (sceltaUtente < 1 || sceltaUtente > 3) {
				continua = false;
				sb.append("Game Over");
			} else {
				valutazioneRisultato(sceltaUtente, sceltaComputer);
			}

		percentuale = (double) (vittorieUmano * 100) / numeroGiocate;

		sb.append("\n" + "numero giocate " + numeroGiocate);
		sb.append("\n" + "vittorie umano " + vittorieUmano);
		sb.append("\n" + "vittorie pc " + vittoriePC);
		sb.append("\n" + "pareggi " + (numeroGiocate - (vittoriePC + vittorieUmano)));
		sb.append("\n" + "perc successo umano " + percentuale + "%");

		//System.out.println(sb);
		report.add(sb.toString());
		sb.setLength(0);
		System.out.println(report.size());
		
		System.out.println(report.get(0));
		}

	} /* fine metodo main() */

	/**
	 * 
	 */
	private static void messaggioUtente() {
		System.out.println("--------------------------------");

		System.out.println("1) " + scelta[0]);
		System.out.println("2) " + scelta[1]);
		System.out.println("3) " + scelta[2]);

		System.out.println("scegli premendo 1,2,3");
		System.out.println("--------------------------------");
	}

	/**
	 * @param sceltaUtente
	 * @param sceltaComputer
	 */
	private static void valutazioneRisultato(int sceltaUtente, int sceltaComputer) {

		numeroGiocate++;

		if (sceltaUtente == 1) {
			if (sceltaComputer == 2) {
				vittorieUmano++;
				sb.append("vince utente");
			} else {
				vittoriePC++;
				sb.append("vince computer");
			}
		}

		if (sceltaUtente == 2) {
			if (sceltaComputer == 3) {
				vittorieUmano++;
				sb.append("vince utente");
			} else {
				vittoriePC++;
				sb.append("vince computer");
			}
		}

		if (sceltaUtente == 3) {
			if (sceltaComputer == 1) {
				vittorieUmano++;
				sb.append("vince utente");
			} else {
				vittoriePC++;
				sb.append("vince computer");
			}
		}

	}
}
