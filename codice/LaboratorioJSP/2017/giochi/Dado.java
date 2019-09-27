package giochi;

import java.util.ArrayList;

public class Dado {

	int numeroFacce= 6;
	static ArrayList<String> giocate = new ArrayList<>();
	static ArrayList<String> vittorie = new ArrayList<>();

	public static ArrayList<String> getGiocate() {
		return giocate;
	}
	public static ArrayList<String> getVittorie() {
		return vittorie;
	}
	
	
	public static void giocaDadi() {
		
		int contatore=0;
		Dado d1 = new Dado();
		Dado d2 = new Dado();
		
		for (int i = 0; i < 1000; i++) {
			
		
		int ris1 = d1.lanciaDado();
		int ris2 = d2.lanciaDado();

		System.out.println("dado 1 vale " + ris1);
		System.out.println("dado 2 vale " + ris2);

		giocate.add( ("dado 1 vale " + ris1)  + (" - dado 2 vale " + ris2)    );
		
		if(ris1 == ris2){
		System.out.println("HAI VINTO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		vittorie.add( "Il lancio n. " + (i + 1) + " è risultato vincente "  + ris1  );
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
