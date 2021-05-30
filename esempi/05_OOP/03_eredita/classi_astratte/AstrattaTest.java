package classi;

public class AstrattaTest {

	public static void main(String[] args) {
		Base b = new Derivata();
		System.out.println("M=" + b.m());
		
		Base b2 = new Derivata2();
		System.out.println("M=" + b2.m());
		
		System.out.println("X=" + b.x());
	}
	
}
