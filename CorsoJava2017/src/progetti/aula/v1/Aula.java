package progetti.aula.v1;

import java.util.Date;
import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		Studente studente1 = new Studente("ROBERTO","BALZANO",'M');
		Studente studente2 = new Studente("VITTORIO","BELLIA",'M');
		Studente studente3 = new Studente("SIMONE","BOMBACI",'M');
		Studente studente4 = new Studente("MONICA","CANAL MONTEAGUDO",'F');
		Studente studente5 = new Studente("SERGIO","MARZULLO",'M');
		Studente studente6 = new Studente("DARIO","MENNILLO",'M');
		Studente studente7 = new Studente("ANNA","MESSINA",'F');
		Studente studente8 = new Studente("AMEDEO","MINOZZI",'M');
		Studente studente9 = new Studente("ANTONIO","MORABITO",'M');
		Studente studente10 = new Studente("ANGELO","NICOSIA",'M');
		Studente studente11 = new Studente("EMILIO","PASSANNANTI",'M');
		Studente studente12 = new Studente("BARBARA","RUGGIRELLO",'F');
		Studente studente13 = new Studente("GABRIELE","SACCHET",'M');
		Studente studente14 = new Studente("ALESSANDRA","SORRENTINO",'F');
		Studente studente15 = new Studente("NICCOLO","TRISCIO",'M');
		Studente studente16 = new Studente("FERDINANDO","VASSALLO",'M');
		Studente studente17 = new Studente("ALESSANDRA","ZILIOLI",'F');
		
		
		Studente[] elenco = new Studente[17];
		elenco[0]=studente1;
		elenco[1]=studente2;
		elenco[2]=studente3;
		elenco[3]=studente4;
		elenco[4]=studente5;
		elenco[5]=studente6;
		elenco[6]=studente7;
		elenco[7]=studente8;
		elenco[8]=studente9;
		elenco[9]=studente10;
		elenco[10]=studente11;
		elenco[11]=studente12;
		elenco[12]=studente13;
		elenco[13]=studente14;
		elenco[14]=studente15;
		elenco[15]=studente16;
		elenco[16]=studente17;

		for (int i = 0; i < elenco.length; i++) {
			//if (i == 4 || i ==12)
			elenco[i].stampaSaluto();
			System.out.println("qual è la risposta corretta?");
			String tuaRisposta = sc.next();
		}
		
		
	}

}
