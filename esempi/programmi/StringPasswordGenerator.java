package w02.stringhe;

/* 
   Questo programma costruisce una parola di 8 lettere 
   casuali con le lettere dell'alfabeto.
*/

public class StringPasswordGenerator {
    public static void main(String[] a) {
    	String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    	String consonanti = "bcdfghlmnpqrstvz";
    	String vocali = "aeiou";
	int numeroLettereAlfabeto = alfabeto.length();
	String parola = "";
	for (int i = 0; i < 8; i++) {
	    // scelgo una delle lettere dell'alfabeto.

		//int j = (int)(Math.random()*numeroLettereAlfabeto);
	    //parola += alfabeto.charAt(j);
		int v = (int)(Math.random()*vocali.length());
		int c = (int)(Math.random()*consonanti.length());

		
	if(i%2==0) parola += vocali.charAt(v); else parola += consonanti.charAt(c);
	
	}
	
	
	System.out.println("La parola scelta e': " + parola);
    }
}
