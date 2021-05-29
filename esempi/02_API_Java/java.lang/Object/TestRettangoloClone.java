public class TestRettangoloClone{
	
	public static void main(String[] args){
		RettangoloClone r1 = new RettangoloClone(10,6);
		RettangoloClone r2 = (RettangoloClone)r1.clone();
		System.out.println("r1 e r2 sono oggetti distinti?");
		if(r1 == r2){
			System.out.println("No");
		}else{
			System.out.println("Si'");
		}
		System.out.println();
		System.out.println("--- Valori di r1 ---");
		System.out.println("Larghezza: " + r1.getLarghezza());
		System.out.println("Altezza:   " + r1.getAltezza());
		System.out.println("--- Valori di r2 ---");
		System.out.println("Larghezza: " + r2.getLarghezza());
		System.out.println("Altezza:   " + r2.getAltezza());
		System.out.println();
		System.out.println("Cambio i valori di r1...");
		System.out.println();
		r1.setLarghezza(15);
		r1.setAltezza(9);
		System.out.println("--- Valori di r1 ---");
		System.out.println("Larghezza: " + r1.getLarghezza());
		System.out.println("Altezza:   " + r1.getAltezza());
		System.out.println("--- Valori di r2 ---");
		System.out.println("Larghezza: " + r2.getLarghezza());
		System.out.println("Altezza:   " + r2.getAltezza());
	}
}
