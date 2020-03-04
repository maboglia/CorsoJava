package esempio;

public class BankAccountConEccezioniTest {

	public static void main(String[] args) {
		BankAccountConEccezioni ba = new BankAccountConEccezioni(1000);
		try {
			ba.withdraw(1500);
		} catch (Exception e) {
			System.out.println("Operazione non possibile: " + e.getMessage());
		}
		
		BankAccountConEccezioni2 ba2 = new BankAccountConEccezioni2(1000);
		try {
			// devo usare il metodo aggiuntivo con il controllo
			ba2.withdrawWithCheck(1500);
		} catch (Exception e) {
			System.out.println("Operazione non possibile: " + e.getMessage());
		}
	}

}
