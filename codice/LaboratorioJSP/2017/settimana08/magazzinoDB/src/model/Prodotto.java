package model;

public class Prodotto {

	private int codiceProdotto;
	private String descrizioneProdotto;
	private double prezzoProdotto;

	
	public Prodotto(int codiceProdotto, String descrizioneProdotto, double prezzoProdotto) {
		this.codiceProdotto = codiceProdotto;
		this.descrizioneProdotto = descrizioneProdotto;
		this.prezzoProdotto = prezzoProdotto;
	}
	/**
	 * @return the codiceProdotto
	 */
	public int getCodiceProdotto() {
		return codiceProdotto;
	}
	/**
	 * @param codiceProdotto the codiceProdotto to set
	 */
	public void setCodiceProdotto(int codiceProdotto) {
		this.codiceProdotto = codiceProdotto;
	}
	/**
	 * @return the descrizioneProdotto
	 */
	public String getDescrizioneProdotto() {
		return descrizioneProdotto;
	}
	/**
	 * @param descrizioneProdotto the descrizioneProdotto to set
	 */
	public void setDescrizioneProdotto(String descrizioneProdotto) {
		this.descrizioneProdotto = descrizioneProdotto;
	}
	/**
	 * @return the prezzoProdotto
	 */
	public double getPrezzoProdotto() {
		return prezzoProdotto;
	}
	/**
	 * @param prezzoProdotto the prezzoProdotto to set
	 */
	public void setPrezzoProdotto(double prezzoProdotto) {
		this.prezzoProdotto = prezzoProdotto;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.codiceProdotto+" - "+this.descrizioneProdotto+" - "+this.prezzoProdotto;
	}	
	
	
}
