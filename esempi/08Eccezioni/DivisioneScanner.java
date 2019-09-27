package esempio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisioneScanner {
	// questo metodo può lanciare un'eccezione (throws Exception)
	public double div(double numeratore, double denominatore) throws Exception {
		// controllo che il denominatore non sia ammissibile
		if (denominatore == 0) {
			// lancio eccezione e termino l'esecuzione
			throw new Exception("Divisione per zero");
		}
		return numeratore / denominatore;
	}

	public static void main(String[] args) {
		boolean ok = false; // stato per vedere se tutto ok
		double nu = 0; // numeratore
		double de = 0; // denominatore
		DivisioneScanner d = new DivisioneScanner();
		Scanner sc = new Scanner(System.in);
		try {
			// leggo i due numeri
			System.out.println("Numeratore:");
			nu = sc.nextDouble();
			System.out.println("Denominatore:");
			de = sc.nextDouble();
			ok = true; // ho i numeri nelle variabili
		} catch (InputMismatchException ex) {
			System.out.println("Uno dei numeri non è valido. Annullo l'operazione.");
		} finally {
			sc.close(); // chiudo lo scanner
		}
		
		if (ok) {
			try {
				double r = d.div(nu, de);
				System.out.println("Risultato: " + r);
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("Non puoi dividere per zero.");
			}
		}
	}
}
