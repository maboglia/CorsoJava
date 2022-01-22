/* Programma per disegnare l'istogramma di un array
   di interi */
class E11_Istogramma {
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