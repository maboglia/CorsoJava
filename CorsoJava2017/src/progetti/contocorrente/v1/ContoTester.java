package progetti.contocorrente.v1;

public class ContoTester {
	public static void main(String[] args) {
		ContoCorrente test = new ContoCorrente();
		test.versamento(1000);
		test.prelievo(500);
		test.prelievo(400);
		System.out.println(test.getSaldo());
		test.setTasso(0.1);
		System.out.println(test.getSaldo());
	}
	
	
}
