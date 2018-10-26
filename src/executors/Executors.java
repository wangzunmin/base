package executors;


public class Executors {
	
	
	public static void main(String[] args) {
		//获取处理器个数
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println(processors);
	}
}
