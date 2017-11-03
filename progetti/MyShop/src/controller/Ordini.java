package controller;

import java.util.ArrayList;

import model.*;

public class Ordini {

	private ArrayList<Ordine> ordini;
	
	{
		ordini = new ArrayList<>();
		Pantalone p = new Pantalone(Taglie.M, Colori.BLUE, 39.99);
		ordini.add(new Ordine(p, 2));
		
		
	}
	
	
	
	public Ordini() {
		System.out.println("ordine creato");
		
	}

	
	public void inserisciProdotto(Abito a, int i){
		
		this.ordini.add(new Ordine(a,i));
		System.out.println("prodotto inserito");
	}

	
	public ArrayList<String> getOrdini(){
		
		ArrayList<String> scontrino = new ArrayList<>();
		for (Ordine o : ordini){
		scontrino.add(o.tipoAbito.descriviProdotto() + "......." + o.quantita);
		}
		return scontrino;
	}
	
	public String stampaOrdine(){
		
/*		class MessaggioAugurale{
			public void messaggio(String s){
				System.out.println("Grazie, arrivederci! " + s );
			}
		}
*/		
		String s=null;
		
		for (Ordine ordine : ordini) {
			s += ordine.tipoAbito + " " + ordine.quantita ;
		}
		System.out.println(s);
//		MessaggioAugurale messaggio = new MessaggioAugurale();
//		messaggio.messaggio();
//		new MessaggioAugurale().messaggio("punto vendita le gru");
		
		new Object(){
			public void messaggio(String s){
				System.out.println("Grazie, arrivederci! " + s );
			}			
		}.messaggio("punto vendita auchan");
		
		return s;
	}

	public double totaleOrdine(){
		double totale = 0;
		for (Ordine ordine : ordini) {
			totale += (ordine.quantita *   ordine.tipoAbito.getPrezzo() ) ;
		}
		
		return totale;
		
	}
	
	
	private class Ordine{
		
		private Abito tipoAbito;
		private int quantita;

		public Ordine(Abito tipoAbito, int quantita) {
			this.tipoAbito = tipoAbito;
			this.quantita = quantita;
		}
		
		
	}
	
	public static void main(String[] args) {
		Ordini mioOrdine = new Ordini();
		mioOrdine.stampaOrdine();
		mioOrdine.inserisciProdotto(new Giacca(Taglie.S, Colori.GREEN, 10.00), 10);
		mioOrdine.stampaOrdine();
		
		Ordini mioOrdine2 = new Ordini();
		mioOrdine2.stampaOrdine();
		mioOrdine2.inserisciProdotto(new Pantalone(Taglie.S, Colori.GREEN, 20.00), 10);
		mioOrdine2.inserisciProdotto(new Maglione(Taglie.S, Colori.GREEN, 40.00), 10);
		mioOrdine2.stampaOrdine();
		
		
	}	
	
	
	
}
