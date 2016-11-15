package week3;

import java.awt.Rectangle;

/**
   This example demonstrates accessors and mutators.
*/
public class AccessorMutatorDemo
{
   public static void main(String[] args)
   {
      Rectangle box = new Rectangle(5, 10, 20, 30);
      System.out.print("box: ");
      System.out.println(box);

      // getWidth is an accessor method

      double width = box.getWidth();
      System.out.print("width: ");
      System.out.println(width);

      // Calling an accessor doesn't change the object

      System.out.print("box: ");
      System.out.println(box);

      // translate is a mutator method

      box.translate(15, 25);

      // Calling a mutator changes the object.
      
      System.out.print("box: ");
      System.out.println(box);
   }
}
