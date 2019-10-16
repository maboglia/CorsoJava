
public class StringEq1
{
   public static void main( String[] args )
   {
      String a, b, c;

      a = "Hello";
      a = a + " World";

      b = a;               // b points to the same string as a

      System.out.println("a = " + a);
      System.out.println("b = " + b);

      if ( a == b )
         System.out.println("a == b");
      else
         System.out.println("a != b");


      c = "Hello World";    // c contains the same string as a
			    // but does not point to the same string

      System.out.println("a = " + a);
      System.out.println("c = " + c);

      if ( a == c )
         System.out.println("a == c");
      else
         System.out.println("a != c");

   }
}
