package gestione.dipendenti;

import java.util.ArrayList;

public class GestioneDipendenti {

	public static void main(String[] args) {
		

		int[] giorniMese = {20, 18, 23, 20, 22, 18};
		String[] mesi = {"gennaio", "febbraio","marzo","aprile","maggio","giugno"};
		
		Dipendente d = new Dirigente("giovanna");
		Impiegato i = new Impiegato("francesco");
		Fattorino f = new Fattorino("piero");
		
		ArrayList<Dipendente> dipendenti = new ArrayList<>();
		dipendenti.add(d);
		dipendenti.add(i);
		dipendenti.add(f);
		
		System.out.println(d instanceof Impiegato);
		System.out.println(i  instanceof Impiegato);
		
		double totaleStipAnno = 0;
//		qui ciclo i mesi
		for (int j = 0; j < giorniMese.length; j++) {
			
			
			System.out.println("--------------------------");
			System.out.println("stipendi del mese di : " + mesi[j]);
			System.out.println("--------------------------");
			//qui ciclo i dipendenti
			for (Dipendente dipendente : dipendenti) {
				int ore;
				if (dipendente instanceof Fattorino){
					ore = 12;
				}
				else {ore = 8;}

				double stipendio = dipendente.calcolaStipendio(ore, giorniMese[j]);
				System.out.println("nominativo: " + 
												dipendente.getNome() + 
												" stipendio: " + 
												stipendio
												);
				totaleStipAnno += stipendio;
				System.out.println();
			}
			
//			double stipendio = i.calcolaStipendio(8, giorniMese[j]);
//			double stipendioFattorini = f.calcolaStipendio(8, giorniMese[j]);
//			System.out.println("impiegati: " + stipendio);
//			System.out.println("fattorini: " + stipendioFattorini);
		}
		
		System.out.println("--------------------------");
		System.out.println(totaleStipAnno);

		
	}

}
