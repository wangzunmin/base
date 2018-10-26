package callback;


public class Test {
	public static void main(String args[]) {
		Caller call = new Caller();
		call.setCallfuc(new MyCallInterface() {//回调函数 实现
			@Override
			public void fuc() {
				System.out.println("xxx");
			}
		});
		call.call();
	}
}
