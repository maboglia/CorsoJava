package studenti;

public class Aula {

	String corso;
	
	Studente[] studentiTSS = {
		    new Studente("bryan", "folleco", 1999),
		    new Studente("igli", "balliu", 1998),
		    new Studente("artur", "holobut", 1992),
		    new Studente("ludovica", "magnano", 1993),
		    new Studente("alexandru", "boaca", 1994),

		    new Studente("dario", "d'abbiero", 1990),
		    new Studente("giuseppe", "minniti", 1995),
		    new Studente("simone", "marzorati", 1997),
		    new Studente("danut", "andres", 1995),
		    new Studente("alberto", "tito", 1990),
		    new Studente("andrei", "tasca", 1991),

		    new Studente("cristiano", "maffeis", 1995),
		    new Studente("marco", "de palma", 1996),
		    new Studente("denilson", "vargas", 1992),
		    new Studente("daniele", "spada", 1988),
		    new Studente("fabio", "caccia", 1997),
		    new Studente("davide", "tacchino", 1995)
			
			
	};
	
	void stampaElenco(){
		
//		for (int i = 0; i < this.studentiTSS.length; i++) {
////			System.out.print (this.studentiTSS[i].getCognome().toUpperCase()  + "\t" );
////			System.out.print (this.studentiTSS[i].getNome().toUpperCase()  + "\t" );
////			System.out.println(this.studentiTSS[i].getEta());
//			System.out.println(this.studentiTSS[i]);
//		}
		for (Studente s : studentiTSS) {
			System.out.println(s.firmaInversa().toUpperCase());
		}

		for (int i = studentiTSS.length -1; i >=0 ; i--) {
			System.out.println (this.studentiTSS[i].getCognome().toUpperCase()  + "\t" );
////		System.out.println();
		}
	
	
	};
	
}
