package box;

public class Box {
	
	int altezza;
	int lunghezza;
	
	public Box() {
		// TODO Auto-generated constructor stub
		altezza = 10;
		lunghezza = 10;
	}
	
	public Box(int altezza, int lunghezza){
		
		this.altezza = altezza;
		this.lunghezza = lunghezza;
		
	}
	
	public void stampa(){
		System.out.println("l'altezza è: " + altezza + " e la lunghezza è: " + lunghezza);
	}
	
	public void stampa(int valore){
		System.out.println("il valore è: " + valore);
	}
	
}
