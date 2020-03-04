// Sostituzione di un ciclo do-while con un ciclo for
class Asterischi3{
	public static void main(String args[]){
		for(int num = 20; num >= 0; num--){
			if((num%3 == 0) ||(num%3 == 1)) continue;
                        for(int j = 0;j <= num; j++)System.out.print(".*");
			System.out.println("");
		}
	}
}
