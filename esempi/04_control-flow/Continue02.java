public class Continue02
{
   public static void main(String[] args)
   {
      int a;

      a = 1;

      while ( a <= 10 )            // Run a = 1, 2, ..., 10
      {
         if ( a == 4 )
         {
            continue;              // Skip printing 4...
         }

         System.out.println(a);    // Print a 
         a++;             
      }
   }
}
