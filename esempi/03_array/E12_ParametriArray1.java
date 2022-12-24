/* Passaggio dei parametri per riferimento
   (o indirizzo) */
class ParametriArray1 {

  static void f(int[] a) {
    for (int i = 0; i < a.length; i++)
      a[i] = 0;
  }

  public static void main (String[] args) {
    int[] vettore = { 1, 2, 3 };
    for (int i = 0; i < vettore.length; i++)
      System.out.println(vettore[i]);
    f(vettore);
    for (int i = 0; i < vettore.length; i++)
      System.out.println(vettore[i]);
  }
}