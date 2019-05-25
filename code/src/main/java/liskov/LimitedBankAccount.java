package liskov;

public class LimitedBankAccount extends BankAccount {

	@Override
	public void withdraw(int amountInEuro) {
		if (amountInEuro > 1000) {
			throw new IllegalArgumentException("You can only withdraw up to 1000€ at once.");
		}
		balance -= amountInEuro;
	}
}
