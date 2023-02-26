package progetti.dipendenti.v1;

import java.util.ArrayList;

public class Dipendenti {

	public static void main(String[] args) {
		
		int oreLavorate = 100;
		
//		Lavoratore pippo = new Lavoratore("Pippo", "Rossi");
//		System.out.println(pippo.calcolaStipendio(oreLavorate));

		System.out.println("----------------");
		
		Fattorino gino = new Fattorino("Gino", "Verdi");
		System.out.println(gino.calcolaStipendio(oreLavorate));
		
		System.out.println("----------------");
		
		Impiegato impiegato = new Impiegato("Pino", "Gialli");
		System.out.println(impiegato.calcolaStipendio(oreLavorate));
		
		System.out.println("----------------");
		
		Dirigente d1 = new Dirigente("Panfilo Maria", "Sordi");
		System.out.println(d1.calcolaStipendio(oreLavorate));
		
		System.out.println("----------------");
		System.out.println("----------------");
		
		ArrayList<Lavoratore> dipendenti = new ArrayList<>();
		
//		dipendenti.add(pippo);
		dipendenti.add(gino);
		dipendenti.add(impiegato);
		dipendenti.add(d1);
		
		for (Lavoratore lavoratore : dipendenti) {
			System.out.println(lavoratore.getNome() + ": "+lavoratore.calcolaStipendio(oreLavorate));
			
		}
		
		
		
		
		

	}

}
