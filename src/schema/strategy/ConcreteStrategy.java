package schema.strategy;
/**
 * 具体策略角色
 * @author WZM
 *
 * 2018年10月24日
 */
public class ConcreteStrategy implements Strategy {

	@Override
	public void getPath() {
		System.out.println("获取路径......");
	}

}
