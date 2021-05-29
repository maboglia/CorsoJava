import java.util.*;

public class ProvaHashEquals {
	public static void main(String[] args){
		String s1="Ciao";
		String s2="Ci"+"ao";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1.equals(s2))
			System.out.println("Le due stringhe sono uguali.");
		else
			System.out.println("Le due stringhe sono diverse.");
		
	}
}
