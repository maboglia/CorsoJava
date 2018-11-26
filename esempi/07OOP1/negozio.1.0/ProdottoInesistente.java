package negozio1;

public class ProdottoInesistente extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProdottoInesistente(){
		super("Il prodotto non è presente in magazzino");
	}
	
}
