public class ApplicazioneNegozio {

	public static void main(String[] args) {
		
		CassaNegozio cassa = new CassaNegozio();
		
		cassa.aggiungiProdotto("C00001", "Pasta Bargilla", 0.7);
		cassa.aggiungiProdotto("C00002", "Latte Arburea", 1.2);
		cassa.aggiungiProdotto("C00003", "Caffe' Willy", 2.5);
		cassa.aggiungiProdotto("C00004", "Caffe' Sulerte", 2.0);
		cassa.aggiungiProdotto("C00005", "Lamette Dic", 4.0);
		cassa.aggiungiProdotto("C00006", "Acqua Chiara", 0.4);
		
		// Sconto del 20% per il latte
		cassa.promozione("C00002", 20);
		
		try{			
			cassa.leggi("C00002",6);
			cassa.leggi("C00001",5);
			cassa.leggi("C00004",5);
			cassa.leggi("C00003",2);
			cassa.leggi("C00006",9);
			cassa.leggi("C00005",1);		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Elenco articoli:");
		cassa.stampa();
		
		System.out.println("Imponibile: " + cassa.netto() );
		System.out.println("IVA: " + cassa.tasse() );
		System.out.println("Importo totale: " + cassa.totale() );
		
		cassa.chiude();		
	}
}
