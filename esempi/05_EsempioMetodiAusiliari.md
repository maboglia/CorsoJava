# metodi ausiliari

Logica imperativa / procedurale in Java, applicazione del principio divide et impera: suddividere le istruzioni complesse in istruzioni elementari creando metodi privati statici di ausilio al metodo principale.

```java
import java.util.Scanner;
import java.util.*;

public class EsempioMetodiAusiliari {


	  private static Scanner lettore = creaScanner();
	  
	  private final static String ERRORE_FORMATO = "Attenzione: il dato inserito non e' nel formato corretto";
	  private final static String ERRORE_MINIMO= "Attenzione: e' richiesto un valore maggiore o uguale a ";
	  private final static String ERRORE_STRINGA_VUOTA= "Attenzione: non hai inserito alcun carattere";
	  private final static String ERRORE_MASSIMO= "Attenzione: e' richiesto un valore minore o uguale a ";
	  private final static String MESSAGGIO_AMMISSIBILI= "Attenzione: i caratteri ammissibili sono: ";


	public static void main (String[] args){
		//dal main richiama i metodi ausiliari: tutti private e static		
		
	}	
	
	public void saluta(){
		
		System.out.println("ciao");
	}
	
	private static String salutaPlus(String messaggio){
		
		System.out.println("ciao" +  messaggio);
		return "fino a qui tutto bene!";
	}
	
	private static static void salutaStatico(){
		System.out.println("ciao");
		
	}
 
 
	  private static Scanner creaScanner ()
	  {
	   Scanner creato = new Scanner(System.in);
	   creato.useDelimiter(System.getProperty("line.separator"));
	   return creato;
	  }
	  
	  private static String leggiStringa (String messaggio)
	  {
		  System.out.print(messaggio);
		  return lettore.next();
	  }
	  
	  private static String leggiStringaNonVuota(String messaggio)
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
	  
	  private static char leggiChar (String messaggio)
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
	  
	  private static char leggiUpperChar (String messaggio, String ammissibili)
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
	  
	  
	  private static int leggiIntero (String messaggio)
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

	  private static int leggiInteroConMinimo(String messaggio, int minimo)
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

	  private static int leggiIntero(String messaggio, int minimo, int massimo)
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

	  
	  private static double leggiDouble (String messaggio)
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
	 
	  private static double leggiDoubleConMinimo (String messaggio, double minimo)
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

	 

		/*TuttiUguali
		* 			
		* */
		private static void tuttiUguali() {
			
			Scanner input = new Scanner ( System . in );
			System . out . println ( " Inserisci tre numeri : " );
			int n1 = input . nextInt ();
			int n2 = input . nextInt ();
			int n3 = input . nextInt ();
			if ( uguali ( n1 , n2 , n3 ))
			System . out . println ( " Tutti uguali ! " );
			else
			System . out . println ( " Almeno uno e ’ diverso " );

		}
			

		/*Concatena
			*  * 
			* */
		private static void concatena{
			Scanner input = new Scanner ( System . in );
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
		if ( num <0) 	
			System . out . println ( " ERRORE : numero negativo " );
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
		 * @return double
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
		private static String concatena ( String str1 , String str2 ) {
			return str1 + " * " + str2 ;
			}


}
```