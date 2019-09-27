package geometria;

public class Quadrato extends Rettangolo {
	
	private int lato;
	
	public Quadrato(Punto p, int l) {
		super(p, l, l);
		this.lato = l;
		System.out.println("sono nel metodo costruttore del quadrato");		
	}

	/* (non-Javadoc)
	 * @see geometria.Rettangolo#getPerimetro()
	 */
	@Override
	public int getPerimetro() {
		// TODO Auto-generated method stub
		System.out.println("sono nel metodo get perimetro del quadrato");
		return this.lato * 4;
	}

	
	
}
