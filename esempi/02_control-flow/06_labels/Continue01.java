import java.util.Scanner;

public class Continue01
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      int n;
      int a;
 
      System.out.print("Enter a number n: ");
      n = in.nextInt();            // Read in number
      
      a = 1;

      while ( a <= n )             // Run a = 1, 2, ..., n
      {
         if ( n % a != 0 )
         {  // a is NOT a divisor of n
            a++;
            continue;             // Jump to end of while loop
         }

         /* ----------------------------------------------
            We reach here ONLY when "n % a != 0" is FALSE
            I.e.: a is a divisor of x
            ---------------------------------------------- */
         System.out.println(a);    // Print a (because it's a divisor)
         a++;                      // Make sure we more to the next number !!
                                   // or else: infinite loop !!!
      }
   }
}
