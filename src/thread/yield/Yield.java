package thread.yield;

public class Yield implements Runnable {

	int i = 0;

	@Override
	public void run() {
		for (; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + "->" + i);
			// 当i等于20时，当前线程让步，让线程调度器重新调度
			if (i == 20) {
				Thread.yield();
			}
		}
	}
}
