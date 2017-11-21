package progetti.aula.v3;

import java.util.ArrayList;

public class Registro {

	//final int POSTAZIONI = 18;
	
	ArrayList<Studente> elenco = new ArrayList<>();
	

	public  Registro(){
		elenco.add( new Studente("Roberto","Balzano",'M')     );
		elenco.add( new Studente("Vittorio","Bellia",'M')     );
		elenco.add( new Studente("Monica","Canal Monteagudo",'F')     );
		elenco.add( new Studente("Simone","Bombaci",'M')     );
		elenco.add( new Studente("Sergio","Marzullo",'M')     );
		elenco.add( new Studente("Dario","Mennillo",'M')     );
		elenco.add( new Studente("Anna","Messina",'F')     );
		elenco.add( new Studente("Amedeo","Minozzi",'M')     );
		elenco.add( new Studente("Antonio","Morabito",'M')     );
		elenco.add( new Studente("Angelo","Nicosia",'M')     );
		elenco.add( new Studente("Barbara","Ruggirello",'F')     );
		elenco.add( new Studente("Emilio","Passannanti",'M')     );
		elenco.add( new Studente("Gabriele","Sacchet",'M')     );
		elenco.add( new Studente("Alessandra","Sorrentino",'F')     );
		elenco.add( new Studente("Niccolo","Triscio",'M')     );
		elenco.add( new Studente("Ferdinando","Vassallo",'M')     );
		elenco.add( new Studente("Alessandra","Zilioli",'F')     );
	}
	
}
