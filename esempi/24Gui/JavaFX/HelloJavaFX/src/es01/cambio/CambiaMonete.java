package es01.cambio;

public class CambiaMonete {
	public static int[] cambia(int eu) {//12346
//		qui eseguo le operazioni di cambio
		System.out.println("funziona");

		//array di interi da ritornare
		int[] ritorno = new int[9];		
				
		//variabili dei tagli da incrementare nei cicli while
		int p500=0;
		int p200=0;
		int p100=0;
		int p50=0;	
		int p20=0;		
		int p10=0;		
		int p5=0;		
		int p2=0;		
		int p1=0;		
		
		//logica: divido l'importo per il taglio, sottraggo il valore del taglio e incremento la var di supporto
		
		//considero le banconote da 500
		if (eu >= 500) {
			while(eu>=500) {
				eu -= 500;
				p500++;
			}
			//aggiungo il valore ricavato al mio array di ritorno, nella posizione del taglio considerato
			ritorno[0] = p500;
		}
		
		if (eu >= 200) {
			while(eu>=200) {
				eu -= 200;
				p200++;
			}
			ritorno[1] = p200;
		}
		
		
		if (eu >= 100) {
			while(eu>=100) {
				eu -= 100;
				p100++;
			}
			ritorno[2] = p100;
		}
		
		if (eu >= 50) {
			while(eu>=50) {
				eu -= 50;
				p50++;
			}
			ritorno[3] = p50;
		}
		
		if (eu >= 20) {
			while(eu>=20) {
				eu -= 20;
				p20++;
			}
			ritorno[4] = p20;
		}
		
		if (eu >= 10) {
			while(eu>=10) {
				eu -= 10;
				p10++;
			}
			ritorno[5] = p10;
		}
		
		if (eu >= 5) {
			while(eu>=5) {
				eu -= 5;
				p5++;
			}
			ritorno[6] = p5;
		}
		
				
		
		if (eu >= 2) {
			while(eu>=2) {
				eu -= 2;
				p2++;
			}
			ritorno[7] = p2;
		}
		
		
		
		
		if (eu >= 1) {
			while(eu>=1) {
				eu -= 1;
				p1++;
			}
			ritorno[8] = p1;
		}
		
		
		
		
		
		
		
		
		
		
		
		

		return ritorno;
	}
}
