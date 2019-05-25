package patterns.adapter;

public class Motivator implements RandomStringCreator {
	@Override
	public String getRandomString() {
		double rand = Math.random();
		if (rand > 0.5) {
			return "You can do it!";
		} else {
			return "I believe in you!";
		}
	}

}
