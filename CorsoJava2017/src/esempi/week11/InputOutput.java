package esempi.week11;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		
		System.out.println("Inserisci un numero intero");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		System.out.println("Inserisci un numero intero");
		int num2 = scan.nextInt();		
		
		System.out.println(num1 + num2 );
		int somma = num1 + num2;
		System.out.println("La somma è " + somma );
				

	}

}
