package es05.lampadina.model;

public class Lampadina {

	private boolean accesa;
	private boolean rotta;
	private int nClick;
	private int clickMax;
	
	public Lampadina(int clickMax) {
		this.clickMax = clickMax;
		this.accesa=false;
		this.rotta=false;
		this.nClick=0;
	}

	public boolean isRotta() {
		return rotta;
	}
	
	public void setRotta(boolean rotta) {
		this.rotta = rotta;
	}

	public boolean isAccesa() {
		return accesa;
	}

	public void setAccesa(boolean accesa) {
		this.accesa = accesa;
	}

	public int getnClick() {
		return nClick;
	}

	public void setnClick(int nClick) {
		this.nClick = nClick;
	}

	public int getClickMax() {
		return clickMax;
	}
	
	public String stato() {
		String state="";
		if(this.isRotta()==true) {
			state="rotta";
		}else {
			if (this.isAccesa()==true) {
				state="accesa";
			}else {
				state="spenta";
			}
		}
		return "La lampadina è "+state+"\n Numero di click: "+this.nClick;
	}
	
	public void click() {
		if(this.nClick<this.clickMax) {
			this.accesa=!accesa;
			nClick++;
		}else {
			this.rotta=true;
		}
	}
	
}
