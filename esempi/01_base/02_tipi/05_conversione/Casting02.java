
public class Casting02
{
   public static void main(String[] args)
   {
      float x;               // Define single precision floating point
      double y;              // Define double precision floating point

      y = 3.14159265358979;

      x = (float) y;

      System.out.print("Original double precision y = ");
      System.out.println(y); 
      System.out.print("Converted single precision x = ");
      System.out.println(x); 

      y = (double) x;

      System.out.print("Re-converted double precision y = ");
      System.out.println(y); 
   }
}
