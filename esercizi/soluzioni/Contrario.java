/*Esercizio 3.1: 
 * Scrivere un programma Contrario che chiede all’utente di inserire una stringa e la
stampa al contrario. 
Per esempio, se si immette la stringa "Viva Java", il programma stampa "avaJ aviV"*/



import java.util.Scanner;

public class Contrario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();

		for (int i = s.length()-1; i >=0; i--) {
			System.out.println(s.charAt(i));
		}
		
	}

}
