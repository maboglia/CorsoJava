package interfacce;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Funzionale01 {

	public static void main(String[] args) {
		
		List<String> automobili = Arrays.asList(
				"ferrari", 
				"peugeot", 
				"ford", 
				"fiat"
				);
		//for tradizionale fori
		//foreach 
		//Collections.sort(automobili);
//		for (String auto : automobili) {
//			if (auto.startsWith("f"))
//				System.out.println(auto.toUpperCase());
//		}
		
		automobili
//			.stream()
//			.filter(a -> a.startsWith("f"))
//			.sorted()
			.forEach(a -> System.out.println(a.toUpperCase()));
		
	}

}
