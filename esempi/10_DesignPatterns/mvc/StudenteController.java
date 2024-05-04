package patterns;

public class StudenteController {

	private Studente model;
	private StudentView view;
	
	public StudenteController(Studente model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public void setStudenteName(String nome) {
		this.model.setNome(nome);
	}

	public void setStudenteMatricola(int matr) {
		this.model.setnMat(matr);;
	}
	
	public String getStudenteNome() {
		return this.model.getNome();
	}
	
	public int getStudenteMatricola() {
		return this.model.getnMat();
	}
	
	public void aggiornaVista() {
		
		String matricola = "000" + getStudenteMatricola();
		this.view.stampaDettaglio(getStudenteNome(), matricola);
	}
	
}
