package genericity.genericity02;
/**
 * 类型形参时设定的上限
 * @author wc
 *
 * @param <T>
 */
public class TestPerson<T extends Person> {//定义类<泛型标识  extends 父类>
	private T p;

	public T getP() {
		return p;
	}

	public void setP(T p) {
		this.p = p;
	}
	
}
