import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendario {

	public static void main(String[] args) {
		

		Date d = new Date();
		System.out.println(   d.getDate()   );
		
		GregorianCalendar gc = new GregorianCalendar(2017,0,28);
		gc.add(GregorianCalendar.DAY_OF_MONTH, 180);
		Date d2 = gc.getTime();
		System.out.println(d2);

		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat dg = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat dh = DateFormat.getDateInstance(DateFormat.MEDIUM);
		
		System.out.println(df.format(d2));
		System.out.println(dg.format(d2));
		System.out.println(dh.format(d2));
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate ld2 = LocalDate.of(2017,12,25);
		
		DateTimeFormatter df3 = DateTimeFormatter.ofPattern("d.M.yyyy");
		System.out.println(df3.format(ld2));
		
	}

}
