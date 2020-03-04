package settimana04;

import java.util.Scanner;

public class PietraForbiceCarta {
	
	public static void main(String[] args) {
		
	String[] scelta = { "PIETRA" ,  "FORBICI"  ,  "CARTA"   };
	boolean continua = true;
	int vittorieUmano=0;
	int vittoriePC=0;
	int numeroGiocate=0;
	double percentuale=0;
	
	Scanner sc = new Scanner(System.in);
	
	while (continua) {
		
	
	System.out.println("--------------------------------");

	System.out.println("1) " + scelta[0]);
	System.out.println("2) " + scelta[1]);
	System.out.println("3) " + scelta[2]);
	
	System.out.println("scegli premendo 1,2,3");
	System.out.println("--------------------------------");

	int sceltaUtente = sc.nextInt();
	int sceltaComputer = (int) (Math.random() * 3) +1 ;
	String s = "";
	StringBuilder sb = new StringBuilder("");

	if (sceltaUtente == sceltaComputer ) {
		numeroGiocate++;
		s= "pareggio";
		
	}
	
	else{
		switch (sceltaUtente) {
		case 1:
			if (sceltaComputer == 2) {
				vittorieUmano++;
				s= "vince utente";
			}
			else {
				vittoriePC++;
				s= "vince computer";
				
			}
			
			sb.append("utente ha scelto " + scelta[sceltaUtente - 1] );
			sb.append("computer ha scelto " + scelta[sceltaComputer - 1] );

			numeroGiocate++; 

			break;
		case 2:
			if (sceltaComputer == 3){
				vittorieUmano++;
				s= "vince utente";
			}
			else {
				vittoriePC++;
				s= "vince computer";
				
			}

			sb.append("utente ha scelto " + scelta[sceltaUtente - 1] );
			sb.append("computer ha scelto " + scelta[sceltaComputer - 1] );
			numeroGiocate++; 

			break;
		case 3:
			if (sceltaComputer == 1) {
				vittorieUmano++;
				s= "vince utente";
			}
			else {
				vittoriePC++;
				s= "vince computer";
				
			}

			sb.append("utente ha scelto " + scelta[sceltaUtente - 1] );
			sb.append("computer ha scelto " + scelta[sceltaComputer - 1] );
			numeroGiocate++; 

			break;
	
		default:
			continua = false;
			s= "Game Over";
			break;
		}
	}

	/*
	if (sceltaUtente == sceltaComputer ) s= "pareggio";
	else if (sceltaUtente == 1 ){
		if (sceltaComputer == 2) s= "vince utente";
		else s= "vince computer";
	}
	else if (sceltaUtente == 2 ){
		if (sceltaComputer == 3) s= "vince utente";
		else s= "vince computer";
	}
	else if (sceltaUtente == 3 ){
		if (sceltaComputer == 1) s= "vince utente";
		else s= "vince computer";
	}
	 */
	percentuale = (double) (vittorieUmano * 100)  / numeroGiocate ;
	//percentuale *=  100;
	
	sb.append("\n" + "numero giocate " + numeroGiocate);
	sb.append("\n" + "vittorie umano " + vittorieUmano);
	sb.append("\n" + "vittorie pc " + vittoriePC);
	sb.append("\n" + "pareggi " + (numeroGiocate - (vittoriePC + vittorieUmano )  )  );
	sb.append("\n" + "perc successo umano " + percentuale  + "%"  );
	
	
	System.out.println(sb);
	System.out.println(s);
	
	//if (sceltaUtente <1 || sceltaUtente > 3 ) continua = false;
	
	}
	
	
	
	}

}
