package controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;

public class GestioneTimeZone {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT+0"));
		ZonedDateTime ny = ZonedDateTime.now(ZoneId.of("Europe/London"));
		
		System.out.println(dtf.format(ny));

		Set<String> zone = ZoneId.getAvailableZoneIds();
		
		zone.stream()
			//.filter(s->s.contains("Asia"))
			.sorted()
			.forEach(s -> System.out.println(s + ": "  + dtf.format(ZonedDateTime.now(ZoneId.of(s)))));
		
		

	}

}
