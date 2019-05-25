package liskov;

public class Client {

	public static void main(String[] args) {
		BankAccount account = new LimitedBankAccount();
		account.withdraw(2000);
	}

}
