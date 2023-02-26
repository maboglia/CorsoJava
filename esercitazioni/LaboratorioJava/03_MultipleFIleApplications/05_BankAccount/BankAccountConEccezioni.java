package esempio;

public class BankAccountConEccezioni {
	private double balance;

	public BankAccountConEccezioni(double initialBalance) {
		balance = initialBalance;
	}

	public BankAccountConEccezioni() {
		balance = 0;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) throws Exception {
		if (balance - amount < 0) {
			throw new Exception("Disponibilit� conto non sufficiente");
		}
		balance = balance - amount;
	}

	public double getBalance() {
		return balance;
	}

	public void addInterest(double rate) {
		balance = balance + balance * (rate / 100.0);
	}
}
