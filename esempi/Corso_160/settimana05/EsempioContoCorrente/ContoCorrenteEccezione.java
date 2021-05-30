package settimana05;


public class ContoCorrenteEccezione {
	//per rispettare l'incapsulamento dichiaro privati i seguenti dati
	private String titolare;
	private int numeroConto;
	private double saldo;
	private double tasso;
	
	//contatore statico per numerare i c/c
	private static int numeratoreConti=0;
	
	public ContoCorrenteEccezione(String titolare) {

		this.titolare = titolare;
		this.numeroConto = numeraConto();
		this.saldo = 0.0;
		this.tasso = 0.03;
	}

	public ContoCorrenteEccezione(String titolare, double saldo) {
		
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
	
	public void prelievo(double ammontare) throws Exception {
		//inserire controllo per verificare se c'è disponibilità sul conto 
		if (this.saldo - ammontare < 0){
			throw new Exception("Non c'è disponibilità sufficiente sul conto " + this.numeroConto);
		}
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
