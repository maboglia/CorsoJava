	public static void main(String[] args) {
		
        //dichiarazione ed inizializzazione
        boolean a, b = false;
        //inizializzazione
        a = true;
        
        if (a == b)
                System.out.println("a e b sono uguali");
        else
                System.out.println("a e b sono diversi");
			
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        boolean b4 = !b1;
        System.out.println("b4 vale: " + b4);

        int i1 = 0;
        boolean b5 = (i1 != 0);
        System.out.println(b5);

        String sBool = "true";
        boolean parsed = Boolean.parseBoolean(sBool);
        System.out.println(parsed);		

	}

//----------------------------------------------


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



		
		boolean presente;
		
		boolean test = false;
		
		
		if (!test) {
			System.out.println("falso");
		}
		
		presente = true;
		presente = false;
		



	}

//-----------------------------------

