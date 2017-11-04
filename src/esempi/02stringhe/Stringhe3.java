package esempi.week3;

public class Stringhe3 {

	public static void main(String[] args) {
		
		//dichiaro l'oggetto stringa e lo istanzio
		String s1 = "Questa è una stringa!";
		System.out.println(s1);
		System.out.println("La stringa è lunga: " + s1.length());
		String s1bis = s1;
		//dichiaro l'oggetto stringa e lo istanzio con l'operatore new
		//questa è una particolarità dell'oggetto String
		String s2 = new String("Anche questa è una stringa con pari dignità :) ");
		System.out.println(s2);
		System.out.println("La stringa è lunga: " + s2.length());

	    String s3 = "Aula: ";
	    String s4 = "1F";

	    String s5 = s3 + s4;
	    System.out.println(s5);	
	    
	    //la stringa ammette come parametro anche gli array di char
	    char[] caratteri = { 'c', 'i', 'a', 'o'  };
	    String s6 = new String(caratteri);
	    //String s7 = caratteri;
	    
	    char[] caratteri2 = s2.toCharArray();
	    for (int i = 0; i < caratteri2.length; i++) {
			System.out.println(caratteri2[i]);
		}
		
	    //esercizio 1 identifica il carattere spazio bianco nell'array precedente e con un'istruzione if non stampare la riga a video
	    for (int i = 0; i < caratteri2.length; i++) {
	    	if (caratteri2[i] != ' ')
			System.out.println(caratteri2[i]);
		}
		
		
	    
	    //esercizio due stampa l'array di caratteri in ordine inverso, in orizzontale e successivamente in verticale
	    for (int i = caratteri2.length-1; i >= 0; i--) {
			System.out.print(caratteri2[i]);
		}

	
	    for (int i = caratteri2.length-1; i >= 0; i--) {
	    	System.out.println(caratteri2[i]);
	    }
	    
	    
	
	}

}
