import java.util.Scanner;

public class If1
{
   public static void main(String[] args)
   {

      Scanner in = new Scanner(System.in);
      
      int a;
 
      System.out.print("Enter an integer value: ");

      a = in.nextInt();     // Read in an integer from keyboard

      System.out.print("Input value = ");
      System.out.println(a);

      if ( a < 0 )
         a = -a;
 
      System.out.print("It's absolute value = ");
      System.out.println(a);
   }
}
