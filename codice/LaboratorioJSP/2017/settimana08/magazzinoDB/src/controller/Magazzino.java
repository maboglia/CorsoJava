package controller;

import java.util.ArrayList;

import model.Prodotto;

public class Magazzino {

	private String dataOperazione;
	private Prodotto prodotto;
	private int quantita;
	
	public static ArrayList<Magazzino> reportMagazzino = new ArrayList<>();
	public static ArrayList<Magazzino> reportVendite = new ArrayList<>();
	public static ArrayList<Magazzino> reportAcquisti = new ArrayList<>();
	
	/*costruttori*/
	public Magazzino(){}
	
	public Magazzino(String dataOperazione, Prodotto prodotto, int quantita) {
	
		this.dataOperazione = dataOperazione;
		this.prodotto = prodotto;
		this.quantita = quantita;
	}

	/*getter*/
	public int getQuantita() {
		return quantita;
	}
	public String getDataOperazione() {
		return dataOperazione;
	}
	public Prodotto getProdotto() {
		return prodotto;
	}
	
	
	
public static void caricoMagazzino(String dataOp, Prodotto p, int quanti){
	
	reportMagazzino.add(new Magazzino(dataOp, p, quanti ));
	reportAcquisti.add(new Magazzino(dataOp, p, quanti ));
}

public static void scaricoMagazzino(String dataOp, Prodotto p, int quanti){
	
	reportMagazzino.add(new Magazzino(dataOp, p, quanti ));
	reportVendite.add(new Magazzino(dataOp, p, quanti ));
}
	
public static void main(String[] args) {
	
	Magazzino.caricoMagazzino("20170713", new Prodotto(1, "maglia", 10.00), 50);
	Magazzino.caricoMagazzino("20170713", new Prodotto(2, "giacca", 20.00), 50);
	Magazzino.caricoMagazzino("20170713", new Prodotto(3, "camicia", 30.00), 50);
	Magazzino.scaricoMagazzino("20170713", new Prodotto(3, "camicia", 30.00), -10);
	
	
	for (Magazzino mag : Magazzino.reportMagazzino) {
		System.out.println(
				mag.dataOperazione 
				+ mag.prodotto.getDescrizioneProdotto() 
				+ mag.quantita );
	}
	
}



}
