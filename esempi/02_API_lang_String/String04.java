public class String04
{
   public static void main(String[] args)
   {
      String s1, s2;

      int    x = 12;
      double y = 3.1415;

      System.out.print("x + y = ");
      System.out.println( x + y );   // Add numbers

      s1 = Integer.toString(x);
      s2 = Double.toString(y);
      System.out.print("s1 + s2 = ");
      System.out.println( s1 + s2 );   // + on String is concatenation   
   }
}

