package esempi.week8;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ErroreFormato2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un intero");
		int x;
		boolean ok;
		do {
			ok = false;
			try {
				x = input.nextInt();
				System.out.println(x);
			} catch (InputMismatchException e) {
				input.nextLine(); // annulla l’input ricevuto
									System.out.println("Hai terminato il programma");
									System.out.println(e.getMessage());
				ok = true;
			}
		} while (!ok);
	}
}
