# casting - conversione forzata del tipo

```java

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

```



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
