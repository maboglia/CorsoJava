package it.bogliaccino.tss2016;

public class Punto {
	
	//ATTRIBUTI----------------------------------------------------------------------------
	//
	//stato interno della classe
	//creo le variabili x e y
	//utilizzo incapsulamento perciò le varibili sono private
	private  int x, y;
	
	//COSTRUTTORI----------------------------------------------------------------------
	//
	//primo metodo costruttore 
	//ha il compito di dare all'oggetto uno stato iniziale: costruire l'oggetto
	public Punto(){
		x = 0;
		y = 0;
	}
	
	//overload del metodo costruttore
	public Punto(int mioX, int mioY){
		x = mioX;
		y = mioY;
	}
		
	//METODI GETTER E SETTER---------------------------------------------------
	//per accedere ai valori delle variabili e modificarli creo dei metodi ad hoc

	//gestisco la variabile x
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX(){
		return x;
	} 

	//gestisco la variabile y
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}


}
