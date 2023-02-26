package funzionale;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Funzionale4 {

	public static void main(String[] args) {
		
		List<String> nani = Arrays.asList(
					"eolo",
					"gongolo",
					"pisolo",
					"mammolo",
					"adrianolo",
					"zigulì",
					"firulì",
					"MIGNOLO"
				);

		
		
		//Collections.sort(nani, (o1, o2) -> o2.length()-o1.length() );
		
		nani.stream()
			.sorted((o1, o2) -> o2.length()-o1.length())
			.forEach(System.out::println);
		
	}
	
	
}
