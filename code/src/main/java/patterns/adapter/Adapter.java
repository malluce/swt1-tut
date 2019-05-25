package patterns.adapter;

public class Adapter implements RandomStringCreator {
	private RandomIntegerCreator adapt;

	public Adapter() {
		this.adapt = new RandomIntegerCreator();
	}

	@Override
	public String getRandomString() {
		Integer randomInt = adapt.randomNumberAsInt();
		return randomInt.toString();
	}

}
