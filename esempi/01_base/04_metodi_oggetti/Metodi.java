package metodi;

public class Metodi {

	public void stampa(){
		System.out.println("Ho richiamato il metodo Stampa");	
	}
	
	public void stampaConParametriIngresso(String valore, String valore1){
		System.out.println("Il mio nome è: " + valore + " e il mio cognome è: " + valore1);
	}
	
	public String stampaParametriInUscita(String valore, String valore1){
		
		String scritta = "il nome è: " + valore + " e il mio cognome è: " + valore1;
		return scritta;
		
	}
	
}
