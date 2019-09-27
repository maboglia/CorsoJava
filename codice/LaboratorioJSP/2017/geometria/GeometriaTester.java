package geometria;

import java.util.ArrayList;
import java.util.Random;

public class GeometriaTester {

	//costante che rappresenta 
	final static int NUM_RIPETIZIONI = 500;
	final static int NUM_PUNTI = 10;
	static ArrayList<Punto> punti = new ArrayList<>();
	static Random coordinata = new Random();
	private static int contatoreCentri;
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < NUM_RIPETIZIONI; i++) {
			
			int x = coordinata.nextInt(NUM_PUNTI);
			int y = coordinata.nextInt(NUM_PUNTI);
			//if (x != 0 && y != 0)
			punti.add(new Punto(x, y));
			
		}
		
		for (Punto p : punti) {
			
			System.out.println(p);
			if (haiFattoCentro(p))
				System.out.println("hai fatto centro");
			
		}

		System.out.println("ho creato " + Punto.getContatore()  + " punti");
		System.out.println("L'array contiene " + punti.size()  + " punti");
		System.out.println("Hai totalizzato " + contatoreCentri  + " centri");
		

	}

	public static boolean haiFattoCentro(Punto p){
		//centro è una variabile bool che puo valere true o false
		boolean centro = (p.getX() == 0  && p.getY() == 0);
		//se centro vale true incremento il contatore statico di centri
		if (centro) contatoreCentri++;
		//infine ritorno l variabile centro
		return centro;
		
	}
	
}
