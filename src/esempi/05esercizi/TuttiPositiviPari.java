package esempi.week3;

import java.util.Scanner;


public class TuttiPositiviPari {

	public static void main(String[] args) {
		/*
		 * Esercizio 2.1: 

TuttiPositiviPari 

chiedendo quanti numeri voglia inserire) e
*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quanti numeri vuoi inserire?");
		int numeri = sc.nextInt();
		/*
chiede all’utente di inserire una sequenza di interi 
   */
		boolean positiviPari = true;
		for (int i = 0; i < numeri; i++) {
			System.out.println("inserisci il prossimo numero intero");
			int n = sc.nextInt();
			
			if (n<0 || n%2!=0) positiviPari = false;
		}
		if(positiviPari) 
			System.out.println("tutti positivi e pari");
		else
			System.out.println("NON SONO tutti positivi e pari");
		
		/*
  al termine dell’inserimento dell’intera sequenza, 
  stampa  messaggio
  	"Tutti positivi e pari" se i numeri inseriti sono tutti positivi e pari,
	altrimenti stampa "Non sono tutti positivi e pari". 
	
Risolvere questo esercizio senza usare array.
		 * 
		 * */
		
		
		

	}

}
