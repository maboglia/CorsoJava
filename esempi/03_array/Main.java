package main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] interi = new int [3];
		
		int [] interi1 = {4,5,6,7,8};
		
		interi[0] = 1;
		interi[1] = 2;
		interi[2] = 3;
 		
		System.out.println("il valore intero è: " + interi[0] + " " +  interi[1] + " " + interi[2]);
		
		for(int x = 0; x < interi1.length; x++){
			System.out.println("i valori sono: " + interi1[x]);
		}
		
	}

}
