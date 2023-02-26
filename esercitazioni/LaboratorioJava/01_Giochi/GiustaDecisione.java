package programmini;

public class GiustaDecisione {

	public void gioca() {
		
		final int RIPETIZIONI = 10;
		
		String decisione1 = "SI";
		String decisione2 = "NO";
		double casuale;
		int numeroSi=0, numeroNo=0;
		
		//inizializzo un ciclo for		
		for (int i = 0; i < RIPETIZIONI; i++) {
			
			casuale = Math.random();
			
			if (  casuale < 0.5   ) {
				
				//System.out.println(decisione1);
				numeroSi++;
				
			}
			else {
				//System.out.println(decisione2);
				numeroNo++;
			}
		}
		System.out.println("-------------------");
		System.out.println("La risposta è: ");
		if (numeroSi == numeroNo)
			System.out.println("NON SO");
		else if (numeroSi > numeroNo)
			System.out.println(decisione1);
		else
			System.out.println(decisione2);
		System.out.println("-------------------");
		
		
	}
}
