package progetti.archivioCD;

import java.util.Scanner;

public class MioScanner {

	private static Scanner lettore = creaScanner();

	
	private final static String ERRORE_FORMATO      =  "Il dato inserito non è corretto" ;
	private final static String ERRORE_MINIMO     =  "E' richiesto un valore minimo: " ;
	private final static String ERRORE_STRINGA_VUOTA = "Non hai inserito alcun carattere!";
	private final static String ERRORE_MASSIMO  =  "E' richiesto un valore massimo: " ;
	private final static String MESSAGGIO_CARATTERI_SCORRETTI  =  "Il carattere inserito non è corretto, devi inserire: " ;
	private final static char RISPOSTA_SI = 'S' ;
	private final static char RISPOSTA_NO = 'N' ;
	
	
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
				System.out.println(ERRORE_STRINGA_VUOTA);
		}
		while(!finito);
		
		return lettura;
	} 
	
	public static char leggiChar (String messaggio){
		boolean finito = false;
		char carattereLetto = '\0';
		
		do{
			
			System.out.println(messaggio);
			String lettura = lettore.next();
			
			if (lettura.length()>0) {
				carattereLetto = lettura.charAt(0);
				finito = true;
			}
				else 
				System.out.println(ERRORE_STRINGA_VUOTA);
		}
		while(!finito);
		
		return carattereLetto;		
		
	}
	
	public static boolean SiNo(String messaggio){
		String mioMessaggio = messaggio + "(" +  RISPOSTA_SI + " o "+ RISPOSTA_NO   +  ")";
		char carattereLetto = leggiUpperChar( mioMessaggio, String.valueOf(RISPOSTA_SI) + String.valueOf(RISPOSTA_NO)  );
		
		if (carattereLetto == RISPOSTA_SI){
			return true;
		}
		else
			return false;
		
	}
	private static char leggiUpperChar(String mioMessaggio, String string) {
		
		boolean finito = false;
		char carattereLetto = '\0';
		
		do{
			
			carattereLetto = leggiChar(mioMessaggio);
			carattereLetto = Character.toUpperCase(carattereLetto);
			
			if(string.indexOf(carattereLetto) != -1)
				finito = true;

				else 
				System.out.println(MESSAGGIO_CARATTERI_SCORRETTI + string);
		}
		while(!finito);
		
		return carattereLetto;	
	}
	
}
