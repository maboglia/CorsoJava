public class RettangoloClone implements Cloneable {
	
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
	
	public Object clone(){
		try{
				return super.clone();
		}catch (CloneNotSupportedException e){
				return null;
		}
	}
}
