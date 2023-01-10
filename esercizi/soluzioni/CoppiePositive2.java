
public class CoppiePositive2 {

	public static void main(String[] args) {

		int[] numeri = {5, 6, -11, -3, 9, 15, -1, 90, -21, 3};
		int cont=0;
		
		int i=0;
		while (i<9 && cont<10) {
			int j=i+1;
			while (j<10 && cont<10) {
				if ((numeri[i]>=0)&&(numeri[j]>=0)) {
					System.out.println(numeri[i] + " " + numeri[j]);
					cont++;
				}
				j++;
			}
			i++;
		}		
	}

}
