/* Programma che mette in evidenza l'aspetto
   della visibilità (scope) delle variabili */   
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
