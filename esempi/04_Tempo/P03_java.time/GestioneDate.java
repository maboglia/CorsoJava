package controller;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class GestioneDate {

	public static void main(String[] args) throws InterruptedException {
		
		LocalDate oggi = LocalDate.now();
		System.out.println(oggi);
		LocalDate unMese = oggi.plusMonths(1);
		LocalDate inizioCorso = LocalDate.of(2020, 11, 19);
		System.out.println("il corso è iniziato il " + inizioCorso);
		
//		System.out.println("da inizio corso ad oggi è passo: " + inizioCorso.until(oggi));

		System.out.println("da inizio corso ad oggi è passato: " + inizioCorso.until(oggi, ChronoUnit.DAYS));
	
		System.out.println("a fine corso mancano: " + oggi.until(LocalDate.of(2021, 7, 15), ChronoUnit.DAYS));
		
		System.out.println("tra un mese sarà il: " + unMese.getDayOfWeek());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d|M|yyyy");
		System.out.println("Data inizio corso formattata: " + dtf.format(inizioCorso));
		
		DateTimeFormatter f_long = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(f_long.format(inizioCorso));
		String francese = f_long.withLocale(Locale.ENGLISH).format(inizioCorso);
		System.out.println(francese);
		
		Instant start = Instant.now();
		System.out.println(start);
		
		Thread.sleep(3000);
		
		Instant stop = Instant.now();
		System.out.println(stop);
		
		Duration trascorso = Duration.between(start, stop);
		System.out.println("Sono passati " + trascorso.toMillis() + " millisecondi");
		
		
	}
	
	
	
}
