package progetti.negozio.v1;

import java.util.ArrayList;

public class Negozio {

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nomeNegoziante
	 */
	public String getNomeNegoziante() {
		return nomeNegoziante;
	}

	/**
	 * @param nomeNegoziante the nomeNegoziante to set
	 */
	public void setNomeNegoziante(String nomeNegoziante) {
		this.nomeNegoziante = nomeNegoziante;
	}

	/**
	 * @return the indirizzo
	 */
	public String getIndirizzo() {
		return indirizzo;
	}

	/**
	 * @param indirizzo the indirizzo to set
	 */
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the sitoWeb
	 */
	public String getSitoWeb() {
		return sitoWeb;
	}

	/**
	 * @param sitoWeb the sitoWeb to set
	 */
	public void setSitoWeb(String sitoWeb) {
		this.sitoWeb = sitoWeb;
	}

	/**
	 * @return the incasso
	 */
	public double getIncasso() {
		return incasso;
	}

	/**
	 * @param incasso the incasso to set
	 */
	public void setIncasso(double incasso) {
		this.incasso = incasso;
	}

	/**
	 * @return the prodotti
	 */
	public ArrayList<Prodotto> getProdotti() {
		return prodotti;
	}

	/**
	 * @param prodotti the prodotti to set
	 */
	public void setProdotti(ArrayList<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}

	private String nome;
	private String nomeNegoziante;
	private String indirizzo;
	private String telefono;
	private String sitoWeb;
	private double incasso;	
	private ArrayList<Prodotto> prodotti;
	
	public Negozio(String nome, String negoziante) {
		setNome( nome);
		setNomeNegoziante(negoziante);
		
	}

	private void creaProdotti(){
		prodotti = new ArrayList<>();
		prodotti.add( new Prodotto("Panna", 0.50) );
		prodotti.add( new Prodotto("Cioccolato", 1.00) );
		prodotti.add( new Prodotto("Pistacchio", 0.80) );
		prodotti.add( new Prodotto("Crema della nonna", 0.90) );
		prodotti.add( new Prodotto("Gianduja", 1.10) );
	}
	
	public void elencaProdotti() {
		// TODO Auto-generated method stub
		
	}

	public Prodotto vendiProdotto(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	public void nuovoProdotto(Prodotto prodotto) {
		// TODO Auto-generated method stub
		
	}

}
