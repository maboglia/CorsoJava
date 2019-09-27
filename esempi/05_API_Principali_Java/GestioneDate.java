import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class GestioneDate {

	public static void main(String[] args) {
		LocalDate oggi = LocalDate.now(); // Data di oggi
	      System.out.println("oggi: " + oggi);

	      //settare una data precisa (mese 1-based)
	      LocalDate mauroBirthday = LocalDate.of(1969, 7, 28);
	      //Per il mese possiamo usare le costanti di Month
	      mauroBirthday = LocalDate.of(1969, Month.JULY, 28);
	      
	      System.out.println("mauroBirthday: " + mauroBirthday);

	      LocalDate inizioCorsi = LocalDate.of(2017, Month.OCTOBER, 16);
	      LocalDate natale = LocalDate.of(2017, Month.DECEMBER, 25);

	      System.out.println("Fino a  oggi: " + mauroBirthday.until(oggi, ChronoUnit.DAYS));
	      System.out.println("Fino a  natale: " + inizioCorsi.until(natale, ChronoUnit.DAYS));
	}
	
	
	
}
