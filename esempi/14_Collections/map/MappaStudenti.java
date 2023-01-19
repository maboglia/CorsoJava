import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MappaStudenti {

	public static void main(String[] args) {

		Studente s1 = new Studente("01", "mauro", "boglia");
		Studente s2 = new Studente("02", "marco", "z2");
		Studente s3 = new Studente("03", "denilson", "a3");

		ArrayList<Studente> alAula = new ArrayList<>();
	
		
		alAula.add(s1);
		alAula.add(s3);
		alAula.add(s2);

		HashMap<String, Studente> aula = new HashMap<>();

		for (Studente studente : alAula) {
			aula.put(studente.matricola, studente);
		}
		
		System.out.println(alAula);
		System.out.println(aula);
		
		System.out.println(alAula.get(0));
		System.out.println(aula.get("01"));
		
		Map<String, String> capoluoghi = new HashMap<>();
		capoluoghi.put("piemonte", "torino");
		capoluoghi.put("lombardia", "milano");
		capoluoghi.put("campania", "napoli");
		
//		System.out.println(capoluoghi.size());
//		System.out.println(capoluoghi.get("lombardia"));
		Set cc = capoluoghi.keySet();
		Set es = capoluoghi.entrySet();
		
		for (Object object : es) {
			System.out.println(object);
		}
		
		for (Object object : cc) {
			System.out.println(object);
			System.out.println(capoluoghi.get(object));
		}

	}

}
