package esempi.week11;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<String> ricetteMondo = new ArrayList<>();

		ricetteMondo.add("Pao de queijo (Eliane)");
		ricetteMondo.add("DRAGANA Pita sa povrcem");
		
		System.out.println(ricetteMondo);
		
		ricetteMondo.add("BEIGNETS (Fatou , Sokhna)");
		ricetteMondo.add("MSSEMMEN (Marocco)");
		ricetteMondo.add("PUDIN DE MARACUJÀ (Mariana, Eliane)");
		
		for (String string : ricetteMondo) {
			System.out.println(string);
		}
		
		ricetteMondo.remove(3);
		System.out.println(ricetteMondo);	
		
		ricetteMondo.add("MSSEMMEN (Marocco)");
		System.out.println(ricetteMondo.get(3));
		
		int pos = ricetteMondo.indexOf("MSSEMMEN (Marocco)");
		System.out.println(pos);
		
		
	}

}
