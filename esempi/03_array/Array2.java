package settimana04;

import java.util.Random;

public class Array2 {

	
	
	public static void main(String[] args) {
		
		int[] mioArray = new int[4];
		
		mioArray[0] = 10;
		mioArray[1] = 20;
		mioArray[2] = 30;
		mioArray[3] = 40;
		
		
		int mioArray2[] = new int [5];
		
		mioArray2[0] = 10;
		mioArray2[1] = 20;
		mioArray2[2] = 30;
		mioArray2[3] = 40;
		mioArray2[4] = 40;
		
		//notazione short
		int[] mioArray3 = {10, 20, 30, 40, 50}; 
		
		
		int i = 90;
		int[] ar = new int[i];
		for (int j = 0; j < ar.length; j++) {
			ar[j] = new Random().nextInt(89) + 1;
		}
		
		for (int j : ar) {
			System.out.println(j);
		}
		
		//notazione short
		String[] frutti = { "mele", "pere", "banane" };
		
		try {
			
			String s = frutti[2];
			int u = s.length();
		
			try {
				System.out.println(  10  / 0  );
			} catch (Exception e) {
					System.out.println("bau");
			}

			
			System.out.println(frutti[3]);
			
		
		
		} catch (ArithmeticException e) {
			
			System.out.println("hai diviso per 0");
		
		
		} 
		catch (ArrayIndexOutOfBoundsException e){
			
			System.out.println("non faccio niente.....");
			
		}
		
		
		catch (Exception e){
			
			System.out.println("eccezione generica");
		} finally {
			System.out.println("questa istruzione sarà eseguita in ogni caso");
		}

		for (int j = 0; j < frutti.length; j++) {
			System.out.println(frutti[j]);
		}
		
		
		
	}
	
	
	
	
	
	
	
}
