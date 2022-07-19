
public class Switch02
{
   public static void main(String[] args)
   {
      char x;
      String name = "";
 
      x = 'C';

      switch ( x )
      {
         case 'A':  name = "January";       break;
         case 'B':  name = "February";      break;
         case 'C':  name = "March";         break;
         case 'D':  name = "April";         break;
         case 'E':  name = "May";           break;
         case 'F':  name = "June";          break;
         case 'G':  name = "July";          break;
         case 'H':  name = "August";        break;
         case 'I':  name = "September";     break;
         case 'J':  name = "October";       break;
         case 'K':  name = "November";      break;
         case 'L':  name = "December";      break;
         default:   name = "Invalid month"; break;
      }

       System.out.println("Name of month = " + name);
   }
}
