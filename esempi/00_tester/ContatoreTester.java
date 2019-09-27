package step02.studenti;

public class ContatoreTester {

	public static void main(String[] args) {

		String[] citta = { "Torino", "Roma", "Milano", "Pavia"   }; 
		int nCitta = citta.length;
		for (int i = 0; i < nCitta; i++) {
			
			System.out.println(citta[i]);
		}
		

		//System.out.println(Contatore.contatore);
		
		for (int i = 0; i < 10; i++) {
//			System.out.println(citta[Contatore.contatore]);
			Contatore.incrementa();
			
			if (Contatore.contatore < 0 || Contatore.contatore >= nCitta ){
				Contatore.contatore = 0;
				System.out.println("istruzione B "+citta[Contatore.contatore]);
			} else
				System.out.println("istruzione A "+citta[Contatore.contatore]);

		}
		

//		System.out.println(citta[Contatore.incrementa()]);
//		System.out.println(citta[Contatore.incrementa()]);
//		System.out.println(citta[Contatore.incrementa()]);
//		System.out.println(citta[Contatore.decrementa()]);
//		System.out.println(citta[Contatore.incrementa()]);
		
		
	}

}
