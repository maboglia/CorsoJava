# metodi ausiliari

Logica imperativa / procedurale in Java, applicazione del principio divide et impera: suddividere le istruzioni complesse in istruzioni elementari creando metodi privati statici di ausilio al metodo principale.

---

```java

public class MetodiAusiliari {
	public static void main(String args[])
	{
		int a= 7;
		int b=3;
		int differenza, modulo= 0;
		
		somma(a, b);
				
		differenza = a-b;
		
		System.out.println("differenza: "+differenza);
		
		modulo = a%b;
		
		System.out.println("modulo: "+modulo);
	}
	
	public static void somma(int a, int b)
	{
		int somma=0;
		
		somma= a+b;
		
		System.out.println("somma: "+somma);
	}
}

```
---

---

```java
import java.util.Scanner;

public class GetInput {

    public static void main(String[] args){

        String numeroUno = getInput("Inserisci primo numero");
        String numeroDue = getInput("Inserisci secondo numero");

        double d1 = Double.parseDouble(numeroUno);
        double d2 = Double.parseDouble(numeroDue);

        usaMatematica nuovaOperazione = new usaMatematica(d1, d2);


        System.out.println(nuovaOperazione.somma());

    }

    public static String getInput(String domanda){

        System.out.println(domanda);
        Scanner stringa = new Scanner(System.in);
        String miaStringa = stringa.next();
        
        return miaStringa;

    }


}
```

---

## esempio

```java
import java.util.Scanner;

public class SimpleCalcolatrice {

 public static void main(String[] args) {
  
  //numeroUno vale .....
  double numeroUno = getInput("Inserisci il primo numero");//dopo l'istruzione
  
  /*
   * commenti su più linee
   * */
  double numeroDue = getInput("Inserisci il secondo numero");
  
  double somma = numeroUno + numeroDue;
  
  System.out.println("La somma di " + numeroUno +" e " + numeroDue + " è " + somma );

 }
 
 /**
  * Mio metodo per catturare l'input dell'utente
  * @param domanda String contenente la domanda da inoltrare all'utente
  * @return un double che rappresenta l'input utente
  */
 private static double getInput(String domanda) {
  
  Scanner input = new Scanner(System.in);
  
  int i = domanda.length();
  System.out.println();
  System.out.println(domanda);

  System.out.println();
  
  for (int j = 0; j < i; j++) {
   System.out.print(j);
  }
  
  System.out.println();

  
  /*
  String  miaStringa= input.next();
  double mioDouble = Double.parseDouble(miaStringa);
  */
  double mioDouble = input.nextDouble();
  return mioDouble;
  
 }


 
 
}
```

---

## esempio

```java
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
			
```

---

## esempio ripetitore ripete una stringa str per num volte

```java 
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
```

---

## esempio uguali

```java
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
```

---

## esempio genera

```java
		/**
		 * 
		 * @return double
		 */
		private static double genera () {
			double r = Math . random ();
			if (r >=0.5) r -=0.5;
			return r ;
			}
```

---

## esempio concatena

```java
		/**
		 * concatena
		 * @param str1
		 * @param str2
		 * @return stringa
		 */
		private static String concatena ( String str1 , String str2 ) {
			return str1 + " * " + str2 ;
			}


```

---

## esempio concatena con Scanner

```java
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
```

---

## esempio Programma che legge due numeri interi e ne stampa la somma

```java
/* Programma che legge due numeri interi e ne
   stampa la somma */
class Ingresso {

  static int leggiIntero() {
    byte[] b = new byte[9];
    int res = 0;

    try {
      System.in.read(b);
    } catch (Exception e) {}
    for (int i = 0; i < b.length; i++)
      if (b[i] >= '0' && b[i] <= '9')
        res = res * 10 + b[i] - '0';
      else
        break;
    return res;
  }

  public static void main (String[] args) {
    int x,y;
    System.out.print("Inserisci un numero intero: ");
    y = leggiIntero();
    System.out.print("Inserisci un numero intero: ");
    x = leggiIntero();
    System.out.println(x + y);
  }
}

```
