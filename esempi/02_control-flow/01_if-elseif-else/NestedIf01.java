import java.util.Scanner;

public class NestedIf01
{
   public static void main(String[] args)
   {
      char  sesso;
      int   eta, prezzo = 0;
 
      Scanner in = new Scanner(System.in); 
 
      System.out.print("Enter sesso (M or F) = ");
      sesso = in.next().charAt(0);         
      System.out.print("Enter eta = ");
      eta = in.nextInt();                

      if ( sesso == 'M' )
      {
         if ( eta <= 13 )
         {
            prezzo = 10;        
         }
         else
         {
            prezzo = 15;        
         }
      }
      else
      {
         if ( eta <= 13 )
         {
            prezzo = 12;        
         }
         else
         {
            prezzo = 25;        
         }
      }

      System.out.println("Price = " + prezzo);
   }
}
