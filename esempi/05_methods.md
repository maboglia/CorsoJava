## methods

* _02MetodiAusiliari.java
* 05_methods.md
* CallingMethodsInSameClass.java
* Funzioni.java
* InputDati.java
* MethodDemo.java
* ObjectVarsAsParameters.java


```java
package esercizi1;

import java.util.Scanner;

public class _02MetodiAusiliari {

	
	/**
	 * test 
	 * @param args
	 */
	public static void main(String[] args) {
		/*Ripeti
		Scanner input = new Scanner ( System . in );
		System . out . println ( " Inserisci una stringa " );
		String s = input . nextLine ();
		System . out . println ( " Inserisci un numero intero positivo " );
		int n = input . nextInt ();
		ripetitore (s , n );
		*/
		
		
		/*TuttiUguali
		 * 			
		 * 
		  Scanner input = new Scanner ( System . in );
			System . out . println ( " Inserisci tre numeri : " );
			int n1 = input . nextInt ();
			int n2 = input . nextInt ();
			int n3 = input . nextInt ();
			if ( uguali ( n1 , n2 , n3 ))
			System . out . println ( " Tutti uguali ! " );
			else
			System . out . println ( " Almeno uno e ’ diverso " );
*/
		
		/*
		 * MezziCasuali
		  System . out . println ( genera ());
		 * 
		 * */
		/*Concatena
		 *  * 
		 * */Scanner input = new Scanner ( System . in );
			System . out . println ( " Inserisci tre parole : " );
			String s1 = input . next ();
			String s2 = input . next ();
			String s3 = input . next ();
			String ris = concatena ( concatena ( s1 , s2 ) , s3 );
			System . out . println ( ris );
		
		
		}
	
		/**
		 * ripetitore ripete una stringa str per num volte
		 * @param str stringa da ripetere
		 * @param num per numero di volte
		 */
		private static void ripetitore ( String str , int num ) {
		if ( num <0) System . out . println ( " ERRORE : numero negativo " );
		else
		for ( int i =0; i < num ; i ++)
		System . out . println ( str );
		}
		/**
		 * 
		 * @param x
		 * @param y
		 * @param z
		 * @return booleano
		 */
		private static boolean uguali ( int x , int y , int z ) {
			return ( x == y && y == z );
			}
		/**
		 * 
		 * @return dbl
		 */
		private static double genera () {
			double r = Math . random ();
			if (r >=0.5) r -=0.5;
			return r ;
			}
		/**
		 * concatena
		 * @param str1
		 * @param str2
		 * @return stringa
		 */
		public static String concatena ( String str1 , String str2 ) {
			return str1 + " * " + str2 ;
			}
}


import java.awt.Rectangle;

public class ObjectVarsAsParameters
{	public static void main(String[] args)
	{	go();
	}
	
	public static void go()
	{	Rectangle r1 = new Rectangle(0,0,5,5);
		System.out.println("In method go. r1 " + r1 + "\n");
		// could have been 
		//System.out.prinltn("r1" + r1.toString());
		r1.setSize(10, 15);
		System.out.println("In method go. r1 " + r1 + "\n");
		alterPointee(r1);
		System.out.println("In method go. r1 " + r1 + "\n");
		
		alterPointer(r1);
		System.out.println("In method go. r1 " + r1 + "\n");
	}
	
	public static void alterPointee(Rectangle r)
	{	System.out.println("In method alterPointee. r " + r + "\n");
		r.setSize(20, 30);
		System.out.println("In method alterPointee. r " + r + "\n");
	}
	
	public static void alterPointer(Rectangle r)
	{	System.out.println("In method alterPointer. r " + r + "\n");
		r = new Rectangle(5, 10, 30, 35);
		System.out.println("In method alterPointer. r " + r + "\n");
	}
	
	
}
```

```java
package esempi.week11;

public class Funzioni {

	public static void main (String[] args){

		//metodo di classe
		salutaStatico();
		
		Funzioni miafunc = new Funzioni();
		//metodo che appartiene agli oggetti di tipo Funzioni
		miafunc.saluta();
		String temp = miafunc.salutaPlus("ciao");
		System.out.println(temp);
		System.out.println(temp);
		
	}	
	
	public void saluta(){
		
		System.out.println("ciao");
	}
	
	public String salutaPlus(String messaggio){
		
		System.out.println("ciao" +  messaggio);
		return "fino a qui tutto bene!";
	}
	
	public static void salutaStatico(){
		System.out.println("ciao");
		
	}
	
	
}
/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
```}

