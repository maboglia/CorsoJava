/* Programma che mette in evidenza l'aspetto
   della durata (lifetime) delle variabili */ 
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