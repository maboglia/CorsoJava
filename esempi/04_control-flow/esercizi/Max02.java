import java.util.Scanner;

public class Max02
{
   public static void main(String[] args)
   {
      double a, b, c, max;
 
      Scanner in = new Scanner(System.in); // Construct Scanner object    

      System.out.print("Enter a:");
      a = in.nextDouble();  // Read in next number into a
      System.out.print("Enter b:");
      b = in.nextDouble();  // Read in next number into b
      System.out.print("Enter c:");
      c = in.nextDouble();  // Read in next number into c

      if ( a >= b )
         max = a;
      else
         max = b;

      if ( c > max )
         max = c;

      System.out.println("Max = " + max);
   }
}
