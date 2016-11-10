package esempi.week4;

import myutil.MioScanner;

public class EsempiSwitch {

	public static void main(String[] args) {
		
		MioScanner msc = new MioScanner();
		String s = msc.leggiStringaNonVuota("inserisci mese abbreviato, 3 lettere");
		s = s.toLowerCase();
		
		switch(s){
		case "gen": case "dic":
			System.out.println("fa freddo");
			break;
		
		case "ago":
			System.out.println("fa caldo");
			break;
			
		case "mar":
			System.out.println("piove!");
			break;
		default:
			System.out.println("non ho niente da dirti su questo mese");
			break;
		
		}
        
        
		
		
		

	}

}
