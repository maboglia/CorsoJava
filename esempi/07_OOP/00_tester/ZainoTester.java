package settimana06;

import java.util.Scanner;

public class ZainoTester {

	public static void main(String[] args) {


		Zaino invicta = new Zaino("Invicta", "rosso", 25.00);
		
		invicta.inserisciCosa(new Oggetto("bottiglietta acqua", "da mezzo litro", 0.5));
		invicta.inserisciCosa(new Oggetto("panino", "pomodoro, mozzarella", 0.6));
		invicta.inserisciCosa(new Oggetto("3 x cassa acqua", "naturale da 1,5 lt", 27.0));
		
		invicta.elencaContenuto();
		
		System.out.println(      invicta.infoVolume()    );
		
		System.out.println("quale oggetto vuoi prendere?");
		Scanner sc = new Scanner(System.in);
		
		Oggetto preso = invicta.prendiCosa(   sc.nextInt()     );
		System.out.println("hai preso " + preso.getNome() );
		invicta.elencaContenuto();
		
		System.out.println(      invicta.infoVolume()    );
	}

}
