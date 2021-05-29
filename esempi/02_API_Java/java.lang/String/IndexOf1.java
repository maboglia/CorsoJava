
public class IndexOf1
{
   public static void main( String[] args )
   {
      String s;

      int i;

      //   0123456789012345678901
      s = "Hello World, Bye World";

      i = s.indexOf( "World" );

      System.out.println( " 0123456789012345678901");
      System.out.println( "\"" + s + "\"" 
		+ ".indexOf( \"World\" ) = "  + i );

      i = s.indexOf( "By" );

      System.out.println( " 0123456789012345678901");
      System.out.println( "\"" + s + "\"" 
		+ ".indexOf( \"By\" ) = "  + i );

      i = s.indexOf( "by" );

      System.out.println( " 0123456789012345678901");
      System.out.println( "\"" + s + "\"" 
		+ ".indexOf( \"by\" ) = "  + i );

      /* ================================================= */

      i = s.lastIndexOf( "World" );

      System.out.println( " 0123456789012345678901");
      System.out.println( "\"" + s + "\"" 
		+ ".lastIndexOf( \"World\" ) = "  + i );

   }
}
