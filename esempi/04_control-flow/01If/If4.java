import java.util.Scanner;

public class If4
{
   public static void main(String[] args)
   {
      double a, b, c, x1, x2;   // Define 5 variable
 
      Scanner in = new Scanner(System.in); // Construct Scanner object  
 
      a = in.nextDouble();  // Read in next number into a
      b = in.nextDouble();  // Read in next number into b
      c = in.nextDouble();  // Read in next number into c

      x1 = x2 = 0;          // Default solution

      /* ------------------------------------------------------
         Only compute solution if determinant b*b - 4*a*c >= 0
         ------------------------------------------------------ */
      if ( b*b - 4*a*c >= 0 )
         x1 = ( -b - Math.sqrt( b*b - 4*a*c ) ) / (2*a);
         x2 = ( -b + Math.sqrt( b*b - 4*a*c ) ) / (2*a);

      System.out.print("x1 = ");
      System.out.println(x1);
      System.out.print("x2 = ");
      System.out.println(x2);
   }
}
