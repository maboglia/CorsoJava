package esempio;

public class Cerchio extends Forma {
	private double raggio;
	
	public Cerchio(double r) {
		super();
		raggio = r;
	}
	
	// SOSTITUISCO I METODI DELLA SUPERCLASSE
	
	// area del cerchio r^2 * pigreco;
	public double area() {
		return Math.PI * raggio * raggio;
	}
	
	// diametro * pigreco
	public double perimetro() {
		return Math.PI * raggio * 2;
	}
}
