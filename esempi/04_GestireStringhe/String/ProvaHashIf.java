import java.util.*;

public class ProvaHashIf {
	public static void main(String[] args){
		String s1="Ciao";
		String s2="Ci"+"ao";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1.hashCode()==s2.hashCode())
			System.out.println("Le due stringhe sono uguali.");
		else
			System.out.println("Le due stringhe sono diverse.");		
	}
}
