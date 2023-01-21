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
