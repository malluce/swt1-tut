package patterns.templatemethod;

public abstract class HotDrinkMachine {
	public void makeDrink() {
		startMachine();
		waitForPayment();

		heatWater();
		// ..
		insertIngredients();
		// ..
		dispenseMug();
	}

	private void startMachine() {
		System.out.println("starte Maschine...");
	}

	private void waitForPayment() {
		System.out.println("Haste mal 'n Euro?");
	}

	protected abstract void heatWater();

	protected abstract void insertIngredients();

	protected abstract void dispenseMug();

}
