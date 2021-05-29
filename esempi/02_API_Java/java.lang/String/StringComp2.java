
public class StringComp2
{
   public static void main( String[] args )
   {

      System.out.println(" \"abc\".compareToIgnoreCase( \"abc\" ) = " 
					+ "abc".compareToIgnoreCase( "abc" ) );

      System.out.println(" \"abc\".compareToIgnoreCase( \"xyz\" ) = " 
					+ "abc".compareToIgnoreCase( "xyz" ) );

      System.out.println(" \"abc\".compareToIgnoreCase( \"ABC\" ) = " 
					+ "abc".compareToIgnoreCase( "ABC" ) );
   }
}
