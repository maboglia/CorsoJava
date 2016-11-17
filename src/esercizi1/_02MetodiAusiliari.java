/*
 * 4 Esercizi su metodi ausiliari
Esercizio 4.1: Scrivere un programma Ripeti che chiede all’utente di inserire una stringa e un numero
intero positivo. Entrambe le cose dovranno essere passate a un metodo ausiliario che stamperà tante
copie della stringa quante indicate nel numero inserito dall’utente. Se il numero inserito dall’utente è
negativo il metodo ausiliario stamperà "ERRORE: numero negativo". Il nome del metodo ausiliario può
essere scelto a piacere.

Esercizio 4.2: Scrivere un programma "TuttiUguali" che chiede all’utente di inserire tre numeri e
stampa "Tutti uguali!" se i tre numeri sono tutti uguali, e altrimenti stampa "Almeno uno e’ diverso".
Il controllo che i tre numeri siano uguali dovrà essere fatto da un metodo ausiliario, mentre il messaggio
dovrà essere stampato dal metodo main. Il nome del metodo ausiliario può essere scelto a piacere.

Esercizio 4.3: Scrivere un programma MezziCasuali che stampa un numero frazionario ottenuto
come risultato della chiamata di un metodo ausiliario che al suo interno richiama il metodo di libre-
ria Math.random(). Se il risultato di Math.random() è minore di 0.5 il metodo lo restituisce cosı̀ com’è.
Se invece il risultato di Math.random() è maggiore o uguale a 0.5 il metodo lo restituisce diminuito di
0.5. Il nome del metodo ausiliario può essere scelto a piacere.

Esercizio 4.4: Scrivere un programma Concatena che chiede all’utente di inserire tre singole parole e
le ristampa interponendovi un asterisco. Per esempio, se l’utente inserisce "gatto", "cane" e "topo" il
programma stamperà gatto*cane*topo. La concatenazione delle tre parole dovrà essere fatta utilizzando
un metodo ausiliario che prende due stringhe e restituisce la stringa ottenuta concatenando la prima
parola ricevuta, un asterisco e la seconda parola ricevuta.
 * 
 * 
 * */
package esercizi1;

import java.util.Scanner;

public class _02MetodiAusiliari {

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
		 * Scanner input = new Scanner ( System . in );
			System . out . println ( " Inserisci tre parole : " );
			String s1 = input . next ();
			String s2 = input . next ();
			String s3 = input . next ();
			String ris = concatena ( concatena ( s1 , s2 ) , s3 );
			System . out . println ( ris );
		 * 
		 * */
		
		}
		private static void ripetitore ( String str , int num ) {
		if ( num <0) System . out . println ( " ERRORE : numero negativo " );
		else
		for ( int i =0; i < num ; i ++)
		System . out . println ( str );
		}
		private static boolean uguali ( int x , int y , int z ) {
			return ( x == y && y == z );
			}
		private static double genera () {
			double r = Math . random ();
			if (r >=0.5) r -=0.5;
			return r ;
			}
		private static String concatena ( String str1 , String str2 ) {
			return str1 + " * " + str2 ;
			}
}
