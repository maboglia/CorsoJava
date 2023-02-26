import java.util.Scanner;

public class Tris {

	public static void main(String[] args) {
		
		// dichiara e crea l'array che rappresenta lo schema
		// NOTA: ARRAY BIDIMENSIONALE (CON DUE INDICI)
		// RAPPRESENTA UNA TABELLINA CON 3 RIGHE E 3 COLONNE
		char[][] schema = new char[3][3];
		
		// inizializza lo schema spazi bianchi
		// NOTA: L'ARRAY PASSATO AL METODO VIENE MODIFICATO
		// DAL METODO STESSO. DIVERSAMENTE DA QUANTO ACCADE
		// CON LE SINGOLE VARIABILI PASSATE COME ARGOMENTI
		// IL METODO NON LAVORA SU UNA COPIA!
		inizializza(schema);
			
		// contatore mosse e flag di vittoria di X e O
		int mosse=0;
		boolean vittoriaX=false;
		boolean vittoriaO=false;
		
		// giocatore di turno
		char turno='X';
		
		// ciclo principale
		while (mosse<9 && !vittoriaX && !vittoriaO) {

			// mostra lo schema
			visualizza(schema);

			// gestisce la prossima mossa
			// NOTA: L'ARRAY PASSATO AL METODO VIENE MODIFICATO
			// DAL METODO STESSO (COME SOPRA)
			nuovamossa(schema,turno);
			mosse++;
			
			// verifica se la mossa e' stata vincente
			// e aggiorna il flag corrispondente al giocatore
			// di turno
			if (turno=='X') 
				vittoriaX = haVinto(schema,'X');
			else 
				vittoriaO = haVinto(schema,'O');
			
			// aggiorna il turno
			if (turno=='X') turno='O';
			else turno='X';
			
		}
		
		// mostra lo schema alla fine della partita
		visualizza(schema);
		
		// stampa il messaggio con l'esito della partita
		if (vittoriaX) System.out.println("COMPLIMENTI X, HAI VINTO!!!");
		else if (vittoriaO) System.out.println("COMPLIMENTI O, HAI VINTO!!!");
		else System.out.println("Niente da fare... PAREGGIO!");
		
	}
	
	// metodo ausiliario che inizializza lo schema con caratteri di spazio
	private static void inizializza(char[][] schema) {
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++)
				schema[i][j] = ' ';
	}
	
	// metodo ausiliario che stampa lo stato dello schema
	private static void visualizza(char[][] schema) {
		for (int i=0; i<3; i++) {
			System.out.println(" -------------");
			for (int j=0; j<3; j++) {
				System.out.print(" | " + schema[i][j]);
			}
			System.out.println(" |");
		}
		System.out.println(" -------------");
	}

	// metodo ausiliario che gestisce una mossa
	private static void nuovamossa(char[][] schema, char turno) {
		
		Scanner input = new Scanner(System.in);
		
		int riga, colonna; // coordinate della mossa
		boolean valida; // flag per controllare se la posizione e' corretta e libera
		
		do {
			
			valida = true;
			
			System.out.println("[Turno " + turno + "] Inserisci riga e colonna della mossa");
			riga = input.nextInt();
			colonna = input.nextInt();
			
			if (riga<0 || riga>2 || colonna<0 || colonna>2) {
				valida = false;
				System.out.println("Riga e colonna devono essere tra 0 e 2");
			} else if (schema[riga][colonna]!=' ') {
				valida=false;
				System.out.println("Posizione occupata, ritenta");
			}
		} while (!valida);

		// inserisce il carattere X o O (a seconda del turno) nella posizione scelta
		schema[riga][colonna] = turno;
	}

	
	// metodo ausiliario che verifica se il giocatore identificato da c (X o O) ha vinto
	private static boolean haVinto(char[][] schema, char c) {
		
		boolean ris=false;
		
		// controlla tutte le righe
		for (int i=0; i<3; i++)
			if ( schema[i][0]==c && schema[i][1]==c && schema[i][2]==c) ris = true;
		
		// controlla tutte le colonne
		for (int i=0; i<3; i++)
			if ( schema[0][i]==c && schema[1][i]==c && schema[2][i]==c) ris = true;
		
		// controlla le diagonali
		if ( schema[0][0]==c && schema[1][1]==c && schema[2][2]==c) ris = true;
		if ( schema[0][2]==c && schema[1][1]==c && schema[2][0]==c) ris = true;
		
		return ris;
	}
}
