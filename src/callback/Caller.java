package callback;
/**
 * 中间函数
 * @author WZM
 *
 * 2018年7月16日
 */
public class Caller {
	private MyCallInterface mc;

	public Caller() {
	}

	public void setCallfuc(MyCallInterface mc) {
		this.mc = mc;
	}

	public void call() {
		mc.fuc();
	}
}
