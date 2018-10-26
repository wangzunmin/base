package callback.demo;
/**
 * 起始函数
 * @author WZM
 *
 * 2018年8月15日
 */
public class MainFunction {

	public static void main(String[] args) {
		MiddleFunction function = new MiddleFunction();
		function.printResult(5.5, new DoubleArithmetic());
		function.printResult(4, new QuadrupleArithmetic());
		function.printResult(7l, new Arithmetic<Long>() {//匿名类

			@Override
			public Long getResult(Object x) {
				if(x instanceof Long){
					return (Long)x+8;
				}
				return null;
			}
			
		});
	}
}
