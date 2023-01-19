import java.util.ArrayList;
import java.util.TreeSet;

public class Aula {

	public static void main(String[] args) {

		Studente s1 = new Studente("01", "mauro", "boglia");
		Studente s2 = new Studente("02", "marco", "z2");
		Studente s3 = new Studente("03", "denilson", "a3");
		Studente s4 = s2;
		
		ArrayList<Studente> aula = new ArrayList<>();
		TreeSet<Studente> ordinati = new TreeSet<>();
		
		aula.add(s1);
		aula.add(s3);
		aula.add(s2);
		aula.add(s4);
		
		
		
		
		for (Studente studente : aula) {
			System.out.println(studente.matricola);
			ordinati.add(studente);
			
		}
		
		System.out.println(ordinati);
		
		
		
	}

}
