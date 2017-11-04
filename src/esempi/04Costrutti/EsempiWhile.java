package esempi.week3;

public class EsempiWhile {

	public static void main(String[] args) {
		
		String[] giorni = {
				"lunedì",
				"martedì",
				"mercoledì",
				"giovedì",
				"venerdì",
				"sabato",
				"domenica",
		};
		
		//ciclo while 
		int counter = 0;
		while (counter > giorni.length) {
			if (counter % 2 == 0)
			System.out.println( "giorno n.  " + counter + " è  " + giorni[counter]    );
			counter++;
		}
		
		//ciclo do-while
		do {
			if (counter % 2 == 0)
				System.out.println( "giorno n.  " + counter + " è  " + giorni[counter]    );
			counter++;
		}
		while (counter <0);
		

	}

}
