===== FILE: 001_ArrayInteri.java =====
package esempi.week1;

public class ArrayInteri {

	public static void main(String[] args) {
		
		//dichiaro un array di interi
		int[] ora;
		//int ora[];
		//allocazione in memoria dell spazio
		ora = new int[7];
		
		ora[0] = 10;
		ora[1] = 9;
		ora[2] = 8;
		ora[3] = 7;
		ora[4] = 6;
		ora[5] = 5;
		ora[6] = 4;
		
		for (int i = 0; i <= ora.length ; i++){
			if (i<7)
			System.out.println("il giorno " + i + " della settimana lavoro " + ora[i] + " ore");
			
		}
		

	}

}



===== FILE: 002_Array.java =====
package settimana03;

import java.util.Random;

public class E01_Array {

	public static void main(String[] args) {
	
		//tipi primitivi
		int[] i;
		
		char[] c;
		

		i = new int[5];
		
		
		for (int j = 0; j < i.length; j++) {

			Random r = new Random();
			i[j] = r.nextInt(90);
			
		}
		
		
		
		for (int j = 0; j < i.length; j++) {

			//System.out.println("il valore dell'array alla posizione di i= " + j +  " è "  +    i[j] );
			
		}
		
		
		//tipi complessi
		String[] s;
		
		s = new String[5];
		
		s[0] = "Mattina";
		s[1] = "M'";
		s[2] = "illumino";
		s[3] = "d'";
		s[4] = "immenso";
		
		for (int j = 0; j < s.length; j++) {
			
			int lunghezza = s[j].length() - 1; //
			
			if (  s[j].charAt(lunghezza) == 39  ) 
			System.out.print(     s[j].toLowerCase()   );
			
			else System.out.println(     s[j].toLowerCase()   );
			
		}
		


	}

}



===== FILE: 003_ArrayBidimensionale.java =====
package main;

public class E03_ArrayBidimensionale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] interi = new int[3];
		
		int [][][] interi1 = new int[5][5][5];
		
		int contatore = 1;
		for (int x = 0; x < interi1.length; x++) {
			for (int j = 0; j < interi1[x].length; j++) {
				for (int y = 0; y < interi1[j].length; y++) {
					interi1[x][j][y] = contatore;
					contatore++;
				}
			}
		}
		
		for (int x = 0; x < interi1.length; x++) {
			for (int j = 0; j < interi1[x].length; j++) {
				for (int y = 0; y < interi1[j].length; y++) {
					System.out.print(interi1[x][j][y] + " ");
				}
				System.out.println();
			}
		}		
	}

}



===== FILE: 004_ArrayChar.java =====

public class E04_ArrayChar
{
   public static void main( String[] args )
   {
      String s = "abc";

      char[] A;


      /* =========================================
         converte una stringa in un array di caratteri
         ========================================= */
      A = s.toCharArray();

      System.out.println( s );
      for ( int i = 0; i < A.length; i++ )
         System.out.println( "A[" + i + "] = " + A[i] );
      System.out.println( "\n" );

      /* =========================================
         converti un array di caratteri in una stringa
         ========================================= */
      A = new char[4];

      A[0] = '>'; A[1] = '<'; A[2] = '?'; A[3] = 'a';

      s = new String( A );

      for ( int i = 0; i < A.length; i++ )
         System.out.println( "A[" + i + "] = " + A[i] );

      System.out.println( s );

   }
}



===== FILE: 005_Matrice.java =====
package main;

public class E05_Matrice {

