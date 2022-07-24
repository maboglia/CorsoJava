package main;

public class ArrayBidimen {

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
