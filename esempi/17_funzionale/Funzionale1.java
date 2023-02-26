package funzionale;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Funzionale1 {

	public static void main(String[] args) {
		
		;
		
//		Double average = voti.average().getAsDouble();

		System.out.println(IntStream.of(25,26,27,28,29,30).average().getAsDouble());
		
		
		//***************************************************
		
		int[] voti2 = {25,26,27,28,29,30};
		
		double totale = 0;
		
		totale = extracted(voti2, totale);
		
		double average2 = totale / voti2.length;
		
		System.out.println(average2);
		
		for (var i : voti2) {
			System.out.println(i);
		}
		
		
		
		
		
	}

	private static double extracted(int[] voti2, double totale) {
		for (int i = 0; i < voti2.length; i++) {
			totale += voti2[i];
		}
		return totale;
	}
	
	
}
