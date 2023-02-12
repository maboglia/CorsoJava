/*
  Questo programma sceglie una carta da gioco a caso e stampa la 
  carta scelta.
*/
public class ScegliCarta {

    public static void main(String[] arg) {
	// scelgo il valore di una carta:
	int val = scegliValoreCarta();

	// scelgo il seme della carta:
	int sm = scegliSemeCarta();

	// stampo la carta scelta
	stampaCarta(val, sm);
    }

    // questo metodo sceglie il valore di una carta da gioco
    // (un intero tra 1 e 13)

    public static int scegliValoreCarta() {
	int valore = (int)(Math.random()*12 + 1);
	return valore;
    }

    // questo metodo sceglie il seme di una carta da gioco
    // (un intero tra 0 e 3, con la convenzione che
    // 0 = cuori, 1 = quadri, 2 = fiori, 3 = picche)

    public static int scegliSemeCarta() {
	int sm = (int)(Math.random()*4);
	return sm;
    }

    // questo metodo si occupa di stampare una carta di un 
    // mazzo. In input deve ricevere il valore della carta
    // e il seme.

    public static void stampaCarta(int valore, int seme) {
	System.out.println();
	System.out.println("\t **********");
	System.out.println("\t*          *");
	if (valore == 1) 
	    System.out.println("\t*   asso   *");
	else if (valore == 11)
	    System.out.println("\t*   fante  *");
	else if (valore == 12) 
	    System.out.println("\t*  regina  *");
	else if (valore == 13) 
	    System.out.println("\t*    re    *");
	else if (valore == 10)
	    System.out.println("\t*    10    *");
	else 
	    System.out.println("\t*    " + valore + "     *");
	System.out.println("\t*          *");
	System.out.println("\t*    di    *");
	System.out.println("\t*          *");
	System.out.println("\t*          *");
	if (seme == 0)
	    System.out.println("\t*  cuori   *");
	else if (seme == 1)
	    System.out.println("\t*  quadri  *");
	else if (seme == 2) 
	    System.out.println("\t*  fiori   *");
	else 
	    System.out.println("\t*  picche  *");
	System.out.println("\t*          *");
 	System.out.println("\t ********** ");
	System.out.println();


    }

}



