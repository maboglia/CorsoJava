// Programma che determina il maggiore di 4 caratteri
import java.io.*;
class Max {
  public static void main (String[] args) throws IOException {
    char a, b, c, d, max;

    a = (char) System.in.read();
    b = (char) System.in.read();
    c = (char) System.in.read();
    d = (char) System.in.read();
    if (a > b && a > c && a > d)
      max = a;
    else if (b > a && b > c && b > d)
      max = b;
    else if (c > a && c > b && c > d)
      max = c;
    else
      max = d;
    System.out.println(max);
  }
}