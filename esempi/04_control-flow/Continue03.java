public class Continue03
{
   public static void main(String[] args)
   {
      int a;

      for ( a = 1; a <= 10 ; a++ )            // Run a = 1, 2, ..., 10
      {
         if ( a == 4 )
         {
            continue;              // Skip printing 4...
         }

         System.out.println(a);    // Print a 
      }
   }
}
