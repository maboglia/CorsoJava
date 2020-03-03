package p001;
import java.util.Scanner;
public class TodoList {
	
	
	//dichiarazione
	 static Scanner mioScanner = new Scanner(System.in);
	
	 static String[] ingredienti = new String[3];
	
	/*
	 * ho creato il metodo ausiliario stampa(), per stampare informazioni in console
	 * */
	public static String inserisci(String s){
		System.out.println(s);
		String risposta = mioScanner.nextLine();

		return risposta;
	}
	
	
	public static void main(String[] args) {

			System.out.println(ingredienti.length);
		
//			String risposta1 = stampa("inserisci un ingrediente");
//			String risposta2 = stampa("inserisci un ingrediente");
//			String risposta3 = stampa("inserisci un ingrediente");
			
//			ingredienti[0] = stampa("inserisci un ingrediente");
//			ingredienti[1] = stampa("inserisci un ingrediente");
//			ingredienti[2] = stampa("inserisci un ingrediente");
			

			
			for (int i = 0; i < ingredienti.length; i++) {
				ingredienti[i] = inserisci("inserisci un ingrediente");
				
			}
			System.out.println(ingredienti);
			//elencoIngredienti();
	}


	private static void elencoIngredienti() {
		System.out.println("elenco dei prodotti");

		for (int i = 0; i < ingredienti.length; i++) {
			System.out.println(ingredienti[i]);
		}
		
	}

}
