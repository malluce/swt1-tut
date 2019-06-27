package par;

public class SynchTest {
	private static int x = 1;

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 100000; i++) {

			Runnable r1 = new Runnable() { // possible as lambda
				@Override
				public void run() { // implement run
					if (x > 0) {
						x--;
					}
				}
			};
			Thread t1 = new Thread(r1);

			Thread t2 = new Thread() {
				@Override
				public void run() { // overwrite run
					if (x > 0) {
						x--;
					}
				}
			};

			t1.start();
			t2.start();
			t1.join();
			t2.join();
			if (x != 0) {
				System.out.println(x);
			}
			x = 1;
		}

	}

}
