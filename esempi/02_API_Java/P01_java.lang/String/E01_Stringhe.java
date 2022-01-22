package p001;

public class E01_Stringhe {

	public static void main(String[] args) {

		String a = new String ("Ciao");
		String b = a;
		String c = " ";
		String ok = "a e b sono uguali";
		String nonOk = "a e b sono diversi";
		String same = "a e b contengono lo stesso testo";
		
		System.out.println( a + c + b );
		
		if (a == b) System.out.println(ok);
		else System.out.println(nonOk);
		
		if (a.equals(b)) System.out.println(same);
		
		System.out.println(ok.length());
		System.out.println(nonOk.length());
		System.out.println(same.length());
		
		char s1 = ok.charAt(ok.length() - 1  );
		System.out.println(s1);

		for (int i = 0; i < same.length(); i++) {
			System.out.println(same.charAt(i));
		}

		char[] stringaArray = same.toCharArray();
		
		System.out.println(stringaArray);
		
		for (int i = 0; i < stringaArray.length; i++) {
			System.out.println(stringaArray[i]);
		}
		
		
		
	}

}
