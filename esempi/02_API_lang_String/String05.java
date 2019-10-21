public class String05
{
   public static void main(String[] args)
   {
      String a, b;
      int    x;

      a = "abc"; 
      x = -12;

      b = a + x;
      System.out.println(b);           // Prints "abc-12"

      b = x + a;
      System.out.println(b);           // Prints "-12abc"
   }
}

