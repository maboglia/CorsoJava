   public static void main(String[] args)
   {
      double a, b;
      int i;

      a = 4.0;

      b = 4.0/7.0 + 4.0/7.0 + 4.0/7.0 + 4.0/7.0 + 4.0/7.0 + 4.0/7.0 + 4.0/7.0;

      System.out.println("a = " + a);
      System.out.println("b = " + b);

      if ( Math.abs(b-a) < 0.000000001 )
      {
         System.out.println("a è (approssimativamente) uguale a b");
      }
      else
      {
         System.out.println("a NON è (approssimativamente) uguale a b");
      }
   }