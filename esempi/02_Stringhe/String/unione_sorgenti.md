===== FILE: 020_Stringhe.java =====

public class Stringhe {

	public static void main(String[] args) {

		String a = new String ("Ciao");
		String b = a;
		String c = " ";
		String ok = "a e b sono uguali";
		String nonOk = "a e b sono diversi";
		String same = "a e b contengono lo stesso testo";
		
		System.out.println( a + c + b );
		
		if (a == b) System.out.println(ok);
		else System.out.println(nonOk);
		
		if (a.equals(b)) System.out.println(same);
		
		System.out.println(ok.length());
		System.out.println(nonOk.length());
		System.out.println(same.length());
		
		char s1 = ok.charAt(ok.length() - 1  );
		System.out.println(s1);

		for (int i = 0; i < same.length(); i++) {
			System.out.println(same.charAt(i));
		}

		char[] stringaArray = same.toCharArray();
		
		System.out.println(stringaArray);
		
		for (int i = 0; i < stringaArray.length; i++) {
			System.out.println(stringaArray[i]);
		}
		
		
		
	}

}



===== FILE: 021_Stringhe1.java =====
package esempi.week3.stringhe;

/**
 * Created by mauro on 15/06/16.
 */
public class Stringhe1 {

    public static void main(String[] args) {

    String s1 = "Questa è una stringa!";
        System.out.println(s1);

    String s2 = new String("Ma anche questa è una stringa!!");
        System.out.println(s2);

    String s3 = "Aula: ";
        String s4 = "1B";

    String s5 = s3 + s4;
        System.out.println(s5);

    char[] caratteri = { 'c','i','a','o' };
        String s6 = new String(caratteri);
        System.out.println(s6);

    char[] caratteri2 = s6.toCharArray();
        for(char c : caratteri2){
            System.out.println(c);
        }


    }


}



===== FILE: 022_Stringhe2.java =====
package esempi.week3.stringhe;

import java.text.NumberFormat;

/**
 * Created by mauro on 15/06/16.
 */
public class Stringhe2 {

    public static void main(String[] args) {

        int valoreInt = 112;
        String fromInt = Integer.toString(valoreInt);

        System.out.println(fromInt);

        boolean vero = true;
        String fromBool = Boolean.toString(vero);
        System.out.println(fromBool);

        long valoreLong = 10_000_000;
        NumberFormat numFormatt = NumberFormat.getNumberInstance();

        String numeroFormattato = numFormatt.format(valoreLong);

        System.out.println(numeroFormattato);





    }

}



===== FILE: 023_Stringhe3.java =====
package esempi.week3;

public class Stringhe3 {

	public static void main(String[] args) {
		
		//dichiaro l'oggetto stringa e lo istanzio
		String s1 = "Questa è una stringa!";
		System.out.println(s1);
		System.out.println("La stringa è lunga: " + s1.length());
		String s1bis = s1;
		//dichiaro l'oggetto stringa e lo istanzio con l'operatore new
		//questa è una particolarità dell'oggetto String
		String s2 = new String("Anche questa è una stringa con pari dignità :) ");
		System.out.println(s2);
		System.out.println("La stringa è lunga: " + s2.length());

	    String s3 = "Aula: ";
	    String s4 = "1F";

	    String s5 = s3 + s4;
	    System.out.println(s5);	
	    
	    //la stringa ammette come parametro anche gli array di char
	    char[] caratteri = { 'c', 'i', 'a', 'o'  };
	    String s6 = new String(caratteri);
	    //String s7 = caratteri;
	    
	    char[] caratteri2 = s2.toCharArray();
	    for (int i = 0; i < caratteri2.length; i++) {
			System.out.println(caratteri2[i]);
		}
		
	    //esercizio 1 identifica il carattere spazio bianco nell'array precedente e con un'istruzione if non stampare la riga a video
	    for (int i = 0; i < caratteri2.length; i++) {
	    	if (caratteri2[i] != ' ')
			System.out.println(caratteri2[i]);
		}
		
		
	    
	    //esercizio due stampa l'array di caratteri in ordine inverso, in orizzontale e successivamente in verticale
	    for (int i = caratteri2.length-1; i >= 0; i--) {
			System.out.print(caratteri2[i]);
		}

	
	    for (int i = caratteri2.length-1; i >= 0; i--) {
	    	System.out.println(caratteri2[i]);
	    }
	    
	    
	
	}

}



