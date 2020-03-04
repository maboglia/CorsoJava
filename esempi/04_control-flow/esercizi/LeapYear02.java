import java.util.Scanner;

public class LeapYear02
{
   public static void main(String[] args)
   {
      int     year;
      boolean leap;
 
      Scanner in = new Scanner(System.in); // Construct Scanner object    

      System.out.print("Enter year:");
      year = in.nextInt();             // Read in year

      if ( (year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0) )
      {
         System.out.println("It is a leap year");
      }
      else
      {
         System.out.println("It is NOT a leap year");
      }
   }
}
