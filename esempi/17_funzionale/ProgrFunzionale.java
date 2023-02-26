package functional;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProgrFunzionale {

	public static void main(String[] args) {
		
		
		//System.out.println(IntStream.of(23,24,25,26,27,28,29,30).sum());
		
		List<String> list = Arrays
			.asList("do", "re", "mi", "fa", "sol", "la", "si")
			.stream().
			filter(nota -> nota.endsWith("a"))
			.toList();
		
		System.out.println(list);
	}

}
