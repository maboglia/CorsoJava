package conto;

import java.util.Date;

public class ContoCorrente {
	static int contatore;
	int numConto;
	private double saldo = 0;
	Date dataApertura;
	String titolare=null;
	
	public ContoCorrente(){
		System.out.println("hai costruito un conto vuoto");
		numConto=numeraConto();
	}
	public ContoCorrente(double saldoIniziale){
		System.out.println("hai costruito un conto con un versamento iniziale");
		numConto=numeraConto();
		saldo += saldoIniziale;
	}
	public ContoCorrente(String nome){
		System.out.println("hai costruito il conto di: " +  nome);
		numConto=numeraConto();
		this.titolare = nome;
	}
	
	private int numeraConto(){
		this.dataApertura = new Date();
		return ++contatore;
	}
	
	public void versamento(double ammontare){
		System.out.println("Versamento euro " + ammontare);
		saldo = saldo + ammontare;
		
	}
	
	public boolean prelievo(double ammontare){
		System.out.println("Vuoi prelevare euro " + ammontare);
		if(saldo - ammontare >= 0){
			System.out.println("ok, puoi prelevare");
		saldo = saldo - ammontare;
			return true;
		}
		else {
			System.out.println("NO! non puoi prelevare!");
			return false;
		}
	}
	
	public String stampaInfo(){
		
		String s = null;
		
		//System.out.println("Il numero di conto è " + numConto);
		s = "Il numero di conto è \t" + numConto;
		
		//System.out.println("il saldo disponibile è " + saldo);
		s += "\n il saldo disponibile è \t" + saldo;
		
		s += "\n--------------------------------------------------\n";
		
		return s;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("------------------------------------------------").append("\n");

		sb.append("Il numero di conto è: " + this.numConto).append("\n");
		sb.append("La data di apertura del conto è: " + this.dataApertura).append("\n");
		sb.append("Il saldo del conto è: " + this.saldo).append("\n");
		
		if (this.titolare != null)
			sb.append("Il titolare del conto è: " + this.titolare).append("\n");
		
		sb.append("------------------------------------------------").append("\n");
		
		return sb.toString();
	}
	
	

}
