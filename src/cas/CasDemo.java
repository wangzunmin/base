package cas;

import java.util.concurrent.atomic.AtomicInteger;
/**
 * CAS(old E new )  compare and swap
 * 旧值 期望值 新值
 * 
 * a b a问题   解决AtomicStampedReference
 * @author WZM
 *
 * 2018年10月22日
 */
public class CasDemo{
	private static AtomicInteger atomicInteger = new AtomicInteger();
	
	private static int m = 0;
	
	
	public static int increment2(){
		try {
			Thread.sleep(100);
			synchronized (CasDemo.class) {
				m++;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return m;
	}
	
	public static int increment(){
		return atomicInteger.getAndIncrement();
	}
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			new Thread(new Runnable(){
				@Override
				public void run() {
					int increment = increment2();
					System.out.println(increment);
				}
			}).start();
		}
	}
}
