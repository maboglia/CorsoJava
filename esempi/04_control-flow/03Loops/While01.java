public class While01
{
   public static void main(String[] args)
   {
      int a;
 
      a = 1;

      while ( a <= 10 )            // While-statement       
      {
         System.out.println(a);    // Print a
         a++;                      // Increment a
      }

      System.out.println("Done");
      System.out.println("Exit: a = " + a);
   }
}
