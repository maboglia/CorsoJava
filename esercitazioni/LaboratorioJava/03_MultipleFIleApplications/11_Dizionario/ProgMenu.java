import java.io.*;

class ProgMenu {
	
	public static void main(String args[])
	{	
		// Creazione degli oggetti delle classi definite
		Menu menu = new Menu();
		Parola parola;
		Dizionario dizionario = new Dizionario();
		
		int scelta;
		
		scelta = menu.scelta();
	
		while(scelta != 3)
		{
			if (scelta == 1)
			{	
				// Creazione dell'oggetto				
				parola = new Parola();
				
				// Ricerca della parola in inglese all'interno del file				
				parola = dizionario.leggiFile(menu.recupera_Parola());
				
				// Se trova la parola...				
				parola.stampa();			
				// ...stampa la traduzione
			}	
			
			// Inserimento del vocabolo in italiano e delle relative traduzioni			
			else if (scelta == 2)
			{	
				// Creazione dell'oggetto
				parola = new Parola();
				
				// Acquisisce in input la parola
				parola.insParola();
				
				// Scrive la parola sul file
				dizionario.scriviFile(parola);
			}
			
			else if (scelta == 3) {}
			
				
			scelta = menu.scelta();
		}
		
		System.out.println("FINE DEL PROGRAMMA");
	}
}