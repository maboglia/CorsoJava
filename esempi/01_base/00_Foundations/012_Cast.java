public class Cast {

	public static void main(String[] args) {

		/** esempio 1: cast da int a byte */

		int i1 = 10, i2 = 255, i3 = 546;
		byte b1, b2, b3;
		
		b1 = (byte) i1;
		b2 = (byte) i2;
		b3 = (byte) i3;
		
		System.out.println("esempi di cast da int a byte");
		System.out.println("il cast di i1 " + i1 + " vale " + b1);
		System.out.println("il cast di i2 " + i2 + " vale " + b2);
		System.out.println("il cast di i3 " + i3 + " vale " + b3);

		
		/** esempio 2:  */
		
		int valore1 = 56;
		int valore2 = valore1;
		
		// System.out.println(valore2);
		
		// casting
		System.out.println("esempi di cast da int a short");
		short valoreShort1 = (short) valore1;
		System.out.println(valoreShort1);
		
		int valore3 = 1024;
		System.out.println("esempi di cast da int a byte");
		byte valoreByte1 = (byte) valore3;
		System.out.println(valoreByte1);
		
		System.out.println("esempi di cast da double a int");
		double valoreDouble1 = 3.999999d;
		int valore4 = (int) valoreDouble1;
		System.out.println(valore4);
		
		
		/** esempio 3: esempio di uso cast con le operazioni aritmetiche */
		
		//ricevi due interi in input, devi ritornare le operazioni aritmetiche principali
 		int intValue1 = 56;
		int intValue2 = 42;

		int result1 = intValue1 + intValue2;
		System.out.println("Addizione: " + result1);

		int result2 = intValue1 - intValue2;
		System.out.println("Sottrazione: " + result2);

		int result3 = intValue1 * intValue2;
		System.out.println("Moltiplicazione: " + result3);

		double result4 = (double) intValue1 / intValue2;
		System.out.println("Divisione: " + result4);

		double result5 = (double) intValue1 % intValue2;
		System.out.println("Resto della divisione: " + result5);

		double doubleValue = -3.99999;
		
		//uso della classe Math
		long rounded = Math.round(doubleValue);
		System.out.println("Arrotondamento: " + rounded);
		
		//uso della classe Math
		double absValue = Math.abs(doubleValue);
		System.out.println("Valore assoluto: " + absValue);
		
	}

}
