package aula;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class StudenteTester {
	
	//static boolean switcher = true;
	
	//dichiaro il mio array di studenti, è statico quindi appartiene alla classe e può essere utilizzato da tutti i metodi
	static Studente[] studenti =  new Studente[15];
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*		
		if(switcher){
			studenti  =  new Studente[15];
		
		}
		else {
			studenti  =  new Studente[18];
		}
		*/
		
		
		//inizializzo il mio array di studenti
		studenti[0] = new Studente("Annarita", "Amendola", 'F'  );
		studenti[1] = new Studente("Umberto", "Angelone", 'M'  );
		studenti[2] = new Studente("Edita", "Burovaite", 'F'  );
		studenti[3] = new Studente("Federica", "Caiulo", 'F'  );
		studenti[4] = new Studente("Paolo", "Cetola", 'M'  );
		studenti[5] = new Studente("Maurizio", "Cristiani", 'M'  );
		studenti[6] = new Studente("Marco", "De palma", 'M'  );
		studenti[7] = new Studente("Luca ", "Di Biase", 'M'  );
		studenti[8] = new Studente("emmanuel", "dzuko sakepa", 'M'  );
		studenti[9] = new Studente("Jean claude", "fansi", 'M'  );
		studenti[10] = new Studente("Michele", "La riccia", 'M'  );
		studenti[11] = new Studente("Tina", "Labate", 'F'  );
		studenti[12] = new Studente("Raul", "Lara Molina", 'M'  );
		studenti[13] = new Studente("Teresa", "Missanelli", 'F'  );
		studenti[14] = new Studente("Chiara", "Quattrocchi", 'F'  );

		//chiamo una funzione (statica) che stampa l'elenco con un ciclo for 
		stampaElenco();
		
		//chiamo una funzione (statica) che stampa l'elenco con un ciclo foreach 
		stampaElencoForeach();
	

	}


	private static void stampaElencoForeach() {
		for (Studente s : studenti) {
			System.out.println(         s       );
		}
		
	}


	private static void stampaElenco() {
		for (int i = studenti.length - 1; i >= 0 ; i--) {
			
			System.out.println("è presente: " + studenti[i]  + "?");
			String presente = scanner.next();
			if (presente.equalsIgnoreCase("s")){
				studenti[i].presente = true;
			}
			else if (presente.equalsIgnoreCase("n")){
				studenti[i].presente = false;
				
			}
			else{
				System.out.println("non ho capito...");
			}
				
			
		}
		
	}
	
	
	
	
}
