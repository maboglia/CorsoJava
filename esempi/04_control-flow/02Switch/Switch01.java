import java.util.Scanner;

public class Switch01
{
   public static void main(String[] args)
   {
      int a;
      String name = "";
 
      Scanner in = new Scanner(System.in); // Construct Scanner object  
 
      System.out.print("Enter a numeric month (1-12): ");
      a = in.nextInt();  // Read in next number into a

      switch ( a )
      {
         case 1:  name = "January";       break;
         case 2:  name = "February";      break;
         case 3:  name = "March";         break;
         case 4:  name = "April";         break;
         case 5:  name = "May";           break;
         case 6:  name = "June";          break;
         case 7:  name = "July";          break;
         case 8:  name = "August";        break;
         case 9:  name = "September";     break;
         case 10: name = "October";       break;
         case 11: name = "November";      break;
         case 12: name = "December";      break;
         default: name = "Invalid month"; break;
      }

       System.out.println("Name of month = " + name);
   }
}