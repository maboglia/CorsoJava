package p001;

public class PietraForbiciCarta {

		static String player1, player2;
	
	public static void main(String[] args) {

	
		for (int i = 0; i < 10; i++) {
			player1 = gioca();
			player2 = gioca();
			String risultato = trovaVincitore();
			System.out.println(player1 + "\t" + player2);
			System.out.println(risultato);
		}
	}

	private static String trovaVincitore() {
		String s = null;		
		
		if(player1.equals(player2)){
			 s = "pareggio";
		}
		else{
		switch (player1) {
		case "Pietra":
				s = player2.equals("Forbici")?"vince player1":"vince player2";
				
			break;
		case "Forbici":
			s = player2.equals("Carte")?"vince player1":"vince player2";
			break;
		case "Carta":
			s = player2.equals("Pietra")?"vince player1":"vince player2";
			break;

		default:
			s = "non so dire chi ha vinto";
			break;
		}
		}
		return s;
	}

	private static String gioca() {
		String s = null;
		
		double r = Math.random();
		
		if (r < 0.34){
			s = "Pietra";
		}
		else if (r < 0.67){
			s = "Forbici";
		}
		else {
			s = "Carta";
		}

		return s;
	}

	
	
}
