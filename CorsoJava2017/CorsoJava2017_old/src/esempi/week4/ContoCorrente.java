package esempi.week4;

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

	private double saldo,  tasso;
	
	public ContoCorrente() {
		this.saldo = 0.0;
		this.tasso = 0.0;
	}

	public ContoCorrente(double saldo) {
		this.saldo += saldo;
		this.tasso = 0.0;
	}

	
	public double getSaldo() {
		return saldo + (saldo * tasso);
	}

	private void setSaldo(double ammontare) {
		this.saldo += ammontare;
	}

	public double getTasso() {
		return tasso;
	}

	public void setTasso(double tasso) {
		this.tasso = tasso;
	}
	
	public void versamento (double ammontare){
		this.setSaldo(ammontare);
	}
	
	public void prelievo (double ammontare){
		this.setSaldo( - ammontare);
	}
	
	
	
	

	
}
