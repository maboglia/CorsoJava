/* Programma che legge i valori di due matrici in input,
   ne effettua il prodotto e stampa il risultato */
class ProdottoMatrici {

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

  static void leggiMatrice(int[][] m) {
    for (int i = 0; i < m.length; i++) 
      for (int j = 0; j < m[i].length; j++) {
        System.out.print("m[" + i + "][" + j + "] = ");
        m[i][j] = leggiIntero();
      }
  }

  static void prodottoMatrice(int[][] A, int[][] B, int[][] C) {
    for (int i = 0; i < C.length; i++)
      for (int j = 0; j < C[i].length; j++)
        C[i][j] = 0;
    for (int i = 0; i < C.length; i++)
      for (int j = 0; j < C[i].length; j++)
        for (int k = 0; k < B.length; k++)
          C[i][j] = C[i][j] + A[i][k] * B[k][j];
  }

  static void stampaMatrice(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++)
        System.out.print(m[i][j] + "\t");
      System.out.println();
    }
  }

  public static void main (String[] args) {
    int m1[][], m2[][], m3[][], righeM1, righeM2;
    System.out.print(
      "Numero di righe di m1 (o di colonne di m2): ");
    righeM1 = leggiIntero();
    System.out.print(
       "Numero di colonne di m1 (o di righe di m2): ");
    righeM2 = leggiIntero();
    m1 = new int[righeM1][righeM2];
    m2 = new int[righeM2][righeM1];
    m3 = new int[righeM1][righeM1];
    System.out.println("Valori di m1: ");
    leggiMatrice(m1);
    System.out.println("Valori di m2: ");
    leggiMatrice(m2);
    prodottoMatrice(m1, m2, m3);
    System.out.println("m1: ");
    stampaMatrice(m1);
    System.out.println("m2: ");
    stampaMatrice(m2);
    System.out.println("m3: ");
    stampaMatrice(m3);
  }
}