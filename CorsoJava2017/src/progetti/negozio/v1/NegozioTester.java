package progetti.negozio.v1;

public class NegozioTester {

	public static void main(String[] args) {
		Negozio negozio = new Negozio("Gelataio", "Jhonny");
		negozio.setIndirizzo("Via Roma, 155");
		negozio.setTelefono("0425-12345");
		negozio.setSitoWeb("www.google.it");
		
		Scanner sc = new Scanner(System.in);
		boolean devoUscire = false;
		
		while(!devoUscire) {
			System.out.println("Inserisci un comando:");
			String c = sc.next();
			if (c.equals("q")) {
				devoUscire = true;
			} else if (c.equals("elenca")) {
				negozio.elencaProdotti();
			} else if (c.equals("negozio")) {
				System.out.println("Nome: " + negozio.getNome());
				System.out.println("Nome negozio:" + negozio.getNomenegozio());
				System.out.println("Indirizzo: " + negozio.getIndirizzo());
				System.out.println("Telefono: " + negozio.getTelefono());
				System.out.println("Sito web: " + negozio.getSitoWeb());
				System.out.println("Incasso: € " + negozio.getIncasso());
			} else if (c.equals("acquista")) {
				negozio.elencaProdotti();
				System.out.println("Inserisci il numero del prodotto:");
				int pos = sc.nextInt();
				Prodotto pr = negozio.vendiProdotto(pos);
				System.out.println("Hai acquistato " + pr.getNome() +
									" per € " + pr.getPrezzo());
			} else if (c.equals("aggiungi")) {
				System.out.println("Inserisci nome:");
				String n = sc.next();
				System.out.println("Inserisci prezzo:");
				double p = sc.nextDouble();
				Prodotto prodotto = new Prodotto(n, p);
				negozio.nuovoProdotto(prodotto);
			}
		}
		
		sc.close();
		

	}

}
