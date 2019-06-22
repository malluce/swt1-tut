package patterns.templatemethod;

public class CoffeeMachine extends HotDrinkMachine {

	@Override
	protected void heatWater() {
		System.out.println("erhitze auf 96°C");
	}

	@Override
	protected void insertIngredients() {
		System.out.println("gebe gemahlenen Kaffee hinzu");
	}

	@Override
	protected void dispenseMug() {
		System.out.println("gebe Kaffee-Tasse aus");
	}

}
