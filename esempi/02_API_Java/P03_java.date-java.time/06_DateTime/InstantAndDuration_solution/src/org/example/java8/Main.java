package org.example.java8;

import java.time.Duration;
import java.time.Instant;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Instant start = Instant.now();
		System.out.println(start);
		
		Thread.sleep(1000);
		
		Instant end = Instant.now();
		System.out.println(end);
	
		Duration elapsed = Duration.between(start, end);
		
		System.out.println("Elapsed: " + elapsed.toMillis() + " milliseconds");
	
	}

}
