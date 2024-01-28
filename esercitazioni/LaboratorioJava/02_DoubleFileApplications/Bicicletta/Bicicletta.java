package settimana01;

public class Bicicletta {

	//stato interno: attributi e proprietà costanti
	//dichiarazione degli 'ingredienti' della mia ricetta
	byte numeroRuote = 2;
	byte marcia = 1;
	int frequenza = 0; 
	double velocita = 0;
	
	String marca = "Bianchi", modello="m-bike";
	String tipoBici = new String("mountain bike");
	
	
	public void accelera(int incFrequenza){
		frequenza = frequenza + incFrequenza;
		System.out.println("hai accelerato");
	}
	public void rallenta(int incFrequenza){
		frequenza = frequenza - incFrequenza;
		System.out.println("hai rallentato");
	}
	
	public void calcolaVelocita(){
		velocita = frequenza * marcia;
		System.out.println("la tua velocità adesso è: " + velocita);
	}
	

}
