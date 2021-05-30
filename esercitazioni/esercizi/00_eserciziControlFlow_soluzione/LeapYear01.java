import java.util.Scanner;

public class LeapYear01
{
   public static void main(String[] args)
   {
      int     year;
      boolean leap;
 
      Scanner in = new Scanner(System.in); // Construct Scanner object    

      System.out.print("Enter year:");
      year = in.nextInt();             // Read in year

      if ( year % 4 == 0 )
         leap = true;
      else
         leap = false;

      if ( year % 100 == 0 )
         leap = false;

      if ( year % 400 == 0 )
         leap = true;

      System.out.println("Year is leap year ? " + leap);
   }
}
