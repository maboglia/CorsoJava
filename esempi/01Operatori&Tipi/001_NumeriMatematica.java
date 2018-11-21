public class CalcolaPotenze {
    /*
      Dato un numero intero n, questo programma calcola un numero
      m tale che 2^m divide n e 2^(m+1) non divide n, cioe' calcola
      la massima potenza di 2 che divide n.
    */

    public static void main(String[] args) {

	int n = 2048;  // il numero da trattare

	int k = n;  // inizializzo k con il valore di n.

	int m = 0;  // inizializzo m

	while (k % 2 == 0) {
	    k /= 2;
	    m++;
	}
	System.out.println("La massima potenza di 2 che divide " + n +
			   " e': 2^" + m);

    }  // fine metodo main

} // fine classe CalcolaPotenze
public class CercaNumero {

    /* 
       Questo programma definisce un numero a caso tra 1 e 10000 finche' 
       tale numero non risulta il numero 5. Dopo di che stampa il numero
       di tentativi che sono stati necessari per trovarlo.
    */

    public static void main(String[] a) {

	int maxNum = 10000; // il massimo valore del numero casuale.

	int numeroCasuale;
	int bersaglio = 5;
	int tentativi = 0;  // conta i tentativi fatti nella ricerca.
	while (true) {
	    numeroCasuale = (int)(Math.random() * maxNum + 1);
	    tentativi++;
	    if (numeroCasuale == bersaglio)
		break;
	}

	System.out.println("Per trovare il numero " + bersaglio + 
			   " sono stati fatti " + tentativi + " tentativi");


    } // fine metodo main

} // fine classe CercaNumero
/*****************************************************************
 *                       Divisione con resto                     *
 *****************************************************************/
	import system.IO;

class divisioneConResto
{

	public static void main (String [] args)
		{
		int dividendo, divisore, quoziente, resto, contatore;

		IO.out.println("            DIVISIONE CON RESTO");
		IO.out.println("");

		IO.out.print("Introduci il dividendo: ");
		dividendo = IO.in.readInt();
		IO.out.print("Introduci il divisore: ");
		divisore = IO.in.readInt();

		contatore = 0;
		quoziente = dividendo;

		while (dividendo >= divisore)
 			{
			quoziente = dividendo - divisore;
			dividendo = quoziente;
			contatore++;
			}

		resto = quoziente;
		quoziente = contatore;

		IO.out.println("Quoziente = " +quoziente);
		IO.out.println("Resto = " +resto);
		}
}		import system.IO;
		import java.lang.Math;

class equazioneIgrado
{

	public static void main (String [] args)
		{
		double a,b,x;			// Dichiarazione delle variabili

		IO.out.println ("	    EQUAZIONI DI I GRADO  ax + b = 0");
		IO.out.println ("=======================================================");
		IO.out.println ("");

		IO.out.print ("a = ");
		a = IO.in.readDouble();

		IO.out.print("b = ");
		b = IO.in.readDouble();

		if (a == 0)
			{
			if (b == 0) 
				IO.out.println("Equazione indeterminata");
			else  	
				IO.out.println("Equazione impossibile");
			}
		else
			{
			x = -b/a;
			IO.out.println("Equazione determinata");
			IO.out.println("x = " +x);
			}
		}
}		import system.IO;
		import java.lang.Math;

class equazioneIIgrado
{

	public static void main (String [] args)
		{
		double a, b, c, delta, x1, x2;			// Dichiarazione delle variabili

		IO.out.println ("	EQUAZIONI DI II GRADO  ax^2 + bx + c = 0");
		IO.out.println ("=======================================================");
		IO.out.println ("");

		IO.out.print ("a = ");
		a = IO.in.readDouble();

		while (a == 0)
			{
			IO.out.print("a deve essere diverso da ZERO !!!");
			a = IO.in.readDouble();
			}

		IO.out.print("b = ");
		b = IO.in.readDouble();

		IO.out.print("c = ");
		c = IO.in.readDouble();


		delta= b*b-4*a*c;

		if (delta == 0)
				{
				 x1 = -b/(2*a);
				IO.out.println("Due soluzioni reali e coincidenti  x1,x2 = " + x1);
				}
		else
				if (delta < 0)	IO.out.println("Nessuna soluzione reale");

				else
					{
					x1=(-b-Math.sqrt(delta))/(2*a);
					x2=(-b+Math.sqrt(delta))/(2*a);
					IO.out.print("Due soluzioni reali e distinte: ");
					IO.out.print("x1= " + x1);
					IO.out.println("  e  x2= " + x2);
					}

		}

}/*****************************************************************
 *                        Max fra 10 numeri                      *
 *****************************************************************/

