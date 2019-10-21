package week1.esempi;

public class PrimaStringa {

	public static void main(String[] args) {
		
		String a = "ciao ";
		String b = "mondo!";
		String c = "ciao mondo!";
		System.out.println(a+b);
		System.out.println( c );
		
		if (  (a+b)  == c    ){
				System.out.println("sono uguali");
		} else
		{
			System.out.println("sono diverse");
		}
		
		if (  (a+b).equals(c)     ){
			System.out.println("sono uguali");
		}
		b=a;
		a="peppino";
		System.out.println(b);
		System.out.println(a);
	}

}
