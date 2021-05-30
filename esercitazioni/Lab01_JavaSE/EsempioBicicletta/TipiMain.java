package settimana01;

public class TipiMain {

	public static void main(String[] args) {
		
		
		Bicicletta miaBici = new Bicicletta();
		Bicicletta tuaBici = new Bicicletta();
		Bicicletta suaBici = tuaBici;
		
		
		System.out.println(miaBici);
		System.out.println(tuaBici);
		System.out.println(suaBici);
		
		miaBici.marcia = 3;
		miaBici.accelera(25);
		miaBici.calcolaVelocita();

		
		tuaBici.marcia = 2;
		tuaBici.accelera(15);
		tuaBici.calcolaVelocita();		
		
		suaBici.calcolaVelocita();
	}



}
