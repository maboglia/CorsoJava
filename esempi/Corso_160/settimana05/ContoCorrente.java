package settimana05;
/*
 * Testo:
Es. 3.1: 
scrivere un programma che costruisca un conto bancario 
	chiamato mioConto, 
	versi in esso $1000, 
	prelevi da esso $500, 
	prelevi altri $400 e 
	infine visualizzi il saldo rimanente.

	Il programma deve poi creare un altro conto bancario 
	chiamato contoMamma, 
	utilizzando il costruttore che inizializza la variabile bilance.
	Su quest’ultimo conto deve essere poi applicato un interesse del 10%, 
	a seguito del quale viene stampato il saldo.

 * 
 * 
 * 
 * */

public class ContoCorrente {
	//per rispettare l'incapsulamento dichiaro privati i seguenti dati
	private String titolare;
	private int numeroConto;
	private double saldo;
	private double tasso;
	
	//contatore statico per numerare i c/c
	private static int numeratoreConti=0;
	
	public ContoCorrente(String titolare) {

		this.titolare = titolare;
		this.numeroConto = numeraConto();
		this.saldo = 0.0;
		this.tasso = 0.03;
	}

	public ContoCorrente(String titolare, double saldo) {
		
		this.titolare = titolare;
		this.numeroConto = numeraConto();
		this.saldo = saldo;
		this.tasso = 0.03;
	}
	
	/**
	 * @return the titolare
	 */
	public String getTitolare() {
		return titolare;
	}

	/**
	 * @return the numeroConto
	 */
	public int getNumeroConto() {
		return numeroConto;
	}

	/**
	 * @return the tasso
	 */
	public double getTasso() {
		return tasso;
	}

	/**
	 * @return the numeratoreConti
	 */
	public static int getNumeratoreConti() {
		return numeratoreConti;
	}

	/**
	 * @param saldo the saldo to set
	 */
	private void setSaldo(double ammontare) {
		this.saldo += ammontare;
	}

	/**
	 * @return 
	 */
	private int numeraConto() {
		
		return numeratoreConti++;
	}
	
	public void versamento(double ammontare){
		this.setSaldo(ammontare);
	}
	
	public void prelievo(double ammontare){
		//inserire controllo per verificare se c'è disponibilità sul conto 
		if (this.saldo >= ammontare)
			this.setSaldo( - ammontare);
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		
		return this.saldo + (this.saldo * this.tasso)  ;
	}

	public void setTasso(double nuovoTasso) {
		this.tasso = nuovoTasso;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("#####################\n");
		sb.append("estratto conto di \n");
		sb.append(this.titolare+"\n");
		sb.append(this.numeroConto+"\n");
		sb.append(this.saldo+"\n");
		sb.append("#####################"+"\n");
		
		return sb.toString();
	}

}
