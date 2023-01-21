package cicli;

public class CicloWhile {

	public static void main(String[] args) {
		
		boolean trovato = false;
		int i = 0;
		
		while(!trovato) {
			i++;
			System.out.println("prova " + i);
			
			double casuale = Math.random();
			if(casuale > 0.91) {
				trovato = true;
				
			}
		}
		

	}

}
