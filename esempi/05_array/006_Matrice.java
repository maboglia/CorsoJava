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
