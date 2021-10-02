public class Byte
{   
   public static void main(String[] args) 
   {
      byte a;

      a = 1;
      a = 127;
      a = -128;

      a = 128;     // Causes compile error
      a = -129;    // Causes compile error
   }
}

