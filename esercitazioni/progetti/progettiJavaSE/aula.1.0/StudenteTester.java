package esempi.week4;

public class StudenteTester {

	public static void main(String[] args) {

		Registro registro = new Registro();
		registro.inizializzaRegistro();
		
		for(Studente s : registro.elenco){
			System.out.println(s);
		}
		
		
	}

}
