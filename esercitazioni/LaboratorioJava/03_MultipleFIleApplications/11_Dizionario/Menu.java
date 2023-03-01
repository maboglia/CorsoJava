import java.io.*;

class Menu {
	
	// Definizione del metodo che mostra un menu di scelta
	private void mostraMenu()
	{
		
		System.out.println();
		System.out.println("\t\t*************VOCABOLARIO ITAL - INGL**************\n\n");
		System.out.println("1) EFFETTUA TRADUZIONE");
		System.out.println("2) INSERISCI NUOVI VOCABOLI");
		System.out.println("3) USCITA DAL PROGRAMMA");
	}
	
	// Definizione del metodo che consente di effettuare la scelta
	public int scelta()
	{
		InputStreamReader input = new InputStreamReader(System.in);;
		BufferedReader tastiera = new BufferedReader(input);

		int scelta;
		
		// Chiamata al metodo mostraMenu()
		mostraMenu();		
		
		System.out.print("INSERISCI LA SCELTA : ");
		try
		{
			String numeroLetto = tastiera.readLine();
			scelta = Integer.valueOf(numeroLetto).intValue();
		}
		catch(IOException e)
		{
			scelta =0;
		}
		catch(NumberFormatException fine)
		{
			scelta =0;	
		}
		
		return scelta;
	}
	
	/* Definizione del metodo che consente di recuperare la parola già esistente
	   all'interno del file dizionario.txt */
	public String recupera_Parola()
	{
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		// Creazione dell'oggetto		
		String cerca_parola = new String();
		
		
		System.out.print("INSERISCI IL NUOVO VOCABOLO IN ITALIANO : ");
		try	
		{
			cerca_parola = tastiera.readLine();	
		}
		catch(IOException e) {}
		
		
		return cerca_parola;
		
	}
	

}