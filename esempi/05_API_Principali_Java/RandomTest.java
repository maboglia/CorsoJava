import java.util.*;

public class RandomTest {
	public static void main(String[] args){
		// r1 usa un seme ogni volta diverso
		Random r1 = new Random();
		// r1 usa un seme fisso
		Random r2 = new Random(12176);
		// Dimostrazione della sequenza di r1
		System.out.print("r1: ");
		for(int i=0; i<10; i++){
			System.out.print(r1.nextInt(100)+" ");
		}
		System.out.println();
		// Dimostrazione della sequenza di r2
		System.out.print("r2: ");
		for(int i=0; i<10; i++){
			System.out.print(r2.nextInt(100)+" ");
		}
		System.out.println();	
	}
}