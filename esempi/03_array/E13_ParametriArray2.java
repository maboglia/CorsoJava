/* Singolo elemento di un array passato
   per valore */
class ParametriArray2 {

  static void m(int a) {
      a = 0;
  }

  public static void main (String[] args) {
    int[] vettore = {1, 1, 1};

    m(vettore[1]);
    System.out.println(vettore[1]);
  }
}