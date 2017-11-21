package calcolatrice;

public class MathHelper {

	public static double addizione(String s1, String s2) {
		System.out.println("operazione addizione eseguita");
		
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		
		return num1 + num2;
	}

	public static double sottrazione(String s1, String s2) {
		System.out.println("operazione sottrazione eseguita");
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		
		return num1 - num2;
	}

	public static double moltiplicazione(String s1, String s2) {
		System.out.println("operazione moltiplicazione eseguita");
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		
		return num1 * num2;
	}

	public static double divisione(String s1, String s2) {
		System.out.println("operazione divisione eseguita");
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		
		return num1 / num2;
	}

}
