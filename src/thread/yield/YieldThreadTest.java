package thread.yield;

public class YieldThreadTest extends Thread {
	public YieldThreadTest(Runnable runnable, String name) {
		super(runnable, name);
	}

	public static void main(String[] args) {
		Yield yd = new Yield();

		YieldThreadTest ytt1 = new YieldThreadTest(yd, "高级");
		ytt1.setPriority(Thread.MAX_PRIORITY);// 设置优先级最高
		ytt1.start();

		YieldThreadTest ytt2 = new YieldThreadTest(yd, "低级");
		ytt2.setPriority(Thread.MIN_PRIORITY);// 设置优先级最低
		ytt2.start();
	}
}
