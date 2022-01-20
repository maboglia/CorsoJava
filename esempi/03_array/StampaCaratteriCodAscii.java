/* Programma che stampa i caratteri letti da tastiera ed i
   relativi codici ASCII */
import java.io.*;
class StampaCaratteriCodAscii {
  public static void main (String[] args) throws IOException {
    int[] a = new int[10];
    for (int i = 0; i <= a.length - 1; i++)
      a[i] =  System.in.read();
    for (int i = 0; i <= a.length - 1; i++)
      System.out.println((char)a[i] + " " + a[i]);
  }
}
