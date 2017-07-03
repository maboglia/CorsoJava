package esempi.week1;

public class Caratteri {

	public static void main(String[] args) {
		//declare
		char c1,c2,c3, c4;
		//inizializzo
		c1 = 97;
		c2 = 'a';
		c3 = 'z';
		
		System.out.println("c1 vale " + c1);
		System.out.println("c2 vale " + c2);
		System.out.println("c3 vale " + c3);
		
		c3++;
		System.out.println("c3 vale " + c3);
//		for(int i=1; i <= 100; i++ ){
//			if( i  == 50)
//			System.out.println( "il valore è: "  +    i      );
//		}
//			
			
			
		for (int i = 0; i < 3000; i++){
			c4 = (char) i;
			System.out.println("carattere n. " + i + " vale " + c4);
			
			
		}

	}

}
