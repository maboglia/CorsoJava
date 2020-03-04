package principale;

import java.util.Scanner;

public class Decisioni {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quanti anni hai?");
		
		int eta = in.nextInt();
		
		if(eta < 16){
			System.out.println("non puoi guidare la moto");
			System.out.println("non puoi guidare la moto");
			System.out.println("non puoi guidare la moto");
		
		}
		else if(eta < 18)
			System.out.println("non puoi guidare l'automobile");
		
		else if(eta < 24)
			System.out.println("puoi guidare l'automobile");
		
		else
			System.out.println("puoi guidare tutto");
		
		
		
	}

}
