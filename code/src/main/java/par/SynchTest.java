package par;

public class SynchTest {
	volatile int x = 0;

	public void test() throws InterruptedException {
		while (true) {

			Runnable r = () -> x++;

			Thread t1 = new Thread(r);

			Thread t2 = new Thread(r);

			t1.start();
			t2.start();
			t1.join();
			t2.join();
			if (x != 2) {
				System.out.println(x);
				break;
			}
			x = 0;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		SynchTest test = new SynchTest();
		test.test();
	}

}
