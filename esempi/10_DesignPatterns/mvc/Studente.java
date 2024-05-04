package patterns;

//POJO Plain Old Java Object - JavaBean = una classe con prop private
//, costruttore senza param
public class Studente {

	private int nMat;
	private String nome;
	
	public Studente() {//Studente s = new Studente(); s.setNome("pippo");
		// TODO Auto-generated constructor stub
	}
	
	public Studente(int nMat, String nome) {//
		this.nMat = nMat;
		this.nome = nome;
	}

	public int getnMat() {
		return nMat;
	}
	public void setnMat(int nMat) {
		this.nMat = nMat;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