===== FILE: 024_Stringhe4.java =====
package esempi.week3;

public class Stringhe4 {

	public static void main(String[] args) {
	
		/*
		System.out.println(   Math.PI           );
		System.out.println(   Math.E            );
		*/

		String s = "abcdefghilmnopqrstuvz";
	    
	    char[] caratteri2 = s.toCharArray();
	    
	    String s1 ="Ciao Mondo";
	    String s2 ="      Ciao        ";
	    String s3 = s2 + "mondo";
	    
	    
	    if (s1.equalsIgnoreCase(s3)){
	    		System.out.println("Le stringhe sono uguali");
	    } else {
	    		System.out.println("Le stringhe sono diverse");
	    }

	    System.out.println(s1.toUpperCase());
	    System.out.println(s.length());
	    
	    if (s.indexOf("z") > -1)
	    System.out.println(  "La sottostringa è presente posizione: " +  s.indexOf("z"));
	    
	    System.out.println(  s1.indexOf("o")  );
	    System.out.println(  s1.indexOf("o", 4)  );
	    System.out.println(  s1.lastIndexOf("o")  );
	    
	    System.out.println(s1.replace('o', 'i'));
	    System.out.println(s2.trim());
	    System.out.println(s2);
	    
	    
	    int temp = s.indexOf("m");
	    System.out.println(s.substring(temp));
	    System.out.println(s.substring(temp, temp + 15));

	    
	    
	  /*  
	    //ciclo di 100 righe
	    for (int i = 0; i < 100; i++) {
	    		
	    		//ciclo interno per la parola (la singola riga)
	    		for (int j = 0; j < 6; j++) {
	    			
	    			int posCarattere =   (int)   (      Math.random() * s.length() );
	    				
					System.out.print( caratteri2[posCarattere]  );
				}
	    	
			System.out.println();
		}		
		
		*/
		
		
		for (int i = 0; i < 100; i++) {
			int lancio =   (int)   (      Math.random() * 6 ) + 1;
			//System.out.println( "Lancio n. " + i +  ": " +  lancio  );
		}
		
		
		
		
		

	}

}



===== FILE: 027_StringParsing.java =====
package esempi.week3.stringhe;

/**
 * Created by mauro on 15/06/16.
 */
public class StringParsing {

    public static void main(String[] args) {

        String s1 = "Benvenuti al corso Java";
        System.out.println("lunghezza della stringa: " + s1.length());

        int pos = s1.indexOf("Java");
        System.out.println("La posizione della parola è: " + pos);

        String sub = s1.substring(13);
        System.out.println(sub);

        String s2="Benvenuti al corso Java!           ";
        System.out.println("Lunghezza della stringa:"+s2.length());

        String s3 = s2.trim();
        System.out.println(s3);
        System.out.println(s3.length());





    }



}



===== FILE: 028_TestStringhe.java =====
package esempi.week3.stringhe;

/* 
   Questo programma analizza l'utilizzo di alcune funzioni 
   definite per le stringhe.
*/

public class TestStringhe {

