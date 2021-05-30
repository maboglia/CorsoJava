package esercizi1;

public class Car {

	
	/*
	 * Progettare e realizzare una classe Car(automobile) con le proprietà seguenti. 
	 * Un’automobile ha una determinata resa del carburante 
	 * (misurata in miglia/galloni o in litri/chilometri: scegliete il sistema che preferite) 
	 * e una certa quantità di carburante nel serbatoio. 
	 * La resa è specificata dal costruttore e il livello iniziale del carburante è a zero. 
	 * Fornire questi metodi: un metodo drive per simulare il percorso 
	 * di un’automobile per una certa distanza, riducendo il livello di carburante nel serbatoio; 
	 * un metodo getGas, per ispezionare il livello corrente del carburante; 
	 * un metodo addGas per far rifornimento.
		Consigli:
		S’invita a porre particolare attenzione al metodo drive(double km), 
		che calcola il livello di carburante dopo un certo percorso.
	 * */
	
	// quantità di carburante nel serbatoio
	private double gas;
	// prestazioni della vettura
	private double kmL;
	// si costruisce un'automobile con carburante uguale a zero
	public Car(double resa)
	{
	kmL = resa;
	gas = 0; }
	/* Calcola il livello di carburante rimasto dopo un certo percorso
	@param km i chilometri percorsi*/
	public void drive(double km)
	{
	      gas = gas - (km / kmL);
	}
	/* ispeziona il livello di carburante rimasto
	@return il carburante rimasta*/
	public double getGas()
	{
	return gas; }
	/* aggiunge carburante nel serbatoio
	@param rifornimento il carburante da aggiungere*/
	public void addGas(double rifornimento)
	{
	      gas = gas + rifornimento;
	}
	
}
