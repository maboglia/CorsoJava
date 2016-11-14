package esempi.week3;


/**
   This example demonstrates method calls.
*/

public class MethodDemo
{
   public static void main(String[] args)
   {
      String saluto = "Hello, World!";
      System.out.println(saluto); 
         // greeting is the argument in this call to the println method
      int numeroCaratteri = saluto.length();
        // The length method returns a value
   
      System.out.print("numberOfCharacters: ");
      System.out.println(numeroCaratteri);

      // You can use the return value of one method as an argument of another method

      System.out.print("greeting.length(): ");
      System.out.println(saluto.length());

      // The replace method has two arguments
      String river = "Mississippi";
      river = river.replace("issipp", "our");
      System.out.print("river: ");
      System.out.println(river);
   }
}
