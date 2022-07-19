package esempi.week3;

import java.util.Scanner;

public class EsempiFor {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		System.out.println("Quanti numeri vuoi sommare?");
		
		int numeri=input.nextInt();
		int somma =0; // variabile da usare come accumulatore
		
		//per i che va da 0 a numeri (escluso)
		for (int i=0; i<numeri; i++) { 
			System.out.println("Inserisci il prossimo numero");
			int n=input.nextInt();
			somma += n; //aggiorna l’accumulatore
			System.out.println("fino a qui la somma è: " + somma);
		}
			System.out.println("la somma è " + somma); 
			System.out.println( "la media è "+ (somma / numeri) ); 
			}
		}




