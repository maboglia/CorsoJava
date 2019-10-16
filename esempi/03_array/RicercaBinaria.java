/* Programma che implementa la ricerca binaria di un 
   elemento in un array */
import java.io.*;
class RicercaBinaria {
  public static void main (String[] args) throws IOException {
    final int N = 10;
    int p, q, m;
    char x;
    char[] a = 
      {'a', 'b', 'c', 'd', 'f', 'g', 'h', 'i', 'j', 'k'};
    for (int i = 0; i < N; i++)
      System.out.print(a[i]);
    System.out.print("\nInserisci l'elemento da trovare: ");
    x = (char) System.in.read();
    p = 0;
    q = N - 1;
    System.out.println("p\tm\tq");
    do {
      m = (p + q) / 2;
      System.out.println(p + "\t" + "\t" + q);
      System.out.println("\t" + m);
      if (a[m] < x)
        p = m + 1;
      if (a[m] > x)
        q = m - 1;
    } while (a[m] != x && p <= q);
    if (a[m] == x)
      System.out.println(x + " trovato in posizione " + m);
    else
      System.out.println(x + " non trovato");
  }
}