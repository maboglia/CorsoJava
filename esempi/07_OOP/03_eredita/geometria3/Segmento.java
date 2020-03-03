//il segmento è in relazione COMPOSED OF con la classe punto
public class Segmento {
	
	private Punto p1 = null;
	private Punto p2 = null;
	
	public Segmento(int x1, int y1, int x2, int y2)
	{
	   p1 = new Punto(x1, y1); p2 = new Punto(x2,y2);	
	}

    //segmento con un estremo nell'origine
	public Segmento(int x2, int y2) { this(0,0, x2,y2); }
	
	public Segmento() {this(0,0,0,0); }
	
	public double lunghezza()
	{ return Math.sqrt( Math.pow(p2.getX() - p1.getX(), 2) + 
			            Math.pow(p2.getY() - p1.getY(), 2) );
	}
}
