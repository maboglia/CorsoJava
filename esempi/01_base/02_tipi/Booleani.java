package p001;

public class Booleani {

	//dichiarazione di variabile statica (di classe), non la inizializzo!
	static boolean valoreBooleanoStatico;

	public static void main(String[] args) {
		
		//dichiarazione
		//dichiarazione ed inizializzazione
		boolean a, b = false;

		a = true;
		
		if (a == b)
			System.out.println("a e b sono uguali");
		else
			System.out.println("a e b sono diversi");
			
		a = true;
		System.out.println(a);

		a = false;
		System.out.println(a);

		a = (3 > 1);
		System.out.println(a);

		a = (3 <= 1);
		System.out.println(a);		

		
		//esempio 3

		boolean b1 = true;
		boolean b2 = false;

		System.out.println("Il valore di b1 è: " + b1);
		System.out.println("Il valore di b2 è: " + b2);
		System.out.println("Il valore di valoreBooleanoStatico è: " + valoreBooleanoStatico);

		boolean b3 = !b1;
		System.out.println("Il valore di b3 è: " + b3);

		int i1 = 0;
		boolean b4 = (i1 != 0);
		System.out.println("Il valore di b4 è: " + b4);

		String stringaBoolean = "true";
		boolean parsed = Boolean.parseBoolean(stringaBoolean);
		System.out.println("Dopo il parsing: " + parsed);		


	}

}
