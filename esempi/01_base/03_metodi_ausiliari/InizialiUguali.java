import java.util.Scanner;

public class InizialiUguali {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    boolean tutteuguali = true;

    System.out.println("Inserisci una stringa");
    String s1 = input.nextLine();

    for (int i=1; i<10; i++) {
      String s2 = input.nextLine();
      if (!confronta(s1,s2)) tutteuguali=false;
    }

    if (tutteuguali) System.out.println("Iniziano tutte con lo stesso carattere");
    else System.out.println("Non iniziano tutte con lo stesso carattere");

  }

  private static boolean confronta(String a, String b) {
    return (a.charAt(0)==b.charAt(0));
  }

}
