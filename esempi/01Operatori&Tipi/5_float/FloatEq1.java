
public class FloatEq1
{
   public static void main(String[] args)
   {
      double a, b;
      int i;

      a = 4.0;

      b = 4.0/7.0 + 4.0/7.0 + 4.0/7.0 + 4.0/7.0 + 4.0/7.0 + 4.0/7.0 + 4.0/7.0;

      System.out.println("a = " + a);
      System.out.println("b = " + b);

      if ( a == b )
      {
         System.out.println("a is equal to b");
      }
      else
      {
         System.out.println("a is NOT equal to b");
      }
   }
}
