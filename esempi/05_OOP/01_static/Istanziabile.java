package settimana05;

public class Istanziabile {

	 double contatore=0;
	 final int PIGRECO = 3;
	 final double ALIQUOTA_IVA = 0.22;
	 
	
	public Istanziabile(){
		contatore = Math.random();
		
	}
	
	public double getContatore(){
		return this.contatore;
	}
}
