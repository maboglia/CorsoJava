package settimana02;

import java.util.Scanner;

public class MiaMatematica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//dichiarazione e istanziazione
		MiaMatematica mia = new MiaMatematica();
		
		Scanner scanner = new Scanner(   System.in    );
		
		System.out.println("inserisci un numero intero: ");
		int valore1 = scanner.nextInt();
		
		System.out.println("inserisci un altro numero intero: ");
		int valore2 = scanner.nextInt();
	
		
		
		//chiamo l'operazione addizione
		double addizione = mia.addizione(valore1,valore2);		
		System.out.println(addizione);
		
		//chiamo l'operazione sottrazione
		double sottrazione = mia.sottrazione(valore1,valore2);		
		System.out.println(sottrazione);
		
		//chiamo l'operazione moltiplicazione
		double moltiplicazione = mia.moltiplicazione(valore1,valore2);		
		System.out.println(moltiplicazione);
		
		//chiamo l'operazione divisione
		double divisione = mia.divisione(valore1,valore2);		
		System.out.println(divisione);
		
	}

	
	
	
	private double divisione(int valore1, int valore2) {
		// TODO Auto-generated method stub
		//casting 
		double t =   (double)  valore1 /  valore2;
		return t;
	}

	
	
	
	
	private double moltiplicazione(int valore1, int valore2) {
		// TODO Auto-generated method stub
		double t = valore1 * valore2;
		return t;
	}

	
	
	
	private double sottrazione(int valore1, int valore2) {
		// TODO Auto-generated method stub
		double t = valore1 - valore2;
		return t;
	}

	
	
	private double addizione(int valore1, int valore2) {
		// TODO Auto-generated method stub
		double t = valore1 + valore2;
		return t;
	}




	
	
	

}
