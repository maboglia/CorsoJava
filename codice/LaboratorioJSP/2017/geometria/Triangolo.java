package geometria;

public class Triangolo {

	public Segmento a, b, c;
	
	private Punto v1, v2, v3;
	
	public Triangolo(Punto v1, Punto v2, Punto v3){
		
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		
		this.a = new Segmento(v1, v2);
		this.b = new Segmento(v2, v3);
		this.c = new Segmento(v3, v1);
		
		
	}
	
	public double perimetro(){
		return a.lunghezza() + b.lunghezza() + c.lunghezza();
	}
	
	
	public double area(){
		double area = 0;
		double sp = this.perimetro() / 2;
		
		//applico il teorema di Erone
		area = Math.sqrt(
				sp *
					( sp - this.a.lunghezza() ) *
					( sp - this.b.lunghezza() ) *
					( sp - this.c.lunghezza() ) 
				
				);
		return area;
		
	}
}
