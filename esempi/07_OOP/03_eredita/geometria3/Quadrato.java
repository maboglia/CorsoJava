
public class Quadrato extends Rettangolo {
	
	public Quadrato() {this(0,0,10);}
	
	public Quadrato(int x1, int y1, int lato) 
	{	
		super(x1,y1,lato,lato); 
	}
	
    public double perimetro()  //overrides overriding 
    { return base*4;} 
    
    
     
     
    		 
}
