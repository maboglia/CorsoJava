# casting - conversione forzata del tipo

```java
public class CastIntByte {

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
      }
}
```

---

```java
public class CastDoubleInt {

	public static void main(String[] args) {
		
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
		
      }
}
```

---

```java
public class CastAritmetico {

	public static void main(String[] args) {
		
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
      }
}
```

---

```java
public class CastMath {

	public static void main(String[] args) {
		
		//uso della classe Math
		long rounded = Math.round(doubleValue);
		System.out.println("Arrotondamento: " + rounded);
		
		//uso della classe Math
		double absValue = Math.abs(doubleValue);
		System.out.println("Valore assoluto: " + absValue);
      }
}
```

---

```java
public class CastEsercizi {

	public static void main(String[] args) {
		
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
```

---

```java
      double a;
      float  b, c;

      a = 2.5f;
      b = 3.4f;

      c = a + b;       // Errore...

```

---

```java
      short a, b, c;

      a = 2;
      b = 3;

      c = a + b;       // Errore...

```

---

```java
      long a;
      int b, c;

      a = 2;
      b = 3;

      c = a + b;       // Errore...

```

---

```java
      short a, b;

      a = 2;
      b = -a;       // Errore...

```

---

```java
        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("Il 2° valore è " + intValue2);

        long longValue1 = intValue1;
        System.out.println("Il valore long è " + longValue1);

        short shortValue1 = (short) intValue1;
        System.out.println("Il valore short è " + shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("Il valore byte è " + byteValue);

        double doubleValue = 3.999999d;
        int intValue4 = (int) doubleValue;
        System.out.println("Conversione da double a int: " + intValue4);


```

---

```java
      float x;                // floating point
      double y;               // double precision floating point

      x = 3.1415927f;         // f denotes "float"

      y = (double) x;

      System.out.print("single precision x = ");
      System.out.println(x); 
      System.out.print("double precision y = ");
      System.out.println(y); 

      x = (float) y;

      System.out.print("Re-converted single precision x = ");
      System.out.println(x); 

```

---

```java
      float x;               // floating point
      double y;              // double precision floating point

      y = 3.14159265358979;

      x = (float) y;

      System.out.print("double precision y = ");
      System.out.println(y); 
      System.out.print("single precision x = ");
      System.out.println(x); 

      y = (double) x;

      System.out.print("Re-converted double precision y = ");
      System.out.println(y); 

```

---

```java

    int valoreInt1 = 32770;
    int valoreInt2 = valoreInt1;

        System.out.println("il 2° valore è: " + valoreInt2);

        //long è più grande di int
    long valoreLong1 = valoreInt1;
        System.out.println("il valore long è: "+valoreLong1);

        //short è più piccolo di int, occore un cast
        //System.out.println(Short.MAX_VALUE);
    short valoreShort = (short) valoreInt1;

        System.out.println(valoreShort);


    int valoreInt3 = 1024;
        byte valoreByte = (byte) valoreInt3;
        System.out.println(valoreByte);


    double valoreDouble = 3.999999d;
        int valoreInt4 = (int) valoreDouble;
        System.out.println(valoreInt4);

 
```

---

## Casting caratteri

```java
public class CastCaratteri {

	public static void main(String[] args) {

		char c4;
		for (int i = 0; i < 3000; i++){
			c4 = (char) i;
			//System.out.println("carattere n. " + i + " vale " + c4);
		}
		char c5 = 65 + 57; //122
		System.out.println(c5);
	}
}
```


---

## Promotion

```java
public class Promotion {

	public static void main(String[] args) {

		int valore1 = 56;
		int valore2 = valore1;
		
		System.out.println(valore2);
		
		//promozione
		long valoreLong1 = valore1;
		System.out.println(valoreLong1);
	}

}
```


---
