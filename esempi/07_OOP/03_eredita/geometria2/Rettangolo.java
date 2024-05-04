
public class Rettangolo {

	private Punto angoloSx = null;
	private int base, altezza;

	public Rettangolo(int x, int y, int b, int h){
		angoloSx = new Punto(x, y);
		base = b;
		altezza = h;
	}

	public Rettangolo(){
		this(0,1,2,1);
	}

	public Rettangolo(Punto p, int x2, int y2, int base, int altezza){
		this(p.getX(), p.getY(), x2-p.getX(),y2-p.getY());
	}
	public int perimetro(){
		return 2*(base + altezza);
	}
	public int area() {
		return base * altezza;
	}
	
	
	
}
