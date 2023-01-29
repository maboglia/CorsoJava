# metodi ausiliari

Logica `imperativa` / `procedurale` in Java, applicazione del principio `divide et impera`: suddividere le istruzioni complesse in istruzioni elementari creando metodi privati statici di ausilio al metodo principale.

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

## getInput

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

## esempio calcolatrice

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
  * Metodo per catturare l'input dell'utente
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

## esempio TuttiUguali

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

## esempio ripetitore 
ripete una stringa str per num volte

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

* [esempi](https://github.com/maboglia/CorsoJava/blob/master/esempi/01_base/03_metodi_ausiliari)

---

## Altri esempi di metodi (non static)

---

## backAround

```java
// Given a string, take the last char and return a new string with the last char added at the front and back,
// so "cat" yields "tcatt". The original string will be length 1 or more. 
public String backAround(String str) {
  char last = str.charAt(str.length()-1);
  return last + str + last;
}
```

---

## close10

```java
// Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
// Note that Math.abs(n) returns the absolute value of a number. 
public int close10(int a, int b) {
  if (Math.abs(10-a) < Math.abs(10-b)) {
     return a;
  } else if (Math.abs(10-a) > Math.abs(10-b)) {
     return b;
  } else {
     return 0;
  }
}
```

---

## delDel

```java
// Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. 
// Otherwise, return the string unchanged. 
public String delDel(String str) {
   if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
      return str.charAt(0) + str.substring(4, str.length());
   } else {
      return str;
   }
}
```

---

## diff21

```java
// Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21. 
public int diff21(int n) {
  return ((21-n) >= 0) ? 21-n : -2 * (21-n);
}
```

---

## endUp

```java
// Given a string, return a new string where the last 3 chars are now in upper case. 
// If the string has less than 3 chars, uppercase whatever is there. 
public String endUp(String str) {
  int length = str.length();
  if (length <= 3) {
     return str.toUpperCase();
  }
  
  return str.substring(0, length-3) + str.substring(length-3, length).toUpperCase();
}
```

---

## everyNth

```java
// Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. 
// So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more. 
public String everyNth(String str, int n) {
  int length = str.length();
  String result = "";
  for(int i=0; i<length; i+=n) {
     result += str.charAt(i);
  }
  return result;
}
```

---

## front22

```java
// Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, 
// so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
public String front22(String str) {
  String first = (str.length() >= 2) ? str.substring(0, 2) : str.substring(0, str.length());
  return first +str + first;
}
```

---

## front3

```java
// Given a string, we'll say that the front is the first 3 chars of the string. 
// If the string length is less than 3, the front is whatever is there. 
// Return a new string which is 3 copies of the front. 
public String front3(String str) {
  int length = (str.length()>=3) ? 3 : str.length();
  String temp = str.substring(0, length) + str.substring(0, length) + str.substring(0, length);
  return temp;
}
```

---

## frontBack

```java
// Given a string, return a new string where the first and last chars have been exchanged. 
public String frontBack(String str) {
  int length = str.length();
    
  if (length < 2) {
     return str;
  } 
  
  String middle = str.substring (1, length-1);  
  return str.charAt(length-1) + middle + str.charAt(0);
}
```

---

## hasTeen

```java
// We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
// Given 3 int values, return true if 1 or more of them are teen.
public boolean hasTeen(int a, int b, int c) {
  return ((a>=13 && a<=19) || 
          (b>=13 && b<=19) || 
          (c>=13 && c<=19));
}
```

---

## icyHot

```java
// Given two temperatures, return true if one is less than 0 and the other is greater than 100.
public boolean icyHot(int temp1, int temp2) {
  return ((temp1<0 && temp2>100) || (temp1>100 && temp2<0));
}
```

---

## in1020

```java
// Given 2 int values, return true if either of them is in the range 10..20 inclusive. 
public boolean in1020(int a, int b) {
  return ((a>=10 && a<=20) || (b>=10 && b<=20));
}
```

---

## in3050

```java
// Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive. 
public boolean in3050(int a, int b) {
  return ((a>=30 && a<=40 && b>=30 && b<=40) ||
          (a>=40 && a<=50 && b>=40 && b<=50));
}
```

---

## intMax

```java
// Given three int values, a b c, return the largest. 
public int intMax(int a, int b, int c) {
  return Math.max (Math.max(a, b), Math.max(b, c));
}
```

---

## lastDigit

```java
// Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
// Note that the % "mod" operator computes remainders, so 17 % 10 is 7. 
public boolean lastDigit(int a, int b) {
  return (a%10 == b%10);
}
```

---

## loneTeen

```java
// We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
// Given 2 int values, return true if one or the other is teen, but not both. 
public boolean loneTeen(int a, int b) {
  boolean first = (a>=13 && a<=19);
  boolean second = (b>=13 && b<=19);
  return (first && !second) || (!first && second);
}
```

---

## makes10

```java
// Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10. 
public boolean makes10(int a, int b) {
  return ( (a == 10) || (b == 10) || (a+b == 10));
}
```

---

## max1020

```java
// Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
// or return 0 if neither is in that range. 
public int max1020(int a, int b) {
  boolean aInRange = (a>=10 && a<=20);
  boolean bInRange = (b>=10 && b<=20);
  if (aInRange && bInRange) {
     return Math.max (a, b);
  } else if (aInRange && !bInRange) {
     return a;
  } else if (!aInRange && bInRange) {
     return b;
  }
  return 0;
}
```

---

## missingChar

```java
// Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
// The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
public String missingChar(String str, int n) {
  String temp;
  temp = str.substring(0, n) + str.substring(n+1, str.length());
  return temp;
}
```

---

## mixStart

```java
// Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count. 
public boolean mixStart(String str) {
  return (str.length()>=3 && str.substring(1,3).equals("ix"));
}
```

---

## monkeyTrouble

```java
// We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
// We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble. 
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return ((!aSmile && !bSmile) || (aSmile && bSmile));
}
```

---

## nearHundred

```java
// Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number. 
public boolean nearHundred(int n) {
  return ((Math.abs(100-n)) <= 10 || (Math.abs(200-n)) <= 10);
}
```

---

## notString

```java
// Given a string, return a new string where "not " has been added to the front. 
// However, if the string already begins with "not", return the string unchanged.
public String notString(String str) {
  if (str.length() >=3 && str.substring(0,3).equals("not")) {
     return str;
  }
  return "not " + str;
}
```

---

## or35

```java
// Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
public boolean or35(int n) {
  return ((n%3 == 0) || (n%5==0));
}
```

---

## parrotTrouble

```java
// We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
// We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble. 
public boolean parrotTrouble(boolean talking, int hour) {
  return (talking && (hour < 7 || hour > 20));
}
```

---

## posNeg

```java
// Given 2 int values, return true if one is negative and one is positive. 
// Except if the parameter "negative" is true, then return true only if both are negative. 
public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
     return (a<0 && b<0);
  } else {
     return ((a<0 && b>0) || (a>0 && b<0));
  }
}
```

---

## startHi

```java
// Given a string, return true if the string starts with "hi" and false otherwise.
public boolean startHi(String str) {
  if (str.length() < 2) {
     return false;
  }
  String first = str.substring(0, 2);
  return first.equals("hi");
}
```

---

## startOz

```java
// Given a string, return a string made of the first 2 chars (if present), 
// however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
public String startOz(String str) {
  String result = "";
  
  if (str.length() >= 1 && str.charAt(0) == 'o') {
     result += 'o';
  }
  
  if (str.length() >= 2 && str.charAt(1) == 'z') {
     result += 'z';
  }
  
  return result;
}
```

---

## stringE

```java
// Return true if the given string contains between 1 and 3 'e' chars. 
public boolean stringE(String str) {
  int count = 0;
  int length = str.length();
  for(int i=0; i<length; i++) {
     if (str.charAt(i) == 'e') {
        count++;
     }
  }
  
  return (count>=1 && count<=3);
}
```

---

## sumDouble

```java
// Given two int values, return their sum. Unless the two values are the same, then return double their sum. 
public int sumDouble(int a, int b) {
 if (a==b) {
    return 2*(a+b);
 } 
 return a+b;
}
```

---

