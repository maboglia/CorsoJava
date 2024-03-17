# Esercizi sulla comprensione del codice

Provare ad eseguire il programma su carta e, successivamente, verificare la risposta eseguendo il programma su calcolatore

## 0.22. Esercizio Scope 


```java
class Nascoste {
  static int x,y; //Def. var. globali

  static void f() {
    int x;
    x = 1;  // Locale
    y = 1;  // Globale
    System.out.println(x);
    System.out.println(y);
  }

  public static void main (String[] args) {
      x = 0; // Globale
      y = 0; // Globale
      f();
      System.out.println(x);
      System.out.println(y);
  }
}
```

---

## 0.23. Esercizio Lifetime 


```java

class Automatiche {

  static void f() {
    int i = 0;
    i++;
    System.out.println(i);
  }

  public static void main (String[] args) {
    f();
    f();
  }
}
```

---

## 0.24. Esercizio Che cosa visualizza il programma seguente?


```java
class EsercizioScope1 {


  static int x, y;

  static int metodo1(int x) {
    x = 1;
    y = 1;
    System.out.println("metodo1 " + x + " " + y);
    return x + y;
  }

  static void metodo2() {
    int y;
    x = 2; 
    y = metodo1(x);
    System.out.println("metodo2 " + x + " " + y);
  }

  public static void main (String[] args) {
    x = 0;
    y = 0;
    metodo2();
    System.out.println("main " + x + " " + y);
  }
}
```

---

## 0.25. Esercizio Che cosa visualizza il programma seguente?


```java

class EsercizioScope2 {


  static int x, y;

  static int metodo1(int x) {
    y = ++x;
    System.out.println("metodo1 " + x + " " + y);
    return x + y;
  }

  static void metodo2() {
    int y = 2;
    y = metodo1(y);
    x = y++; 
    System.out.println("metodo2 " + x + " " + y);
  }

  public static void main (String[] args) {
    x = 0;
    y = 0;
    metodo2();
    System.out.println("main " + x + " " + y);
  }
}
```

## 0.26. Esercizio Overloading

Che cosa visualizza il programma seguente?

```java

class Overloading {

  static int quarta (int x) {
    return x * x * x * x;   
  }

  static double quarta (double x) {
    return x * x * x * x;
  }

  public static void main (String[] args) {
    int a = 3; 
    double b = 3.7;
    System.out.println(quarta(a));
    System.out.println(quarta(b));
  }
}
```

## Si dica cosa stampa il seguente programma, motivando la risposta

```java
public class A {
  private int n;
  public A(int n) {
    this.n=n;
  }
  public int getN() {
    return n;
  }
  public double calcola(int m) {
    return n+m;
  }
  public double calcola(double m) {;
    return n+m+1;
  }
}
public class B extends A {
  public B(int n) {
    super(n);
  }
  public double calcola(int m) {
    return getN() + m + 10;
  }
}
public class C extends B{
  public C(int n) {
    super(n);
  }
  public double calcola(int m) {
    return getN() + m + 100;
  }
}

public class Test {
  public static void main(String[] args) {
    C c = new C(2);
    B b = new B(5);
    A a = b;
    System.out.println(c.calcola(a.calcola(0)));
  }
}
```


Si dica cosa stampa il seguente programma, motivando la risposta.

```java
public class A {
private int a=10;
int calcola(int n) throws Exception {
if (n==0) throw new Exception("ERRORE A");
return n+a;
}
}
public class B extends A {
int calcola(int n) throws Exception {
if (n==1)
throw new Exception("ERRORE B");
return 2*n+super.calcola(n+1);
}
}
public class Test {
public static void main(String[] args) {
B b = new B();
A a = b;
try {
System.out.println(a.calcola(0));
System.out.println(a.calcola(1));
System.out.println(b.calcola(0));
System.out.println(b.calcola(1));
}
catch (Exception e) {
System.out.println(e.getMessage());
}
System.out.print("END");
}
}
```

