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
