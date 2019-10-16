package settimana02;

public class Dado {

	int numeroFacce= 6;
	
	
	
	public static void main(String[] args) {
		
		int contatore=0;
		Dado d1 = new Dado();
		Dado d2 = new Dado();
		
		for (int i = 0; i < 1000; i++) {
			
		
		int ris1 = d1.lanciaDado();
		int ris2 = d2.lanciaDado();

		System.out.println("dado 1 vale " + ris1);
		System.out.println("dado 2 vale " + ris2);

		if(ris1 == ris2){
		System.out.println("HAI VINTO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		contatore++;
		}
		System.out.println(contatore);
		}
		
	}



	private int lanciaDado() {
		// TODO Auto-generated method stub
		
		int temp =  (int) (Math.random() * numeroFacce ) + 1;
		
		return temp;
	}

}
