package thread.interrupt;

public class InterruptDemo implements Runnable {

	@Override
	public void run() {
		while (true) {
			Thread.yield();
			 // 响应中断
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Java技术栈线程被中断，程序退出。");
                return;
            }
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		InterruptDemo demo = new InterruptDemo();
		Thread thread = new Thread(demo);
		thread.start();
		thread.interrupt();
	}

}
