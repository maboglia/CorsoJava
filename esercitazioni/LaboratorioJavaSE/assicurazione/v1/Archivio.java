package progetti.assicurazione.v1;

import java.util.ArrayList;

public class Archivio {
	private ArrayList<Cliente> clienti;
	private ArrayList<Automobile> automobili;

	public Archivio() {
		clienti = new ArrayList<Cliente>();
		automobili = new ArrayList<Automobile>();
	}

	// restituisce, se esiste, l'indice del cliente nell'arraylist clienti
	private int indiceCliente(String unNome) {
		for (int i = 0; i < clienti.size(); i++)
			if (clienti.get(i).getNome().equalsIgnoreCase(unNome))
				return i;
		return -1;
	}

	// restituisce, se esiste, l'indice della targa nell'arraylist automobili
	private int indiceTarga(int unaTarga) {
		for (int i = 0; i < automobili.size(); i++)
			if (automobili.get(i).getTarga() == unaTarga)
				return i;
		return -1;
	}

	// aggiunge un nuovo cliente all’arraylist clienti
	public void addCliente(String unNome)
	{
		if(indiceCliente(unNome) == -1)
	clienti.add(new Cliente(unNome));
	}
	// aggiunge una nuova auto all’arraylist automobile
	public void addAutomobile(int unaTarga, String unNome) {
		if (indiceTarga(unaTarga) != -1)
			return;
		addCliente(unNome);
		int index = indiceCliente(unNome);
		automobili.add(new Automobile(unaTarga, clienti.get(index)));
	}

	/*
	 * restituisce le targhe delle automobili aventi unNome come proprietario
	 */
	public ArrayList<Integer> returnTarga(String unNome) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < automobili.size(); i++)
			if (automobili.get(i).getProprietario().getNome().equalsIgnoreCase(unNome))

				temp.add(automobili.get(i).getTarga());
		return temp;
	}

	// restituisce il nome del proprietario di una targa
	public String clienteTarga(int unaTarga) {
		for (Automobile auto : automobili)
			if ((auto.getTarga()) == unaTarga)
				return auto.getProprietario().getNome();
		return null;
	}

	/*
	 * data una targa di un automobile, se presente, la rimuove dall’arraylist
	 */
	public void removeAutomobile(int unaTarga) {
		if (indiceTarga(unaTarga) != -1)
			automobili.remove(indiceTarga(unaTarga));
	}

	/*
	 * toglie unNome dall'arraylist clienti e le sue eventuali auto da
	 * automobili
	 */
	public void removeCliente (String unNome)
	{
		if(indiceCliente(unNome) == -1)
			return;
		boolean hoFinito = false;
		while(!hoFinito)
		{
			hoFinito = true;
			for(int i = 0; i < automobili.size(); i++)
				if(automobili.get(i).getProprietario().getNome().
		equalsIgnoreCase(unNome))
				{
					automobili.remove(i);
					hoFinito = false;
				}
		}
			clienti.remove(indiceCliente(unNome));
	}

	// conta quante automobili ha un cliente
	public int contaAuto(String unNome) {
		int temp = 0;
		for (Automobile auto : automobili)
			if (auto.getProprietario().getNome().equalsIgnoreCase(unNome))
				temp++;
		return temp;
	}

	// ritorna un array con il numero di auto possedute da ogni cliente
	private int[] listaAutoClienti() {
		int[] temp = new int[clienti.size()];
		int i = 0;
		for (Cliente c : clienti) {
			temp[i] = contaAuto(c.getNome());
			i++;
		}
		return temp;

	}

	// ritorna il cliente con il maggior numero di auto
	public Cliente maxAuto() {
		int indexMax = 0;
		int max = 0;
		int[] temp = listaAutoClienti();
		for (int i = 0; i < clienti.size(); i++)
			if (temp[i] > max) {
				indexMax = i;
				max = temp[i];
			}
		return clienti.get(indexMax);
	}
}
