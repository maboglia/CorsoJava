# Wordle in Java

Assumiamo che tu stia cercando un gioco simile a Wordle, dove il giocatore deve indovinare una parola segreta in un numero limitato di tentativi, ricevendo feedback sulla correttezza delle lettere inserite.

Ecco un esempio di implementazione di un gioco "Wordle" semplificato in Java:

```java
import java.util.Scanner;

public class Wordle {
    private static final String PAROLA_SEGRETA = "JAVA";
    private static final int MAX_TENTATIVI = 6;

    public static void main(String[] args) {
        StringBuilder parolaCorrente = new StringBuilder("____"); // Inizializziamo con una parola di lunghezza fissa

        int tentativiRimasti = MAX_TENTATIVI;

        Scanner scanner = new Scanner(System.in);

        while (tentativiRimasti > 0 && !parolaCorrente.toString().equals(PAROLA_SEGRETA)) {
            System.out.println("Parola attuale: " + parolaCorrente);
            System.out.println("Tentativi rimasti: " + tentativiRimasti);
            System.out.print("Inserisci una parola: ");

            String tentativo = scanner.next().toUpperCase();

            if (tentativo.length() == PAROLA_SEGRETA.length()) {
                if (tentativo.equals(PAROLA_SEGRETA)) {
                    parolaCorrente = new StringBuilder(PAROLA_SEGRETA);
                } else {
                    System.out.println("Parola errata. Hai perso un tentativo!");
                    tentativiRimasti--;
                }
            } else {
                System.out.println("La lunghezza del tuo tentativo non è corretta.");
            }
        }

        scanner.close();

        if (parolaCorrente.toString().equals(PAROLA_SEGRETA)) {
            System.out.println("Complimenti! Hai indovinato la parola: " + PAROLA_SEGRETA);
        } else {
            System.out.println("Mi dispiace, hai esaurito i tentativi. La parola era: " + PAROLA_SEGRETA);
        }
    }
}
```

In questo gioco, il giocatore deve indovinare la parola segreta "JAVA" inserendo parole di lunghezza corretta. Il gioco fornisce feedback sulla correttezza del tentativo e mostra il numero di tentativi rimasti. Il giocatore vince se indovina la parola o perde se esaurisce i tentativi disponibili.
