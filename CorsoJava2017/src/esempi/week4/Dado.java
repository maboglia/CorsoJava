package esempi.week4;

import java.util.Random;

public class Dado {
	
	int facce = 6;
	String colore = "bianco";
	int faccia;

	public int lancia(){
		
		Random random = new Random();
		
		this.faccia = random.nextInt(facce) + 1;
		
		return this.faccia;
		
	}


}
