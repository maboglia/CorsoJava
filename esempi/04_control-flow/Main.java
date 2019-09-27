package dichiarazioni;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		
		if(x > 4){
			System.out.println("Sono dentro all'if");
		}else{
			System.out.println("Sono fuori all'if");
		}
		
		switch(x){
			case 1:
				System.out.println("sono dentro al case 1");
				break;
			case 2:
				System.out.println("sono dentro al case 2");
				break;
			default:
				break;		
		}
		
		while(x < 10){
			System.out.println("sono dentro al ciclo while");
			x++;
		}
		
		do{
			System.out.println("sono dentro al ciclo do-while");
			x++;
		}while(x < 12);
		
		for(int y = 0; y < 3; y++){
			System.out.println("sono dentro al for");
		}
		
	}

}
