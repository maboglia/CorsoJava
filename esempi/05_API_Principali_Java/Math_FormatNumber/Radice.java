package esempio;

import java.util.Random;

public class Radice {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int i = rand.nextInt(1000);
		double radice = Math.sqrt(i);

		System.out.println(radice);
	}

}
