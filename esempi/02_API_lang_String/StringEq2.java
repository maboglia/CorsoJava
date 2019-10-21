
public class StringEq2
{
   public static void main( String[] args )
   {
      String a, b, c;

      a = "Hello";
      a = a + " World";

      b = a;               // b points to the same string as a

      System.out.println("a = " + a);
      System.out.println("b = " + b);

      if ( a.equals(b) )
         System.out.println("a EQUALS b");
      else
         System.out.println("a NOT EQUALS b");


      c = "Hello World";    // c contains the same string as a
			    // but does not point to the same string

      System.out.println("a = " + a);
      System.out.println("c = " + c);

      if ( a.equals(c) )
         System.out.println("a EQUALS c");
      else
         System.out.println("a NOT EQUALS c");

   }
}
