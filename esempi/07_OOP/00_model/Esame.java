package model;

public class Esame {

	private Studente studente;
	private Materia materia;
	private int voto;
	
	public Esame(Studente studente, Materia materia, int voto) {
		super();
		this.studente = studente;
		this.materia = materia;
		this.voto = voto;
	}

	public Studente getStudente() {
		return studente;
	}

	public Materia getMateria() {
		return materia;
	}

	public int getVoto() {
		return voto;
	}

	@Override
	public String toString() {
		return "Esame [studente=" + studente + ", materia=" + materia + ", voto=" + voto + "]";
	}
	
	
	
}
