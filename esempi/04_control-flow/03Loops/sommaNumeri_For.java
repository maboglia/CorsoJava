
		import system.IO;

class sommaNumeri_For
{

	public static void main (String [] args)
		{
		int contatore, somma, n;

		IO.out.println("            SOMMA DEI PRIMI N NUMERI NATURALI");

		IO.out.print("Introduci un numero naturale: ");
		n=IO.in.readInt();

		somma = 0;

		for (contatore=1; contatore <= n; contatore++)
			{
			somma = somma + contatore;
			}

		IO.out.println("La somma dei primi "+n+" numeri naturali e' "+somma);
	}
}