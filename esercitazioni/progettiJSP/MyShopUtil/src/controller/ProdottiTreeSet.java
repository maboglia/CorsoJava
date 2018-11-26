package controller;

import java.util.TreeSet;

import model.Abito;
import model.Camicia;
import model.Colori;
import model.Giacca;
import model.Maglione;
import model.Pantalone;
import model.Scarpe;
import model.Taglie;

public class ProdottiTreeSet {

	
	private static TreeSet<Abito> mostraProdotti;
	
	private static StringBuilder s = null;
	
	
	
	static {
		
		mostraProdotti = new TreeSet<>();
		
		Pantalone p = new Pantalone(Taglie.M, Colori.BLUE, 39.99);
		
		mostraProdotti.add(new Giacca(Taglie.M, Colori.BLUE, 59.99));
		mostraProdotti.add(p);
		mostraProdotti.add(p);
		mostraProdotti.add(new Camicia(Taglie.M, Colori.RED, 29.99));
		mostraProdotti.add(new Maglione(Taglie.M, Colori.GREEN, 49.99));
		mostraProdotti.add(new Scarpe(Taglie.M, Colori.RED, 69.99));
		
	}

	/**
	 * @return the mostraProdotti
	 */
	public static TreeSet<Abito> getMostraProdotti() {
		return mostraProdotti;
	}
	
	
	/**
	 * @return the mostraProdotti
	 */
	/**
	 * @return
	 */
	public static String getMostraProdottiProvv() {
		s = new StringBuilder();
			for(Abito a : mostraProdotti){
				//System.out.println(a);
				System.out.println("è una giacca: "+(a instanceof Giacca));
				if (a instanceof Giacca) System.out.println(a.descriviProdotto());
				s.append(a.descriviProdotto()); 
				
				
			}
		return s.toString();
		
	}
	
	public static void main(String[] args) {
		//System.out.println(mostraProdotti);
		System.out.println(getMostraProdottiProvv());
	}
	
	
	
	
}
