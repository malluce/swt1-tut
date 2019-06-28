package par;

public class SynchTest {
	static volatile int x = 0;

	public static void main(String[] args) throws InterruptedException {
		int iterCnt = 0;
		while (true) {
			iterCnt++;

			Runnable r = () -> x++;

			Thread t1 = new Thread(r);

			Thread t2 = new Thread(r);

			t1.start();
			t2.start();
			t1.join();
			t2.join();
			if (x != 2) {
				System.out.println(x);
				System.out.println(String.format("One fault in %s iterations.", iterCnt));
				break;
			}
			x = 0;
		}
	}

}
