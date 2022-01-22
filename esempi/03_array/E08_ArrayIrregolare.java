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
