package ifelse.no;
/**
 * 策略模式 :
 * 	1.定义一个接口
 * 	2.定义多个实现接口的业务逻辑类
 *  3.一个context类，类似MyPaper
 * @author wangzunmin
 *
 */
public class NoIfElse {

	public static void main(String[] args) {
		//策略模式拒绝if else
		MyPaper myPaper = new MyPaper(new White());
		myPaper.choicePen();
	}
}
