import java.util.Scanner;

public class Max01
{
   public static void main(String[] args)
   {
      double a, b, max;
 
      Scanner in = new Scanner(System.in); // Construct Scanner object    

      System.out.print("Enter a:");
      a = in.nextDouble();  // Read in next number into a
      System.out.print("Enter b:");
      b = in.nextDouble();  // Read in next number into b

      if ( a >= b )
         max = a;
      else
         max = b;

      System.out.println("Max = " + max);
   }
}
