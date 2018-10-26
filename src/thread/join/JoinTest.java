package thread.join;

public class JoinTest {
	public static void main(String[] args) throws InterruptedException {
        JoinThread joinThread = new JoinThread("被Join的线程");
        joinThread.start();
        joinThread.join();//让“主线程”等待“子线程”结束之后才能继续运行
        System.out.println("执行完毕");//在joinThread线程执行完毕后，才会继续执行。
    }
}
