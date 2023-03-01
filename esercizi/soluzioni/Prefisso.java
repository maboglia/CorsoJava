import java.util.Scanner;


public class Prefisso {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		String s = input.nextLine();
		System.out.println(pref(s));

	}
	
	private static String pref(String s) {
		if (s.length()>3) 
			s=s.substring(0,3);
		return s;
	}

}
