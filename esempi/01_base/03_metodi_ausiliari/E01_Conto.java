package com.maboglia.banca;

public class E01_Conto {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		/**
		 * qui inserisco un commento tipo javadoc
		 * su più righe
		 */
		Double percentuale = 1.5;//questo è il tasso di interesse
		
		double sommaDeposito = 25000;//questo è il deposito iniziale in euro
		
		//dopo un periodo (1 anno)
		sommaDeposito = sommaDeposito * (1 + percentuale/100);
		System.out.println("Dopo un anno avrò: " + sommaDeposito);
		
		//dopo un periodo (2 anno)
		sommaDeposito = sommaDeposito * (1 + percentuale/100);
		System.out.println("Dopo due anni avrò: " + sommaDeposito);
		
		//dopo un periodo (3 anno)
		sommaDeposito = sommaDeposito * (1 + percentuale/100);
		System.out.println("Dopo tre anni avrò: " + sommaDeposito);
		
		//dopo un periodo (4 anno)
		sommaDeposito = sommaDeposito * (1 + percentuale/100);
		System.out.println("Dopo 4 anni avrò: " + sommaDeposito);
		
		
		
		
		
		
	}

}
