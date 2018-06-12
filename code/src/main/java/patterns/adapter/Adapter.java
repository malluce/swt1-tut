package patterns.adapter;

public class Adapter extends RandomStringCreator {
	private RandomIntegerCreator adapt;

	public Adapter() {
		this.adapt = new RandomIntegerCreator();
	}

	@Override
	String getRandomString() {
		Integer randomInt = adapt.randomNumberAsInt();
		return randomInt.toString();
	}

}
