public class Char04
{
   public static void main(String[] args)
   {
      int  x;
      char a;
 
      a = '%';                 // ASCII code of '%' = 37

      x = a;                   // Copy 37 into x
                               // We don't need to use (int) 
                               // it is "safe" (int is bigger than char)


      System.out.println(x);   // Prints 37
   }
}