import system.IO;

class max10n
{

	public static void main (String args[])
		{
		int A, B, max, contatore;

		System.out.println("                  MAX FRA 10 NUEMRI");
		System.out.println("");

		System.out.print("Introduci un numero: ");
    		A = IO.in.readInt();
    		max = A;

		for (contatore=1; contatore<=10; contatore++)
			{
			System.out.print("Introduci un numero: ");
			B = IO.in.readInt();
    		if (B > max)    max = B;

			}


		/* OUTPUT */

		System.out.println("");
		System.out.println("Il MAX e' "+max);
		}

}		import system.IO;

class max2nb
{

	public static void main (String args[])
		{
		int numero1, numero2, max;

		System.out.println("     MAX fra due numeri");
	    	System.out.println("");

		System.out.print("Introduci il primo numero: ");
		numero1 = IO.in.readInt();

		System.out.print("Introduci il secondo numero: ");
		numero2 = IO.in.readInt();

		if (numero1 == numero2)
			{
			System.out.println("");
			System.out.println("I due numeri sono uguali");
			}
		else
			{
			if (numero1<numero2)
					max=numero2;
			else
					max=numero1;
			System.out.println("");
			System.out.println("Il MAX e' "+max);
			}
		}

}		import system.IO;

class max2n
{

	public static void main (String args[])
		{
		int numero1, numero2, max;


	/* INPUT */

	System.out.println("     MAX fra due numeri");
	System.out.println("");

	System.out.print("Introduci il primo numero: ");
    numero1 = IO.in.readInt();
    System.out.println("");

	System.out.print("Introduci il secondo numero: ");
    numero2 = IO.in.readInt();


	/* ELABORAZIONE */

	if (numero1>numero2)
		max=numero1;				// trova il numero pi� piccolo fra numero1 e numero2
	else
		max=numero2;


	/* OUTPUT */

	System.out.println("");
	System.out.println("Il MAX e' "+max);


	}

}	import system.IO;

class mcdDivisioni
{

	public static void main (String args[])
		{

		int numero1, numero2, temporaneo;
		int mcd = 1;
		boolean trovato = false;


	/* INPUT */
	
		System.out.println("                                     M.C.D.");
		System.out.println("");

		System.out.print("Introduci il primo numero: ");
    		numero1 = IO.in.readInt();
		System.out.println("");

		System.out.print("Introduci il secondo numero: ");
    		numero2 = IO.in.readInt();


	/* ELABORAZIONE */

		while (numero1 != 0)
			{
			if (numero1 < numero2)
				{
				temporaneo = numero1; 		// scambia i numeri
				numero1    = numero2;
				numero2    = temporaneo;
				}
			numero1 = numero1 % numero2;		// resto della divisione fra numero1 e numero2
			}
		mcd = numero2;


	/* OUTPUT */

		System.out.println("");
		System.out.println("Il M.C.D. = "+mcd);

	}
}/*
  Questo programma sceglie a caso un numero intero compreso 
  tra 20 e 30 (estremi inclusi) e dice se e' pari o dispari
*/

public class NumeriPariDispari {
    public static void main(String[] arg) {
	int numeroIntero;
	numeroIntero = (int)(Math.random()*11 + 20);
	System.out.println("\nNumero scelto: " + numeroIntero + "."); 
	if (numeroIntero % 2 == 0) {
	    System.out.println();
	    System.out.println("Il numero e' pari\n");
	}
	else
	    System.out.println("Il numero e' dispari\n");
    }
}
import system.IO;

public class Potenza
{

	public static void main( String []args )
	{

	IO.out.print("a= ");
	int a=IO.in.readInt();

	IO.out.print("n= ");
	int n=IO.in.readInt();

	int potenza=1, contatore=n;
	while( contatore>0 )
		{
		potenza *=a;
		contatore--;
		}
	IO.out.println(a+"^"+n+"="+potenza);

		}//main

}
//Potenza
/*****************************************************************
 *         Prodotto di due numeri con la sola addizione    *
 *****************************************************************/

	import system.IO;

class prodottoAddizioni
{

