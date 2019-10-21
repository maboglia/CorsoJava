
public class Case1
{
   public static void main( String[] args )
   {
      String s, r;

      s = "AbC";
      r = s.toLowerCase( );

      System.out.println( "\"" + s + "\"" + ".toLowerCase( ) = "  + 
			  "\"" + r + "\"" );
      System.out.println( "Afterwards: s = " + "\"" + s + "\"");

      s = "Ab%";
      r = s.toLowerCase( );

      System.out.println( "\"" + s + "\"" + ".toLowerCase( ) = "  + 
			  "\"" + r + "\"" );
      System.out.println( "Afterwards: s = " + "\"" + s + "\"\n\n");

      /* ================================================== */

      s = "AbC";
      r = s.toUpperCase( );

      System.out.println( "\"" + s + "\"" + ".toUpperCase( ) = "  + 
			  "\"" + r + "\"" );
      System.out.println( "Afterwards: s = " + "\"" + s + "\"");

      s = "Ab%";
      r = s.toUpperCase( );

      System.out.println( "\"" + s + "\"" + ".toUpperCase( ) = "  + 
			  "\"" + r + "\"" );
      System.out.println( "Afterwards: s = " + "\"" + s + "\"");
   }
}
