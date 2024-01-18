Ecco un esempio di come utilizzare la classe `NumberFormat` per formattare un numero in valuta:

```java
import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumberExample {
    public static void main(String[] args) {
        // Numero da formattare
        double amount = 12345.6789;

        // Creazione di un oggetto NumberFormat per la valuta
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);

        // Formattazione del numero in valuta
        String formattedCurrency = currencyFormatter.format(amount);

        // Stampare il risultato formattato
        System.out.println("Importo formattato in valuta: " + formattedCurrency);
    }
}
```

In questo esempio, si crea un oggetto `NumberFormat` utilizzando il metodo statico `getCurrencyInstance()`, specificando la lingua e la nazione (Locale.US nel caso specifico). Quindi, si utilizza il metodo `format` per formattare il numero in valuta secondo le impostazioni regionali specificate. Infine, il risultato formattato viene stampato a console.

Ricorda che le impostazioni regionali influenzeranno il formato della valuta. Nel codice di esempio, è stato utilizzato `Locale.US`, ma puoi cambiare la `Locale` in base alle tue esigenze per ottenere il formato della valuta appropriato per la tua applicazione.