	public static void main (String args[])
		{

		int numero1, numero2, contatore, prodotto;

	/* INPUT */

		System.out.println("                                     PRODOTTO");
		System.out.println("");

		System.out.print("Introduci il primo fattore: ");
    		numero1 = IO.in.readInt();
 	   	System.out.println("");

		System.out.print("Introduci il secondo fattore: ");
 	   	numero2 = IO.in.readInt();


	/* ELABORAZIONE */

		contatore = 0;
		prodotto = 0;

		while (contatore < numero2)
				{
				prodotto = prodotto + numero1;
				contatore++;
				}


	/* OUTPUT */

		System.out.println("");
		System.out.println("Il prodotto e' "+prodotto);

	}

}/*****************************************************************
 *             Scambia il contenuto di due variabili             *
 *****************************************************************/

import system.IO;

class scambia
{

	public static void main (String args[])
		{

		int A, B, temporaneo;


	/* INPUT */

		System.out.println("                  SCAMBIA DUE NUMERIM.C.D.");
		System.out.println("");

		System.out.print("Introduci A: ");
    		A = IO.in.readInt();
    		System.out.println("");

		System.out.print("Introduci B: ");
    		B = IO.in.readInt();


	/* ELABORAZIONE */

		temporaneo = A; 			// scambia i numeri
		A    = B;
		B    = temporaneo;


	/* OUTPUT */

		System.out.println("");
		System.out.println("A = "+A);
		System.out.println("B = "+B);

	}

}public class Sequenza {
    /* 
       Questo programma calcola la sequenza "3N+1" per un dato numero 
       N e stampa il numero di valori intermedi che sono stati calcolati
       prima di ottenere 1. La sequenza 3N+1 e' costruita a partire dal
       numero intero N nel seguente modo: se N e' pari, il numero successivo
       della sequenza e' N/2, altrimenti e' 3N+1. Il numero successivo 
       della sequenza e' calcolato analogamente. Sembra (ma non e' mai 
       stato dimostrato), che dopo un numero finito di passi si raggiunga 
       sempre il valore 1.
    */

    public static void main(String[] a) {

	int N = 1000;  // numero con cui cominciare la sequenza.
	int contaElementi = 0;  // accumula il numero di elementi 
	                        // della sequenza via via calcolati.

	System.out.println("Iniziamo la sequenza con il numero: " + N);

	while (N != 1) {

	    if (N % 2 == 0) 
		N /= 2;
	    else
		N = 3 * N + 1;
 
	    contaElementi++;

	    if (contaElementi % 10 == 0)
		System.out.println();

	    System.out.print(N + "  ");

	}
	System.out.println();
	System.out.println("sono stati calcolati " + contaElementi + 
			   " elementi della sequenza");

    } // fine metodo main.


} // fine class Sequenza
public class Tabella {

    /* 
       Questo programma stampa la tabellina pitagorica dei numeri da
       1 a 10. L'output e' costruito in modo da essere con un buon
       incolonnamento.
    */

    public static void main(String[] a) {

	for (int i = 1; i <= 10; i++) {
	    for (int j = 1; j <= 10; j++) {
		int prodotto = i*j;
		// se il prodotto e' di una sola cifra, lascio tre 
		// spazi bianchi prima del prodotto:
		if (prodotto < 10) 
		    System.out.print("   "); 
		// se il prodotto e' di due cifre, lascio 2 spazi bianchi:
		else if (prodotto < 100) 
		    System.out.print("  ");
		// altrimenti lascio un solo spazio bianco:
		else
		    System.out.print(" ");
		// scrivo infine il prodotto:
		System.out.print(i*j); 
	    }
	    System.out.println();
	}


    } // fine metodo main

} // fine classe Tabella
/*
  Questo programma trova tutte le soluzioni dell'equazione
  x^2 + y^2 = 4 z^2 con x, y, z interi compresi tra 1 e un 
  valore limite (NUM_MAX). Sono implementati 3 diversi metodi.
  Il primo metodo esegue tre cicli annidati (uno per la x, 
  uno per la y, uno per la z) e cerca se tra i valori trovati
  vi e' una soluzione. In questo modo l'istruzione if del 
  metodo1() viene eseguita NUM_MAX^3 volte. Il secondo metodo
  assegna a z un valore tra 1 e NUM_MAX, calcola tutti i 
  possibili valori di y e infine trova x come soluzione 
  di Math.sqrt(4z^2 - y^2). In questo modo il programma diventa
  estremamente piu' efficiente. 
  Le soluzioni trovate, sia nel caso del metodo1() sia nel caso
  del metodo2(), vengono via via accumulate in una stringa.
  Il terzo metodo di soluzione segue la stessa strada del metodo2()
  ma in piu' accumula le soluzioni in un oggetto di tipo StringBuffer.
  Un controllo dei tempi per vari valori di NUM_MAX permette di vedere
  le grandi differenze di prestazione dei 3 metodi.
  Al problema si potrebbe dare una 4a soluzione, basata sul fatto che
  si stanno cercando tutte le soluzioni razionali dell'equazione
  u^2 + v^2 = 1 (ove u = x/(2z) e v = y/(2z) e che, si puo' dimostrare,
  sono della forma: x = a^2 - b^2, y = 2ab, z = (a^2 + b^2)/2 (con a e 
  b interi). Questa soluzione qui non e' implementata, ma sarebbe
  di gran lunga piu' efficiente delle soluzioni proposte.
*/

