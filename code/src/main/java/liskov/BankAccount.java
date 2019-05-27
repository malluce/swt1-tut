package liskov;

public class BankAccount {
	int balance;

	public BankAccount() {
		this.balance = 5000;
	}

	public void withdraw(int amountInEuro) {
		balance -= amountInEuro;
	}

	public void deposit(int amountInEuro) {
		balance += amountInEuro;
	}

}
