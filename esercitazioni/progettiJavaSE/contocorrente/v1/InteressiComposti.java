package progetti.contocorrente.v1;

public class InteressiComposti {
	
	double sommaDepositata = 1000;
	double percentualeInteresse = 3.5;
	
	int anni = 0;
	
	public void calcolaInteresse(int anni){

		this.anni = anni;
		
		if (this.anni > 0 ){
			
			for (int i = 0; i < this.anni; i++) {
				
				sommaDepositata = sommaDepositata * ( 1 + percentualeInteresse / 100 );
				System.out.println("Dopo " + (i +1) + " anni avrai " + sommaDepositata + " euro");
			}
		}
	}
	

	public static void main(String[] args) {
		
		InteressiComposti ci = new InteressiComposti();
		
		ci.calcolaInteresse(10);
	}
	
	
}
