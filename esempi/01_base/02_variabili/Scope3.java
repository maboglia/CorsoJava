public class Scope3
{
   public static void main(String[] args)      
   {
      {
         r = 1;            // (1)

         double r;

         r = r + 5;        // (2)
      }

      r = r + 2;           // (3)
   }

   r = r + 3;              // (4)
}
