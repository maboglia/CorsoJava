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
   quarantaquattrogattiinfilaperseiconrestodidu
   quarant
   aquattr
   ogattii
   nfilape
   rseicon
   restodi
   du
*//* Una classe di 10 studenti ha sostenuto un esame. I voti
   sono espressi con lettere: 'O' = ottimo (corrispondente
   al 10), 'B' = buono (8), 'S' = sufficiente (6),
   'I' = insufficiente (4). Il seguente programma consente
   il calcolo della media aritmetica dei voti di tale esame */
import java.io.*;
class Voti {
  public static void main (String[] args) throws IOException {
    int voto, media, i;
    media = 0;
    i = 1;
    while (i <= 10) {
      voto = System.in.read();
      if (voto == 'O')
        media = media + 10;
      else if (voto == 'B')
        media = media + 8;
      else if (voto == 'S')
        media = media + 6;
      else if (voto == 'I')
        media = media + 4;
      i = i + 1;
    }
    media = media / 10;
    System.out.print("Media = ");
    System.out.println(media);
  }
}// Programma che determina il maggiore di 4 caratteri
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
}/* Programma che implementa la ricerca binaria di un 
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
}/* Programma che implementa l'algoritmo di ordinamento
   per selezione */
import java.io.*; 
class OrdinamentoSelezione { 
  public static void main (String[] args) throws IOException { 
    final int N = 10; 
    char temp, a[] = new char[N];

    for (int i = 0; i < N; i++)
      a[i] = (char) System.in.read();
    for (int i = 0; i < N - 1; i++)
      for (int j = i; j < N; j++)
        if (a[i] > a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
    for (int i = 0; i < N; i++)
      System.out.print(a[i]);
  }
}/* Programma che stampa i caratteri letti da tastiera ed i
   relativi codici ASCII */
import java.io.*;
class Prova {
  public static void main (String[] args) throws IOException {
    int[] a = new int[10];
    for (int i = 0; i <= a.length - 1; i++)
      a[i] =  System.in.read();
    for (int i = 0; i <= a.length - 1; i++)
      System.out.println((char)a[i] + " " + a[i]);
  }
}
/* Programma per invertire un array */
class InversioneArray {
  public static void main (String[] args) {
    int temp, i, a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    for (i = 0; i <= (a.length - 1) / 2; i++) {
      temp = a[i];
      a[i] = a[a.length - 1 - i];
      a[a.length - 1 - i] = temp;
    }
    for (i = 0; i <= a.length - 1; i++)
      System.out.println(a[i]);
  }
}/* Programma per disegnare l'istogramma di un array
   di interi */
class Istogramma {
  public static void main (String[] args) {
    int i, j;
    int[] frequenze = {3, 5, 9, 6, 7, 1, 20, 5, 9, 4, 3, 2};

    for (i = 0; i < frequenze.length; i++) {
      System.out.print(i);
      System.out.print(": \t");
      for (j = 1; j <= frequenze[i]; j++)
        System.out.print('*');
      System.out.println();
    }
  }
}