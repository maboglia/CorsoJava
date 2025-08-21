===== FILE: 009_SimpleCalcolatrice.java =====
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



===== FILE: 015_MetodiAusiliari.java =====

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



===== FILE: E02_Calcolatrice.java =====
import java.util.Scanner;

public class E02_Calcolatrice {

    public static void main(String[] arguments) {

        Scanner mioScanner = new Scanner(System.in);

        System.out.println("Inserire due numeri interi ");

        int valore1 = mioScanner.nextInt();
        int valore2 = mioScanner.nextInt();

        int addizione = addizione(valore1, valore2);
        int sottrazione = sottrazione(valore1, valore2);
        int moltiplicazione = moltiplicazione(valore1, valore2);
        double divisione = divisione(valore1, valore2);

        System.out.println("---------------------------------");
        System.out.println("Dati i valori inseriti: ");
        System.out.print(valore1);
        System.out.print (" e ");
        System.out.print(valore2);
        System.out.println("---------------------------------");
        System.out.println(addizione);
        System.out.println("L'addizione  è = " + addizione);
        System.out.println("---------------------------------");
        System.out.println("la  sottrazione è: ");
        System.out.println(sottrazione);
        System.out.println("---------------------------------");
        System.out.println("il prodotto è: ");
        System.out.println(moltiplicazione);
        System.out.println("---------------------------------");
        System.out.println("il quoziente è: ");
        System.out.println(divisione);
        System.out.println("---------------------------------");

    }

    private static double divisione(int valore1, int valore2) {

        return (double) valore1 / (double) valore2;

    }

    private static int moltiplicazione(int valore1, int valore2) {

        return valore1 * valore2;
    }

    private static int sottrazione(int valore1, int valore2) {

        int sottrazione = valore1 - valore2;
        return sottrazione;

    }

    //metodo
    private static int addizione(int val1, int val2) {

       return val1 + val2;

    }
	
}



===== FILE: E04_GetInput.java =====
import java.util.Scanner;

public class E04_GetInput {

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



===== FILE: E10_Overloading.java =====
/* Nel seguente programma si fa uso del
   sovraccarico dei metodi (methods
   overloading) */
class Overloading {

  static int quarta (int x) {
    return x * x * x * x;
  }

  static double quarta (double x) {
    return x * x * x * x;
  }

  public static void main (String[] args) {
    int a = 3; 
    double b = 3.7;
    System.out.println(quarta(a));
    System.out.println(quarta(b));
  }
}


===== FILE: EsercizioScope1.java =====
class EsercizioScope1 {

  static int x, y;

  static int metodo1(int x) {
    x = 1;
    y = 1;
    System.out.println("metodo1 " + x + " " + y);
    return x + y;
  }

  static void metodo2() {
    int y;
    x = 2; 
    y = metodo1(x);
    System.out.println("metodo2 " + x + " " + y);
  }

  public static void main (String[] args) {
    x = 0;
    y = 0;
    metodo2();
    System.out.println("main " + x + " " + y);
  }
}


===== FILE: EsercizioScope2.java =====
class EsercizioScope2 {

  static int x, y;

  static int metodo1(int x) {
    y = ++x;
    System.out.println("metodo1 " + x + " " + y);
    return x + y;
  }

  static void metodo2() {
    int y = 2;
    y = metodo1(y);
    x = y++; 
    System.out.println("metodo2 " + x + " " + y);
  }

  public static void main (String[] args) {
    x = 0;
    y = 0;
    metodo2();
    System.out.println("main " + x + " " + y);
  }
}



===== FILE: EsercizioScope3.java =====
class EsercizioScope3 {
  static int a = 10, b = 15;
  public static void m1 (int a) {
    int i = 4;
    System.out.println(a + i + b);
    m2(a);
  }
  public static void m2 (int b) {
    System.out.println(a + b);
  }
  public static void main (String args[]) {
    int i = 1;
    m1(i);
    i = i + 1;
    a = 0;
    m2(i);
  } 
}



===== FILE: FrazionariOrdinati.java =====
import java.util.Scanner;

public class FrazionariOrdinati {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci tre numeri frazionari");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		if (ordinati(n1,n2,n3))
			System.out.println("Frazionari ordinati");
		else
			System.out.println("Frazionari non ordinati");
		
	}
	
	private static boolean ordinati(double x, double y, double z) {
		return ((x<=y)&&(y<=z)||(x>=y)&&(y>=z));
	}
	
}



===== FILE: InizialiUguali.java =====
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



===== FILE: MetodiAusiliari.java =====
package metodi;

public class MetodiAusiliari {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 3;
		
		int addizione = somma(a, b);
		
		System.out.println("Addizione :" +  addizione);
		

	}
	
	private static int somma(int x, int y) {
		return x + y;
	}
	

}



===== FILE: ScannerStaticoPersonalizzato.java =====
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

} 


===== FILE: ScegliCarta.java =====
/*
  Questo programma sceglie una carta da gioco a caso e stampa la 
  carta scelta.
*/
public class ScegliCarta {

    public static void main(String[] arg) {
	// scelgo il valore di una carta:
	int val = scegliValoreCarta();

	// scelgo il seme della carta:
	int sm = scegliSemeCarta();

	// stampo la carta scelta
	stampaCarta(val, sm);
    }

    // questo metodo sceglie il valore di una carta da gioco
    // (un intero tra 1 e 13)

    public static int scegliValoreCarta() {
	int valore = (int)(Math.random()*12 + 1);
	return valore;
    }

    // questo metodo sceglie il seme di una carta da gioco
    // (un intero tra 0 e 3, con la convenzione che
    // 0 = cuori, 1 = quadri, 2 = fiori, 3 = picche)

    public static int scegliSemeCarta() {
	int sm = (int)(Math.random()*4);
	return sm;
    }

    // questo metodo si occupa di stampare una carta di un 
    // mazzo. In input deve ricevere il valore della carta
    // e il seme.

    public static void stampaCarta(int valore, int seme) {
	System.out.println();
	System.out.println("\t **********");
	System.out.println("\t*          *");
	if (valore == 1) 
	    System.out.println("\t*   asso   *");
	else if (valore == 11)
	    System.out.println("\t*   fante  *");
	else if (valore == 12) 
	    System.out.println("\t*  regina  *");
	else if (valore == 13) 
	    System.out.println("\t*    re    *");
	else if (valore == 10)
	    System.out.println("\t*    10    *");
	else 
	    System.out.println("\t*    " + valore + "     *");
	System.out.println("\t*          *");
	System.out.println("\t*    di    *");
	System.out.println("\t*          *");
	System.out.println("\t*          *");
	if (seme == 0)
	    System.out.println("\t*  cuori   *");
	else if (seme == 1)
	    System.out.println("\t*  quadri  *");
	else if (seme == 2) 
	    System.out.println("\t*  fiori   *");
	else 
	    System.out.println("\t*  picche  *");
	System.out.println("\t*          *");
 	System.out.println("\t ********** ");
	System.out.println();


    }

}






===== FILE: unione_sorgenti.java =====



