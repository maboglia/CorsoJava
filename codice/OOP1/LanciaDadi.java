
public class LanciaDadi {

	final static int NUM_FACCE = 6;
	static int dado1, dado2, punteggio;
	
	public static void main(String[] args) {

		
		for (int i = 0; i < 100; i++) {
			dado1 = lanciaDado();
			dado2 = lanciaDado();
		
			if( (dado1 + dado2) == 7   ){
				punteggio++;
				System.out.println("vittoria " + punteggio);
			
			}
		
		}
		

	}

	private static int lanciaDado() {

		double r =  Math.random() * NUM_FACCE; 
		int i = (int) r + 1 ;
		
		return i;
	}

}
