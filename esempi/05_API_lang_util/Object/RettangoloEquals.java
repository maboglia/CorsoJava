public class RettangoloEquals implements Cloneable{
	
	private int larghezza;
	private int altezza;
	
	public Rettangolo(int larghezza, int altezza){
		setLarghezza(larghezza);
		setAltezza(altezza);
	}
	
	public void setLarghezza(int larghezza){
		this.larghezza = larghezza;
	}
	
	public void setAltezza(int altezza){
		this.altezza = altezza;
	}
	
	public int getLarghezza(){
		return larghezza;
	}
	
	public int getAltezza(){
		return altezza;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Rettangolo){
			Rettangolo r = (Rettangolo)obj;
			return((r.larghezza == larghezza) && (r.altezza == altezza));
		}else{
			return false;
		}
		
	}
}
