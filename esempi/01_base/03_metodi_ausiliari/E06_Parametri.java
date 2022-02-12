/* Programma contenente un metodo che incrementa
   il valore di una variabile */
class Parametri {

  static int inc(int x) {
    return (x + 1);
  }

  public static void main (String[] args) {
    int y = 0;
    y = inc(y);
    System.out.println(y);
  }
}