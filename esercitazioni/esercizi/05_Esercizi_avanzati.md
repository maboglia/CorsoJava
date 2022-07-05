# Esercizi Java - Metodi avanzati


---

## Esercizio

Dato un elenco di N dipendenti inserire, per ciascuno di essi, nome, cognome e stipendio.
Stampare l'elenco di quelli che guadagnano più di € 1.000 ed, in fine, nome, cognome e
stipendio del dipendente con stipendio massimo.

---

## Esercizio

Un azienda vuole effettuare una statistica sugli stipendi pagati mensilmente ai dipendenti. Di
ciascun dipendente si conoscono i seguenti dati:
* cognome e nome,
* stipendio mensile.
Dopo aver stampato il tabulato:
si vogliono ottenere i seguenti dati statistici:
* stipendio mensile medio,
* numero dipendenti con stipendio mensile maggiore di € 2.000,
* cognome, nome e stipendio del dipendente che percepisce lo stipendio più alto.

---

## Esercizio

Per N città vengono registrate le temperature massime e minime di una giornata.
Stampare una tabella con:

* nome della città,
* temperatura massima,
* temperatura minima
* ed alla fine stampare il nome della città più calda e di quella più fredda.

---

## Esercizio 1

Provare ad eseguire il programma su carta e,
successivamente, verificare la risposta eseguendo
il programma su calcolatore:

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

## Esercizio 2
Provare ad eseguire il programma su carta e,
successivamente, verificare la risposta eseguendo
il programma su calcolatore:

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

## Esercizio 3
Che cosa visualizza il programma seguente?
Provare ad eseguire il programma su carta e,
successivamente, verificare la risposta
eseguendo il programma su calcolatore:

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

## Esercizio 4
Che cosa visualizza il programma seguente?
Provare ad eseguire il programma su carta e,
successivamente, verificare la risposta
eseguendo il programma su calcolatore:

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

## Esercizio 5
Overloading
Che cosa visualizza il programma seguente?
Provare ad eseguire il programma su carta e,
successivamente, verificare la risposta
eseguendo il programma su calcolatore:

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