    public static void main(String[] a) {

	String messaggio; // la stringa che conterra' il messaggio.

	// scrivo un messaggio (il codice Unicode \u00e8 corrisponde
	// alla lettera "e con accento grave").
	messaggio = "questo \u00e8 il messaggio da analizzare";

	int lunghezzaMessaggio = messaggio.length();

	char primaLettera = messaggio.charAt(0);

	char ultimaLettera = messaggio.charAt(lunghezzaMessaggio - 1);

	String prime5Lettere = messaggio.substring(0,5);

	System.out.println();
	System.out.println("Il messaggio considerato e': \n" 
			   + messaggio);
	System.out.println();
	System.out.println("esso e' composto da " + lunghezzaMessaggio
			   + " caratteri");
	System.out.println("Il primo carattere e': \"" + primaLettera
			   + "\", l'ultimo carattere e': \"" 
			   + ultimaLettera + "\"");

	System.out.println("La sottostringa dei primi 5 caratteri e': \""
			   + prime5Lettere + "\".");

	System.out.println();
	System.out.println("Il messaggio puo' essere convertito " 
			   + "tutto in lettere maiuscole: ");

	String messaggioMaiuscolo;  // si noti che una nuova variabile 
	                            // puo' essere dichiarata in un qq
	                            // punto del programma.

	messaggioMaiuscolo = messaggio.toUpperCase();

	System.out.println(messaggioMaiuscolo);


    }

} // fine classe TestStringhe



===== FILE: 031_StringheCompara.java =====
package esempi.week3.stringhe;

/**
 * Created by mauro on 15/06/16.
 */
public class StringheCompara {

    public static void main(String[] args) {
        String s1 = "Ciao";
        String s2 = "Ciao";

        if (s1 == s2){
            System.out.println("stringhe uguali");
        }
        else{
            System.out.println("stringhe diverse");
        }

        String s3 = "ciao";
        if (s1 == s3){
            System.out.println("stringhe uguali");
        }
        else{
            System.out.println("stringhe diverse");
        }

        String p1 = "Hello ";
        String p2 = "World";
        String s4 = p1 + p2;
        String s5 = "Hello World";
        if (s4.equalsIgnoreCase(s5)){
            System.out.println("stringhe uguali");
        }
        else{
            System.out.println("stringhe diverse");
        }

        if (s4 == s5){
            System.out.println("stringhe uguali");
        }
        else{
            System.out.println("stringhe diverse");
        }



    }




}



===== FILE: E01_Stringhe.java =====
package p001;

public class E01_Stringhe {

	public static void main(String[] args) {

		String a = new String ("Ciao");
		String b = a;
		String c = " ";
		String ok = "a e b sono uguali";
		String nonOk = "a e b sono diversi";
		String same = "a e b contengono lo stesso testo";
		
		System.out.println( a + c + b );
		
		if (a == b) System.out.println(ok);
		else System.out.println(nonOk);
		
		if (a.equals(b)) System.out.println(same);
		
		System.out.println(ok.length());
		System.out.println(nonOk.length());
		System.out.println(same.length());
		
		char s1 = ok.charAt(ok.length() - 1  );
		System.out.println(s1);

		for (int i = 0; i < same.length(); i++) {
			System.out.println(same.charAt(i));
		}

		char[] stringaArray = same.toCharArray();
		
		System.out.println(stringaArray);
		
		for (int i = 0; i < stringaArray.length; i++) {
			System.out.println(stringaArray[i]);
		}
		
		
		
	}

}



===== FILE: E02_Stringhe1.java =====
package w02.stringhe;

/**
 * Created by mauro on 15/06/16.
 */
public class E02_Stringhe1 {

    public static void main(String[] args) {

    String s1 = "Questa è una stringa!";
        System.out.println(s1);

    String s2 = new String("Ma anche questa è una stringa!!");
        System.out.println(s2);

    String s3 = "Aula: ";
        String s4 = "1B";

    String s5 = s3 + s4;
        System.out.println(s5);

    char[] caratteri = { 'c','i','a','o' };
        String s6 = new String(caratteri);
        System.out.println(s6);

    char[] caratteri2 = s6.toCharArray();
        for(char c : caratteri2){
            System.out.println(c);
        }


    }


}



===== FILE: E03_Stringhe1.java =====
package settimana03;

public class E03_Stringhe1 {

