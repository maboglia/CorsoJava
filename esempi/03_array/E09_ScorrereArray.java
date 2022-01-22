package esempio;

public class E09_ScorrereArray {

	public static void main(String[] args) {
		// creiamo un array di interi di 10 elementi
		int[] valori = new int[10];
		// popoliamo l'array
		for (int i = 0; i < valori.length; i++) {
			// scrivo nell'array in posizione i
			valori[i] = i + 1; 
		}
		// leggiamo dall'array
		int n = 0;
		while (n < valori.length) {
			System.out.println(valori[n]);
			n++;
		}
		// leggiamo al contrario
		n = valori.length - 1; // 10 - 1 ( la prima posizione utile � 9)
		while (n >= 0) {
			System.out.println(valori[n]);
			n--;
		}
	}

}
