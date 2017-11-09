
public class TestaCroce {
	static int testa = 0;
	static int croce = 0;

	public static void main(String[] args) {
//		String risultato = lanciaMoneta();
//		System.out.println(risultato);
		for (int i = 0; i < 1000; i++) {
			System.out.println(lanciaMoneta());
		}
		System.out.println("croce è uscito " +  croce + " volte");
		System.out.println("testa è uscito " +  testa + " volte");
	}

	private static String lanciaMoneta() {
		String s = null;

		double r = Math.random();
		if (r < 0.50) {
			s = "testa";
			testa++;
		} else {
			s = "croce";
			croce++;
		}
		
		return s;
	}

}
