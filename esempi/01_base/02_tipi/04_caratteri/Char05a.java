public class Char05a
{
   public static void main(String[] args)
   {
      char x;
      char y;
 
      x = 'a';
      y = (char) (x - 'a' + 'A');
      System.out.println("x = '" + x + "',  y = '" + y + "'");

      x = 'b';
      y = (char) (x - 'a' + 'A');
      System.out.println("x = '" + x + "',  y = '" + y + "'");

      x = 'c';
      y = (char) (x - 'a' + 'A');
      System.out.println("x = '" + x + "',  y = '" + y + "'");
   }
}

