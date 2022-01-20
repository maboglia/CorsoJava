package esempio;

public class Divisione {
	// questo metodo pu� lanciare un'eccezione (throws Exception)
	public double div(double numeratore, double denominatore) throws Exception {
		// controllo che il denominatore non sia ammissibile
		if (denominatore == 0) {
			// lancio eccezione e termino l'esecuzione
			throw new Exception("Divisione per zero");
		}
		return numeratore / denominatore;
	}
	
	public static void main(String[] args) {
		Divisione d = new Divisione();
		try {
			double v1 = d.div(100, 0); // qui avr� l'eccezione
			System.out.println("V1 = " + v1);
			double v2 = d.div(100, 10); 
			System.out.println("V2 = " + v2);
		} catch (Exception ex) {
			// stampo lo stack di chiamate
			ex.printStackTrace();
		}
	}
}
