package settimana03;

import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
	
		//tipi primitivi
		int[] i;
		
		char[] c;
		

		i = new int[5];
		
		
		for (int j = 0; j < i.length; j++) {

			Random r = new Random();
			i[j] = r.nextInt(90);
			
		}
		
		
		
		for (int j = 0; j < i.length; j++) {

			//System.out.println("il valore dell'array alla posizione di i= " + j +  " è "  +    i[j] );
			
		}
		
		
		//tipi complessi
		String[] s;
		
		s = new String[5];
		
		s[0] = "Mattina";
		s[1] = "M'";
		s[2] = "illumino";
		s[3] = "d'";
		s[4] = "immenso";
		
		for (int j = 0; j < s.length; j++) {
			
			int lunghezza = s[j].length() - 1; //
			
			if (  s[j].charAt(lunghezza) == 39  ) 
			System.out.print(     s[j].toLowerCase()   );
			
			else System.out.println(     s[j].toLowerCase()   );
			
		}
		


	}

}
