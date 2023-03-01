public class ClasseTest {
	
	public static void main(String[] args) {
		
		DistributoreAutomatico da = new DistributoreAutomatico();
		
		da.aggiungiBevanda("Gulkcola", 1.2);
		da.aggiungiBevanda("Splite", 0.70);
		da.aggiungiBevanda("Birronza", 1.30);
		
		da.ricaricaColonna(1, "Gulkcola", 20);
		da.ricaricaColonna(2, "Birronza", 15);
		da.ricaricaColonna(3, "Gulkcola", 20);
		da.ricaricaColonna(4, "Splite", 10);
		
		System.out.println(da.lattineDisponibili("Gulkcola"));
		
		System.out.println(da.ottieniPrezzo("Gulkcola"));
		
		da.ricaricaCarta(76, 15.0);
		da.ricaricaCarta(12, 13.0);
		da.ricaricaCarta(23, 9.0);
		
		da.vendi("Gulkcola", 76);
		da.vendi("Gulkcola", 12);
		da.vendi("Splite", 76);
		
		System.out.println(da.lattineDisponibili("Gulkcola"));
		
		System.out.println(da.ottieniCredito(76));
		
	}
}
