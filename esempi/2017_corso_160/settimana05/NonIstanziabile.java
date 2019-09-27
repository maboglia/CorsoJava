package settimana05;

public class NonIstanziabile {

	 static int contatore = 0;
	
	public NonIstanziabile(){
		this.contatore++;
	}
	
	public int getContatore(){
		return this.contatore;
	}
	
	
}
