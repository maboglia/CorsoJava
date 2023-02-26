package programmini;

import java.util.Scanner;

public class Giochi {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean esci = false;
		
		while(!esci) {
			menu();
			int i = getInput("Scegli un numero per continuare");
		
			switch (i) {
			case 1:
				System.out.println("Vuoi giocare a Giusta decisione");
				//GiustaDecisione.gioca();
				GiustaDecisione gd = new GiustaDecisione();
				gd.gioca();
				
				
				break;
			case 2:
				System.out.println("Vuoi giocare a Indovina il numero");
				GuessNumber gn = new GuessNumber();
				gn.gioca();
				
				break;
			case 3:
				System.out.println("Vuoi giocare a PFC");
				break;
			case 0:
				esci = true;
				System.out.println("arrivederci...");
				break;
			default:
				System.out.println("Opzione non disponibile");
				break;
			}
			
		}
	}
	
	//metodi ausiliari
	private static int getInput(String messaggio) {
		System.out.println(messaggio);
		int s = Giochi.scan.nextInt();
		System.out.println("Hai scritto " + s);
		return s;
	}
	
	private static void menu() {
		System.out.println("---------------------------");
		System.out.println("1) Giusta decisione");
		System.out.println("2) Indovina il numero");
		System.out.println("3) Pietra, forbici, carta");
		System.out.println("0) Esci");		
		System.out.println("---------------------------");
	}
	
	

}
