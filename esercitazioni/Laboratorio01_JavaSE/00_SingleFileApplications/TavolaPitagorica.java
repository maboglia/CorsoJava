package giochini;

public class TavolaPitagorica {

	public static void main(String[] args) {
		
		final int RIGHE = 10;
		
		for (int i = 1; i <= RIGHE; i++) {
			
			for (int j = 1; j <= RIGHE; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
			
		}
		
	}
	
	
	
}
