package settimana05;

import java.util.ArrayList;
import java.util.Random;

public class ContoCorrenteTester2 {

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
				
				System.out.println(contoCorrente.getTitolare() + " " + contoCorrente.getSaldo());
			}
			System.out.println("------------------------------------------");
		}
		

		//stamp le info su tutti i c/c
		for (ContoCorrente contoCorrente : sportello1) {
			System.out.println(contoCorrente);
		}
		
		double denaroDisponibile=0.0;
		//quanto ha in cassa la banca?
		for (ContoCorrente contoCorrente : sportello1) {
			denaroDisponibile += (contoCorrente.getSaldo());
		}		
		System.out.println("In banca ci sono " + denaroDisponibile + " euro");
	}

}
