/* Programma che converte una sequenza di caratteri
   letti in input nei corrispondenti caratteri
   maiuscoli */
import java.io.*;
class ConvertiMetodo {

  static char convertiInMaiuscolo(char c) {
    if (c < 'a' || c > 'z')
      return(c);
    else 
      return ((char) (c + 'A' - 'a'));
  }
  
  public static void main (String[] args) throws IOException {
    char carattere;
    do {
      carattere = (char) System.in.read();
      System.out.print(convertiInMaiuscolo(carattere));
    } while (carattere != '\n');
  }
}
