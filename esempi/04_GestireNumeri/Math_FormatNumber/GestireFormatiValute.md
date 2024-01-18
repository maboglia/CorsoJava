Ecco un esempio di come trasformare un numero double in formato decimale con la lingua italiana (`Locale.ITALY`):

```java
import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumberExample {
    public static void main(String[] args) {
        // Numero da formattare
        double amount = 12345.6789;

        // Creazione di un oggetto NumberFormat per il formato decimale con lingua italiana
        NumberFormat decimalFormatter = NumberFormat.getNumberInstance(Locale.ITALY);

        // Formattazione del numero in formato decimale
        String formattedDecimal = decimalFormatter.format(amount);

        // Stampare il risultato formattato
        System.out.println("Numero formattato in formato decimale: " + formattedDecimal);
    }
}
```

In questo esempio, viene utilizzato `NumberFormat.getNumberInstance(Locale.ITALY)` per ottenere un oggetto `NumberFormat` configurato per il formato decimale nella lingua italiana. Il numero viene quindi formattato e il risultato viene stampato a console. Puoi adattare la `Locale` in base alle tue esigenze linguistiche e di formattazione.