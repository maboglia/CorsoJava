# Impiccato in Java

Creiamo un gioco dell'impiccato in Java. In questo gioco, un giocatore deve indovinare una parola segreta, lettera per lettera. Ogni volta che il giocatore inserisce una lettera errata, una parte del corpo di una figura viene disegnata. Se la figura è completata prima che la parola sia indovinata, il giocatore perde.

Ecco un esempio di come potrebbe apparire il codice per il gioco dell'impiccato:

```java
import java.util.Scanner;

public class Impiccato {
    private static final String[] PAROLE = {"JAVA", "PROGRAMMAZIONE", "SVILUPPATORE", "COMPUTER", "GITHUB"};
    private static final int MAX_TENTATIVI = 6;

    public static void main(String[] args) {
        String parolaSegreta = scegliParolaSegreta();
        StringBuilder parolaCorrente = inizializzaParolaCorrente(parolaSegreta.length());

        int tentativiRimasti = MAX_TENTATIVI;

        Scanner scanner = new Scanner(System.in);

        while (tentativiRimasti > 0 && parolaCorrente.indexOf("_") != -1) {
            System.out.println("Parola attuale: " + parolaCorrente);
            System.out.println("Tentativi rimasti: " + tentativiRimasti);
            System.out.print("Inserisci una lettera: ");

            char lettera = scanner.next().toUpperCase().charAt(0);

            if (!indovinaLettera(parolaSegreta, parolaCorrente, lettera)) {
                tentativiRimasti--;
            }
        }

        scanner.close();

        if (parolaCorrente.indexOf("_") == -1) {
            System.out.println("Complimenti! Hai indovinato la parola: " + parolaSegreta);
        } else {
            System.out.println("Mi dispiace, hai esaurito i tentativi. La parola era: " + parolaSegreta);
        }
    }

    private static String scegliParolaSegreta() {
        int indice = (int) (Math.random() * PAROLE.length);
        return PAROLE[indice];
    }

    private static StringBuilder inizializzaParolaCorrente(int lunghezza) {
        StringBuilder parolaCorrente = new StringBuilder();

        for (int i = 0; i < lunghezza; i++) {
            parolaCorrente.append("_");
        }

        return parolaCorrente;
    }

    private static boolean indovinaLettera(String parolaSegreta, StringBuilder parolaCorrente, char lettera) {
        boolean indovinato = false;

        for (int i = 0; i < parolaSegreta.length(); i++) {
            if (parolaSegreta.charAt(i) == lettera) {
                parolaCorrente.setCharAt(i, lettera);
                indovinato = true;
            }
        }

        if (!indovinato) {
            System.out.println("Lettera errata. Hai perso una vita!");
        }

        return indovinato;
    }
}
```

In questo esempio, il gioco sceglie una parola segreta casualmente dalla lista predefinita e consente al giocatore di inserire lettere per indovinare la parola. Ogni volta che il giocatore inserisce una lettera errata, viene sottratta una vita (max 6 vite). Se il giocatore riesce a indovinare la parola prima di esaurire le vite, vince il gioco.
