package patterns.templatemethod;

public class Client {
	public static void main(String[] args) {
		HotDrinkMachine hdm = new TeaMachine();
		hdm.makeDrink();
	}
}
