

class DoWhile
{

	public static void main (String [] args)
		{
		int contatore, somma, n;

		System.out.println("SOMMA DEI PRIMI N NUMERI NATURALI");

		System.out.print("Introduci un numero naturale: ");
		n = 10;

		contatore=0;
		somma = 0;

		do
			{
			somma = somma + contatore;
			contatore++;
			}
		while (contatore <= n);

		System.out.println("La somma dei primi "+n+" numeri naturali e' "+somma);
	}
}