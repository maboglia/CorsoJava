package esempi.week2;

import java.util.Scanner;

public class SimpleCalcolatrice {

	public static void main(String[] args) {
		
		//numeroUno vale .....
		double numeroUno = getInput("Inserisci il primo numero");//dopo l'istruzione
		
		/*
		 * commenti su più linee
		 * */
		double numeroDue = getInput("Inserisci il secondo numero");
		
		double somma = numeroUno + numeroDue;
		
		System.out.println("La somma di " + numeroUno +" e " + numeroDue + " è " + somma );

	}
	
	/**
	 * Mio metodo per catturare l'input dell'utente
	 * @param domanda String contenente la domanda da inoltrare all'utente
	 * @return un double che rappresenta l'input utente
	 */
	private static double getInput(String domanda) {
		
		Scanner input = new Scanner(System.in);
		
		int i = domanda.length();
		System.out.println();
		System.out.println(domanda);

		System.out.println();
		
		for (int j = 0; j < i; j++) {
			System.out.print(j);
		}
		
		System.out.println();

		
		/*
		String  miaStringa= input.next();
		double mioDouble = Double.parseDouble(miaStringa);
		*/
		double mioDouble = input.nextDouble();
		return mioDouble;
		
	}


	
	
}