public class Terne {

    private static final int NUM_MAX = 100;

    private static String soluzioni;  // stringa che accumula le soluz. trovate

    private static StringBuffer sol;  // oggetto che accumula le sol. trovate
                                      // (nel metodo3()).

    public static void main(String[] a) {

	// catturo l'istante in cui inizia il conto:
	long inizio = System.currentTimeMillis();  
	// viene eseguito uno dei tre metodi, in questo caso metoso1():
	metodo1();	

	// catturo l'istante in cui finisce il conto:
	long fine = System.currentTimeMillis();

	// stampo i risultati:
	System.out.println(soluzioni.length());
	// System.out.println(sol.length());
	System.out.println("Finito conto");

	// stampo il tempo di esecuzione:
	System.out.println("\nTempo: " 
			   + (double)(fine - inizio)/1000 + " sec");
	// System.out.println(soluzioni);
	// System.out.println(sol);
    }

    // i tre metodi per la soluzione del problema:

    private static void metodo1() {

	soluzioni = "";

	int contatore = 0;

	for (int x = 1; x <= NUM_MAX; x++) {
	    for (int y = 1; y <= NUM_MAX; y++) {
		for (int z = 1; z <= NUM_MAX; z++) {
		    if (x * x + y * y == 4 * z * z) {
			if (contatore == 5) {
			    contatore = 0;
			    soluzioni += "\n";
			}
			contatore++;
			soluzioni += "[" + x + ", " + y + ", " + z + "] ";
		    }
		}
	    }
	}
    }

    private static void metodo2() {

	soluzioni = "";

	int contatore = 0;

	for (int z = 1; z <= NUM_MAX; z++) {
	    for (int y = 1; y <= Math.min(2 * z, NUM_MAX); y++) {
		int x = (int)(Math.sqrt(4 * z * z - y * y));
		if (x > 0 && x <= NUM_MAX && x * x + y * y == 4 * z * z) {
		    if (contatore == 5) {
			contatore = 0;
			soluzioni += "\n";
		    }
		    contatore++;
		    soluzioni += "[" + x + ", " + y + ", " + z + "] ";
		}
	    }
	}
    }

    private static void metodo3() {

	sol = new StringBuffer("");

	int contatore = 0;

	for (int z = 1; z <= NUM_MAX; z++) {
	    for (int y = 1; y <= Math.min(2 * z, NUM_MAX); y++) {
		int x = (int)(Math.sqrt(4 * z * z - y * y));
		if (x > 0 && x <= NUM_MAX && x * x + y * y == 4 * z * z) {
		    if (contatore == 5) {
			contatore = 0;
			sol.append("\n");
		    }
		    contatore++;
		    sol.append("[" + x + ", " + y + ", " + z + "] ");
		}
	    }
	}
    }
}
/* 
   Questo programma sceglie 10000 coppie di numeri casuali tra 
   1 e 100000 e determina quante volte accade che il loro massimo 
   comun divisore (calcolato con l'algoritmo di Euclide) vale 1
   (cioe' determina quante volte i due numeri scelti sono primi
   tra loro). Calcola la frequenza di tale evento e la confronta
   con il numero 6/Pi^2 - Il teorema di Cesaro afferma che i due 
   numeri dovrebbero "coincidere".
*/

public class TestEuclide {

