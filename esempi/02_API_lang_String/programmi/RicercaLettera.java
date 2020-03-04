package w02.stringhe;

/*
  Questo programma scrive una parola a caso di 10 lettere
  e poi cerca se la parola contiene un certo carattere
  prefissato.
*/

public class RicercaLettera {
    public static void main(String[] a) {
	String alfabeto = "abcdefghijklmnopqrstuvwxyz";
	int numeroLettereAlfabeto = alfabeto.length();
	String parola = "";
	for (int i = 0; i < 10; i++) {
	    // scelgo una delle lettere dell'alfabeto.
	    int j = (int)(Math.random()*numeroLettereAlfabeto);
	    parola += alfabeto.charAt(j);
	}
	char ch = 'd';  // il carattere da ricercare nella parola.
	int posizione = 0; // posizione in cui si trova il carattere ch.

	boolean carattereTrovato = false;
	while (!carattereTrovato && posizione < parola.length()) {
	    if (ch == parola.charAt(posizione)) {
		carattereTrovato = true;
	    }
	    posizione++;
	}
	if (carattereTrovato) {
	    System.out.print("Il carattere: \"" + ch +"\" " + "si trova");
	    System.out.print(" nella parola \"" + parola + "\" in posizione: ");
	    System.out.println(posizione);
	}
	else {
	    System.out.print("Nella parola \"" + parola + "\" non c'e' ");
	    System.out.println("il carattere + \"" + ch + "\"");
	}

    }

}
