# Esercizi Java eccezioni

## Esercizio 1

Scrivere un programma che gestisca un'eccezione di tipo ArithmeticException.

Ecco un esempio di programma che gestisce un'eccezione di tipo `ArithmeticException`:

```java
public class Main {
    public static void main(String[] args) {
        try {
            int risultato = divisione(10, 0);
            System.out.println("Il risultato della divisione è: " + risultato);
        } catch (ArithmeticException e) {
            System.out.println("Errore: Divisione per zero.");
        }
    }

    // Metodo per eseguire una divisione
    public static int divisione(int dividendo, int divisore) {
        return dividendo / divisore;
    }
}
```

In questo programma, il metodo `divisione()` tenta di eseguire una divisione tra due numeri interi. Se il divisore è zero, viene generata un'eccezione di tipo `ArithmeticException`. Nel metodo `main()`, viene effettuata una chiamata al metodo `divisione()` all'interno di un blocco `try-catch`. Se si verifica un'eccezione di tipo `ArithmeticException`, il blocco `catch` viene eseguito e viene stampato un messaggio di errore appropriato.

---

## Esercizio 2

Scrivere un programma che lanci manualmente un'eccezione.

Ecco un esempio di programma che lancia manualmente un'eccezione:

```java
public class Main {
    public static void main(String[] args) {
        try {
            lanciaEccezione();
        } catch (Exception e) {
            System.out.println("Eccezione catturata: " + e.getMessage());
        }
    }

    // Metodo che lancia manualmente un'eccezione
    public static void lanciaEccezione() throws Exception {
        // Simuliamo una situazione in cui è necessario lanciare un'eccezione
        throw new Exception("Questa è un'eccezione lanciata manualmente.");
    }
}
```

In questo programma, il metodo `lanciaEccezione()` lancia manualmente un'eccezione di tipo `Exception` con un messaggio specifico. Nel metodo `main()`, chiamiamo il metodo `lanciaEccezione()` all'interno di un blocco `try-catch`. Quando viene lanciata un'eccezione, il blocco `catch` viene eseguito e viene stampato il messaggio dell'eccezione catturata.

---

## Esercizio 3

Scrivere un programma che gestisca una eccezione personalizzata.

Ecco un esempio di programma che gestisce un'eccezione personalizzata:

```java
// Definizione di un'eccezione personalizzata
class MioEccezione extends Exception {
    // Costruttore che accetta un messaggio
    public MioEccezione(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Chiamata di un metodo che potrebbe lanciare l'eccezione personalizzata
            metodoCheLanciaEccezione();
        } catch (MioEccezione e) {
            // Gestione dell'eccezione personalizzata
            System.out.println("Eccezione catturata: " + e.getMessage());
        }
    }

    // Metodo che potrebbe lanciare un'eccezione personalizzata
    public static void metodoCheLanciaEccezione() throws MioEccezione {
        // Simuliamo una situazione che richiede il lancio dell'eccezione personalizzata
        boolean situazione = true;
        if (situazione) {
            throw new MioEccezione("Questo è un messaggio personalizzato per l'eccezione MioEccezione.");
        }
    }
}
```

In questo programma, abbiamo definito una classe `MioEccezione` che estende `Exception` per creare un'eccezione personalizzata. Questa classe ha un costruttore che accetta un messaggio.

Nel metodo `metodoCheLanciaEccezione()`, simuliamo una situazione in cui potrebbe essere necessario lanciare l'eccezione personalizzata. Se la condizione è soddisfatta, viene lanciata un'istanza di `MioEccezione` con un messaggio specifico.

Nel metodo `main()`, chiamiamo `metodoCheLanciaEccezione()` all'interno di un blocco `try-catch`. Se viene lanciata un'eccezione di tipo `MioEccezione`, il blocco `catch` cattura l'eccezione e stampa il suo messaggio personalizzato.

