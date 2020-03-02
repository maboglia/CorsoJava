package main;

import java.util.Scanner;

public class ScannerLogin {


	/**
	 * Metodo main(), avvia il programma
	 * @param args - accetta un array di Stringhe in argomento
	 */
	public static void main(String[] args) {

		//con l'oggetto scanner si semplifica la gestione dell'input dati
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Scrivi un numero: ");
		
		int i = sc.nextInt();
		System.out.println("Hai scritto: " + i);
	
	
		//chiamo ilmetodo ausiliario
		login();
		//ScannerLogin.login(); //metodo di classe
	}

	/**
	 * metodo ausiliario statico
	 * @param args
	 */
	private static void login(String[] args) {
		
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
