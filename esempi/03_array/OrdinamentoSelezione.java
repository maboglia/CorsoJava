/* Programma che implementa l'algoritmo di ordinamento
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
}