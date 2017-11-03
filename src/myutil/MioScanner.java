package myutil;

import java.util.Scanner;

public class MioScanner {

	private static Scanner lettore = creaScanner();

	private final static String ERR_STRINGA_VUOTA = "Non hai inserito alcun carattere, non posso validare l'input";
	
	
	
	private static Scanner creaScanner() {
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.lineSeparator());
		return sc;
	}	
	/**
	 * leggiStringa serve per chiedere una informazione all'utente e ritornare la risposta dell'utente
	 * @param messaggio inserire il messaggio da inviare all'utente
	 * @return la String inserita dall'utente
	 */
	public static String leggiStringa (String messaggio){
		System.out.println(messaggio);
		return lettore.next();
	}
	                                                   
	public static String leggiStringaNonVuota(String messaggio){
		boolean finito = false;
		String lettura = null;
		
		do{
			lettura = leggiStringa(messaggio);
			lettura = lettura.trim();
			if (lettura.length()>0) 
				finito = true;
			else 
				System.out.println(ERR_STRINGA_VUOTA);
		}
		while(!finito);
		
		return lettura;
	} 
	
}
