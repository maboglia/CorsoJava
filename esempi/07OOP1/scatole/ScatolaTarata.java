package scatole;

public class ScatolaTarata extends ScatolaPesante {

	double peso;
	
	public ScatolaTarata(double tara){
		super();
		peso = tara;
	}
	
	double pesoNetto(){
		return super.peso -  this.peso;
	}
	
}
