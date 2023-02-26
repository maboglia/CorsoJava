/*
Indivina il numero da 1 a 100
 */

import java.util.Scanner;
public class HiLo {
public static void main( String [] args) {
// prepara uno scanner
Scanner scan = new Scanner( System .in);
// gioca ancora
String giocaAncora = "";
// inizio loop
do {
// genera un numero random tra 1 e 100
int ilNumeroDaIndovinare = (int)( Math .random()*100 + 1);
int sceltaGiocatore = 0;
// memorizza i tentativi
int numeroTentativi = 0;
while ( sceltaGiocatore != ilNumeroDaIndovinare ) {
System .out.println("Indovina il numero da 1 a 100:");
// risposta utente
sceltaGiocatore = scan.nextInt();
// aggiungi un tentativo
numeroTentativi = numeroTentativi + 1;
if (sceltaGiocatore < ilNumeroDaIndovinare)
System .out.println(sceltaGiocatore + " è troppo basso. Prova di nuovo.");
else if (sceltaGiocatore > ilNumeroDaIndovinare)
System .out.println(sceltaGiocatore + " è troppo alto. Prova di nuovo.");
else
System .out.println(sceltaGiocatore + " è giusto! Hai vinto!" );
}
// fine loop
System .out.println("Hai impiegato " + numeroTentativi
+ " tentativi! Ben fatto!");
// chiedi se vuolerigiocare
System .out.println("Vuoi giocare nuovamente (s/n)?");
giocaAncora = scan.next();
} while (giocaAncora.equalsIgnoreCase("s"));
// ringrazia utente
System .out.println("Grazie per aver giocato! Arrivederci.");
}
}
