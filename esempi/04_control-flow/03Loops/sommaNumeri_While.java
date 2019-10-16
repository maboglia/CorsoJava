		import system.IO;

class sommaNumeri_While
{

	public static void main (String [] args)
		{
		int contatore, somma, n;

		IO.out.println("            SOMMA DEI PRIMI N NUMERI NATURALI");

		IO.out.print("Introduci un numero naturale: ");
		n=IO.in.readInt();

		somma = 0;
		contatore = 1;

		while (contatore <= n)
			{
			somma = somma + contatore;
			contatore++;
			}

		IO.out.println("La somma dei primi "+n+" numeri naturali e' "+somma);
	}
}