	public static void main(String[] args) {
		
		//sintassi short per la dichiarazione di stringa
		String nome = "Mauro";
		
		//sintassi che invoca il costruttore di stringa
		String cognome = new String("Bogliaccino");
		
		String separatore =  " ";
		
		//concatenare
		String firma = nome + separatore + cognome;
		
		int lunghezzaStringa =  firma.length(); //vale 17
		
		System.out.println(firma.toUpperCase());
		
		
		String test = "Mauro Bogliaccino";
		
		System.out.println(firma);
		System.out.println(test);
		//verifica ==
		if (firma == test) System.out.println("nome e test sono uguali");
		else  System.out.println("nome e test sono diversi");
		
		//verificare uguaglianza tra valori di oggetti stringa
		if (firma.equals(test)) System.out.println("nome e test sono uguali");
		else  System.out.println("nome e test sono diversi");
				
		
		
		
		for (int i = 0; i < lunghezzaStringa; i++) {
			System.out.print(firma.charAt(i)  + "\t"   );
			
		}
		
		System.out.println(     firma.replace('o', 'i')             );
		
		char[] stringa = { 'p', 'a', 'u', 's', 'a'   };
		
		String s = new String(stringa);
		System.out.println(s);
		

	}

}



===== FILE: E04_ConversioneFormattazione.java =====
package w02.stringhe;

import java.text.NumberFormat;

/**
 * Created by mauro on 15/06/16.
 */
public class E04_ConversioneFormattazione {

    public static void main(String[] args) {

        int valoreInt = 112;
        String fromInt = Integer.toString(valoreInt);

        System.out.println(fromInt);

        boolean vero = true;
        String fromBool = Boolean.toString(vero);
        System.out.println(fromBool);

        long valoreLong = 10_000_000;
        NumberFormat numFormatt = NumberFormat.getNumberInstance();

        String numeroFormattato = numFormatt.format(valoreLong);

        System.out.println(numeroFormattato);





    }

}



===== FILE: IndexOf1.java =====

public class IndexOf1
{
   public static void main( String[] args )
   {
      String s;

      int i;

      //   0123456789012345678901
      s = "Hello World, Bye World";

      i = s.indexOf( "World" );

      System.out.println( " 0123456789012345678901");
      System.out.println( "\"" + s + "\"" 
		+ ".indexOf( \"World\" ) = "  + i );

      i = s.indexOf( "By" );

      System.out.println( " 0123456789012345678901");
      System.out.println( "\"" + s + "\"" 
		+ ".indexOf( \"By\" ) = "  + i );

      i = s.indexOf( "by" );

      System.out.println( " 0123456789012345678901");
      System.out.println( "\"" + s + "\"" 
		+ ".indexOf( \"by\" ) = "  + i );

      /* ================================================= */

      i = s.lastIndexOf( "World" );

      System.out.println( " 0123456789012345678901");
      System.out.println( "\"" + s + "\"" 
		+ ".lastIndexOf( \"World\" ) = "  + i );

   }
}



===== FILE: ProvaHashEquals.java =====
import java.util.*;

public class ProvaHashEquals {
	public static void main(String[] args){
		String s1="Ciao";
		String s2="Ci"+"ao";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1.equals(s2))
			System.out.println("Le due stringhe sono uguali.");
		else
			System.out.println("Le due stringhe sono diverse.");
		
	}
}



===== FILE: ProvaHashIf.java =====
import java.util.*;

public class ProvaHashIf {
	public static void main(String[] args){
		String s1="Ciao";
		String s2="Ci"+"ao";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1.hashCode()==s2.hashCode())
			System.out.println("Le due stringhe sono uguali.");
		else
			System.out.println("Le due stringhe sono diverse.");		
	}
}



===== FILE: Replace1.java =====

