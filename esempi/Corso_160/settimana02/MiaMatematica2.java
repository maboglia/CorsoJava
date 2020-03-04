package settimana02;

import java.util.Scanner;

public class MiaMatematica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//dichiarazione e istanziazione
		MiaMatematica2 mia = new MiaMatematica2();
		
		Scanner scanner = new Scanner(   System.in    );
		
		boolean esci = false;
		
		
		while(!esci){
			System.out.println("----------------NUovo Calcolo---------------------");
			System.out.println("inserisci un numero intero: ");
			int valore1 = scanner.nextInt();
			
			System.out.println("inserisci un altro numero intero: ");
			int valore2 = scanner.nextInt();
			
			System.out.println("Che operazione vuoi fare?");
			System.out.println(" (Q per uscire) ");
			String operazione = scanner.next();
			
			if (operazione.equals("Q")) esci = true;
			if(operazione.equals("*")) operazione = "moltiplicazione";
			if(operazione.equals("/")) operazione = "divisione";
			if(operazione.equals("-")) operazione = "sottrazione";
			if(operazione.equals("+")) operazione = "addizione";
			
			//chiamo l'operazione 
			double risultato = mia.calcola(valore1,valore2, operazione);		
			System.out.println(risultato);
			
		}
		
		
		
		
		
	}

	
	
	
	private double calcola(int valore1, int valore2, String operazione) {
		// TODO Auto-generated method stub
		//casting 
		double t=0.0;
		
		if(  operazione.equals("addizione")   )  {
			t =  valore1 +  valore2;
		}
		if(  operazione.equals("sottrazione")   )  {
			t =  valore1 -  valore2;
		}
		if(  operazione.equals("moltiplicazione")   )  {
			t =  valore1 *  valore2;
		}
		if(  operazione.equals("divisione")   )  {
			t =  (double)   valore1 /  valore2;
		}
		
		return t;
	}

	
	
	

}
