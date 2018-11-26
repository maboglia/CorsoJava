package esempi.week8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import progetti.aula.v3.Studente;
public class EsempioMappe {

	private static Map<String, Studente> studenti = new HashMap<>();
	private static List<Studente> listaStudenti;
	
	public static void main(String[] args) {

		Studente s1 = new Studente("Barbara", "Ruggirello", 'f');
		Studente s2 = new Studente("Dario", "Mennillo", 'm');
		
		listaStudenti = new Vector<>();
		
		//System.out.println(s1.getMatricola());
		
		studenti.put(s1.getCognome(), s1);
		studenti.put(s2.getCognome(), s2);
		
		//values() ritorna la lista dei valori
		for (Studente stud : studenti.values()) {
			System.out.println(stud.getNome());
			if(stud.getGenere() == 'f'){
			listaStudenti.add(stud);
			System.out.println("Aggiunto alla lista" + stud.getCognome());
			}
		}
		
		//keySet() ritorna l'elenco delle chiavi
		for (String string : studenti.keySet()) {
			if (string.equals("Mennillo")){
			Studente std = studenti.get(string);
			System.out.println("Chiave: " + string + " valore: " +std.getNome() + std.getCognome());
			}
		}
	}

}
