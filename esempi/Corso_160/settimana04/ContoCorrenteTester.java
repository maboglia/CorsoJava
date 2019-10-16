package settimana04;

import java.util.ArrayList;
import java.util.Random;

public class ContoCorrenteTester {

	public static void main(String[] args) {


		String[] clienti = { "Mauro", "Maria", "Giovanni", "Peppino", "Francesca"    };
		
		Random ammontare = new Random();
		
		ArrayList<ContoCorrente> sportello1 = new ArrayList<>();
		
		for (String string : clienti) {
			
			sportello1.add(new ContoCorrente(string));
			
		}
		
		for (ContoCorrente contoCorrente : sportello1) {
			
			for (int i = 0; i < 5; i++) {
				
				if (Math.random() < 0.5 ) 
					contoCorrente.versamento(ammontare.nextDouble()*500);
				else
					contoCorrente.prelievo(ammontare.nextDouble()*500);					
				
			}
			
		}
		


		for (ContoCorrente contoCorrente : sportello1) {
			System.out.println(contoCorrente.getTitolare() + ": " +contoCorrente.getSaldo());
		}
		
		
	}

}
