package studenti;

public class Contatore {
	
	static int contatore = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("decrementa: "+ decrementa());
		System.out.println("incrementa: "+ incrementa());		
	}

	public static int decrementa() {
		// TODO Auto-generated method stub
		int valore = --contatore;
		return valore;
	}

	public static int incrementa() {
		// TODO Auto-generated method stub
		int valore = ++contatore;
		return valore;
	}

	

}
