package proxy;

public class ProxyTest {
	public static void main(String[] args) {
		AndyLauProxy  andyLauProxy = new AndyLauProxy();
		Person proxy = andyLauProxy.getProxy();
		String sing = proxy.sing("一起走过的日子");
		String dance = proxy.dance("拉丁");
		System.out.println(sing + "\r\n" + dance);
	}
}
