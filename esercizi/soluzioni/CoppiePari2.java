
public class CoppiePari2 {

	public static void main(String[] args) {

		int[] numeri = {4,6,11,10,9,14,31,90,20,30};
		int cont=0;
		
		int i=0;
		while (i<9 && cont<10) {
			int j=i+1;
			while (j<10 && cont<10) {
				if ((numeri[i]%2==0)&&(numeri[j]%2==0)) {
					System.out.println(numeri[i] + " " + numeri[j]);
					cont++;
				}
				j++;
			}
			i++;
		}		
	}

}
