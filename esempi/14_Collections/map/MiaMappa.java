package collezioni;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.JOptionPane;

import model.*;

public class MiaMappa {

	public static void main(String[] args) {

		//1) creo una mappa di stringhe
		HashMap<String, Citta> capoluoghi = new HashMap<>();
		//2) aggiungo elementi alla mappa
		capoluoghi.put("Piemonte", new Citta("Torino", 1, "Piemonte"));
		capoluoghi.put("Lombardia", new Citta("Milano",2,"Lombardia"));
		capoluoghi.put("Lazio", new Citta("Roma",3,"Lazio"));
		capoluoghi.put("Campania", new Citta("Napoli", 1,"Campania"));
		capoluoghi.put("Puglia", new Citta("Bari",0,"Puglia"));
		
		System.out.println(capoluoghi);
		//Collections.sort(capoluoghi);
		System.out.println(capoluoghi);
		
		//3) mi faccio ritornare un set di chiavi della mappa
		Set<String> chiavi = capoluoghi.keySet();
		System.out.println(chiavi);
//		//4) creo un oggetto iteratore
//		Iterator<String> iteratore = chiavi.iterator();
//		//5) attraverso l'iteratore scorro la mappa
//		while(iteratore.hasNext()){
//			String chiave = iteratore.next();
//			System.out.println("Il capoluogo di " + chiave + " è: " + capoluoghi.get(chiave));
//		}
		//5bis) altro modo per scorrere la collezione
		for (String stringa : chiavi) {
			if (stringa.equals("Campania")) break;
			System.out.println("Il capoluogo di " + stringa + " è: " + capoluoghi.get(stringa));			
			//JOptionPane.showMessageDialog(null, "Il capoluogo di " + stringa + " è: " + capoluoghi.get(stringa));
		}

		
		
		
		String s = JOptionPane.showInputDialog("che citta vuoi stampare?");
		System.out.println(capoluoghi.get(s));
		

		
	}

}
