package it.bogliaccino.tss2016;

public class Rettangolo {

	//variabili di istanza
	private int base, altezza;

	//------------inizio costruttori----------------
	
	//metodo costruttore del rettangolo
	public Rettangolo() {
		//le variabili a, b sono parametri formali
		this.base = 1;
		this.altezza = 1;
		System.out.println("messaggio dal costruttore senza parametri \n devi indicare dei parametri!!!!");
	}
	public Rettangolo(int b) {
		//le variabili a, b sono parametri formali
		this.base = b;
		this.altezza = 10;
	}
	public Rettangolo(int b, int a) {
		//le variabili a, b sono parametri formali
		this.base = b;
		this.altezza = a;
	}
	
	//------------fine costruttori----------------
	
	
	//metodi
	public int calcolaArea(){
		//area è una variabile locale
		int area = base * altezza;
		return area;
		
	}
	
	public int calcolaPerimetro(){
		
		return (base + altezza) * 2;
		
	}
	
	
}
