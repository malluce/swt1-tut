package par;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrent {
	static class ModifierThread extends Thread {
		private List<Integer> l;

		public ModifierThread(List<Integer> l) {
			this.l = l;
		}

		@Override
		public void run() {
			for (int i = 10; i < 20; i++) {
				l.add(i);
			}
		}
	}

	static class IteratorThread extends Thread {
		private List<Integer> l;

		public IteratorThread(List<Integer> l) {
			this.l = l;
		}

		@Override
		public void run() {
			for (Integer i : l) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		List<Integer> normalList = new ArrayList<>();
		List<Integer> cowList = new CopyOnWriteArrayList<>();

		for (int i = 0; i < 10; i++) {
			normalList.add(i); // regular append
			cowList.add(i); // copies the array EVERYTIME!
		}

		ModifierThread mod = new ModifierThread(normalList);
		IteratorThread iter = new IteratorThread(normalList);

		iter.start();
		mod.start();

		iter.join();
		mod.join();

	}
}
