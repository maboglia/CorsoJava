import java.util.*;
import java.io.*;

class Menu {
	
	public static void main(String[] args){
		
		Rubrica rubr = new Rubrica();
		Voce voce;
		int scelta;
				
		for(;;){
			
			// Menu di scelta opzionale			
			System.out.println("\n\n*******************[RUBRICA TELEFONICA]*************\n\n");
			System.out.println("Digita : 1) PER INTRODURRE UN NUOVO NOMINATIVO\n");
			System.out.println("Digita : 2) PER VISUALIZZARE L'ELENCO DEI NOMINATIVI\n");
			System.out.println("Digita : 3) PER ELIMINARE UN NOMINATIVO\n");
			System.out.println("Digita : 4) PER USCIRE DALLA RUBRICA TELEFONICA\n\n\n");
						
			// Impostazioni dello standard input			
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader pigia_tasto = new BufferedReader(input);
			
			// Gestione delle eccezioni
			// Blocco try{ Codice che potrebbe generare eccezione } 
		    // Prova le varie chiamate del metodo		
			try
			{					
				
				String num_opzscelta;
				
				// Scelta del menu
			    System.out.print("\n\nDIGITA L'OPZIONE DESIDERATA : ");

				// Chiamata al metodo readLine()
				num_opzscelta = pigia_tasto.readLine();
				scelta = Integer.valueOf(num_opzscelta).intValue();
			}			
			
			/* Blocco catch(Type1 id1){ Gestione eccezione di Type1 }
		  	E' simile ad un metodo che accetta un solo argomento
		    Se viene generata un'eccezione il gestore delle eccezioni cerca il
		    primo gestore con un argomento che corrisponde al tipo di eccezione
		    quindi entra nella clausola catch e l'eccezione viene considerata
		    come gestita */			
			catch (Exception e)
			{				
				System.out.println("Scelta non corretta");
				continue;				
			}			
			
			switch(scelta)
			{
				case 1 :
				
						// Scelta per introdurre un nuovo nominativo					
						voce = new Voce();						
						voce.visualizza_Nominativi();					
						rubr.aggiungi_Voce(voce) ;					
						break;					
					// fine del case 1				
				
				case 2 :
				
						// Scelta per visualizzare un nominativo					
						rubr.visualizza_Posizione();					
						break;					
					// fine case 2					
					
				case 3 :
									
						// Scelta per eliminare un nominativo
						int posizione = rubr.leggi_Posizione();				
						rubr.elimina_Voce(posizione);
						break;					
					// fine case 3				
				
				case 4 :
									
						// Opzione del menu per uscire dal programma
						System.out.println("USCITA DALLA RUBRICA TELEFONICA");
						return;					
					// fine del case 4
								
				default : 
				
						System.out.println("ERRORE : 387234\n\n");
						break;
					// fine del default 
			}	// fine switch	
		}	// fine del for()
	}		
} // fine della classe	