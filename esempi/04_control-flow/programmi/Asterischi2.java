// Realizzazione di un secondo motivo decorativo
class Asterischi2{
	public static void main(String args[]){
		int num = 20;
		do{
			if((num%3 == 0) ||(num%3 == 1)) continue;
			for(int j = 0; j <= num; j++)System.out.print(".*");
			System.out.println("");
		} while(--num >= 0) ;
	}
}