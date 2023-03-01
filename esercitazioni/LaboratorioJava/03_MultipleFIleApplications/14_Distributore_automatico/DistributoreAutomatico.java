import java.util.*;

public class DistributoreAutomatico {

	private Map carte;

	private Map bevande;

	private List colonne;

	public DistributoreAutomatico() {
		this.carte = new HashMap();
		this.bevande = new TreeMap();
		this.colonne = new ArrayList();
	}

	public void aggiungiBevanda(String nome, double prezzo) {
		Bevanda b = new Bevanda(nome, prezzo);
		bevande.put(nome, b);
	}

	public double ottieniPrezzo(String nomeBevanda) {
		Bevanda b = (Bevanda) bevande.get(nomeBevanda);
		if (b == null)
			return -1.0;
		return b.ottieniPrezzo();
	}

	public void ricaricaCarta(int idCarta, double credito) {
		CartaPrepagata cp = (CartaPrepagata) carte.get(new Integer(idCarta));

		if (cp == null)
			carte.put(new Integer(idCarta), new CartaPrepagata(idCarta, credito));
		else
			cp.ricarica(credito);
	}

	public double ottieniCredito(int idCarta) {
		CartaPrepagata c = (CartaPrepagata) carte.get(new Integer(idCarta));

		if (c != null)
			return c.ottieniCredito();

		return -1.0;
	}

	public void ricaricaColonna(int colonna, String nomeBevanda, int lattine) {
		if (colonna < 1 || colonna > 4)
			return; //errore

		colonne.add(colonna - 1, new Colonna(nomeBevanda, lattine));
	}

	public int lattineDisponibili(String nomeBevanda) {

		if (bevande.get(nomeBevanda) == null)
			return -1;

		int conta = 0;
		for (Iterator iter = colonne.iterator(); iter.hasNext();) {
			Colonna c = (Colonna) iter.next();
			if (c != null)
				if (c.ottieniNome().equals(nomeBevanda)) {
					conta += c.ottieniQuantita();
				}
		}
		return conta;
	}

	public int vendi(String nomeBevanda, int idCarta) {

		double prezzo = ottieniPrezzo(nomeBevanda);

		if (prezzo < 0)
			return -1; // errore: la bevanda non esiste

		if (ottieniCredito(idCarta) < prezzo)
			return -1; // errore: credito non sufficiente

		// cerca una colonna contenente la bevanda
		Colonna colonna = null;
		for (Iterator iter = colonne.iterator(); iter.hasNext();) {
			Colonna corrente = (Colonna) iter.next();
			if (corrente != null && corrente.ottieniNome().equals(nomeBevanda)
					&& corrente.ottieniQuantita() > 0) {
				colonna = corrente;
			}
		}

		if (colonna == null)
			return -1; // errore: colonna non presente

		// aggiorna la quantità della colonna
		colonna.decrementaQuantita();

		// aggiorna il credito di una carta prepagata
		CartaPrepagata carta = (CartaPrepagata) carte.get(new Integer(idCarta));
		carta.riduciCredito(prezzo);

		// restituisce il numero della colonna
		return colonne.indexOf(colonna) + 1;
	}
}
