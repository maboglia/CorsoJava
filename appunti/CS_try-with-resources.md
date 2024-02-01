# try-with-resources

Il costrutto `try-with-resources` è un'aggiunta introdotta in Java 7 per semplificare e migliorare la gestione delle risorse, come file o connessioni a database, che richiedono la chiusura esplicita. Questo costrutto automatizza la chiusura delle risorse, rendendo il codice più pulito e sicuro.

---

La forma base del `try-with-resources` è la seguente:

```java
try (risorsa1 dichiarata e inizializzata; risorsa2 dichiarata e inizializzata) {
    // Blocco di codice che utilizza le risorse
} catch (Eccezione1 | Eccezione2 multi-catch) {
    // Gestione delle eccezioni
}
```

Le risorse devono implementare l'interfaccia `AutoCloseable` o `Closeable`. Quando il blocco `try` è completato (normalmente o a causa di un'eccezione), le risorse vengono automaticamente chiuse, eliminando la necessità di un blocco `finally` dedicato per la chiusura.

---

Ecco un esempio di utilizzo del `try-with-resources` nella lettura di un file:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

In questo esempio, la classe `BufferedReader` implementa l'interfaccia `AutoCloseable`. Utilizzando il `try-with-resources`, non è necessario esplicitamente chiudere il `BufferedReader`. Quando il blocco `try` è eseguito o se si verifica un'eccezione, il `BufferedReader` viene automaticamente chiuso.

È importante notare che il costrutto `try-with-resources` è efficiente e sicuro e dovrebbe essere preferito quando si lavora con risorse che richiedono chiusura, garantendo una migliore manutenibilità e riducendo il rischio di leak di risorse.
