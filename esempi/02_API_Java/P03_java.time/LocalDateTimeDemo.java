package org.example.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		LocalDate specificDate = LocalDate.of(2000, 1, 1);
		System.out.println(specificDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalTime specificTime = LocalTime.of(14, 0, 45);
		System.out.println(specificTime);
		
		LocalDateTime currentDT = LocalDateTime.now();
		System.out.println(currentDT);
		
		LocalDateTime specificDT = LocalDateTime.of(specificDate, specificTime);
		System.out.println(specificDT);
		
	}

}
