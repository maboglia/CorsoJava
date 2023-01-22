package esempio;

public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}

	public BankAccount() {
		balance = 0;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public double getBalance() {
		return balance;
	}

	public void addInterest(double rate) {
		balance = balance + balance * (rate / 100.0);
	}

	
}
