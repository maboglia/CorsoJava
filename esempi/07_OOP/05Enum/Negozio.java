package enumerazioni;

import java.util.ArrayList;
import java.util.List;

public class Negozio {

	public static void main(String[] args) {
		List<Maglia> maglie = new ArrayList<>();

		maglie.add(new Maglia(Colori.BLUE, "Ciao"));
		maglie.add(new Maglia(Colori.RED, "Miao"));
		maglie.add(new Maglia(Colori.GREEN, "Bao"));
	
		maglie.forEach(m -> System.out.println(m));
		
	}
	
	
	
	
}
