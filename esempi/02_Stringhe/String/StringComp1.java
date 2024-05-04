
public class StringComp1
{
   public static void main( String[] args )
   {

      System.out.println(" \"abc\".compareTo( \"abc\" ) = " 
					+ "abc".compareTo( "abc" ) );

      System.out.println(" \"abc\".compareTo( \"xyz\" ) = " 
					+ "abc".compareTo( "xyz" ) );

      System.out.println(" \"abc\".compareTo( \"ABC\" ) = " 
					+ "abc".compareTo( "ABC" ) );
   }
}
