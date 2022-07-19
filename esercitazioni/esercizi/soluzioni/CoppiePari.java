
public class CoppiePari {

	public static void main(String[] args) {

		int[] numeri = {5,6,11,13,9,14,31,90,21,30};

		for (int i=0; i<9; i++)
			for (int j=i+1; j<10; j++)
				if ((numeri[i]%2==0)&&(numeri[j]%2==0))
					System.out.println(numeri[i] + " " + numeri[j]);
		
	}

}
