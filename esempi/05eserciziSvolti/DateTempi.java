package week2;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by mauro on 15/06/16.
 */
public class DateTempi {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);

        GregorianCalendar gc = new GregorianCalendar(1969, 6, 28);
        Date mauro = gc.getTime();
        System.out.println(mauro);

        gc.add(GregorianCalendar.DATE, 10);
        Date d2 = gc.getTime();
        System.out.println(d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(mauro));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ld = LocalDate.of(1969, 7, 28);
        System.out.println(ld);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/MM/yyyy");
        System.out.println(dtf.format(ld));


    }

}
