package patterns;

public class MVCPatternDemo {

	public static void main(String[] args) {
		Studente s1 = new Studente(1, "pippo"); 
		StudentView sv = new StudentView();
		StudenteController ctrl = new StudenteController(s1, sv);
		
		
		ctrl.aggiornaVista();
		
		ctrl.setStudenteMatricola(23);
		ctrl.aggiornaVista();
		
	}

}
