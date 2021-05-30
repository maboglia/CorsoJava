import java.util.Scanner;

public class Grade03
{
   public static void main(String[] args)
   {
      double ng;
      String lg = "";
 
      Scanner in = new Scanner(System.in); // Construct Scanner object  
 
      System.out.print("Enter numbger grade: ");
      ng = in.nextDouble();  // Read in next number into ng

      if ( ng >= 90 )
      {
         lg = "A";
      }
      else if ( ng >= 80 )
      {
         lg = "B";
      }
      else if ( ng >= 70 )
      {
         lg = "C";
      }
      else if ( ng >= 60 )
      {
         lg = "D";
      }
      else
      {
         lg = "F";
      }

      System.out.println("Letter grade = " + lg);
   }
}
