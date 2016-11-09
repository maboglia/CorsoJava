package dayalive;

public class DaysAlivePrinter
{
   public static void main(String[] args)
   {
	  Day maboglia = new Day(1969, 7, 28);
	   //Day maboglia2 = new Day(2016, 10, 28);
      Day today = new Day();
      System.out.print("Today: ");
      System.out.println(today.toString());
      int daysAlive = today.daysFrom(maboglia);
      System.out.print("Days alive: ");
      System.out.println(daysAlive / 365);
   }
}
