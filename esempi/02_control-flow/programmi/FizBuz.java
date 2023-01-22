package controlloflusso;

public class FizBuz {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			System.out.println("i vale: " + i);
			
			if (i % 3 == 0 && i%5 == 0) {
				System.out.println("FIZBUZ");
			} 
			else {
				if (i % 3 == 0) {
					System.out.println("FIZ");
				} 
				else
				if (i % 5 == 0) {
					System.out.println("BUZZ");
				} 
			}
			
		}
		

	}

}
