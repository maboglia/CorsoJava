package esempio;

public class WrapperTest {

	public static void main(String[] args) {
		// variabile elementare con valore 100
		int i = 100;
		// classe wrapper con valore 100
		Integer ii = new Integer(100);
		// stringa da convertire
		String is = "105";
		int ic = Integer.parseInt(is);
		// stampiamo il numero convertito
		System.out.println(ic);
		// stringa sbagliata
		String is2 = "a1000b";
		int ic2 = Integer.parseInt(is2);
		System.out.println(ic2);
	}

}
