## Esercizi sui metodi ausiliari

### Es. 1: 
Scrivere un programma **Ripeti** che chiede all’utente di inserire una stringa e un numero intero positivo. 

Entrambe le cose dovranno essere passate a un metodo ausiliario che stamperà tante copie della stringa quante indicate nel numero inserito dall’utente. 

Se il numero inserito dall'utente è negativo il metodo ausiliario stamperà "ERRORE: numero negativo". 

Il nome del metodo ausiliario può essere scelto a piacere.

### Es. 2: 
Scrivere un programma "**TuttiUguali**" che chiede all'utente di inserire tre numeri e stampa "Tutti uguali!" se i tre numeri sono tutti uguali,altrimenti stampa "Almeno uno e' diverso".

Il controllo che i tre numeri siano uguali dovrà essere fatto da un metodo ausiliario, mentre il messaggio dovrà essere stampato dal metodo main.


### Es. 3: 
Scrivere un programma **MezziCasuali** che stampa un numero frazionario ottenuto come risultato della chiamata di un metodo ausiliario che al suo interno richiama il metodo di libreria Math.random(). 

Se il risultato di Math.random() e minore di 0.5 il metodo lo restituisce cosı com'e. 

Se invece il risultato di Math.random() e maggiore o uguale a 0.5 il metodo lo restituisce diminuito di 0.5. 

Il nome del metodo ausiliario può essere scelto a piacere.

### Es. 4: 
Scrivere un programma **Concatena** che chiede all'utente di inserire tre singole parole e le ristampa interponendovi un asterisco.

Per esempio, se l'utente inserisce "gatto", "cane" e "topo" il programma stamperà gatto*cane*topo.

Per concatenare le tre parole si utilizzi un metodo ausiliario che prende due stringhe e restituisce la stringa ottenuta concatenando la prima parola ricevuta, un asterisco e la seconda parola ricevuta.


## Esercizio 11
Scope
Provare ad eseguire il programma su carta e,
successivamente, verificare la risposta eseguendo
il programma su calcolatore:

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

## Esercizio 12
Lifetime
Provare ad eseguire il programma su carta e,
successivamente, verificare la risposta eseguendo
il programma su calcolatore:

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

## Esercizio 13
Che cosa visualizza il programma seguente?
Provare ad eseguire il programma su carta e,
successivamente, verificare la risposta
eseguendo il programma su calcolatore:

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

## Esercizio 14
Che cosa visualizza il programma seguente?
Provare ad eseguire il programma su carta e,
successivamente, verificare la risposta
eseguendo il programma su calcolatore:

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

## Esercizio 15
Overloading
Che cosa visualizza il programma seguente?
Provare ad eseguire il programma su carta e,
successivamente, verificare la risposta
eseguendo il programma su calcolatore:

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
