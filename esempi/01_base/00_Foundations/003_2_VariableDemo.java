/**
   Dichiarazione e assegnamento di valore a una variavile
*/
   public static void main(String[] args)
   {
      int base = 10; // Dichiara base la inizializza a 10
      System.out.print("base: ");
      System.out.println(base);

      base = 20; // Modifica il valore di base a 20
      System.out.print("base: ");
      System.out.println(base);

      int height = 20;
      base = height + 10; // il valore può essere anche un'espressione
      System.out.print("base: ");
      System.out.println(base);

      base = base + 10; // la stessa variabile può essere usata per modificare il proprio valore
      System.out.print("base: ");
      System.out.println(base);      
   }