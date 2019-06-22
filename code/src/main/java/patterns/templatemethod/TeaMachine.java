package patterns.templatemethod;

public class TeaMachine extends HotDrinkMachine {

	@Override
	protected void heatWater() {
		System.out.println("erhitze auf 70°C");
	}

	@Override
	protected void insertIngredients() {
		System.out.println("gebe Tee-Blätter hinzu");
	}

	@Override
	protected void dispenseMug() {
		System.out.println("gebe Tee-Tasse aus");
	}

}
