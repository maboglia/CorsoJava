package principale;

import java.util.Scanner;

public class E02_Calcolatrice {

	


    //stato interno
    //ho dichiarato una variabile di tipo intero
    //con l'operatore = ho assegnato alla var il valore 10

    public static void main(String[] arguments) {


        Scanner mioScanner = new Scanner(System.in);

        System.out.println("Inserire due numeri interi ");

        int valore1 = mioScanner.nextInt();
        int valore2 = mioScanner.nextInt();

        int somma = somma(valore1, valore2);
        int sottrazione = sottrazione(valore1, valore2);
        int moltiplicazione = moltiplicazione(valore1, valore2);
        double divisione = divisione(valore1, valore2);


        System.out.println("---------------------------------");
        System.out.println("valori inseriti: ");
        System.out.print(valore1);
        System.out.print (" ");
        System.out.print(valore2);
        System.out.println("---------------------------------");
        System.out.println(somma);
        System.out.println("L'addizione  è = " + somma);
        System.out.println("---------------------------------");
        System.out.println("la  sottrazione è: ");
        System.out.println(sottrazione);
        System.out.println("---------------------------------");
        System.out.println("il prodotto è: ");
        System.out.println(moltiplicazione);
        System.out.println("---------------------------------");
        System.out.println("il quoziente è: ");
        System.out.println(divisione);
        System.out.println("---------------------------------");


    }

    private static double divisione(int valore1, int valore2) {

        return (double) valore1 / (double) valore2;

    }

    private static int moltiplicazione(int valore1, int valore2) {

        return valore1 * valore2;
    }

    private static int sottrazione(int valore1, int valore2) {

        int sottrazione = valore1 - valore2;
        return sottrazione;

    }

    //metodo
    private static int somma(int val1, int val2) {

       return val1 + val2;

    }

	
	
}
