package thread;

public class ThreadDemo {
	static int i = 0;

	public static void add() {
		i++;
	}

	private static class Plus implements Runnable {
		@Override
		public void run() {
			add();
		}
	}

	public static void main(String[] args)  {
		Thread[] threads = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(new Plus());
			threads[i].start();
		}
		System.out.println(i);
	}
}
