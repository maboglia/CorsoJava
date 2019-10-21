public class Char01A
{
   public static void main(String[] args)
   {
      char a, b;
      int  i;
 
      a = 'x';
      i = a;
      System.out.println(i);    // Prints 120 (ASCII code for 'x')

      a = 'x';
      i = a+1;
      System.out.println(i);    // Prints 121

      a = 'x';
      b = 'y';
      i = a + b;
      System.out.println(i);    // Prints 241 (ASCII code for 'y' = 121)
   }
}

