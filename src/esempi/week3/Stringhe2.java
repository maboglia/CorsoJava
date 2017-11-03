package esempi.week3;

public class Stringhe2 {

	public static void main(String[] args) {
	
		/*
		System.out.println(   Math.PI           );
		System.out.println(   Math.E            );
		*/

		String s = "abcdefghilmnopqrstuvz";
	    
	    char[] caratteri2 = s.toCharArray();
	    
	    String s1 ="Ciao Mondo";
	    String s2 ="      Ciao        ";
	    String s3 = s2 + "mondo";
	    
	    
	    if (s1.equalsIgnoreCase(s3)){
	    		System.out.println("Le stringhe sono uguali");
	    } else {
	    		System.out.println("Le stringhe sono diverse");
	    }

	    System.out.println(s1.toUpperCase());
	    System.out.println(s.length());
	    
	    if (s.indexOf("z") > -1)
	    System.out.println(  "La sottostringa è presente posizione: " +  s.indexOf("z"));
	    
	    System.out.println(  s1.indexOf("o")  );
	    System.out.println(  s1.indexOf("o", 4)  );
	    System.out.println(  s1.lastIndexOf("o")  );
	    
	    System.out.println(s1.replace('o', 'i'));
	    System.out.println(s2.trim());
	    System.out.println(s2);
	    
	    
	    int temp = s.indexOf("m");
	    System.out.println(s.substring(temp));
	    System.out.println(s.substring(temp, temp + 15));

	    
	    
	  /*  
	    //ciclo di 100 righe
	    for (int i = 0; i < 100; i++) {
	    		
	    		//ciclo interno per la parola (la singola riga)
	    		for (int j = 0; j < 6; j++) {
	    			
	    			int posCarattere =   (int)   (      Math.random() * s.length() );
	    				
					System.out.print( caratteri2[posCarattere]  );
				}
	    	
			System.out.println();
		}		
		
		*/
		
		
		for (int i = 0; i < 100; i++) {
			int lancio =   (int)   (      Math.random() * 6 ) + 1;
			//System.out.println( "Lancio n. " + i +  ": " +  lancio  );
		}
		
		
		
		
		

	}

}
