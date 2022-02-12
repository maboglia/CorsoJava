/* Che cosa visualizza il programma seguente?
   Provare ad eseguire il programma su carta e,
   successivamente, verificare la risposta
   eseguendo il programma su calcolatore */
class EsercizioScope3 {
  static int a = 10, b = 15;
  public static void m1 (int a) {
    int i = 4;
    System.out.println(a + i + b);
    m2(a);
  }
  public static void m2 (int b) {
    System.out.println(a + b);
  }
  public static void main (String args[]) {
    int i = 1;
    m1(i);
    i = i + 1;
    a = 0;
    m2(i);
  } 
}
