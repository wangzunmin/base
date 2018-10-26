package thread.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest implements Runnable{
	
	private static ReentrantLock reentantLock = new ReentrantLock();
	private static int i = 0;

	@Override
	public void run() {
		for (int j = 0; j < 10000; j++) {
			reentantLock.lock();
			try
			{
				i++;
			}
			finally
			{
				reentantLock.unlock();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ReentrantLockTest test = new ReentrantLockTest();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(i);
	}

}
