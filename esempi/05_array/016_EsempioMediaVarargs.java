package lab06;

public class EsempioMediaVarargs {

	public static void main(String[] args) {

		System.out.println(calcolaMedia(24,26,28));
		System.out.println(calcolaMedia(24,26,28,30));
		System.out.println(calcolaMedia(24,26,28,26,24,28,25,29));
		
		

	}
	
	
	private static double calcolaMedia(int... voti) {
		
		double totale = 0, media= 0;
		
		for (int i : voti) {
			totale += i;
		}
		
		media = totale/voti.length;
		return media;
		
	}
	
	
	

}
