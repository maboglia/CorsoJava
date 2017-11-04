package esempi.week11;

public class TipiCasting {

	public static void main(String[] args) {
		

		int valore1 = 56;
		int valore2 = valore1;
		
		System.out.println(valore2);
		
		//promotion
		long valoreLong1 = valore1;
		System.out.println(valoreLong1);
		
		//casting
		short valoreShort1 = (short) valore1;
		System.out.println(valoreShort1);

		int valore3 = 1024;
		byte valoreByte1 = (byte) valore3;
		System.out.println(valoreByte1);
		
		double valoreDouble1 = 3.999999d;
		int  valore4 = (int) valoreDouble1;
		System.out.println(valore4);
		

        int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("Addition: " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("Subtraction: " + result2);

        int result3 = intValue1 * intValue2;
        System.out.println("Multiplication: " + result3);

        double result4 = (double) intValue1 / intValue2;
        System.out.println("Division: " + result4);

        double result5 = (double) intValue1 % intValue2;
        System.out.println("Remainder: " + result5);

        double doubleValue = -3.99999;
        long rounded = Math.round(doubleValue);
        System.out.println("Rounded: " + rounded);

        double absValue = Math.abs(doubleValue);
        System.out.println("Absolute: " + absValue);
		
		
	}

}
