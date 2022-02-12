/* Che cosa visualizza il programma seguente?
   Provare ad eseguire il programma su carta e,
   successivamente, verificare la risposta
   eseguendo il programma su calcolatore */
class EsercizioScope1 {

  static int x, y;

  static int metodo1(int x) {
    x = 1;
    y = 1;
    System.out.println("metodo1 " + x + " " + y);
    return x + y;
  }

  static void metodo2() {
    int y;
    x = 2; 
    y = metodo1(x);
    System.out.println("metodo2 " + x + " " + y);
  }

  public static void main (String[] args) {
    x = 0;
    y = 0;
    metodo2();
    System.out.println("main " + x + " " + y);
  }
}