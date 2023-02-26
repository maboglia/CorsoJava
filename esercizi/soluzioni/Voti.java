/* Una classe di 10 studenti ha sostenuto un esame. I voti
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
}