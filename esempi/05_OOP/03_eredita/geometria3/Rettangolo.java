
 public class Rettangolo extends Figure {
  private Punto AngoloUpSx=null;
  
  protected int base = 0, altezza=0;

  
  public Rettangolo(int x1, int y1, int b, int h)
  {   
	  super();
	  
	  AngoloUpSx = new Punto(x1,y1); base=b; altezza=h;}
  
  public Rettangolo()
  { this(0,1,2,1);}
  
  
  //con coordinate angolo in alto a sinistra e quelle dell'angolo in basso a destra
  public Rettangolo(Punto p, int x2, int y2)
  { this(p.getX(), p.getY(), x2-p.getX(), y2-p.getY());}
    
  public double perimetro() {return 2*(base+altezza);}
  
  public double area() {return base*altezza;}

  
}
