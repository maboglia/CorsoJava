package model;

public class Lampadina {

	private boolean accesa;
	private boolean rotta;
	private int click;
	private int clickMax;
	/**
	 * @param clickMax
	 */
	public Lampadina(int clickMax) {
		this.clickMax = clickMax;
	}
	public boolean isAccesa() {
		return accesa;
	}
	public void setAccesa(boolean accesa) {
		this.accesa = accesa;
	}
	public boolean isRotta() {
		return rotta;
	}
	public void setRotta(boolean rotta) {
		this.rotta = rotta;
	}
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public int getClickMax() {
		return clickMax;
	}
	public void setClickMax(int clickMax) {
		this.clickMax = clickMax;
	}
	
	
	public void click() {
		if (this.click < this.clickMax) {
			this.accesa = !this.accesa;
			this.click++;
		} else 
		{
			this.rotta = true;
		}
	}
	
	public String stato() {
		String status = null;
		
		if (this.rotta) {
			status = "rotta";
		} else {
			if (this.isAccesa()) {
				status = "accesa";
			} else {
				status = "spenta";
			}
		}
		
		return status;
	}
	
	
}
