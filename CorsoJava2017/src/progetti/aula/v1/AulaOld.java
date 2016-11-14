package progetti.aula.v1;

import java.util.Date;

public class AulaOld {

	public static void main(String[] args) {
		
		String[] nomi = {  
				"Roberto",
				"Antonio",
				"Angelo",
				"Amedeo",
				"Dario",
				"Barbara",
		};
		
		Studente[] miaAula;
		//costruttore di studente
		miaAula = new Studente[6];
		
		for(int i =0; i<nomi.length;i++ ){
			miaAula[i] = new Studente( nomi[i], "TEST"  );
			miaAula[i].stampaSaluto();
			System.out.println( miaAula[i].getNome() );
			
		}
		
		String[] cognomi;
		
		for(int i = 0; i < nomi.length; i++){
			
			System.out.println(nomi[i]);
			
			
		}
		
		
		
		
		
		
		/*
		Studente studente1 = new Studente("studente18", "cognomeGiusto");
		studente1.creaStudente("studente1","cognome", new Date());
		studente1.stampaSaluto();
		studente1.faiAddizione(23,42);
		

		studente1.creaStudente("studente18", "cognomeGiusto", new Date());

		studente1.stampaSaluto();
		studente1.faiAddizione(10,15);
		studente1.faiAddizione(10,16);
		studente1.faiAddizione(10,17);
		studente1.faiAddizione(10,18);
		studente1.faiAddizione(10,19);
		studente1.faiAddizione(10,20);
		
		Studente studente2 = new Studente("studente2", "cognome");
		studente2.creaStudente("studente2", "cognome", new Date(2000,1,12));
		studente2.stampaSaluto();
		studente2.faiAddizione(10,19);
		studente2.faiAddizione(10,20);
*/

		
		
	}

}
