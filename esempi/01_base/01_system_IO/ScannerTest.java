package esempio;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Scrivi un numero: ");
		int i = sc.nextInt();
		System.out.println("Hai scritto: " + i);
	}

}
