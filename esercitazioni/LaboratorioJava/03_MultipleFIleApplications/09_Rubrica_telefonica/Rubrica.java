import java.util.*;
import java.io.*;

public class Rubrica {  // Definizione di una classe pubblica	
	
	// Definizione di una variabile "reference" di tipo Vector e privata (1)
	private Vector elenco;
		
	// Costruttore della classe Rubrica
	public Rubrica()
	{			
		// Creazione dell'oggetto		
		elenco = new Vector();		
	}	
	
	// Metodo che permette di inserire un elemento nella cosa
	// Non restituisce niente	
	public void aggiungi_Voce(Object obj)
	{		
		elenco.addElement(obj); // (2)
	}	
	
	// Metodo che permette di eliminare un oggetto dalla coda 
	public void elimina_Voce(int posizione)
	{
		Object obj = null;
		int size;
		size = elenco.size();
		
		if(size > 0)
		{
			obj = elenco.elementAt(0); // (3)
						
			elenco.removeElementAt(posizione); // (4)
		}		
		return;
	}	
		
	//Restituisce la dimensione della coda		
	public int size()
	{
		return elenco.size();
	}		
		
	public void visualizza_Posizione()
	{
		
		Voce voce;
		
		System.out.println("\n************RUBRICA TELEFONICA************\n\n");
		
		
		for(int i = 0; i < elenco.size(); i++)
		{
			System.out.print("POSIZIONE "+ i+" : \n");
			
			// Casti di tipo			
			voce=(Voce) elenco.elementAt(i);
			voce.stampa();
		}
		
	}	
	
	public int leggi_Posizione()
	{		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader pigia_tasto = new BufferedReader(input);
				
		int posizione;
					
		System.out.print("\n\nINSERISCI LA POSIZIONE DA ELIMINARE : ");
				
		try
		{
			String posizione_Letta = pigia_tasto.readLine();
			posizione = Integer.valueOf(posizione_Letta).intValue();					
		}		
		
		catch(IOException e)
		{			
			posizione =- 1;		
		}
				
		return posizione;		
	}		
} // Fine della classe


/* (1)
   Le variabili reference sono molto simili concettualmente ai
   puntatori di C e C++, ma non consentono la conversione intero/indirizzo
   o le operazioni aritmetiche; tuttavia queste variabili sono uno
   strumento potente per la creazione di strutture dati dinamiche come liste,
   alberi binari e array multidimensionali. In questo modo eliminano gli
   svantaggi derivanti dall’uso di puntatori, mentre ne mantengono tutti
   i vantaggi.
   
   (2)
   addElement(Object) inserisce un elemento in coda al vettore.
   
   (3)
   elementAt(int index) restituisce l'elemento passato nella posizione index
   (in questo programma size - 1).
   
   (4)
   removeElementAt(int index) toglie un elemento dalla posizione index (O x)
   (in questo programma size - 1).
*/