package thread.vol;

public class VolatileDemo implements Runnable{
	volatile boolean shutdownRequested;
	 
	public VolatileDemo() {
	}

	public void shutdown() { 
	    shutdownRequested = true; 
	}
	 
	public void doWork() { 
	    while (!shutdownRequested) { 
	        System.out.println("volatile...");
	    }
	}
	
	
	@Override
	public void run() {
	}
	
	
	public static void main(String[] args) {
	}

}
