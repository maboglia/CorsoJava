public class RettangoloEqualsTest{
	
	public static void main(String[] args){
		RettangoloEquals r1 = new RettangoloEquals(10,6);
		RettangoloEquals r2 = new RettangoloEquals(15,9);
		RettangoloEquals r3 = new RettangoloEquals(10,6);
		if(r1.equals(r2)){
			System.out.println("r1 e r2 sono rettangoli uguali");
		}else{
			System.out.println("r1 e r2 sono rettangoli diversi");
		}
		if(r1.equals(r3)){
			System.out.println("r1 e r3 sono rettangoli uguali");
		}else{
			System.out.println("r1 e r3 sono rettangoli diversi");
		}		
	}
}
