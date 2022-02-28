public class Scope4
{
   public static void main(String[] args)      
   {
      {
         double r = 3.14;

         r = r + 5;
         System.out.println(r);
      }

      {
         String r = "3.14";

         r = r + 5;
         System.out.println(r);
      }

   }
}
