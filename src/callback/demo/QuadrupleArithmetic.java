package callback.demo;
/**
 * 回调函数实现two
 * @author WZM
 *
 * 2018年8月15日
 */
public class QuadrupleArithmetic implements Arithmetic<Integer>{

	@Override
	public Integer getResult(Object x) {
		if(x instanceof Integer){
			return (Integer)x*4;
		}
		return null;
	}

}
