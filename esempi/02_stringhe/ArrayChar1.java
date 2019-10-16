
public class ArrayChar1
{
   public static void main( String[] args )
   {
      String s = "abc";

      char[] A;


      /* =========================================
         Convert String s into an array of char
         ========================================= */
      A = s.toCharArray();

      System.out.println( s );
      for ( int i = 0; i < A.length; i++ )
         System.out.println( "A[" + i + "] = " + A[i] );
      System.out.println( "\n" );

      /* =========================================
         Convert an array of char A into string
         ========================================= */
      A = new char[4];

      A[0] = '>'; A[1] = '<'; A[2] = '?'; A[3] = 'a';

      s = new String( A );

      for ( int i = 0; i < A.length; i++ )
         System.out.println( "A[" + i + "] = " + A[i] );

      System.out.println( s );

   }
}
