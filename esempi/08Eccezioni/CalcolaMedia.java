
public class CalcolaMedia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vettore = {29,28,28,26,30,22,18,23,24,28,18,19, 30};
		
		
		try {
			System.out.println(mediaVoti(vettore, 13)/3*11);
		} catch (ArithmeticException exc) {
			// TODO Auto-generated catch block
			//exc.printStackTrace();
			System.out.println("Non sono in grado di calcolare la media, non risultano esami in archivio. Prova a rieseguire il programma!");
		}
		catch (ArrayIndexOutOfBoundsException out_exc) {
			// TODO: handle exception
			System.out.println("Attenzione hai dichiarato 13 esami, ma ne risultano solo 12.");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

	static int mediaVoti(int[] v, int numEsami){		
		int somma = 0;
		for (int i=0; i < numEsami; i++){
			somma+=v[i];
		}
		
		if (numEsami != 0)
		return somma / numEsami ;		
		else
			throw new ArithmeticException();
	}
	
}
