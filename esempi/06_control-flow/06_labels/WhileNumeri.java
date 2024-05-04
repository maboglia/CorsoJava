
public class WhileNumeri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		while(a < 10){
			if((a % 2)>0){
				System.out.println("il valore di a:" + a);
				a++;
			}else{
				a++;
				continue;
			}
			
		}
	}

}
