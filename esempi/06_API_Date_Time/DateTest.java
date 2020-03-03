import java.util.*;

public class DateTest {
	
	public static void main(String[] args){
		
		// Creo un oggetto Date con data ed ora correnti
		Date d = new Date();
		// Chiedo la rappresentazione in stringa
		System.out.println(d.toString());
		// Recupero il valore long associato
		long l = d.getTime();
		// Calcolo il numero di millisecondi in un giorno
		int giorno = 1000 * 60 * 60 * 24;
		// Tolgo una settimana al valore l
		l -=(giorno *7);
		// Reimposto la data con il nuovo valore
		d.setTime(l);
		// Chiedo nuovamente la rappresentazione in stringa
		System.out.println(d.toString());
	}
}