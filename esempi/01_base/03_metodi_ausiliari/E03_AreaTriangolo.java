package p001;
import java.util.Scanner;

public class E03_AreaTriangolo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("inserisci il valore della base: "); 

		int b = (int) sc.nextDouble();
		System.out.println("inserisci il valore della altezza: "); 
	     int a = (int) sc.nextDouble();
		
		int base , altezza ;
		int area ;
		base= b;
		if (args.length > 0)  base =Integer.parseInt(args[0]);
		altezza = a;
		area = base * altezza /2;
		System.out.println("l'area del triangolo è: "); 
		System . out . println ( area );
		//System.out.println(args[0]);
	}

}


