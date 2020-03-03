package main;

import metodi.Metodi;

public class ProvaMetodi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Metodi m = new Metodi();
		m.stampa();
		m.stampaConParametriIngresso("mauro", "bogliaccino");
		String scritta = m.stampaParametriInUscita("mauro", "bogliaccino");
		System.out.println(scritta);
	}

}
