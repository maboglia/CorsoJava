package week3;
/**
   This example demonstrates variables and assignments.
*/

public class VariableDemo
{
   public static void main(String[] args)
   {
      int width = 10; // Declares width and initializes it with 10
      System.out.print("width: ");
      System.out.println(width);

      width = 20; // Changes width to 20
      System.out.print("width: ");
      System.out.println(width);

      int height = 20;
      width = height + 10; // The right hand side can be an expression
      System.out.print("width: ");
      System.out.println(width);

      width = width + 10; // The same variable can occur on both sides
      System.out.print("width: ");
      System.out.println(width);      
   }
}
