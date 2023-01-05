class EsercizioScope2 {

  static int x, y;

  static int metodo1(int x) {
    y = ++x;
    System.out.println("metodo1 " + x + " " + y);
    return x + y;
  }

  static void metodo2() {
    int y = 2;
    y = metodo1(y);
    x = y++; 
    System.out.println("metodo2 " + x + " " + y);
  }

  public static void main (String[] args) {
    x = 0;
    y = 0;
    metodo2();
    System.out.println("main " + x + " " + y);
  }
}
