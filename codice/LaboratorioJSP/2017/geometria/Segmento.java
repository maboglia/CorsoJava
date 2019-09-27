package geometria;

public class Segmento {

	private Punto a = null;
	private Punto b = null;
	
	public Segmento(Punto a, Punto b){
		this.a = a;
		this.b = b;
	}
	
	public Segmento (int x1, int y1,int x2, int y2){
		this.a = new Punto(x1, y1);
		this.b = new Punto(x2, y2);
	}
	public Segmento(){
		this(1,2,3,4);
	}
	
	public double lunghezza(){
		
		double d=0;
		d = Math.sqrt(
				Math.pow((   b.getX() - a.getX()   )  , 2) +
				Math.pow((   b.getY() - a.getY()   )  , 2) 
				
				);	
		return d;
	}
	
}
