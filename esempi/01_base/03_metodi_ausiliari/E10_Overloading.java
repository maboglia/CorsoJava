/* Nel seguente programma si fa uso del
   sovraccarico dei metodi (methods
   overloading) */
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