Si dica cosa stampa il seguente programma, motivando la risposta.
```java
public class A {
private int n=1;
public int calcola(int a) {
return n+a;
}
}
public class B extends A {
public B() {
super();
}}
public int calcola(int a) {
return super.calcola(a)+1;
}
public class Test {
public static void main(String[] args) {
A[] a = new A[2];
a[0] = new A();
a[1] = new B();
}
}
System.out.println(a[0].calcola(10));
System.out.println(a[1].calcola(10));
```

Si dica cosa stampa il seguente programma motivando la risposta e indicando, per ogni chiamata
ad un metodo, la lista delle firme candidate.

```java
public class
A {
public int m(A a, B b) {return 2; };
public int m(B a, B b) {return 10; };
public B m(B c, A b) {return c; }
} 

public class B extends A {
public int m(A a, B b) {return 3; }
public A m(C c, B b) {return b; }
public Object m(C c, Object o) {return o; }
} 

public class C extends B {
public A m(C c, A a) {return c; }
public int m(B a, B b) {return 5; }
}
public class Test {
public static void main(String[] args) {
C gamma = new C();
B beta = gamma;
A alfa = gamma;
System.out.println(alfa.m(beta, beta));
System.out.println(gamma.m(beta.m(gamma, beta),beta));
}
}
```

Si dica cosa stampa il seguente programma, motivando la risposta.public class A {
```java
private int n;
public A(int n) {
this.n=n;
}
public int getN() {
return n;
}
public void setN(int n) {
this.n=n;
}
public double calcola(int m) {
n= n + m;
return n;
}
public double calcola(double m) {
return n + m + 5;
}
}

public class B extends A {
public B(int n) {
super(n);
}
public double calcola(int m) {
setN(getN() * m);
return getN();
}
}

public class Appello1 {
public static void main(String[] args) {
int i = 2;
int k = 3;
B b = new B(i);
A a = b;
System.out.println(a.calcola(k));
System.out.println(b.calcola(b.calcola(k)));
}
}
```

---

## Codice errato o incompleto: correggi gli errori

---

## Esercizio 1

Il seguente programma contiene un errore. Osservare l’errore segnalato dal compilatore e
correggere di conseguenza il programma.

```java
public class XY {
    public static void main ( String [] args ) {
        x = 10;
        y = 5;
        // calcola la somma di x e y
        System.out.println( x + y );
    }
}
```

---

## Esercizio 2

Il seguente programma contiene un errore. Osservare l’errore segnalato dal compilatore e
correggere di conseguenza il programma.

```java
public class Totale1 {
    public static void main ( String [] args ) {
        int x = 10;
        int y = 5;
        int z = 8;
        // calcola il totale di x , y e z in due passi
        int totale = x + y ;
        int totale = totale + z ;
        System.out.println( totale );
    }
}
```

---

## Esercizio 3

Il seguente programma contiene un errore. Osservare l’errore segnalato dal compilatore e
correggere di conseguenza il programma.

```java
```java
public class Totale2 {
    public static void main ( String [] args ) {
        int x ,y , z ;
        int somma ;
        x =10;
        y =5;
        somma = x + y ;
        int totale ;
        totale = somma + z ;
        System.out.println( totale );
    }
}
```

---

## Completare il seguente programma Scambia aggiungendo i comandi mancanti al posto dei puntini

Occorre fare in modo che i due numeri inseriti dall’utente vengano stampati in ordine inverso dal programma.

```java
import java . util . Scanner ;
public class Scambia {
    public static void main ( String [] args ) {
        Scanner input = new Scanner ( System . in );
        int x , y ;
        System.out.println( " Inserisci il primo numero : " );
        x = input . nextInt ();
        System.out.println( " Inserisci il secondo numero : " );
        y = input . nextInt ();
        // inserire i comandi mancanti qui
        ........
        System.out.println( " Ecco i numeri inseriti in ordine inverso : " );
        System.out.println( x );
        System.out.println( y );
    }
}
```
