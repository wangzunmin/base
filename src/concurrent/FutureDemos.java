package concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class FutureDemos {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<Integer> task = new FutureTask<>(()->{
			TimeUnit.MILLISECONDS.sleep(500);
			return 1000;
		});
		
		new Thread(task).start();
		
		System.out.println(task.get()); //阻塞
	}

}
