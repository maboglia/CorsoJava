
public class CoppiePositive {

	public static void main(String[] args) {

		int[] numeri = {-5, 6, -11, -3, -9, 15, -1, 90, -21, 3};

		for (int i=0; i<9; i++)
			for (int j=i+1; j<10; j++)
				if ((numeri[i]>=0)&&(numeri[j]>=0))
					System.out.println(numeri[i] + " " + numeri[j]);
		
	}

}
