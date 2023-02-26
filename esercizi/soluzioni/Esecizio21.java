package settimana02;

import java.util.Scanner;

public class Esecizio21 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		boolean tuttiPositivi = true;
		boolean tuttiPari = true;
		
		
		System.out.println("quanti numeri vuoi controllare?");
		int numeroElementi = sc.nextInt();
		
		for (int i = 0; i < numeroElementi; i++) {
			
			System.out.println("Inserisci il " + (i + 1) + " numero");
			int temp = sc.nextInt();
			
			if (temp < 0) tuttiPositivi = false; 
			if (temp % 2  != 0 ) tuttiPari = false; 
			
			
		}
		

		if (tuttiPositivi && tuttiPari) System.out.println("Sono tutti positivi e pari");
		else System.out.println("NON sono tutti positivi e pari");
		

	}

}
