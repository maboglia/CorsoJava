/*
 * Scrivere un programma 
 * SoloVocali che chiede all’utente di inserire una stringa e ne
stampa le sole vocali. 
Per esempio, se si immette la stringa "Viva Java", il programma stampa "iaaa"..*/

package esempi.week4;

import myutil.MioScanner;

public class SoloVocali {

	public static void main(String[] args) {
		MioScanner msc = new MioScanner();
		String s = msc.leggiStringaNonVuota("inserisci una stringa");


		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.print(c); break;
			}
		}
	}

}
