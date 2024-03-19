Il codice Java "Incipit" legge una stringa e un numero da tastiera utilizzando la classe Scanner e quindi stampa i primi n caratteri della stringa inserita. Se il numero inserito è negativo o superiore alla lunghezza della stringa, viene stampato un messaggio di errore.

Ecco il testo del programma:

```java
import java.util.Scanner;

public class Incipit {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Inserisci una stringa");
    String s = input.nextLine();

    System.out.println("Inserisci un numero");
    int n = input.nextInt();
    
    if ((n < 0) || (n > s.length()))
      System.out.println("ERRORE: valore inserito non corretto");
    else
      System.out.println(s.substring(0, n));

  }

}
```
