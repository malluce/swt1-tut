package patterns;

import java.util.ArrayList;
import java.util.List;

public class Klient {
	private static List<RandomStringCreator> list;

	public static void main(String[] args) {
		System.err.println("Oh boi, i like random strings so much!");

		list = new ArrayList<RandomStringCreator>();
		list.add(new Motivator());
		list.add(new Adapter());

		// i don't want to change my code but want to use a sweet library i discovered
		for (RandomStringCreator donator : list) {
			for (int i = 0; i < 3; i++) {
				System.out.println(donator.getRandomString());
			}
		}

	}
}
