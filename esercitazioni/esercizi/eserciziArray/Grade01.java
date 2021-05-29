import java.util.Scanner;

public class Grade01
{
   public static void main(String[] args)
   {
      double ng;
      String lg = "";
 
      Scanner in = new Scanner(System.in); // Construct Scanner object  
 
      System.out.print("Enter number grade: ");
      ng = in.nextDouble();  // Read in next number into ng

      if ( ng >= 90 )
         lg = "A";

      if ( 80 <= ng && ng < 90 )
         lg = "B";

      if ( 70 <= ng && ng < 80 )
         lg = "C";

      if ( 60 <= ng && ng < 70 )
         lg = "D";

      if ( ng < 60 )
         lg = "F";

      System.out.println("Letter grade = " + lg);
   }
}
