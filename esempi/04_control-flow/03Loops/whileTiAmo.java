 import system.IO;

 class whileTiAmo
 {

	public static void main(String[] args)
		{
		int k;
		String stringa, risposta;
		boolean test;


		// FASE DI INPUT

		System.out.print("Come ti chiami ? = ");
		stringa=IO.in.readString();

		test = true;

		// FASE DI OUTPUT

		while (test)
			{
			System.out.println("");
			System.out.print(stringa);
			System.out.println(" ti amo ");
			System.out.print("Tu mi ami ? ");
			risposta=IO.in.readString();
			risposta=risposta.toUpperCase();	// Trasforma la stringa "risposta" in maiuscolo

			if ( risposta.equals("SI") )
							test = false;
			}

		System.out.println("Ohh, quanto sono felice !!!");
		}

 }

