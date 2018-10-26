EsercitazioneArray.java

public class EsercitazioneArray {

	public static void stampaInteri(int[] a) {
		if (a.length == 0) {
			System.out.println("{}");
			return;
		}
		System.out.print("{" + a[0]);
		for (int i=1; i < a.length; i++) {
			System.out.print(", " + a[i]);
		}
		System.out.print(" }");
	}
	
	public static void stampaDouble(double[] a) {
		if (a.length == 0) {
			System.out.println("{}");
			return;
		}
		System.out.print("{" + a[0]);
		for (int i=1; i < a.length; i++) {
			System.out.print(", " + a[i]);
		}
		System.out.print(" }");
	}
	
	public static String stringaInteri(int[] a) {
		if (a.length == 0) {
			return "{}";
		}
		String str = "{" + a[0];
		for (int i=1; i < a.length; i++) {
			str = str + ", " + a[i];
		}
		return str + (" }");
	}
	
	public static String stringaDouble(double[] a) {
		if (a.length == 0) {
			return "{}";
		}
		String str = "{" + a[0];
		for (int i=1; i < a.length; i++) {
			str = str + ", " + a[i];
		}
		return str + (" }");
	}

	public static double[] normalizza(int[] a) {
		double[] n = new double[a.length];
		double media = 0;
		for (int i=0; i < a.length; i++)
			media += a[i];
		media = media / a.length;
		for (int i=0; i < a.length; i++)
			n[i] = a[i] / media;
		return n;
	}
	
	public static int[] elabora(int[] a) {
		int[] e = new int[a.length];
		for (int i=0; i < a.length; i++)
			if (a[i]%2 == 0)
				e[i] = a[i] / 2;
			else
				e[i] = a[i] * 2;
		return e;
	}
	
	public static String[] concatena(String[] a, String[] b) {
		String[] c = new String[a.length + b.length];
		for (int i=0; i < a.length; i++)
			c[i] = a[i];
		for (int i=0; i < b.length; i++)
			c[i + a.length] = b[i];
		return c;
	}
	
	public static int[] inverti(int[] a) {
		int[] invertito = new int[a.length];
		for (int i=0; i < a.length; i++)
			invertito[a.length-i-1] = a[i];
		return invertito;
	}
	
	public static boolean verificaPalindromo(int[] a) {
		int[] invertito = inverti(a);
		for (int i=0; i < a.length; i++)
			if (invertito[i] != a[i])
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		int[] a = {10,20,35,40,50,60,17,85};
		stampaInteri(a);
		System.out.println();
		System.out.println("Metodo che restituisce una stringa: " + stringaInteri(a));
		double[] d = {2.0, 4.5, 6.7, 0.33, 1.2};
		stampaDouble(d);
		System.out.println();
		System.out.println("Metodo che restituisce una stringa: " + stringaDouble(d));
		double[] n = normalizza(a);
		System.out.println("Array normalizzato: " + stringaDouble(n));
		int[] e = elabora(a);
		System.out.println("Array elaborato: " + stringaInteri(e));
		String[] s1 = {"a","b","c","d"};
		String[] s2 = {"e","f","g"};
		String[] c = concatena(s1,s2);
		System.out.print("Array concatenato: ");
		for (int i=0; i < c.length; i++)
			System.out.print(c[i] + " ");
		System.out.println();
		System.out.println("Array originale: " 
				+ stringaInteri(a) + " - Array invertito: " + stringaInteri(inverti(a)));
		System.out.println("L'array " + stringaInteri(a) + (verificaPalindromo(a)?" e' palindromo":" non e' palindromo"));
		int[] palindromo = {10,20,30,40,50,60,50,40,30,20,10};
		System.out.println("L'array " + stringaInteri(palindromo) + (verificaPalindromo(palindromo)?" e' palindromo":" non e' palindromo"));
	}
	
}

