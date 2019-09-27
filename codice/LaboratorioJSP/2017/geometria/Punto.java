package geometria;

public class Punto {

	private int x=0, y=0;
	private static int contatore = 0;
	
	public Punto(int _x, int _y){
		this.x = _x;
		this.y = _y;
		setContatore();
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the contatore
	 */
	public static int getContatore() {
		return contatore;
	}

	/**
	 * @param contatore the contatore to set
	 */
	private static void setContatore() {
		Punto.contatore++;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String s = "(" + this.x + ", " + this.y +")";
		return s;
	} 
	
	
	
	
}
