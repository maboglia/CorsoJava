package model;

public class CromatoreForme extends FormaDecorator{

	public CromatoreForme(Forma forma) {
		super(forma);
	}
	
	
	
	@Override
	public void disegna() {

		decorForma.disegna();
		cromaTutto(decorForma);
		
	}



	private void cromaTutto(Forma forma) {
		System.out.println("Ho cromato l'oggetto " + forma);
	}
	
}
