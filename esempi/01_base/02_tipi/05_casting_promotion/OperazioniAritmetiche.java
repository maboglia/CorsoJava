public class OperazioniAritmetiche {

	/**
	 * @param args
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//primo esercizio
		int var1 =10, var2 =6;
		double ris1 = (double) var1 / var2;
		System.out.println("risultato \t" + ris1);
		
		//promotion
		//secondo esercizio
		char var3 = 'a';
		short var4 = 200;
		int ris2 = var3 * var4;
		System.out.println("risultato \t" + ris2 );
		
		//promotion
		//terzo esercizio
		int var5 = 1234;
		//ricorda F finale
		float var6 = 345.6789F;
		//promotion a float
		float ris3 = var5 * var6;
		System.out.println("risultato \t" + ris3 );

		double ris4 = ris1 + ris2 + ris3;
		System.out.println("risultato \t" + ris4 );
		
		
	}

}
