package w02.stringhe;

/* 
   Questo programma analizza l'utilizzo di alcune funzioni 
   definite per le stringhe.
*/

public class TestStringhe {

    public static void main(String[] a) {

	String messaggio; // la stringa che conterra' il messaggio.

	// scrivo un messaggio (il codice Unicode \u00e8 corrisponde
	// alla lettera "e con accento grave").
	messaggio = "questo \u00e8 il messaggio da analizzare";

	int lunghezzaMessaggio = messaggio.length();

	char primaLettera = messaggio.charAt(0);

	char ultimaLettera = messaggio.charAt(lunghezzaMessaggio - 1);

	String prime5Lettere = messaggio.substring(0,5);

	System.out.println();
	System.out.println("Il messaggio considerato e': \n" 
			   + messaggio);
	System.out.println();
	System.out.println("esso e' composto da " + lunghezzaMessaggio
			   + " caratteri");
	System.out.println("Il primo carattere e': \"" + primaLettera
			   + "\", l'ultimo carattere e': \"" 
			   + ultimaLettera + "\"");

	System.out.println("La sottostringa dei primi 5 caratteri e': \""
			   + prime5Lettere + "\".");

	System.out.println();
	System.out.println("Il messaggio puo' essere convertito " 
			   + "tutto in lettere maiuscole: ");

	String messaggioMaiuscolo;  // si noti che una nuova variabile 
	                            // puo' essere dichiarata in un qq
	                            // punto del programma.

	messaggioMaiuscolo = messaggio.toUpperCase();

	System.out.println(messaggioMaiuscolo);


    }

} // fine classe TestStringhe
