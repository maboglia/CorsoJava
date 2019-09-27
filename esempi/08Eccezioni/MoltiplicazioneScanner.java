package esempio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MoltiplicazioneScanner {
	
	public double moltiplica(double a, double b) {
		return a * b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ok = false;
		double a = 0;
		double b = 0;
		try {
			System.out.println("A:");
			a = sc.nextDouble();
			System.out.println("B:");
			b = sc.nextDouble();
			ok = true;
		} catch (InputMismatchException ex) {
			System.out.println("Non un numero");
		} finally {
			sc.close();
		}
		
		if (ok) {
			MoltiplicazioneScanner m = new MoltiplicazioneScanner();
			double r = m.moltiplica(a, b);
			System.out.println("R: " + r);
		}
	}

}
