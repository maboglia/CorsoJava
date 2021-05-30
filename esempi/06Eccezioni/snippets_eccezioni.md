# esempi con le eccezioni

  ---

### EccezioneArray

```java
public class EccezioneArray {
  public static void main(String[] args) {
  int[] a = {5,3,6,5,4};
  // attenzione al <=...
  for (int i=0; i<=a.length; i++) 
  System.out.println(a[i]);
  System.out.println("Ciao"); 
  }
}
```

---

### EccezioneAritmetico

```java
import java.util.Scanner; 
public class EccezioneAritmetico {
  public static void main(String[] args) { 
  Scanner input = new Scanner(System.in);
  System.out.println("Inserisci due interi"); 
  int x = input.nextInt();
  int y = input.nextInt();
  System.out.println(x/y);
  // che succede se y == 0??
  } 
}
```
                                                                   

---

### EccezioneFormato

```java
import java.util.Scanner; 
public class EccezioneFormato {
  public static void main(String[] args) { 
  Scanner input = new Scanner(System.in); 
  System.out.println("Inserisci un intero"); 
  int x = input.nextInt();

  // che succede se l'utente inserisce un carattere?
  System.out.println(x); 
  }
}
```                                                               

---

### Esempio gestione eccezione: EccezioneAritmetico


```java
import java.util.Scanner;
public class EccezioneAritmetico {
  public static void main(String[] args) { 
  Scanner input = new Scanner(System.in);

  System.out.println("Inserisci due interi");
  int x = input.nextInt();

  int y = input.nextInt();

  try { System.out.println(x/y);
  System.out.println("CIAO");

  }
  catch (ArithmeticException e) {
  // se si verifica un eccezione di tipo ArithmeticException
  // nella divisione x/y il programma salta qui (non stampa CIAO)
  System.out.println("Non faccio la divisione..."); // gestita l'anomalia, l'esecuzione riprende...
  }
  System.out.println("Fine Programma"); }
}
```

---

### Esempio gestione eccezione: EccezioneFormato


```java
import java.util.Scanner;
import java.util.InputMismatchException; 

public class EccezioneFormato {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.println("Inserisci un intero"); 
    int x; 
    boolean ok;
    do {
      ok = true; 
      try {
        x = input.nextInt();
        System.out.println(x); 
      }
      catch (InputMismatchException e) { 
        input.nextLine(); // annulla l'input ricevuto System.out.println("Ritenta...");
        ok = false;
      }
    } while (!ok);
  } 
}
```                                                              

---

### Esempio: controllo correttezza parametri - Rettangolo

```java
public class Rettangolo { 
  private base;
  private altezza;
  // ... altri metodi e costruttori

  public void setBase(int x) throws EccezioneBaseNegativa { 
    if (x<0) throw new EccezioneBaseNegativa()
    else base=x;
  } 
}
```          

---

### EccezioneBaseNegativa

```java
public class EccezioneBaseNegativa extends Exception {
  EccezioneBaseNegativa() { 
    super ();
  }

  EccezioneBaseNegativa(String msg) { 
    super(msg);
    } 
}
```          

---

### System.in.read 
* può provocare una eccezione controllata di tipo IOException 
* Occorre quindi inserirla in un blocco

```java
try...catch...
byte b[] = new byte[10];
try {
System.in.read (b);
} catch (Exception e) {
...
}

```