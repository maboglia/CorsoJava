package com.example.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter df  = DateTimeFormatter.ISO_DATE;
		System.out.println(df.format(currentDate));
		
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter tf  = DateTimeFormatter.ISO_TIME;
		System.out.println(tf.format(currentTime));
		
		LocalDateTime currentDT = LocalDateTime.now();
		DateTimeFormatter dtf  = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(dtf.format(currentDT));
		
		DateTimeFormatter f_long = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(f_long.format(currentDT));
		
		DateTimeFormatter f_short = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(f_short.format(currentDT));
		
		String fr_short = f_short.withLocale(Locale.FRENCH).format(currentDT);
		String fr_long = f_long.withLocale(Locale.FRENCH).format(currentDT);
		System.out.println(fr_short);
		System.out.println(fr_long);
		
		DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
			.appendValue(ChronoField.MONTH_OF_YEAR)
			.appendLiteral("||")
			.appendValue(ChronoField.DAY_OF_MONTH)
			.appendLiteral("||")
			.appendValue(ChronoField.YEAR);
		DateTimeFormatter f = b.toFormatter();
		
		System.out.println(f.format(currentDT));
		
	}

}
