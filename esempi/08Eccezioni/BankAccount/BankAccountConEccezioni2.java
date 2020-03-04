package esempio;

public class BankAccountConEccezioni2 extends BankAccount {

	// costruttori che chiamano i costruttori della classe padre
	public BankAccountConEccezioni2() {
		super();
	}
	
	public BankAccountConEccezioni2(double initialAmount) {
		super(initialAmount);
	}
	
	public void withdrawWithCheck(double amount) throws Exception {
		if (getBalance() - amount < 0) {
			throw new Exception("Disponibilit� non sufficiente");
		}
		withdraw(amount);
	}
}
