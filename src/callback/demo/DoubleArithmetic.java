package callback.demo;

/**
 * 回调函数实现one
 * @author WZM
 *
 * 2018年8月15日
 */
public class DoubleArithmetic implements Arithmetic<Double>{

	@Override
	public Double getResult(Object x) {
		if(x instanceof Double){
			return (Double)x*5;
		}
		return null;
	}
	
}
