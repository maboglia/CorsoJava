package esempio;
public class TestPrestazioni{
	
	public static void main(String[] args){
		// Registro il tempo di partenza
		long t1 = System.currentTimeMillis();
		// Eseguo l'operazione da cronometrare
		int a = 5;
		int b = 10;
		for(int i=0; i<1000000; i++){
			int aux = a;
			a = b;
			b = aux;
		}
		// Registro il tempo di arrivo
		long t2 = System.currentTimeMillis();
		// Calcolo il tempo impiegato
		long dt = t2 - t1;
		// Mostro il risultato
		System.out.println("Ho scambiato per un milione di volte il " +
							"contenuto di due variabili.");
		System.out.println("Ho completato l'operazione in " + dt +
							" millisecondi.");
	}
}