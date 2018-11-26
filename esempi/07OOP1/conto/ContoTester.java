package conto;

public class ContoTester {

	public static void main(String[] args) {
		ContoCorrente c1 = new ContoCorrente();
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
		
		ContoCorrente c3 = new ContoCorrente("mauro");
		
		System.out.println(     c1.stampaInfo()        );
		System.out.println(     c2.stampaInfo()        );
		System.out.println(     c3.stampaInfo()        );

	}

}
