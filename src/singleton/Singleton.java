package singleton;
/**
 * 单例
 * @author wc
 *
 */
class Singleton {
	private static Singleton instance;
	private Singleton(){};
	public Singleton getInstance(){
		synchronized (this) {
			if(instance==null){
				instance = new Singleton();
			}
		}
		return instance;
	}
}

