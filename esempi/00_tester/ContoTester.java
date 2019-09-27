import model.ContoCorrente;

public class ContoTester {

		
	
	public static void main(String[] args) {
		
//		ContoCorrente[] conti = new ContoCorrente[5];
		ContoCorrente c1 = new ContoCorrente();
		//conti[0] = new ContoCorrente();
		//c1.numConto = 12;
//		c1.versamento(100.35);
//		c1.versamento(49.65);
//		c1.prelievo(50);
//		
		ContoCorrente c2 = new ContoCorrente(30);
		//c2.numConto = 13;
		//c2.saldo = 100;
		c2.versamento(50);
//		c1.versamento(200);
		if(c2.prelievo(75)) System.out.println("hai prelevato");
		if(c2.prelievo(75)) System.out.println("hai prelevato");
		if(c2.prelievo(75)) System.out.println("hai prelevato");
		
		ContoCorrente c3 = new ContoCorrente("Paolo Paperino");
		
		System.out.println(     c1        );
		System.out.println(     c2        );
		System.out.println(     c3        );
		
//		String a = new String("ciao");
//		String b = new String("Ciao");
//		System.out.println(     a.equalsIgnoreCase(b)      );
	}

}
