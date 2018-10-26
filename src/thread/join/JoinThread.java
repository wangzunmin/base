package thread.join;

public class JoinThread extends Thread {
	public JoinThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(getName() + "->" + i);
		}
	}
}
