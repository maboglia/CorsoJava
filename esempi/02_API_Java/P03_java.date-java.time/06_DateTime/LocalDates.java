/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriojava.gestione.tempo;

/**
 *
 * @author marcuser
 */

import java.time.*;
import java.time.temporal.*;

public class LocalDates
{
   public static void main(String[] args)
   {
      LocalDate oggi = LocalDate.now(); // Today’s date
      System.out.println("oggi: " + oggi);

      LocalDate mauroBirthday = LocalDate.of(1969, 7, 28);
      mauroBirthday = LocalDate.of(1969, Month.JULY, 28);
      // Uses the Month enumeration
      System.out.println("mauroBirthday: " + mauroBirthday);

      LocalDate programmersDay = LocalDate.of(2017, 7, 28).plusDays(365);
      // September 13, but in a leap year it would be September 12
      System.out.println("programmersDay: " + programmersDay);

      LocalDate festaLiberazione = LocalDate.of(2017, Month.APRIL, 25);
      LocalDate natale = LocalDate.of(2017, Month.DECEMBER, 25);

      System.out
            .println("Fino a  natale: " + festaLiberazione.until(natale));
      System.out.println("Fino a  natale: "
            + festaLiberazione.until(natale, ChronoUnit.DAYS));

      System.out.println(oggi.plusMonths(1));
      System.out.println(oggi.minusMonths(1));

      DayOfWeek inizioMillenio = LocalDate.of(2000, 1, 1).getDayOfWeek();
      System.out.println("inizioMillenio: " + inizioMillenio);
      System.out.println(inizioMillenio.getValue());
      System.out.println(DayOfWeek.SATURDAY.plus(3));
   }
}
