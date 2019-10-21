package main;

import java.util.Scanner;

public class ScannerLogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci le credenziali");
		System.out.println();
		System.out.println("Digita il tuo nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digita il tuo cognome: ");
		String cognome = scanner.nextLine();
		
		if(nome.equals("mauro") && cognome.equals("bogliaccino")){
			System.out.println("Benvenuto mauro");
		}else{
			System.out.println("Login errata");
		}
		
	}

}
