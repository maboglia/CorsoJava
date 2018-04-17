
public class FloatEq2
{
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
         System.out.println("a is (approximately) equal to b");
      }
      else
      {
         System.out.println("a is NOT (approximately) equal to b");
      }
   }
}
