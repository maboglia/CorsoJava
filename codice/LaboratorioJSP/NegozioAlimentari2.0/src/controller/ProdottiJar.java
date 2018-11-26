package controller;

import java.util.ArrayList;
import java.util.List;

import model.Prodotto;

public class ProdottiJar {

	//TODO: sostituire con collegamento a database
	public static List<Prodotto> elencoProdotti = new ArrayList<>();
	
	static {
		elencoProdotti.add(new Prodotto("C00001", "Pasta Barilla", 0.75));
		elencoProdotti.add(new Prodotto("C00002", "Pasta Agnesi", 0.85));
		elencoProdotti.add(new Prodotto("C00003", "Birra Moretti", 1.05));
		elencoProdotti.add(new Prodotto("C00004", "Dentifricio Colgate", 1.5));
		elencoProdotti.add(new Prodotto("C00005", "Friskies Crocche", 1.25));
		
	
	}
	
	
}
