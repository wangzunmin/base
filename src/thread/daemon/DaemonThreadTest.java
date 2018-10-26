package thread.daemon;

public class DaemonThreadTest {
	public static void main(String[] args) {
		DaemonThread daemonThread = new DaemonThread("后台线程");
		daemonThread.setDaemon(true);// 设置为后台线程
		daemonThread.start();
		try {
			Thread.sleep(5000);// 睡眠5秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("执行完毕");
	}
}
