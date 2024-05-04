package ricorsione;

public class Fattoriale {

	public static void main(String[] args) {
		int x = 5;
		
		int res = calcolaFatt(x);
		
		System.out.println(res);
		System.out.println(fatt2(5));

	}

	private static int calcolaFatt(int x) {//5

		if (x==0) {
			return 1;
		} else {
			System.out.println("Il valore di x è: " + x);
			return x * calcolaFatt(x - 1);
		}
	}

	private static int fatt2(int n) {
		
		int res = 1;
		
		for (int i = 2; i <= n; i++) {
			res = res * i;
		}
		
		return res;
		
	}
	
	
}