```java
package giochi;
import java.util.*;
public class InputDati 
{
	  private static Scanner lettore = creaScanner();
	  
	  private final static String ERRORE_FORMATO = "Attenzione: il dato inserito non e' nel formato corretto";
	  private final static String ERRORE_MINIMO= "Attenzione: e' richiesto un valore maggiore o uguale a ";
	  private final static String ERRORE_STRINGA_VUOTA= "Attenzione: non hai inserito alcun carattere";
	  private final static String ERRORE_MASSIMO= "Attenzione: e' richiesto un valore minore o uguale a ";
	  private final static String MESSAGGIO_AMMISSIBILI= "Attenzione: i caratteri ammissibili sono: ";

	  
 
	  private static Scanner creaScanner ()
	  {
	   Scanner creato = new Scanner(System.in);
	   creato.useDelimiter(System.getProperty("line.separator"));
	   return creato;
	  }
	  
	  public static String leggiStringa (String messaggio)
	  {
		  System.out.print(messaggio);
		  return lettore.next();
	  }
	  
	  public static String leggiStringaNonVuota(String messaggio)
	  {
	   boolean finito=false;
	   String lettura = null;
	   do
	   {
		 lettura = leggiStringa(messaggio);
		 lettura = lettura.trim();
		 if (lettura.length() > 0)
		  finito=true;
		 else
		  System.out.println(ERRORE_STRINGA_VUOTA);
	   } while (!finito);
	   
	   return lettura;
	  }
	  
	  public static char leggiChar (String messaggio)
	  {
	   boolean finito = false;
	   char valoreLetto = '\0';
	   do
	    {
	     System.out.print(messaggio);
	     String lettura = lettore.next();
	     if (lettura.length() > 0)
	      {
	       valoreLetto = lettura.charAt(0);
	       finito = true;
	      }
	     else
	      {
	       System.out.println(ERRORE_STRINGA_VUOTA);
	      }
	    } while (!finito);
	   return valoreLetto;
	  }
	  
	  public static char leggiUpperChar (String messaggio, String ammissibili)
	  {
	   boolean finito = false;
	   char valoreLetto = ' ';
	   do
	   {
	    valoreLetto = leggiChar(messaggio);
	    valoreLetto = Character.toUpperCase(valoreLetto);
	    if (ammissibili.indexOf(valoreLetto) != -1)
		 finito  = true;
	    else
	     System.out.println(MESSAGGIO_AMMISSIBILI + ammissibili);
	   } while (!finito);
	   return valoreLetto;
	  }
	  
	  
	  public static int leggiIntero (String messaggio)
	  {
	   boolean finito = false;
	   int valoreLetto = 0;
	   do
	    {
	     System.out.print(messaggio);
	     if (lettore.hasNextInt())
	      {
	       valoreLetto = lettore.nextInt();
	       finito = true;
	      }
	     else
	      {
	       System.out.println(ERRORE_FORMATO);
	       String daButtare = lettore.next();
	      }
	    } while (!finito);
	   return valoreLetto;
	  }

	  public static int leggiInteroConMinimo(String messaggio, int minimo)
	  {
	   boolean finito = false;
	   int valoreLetto = 0;
	   do
	    {
	     valoreLetto = leggiIntero(messaggio);
	     if (valoreLetto >= minimo)
	      finito = true;
	     else
	      System.out.println(ERRORE_MINIMO + minimo);
	    } while (!finito);
	     
	   return valoreLetto;
	  }

	  public static int leggiIntero(String messaggio, int minimo, int massimo)
	  {
	   boolean finito = false;
	   int valoreLetto = 0;
	   do
	    {
	     valoreLetto = leggiIntero(messaggio);
	     if (valoreLetto >= minimo && valoreLetto<= massimo)
	      finito = true;
	     else
	      if (valoreLetto < minimo)
	         System.out.println(ERRORE_MINIMO + minimo);
	      else
	    	 System.out.println(ERRORE_MASSIMO + massimo); 
	    } while (!finito);
	     
	   return valoreLetto;
	  }

	  
	  public static double leggiDouble (String messaggio)
	  {
	   boolean finito = false;
	   double valoreLetto = 0;
	   do
	    {
	     System.out.print(messaggio);
	     if (lettore.hasNextDouble())
	      {
	       valoreLetto = lettore.nextDouble();
	       finito = true;
	      }
	     else
	      {
	       System.out.println(ERRORE_FORMATO);
	       String daButtare = lettore.next();
	      }
	    } while (!finito);
	   return valoreLetto;
	  }
	 
	  public static double leggiDoubleConMinimo (String messaggio, double minimo)
	  {
	   boolean finito = false;
	   double valoreLetto = 0;
	   do
	    {
	     valoreLetto = leggiDouble(messaggio);
	     if (valoreLetto >= minimo)
	      finito = true;
	     else
	      System.out.println(ERRORE_MINIMO + minimo);
	    } while (!finito);
	     
	   return valoreLetto;
	  }


}
```

```java
package esempi.week5;


/**
   This example demonstrates method calls.
*/

public class MethodDemo
{
   public static void main(String[] args)
   {
      String saluto = "Hello, World!";
      System.out.println(saluto); 
         // greeting is the argument in this call to the println method
      int numeroCaratteri = saluto.length();
        // The length method returns a value
   
      System.out.print("numberOfCharacters: ");
      System.out.println(numeroCaratteri);

      // You can use the return value of one method as an argument of another method

      System.out.print("greeting.length(): ");
      System.out.println(saluto.length());

      // The replace method has two arguments
      String river = "Mississippi";
      river = river.replace("issipp", "our");
      System.out.print("river: ");
      System.out.println(river);
   }
}
```
