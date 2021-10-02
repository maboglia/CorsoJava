// Generazione di un motivo decorativo
class Asterischi{
	public static void main(String args[]){
		int num = 20;
		do{
			for(int j = 0; j <= num; j++) System.out.print("*");
			System.out.println("");
		} while(--num >= 0);
	}
}