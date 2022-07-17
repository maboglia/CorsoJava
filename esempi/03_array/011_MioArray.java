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
