package progetti.aula.v3;

public class StudenteTester {

	public static void main(String[] args) {

		Registro registro = new Registro();
		
		
		for(Studente s : registro.elenco){
			System.out.println(s);
		}
		
		for (Studente stud : registro.elenco) {
			System.out.println(   stud.getCognome() + " " + stud.getNome()   );
		}
		
	}

}
