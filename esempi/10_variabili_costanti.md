# Varibili e costanti

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
public class Scope1
{
   public static void main(String[] args)      
   {

         double r;

         r = 3.14;


      System.out.println(r);
   }
}

```

---

## Scope: ambito di visibilità delle variabili

```java
public class Scope2
{
   public static void main(String[] args)      
   {
      {
         double r;

         r = 3.14;
      }

      System.out.println(r);
   }
}

```

---

## Scope: ambito di visibilità delle variabili

```java
public class Scope3
{
   public static void main(String[] args)      
   {
      {
         r = 1;            // (1)

         double r;

         r = r + 5;        // (2)
      }

      r = r + 2;           // (3)
   }

   r = r + 3;              // (4)
}

```

---

## Scope: ambito di visibilità delle variabili

```java
public class Scope4
{
   public static void main(String[] args)      
   {
      {
         double r = 3.14;

         r = r + 5;
         System.out.println(r);
      }

      {
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
public class Scope5
{
   public static void main(String[] args)      
   {
      {
         double r = 3.14;

         {
            r = 5;    // No error
            t = 5;    // Will cause "undefined variable" error
         }

         double t = 1.0;
      }

   }
}

```

---

## Scope: ambito di visibilità delle variabili

```java
public class Scope6
{
   public static void main(String[] args)      
   {
      {  // Start of outer scope
         double r;

         {  // Start of inner scope
            String r;

         }

      }

   }
}

```

---

## Scope: ambito di visibilità delle variabili

```java
public class Scope7
{
   public static void main(String[] args)      
   {
      /* -------------------------------------------
         2 variables named r inside the SAME scope
         ------------------------------------------- */
      double r = 0.0;

      int r = 0;

      System.out.println(r);

   }
}

```

---

## Scope: ambito di visibilità delle variabili

```java

```

---

## Uso la variabile per lo scambio di valori

```java
	public static void main(String[] args) {
		
		int a, b, temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci il primo valore intero");
		a = sc.nextInt();
		System.out.println("inserisci il secondo valore intero");
		b = sc.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);

	}
```