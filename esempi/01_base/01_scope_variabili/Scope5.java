public class Scope5
{
   public static void main(String[] args)      
   {
      {
         double r = 3.14;

         {
            r = 5;    // No error
            t = 5;    // Will cause "undefined variable" error
         }

         double t = 1.0;
      }

   }
}
