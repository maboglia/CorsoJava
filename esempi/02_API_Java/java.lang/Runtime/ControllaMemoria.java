public class ControllaMemoria {
	
	public static void main(String[] args){
		Runtime r = Runtime.getRuntime();
		long totale = r.totalMemory();
		long libera = r.freeMemory();
		long occupata = totale - libera;
		System.out.println("Memoria totale: " + totale);
		System.out.println("Memoria libera: " + libera);
		System.out.println("Memoria occupata: " + occupata);				
	}
}