

class sommaNumeri_For
{

	public static void main (String [] args)
		{
		int contatore, somma, n;

		System.out.println("            SOMMA DEI PRIMI N NUMERI NATURALI");

		System.out.print("Introduci un numero naturale: ");
		n=10;

		somma = 0;

		for (contatore=1; contatore <= n; contatore++)
			{
			somma = somma + contatore;
			}

		System.out.println("La somma dei primi "+n+" numeri naturali e' "+somma);
	}
}