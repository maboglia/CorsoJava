package giochini;

import java.util.Scanner;

public class CalcolaMediaVoti {

	public static void main(String[] args) {
		
		//chiedi all'utente quanti esami
		int nEsami = chiediQuantiEsami();
		//chiedi il voto di ciascun esame
		int[] esami = new int[nEsami];
		chiediVotiEsami(esami);
		double totale = 0;
		//stampa elenco voti e media aritmetica
		for (int i = 0; i < esami.length; i++) {
			System.out.println(esami[i]);
			totale += esami[i];
		}
		System.out.println("La media aritmetica dei voti");
		System.out.println(totale / nEsami);
		
	}

	private static void chiediVotiEsami(int[] esami) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < esami.length; i++) {
			System.out.println("Dammi il voto dell'esame " + i);
			esami[i] = sc.nextInt();
		}
		sc.close();
	}

	private static int chiediQuantiEsami() {
		System.out.println("Quanti esami vuoi contare?");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
	
	
	
	
	
	
}
