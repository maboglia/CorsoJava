package negozio1;

public class Negozio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CassaNegozio cassa1 = new CassaNegozio();
		
		cassa1.aggiungiProdotto("C00001",	"Pasta Barilla",	0.5);
		cassa1.aggiungiProdotto("C00002",	"Latte Abit	",1.5);
		cassa1.aggiungiProdotto("C00003",	"Caffe Illy",	2.5);
		cassa1.aggiungiProdotto("C00004",	"Birra Peroni",	2.0);
		cassa1.aggiungiProdotto("C00005",	"Acqua Azzura",	2.0);
		cassa1.aggiungiProdotto("C00006",	"Acqua Chiara",	0.5);
		
		cassa1.promozione("C00006", 20);
		try {
			cassa1.leggi("C00003", 2);
		} catch (ProdottoInesistente e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			cassa1.leggi("C00006", 244);
			cassa1.leggi("C00002", 244);
			
		} catch (ProdottoInesistente e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("hai inserito una referenza non corretta, ti preghiamo di correggere il dato");
		} finally {
			System.out.println("questa clausola viene eseguita in ogni caso!!!!");
		}

		
		
		System.out.println("stampa elenco");
		cassa1.stampa();
	
		System.out.println("Imponibile:  " + cassa1.netto() );
		System.out.println("IVA:  " + cassa1.tasse() );
		System.out.println("Importo totale:  " + cassa1.totale() );
		
		
	}

}
