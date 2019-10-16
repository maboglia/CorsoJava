
		import system.IO;

class sommaNumeri_Do
{

	public static void main (String [] args)
		{
		int contatore, somma, n;

		IO.out.println("            SOMMA DEI PRIMI N NUMERI NATURALI");

		IO.out.print("Introduci un numero naturale: ");
		n = IO.in.readInt();

		contatore=0;
		somma = 0;

		do
			{
			somma = somma + contatore;
			contatore++;
			}
		while (contatore <= n);

		IO.out.println("La somma dei primi "+n+" numeri naturali e' "+somma);
	}
}