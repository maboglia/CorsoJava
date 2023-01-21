
public class Replace1
{
   public static void main( String[] args )
   {
      String s, r;

      s = "Hello World, Bye World";
      r = s.replaceFirst( "World", "Class" );

      System.out.println( "\"" + s + "\"" 
		+ ".replaceFirst( \"World\", \"Class\" ) = "  + 
		"\"" + r + "\"" );
      System.out.println( "Afterwards: s = " + "\"" + s + "\"\n\n" );

      /* ================================================== */

      r = s.replaceAll( "World", "Class" );

      System.out.println( "\"" + s + "\"" 
		+ ".replaceAll( \"World\", \"Class\" ) = "  + 
		"\"" + r + "\"" );
      System.out.println( "Afterwards: s = " + "\"" + s + "\"" );

   }
}
