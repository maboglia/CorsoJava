Il programma Java "Prefisso" legge una stringa da tastiera e restituisce i primi tre caratteri di quella stringa. Se la lunghezza della stringa è inferiore o uguale a 3, viene restituita la stessa stringa.

Ecco il testo del programma:

```java
import java.util.Scanner;

public class Prefisso {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(pref(s));
    }

    private static String pref(String s) {
        if (s.length() > 3) 
            s = s.substring(0, 3);
        return s;
    }

}
```

Il metodo `pref` riceve una stringa come input e restituisce i primi tre caratteri di quella stringa. Se la lunghezza della stringa è maggiore di 3, viene utilizzato il metodo `substring(0, 3)` per estrarre i primi tre caratteri. Se la lunghezza della stringa è 3 o inferiore, la stringa viene restituita così com'è. Infine, il metodo restituisce la stringa modificata o la stringa originale a seconda della lunghezza.
