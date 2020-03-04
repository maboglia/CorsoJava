import java.util.Scanner;

public class NestedIf01
{
   public static void main(String[] args)
   {
      char  sesso;
      int   eta, prezzo = 0;
 
      Scanner in = new Scanner(System.in); // Construct Scanner object  
 
      System.out.print("Enter sesso (M or F) = ");
      sesso = in.next().charAt(0);         // Read in next char into sesso
      System.out.print("Enter eta = ");
      eta = in.nextInt();                // Read in next integer into eta

      if ( sesso == 'M' )
      {
         if ( eta <= 13 )
         {
            prezzo = 10;        // Boy
         }
         else
         {
            prezzo = 15;        // Man
         }
      }
      else
      {
         if ( eta <= 13 )
         {
            prezzo = 12;        // Girl
         }
         else
         {
            prezzo = 25;        // Woman
         }
      }

      System.out.println("Price = " + prezzo);
   }
}
