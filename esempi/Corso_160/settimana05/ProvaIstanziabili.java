package settimana05;

public class ProvaIstanziabili {

	public static void main(String[] args) {
		

		Istanziabile ista = new Istanziabile();
		System.out.println(  ista + " "+ ista.contatore   );

		Istanziabile ista2 = new Istanziabile();
		System.out.println(  ista2 + " "+ ista2.getContatore()   );
		

		System.out.println(NonIstanziabile.contatore);
		
		
	}

}
