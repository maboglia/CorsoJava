public class Char03
{
   public static void main(String[] args)
   {
      int x;                 // Try: byte x - you still need casting !!!
      char a;
 
      x = 98;                // 98 is the code for 'b'

//    a = x;                 // This is not allowed without casting

      a = (byte) x;          // Must use casting to convert any integer to char

      System.out.println(a); // Prints b
   }
}

