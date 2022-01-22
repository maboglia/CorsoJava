package collezioni;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

public class LanciaDadi {

	public static void main(String[] args) {

		ArrayList<Integer> giocate = new ArrayList<>();
		Vector<Integer> giocate2 = new Vector<>();
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			int dado = (int) ((int) Math.random()*7);
			giocate.add(dado);
		}
		long stopTime = System.currentTimeMillis();
		System.out.println(stopTime - startTime);
		
		
		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			int dado = (int) ((int) Math.random()*7);
			giocate2.add(dado);
		}
		long stopTime2 = System.currentTimeMillis();
		System.out.println(stopTime2 - startTime2);
		
			
		
		
	}

}
