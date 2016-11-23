package giochi;

public class RockScissorsPaper {

	public static void main(String[] args) {
		
		String[] scelte = {"", "ROCK", "SCISSORS", "PAPER"};
		
		//1 mostra possibili scelte
		
		


		//5  mostra risultato
		
		for (;;) {
			System.out.println("############ROCK SCISSORS PAPER################");
			System.out.println("1) ROCK");
			System.out.println("2) SCISSORS");
			System.out.println("3) PAPER");
			System.out.println("fai la tua mossa");
			//2 rileva scelta utente
			int sceltaUtente = InputDati.leggiIntero(" inserisci un numero da 1 a 3");
			
			//System.out.println("############Umano: "+  scelte[sceltaUtente]  +"################");
			
			//3 rileva scelta computer
			int sceltaComputer = (int) (Math.random() * scelte.length);
			//System.out.println("############Computer: "+  scelte[sceltaComputer]  +"################");

			
			//4 confronta sceltemostra risultato
			String vittoria = confronta(sceltaUtente, sceltaComputer);
			
			System.out.println("############Risultato: "+  vittoria  +"################");
			System.out.println(vittoria);
			if (sceltaUtente > 3)
				break;
		}
		
		
		
		
		//6 esci
		
		
		
		
		
		
		
		
		

	}

	private static String confronta(int sceltaUtente, int sceltaComputer) {
		
		if (sceltaUtente == sceltaComputer ) return "Pareggio";
		else if (sceltaUtente == 1 && sceltaComputer==2) return "vince l'UMANO";
		else if (sceltaUtente == 2 && sceltaComputer==3) return "vince l'UMANO";
		else if (sceltaUtente == 3 && sceltaComputer==1) return "vince l'UMANO";
			
		
		return "Vince il computer";
	}

}
