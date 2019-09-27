package esempio;

public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount harrysChecking = new BankAccount();
		harrysChecking.deposit(1000);
		harrysChecking.withdraw(500);
		harrysChecking.withdraw(400);
		System.out.println(harrysChecking.getBalance());
		
		BankAccount momsSaving = new BankAccount(1000);
		momsSaving.addInterest(10);
		System.out.println("Dollars: " + momsSaving.getBalance());
	}

}
