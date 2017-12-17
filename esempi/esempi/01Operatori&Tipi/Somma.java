import java.util.Scanner; // richiama la classe Scanner

/**
 * 
 L’oggetto input deve essere predisposto (creato) prima di iniziare a chiedere i valori all’utente
 
 
 Scanner input = new Scanner ( System.in );
 
 La lettura vera e propria dei valori in input si fa tramite metodi diversi a
 seconda del tipo dei valori attesi
 
 x = input.nextInt (); // legge un numero intero
 y = input.nextDouble (); // legge un numero frazionario
 */
 

public class Somma {
    public static void main(String[] args) {
        // predispone il programma per la lettura dell ’ input
        Scanner input = new Scanner(System.in);
        System.out.println(" Inserisci due numeri interi : ");
        int n1, n2;
        // attende l ’ inserimento di due numeri e li assegna
        n1 = input.nextInt();
        n2 = input.nextInt();
        // calcola e stampa la somma
        System.out.print(" Somma : ");
        System.out.println(n1 + n2);
    }
}
