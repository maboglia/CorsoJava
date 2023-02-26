package functional;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamInteri {

	public static void main(String[] args) {

		int[] esami = {15,16,18,23,21,15,28,30};
		
		long count = Arrays.stream(esami).count();
		
		OptionalDouble average = Arrays.stream(esami).average();
		
		System.out.println(count);
		
		System.out.println(average);
		
		IntSummaryStatistics summaryStatistics = 
				Arrays.stream(esami).summaryStatistics();
		System.out.println(summaryStatistics);
	}

}
