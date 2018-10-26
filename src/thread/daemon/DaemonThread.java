package thread.daemon;

public class DaemonThread extends Thread{
	public DaemonThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + "->" + i);
		}
	}
}
