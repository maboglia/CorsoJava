// Classe per la gestione di un dizionario

import java.util.*;
import java.io.*;

public class Dizionario
{
	/* Costruttore vuoto */
	public Dizionario()
	{}
	
	/* Metodo per la scrittura di una parola in un file */
	public void scriviFile(Parola parola)
	{
		/* Oggetto FileWriter */
		FileWriter scrivi_file = null;
		
		/* Oggetto PrintWriter */
		PrintWriter stampa_file = null;
		
		try
		{
			/* Creo l'oggetto FileWriter e quello prinWriter */
			scrivi_file = new FileWriter("dizionario.txt", true);
			
			stampa_file = new PrintWriter(scrivi_file);
		}
		catch(IOException e)
		{
			System.out.println("Errore nell'apertura del file\nIl programma verrà terminato");
			System.exit(1);
		}
		
		stampa_file.println(parola.recupera() + ";" + parola.recuperaTraduzione());
		
		stampa_file.flush();
		
		try
		{
			/* Chiusura del file */
			scrivi_file.close();
		}
		catch(IOException e)
		{
			System.out.println("Errore nella chiusura del file");
			System.exit(1);
		}
	}
	
	/* Metodo per la lettura da file */
	public Parola leggiFile(String leggi_parola)
	{
		/* Oggetto FileReader */
		FileReader leggi_file = null;
		
		/* Oggetto BufferedReader */
		BufferedReader file_input = null;
		
		StringTokenizer st;
		Parola parola;
		
		/* Creo gli oggetti */
		parola = new Parola();
		
		try
		{
			leggi_file = new FileReader("dizionario.txt");
			
			file_input = new BufferedReader(leggi_file);
		}
		catch(FileNotFoundException fine)
		{
			System.out.println("File vuoto");
			return parola;
		}
		catch(IOException e)
		{
			System.out.println("Errore nell'apertura del file!");
			System.exit(1);
		}

		
		try
		{
			String riga = file_input.readLine();
			
			while(riga != null)
			{
				st = new StringTokenizer(riga, ";");
				
				if(leggi_parola.equals(st.nextToken()))
				{
					parola.impostaVocabolo(leggi_parola);
					parola.impostaTraduzione(st.nextToken());
					
					break;
				}
				
				riga = file_input.readLine();
			}
		}
		catch(IOException e)
		{
			System.out.println("Errore nell'apertura del file!");
			System.exit(1);
		}
		
		try
		{
			leggi_file.close();
		}
		catch(IOException e)
		{
			System.out.println("Errore nella chiusura del file");
			System.exit(1);
		}
		
		return parola;
	}
}