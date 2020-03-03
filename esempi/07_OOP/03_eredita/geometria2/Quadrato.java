
public class Quadrato extends Rettangolo{
	
	int base = 500;
	
	public Quadrato(int x1, int y1, int lato){
		super(x1,y1,lato,lato);
		this.base = lato;
	}
	public int perimetro(int base){
		return 4 * this.base;
	}
}
