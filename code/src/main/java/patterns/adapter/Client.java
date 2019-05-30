package patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private static List<RandomStringCreator> list;

	public static void main(String[] args) {
		System.err.println("Oh boi, i like random stuff so much!");

		list = new ArrayList<RandomStringCreator>();
		list.add(new Motivator());
		list.add(new Adapter());

		// i don't want to change my code but want to use a sweet library i discovered
		for (RandomStringCreator creator : list) {
			for (int i = 0; i < 3; i++) {
				System.out.println(creator.getRandomString());
			}
		}

	}
}
