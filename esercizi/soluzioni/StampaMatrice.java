/* Nel seguente programma e' definito e
   usato il metodo stampaM (con un parametro
   di tipo array) per visualizzare in formato
   incolonnato il contenuto di una matrice
   bidimensionale */
class StampaMatrice {

  static void stampaM(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++)
        System.out.print(m[i][j] + "\t");
      System.out.println();
    }
  }

  public static void main (String[] args) {
    int[][] matrice = { {12, 23, 23, 5678}, 
                        {987, 87 , 3, 0},
                        {12354,34,2,0}};
    stampaM(matrice);
  }
}