package calcolatrice;

import java.util.Scanner;

public class InputHelper {

	static Scanner sc = new Scanner(System.in);
	
	public static String getInput(String string) {
		System.out.println(string);
		return sc.nextLine();
	}

}
