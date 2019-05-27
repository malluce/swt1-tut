package liskov;

public class Client {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.withdraw(2000);
	}

}
