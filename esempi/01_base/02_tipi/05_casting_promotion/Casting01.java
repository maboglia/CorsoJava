
public class Casting01
{
   public static void main(String[] args)
   {
      float x;                // Define single precision floating point
      double y;               // Define double precision floating point

      x = 3.1415927f;         // f denotes "float"

      y = (double) x;

      System.out.print("Original single precision x = ");
      System.out.println(x); 
      System.out.print("Converted double precision y = ");
      System.out.println(y); 

      x = (float) y;

      System.out.print("Re-converted single precision x = ");
      System.out.println(x); 
   }
}
