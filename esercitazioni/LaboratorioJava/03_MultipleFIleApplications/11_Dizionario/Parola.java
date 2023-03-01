/* Classe che gestisce le parole  di un dizionario ITA_ING */	
import java.util.*;
import java.io.*;

public class Parola
{
	/* Definizione di due riferimenti: un campo string ed un vettore Vector */
	private String vocabolo;
	private Vector lista;
	
	/* Costruttore della classe */
	public Parola()
	{
		vocabolo = new String();
		lista = new Vector();
	}
	
	/* Metodo per la stampa di tutti i vocaboli */
	public void stampa()
	{
		System.out.println(vocabolo + " -> ");
		 
		for(int i=0; i < lista.size(); i++)
		{
			System.out.print(" " + lista.elementAt(i));
		}
	}
	
	/* Metodo per l'inserimento da tastiera di un vocabolo nella lista */
	public void insParola()
	{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		try
		{
			System.out.println("INSERISCI LA PAROLA DA TRADURRE ==> ");
			vocabolo = tastiera.readLine();
		}
		catch(Exception e)
		{}
			
			
		try
		{
			for(;;)
			{
				
				System.out.println("INSERISCI LA TRADUZIONE IN INGLESE (press * to exit) ==> ");
				String traduzione = tastiera.readLine();
				
				if(traduzione.equals("*"))
					break;
					
				/* Passaggio del valore inserito alla lista */
				lista.addElement(traduzione);
			}
		}
		catch(Exception e)
		{}
	}
	
	/* Metodo per il prelevamento di un vocabolo */
	public String recupera()
	{
		return vocabolo;
	}
	
	/* Metodo per impostare il vocabolo */
	public void impostaVocabolo(String vocabolo)
	{
		this.vocabolo = vocabolo;
	}
	
	/* Il metodo imposta la traduzione */
	public void impostaTraduzione (String vocabolo)
	{
		StringTokenizer st = new StringTokenizer(vocabolo, " ");
		
		while(st.hasMoreTokens())
		{
			lista.addElement(st.nextToken());
		}
	}
	
	/* Metodo per il recupero della traduzione */
	public String recuperaTraduzione()
	{
		String traduzione = new String();
		
		for(int i=0; i < lista.size(); i++)
		{
			traduzione = traduzione + " " + lista.elementAt(i);
		}
		
		return traduzione;
	}
}