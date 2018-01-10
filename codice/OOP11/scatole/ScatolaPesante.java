package scatole;

public class ScatolaPesante extends Scatola {

	double peso;
	
	public double pesoSpecifico(){
		System.out.println("sto calcolando il peso specifico");
		return peso / volume();
	}
	
}
