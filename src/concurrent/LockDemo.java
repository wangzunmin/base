package concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * AQS abstractQueueSynchronizer 独占和共享
 * ReentrantReadWriteLock 实现了独占 和 共享功能
 * ReentrantLock 独占锁
 * AQS主要做了三件事情:
 * 		同步状态的管理
 * 		线程的阻塞和唤醒
 * 		同步队列的维护
 * 
 * 无锁操作：CAS操作需要我们提供一个期望值，当期望值与当前线程的变量值相同时，说明还没线程修改该值，
 * 当前线程可以进行修改，也就是执行CAS操作，但如果期望值与当前线程不符，则说明该值已被其他线程修改，
 * 此时不执行更新操作，但可以选择重新读取该变量再尝试再次修改该变量，也可以放弃操作
 * @author wangzunmin
 *
 */
public class LockDemo {

	public static void main(String[] args) throws InterruptedException {
//		AbstractQueuedSynchronizer
		countDownLatch();
	}

	/**
	 * 独占锁
	 */
	public void function1() {
		ReentrantLock lock = new ReentrantLock();

		lock.lock();
		try {
			// dosomething
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
		}
	}

	/**
	 * 线程计数器
	 * CountDownLatch这个类能够使一个线程等待其他线程完成各自的工作后再执行
	 * @throws InterruptedException
	 */
	public static void countDownLatch() throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(3);
		System.out.println("in " + Thread.currentThread().getName() + "...");
		System.out.println("before latch.await()...");
		for (int i = 1; i <= 3; i++) {
			new Thread("T" + i) {
				@Override
				public void run() {
					System.out.println("enter Thread " + getName() + "...");
					System.out.println("execute countdown...");
					latch.countDown();
					System.out.println("exit Thread" + getName() + ".");
				}
			}.start();
		}
		latch.await();
		System.out.println("in " + Thread.currentThread().getName() + "...");
		System.out.println("after latch.await()...");
	}

	/**
	 * 替代传统的Object中的wait()、notify()和notifyAll()方法来实现线程间的通信，使线程间协作更加安全和高效
	 */
	public static void condition() {
	}

	/**
	 * 数组的循环添加和取出数据的功能
	 * @author wangzunmin
	 *
	 */
	static class BoundedBuffer {
		final Lock lock = new ReentrantLock();
		final Condition notFull = lock.newCondition();
		final Condition notEmpty = lock.newCondition();

		final Object[] items = new Object[100];
		int putptr, takeptr, count;

		public void put(Object x) throws InterruptedException {
			lock.lock();
			try {
				while (count == items.length)
					notFull.await();
				items[putptr] = x;
				if (++putptr == items.length)
					putptr = 0;
				++count;
				notEmpty.signal();
			} finally {
				lock.unlock();
			}
		}

		public Object take() throws InterruptedException {
			lock.lock();
			try {
				while (count == 0)
					notEmpty.await();
				Object x = items[takeptr];
				if (++takeptr == items.length)
					takeptr = 0;
				--count;
				notFull.signal();
				return x;
			} finally {
				lock.unlock();
			}
		}
	}
}
