package concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
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
	
	
	
	public void a() {
//		ThreadPoolExecutor a = new ThreadPoolExecutor();
		//一个不存储元素的阻塞队列，每个插入操作必须等到另一个线程调用移除操作，否则插入操作一直处于阻塞状态，吞吐量通常要高于LinkedBlockingQuene
		SynchronousQueue a = new SynchronousQueue();
		
		
//		ThreadPoolExecutor a = new ThreadPoolExecutor(int corePoolSize, //核心线程数
//                int maximumPoolSize, //最大线程数
//                long keepAliveTime, //当活跃线程数大于核心线程数时，空闲的多余线程最大存活时间
//                TimeUnit unit, //存活单位
//                BlockingQueue<Runnable> workQueue,  //队列类型
//                ThreadFactory threadFactory,
//                RejectedExecutionHandler handler); //超出线程数量和队列容量的处理策略
		
		/*
		 * 
		 *  刚开始都是在创建新的线程，达到核心线程数量5个后，新的任务进来后不再创建新的线程，
		 *  而是将任务加入工作队列，任务队列到达上线5个后，新的任务又会创建新的普通线程，
		 *  直到达到线程池最大的线程数量10个，
		 *  后面的任务则根据配置的饱和策略来处理。我们这里没有具体配置，
		 *  使用的是默认的配置AbortPolicy:直接抛出异常。
		 * **/
		
	}

}
