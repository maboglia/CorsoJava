import java.util.Scanner;

public class Switch04
{
   public static void main(String[] args)
   {
      String name = "";
      int a;
 
      Scanner in = new Scanner(System.in); // Construct Scanner object  
 
      System.out.print("Enter the name of a month (lower case): ");
      name = in.next();  // Read in name

      switch ( name ) 
      {
         case "january":    a =  1; break;
         case "february":   a =  2; break;
         case "march":      a =  3; break;
         case "april":      a =  4; break;
         case "may":        a =  5; break;
         case "june":       a =  6; break;
         case "july":       a =  7; break;
         case "august":     a =  8; break;
         case "september":  a =  9; break;
         case "october":    a = 10; break;
         case "november":   a = 11; break;
         case "december":   a = 12; break;
         default:           a =  0; break;
      }

      System.out.println("Index of month = " + a);
   }
}
