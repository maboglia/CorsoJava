package p001;

public class StampaCaratteri {

	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {
			char ascii = (char)  i;
			System.out.print(ascii + "\t");
			
			if (i % 10 == 0)
				System.out.println(); //vai a capo ogni 10 char
		
			if (i == 255)
				System.out.println("\n-------------prime 256 posizioni--------------");
		
		}
	}

}
