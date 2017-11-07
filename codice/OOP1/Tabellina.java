
public class Tabellina {

	public static void main(String[] args) {
		int i = 0;
		for ( i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
		for ( i = 11; i <= 20; i++) {
			for (int j = 1; j <= 10; j++) {
				
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
		System.out.println(i);
	}

}
