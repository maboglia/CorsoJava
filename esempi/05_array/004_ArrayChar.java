
public class E04_ArrayChar
{
   public static void main( String[] args )
   {
      String s = "abc";

      char[] A;


      /* =========================================
         converte una stringa in un array di caratteri
         ========================================= */
      A = s.toCharArray();

      System.out.println( s );
      for ( int i = 0; i < A.length; i++ )
         System.out.println( "A[" + i + "] = " + A[i] );
      System.out.println( "\n" );

      /* =========================================
         converti un array di caratteri in una stringa
         ========================================= */
      A = new char[4];

      A[0] = '>'; A[1] = '<'; A[2] = '?'; A[3] = 'a';

      s = new String( A );

      for ( int i = 0; i < A.length; i++ )
         System.out.println( "A[" + i + "] = " + A[i] );

      System.out.println( s );

   }
}
