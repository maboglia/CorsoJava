/* Programma che legge due numeri interi e ne
   stampa la somma */
class Ingresso {

  static int leggiIntero() {
    byte[] b = new byte[9];
    int res = 0;

    try {
      System.in.read(b);
    } catch (Exception e) {}
    for (int i = 0; i < b.length; i++)
      if (b[i] >= '0' && b[i] <= '9')
        res = res * 10 + b[i] - '0';
      else
        break;
    return res;
  }

  public static void main (String[] args) {
    int x,y;
    System.out.print("Inserisci un numero intero: ");
    y = leggiIntero();
    System.out.print("Inserisci un numero intero: ");
    x = leggiIntero();
    System.out.println(x + y);
  }
}
