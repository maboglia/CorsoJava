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