public class Replace1
{
   public static void main( String[] args )
   {
      String s, r;

      s = "Hello World, Bye World";
      r = s.replaceFirst( "World", "Class" );

      System.out.println( "\"" + s + "\"" 
		+ ".replaceFirst( \"World\", \"Class\" ) = "  + 
		"\"" + r + "\"" );
      System.out.println( "Afterwards: s = " + "\"" + s + "\"\n\n" );

      /* ================================================== */

      r = s.replaceAll( "World", "Class" );

      System.out.println( "\"" + s + "\"" 
		+ ".replaceAll( \"World\", \"Class\" ) = "  + 
		"\"" + r + "\"" );
      System.out.println( "Afterwards: s = " + "\"" + s + "\"" );

   }
}



===== FILE: StringComp1.java =====

public class StringComp1
{
   public static void main( String[] args )
   {

      System.out.println(" \"abc\".compareTo( \"abc\" ) = " 
					+ "abc".compareTo( "abc" ) );

      System.out.println(" \"abc\".compareTo( \"xyz\" ) = " 
					+ "abc".compareTo( "xyz" ) );

      System.out.println(" \"abc\".compareTo( \"ABC\" ) = " 
					+ "abc".compareTo( "ABC" ) );
   }
}



===== FILE: StringComp2.java =====

public class StringComp2
{
   public static void main( String[] args )
   {

      System.out.println(" \"abc\".compareToIgnoreCase( \"abc\" ) = " 
					+ "abc".compareToIgnoreCase( "abc" ) );

      System.out.println(" \"abc\".compareToIgnoreCase( \"xyz\" ) = " 
					+ "abc".compareToIgnoreCase( "xyz" ) );

      System.out.println(" \"abc\".compareToIgnoreCase( \"ABC\" ) = " 
					+ "abc".compareToIgnoreCase( "ABC" ) );
   }
}



===== FILE: StringEq1.java =====

public class StringEq1
{
   public static void main( String[] args )
   {
      String a, b, c;

      a = "Hello";
      a = a + " World";

      b = a;               // b points to the same string as a

      System.out.println("a = " + a);
      System.out.println("b = " + b);

      if ( a == b )
         System.out.println("a == b");
      else
         System.out.println("a != b");


      c = "Hello World";    // c contains the same string as a
			    // but does not point to the same string

      System.out.println("a = " + a);
      System.out.println("c = " + c);

      if ( a == c )
         System.out.println("a == c");
      else
         System.out.println("a != c");

   }
}



===== FILE: StringEq2.java =====

public class StringEq2
{
   public static void main( String[] args )
   {
      String a, b, c;

      a = "Hello";
      a = a + " World";

      b = a;               // b points to the same string as a

      System.out.println("a = " + a);
      System.out.println("b = " + b);

      if ( a.equals(b) )
         System.out.println("a EQUALS b");
      else
         System.out.println("a NOT EQUALS b");


      c = "Hello World";    // c contains the same string as a
			    // but does not point to the same string

      System.out.println("a = " + a);
      System.out.println("c = " + c);

      if ( a.equals(c) )
         System.out.println("a EQUALS c");
      else
         System.out.println("a NOT EQUALS c");

   }
}



===== FILE: StringEq3.java =====

public class StringEq3
{
   public static void main( String[] args )
   {

      System.out.println( " \"abc\".equals( \"ABC\" ) = " 
					+ "abc".equals( "ABC" ) ) ;
      System.out.println( " \"abc\".equalsIgnoreCase( \"ABC\" ) = " 
					+ "abc".equalsIgnoreCase( "ABC" ) ) ;

   }
}



===== FILE: StringheCompara.java =====
package w02.stringhe;

/**
 * Created by mauro on 15/06/16.
 */
public class StringheCompara {

