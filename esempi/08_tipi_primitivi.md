# Tipi primitivi

---

## 

```java
public class TipiPrimitivi {

    public static void main(String[] args) {
   /* I tipi primitivi in Java sono 8 */

        // 4 tipi per rappresentare numeri interi
        byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1L;

        // 2 per rappresentare numeri con virgola
        float f = 1f;
        double d = 1d;

        // ultimi due tipi primitivi, non numerici
        char c = 'a'; // attenzione: uso gli apici singoli
        boolean bo = true; // solo due valori: true o false

        // stampo a video sono i tipi primitivi numerici
        System.out.println("Byte: " + b);
        System.out.println("Short: " + sh);
        System.out.println("Integer: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        
        // stampo a video i tipi primitivi NON numerici
        System.out.println(c);
        System.out.println(bo);
    }

}

```

---

## Caratteri: il singolo char

```java
public class Caratteri {

    public static void main(String[] args) {

        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        System.out.println("Carattere 1: " + c1);
        System.out.println("Carattere 2: " + c2);
        System.out.println("Carattere 3: " + c3);

        char dollaro = '\u0024';
        System.out.println("Valuta: " + dollaro);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        //uso la classe wrapper e i suoi metodi
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

    }

}

```

---

## Double: precisione decimale

```java
import java.math.BigDecimal;

public class PrecisioneDecimale {

    public static void main(String[] args) {

        double valore = .012;

        double primitiviSomma = valore + valore + valore;

        System.out.println("Somma di primitivi: " + primitiviSomma);

        String stringaValore = Double.toString(valore);
        System.out.println("stringaValore: " + stringaValore);
        BigDecimal bigDecimalValore = new BigDecimal(stringaValore);

        BigDecimal bigSomma = bigDecimalValore.add(bigDecimalValore).add(bigDecimalValore);

        System.out.println("Somma di BigDecimal: " + bigSomma.toString());

    }

}
```

---

## Rappresentare i numeri reali

```java
public class Reali {
	public static void main(String[] args) {
		
		float f;
		double d = 3.14;
		
		f =  1.5f;
		
		if (    d > 3  || d != 3.14    ) {
			System.out.println("d è maggiore di 3");
		} 
		else if (d > 3.14) {
			System.out.println("d è uguale a 3.14");
		}
		else {
			System.out.println("d è NON maggiore di 3");
		}
	}
}
```

---

## tit

```java
public static void main(String[] args) {
  
  //dichiarazione ed inizializzazione
  boolean a, b = false;
  //inizializzazione
  a = true;
  
  if (a == b)
   System.out.println("a e b sono uguali");
  else
   System.out.println("a e b sono diversi");
   
  
  

 }

```

---

## tit

```java
public class Booleani {
    //variabile esterna al metodo main, quindi statica...
    static boolean b3;

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        boolean b4 = !b1;
        System.out.println("b4 vale: " + b4);

        int i1 = 0;
        boolean b5 = (i1 != 0);
        System.out.println(b5);

        String sBool = "true";
        boolean parsed = Boolean.parseBoolean(sBool);
        System.out.println(parsed);
    }
}
```

---

## tit

```java
public class Booleani {

 public static void main(String[] args) {
  
  
  boolean presente;
  
  boolean test = false;
  
  
  if (!test) {
   System.out.println("falso");
  }
  
  presente = true;
  presente = false;
  

 }

}

```

---

## tit

```java
public class Booleani {

 //dichiarazione di variabile statica (di classe), non la inizializzo!
 static boolean valoreBooleanoStatico;

 public static void main(String[] args) {
  
  //dichiarazione
  //dichiarazione ed inizializzazione
  boolean a, b = false;

  a = true;
  
  if (a == b)
   System.out.println("a e b sono uguali");
  else
   System.out.println("a e b sono diversi");
   
  a = true;
  System.out.println(a);

  a = false;
  System.out.println(a);

  a = (3 > 1);
  System.out.println(a);

  a = (3 <= 1);
  System.out.println(a);  

  
  //esempio 3

  boolean b1 = true;
  boolean b2 = false;

  System.out.println("Il valore di b1 è: " + b1);
  System.out.println("Il valore di b2 è: " + b2);
  System.out.println("Il valore di valoreBooleanoStatico è: " + valoreBooleanoStatico);

  boolean b3 = !b1;
  System.out.println("Il valore di b3 è: " + b3);

  int i1 = 0;
  boolean b4 = (i1 != 0);
  System.out.println("Il valore di b4 è: " + b4);

  String stringaBoolean = "true";
  boolean parsed = Boolean.parseBoolean(stringaBoolean);
  System.out.println("Dopo il parsing: " + parsed);  


 }

}
```

---

## tit

```java

```

---

## tit

```java

```

---

## tit

```java

```

---

## tit

```java

```

---

## tit

```java

```

---

## tit

```java

```
