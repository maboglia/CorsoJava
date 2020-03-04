package esempi.week8;

public class AritmeticaSbagliata {

	public static void main(String[] args) {

		int x = 10;
		int y = 0;
		
		double z =0.0;
		
		  try {
			z = x/y;
			System.out.println(z);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("eccezione di tipo aritmetico, devi aver inserito ei valori non accettabili");
			//e.printStackTrace();
		}
		
		
		
		
		
	}

}
