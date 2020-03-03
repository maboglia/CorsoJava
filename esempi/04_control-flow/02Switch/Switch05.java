import java.util.Scanner;

public class Switch05
{
   public static void main(String[] args)
   {
      int ng;
      String lg = "";
 
      Scanner in = new Scanner(System.in); // Construct Scanner object  
 
      System.out.print("Enter a numeric grade: ");
      ng = in.nextInt();  // Read in next number 

      switch ( ng )
      {
         case 100:
         case 99:
         case 98:
         case 97:
         case 96:
         case 95:
         case 94:
         case 93:
         case 92:
         case 91:
         case 90:     lg = "A";  break;

         case 89:
         case 88:
         case 87:
         case 86:
         case 85:
         case 84:
         case 83:
         case 82:
         case 81:
         case 80:     lg = "B";  break;

         case 79:
         case 78:
         case 77:
         case 76:
         case 75:
         case 74:
         case 73:
         case 72:
         case 71:
         case 70:     lg = "C";  break;

         case 69:
         case 68:
         case 67:
         case 66:
         case 65:
         case 64:
         case 63:
         case 62:
         case 61:
         case 60:     lg = "D";  break;

         default:     lg = "F";  break;
      }

       System.out.println("Letter grade = " + lg);
   }
}
