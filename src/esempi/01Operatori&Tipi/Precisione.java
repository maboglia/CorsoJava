package esempi.week11;

import java.math.BigDecimal;

public class Precisione {

	public static void main(String[] args) {
		

		double valore = .012;
		
		double sommaValori = valore + valore + valore;
		
		System.out.println(sommaValori);
		
		String valStringa = Double.toString(valore);
		System.out.println(valStringa);
		
		BigDecimal bigValore = new BigDecimal(valStringa);
		
		BigDecimal bigSomma = bigValore.add(bigValore).add(bigValore);
		
		System.out.println(bigSomma);

	}

}
