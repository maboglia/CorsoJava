		import system.IO;

class sceltaMultiplaGiorno
{
	public static void main (String args[])
		{
		int numeroGiorno;
		String giorno;

		System.out.print("Quale giorno (in numero) della settimana e' oggi ?  ");
 		numeroGiorno = IO.in.readInt();


		switch ( numeroGiorno )
			{
			case 1: giorno = "Lunedi'";    break;
			case 2: giorno = "Martedi'";   break;
			case 3: giorno = "Mercoledi'"; break;
			case 4: giorno = "Giovedi'";   break;
			case 5: giorno = "Venerdi'";   break;
			case 6: giorno = "Sabato";     break;
			case 7: giorno = "Domenica";   break;

			default: giorno = null; 					// in tutti gli altri casi
			}
		System.out.println("Oggi e' "+giorno);
		}
}
