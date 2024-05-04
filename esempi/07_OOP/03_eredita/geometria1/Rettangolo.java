package esempio;

public class Rettangolo extends Forma {
	private double base;
	private double altezza;
	
	public Rettangolo(double b, double h) {
		super();
		base = b;
		altezza = h;
	}
	
	public double area() {
		return base * altezza;
	}
	
	public double perimetro() {
		return 2 * (base + altezza);
	}
}
