package esempio;

public class DadoTester {

	public static void main(String[] args) {
		Dado d6 = new Dado();
		Dado d20 = new Dado(20);

		int risultato1 = d6.lancia();
		int risultato2 = d20.lancia();
		
		System.out.println("Lancio del d6: " + risultato1);
		System.out.println("Lancio del d20: " + risultato2);
		
		d20.setFacce(100);
		int risultato3 = d20.lancia();
		System.out.println("Lancio del d20 modificato: " + risultato3);
	}

}
