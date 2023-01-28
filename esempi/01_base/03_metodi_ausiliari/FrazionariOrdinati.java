import java.util.Scanner;

public class FrazionariOrdinati {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci tre numeri frazionari");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		if (ordinati(n1,n2,n3))
			System.out.println("Frazionari ordinati");
		else
			System.out.println("Frazionari non ordinati");
		
	}
	
	private static boolean ordinati(double x, double y, double z) {
		return ((x<=y)&&(y<=z)||(x>=y)&&(y>=z));
	}
	
}
