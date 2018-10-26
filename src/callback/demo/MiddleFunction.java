package callback.demo;
/***
 * 中间函数
 * @author WZM
 *
 * 2018年8月15日
 */
public class MiddleFunction {

	public void printResult(Object k, Arithmetic<?> arithmetic){
		Object result = arithmetic.getResult(k);
		System.out.println(result);
	}
}
