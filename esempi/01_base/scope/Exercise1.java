public class Exercise1
{
   public static void main(String[] args)            
   {
      {
         double r = 3.14;
 
         {
            String s = "1234";
            r = r + 2;
            System.out.println( s + r );
         }
 
         {
            int s = 1234;
 
            System.out.println( s + r );
         }
      }
   }
}
