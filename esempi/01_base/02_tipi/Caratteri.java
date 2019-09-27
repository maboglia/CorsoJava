package p001;

public class Caratteri {

	public static void main(String[] args) {

		char  a    =    65;
		char  b    =    66;
		
//		System.out.println("Il valore di a + b : ");
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(a+b);
		
		for (int i = 0; i < 1000; i++) {
			char ascii = (char)  i;
			System.out.print(ascii + "\t");
			
			if (i % 10 == 0)
				System.out.println();
		
			if (i == 255)
				System.out.println("-------------sono finiti gli ascii--------------");
		
		}
	}

}
