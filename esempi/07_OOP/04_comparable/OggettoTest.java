package esempio;

public class OggettoTest {

	public static void stampa(int i) {
		System.out.print("Sono ");
		if (i > 0) {
			System.out.print("maggiore");
		}
		if (i < 0) {
			System.out.print("minore");
		}
		if (i == 0) {
			System.out.print("uguale");
		}
		System.out.println(" rispetto all'oggetto passato");
	}
	
	public static void main(String[] args) {
		Oggetto o1 = new Oggetto();
		Oggetto o2 = new Oggetto();
		o2.setI(200);
		Oggetto o3 = new Oggetto();
		o3.setI(0);
		Oggetto o4 = new Oggetto();
		
		stampa(o1.compareTo(o2)); // 100 - 200
		stampa(o1.compareTo(o3)); // 100 - 0
		stampa(o1.compareTo(o4)); // 100 - 100
	}

}
