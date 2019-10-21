/* Programma per stampare 44 caratteri in fila per 6 con 
   resto di 2 */
import java.io.*;
class Gatti {
  public static void main (String[] args) throws IOException {
    char c;
    for (int i = 1; i <= 44; i++) {
      c = (char) System.in.read();
      System.out.print(c);
      if (i % (44 / 6) == 0)
        System.out.println();
    }
    System.out.println();
  }
}

/* Esempio
   java Gatti
   quarantaquattrogattiinfilaperseiconrestodidue
   quarant
   aquattr
   ogattii
   nfilape
   rseicon
   restodi
   du
*/