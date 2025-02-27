# Variabili e costanti

## Dichiarazione e assegnamento di valore a una variabile

```java
   public static void main(String[] args)
   {
      int base = 10; // Dichiara base la inizializza a 10
      System.out.print("base: ");
      System.out.println(base);

      base = 20; // Modifica il valore di base a 20
      System.out.print("base: ");
      System.out.println(base);

      int height = 20;
      base = height + 10; // il valore può essere anche un'espressione
      System.out.print("base: ");
      System.out.println(base);

      base = base + 10; // la stessa variabile può essere usata per modificare il proprio valore
      System.out.print("base: ");
      System.out.println(base);      
   }
```

---

## Scope: ambito di visibilità delle variabili

```java
public class Scope1 {
   public static void main(String[] args) {
      // Dichiarazione e inizializzazione di una variabile all'interno dello scope del metodo
      double r;
      r = 3.14;
      System.out.println(r);
   }
}
```

---

## Scope: ambito di visibilità delle variabili

```java
public class Scope2 {
   public static void main(String[] args) {
      {
         // Dichiarazione e inizializzazione di una variabile all'interno di un blocco
         double r;
         r = 3.14;
      }
      // Questa riga genera errore poiché la variabile r è fuori dallo scope
      // System.out.println(r);
   }
}
```

---

## Scope: ambito di visibilità delle variabili

```java
public class Scope3 {
   public static void main(String[] args) {
      {
         // Utilizzo di una variabile prima della dichiarazione: errore di compilazione
         // r = 1;            // (1)
         double r;
         r = r + 5;        // (2)
      }
      // Anche questa riga genera errore poiché la variabile r è fuori dallo scope
      // r = r + 2;        // (3)
   }
   // r = r + 3;          // (4)
}
```

---

## Scope: ambito di visibilità delle variabili

```java
public class Scope4 {
   public static void main(String[] args) {
      {
         double r = 3.14;
         r = r + 5;
         System.out.println(r);
      }
      {
         // Dichiarazione di una variabile con lo stesso nome in un blocco diverso
         String r = "3.14";
         r = r + 5;
         System.out.println(r);
      }
   }
}
```

---

## Scope: ambito di visibilità delle variabili

```java
public class Scope5 {
   public static void main(String[] args) {
      {
         double r = 3.14;
         {
            r = 5;    // Nessun errore, poiché r è visibile nel blocco annidato
            // t = 5;    // Genera errore: t non è ancora dichiarata
         }
         double t = 1.0;
      }
   }
}
```

---

## Scope: ambito di visibilità delle variabili

```java
public class Scope6 {
   public static void main(String[] args) {
      {  // Inizio del blocco esterno
         double r;
         {  // Inizio del blocco interno
            // Dichiarazione di una nuova variabile con lo stesso nome
            String r;
         }
      }
   }
}
```

---

## Scope: ambito di visibilità delle variabili

```java
public class Scope7 {
   public static void main(String[] args) {
      // Dichiarazione di due variabili con lo stesso nome nello stesso scope: errore di compilazione
      double r = 0.0;
      // int r = 0; // Questa riga genererebbe un errore
      System.out.println(r);
   }
}
```

---

## Uso la variabile per lo scambio di valori

```java
import java.util.Scanner;

public class ScambioValori {
   public static void main(String[] args) {
      int a, b, temp;
      Scanner sc = new Scanner(System.in);
      System.out.println("Inserisci il primo valore intero");
      a = sc.nextInt();
      System.out.println("Inserisci il secondo valore intero");
      b = sc.nextInt();

      // Scambio dei valori usando una variabile temporanea
      temp = a;
      a = b;
      b = temp;

      System.out.println("A = " + a);
      System.out.println("B = " + b);
      sc.close();
   }
}
```
