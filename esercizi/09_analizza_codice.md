# Esercizi sulla comprensione del codice

Provare ad eseguire il programma su carta e, successivamente, verificare la risposta eseguendo il programma su calcolatore

## 0.22. Esercizio

Scope Provare ad eseguire il programma su carta e, successivamente, verificare la risposta eseguendo il programma su calcolatore:

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

## 0.23. Esercizio

Lifetime Provare ad eseguire il programma su carta e, successivamente, verificare la risposta eseguendo il programma su calcolatore:

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

## 0.24. Esercizio

Che cosa visualizza il programma seguente? Provare ad eseguire il programma su carta e, successivamente, verificare la risposta eseguendo il programma su calcolatore:

---

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

## 0.25. Esercizio

Che cosa visualizza il programma seguente? Provare ad eseguire il programma su carta e, successivamente, verificare la risposta eseguendo il programma su calcolatore:

---

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

---

## 0.26. Esercizio

Overloading Che cosa visualizza il programma seguente? Provare ad eseguire il programma su carta e, successivamente, verificare la risposta eseguendo il programma su calcolatore:

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
