public class While02
{
   public static void main(String[] args)
   {
      int a;
 
      a = 1;

      while ( a <= 10 )            // While-statement       
      {
         System.out.println(a);    // Print a
                                   // NO a++ statement !!!
      }

      System.out.println("Done");
      System.out.println("Exit: a = " + a);
   }
}
