package records;

import java.util.Arrays;
import java.util.List;

/**
 * Esempio di utilizzo dei record in Java
 * Un record è una classe speciale, immutabile e compatta,
 * utile per rappresentare dati senza dover scrivere troppo codice.
 */

// Record Studente: contiene nome, matricola e indirizzi
record Studente(String nome, int matricola, List<Indirizzo> indirizzi) {
    static int numeroStudenti; // esempio di variabile statica
}

// Record Indirizzo: contiene via e città
record Indirizzo(String via, String citta) {
}

public class RecordsExample {

    public static void main(String[] args) {
        // Creo due indirizzi
        Indirizzo indirizzo1 = new Indirizzo("Via Roma 10", "Torino");
        Indirizzo indirizzo2 = new Indirizzo("Corso Italia 25", "Milano");

        // Creo uno studente con due indirizzi associati
        Studente studente1 = new Studente("Marco Rossi", 12345, Arrays.asList(indirizzo1, indirizzo2));

        // Stampo alcune informazioni
        System.out.println("Nome studente: " + studente1.nome());
        System.out.println("Matricola: " + studente1.matricola());
        System.out.println("Indirizzi associati:");

        // Scorro la lista di indirizzi
        for (Indirizzo i : studente1.indirizzi()) {
            System.out.println(" - " + i.via() + ", " + i.citta());
        }

        // Accesso diretto a un campo di un record annidato
        System.out.println("La città del primo indirizzo è: " + studente1.indirizzi().get(0).citta());
    }
}
