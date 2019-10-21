public class String07
{
   public static void main(String[] args)
   {
      String s = "Hello World";

      char   x;
      String y;

      x = s.charAt(0); 
      System.out.println("s.charAt(0) = " + x);
      x = s.charAt(2); 
      System.out.println("s.charAt(2) = " + x);

      y = s.substring(0,1); 
      System.out.println("s.substring(0,1) = " + y);
      y = s.substring(2,4); 
      System.out.println("s.substring(2,4) = " + y);
   }
}

