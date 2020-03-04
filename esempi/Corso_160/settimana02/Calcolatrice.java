package settimana02;

import java.util.Scanner;

public class Calcolatrice {

		static Scanner scanner = new Scanner(   System.in    );
		


	public static void main(String[] args) {
		
		
		boolean esci = false;
		
		//ciclo di cui non conosco a priori il numero di ripetizioni
		while(!esci){
			
			String azione = interrogaUtente("Cosa vuoi fare? \n1) calcola \n2) esci");
			
			System.out.println(azione);
			
			if (azione.equals("1")) {
				lanciaCalcolatrice();
			}
			
			if (azione.equals("2")) {
				//qui uscire dal programma
				esci = true;
			}

		}
		
	}

	private static void lanciaCalcolatrice() {
		//dichiarazione e istanziazione
		MiaMatematica3 mia = new MiaMatematica3();
		
		System.out.println("inserisci un numero intero: ");
		int valore1 = scanner.nextInt();		
		System.out.println("inserisci un altro numero intero: ");
		int valore2 = scanner.nextInt();	
		System.out.println("Che operazione vuoi fare?");
		String operazione = scanner.next();
		if(operazione.equals("*")) operazione = "moltiplicazione";
		if(operazione.equals("/")) operazione = "divisione";
		if(operazione.equals("-")) operazione = "sottrazione";
		if(operazione.equals("+")) operazione = "addizione";	
		//chiamo l'operazione 
		double risultato = mia.calcola(valore1,valore2, operazione);		
		System.out.println(risultato);		
	}

	private static String interrogaUtente(String string) {
		
		//dichiaro una stringa s da ritornare
		String s;
		
		//con un ciclo for circondo la domanda con una cornicetta di #
		for(int i = 0; i < string.length(); i++){
			System.out.print("#");
		}
		System.out.println();
		
		System.out.println("# " + string +" #");


		for(int i = 0; i < string.length(); i++){
			System.out.print("#");
		}		
		
		s = scanner.next();
		
		
		return s;
	}


}