    public static void main(String[] args) {
        String s1 = "Ciao";
        String s2 = "Ciao";

        if (s1 == s2){
            System.out.println("stringhe uguali");
        }
        else{
            System.out.println("stringhe diverse");
        }

        String s3 = "ciao";
        if (s1 == s3){
            System.out.println("stringhe uguali");
        }
        else{
            System.out.println("stringhe diverse");
        }

        String p1 = "Hello ";
        String p2 = "World";
        String s4 = p1 + p2;
        String s5 = "Hello World";
        if (s4.equalsIgnoreCase(s5)){
            System.out.println("stringhe uguali");
        }
        else{
            System.out.println("stringhe diverse");
        }

        if (s4 == s5){
            System.out.println("stringhe uguali");
        }
        else{
            System.out.println("stringhe diverse");
        }



    }




}



===== FILE: StringJoin.java =====
package com.example.java8;

public class StringJoin {

	public static void main(String[] args) {

		String nani = String.join(" e ", "Pisolo", "Mammolo", "Gongolo");
		System.out.println(nani);
		
		String[] stati = {"Italia", "Spagna", "Portogallo"};
		String statiUniti = String.join(",", stati);
		System.out.println(statiUniti);
		
	}		
}



===== FILE: StringParsing.java =====
package w02.stringhe;

/**
 * Created by mauro on 15/06/16.
 */
public class StringParsing {

    public static void main(String[] args) {

        String s1 = "Benvenuti al corso Java";
        System.out.println("lunghezza della stringa: " + s1.length());

        int pos = s1.indexOf("Java");
        System.out.println("La posizione della parola è: " + pos);

        String sub = s1.substring(13);
        System.out.println(sub);

        String s2="       Benvenuti al corso Java!           ";
        System.out.println("Lunghezza della stringa:"+s2.length());

        String s3 = s2.trim();
        System.out.println(s3);
        System.out.println(s3.length());





    }



}



===== FILE: Test.java =====
public class Test {
	
	public static void main(String[] args){
		// Creo un oggetto di tipo String
		String miaStringa = "Ciao";
		// Richiamo il metodo charAt() per sapere
		// quale carattere apre la stringa.
		char primo = miaStringa.charAt(0);
		System.out.println(primo);
		// Voglio recuperare una sottostringa
		// formata dai primi tre caratteri della
		// stringa contenuta nell'oggetto
		// miaStringa
		String sottoStringa = miaStringa.substring(0,3);
		System.out.println(sottoStringa);
		// Voglio sapere l'indice associato al
		// carattere "i" presente in miaStringa
		int indice = miaStringa.indexOf("i");
		System.out.println(indice);
	}
}


===== FILE: TestStringhe.java =====
/* 
   Questo programma analizza l'utilizzo di alcune funzioni 
   definite per le stringhe.
*/

public class TestStringhe {

    public static void main(String[] a) {

	String messaggio; // la stringa che conterra' il messaggio.

	// scrivo un messaggio (il codice Unicode \u00e8 corrisponde
	// alla lettera "e con accento grave").
	messaggio = "questo \u00e8 il messaggio da analizzare";

	int lunghezzaMessaggio = messaggio.length();

	char primaLettera = messaggio.charAt(0);

	char ultimaLettera = messaggio.charAt(lunghezzaMessaggio - 1);

	String prime5Lettere = messaggio.substring(0,5);

	System.out.println();
	System.out.println("Il messaggio considerato e': \n" 
			   + messaggio);
	System.out.println();
	System.out.println("esso e' composto da " + lunghezzaMessaggio
			   + " caratteri");
	System.out.println("Il primo carattere e': \"" + primaLettera
			   + "\", l'ultimo carattere e': \"" 
			   + ultimaLettera + "\"");

	System.out.println("La sottostringa dei primi 5 caratteri e': \""
			   + prime5Lettere + "\".");

	System.out.println();
	System.out.println("Il messaggio puo' essere convertito " 
			   + "tutto in lettere maiuscole: ");

	String messaggioMaiuscolo;  // si noti che una nuova variabile 
	                            // puo' essere dichiarata in un qq
	                            // punto del programma.

	messaggioMaiuscolo = messaggio.toUpperCase();

	System.out.println(messaggioMaiuscolo);


    }

} // fine classe TestStringhe



===== FILE: unione_sorgenti.java =====



