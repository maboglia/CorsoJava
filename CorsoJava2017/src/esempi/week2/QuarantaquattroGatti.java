package esempi.week2;

public class QuarantaquattroGatti {

	public static void main(String[] args) {
		
		String gatti = "Quarantaquattrogattinfilaperseicolrestodidue";
		
		//System.out.println(gatti.length());
		
		
		for (int i = 1,a=0; i <= gatti.length(); i++, a++) {
			
			
			System.out.print( gatti.charAt(i - 1) );
			
			if ( i % 6 == 0   ) System.out.println();
			
		}
		

	}

}
