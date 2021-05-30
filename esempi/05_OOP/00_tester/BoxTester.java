package main;

import box.Box;

public class BoxTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box scatola = new Box();
		scatola.stampa();
		
		Box scatola2 = new Box();
		scatola2.stampa();
		
		Box scatola3 = new Box(5,6);
		scatola3.stampa();
		
	}

}
