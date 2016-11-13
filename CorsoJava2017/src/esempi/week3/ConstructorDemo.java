package esempi.week3;


import java.awt.Rectangle;

/**
   This example demonstrates constructors.
*/
public class ConstructorDemo
{
   public static void main(String[] args)
   {
      // Constructs and prints a rectangle
      System.out.println(new Rectangle(5, 10, 20, 30));

      // Constructs a rectangle and saves it in a variable
      Rectangle box = new Rectangle(5, 10, 20, 30);
      System.out.print("box: ");
      System.out.println(box);

      // The constructor with no arguments
      box = new Rectangle();
      System.out.print("box: ");
      System.out.println(box);
   }
}
