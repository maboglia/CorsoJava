Il codice Java "InizialiUguali" legge una stringa da tastiera e confronta la prima lettera di questa stringa con la prima lettera di altre 9 stringhe inserite successivamente. Se tutte le stringhe hanno la stessa prima lettera, il programma stampa un messaggio che indica che le iniziali sono tutte uguali, altrimenti stampa un messaggio che indica che le iniziali non sono tutte uguali.

Ecco il testo del programma:

```java
import java.util.Scanner;

public class InizialiUguali {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    boolean tutteUguali = true;

    System.out.println("Inserisci una stringa");
    String s1 = input.nextLine();

    for (int i = 1; i < 10; i++) {
      String s2 = input.nextLine();
      if (!confronta(s1, s2)) tutteUguali = false;
    }

    if (tutteUguali) 
      System.out.println("Iniziano tutte con lo stesso carattere");
    else 
      System.out.println("Non iniziano tutte con lo stesso carattere");

  }

  private static boolean confronta(String a, String b) {
    return (a.charAt(0) == b.charAt(0));
  }

}
```