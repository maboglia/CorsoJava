package controller;

import java.util.ArrayList;

import model.*;

public class Prodotti {

	
	private static ArrayList<Abito> mostraProdotti;
	
	private static StringBuilder s = null;
	
	
	
	static {
		
		mostraProdotti = new ArrayList<>();
		
		mostraProdotti.add(new Giacca(Taglie.XL));
		mostraProdotti.add(new Giacca());
		mostraProdotti.add(new Pantalone());
		mostraProdotti.add(new Camicia());
		mostraProdotti.add(new Maglione());
		
	}

	/**
	 * @return the mostraProdotti
	 */
	public static ArrayList<Abito> getMostraProdotti() {
		return mostraProdotti;
	}
	
	
	/**
	 * @return the mostraProdotti
	 */
	public static String getMostraProdottiProvv() {
		s = new StringBuilder();
			for(Abito a : mostraProdotti){
				System.out.println(a);
				System.out.println("è un pantalone: "+(a instanceof Giacca));
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
