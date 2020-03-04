package progetti.dayalive;

public class DayTester
{
   public static void main(String[] args)
   {
      Day today = new Day(2016, 10, 2); // 
      Day later = today.addDays(30);

      System.out.println(later.getYear());
      System.out.println("Atteso: 2010");
      System.out.println(later.getMonth());
      System.out.println("Atteso: 3");
      System.out.println(later.getDate());
      System.out.println("Atteso: 13");
      System.out.println(later.daysFrom(today)); 
      System.out.println("Atteso: 30");
   }
}