    public static void main(String[] arg) {
	int numMaxCoppie = 10000;
	int limiteNumeri = 100000;
	int contatore = 0;
	for (int i = 1; i <= numMaxCoppie; i++) {
	    // scelgo due numeri a caso:
	    int a1 = (int)(Math.random()*limiteNumeri + 1);
	    int a2 = (int)(Math.random()*limiteNumeri + 1);
	    // calcolo il loro max com div:
	    int mcd = mcd(a1, a2);
	    if (mcd == 1) 
		contatore++;
	}
	System.out.print("Su " + numMaxCoppie + " coppie di numeri casuali ");
	System.out.println("la frequenza che siano primi tra loro e':");
	System.out.println((double)contatore/numMaxCoppie);
	System.out.println("La probabilita' (secondo il teorema di Cesaro) e':");
	System.out.println(6/(Math.PI*Math.PI));


    }

    // Calcola il mcd di due interi positivi usando l'algoritmo
    // di Euclide

    public static int mcd(int a, int b) {
	int n1 = a; 
	int n2 = b;
	while (n2 != 0) {
	    if (n1 > n2)
		n1 -= n2;
	    else
		n2 -= n1;
	}
	return n1;
    }

}
/*
Questo programma calcola le potenze di un numero intero.
*/

public class TestNumeri1 {


    public static void main(String[] args) {

	int numeroBase;
	numeroBase = 1411;

	String spazio = "    "; // definisco uno spazio per l'impaginazione

	int quadrato, cubo, quartaPot, quintaPot, sestaPot;
	double sestaPotDouble;
	quadrato = numeroBase*numeroBase;
	cubo = quadrato*numeroBase;
	quartaPot = cubo*numeroBase;
	quintaPot = quartaPot*numeroBase;
	sestaPot = quintaPot*numeroBase;

	sestaPotDouble = Math.pow(numeroBase, 6);

	System.out.println();
	System.out.println(spazio + "numero base:    " + numeroBase);
	System.out.println(spazio + "quadrato:       " + quadrato);
	System.out.println(spazio + "cubo:           " + cubo);
	System.out.println(spazio + "quarta potenza: " + quartaPot);
	System.out.println(spazio + "quinta potenza: " + quintaPot);
	System.out.println(spazio + "sesta potenza:  " + sestaPot);

	System.out.println();

	System.out.println("Altro modo per calcolare la sesta potenza: " 
			   + "usando Math.pow(): " + 
			   + sestaPotDouble);
	System.out.println();

    }  // fine main


} // fine class TestNumeri1
/*
Questo programma calcola le potenze di un numero intero usando 
interi di tipo long.
*/

public class TestNumeri2 {


    public static void main(String[] args) {

	int numeroBase;
	numeroBase = 1234;

	String spazio = "    ";  // definisco uno spazio per l'impaginazione

	long quadrato, cubo, quartaPot, quintaPot, sestaPot;
	double sestaPotDouble;

	quadrato = numeroBase*numeroBase;
	cubo = quadrato*numeroBase;
	quartaPot = cubo*numeroBase;
	quintaPot = quartaPot*numeroBase;
	sestaPot = quintaPot*numeroBase;

	sestaPotDouble = Math.pow(numeroBase, 6);

	System.out.println();
	System.out.println(spazio + "numero base:    " + numeroBase);
	System.out.println(spazio + "quadrato:       " + quadrato);
	System.out.println(spazio + "cubo:           " + cubo);
	System.out.println(spazio + "quarta potenza: " + quartaPot);
	System.out.println(spazio + "quinta potenza: " + quintaPot);
	System.out.println(spazio + "sesta potenza:  " + sestaPot);

	System.out.println();

	System.out.println("Altro modo per calcolare la sesta potenza: " 
			   + "usando Math.pow(): \n" + 
			   + sestaPotDouble);
	System.out.println();




    }  // fine main


} // fine class TestNumeri2
/*****************************************************************
 *                        Max fra 100 numeri                     *
 *****************************************************************/

import system.IO;

class valoreAssoluto
{

	public static void main (String args[])
		{
		int A;

		System.out.println("                  VALORE ASSOLUTO");
		System.out.println("");

		System.out.print("Introduci A: ");
    		A = IO.in.readInt();

		if (A < 0)	
			A = -A;

		System.out.println("");
		System.out.println("|A| = "+A);

	}

}