package programmini;

import java.util.Scanner;

public class GuessNumber {

	public void gioca() {
		
		boolean trovato = false;
		int contatore = 0;
		
		int x = (int) ( Math.random() * 100  ) + 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("come ti chiami");
		String nome = input.nextLine();
		System.out.println("Benvenuto " + nome + " gioca con noi");
		
		while(!trovato) {
		contatore++;
		System.out.println("Inserisci un numero intero tra 1 e 100");
		
		int a = input.nextInt(); 
		
		if (x == a) {
			System.out.println("hai indovinato in " + contatore + " tentativi!");
			trovato = true;
		}
		else if (x < a) {
			System.out.println("troppo grande");
		}
		else {
			System.out.println("troppo piccolo");
		}
		
		}//fine ciclo while
	}

}
