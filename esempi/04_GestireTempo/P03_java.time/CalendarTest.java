import java.util.*;

public class CalendarTest {
	public static void main(String[] args){
		GregorianCalendar c = new GregorianCalendar();
		c.set(Calendar.YEAR,2006);
		c.set(Calendar.MONTH, Calendar.DECEMBER);
		c.set(Calendar.DAY_OF_MONTH, 25);
		System.out.print("Il prossimo Natale cadra' di ");
		switch(c.get(Calendar.DAY_OF_WEEK)){
			case Calendar.SUNDAY:
				System.out.println("domenica");
				break;
			case Calendar.MONDAY:
				System.out.println("lunedi'");
				break;
			case Calendar.TUESDAY:
				System.out.println("martedi'");
				break;
			case Calendar.WEDNESDAY:
				System.out.println("mercoledi'");
				break;
			case Calendar.THURSDAY:
				System.out.println("giovedi'");
				break;
			case Calendar.FRIDAY:
				System.out.println("venerdi'");
				break;
			case Calendar.SATURDAY:
				System.out.println("sabato");
				break;
		}
	}
}