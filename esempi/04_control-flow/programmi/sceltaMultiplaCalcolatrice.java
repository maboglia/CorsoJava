		import system.IO;

class sceltaMultiplaCalcolatrice
{

	public static void main(String[] args)
		{
		double a, b, risultato;
		int scelta;

		System.out.println("       CALCOLATRICE");
		System.out.println("");

		System.out.print("Inserisci a = ");
		a = IO.in.readDouble();

		System.out.println("					1 = Addizione");
		System.out.println("					2 = Sottrazione");
		System.out.println("					3 = Moltiplicazione");
		System.out.println("					4 = Divisione");
		System.out.print("			       Scelta ? ");

		scelta = IO.in.readInt();

		System.out.print("Inserisci b = ");
		b = IO.in.readDouble();

		switch(scelta)
			{
			case 1:
				risultato = a+b;
				System.out.println("a + b = "+risultato);
				break;
			case 2:
				risultato = a-b;
				System.out.println("a - b =  "+risultato);
				break;
			case 3:
				risultato = a*b;
				System.out.println("a x b = "+risultato);
				break;
			case 4:
				risultato = a/b;
				System.out.println("a : b = "+risultato);
				break;
			default:
				System.out.println("SCELTA ERRATA");
			}

		}
}