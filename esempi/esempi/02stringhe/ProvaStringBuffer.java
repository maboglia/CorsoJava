package esempi.week3.stringhe;

/*
  Questo programma vuol testare la differenza tra la costruzione di 
  stringhe con la calsse String e con la classe StringBuffer.
  Viene costruita una stringa di un certo numero di caratteri 
  (specificato dalla variabile numCar) aggiungendo via via alla
  stringa il carattere 'a' in coda. La stessa cosa viene fatta
  con un oggetto di StringBuffer. Vengono confrontati i tempi 
  per l'esecuzione delle due operazioni.
*/

public class ProvaStringBuffer {

    public static void main(String[] a) {

	// costruiamo una stringa di numCar caratteri aggiungendo un
	// carattere alla volta:

	int numCar = 25000;
	String stringA = "";
	long t1 = System.currentTimeMillis();
	System.out.println("Costruisco una stringa della classe String:");

	for (int i = 1; i <= numCar; i++) {
	    stringA += 'a';
	    if (i % 500 == 0) {
		System.out.print(".");
	    }
	    if (i > 1 && i % 10000 == 0) {
		System.out.println();
	    }
	}
	System.out.println();

	int tempoTot = (int)(System.currentTimeMillis() - t1);
	System.out.println("Tempo totale con String: " 
			   + tempoTot + " millisecondi");

	// Ora facciamo la stessa cosa, ma con un oggetto della classe
	// StringBuffer

	StringBuffer stringB = new StringBuffer();
	t1 = System.currentTimeMillis();
	System.out.println("Costruisco una stringa della classe StringBuffer:");
	for (int i = 1; i <= numCar; i++) {
	    stringB.append('a');
	    if (i % 500 == 0) {
		System.out.print(".");
	    }
	    if (i > 1 && i % 10000 == 0) {
		System.out.println();
	    }
	}
	System.out.println();

	tempoTot = (int)(System.currentTimeMillis() - t1);
	System.out.println("Tempo totale con StringBuffer: " 
			   + tempoTot + " millisecondi");


    } // fine metodo main()

}
