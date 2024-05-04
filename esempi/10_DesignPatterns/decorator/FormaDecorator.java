package model;

public abstract class FormaDecorator implements Forma{

	protected Forma decorForma;
	
	public FormaDecorator(Forma forma) {
		this.decorForma = forma;
	}
	
	@Override
	public void disegna() {
		
		decorForma.disegna();
		
	}

}
