
public class Cerchio extends Figure {
	int xCentro=0, yCentro=0;
	int raggio=1;
	
	public Cerchio() {};
	public Cerchio(int x, int y, int r)
	{
		super();
		
		xCentro=x; yCentro=y; raggio=r;
		
	}
	
	double perimetro()
	{return 2*Math.PI*raggio;}
	
	public double area()
	{return Math.PI*raggio*raggio;}

}
