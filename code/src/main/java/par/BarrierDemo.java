package par;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarrierDemo {
	static CyclicBarrier barrier;

	public static void main(String[] args) {
		barrier = new CyclicBarrier(2);
		new Thread(() -> runSingleThread()).start();
		new Thread(BarrierDemo::runSingleThread).start();
		// BarrierDemo::runSingleThread ist Referenz zu Methode
		// macht hier das gleiche wie () -> runSingleThread()
	}

	public static void runSingleThread() {
		try {
			System.out.println("reached first barrier");
			barrier.await();
			System.out.println("reached second barrier");
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
		}
	}
}
