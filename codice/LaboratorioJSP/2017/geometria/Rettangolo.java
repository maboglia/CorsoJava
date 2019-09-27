package geometria;

public class Rettangolo {

	private Punto angoloSx = null;
	private int base, altezza;
	
	public Rettangolo(  int x, int y, int b, int h   ){
		this.angoloSx = new Punto(x, y);
		this.base = b;
		this.altezza = h;		
	}

	public Rettangolo(  Punto p, int b, int h   ){
		System.out.println("sono nel metodo costruttore del rettangolo");
		this.angoloSx = new Punto(p.getX(), p.getY());
		this.base = b;
		this.altezza = h;		
	}
	
	public int getPerimetro(){
		System.out.println("sono nel metodo get perimetro del rettangolo");
		
		return (base + altezza) *2;
	}

	public int getArea(){
		return base * altezza;
	}
	
}
