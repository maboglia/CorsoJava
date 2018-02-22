
/**
 * 
 Risultato dell’esecuzione:
 Capitale maturato : 115762.5
 
 In questo esempio:
 Alcune variabili sono inizializzate nella dichiarazione
 Le variabili hanno tipo double (virgola mobile a precisione doppia) e
 le operazioni su tali variabili sono come tra
 
 letterali frazionari
 (divisione reale)
 Le variabili cambiano valore durante l’esecuzione
 Il nuovo valore di una variabile può essere calcolato a partire dal
 precedente (capitale=capitale+interesse)
 Il metodo print() visualizza un messaggio senza andare a capo
 */

public class Interessi {
public static void main ( String [] args ) {
double capitale =100000;
double tasso =0.05;
double interesse ;
// calcola l ’ interesse maturato dopo un anno
interesse = capitale * tasso ;
capitale = capitale + interesse ;
// calcola l ’ interesse maturato dopo due anni
interesse = capitale * tasso ;
capitale = capitale + interesse ;
// calcola l ’ interesse maturato dopo tre anni
interesse = capitale * tasso ;
capitale = capitale + interesse ;
// stampa il risultato
System . out . print ( " Capitale maturato : " );
System . out . println ( capitale );
}

}
