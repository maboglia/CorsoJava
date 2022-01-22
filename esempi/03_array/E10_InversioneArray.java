/* Programma per invertire un array */
class E10_InversioneArray {
  public static void main (String[] args) {
    int temp, i, a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    for (i = 0; i <= (a.length - 1) / 2; i++) {
      temp = a[i];
      a[i] = a[a.length - 1 - i];
      a[a.length - 1 - i] = temp;
    }
    for (i = 0; i <= a.length - 1; i++)
      System.out.println(a[i]);
  }
}