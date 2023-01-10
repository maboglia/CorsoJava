import java.util.Scanner;


public class CoppiaVocaliUguali {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	String s = input.nextLine();
	
	boolean trovato = false;
		for (int i=0; i<s.length()-1; i++) {
			if (s.charAt(i)=='a' || 
					s.charAt(i)=='e' || 
					s.charAt(i)=='i' ||
					s.charAt(i)=='o' ||
					s.charAt(i)=='u') {
			for (int j=i+1; j<s.length(); j++)
				if (s.charAt(i)==s.charAt(j)) trovato=true;
			}
		}
		
		if (trovato) System.out.println("Ci sono due vocali uguali");
		else System.out.println("NO");
		
	}
}
