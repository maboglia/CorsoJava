import system.IO;

class esempio1For
{

	public static void main(String[] args)
		{
		int k;
		String stringa;


		// FASE DI INPUT

		System.out.print("Come ti chiami ? = ");
		stringa=IO.in.readString();


		// FASE DI OUTPUT

		for (k=1; k<=10; k++)
					{
					System.out.print(stringa);
					System.out.println(" sei il numero  " + k);
					}
		}

 }

