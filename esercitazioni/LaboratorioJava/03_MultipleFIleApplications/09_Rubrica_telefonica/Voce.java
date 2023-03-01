import java.io.*;
import java.util.*;

public class Voce {
	
	private String nome;
	private String telefono;
	
	public Voce()
	{	
		nome = new String();
		telefono = new String();		
	}	
		
	public void stampa()
	{		
		System.out.println("\nNOME: " +nome);
		System.out.println("TELEFONO : " +telefono);
		System.out.println("\n\n");			
	}	
	
	public void visualizza_Nominativi()
	{
		
		// Impostazioni dello standard input			
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader pigia_tasto = new BufferedReader(input);
			
		// Gestione delle eccezioni		
		// Blocco try{ codice che potrebbe generare eccezione } 
		// Prova le varie chiamate del metodo
		try
		{
			// Chiamata al metodo readLine()
			System.out.println("\n\n");
			System.out.print("INSERIRE IL NOME : ");
			nome = pigia_tasto.readLine();
						
			System.out.print("INSERIRE IL N DI TELEFONO : ");
			telefono = pigia_tasto.readLine();
		}
		
		// Blocco catch(Type1 id1) { gestione eccezione di Type1 }
		// E' simile ad un metodo che accetta un solo argomento
		// Se viene generata un'eccezione il gestore delle eccezioni cerca il
		// primo gestore con un argomento che corrisponde al tipo di eccezione
		// quindi entra nella clausola catch e l'eccezione viene considerata
		// come gestita		
		catch (Exception e)
		{
			System.out.println("COMANDO NON VALIDO!!");
			return;
		}
		System.out.println();				
	}	

	
	
}	