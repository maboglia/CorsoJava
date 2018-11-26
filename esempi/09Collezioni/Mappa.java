package esempi.week11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mappa {

	public static void main(String[] args) {

		Map<String, String> regioni = new HashMap<>();
		
		regioni.put("Piemonte", "Torino");
		regioni.put("Campania", "Napoli");
		regioni.put("Sicilia", "Palermo");
		
		System.out.println(regioni);

		regioni.put("Lazio", "Roma");
		System.out.println(regioni);

		
		String capoluogo = regioni.get("Campania");
		System.out.println(capoluogo);
		
		Set<String> miaLista = regioni.keySet();
		
		for (String string : miaLista) {
			System.out.print(string + " : ");
			
			System.out.println(  regioni.get(string)   );
			
			
		}
		
		Iterator<String> iteratore1 = miaLista.iterator();
		while (iteratore1.hasNext()) {
			String string = (String) iteratore1.next();
			System.out.println("il capoluogo di " + string + " è " + regioni.get(string));
		}
		
		
	}

}
