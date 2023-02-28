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