	/**
	 * questo � il mio metodo main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrice = new int [5][5];
		
		int contatore = 1;
		
		for(int x = 0; x < matrice.length; x++){
			for(int y = 0; y < matrice[x].length; y++){
				matrice[x][y] = contatore;
				contatore++;
			}
		}
		
		for(int x = 0; x < matrice.length; x++){
			for(int y = 0; y < matrice[x].length; y++){
				System.out.print(matrice[x][y] + " ");
			}
			System.out.println();
		}
		
	}

}



===== FILE: 006_Matrice.java =====
package esempio;

public class E06_Matrice {

	public static void main(String[] args) {
		// creo una griglia 3 x 3
		int[][] matrice = new int[3][3];
		
		//prima riga
		matrice[0][0] = 1;
		matrice[0][1] = 2;
		matrice[0][2] = 3;
		//seconda riga
		matrice[1][0] = 4;
		matrice[1][1] = 5;
		matrice[1][2] = 6;
		//terza riga
		matrice[2][0] = 7;
		matrice[2][1] = 8;
		matrice[2][2] = 9;
		
		
		
		// popolo la griglia
		// vado sulle righe
//		for (int i = 0; i < matrice.length; i++) {
//			int[] riga = matrice[i];
//			// vado sulle colonne
//			for (int j = 0; j < riga.length; j++) {
//				riga[j] = i * 3 + j + 1;
//			}
//		}
		// stampo la matrice (stessa procedura di sopra per la scansione)
//		for (int i = 0; i < matrice.length; i++) {
//			int[] riga = matrice[i];
//			// vado sulle colonne
//			for (int j = 0; j < riga.length; j++) {
//				System.out.print(riga[j]);
//				if (j != riga.length - 1) { // stampa se non uguale all'ultima col
//					System.out.print(" ");
//				}
//			}
//			System.out.println(); // vado a capo
//		}
		//ciclo per stampare le righe
		for(int i = 0; i < matrice.length; i++){

			//innesto un ciclo per le colonne
			int[] colonne = matrice[i];
			for (int j = 0; j < colonne.length; j++) {
				System.out.print("\t" + colonne[j] +"|");
			}
			System.out.println();
			System.out.println("____________");
			//System.out.println(matrice[i][0] + matrice[i][1] +matrice[i][2]);
			
			
		}
	
	
	
	}

}



===== FILE: 007_CopiaArray.java =====
import java.util.Arrays;

public class E07_CopiaArray {

    public static void main(String[] args) {

        System.out.println("Array di primitivi");
        int[] ints = {9, 6, 3};
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        System.out.println("Array di stringhe");
        String[] colori = {"Rosso", "Verde", "Bianco"};
        Arrays.sort(colori);
        for (String colore : colori) {
            System.out.println(colore);
        }

        System.out.println("Stabilisco un dimensione iniziale");
        int[] arrayDaCopiare = new int[10];
        for (int i = 0; i < arrayDaCopiare.length; i++) {
            //popolo l'array con valori arbitrari
            arrayDaCopiare[i] = i * 100;
        }
        for (int value : arrayDaCopiare) {
            System.out.println(value);
        }

        System.out.println("Copio l'array");
        int[] arrayCopia = new int[5];
        System.arraycopy(arrayDaCopiare, 5, arrayCopia, 0, 5);
        for (int valore : arrayCopia) {
            System.out.println(valore);
        }
    }

}


===== FILE: 008_ArrayIrregolare.java =====
package main;

public class E08_ArrayIrregolare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primoArray[][] = { {1,2,3}, {4,5,6}, {7} };
		int secondoArray[][] = { {3,2,1}, {6} };
		boolean verso = false;
		System.out.println("Questo è il primo array: ");
		display(primoArray, verso);
		System.out.println("Questo è il secondo array: ");
		verso = true;
		display(secondoArray, verso);
	}

	public static void display(int[][] primoArray, boolean verso) {
		// TODO Auto-generated method stub
		
		for (int row=0;row < primoArray.length;row++)
		{
			for (int column = 0; column < primoArray[row].length; column++) {
				if (verso)
				System.out.print(primoArray[row][column] + "\t");
				else
				System.out.println(primoArray[row][column] + "\t");
			}
		}
		System.out.println();
	}

}



===== FILE: 009_ScorrereArray.java =====
package esempio;

public class E09_ScorrereArray {

	public static void main(String[] args) {
		// creiamo un array di interi di 10 elementi
		int[] valori = new int[10];
		// popoliamo l'array
		for (int i = 0; i < valori.length; i++) {
			// scrivo nell'array in posizione i
			valori[i] = i + 1; 
		}
		// leggiamo dall'array
		int n = 0;
		while (n < valori.length) {
			System.out.println(valori[n]);
			n++;
		}
		// leggiamo al contrario
		n = valori.length - 1; // 10 - 1 ( la prima posizione utile � 9)
		while (n >= 0) {
			System.out.println(valori[n]);
			n--;
		}
	}

}



===== FILE: 010_MioArray.java =====
package esempi.week11;

public class MioArray {

	public static void main(String[] args) {
		
		String[][] colazione = new String[3][2];
		
		colazione[0][0] = "caffé";
		colazione[1][0] = "brioche";
		colazione[2][0] = "succo d'arancia";

		colazione[0][1] = "1.00";
		colazione[1][1] = "1.00";
		colazione[2][1] = "1.50";
		
		
		
		for (int i = 0; i < colazione.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(colazione[i][j] + "\t");
				
			}
			System.out.println("");
			System.out.println("-----");
		}
		
		System.out.println(colazione);
		
//		for (String string : colazione) {
//			System.out.println(string);
//		}

	}

}



===== FILE: 012_EsercizioArray1.java =====

public class EsercizioArray1 {

    public static void main(String[] args) {
        //array di interi, zero-based

        int[] n = {1,2,3,5,5,6,7,8,9};

        int somma = 0;

        //ciclo per scorrere
        for(int i = 0; i < n.length; i++){
            System.out.println("La posizione numero  " + i +" vale : " + n[i]);
            somma = somma + n[i];

        }

            System.out.println("La somma dei valori dell'array è: " + somma);
            System.out.println("La media dei valori dell'array è: " + somma / n.length );

    }



}



===== FILE: 013_EsercizioArray2.java =====

public class EsercizioArray2 {

    public static void main(String[] args) {
        //array di interi, zero-based

        String[] nomi = {
                "Mele",
                "Pere",
                "Banane"

        };

        //ciclo per scorrere
        for(int i = 0; i < nomi.length; i++){
            System.out.println("La frutta numero  " + i +" è : " + nomi[i]);

        }
    }
}



===== FILE: 014_EsercizioArray3.java =====
import java.util.Scanner;

public class EsercizioArray3 {

    public static void main(String[] args) {


        //String s = "onorarono";

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una stringa: ");

        String s = sc.next();

        char[] test = s.toCharArray();

//        char[] lettere = {
//                'a',
//                'n',
//                'n',
//                'a',
//        };

        boolean palindroma = true;

        int lunghezza = test.length;
        // indice per arrivare a metà array compreso
        int indiceMassimo = (int) Math.ceil(lunghezza / 2.0);

        for (int i = 0; i < indiceMassimo; i++) {
            char a = test[i];
            char b = test[lunghezza - 1 - i];

            // se non sono uguali
            if (a != b) {
                // dico che non è palindroma
                palindroma = false;
                // interrompo il ciclo
                break;
            }
        }

        if (palindroma) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Non palindromo");
        }


    }
}



===== FILE: 015_VarArgs.java =====
package main;

public class VarArgs {

	  public static void main (String[] args) {

		  System.out.println(average(2,5,8,78));
	  }
	  
	  public static int average(int...numbers){
		  int totale =0;
		  
		  for (int x: numbers )
			  totale+=x;
		  return totale / numbers.length;
	  }
	  
	  
	}



===== FILE: 016_EsempioMediaVarargs.java =====
package lab06;

public class EsempioMediaVarargs {

	public static void main(String[] args) {

		System.out.println(calcolaMedia(24,26,28));
		System.out.println(calcolaMedia(24,26,28,30));
		System.out.println(calcolaMedia(24,26,28,26,24,28,25,29));
		
		

	}
	
	
	private static double calcolaMedia(int... voti) {
		
		double totale = 0, media= 0;
		
		for (int i : voti) {
			totale += i;
		}
		
		media = totale/voti.length;
		return media;
		
	}
	
	
	

}



===== FILE: unione_sorgenti.java =====



