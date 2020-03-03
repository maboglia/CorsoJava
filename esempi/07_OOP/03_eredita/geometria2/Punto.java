
public class Punto {
	//incapsulamento
	private int x = 0;
	private int y = 0;
	static private int conta = 0;
	
	public static int getConta() {
		return conta;
	}

	//metodo costruttore, 
	public Punto(int x, int y){
		this.x = x;
		this.y = y;
		conta++;
	}
	public Punto(int x){
		this(x,0);
	}
	public Punto(){
		this(0,0);
	}
	//metodi accessori getter x, y
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	//metodi modificatori setter x, y
	public void setX(int x){
		
		this.x = x;
		
	}
	public void setY(int y) {
		this.y = y;
	}
	//altri metodi
	public int trovaPunto(){
		
		if (x > 0 && y >0)
			return 1;
		else
			if (x < 0 && y >0)
				return 2;
			else
				if (x < 0 && y <0)
					return 3;
				else
					if (x > 0 && y < 0)
						return 4;
					
					else return 0;

	}
	
}
