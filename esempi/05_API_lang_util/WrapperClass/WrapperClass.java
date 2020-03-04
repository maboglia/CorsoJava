package p001;
import java.util.Scanner;
public class WrapperClass {

	public static void main(String[] args) {

		System.out.println("quanti annni hai?");
		Scanner sc = new Scanner(System.in);
		String numero = sc.next();
		
		System.out.println("hai " + numero + " anni" );
		Integer n = (2017 - Integer.parseInt(numero)    );
		System.out.println("quindi sei nato nel  " + n + " anni" );
		System.out.println(n.MAX_VALUE);
	}

}
