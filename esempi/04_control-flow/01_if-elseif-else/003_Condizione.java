package esempi.week11;

public class Condizione {

	public static void main(String[] args) {

		int a=1, b=0;
		
		if ( a == b && a == a) {
			System.out.println("la seconda condizione non viene valutata, perché la prima è falsa");
		} else if ( a == 0){
			System.out.println("a è uguale a 0");
		} else {
			System.out.println("a e b hanno valore diverso");
			
		}


	}

}


// Esempio di if annidati
class IfAnnidati {
	public static void main(String args[]) {
		int i = 18;
		if (i % 2 == 0) {
			System.out.print(i + " e' un multiplo di 2 ");
			if (i % 3 == 0)
				System.out.println("e di 3");
			else
				System.out.println("");
		}
	}
}


// Programma che determina il maggiore di 4 caratteri
import java.io.*;

class Max {
	public static void main(String[] args) throws IOException {
		char a, b, c, d, max;

		a = (char) System.in.read();
		b = (char) System.in.read();
		c = (char) System.in.read();
		d = (char) System.in.read();
		if (a > b && a > c && a > d)
			max = a;
		else if (b > a && b > c && b > d)
			max = b;
		else if (c > a && c > b && c > d)
			max = c;
		else
			max = d;
		System.out.println(max);
	}
}