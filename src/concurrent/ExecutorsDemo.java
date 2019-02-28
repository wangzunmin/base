package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *  线程池
 * @author wangzunmin
 *
 */
public class ExecutorsDemo {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(4);
		
		for(int i=0;i<5;i++) {
			
			newFixedThreadPool.submit(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName() + "执行");
				}
			});
		}
		System.out.println(newFixedThreadPool.isTerminated());
		System.out.println(newFixedThreadPool.isTerminated());
		
		
		newFixedThreadPool.shutdown();
		
		Thread.sleep(1000);
		
		System.out.println(newFixedThreadPool.isTerminated());
		System.out.println(newFixedThreadPool.isTerminated());
	}
	

}
